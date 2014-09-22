package converter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import pcmmm.* ;

import java.util.Map;

/**
 * Created by Aymeric on 16/09/2014.
 */
public class ModelConverter {

    String orginal_Ecore = "./ressources/PCMMM.ecore" ;


   public ModelConverter(String filePath)
   {

     PcmmmPackage.eINSTANCE.eClass();

       Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
       Map<String, Object> m = reg.getExtensionToFactoryMap();
       m.put("pcm", new XMIResourceFactoryImpl());


       // Obtain a new resource set
       ResourceSet resSet = new ResourceSetImpl();

       // Get the resource
       Resource resource = resSet.getResource(URI.createURI(filePath), true);
       // Get the first model element and cast it to the right type, in my
       // example everything is hierarchical included in this first node


       PCM pcm = (PCM) resource.getContents().get(0);
   }
}
