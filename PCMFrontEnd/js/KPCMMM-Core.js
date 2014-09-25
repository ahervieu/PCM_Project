



var module = Kotlin.modules['KPCMMM'];
var loader ;
var cloner;
var compare;
var factory  = new module.factory.DefaultKPCMMMFactory();
var kPCMModel;

var kPCMKernel = function()
{
    return {
        init : function() {
            model=null;
            factory  = new module.factory.DefaultKPCMMMFactory();
            loader = factory.createJSONLoader();
            compare = factory.createModelCompare();
            cloner  = factory.createModelCloner();

        },


        getLoader : function(){return loader},
        getCloner : function(){return cloner},
        getCompare : function(){return compare},
        getFactory : function(){return factory},
        setLogLevelToDebug : function() {
            module.org.kevoree.log.Log.DEBUG();
        },
        setModel : function(model){kPCMModel=model} ,
        getModel : function(){return kPCMModel}

    }

}();