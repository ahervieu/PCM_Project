package modelTransfomer;

import jet.runtime.typeinfo.JetValueParameter;
import kpcmmm.factory.DefaultKPCMMMFactory;
import kpcmmm.kMatrix;
import kpcmmm.kPCM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.kevoree.modeling.api.KMFContainer;
import org.kevoree.modeling.api.KMFFactory;
import org.kevoree.modeling.api.compare.ModelCompare;
import org.kevoree.modeling.api.json.JSONModelLoader;
import org.kevoree.modeling.api.json.JSONModelSerializer;
import org.kevoree.modeling.api.trace.ModelTrace;
import org.kevoree.modeling.api.trace.TraceSequence;
import org.kevoree.modeling.api.util.ModelAttributeVisitor;
import org.kevoree.modeling.api.util.ModelVisitor;
import org.kevoree.modeling.api.xmi.XMIModelLoader;
import org.kevoree.modeling.api.xmi.XMIModelSerializer;
import pcmmm.DomainCollection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Aymeric on 17/09/2014.
 */
public class main {

    public static void main (String[] args) throws IOException {

        String intpufolder = "/Users/Aymeric/Documents/dev_PCM/Tools4PCM/evaluation/output/models/";
        String outpufoder = "/Users/Aymeric/Documents/dev_PCM/KPCMM_Model_instance/";


        File f = new File(intpufolder);
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.getName().endsWith("pcm")) {
                pcmmToKpcmm transfo = new pcmmToKpcmm(file.toString());
                transfo.transform();
                JSONModelSerializer jms = new JSONModelSerializer();
                File f2 = new File(outpufoder + file.getName().replace(".pcm", ".json"));
                FileWriter fw = new FileWriter(f2);
                fw.write(jms.serialize(transfo.outputModel));
                String s = jms.serialize(transfo.outputModel);
                fw.close();
                System.out.println(file.getName());


                KMFFactory myFactory = new DefaultKPCMMMFactory();
                JSONModelLoader jml = new JSONModelLoader(myFactory);
                FileInputStream fis = new FileInputStream(outpufoder + file.getName().replace(".pcm", ".json"));
                List<KMFContainer> lst = jml.loadModelFromStream(fis) ;
                kPCM m = (kPCM) lst.get(0);
                fis.close();
            }


        }
    }


        /*

    File file = new File(intpufolder);
        pcmmToKpcmm transfo = new pcmmToKpcmm(file.toString());
        transfo.transform();

       // XMIModelSerializer xms = new XMIModelSerializer();
        JSONModelSerializer jms = new JSONModelSerializer();
        File f2 = new File(outpufoder +file.getName().replace(".pcm",".json")) ;
        FileWriter fw = new FileWriter(f2) ;
     //   fw.write(xms.serialize(transfo.outputModel));
        String s = jms.serialize(transfo.outputModel);
        fw.write(s);
        System.out.println(s);
        fw.close() ;
        System.out.println(file.getName()) ;



        KMFFactory myFactory = new DefaultKPCMMMFactory();
        JSONModelLoader jml = new JSONModelLoader(myFactory);
     //   XMIModelLoader xml = new XMIModelLoader(myFactory) ;
        FileInputStream fis = new FileInputStream(outpufoder +file.getName().replace(".pcm",".json"));
       // System.out.println( jml.loadModelFromStream(fis)) ;
        List<KMFContainer> lst = jml.loadModelFromStream(fis) ;
        kPCM m = (kPCM) lst.get(0);
        fis.close();




        String p1 = "/Users/Aymeric/Documents/dev_PCM/Tools4PCM/evaluation/output/models/Comparison_of_debuggers.pcm" ;
        String p2 = "/Users/Aymeric/Documents/dev_PCM/tmp/res.json" ;
        pcmmToKpcmm transfo = new pcmmToKpcmm(new File(p1).toString());
        transfo.transform();


        JSONModelSerializer jms = new JSONModelSerializer();
        File f2 = new File(p2) ;
        FileWriter fw = new FileWriter(f2) ;
        fw.write(jms.serialize(transfo.outputModel));
        fw.close();


        KMFFactory myFactory = new DefaultKPCMMMFactory();
        JSONModelLoader jml = new JSONModelLoader(myFactory) ;
        FileInputStream fis = new FileInputStream(f2);

        kPCM m = (kPCM)jml.loadModelFromStream(fis).get(0) ;
        fis.close();
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
        },true,true,true);
        for(kMatrix mat : m.getMatrices()){
         System.out.println(mat.path());
        }/*
        List<ModelTrace> lstTrace = m.toTraces(true,true) ;
        for (ModelTrace modelTrace : lstTrace) {
            System.out.println(modelTrace.toString());
        }*//*
        List<KMFContainer> res=   m.select("matrices[id = _0]") ;


        List<KMFContainer> res2=   m.select("matrices[id = *]/cells[(name = *Mac*)]") ;



        System.out.println("Select by query");
        System.out.println(res);
        System.out.println("--------");
        System.out.println(res2);
        System.out.println("Model compare");

        ModelCompare compare = myFactory.createModelCompare();

        String model2 = "/Users/Aymeric/Documents/dev_PCM/KPCMM_Model_instance/Comparison_of_BitTorrent_tracker_software.pcm" ;

        KMFFactory myFactory2 = new DefaultKPCMMMFactory();
        FileInputStream fis2 = new FileInputStream(model2);
        JSONModelLoader jml2 = new JSONModelLoader(myFactory2) ;
        kPCM m2 = (kPCM)jml2.loadModelFromStream(fis2).get(0) ;

        m2.visit(new ModelVisitor() {
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
        },true,true,true);
        for(kMatrix mat : m.getMatrices()){
            System.out.println(mat.path());
        }/*
        fis2.close();
       TraceSequence mergeTrc = compare.merge(m, m2);
        mergeTrc.applyOn(m) ;
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
        },true,true,true);
        for(kMatrix mat : m.getMatrices()){
            System.out.println(mat.path());
        }
/*

*/





    private void transform(String file)
    {



    }
}
