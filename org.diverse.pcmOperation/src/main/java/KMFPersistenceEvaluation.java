import kpcmmm.factory.DefaultKPCMMMFactory;
import kpcmmm.factory.KPCMMMFactory;
import kpcmmm.factory.KPCMMMTransaction;
import kpcmmm.factory.KPCMMMTransactionManager;
import kpcmmm.kPCM;
import org.jetbrains.annotations.NotNull;
import org.kevoree.modeling.api.KMFContainer;
import org.kevoree.modeling.api.Transaction;
import org.kevoree.modeling.api.compare.ModelCompare;
import org.kevoree.modeling.api.json.JSONModelLoader;
import org.kevoree.modeling.api.persistence.MemoryDataStore;
import org.kevoree.modeling.api.trace.TraceSequence;
import org.kevoree.modeling.datastores.leveldb.LevelDbDataStore;

import java.util.List;
import java.util.Set;

/**
 * Created by Aymeric on 26/09/2014.
 */
public class KMFPersistenceEvaluation {
    public static void main(String[] args) {

        final LevelDbDataStore dataStore = new LevelDbDataStore("kev_db_1" );

        String model1 = "Comparison_of_document_interfaces.json";
        KPCMMMFactory factory   = new DefaultKPCMMMFactory(dataStore) {
            @NotNull
            @Override
            public Transaction getOriginTransaction() {
                return null;
            }
        };


        System.out.println("Kevoree Registry Server...., majorVersion=" );

        KPCMMMTransactionManager manager = new KPCMMMTransactionManager(dataStore);
        KPCMMMTransaction transaction = manager.createTransaction();

        kPCM rootDs = (kPCM)transaction.lookup("/") ;
        if(rootDs == null){
            rootDs=   transaction.createkPCM().withGenerated_KMF_ID("0");
        }

        JSONModelLoader jml = factory.createJSONLoader();
        List<KMFContainer> lst = jml.loadModelFromStream(main.class.getResourceAsStream(model1));
        kPCM m = (kPCM) lst.get(0);
        ModelCompare compare = transaction.createModelCompare();

        kPCM newRootToCompare = transaction.createkPCM().withGenerated_KMF_ID("0");
        TraceSequence seq = compare.merge(newRootToCompare, m);
        seq.applyOn(rootDs);


        transaction.commit();
        transaction.close();

        manager.close();
        Set<String> sset = dataStore.getSegments() ;
        for (String s : sset) {
            System.out.println(s);
        }
        dataStore.commit();
        dataStore.close();

    }

}
