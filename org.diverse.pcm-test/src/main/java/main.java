import converter.ModelConverter;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 * Created by Aymeric on 12/09/2014.
 */
public class main {

   public static void main (String[] args) throws IOException {


       ModelConverter cm = new ModelConverter("/Users/Aymeric/Documents/dev_PCM/Tools4PCM/evaluation/output/models/Comparison_of_application_servers.pcm");


       pcmmm.PCMMBoolean pb ;
 /*   DefaultPCMMMFactory myFactory = new DefaultPCMMMFactory();
       XMIModelLoader xmiLoader = myFactory.createXMILoader();

        System.out.println(myFactory.getVersion());
       File f = new File("/Users/Aymeric/Documents/dev_PCM/Tools4PCM/evaluation/output/models/Comparison_of_debuggers.pcm");

       Charset charset = StandardCharsets.UTF_8;
       String content = modifyModel(f);

       System.out.println(content);
      List<KMFContainer> kmfContainerLst = xmiLoader.loadModelFromString(content) ;
       for (KMFContainer kmfContainer : kmfContainerLst) {
          System.out.println(kmfContainer.toString());
       }
       */
   }


    public static String modifyModel(File f) throws IOException {

        Charset charset = StandardCharsets.UTF_8;
        String content = new String(Files.readAllBytes(f.toPath()), charset);
        content = content.replaceAll("\"pcmmm:Boolean\"", "\"pcmmm:PCMMBoolean\"");
        content = content.replaceAll("\"pcmmm:Double\"", "\"pcmmm:PCMMDouble\"");
        content = content.replaceAll("\"pcmmm:Integer\"", "\"pcmmm:PCMMInteger\"");
        content = content.replaceAll("interpretation", "interpret");
        return content ;

    }




}
