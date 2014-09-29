import jet.runtime.typeinfo.JetValueParameter;
import kpcmmm.factory.DefaultKPCMMMFactory;
import kpcmmm.factory.KPCMMMFactory;
import kpcmmm.factory.KPCMMMTransaction;
import kpcmmm.factory.KPCMMMTransactionManager;
import kpcmmm.kMatrix;
import kpcmmm.kPCM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.kevoree.modeling.api.KMFContainer;
import org.kevoree.modeling.api.Transaction;
import org.kevoree.modeling.api.compare.ModelCompare;
import org.kevoree.modeling.api.events.ModelElementListener;
import org.kevoree.modeling.api.events.ModelEvent;
import org.kevoree.modeling.api.json.JSONModelLoader;
import org.kevoree.modeling.api.persistence.MemoryDataStore;
import org.kevoree.modeling.api.trace.ModelTrace;
import org.kevoree.modeling.api.trace.TraceSequence;
import org.kevoree.modeling.api.util.ModelAttributeVisitor;
import org.kevoree.modeling.api.util.ModelTracker;
import org.kevoree.modeling.api.util.ModelVisitor;
import org.kevoree.modeling.datastores.leveldb.LevelDbDataStore;

import java.io.IOException;
import java.util.List;

/**
 * Created by Aymeric on 17/09/2014.
 */
public class main {

    public static void main(String[] args) throws IOException {

        //Loading a model from a Json

        String model1 = "Comparison_of_document_interfaces.json";
        String model2 = "Comparison_of_free_credit_report_websites.json";

        KPCMMMFactory factory   = new DefaultKPCMMMFactory(new MemoryDataStore()) {
            @NotNull
            @Override
            public Transaction getOriginTransaction() {
                return null;
            }
        };
        System.out.println("Kevoree Registry Server...., majorVersion=" );
        final LevelDbDataStore dataStore = new LevelDbDataStore("kev_db_0" );
        KPCMMMTransactionManager manager = new KPCMMMTransactionManager(dataStore);
        KPCMMMTransaction transaction = manager.createTransaction();

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

    }
}


