/**
 * Created by Aymeric on 23/09/2014.
 */



var matrixDisplay = function(kPCM){
var res = "" ;
     var kconcepts = kPCM.concepts ;
   // var kcells = kmat.get(0).cells;


    for(var i = 0 ; i < kconcepts.size() ; i++)
  {
        console.log("kconcept");
        var kconcept = kconcepts.get(i);
      console.log(kconcept.metaClassName() + " " +kconcept.name);

      if(kconcept.metaClassName() == "kpcmmm.kFeature")
      {

      }else {

      }




  };


    return res
}