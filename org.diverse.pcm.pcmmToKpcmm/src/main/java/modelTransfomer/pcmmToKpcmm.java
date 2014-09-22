package modelTransfomer;


import jet.runtime.typeinfo.JetValueParameter;
import kpcmmm.factory.DefaultKPCMMMFactory;
import kpcmmm.factory.KPCMMMFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import org.kevoree.modeling.api.KMFContainer;

import org.kevoree.modeling.api.util.ActionType;
import pcmmm.*;
import pcmmm.impl.MatrixImpl;

import kpcmmm.*;
import sun.font.EAttribute;


import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Aymeric on 17/09/2014.
 */
public class pcmmToKpcmm {

    KPCMMMFactory myFactory ;
    PCM inputModel ;

    kPCM outputModel ;

    public pcmmToKpcmm(String pcmm_model_path)
    {
        PcmmmPackage.eINSTANCE.eClass();

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("pcm", new XMIResourceFactoryImpl());


        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI.createURI(pcmm_model_path), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node


        inputModel  = (PCM) resource.getContents().get(0);


    }


    private KMFContainer cloneModelElem(EObject src){
        String  className =  src.eClass().getInstanceClass().getName() ;
        String kclassName= "kpcmmm.k" +  className.substring(6,className.length());
        KMFContainer clonedSrc = myFactory.create(kclassName);
         EList<org.eclipse.emf.ecore.EAttribute> lst = src.eClass().getEAllAttributes() ;
        for (org.eclipse.emf.ecore.EAttribute eAttribute : lst) {
         if(src.eGet(eAttribute) instanceof  EList<?>)
         {
             EList attrList = (EList) src.eGet(eAttribute);
             ArrayList<?> clonedList = new ArrayList() ;
             clonedList.addAll(attrList);
             clonedSrc.reflexiveMutator(ActionType.SET, eAttribute.getName(), clonedList, false, false);

         }else {
             clonedSrc.reflexiveMutator(ActionType.SET, eAttribute.getName(), src.eGet(eAttribute), false, false);
         }
         }
    return clonedSrc ;
    }


    private void resolveModelElm(EObject src,    Map<EObject,KMFContainer> context )
    {
        KMFContainer target = context.get(src);

        EList<EReference> lst = src.eClass().getEAllReferences() ;

        for (EReference eRef : lst) {
            if(src.eGet(eRef) instanceof  EList<?>)
            {
                EList<EObject> attrList = (EList<EObject>) src.eGet(eRef);
                for (EObject o : attrList) {
                    KMFContainer elemResolved = context.get(o);
                    target.reflexiveMutator(ActionType.ADD,eRef.getName(),elemResolved, false, false);
                }



            }else {
                KMFContainer elemResolved = context.get(src.eGet(eRef));
                target.reflexiveMutator(ActionType.ADD,eRef.getName(),elemResolved, false, false);
            }




        }

    }

    public void transform() {

        myFactory = new DefaultKPCMMMFactory() ;
        outputModel = (kPCM)cloneModelElem(inputModel);
        Map<EObject,KMFContainer> context = new HashMap<EObject, KMFContainer>() ;
        context.put(inputModel,outputModel);
        TreeIterator<EObject> it =inputModel.eAllContents() ;

        while(it.hasNext())
        {
            EObject o= it.next() ;
            KMFContainer cloneElm = cloneModelElem(o) ;
         context.put(o, cloneElm) ;
          }
        it =inputModel.eAllContents() ;
        resolveModelElm(inputModel,context) ;
        while(it.hasNext())
        {
            EObject o= it.next() ;
            resolveModelElm(o,context) ;
        }
    }






    public kpcmmm.kPCM getOutputModel(){
        return outputModel ;
    }
}
