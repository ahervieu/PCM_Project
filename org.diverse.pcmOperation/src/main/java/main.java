
import jet.runtime.typeinfo.JetValueParameter;
import kpcmmm.factory.KPCMMMTransaction;
import kpcmmm.factory.KPCMMMTransactionManager;
import kpcmmm.kPCM;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.kevoree.modeling.api.KMFContainer;
import org.kevoree.modeling.api.ModelLoader;
import org.kevoree.modeling.api.TransactionManager;
import org.kevoree.modeling.api.compare.ModelCompare;
import org.kevoree.modeling.api.persistence.MemoryDataStore;
import org.kevoree.modeling.api.trace.ModelTrace;
import org.kevoree.modeling.api.trace.TraceSequence;
import org.kevoree.modeling.api.util.ModelAttributeVisitor;
import org.kevoree.modeling.api.util.ModelVisitor;
import org.kevoree.modeling.datastores.leveldb.LevelDbDataStore;
import org.kevoree.modeling.datastores.mongodb.MongoDBDataStore;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Aymeric on 17/09/2014.
 */
public class main {

    public static void main(String[] args) throws IOException {
        //creating the db
         MongoDBDataStore dataStore = new MongoDBDataStore("localhost",27017,"PCM_DB9") ;
        LevelDbDataStore l = new LevelDbDataStore("rr");
        KPCMMMTransactionManager manager = new KPCMMMTransactionManager(dataStore);
        KPCMMMTransaction transaction = manager.createTransaction();

        kPCM root = (kPCM)transaction.lookup("/") ;
        if (root == null) {
            root = transaction.createkPCM().withGenerated_KMF_ID("225");
            transaction.root(root);
        }


        transaction.commit();
        transaction.close();

       //Saving model in the DB

        KPCMMMTransaction transaction2 = manager.createTransaction();

        String model1 = "Comparison_of_document_interfaces.json";



        MemoryDataStore tempStore = new MemoryDataStore();
        TransactionManager tempMemoryManager = new KPCMMMTransactionManager(tempStore);
        KPCMMMTransaction tempTransaction = (KPCMMMTransaction) tempMemoryManager.createTransaction();

        ModelCompare compare = transaction2.createModelCompare();
        ModelLoader jml = tempTransaction.createJSONLoader();
        InputStream is = main.class.getResourceAsStream(model1) ;
        System.out.println(is);
        FileInputStream fis = new FileInputStream("/Users/Aymeric/Documents/dev_PCM/pcm-scrapper/org.diverse.pcmOperation/src/main/resources/Comparison_of_document_interfaces.json");
        List<KMFContainer> lst = jml.loadModelFromStream(fis);
        kPCM m = (kPCM) lst.get(0);

        System.err.println(  m.getGenerated_KMF_ID() );

        kPCM newRootToCompare = tempTransaction.createkPCM().withGenerated_KMF_ID("0");
        TraceSequence seq = compare.merge(newRootToCompare, m);
         System.out.println(seq.exportToString());
        seq.applyOn(root);


        tempTransaction.close();
        tempMemoryManager.close();
       // transaction2.commit();
        manager.close();
        dataStore.close();

        //Reading model in the DB

        MongoDBDataStore dataStore2 = new MongoDBDataStore("localhost",27017,"PCM_DB9") ;
        KPCMMMTransactionManager manager2 = new KPCMMMTransactionManager(dataStore2);
        KPCMMMTransaction transactionLoad = manager2.createTransaction();

        kPCM root2 = (kPCM)transactionLoad.lookup("/") ;

        root2.visit(new ModelVisitor() {
            @Override
            public void visit(@JetValueParameter(name = "elem") @NotNull KMFContainer kmfContainer, @JetValueParameter(name = "refNameInParent") @NotNull String s, @JetValueParameter(name = "parent") @NotNull KMFContainer kmfContainer2) {
                System.out.println(kmfContainer.path());
                kmfContainer.visitAttributes(new ModelAttributeVisitor() {
                    @Override
                    public void visit(@JetValueParameter(name = "value", type = "?") @Nullable Object o, @JetValueParameter(name = "name") @NotNull String s, @JetValueParameter(name = "parent") @NotNull KMFContainer kmfContainer) {
                        System.out.println("Visiting attributes");

                        System.out.println(s + " " + o.toString());
                    }
                });
            }
        }, true, true, true);
        //Loading a model from a Json
/*

        String model2 = "Comparison_of_free_credit_report_websites.json";

        KPCMMMFactory factory   = new DefaultKPCMMMFactory(new MemoryDataStore()) {
            @NotNull
            @Override
            public Transaction getOriginTransaction() {
                return null;
            }
        };
        System.out.println("Kevoree Registry Server...., majorVersion=" );

        JSONModelLoader jml = factory.createJSONLoader();
        List<KMFContainer> lst = jml.loadModelFromStream(main.class.getResourceAsStream(model1));
        kPCM m = (kPCM) lst.get(0);
        ModelCompare compare = transaction.createModelCompare();

        kPCM newRootToCompare = transaction.createkPCM().withGenerated_KMF_ID("0");
        TraceSequence seq = compare.merge(newRootToCompare, m);
        seq.applyOn(newRootToCompare);


        transaction.commit();
        transaction.close();

        manager.close();
        dataStore.commit();
        dataStore.close();

        System.out.println("title " + m.getGenerated_KMF_ID());


        //Visitor to go throught the model
        m.visit(new ModelVisitor() {
            @Override
            public void visit(@JetValueParameter(name = "elem") @NotNull KMFContainer kmfContainer, @JetValueParameter(name = "refNameInParent") @NotNull String s, @JetValueParameter(name = "parent") @NotNull KMFContainer kmfContainer2) {
                System.out.println(kmfContainer.path());
                kmfContainer.visitAttributes(new ModelAttributeVisitor() {
                    @Override
                    public void visit(@JetValueParameter(name = "value", type = "?") @Nullable Object o, @JetValueParameter(name = "name") @NotNull String s, @JetValueParameter(name = "parent") @NotNull KMFContainer kmfContainer) {
                        System.out.println("Visiting attributes");

                        System.out.println(s + " " + o.toString());
                    }
                });
            }
        }, true, true, true);


        for (kMatrix mat : m.getMatrices()) {
            System.out.println(mat.path());
        }


        List<KMFContainer> res = m.select("matrices[id = _0]");
        //Cell that contian winodws in name
        List<KMFContainer> res2 = m.select("matrices[]/cells[name = *window*]");

        //Cell that contian winodws in name or gedit

/*

        System.out.println("Select by query MAtrix with id = 0");
        System.out.println(res);
        System.out.println("Select by query Cell that contain windows in name");
        System.out.println(res2.size());
        System.out.println("Select by query Cell that contain windows or edit in name");

        System.out.println("Model compare");

        ModelCompare mc = factory.createModelCompare();

    
        List<KMFContainer> lst2 = jml.loadModelFromStream(main.class.getResourceAsStream(model2));
        kPCM m2 = (kPCM) lst2.get(0);


        m.addModelElementListener(new ModelElementListener() {
            @Override
            public void elementChanged(@JetValueParameter(name = "evt") @NotNull ModelEvent modelEvent) {
                System.err.println("event");

                System.err.println(modelEvent.toString());
            }
        });

        TraceSequence tc = mc.merge(m, m2);
        List<ModelTrace> ls = tc.getTraces();
        for (ModelTrace l : ls) {
       //     System.out.println(l.toString());
        }
        tc.applyOn(m);

        System.out.println("Tracking");
        ModelTracker mt = new ModelTracker(mc) ;
        System.out.println("original name : " + m.getName()) ;
        mt.track(m);
        m.getMatrices().get(0).setName("test");

        System.out.println("modified name : " + m.getName()) ;
        System.out.println("Trace ") ;
        TraceSequence ts = mt.getTraceSequence() ;
        List<ModelTrace> ls2 = ts.getTraces();
        for (ModelTrace l : ls2) {
            System.out.println(l.toString());
        }
        System.out.println("undo ") ;
   //     mt.undo();
        System.out.println("Name after undo : " + m.getName()) ;
      //  System.out.println("delete matrix") ;
      //  m.removeAllMatrices();
    //    mt.undo();


        transaction.commit();
        transaction.close();

        manager.close();
        dataStore.commit();
        dataStore.close();
*/
    }
}


