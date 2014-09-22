












package kpcmmm.factory;

import org.kevoree.modeling.api.TransactionManager
import org.kevoree.modeling.api.Transaction
import org.kevoree.modeling.api.TimeTransaction
import org.kevoree.modeling.api.persistence.DataStore
import org.kevoree.modeling.api.time.TimeView

class KPCMMMTransactionManager(val datastore : DataStore) : TransactionManager {

    private var isClosed : Boolean = false

    override fun createTransaction(): KPCMMMTransaction {
        if(isClosed){
            throw Exception("This TransactionManager is closed !");
        }
        val newKey = Math.random().toString()
        return KPCMMMTransaction(datastore,this,newKey,null);
    }

    override fun close() {
        if(!isClosed){
            isClosed = true
            datastore.close()
        }
    }

    override fun listen(listener: org.kevoree.modeling.api.events.ModelElementListener, from: Long?, to: Long?, path : String) {
        datastore.register(listener,from,to,path)
    }

    override fun disable(listener: org.kevoree.modeling.api.events.ModelElementListener) {
        datastore.unregister(listener)
    }

}

class KPCMMMTransaction(  override  internal val datastore : DataStore , internal val manager : TransactionManager,internal val k : String, internal val p : Transaction?) :  DefaultKPCMMMFactory(datastore),Transaction  {

    val subs = java.util.HashSet<Transaction>()

    override fun key(): String {
        return k
    }
    override fun parent(): Transaction? {
        return p
    }
    override fun children(): Set<Transaction> {
        return subs
    }
    override fun fork(): Transaction {
        val newKey = key()+"."+Math.random().toString()
        val newChild = KPCMMMTransaction(datastore,manager,newKey,this)
        subs.add(newChild)
        return newChild
    }

                         override fun close() {
                clear();
            }
            override val originTransaction: Transaction = this
        
    
}


