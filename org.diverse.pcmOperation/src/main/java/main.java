import jet.runtime.typeinfo.JetValueParameter;

import kpcmmm.factory.*;
import kpcmmm.kMatrix;
import kpcmmm.kPCM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.kevoree.modeling.api.KMFContainer;

import org.kevoree.modeling.api.KMFFactory;
import org.kevoree.modeling.api.Transaction;
import org.kevoree.modeling.api.compare.ModelCompare;

import org.kevoree.modeling.api.json.JSONModelLoader;

import org.kevoree.modeling.api.persistence.DataStore;

import org.kevoree.modeling.api.persistence.MemoryDataStore;
import org.kevoree.modeling.api.trace.ModelTrace;
import org.kevoree.modeling.api.trace.TraceSequence;
import org.kevoree.modeling.api.util.ModelAttributeVisitor;
import org.kevoree.modeling.api.util.ModelTracker;
import org.kevoree.modeling.api.util.ModelVisitor;
import org.kevoree.modeling.datastores.leveldb.LevelDbDataStore;


import java.io.FileInputStream;
import java.io.File ;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/**
 * Created by Aymeric on 17/09/2014.
 */
public class main {

    public static void main(String[] args) throws IOException {

        //Loading a model from a Json
        String model1 = "/Users/Aymeric/Documents/dev_PCM/KPCMM_Model_instance/Comparison_of_document_interfaces.json";
        String model2 = "/Users/Aymeric/Documents/dev_PCM/KPCMM_Model_instance/Comparison_of_free_credit_report_websites.json";
        KPCMMMTransactionManager mytsMangager;
        DataStore ds = new LevelDbDataStore("sdss") ;
        mytsMangager = new KPCMMMTransactionManager(ds);
        KMFFactory myFactory = new DefaultKPCMMMFactory(new MemoryDataStore()) {
            @NotNull
            @Override
            public Transaction getOriginTransaction() {
                return null;
            }
        };
        JSONModelLoader jml = new JSONModelLoader(myFactory);
        FileInputStream fis = new FileInputStream(model1);
        List<KMFContainer> lst = jml.loadModelFromStream(fis);
        kPCM m = (kPCM) lst.get(0);
        fis.close();
        //Visitor to go throught the model
        m.visit(new ModelVisitor() {
            @Override
            public void visit(@JetValueParameter(name = "elem") @NotNull KMFContainer kmfContainer, @JetValueParameter(name = "refNameInParent") @NotNull String s, @JetValueParameter(name = "parent") @NotNull KMFContainer kmfContainer2) {
                System.out.println(kmfContainer.path());
                kmfContainer.visitAttributes(new ModelAttributeVisitor() {
                    @Override
                    public void visit(@JetValueParameter(name = "value", type = "?") @Nullable Object o, @JetValueParameter(name = "name") @NotNull String s, @JetValueParameter(name = "parent") @NotNull KMFContainer kmfContainer) {
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
        List<KMFContainer> res2 = m.select("matrices[id = *]/cells[name = *windows*]");

        //Cell that contian winodws in name or gedit
        List<KMFContainer> res3 = m.select("matrices[]/cells[|{(name = *windows*)(name = *edit*)}]");


        System.out.println("Select by query MAtrix with id = 0");
        System.out.println(res);
        System.out.println("Select by query Cell that contain windows in name");
        System.out.println(res2);
        System.out.println("Select by query Cell that contain windows or edit in name");
        System.out.println(res3);
        System.out.println("Model compare");

        ModelCompare mc = myFactory.createModelCompare();


        FileInputStream fis2 = new FileInputStream(model2);
        List<KMFContainer> lst2 = jml.loadModelFromStream(fis2);
        kPCM m2 = (kPCM) lst2.get(0);
        fis2.close();

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
        m.setName("test");
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
        System.out.println("delete matrix") ;
        m.removeAllMatrices();
        mt.undo();


    }
}


