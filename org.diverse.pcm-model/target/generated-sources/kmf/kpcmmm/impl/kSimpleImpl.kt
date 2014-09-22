package kpcmmm.impl

/**
 * Created by Kevoree Model Generator(KMF).
 * @developers: Gregory Nain, Fouquet Francois
 * Date: 22 sept. 14 Time: 08:55
 * Meta-Model:NS_URI=http://kpcmmm
 */
class kSimpleImpl : kpcmmm.container.KMFContainerPersistenceImpl, kpcmmm.kSimple { 
override internal var internal_eContainer : org.kevoree.modeling.api.KMFContainer? = null
override internal var internal_containmentRefName : String? = null
override internal var internal_unsetCmd : kpcmmm.container.RemoveFromContainerCommand? = null
override internal var internal_readOnlyElem : Boolean = false
override internal var internal_recursive_readOnlyElem : Boolean = false
override internal var internal_inboundReferences : java.util.HashMap<org.kevoree.modeling.api.KMFContainer, MutableSet<String>> = java.util.HashMap<org.kevoree.modeling.api.KMFContainer,  MutableSet<String>>()
override internal var internal_deleteInProgress : Boolean = false
override var internal_is_deleted : Boolean = false;
override var is_root : Boolean = false;
override internal var internal_modelElementListeners : MutableList<org.kevoree.modeling.api.events.ModelElementListener>? = null
override internal var internal_modelTreeListeners : MutableList<org.kevoree.modeling.api.events.ModelElementListener>? = null
override var isResolved: Boolean = true
override var inResolution: Boolean = false
override var originFactory: org.kevoree.modeling.api.persistence.PersistenceKMFFactory? = null
override var isDirty = false;

override var path_cache : String? = null
override var key_cache: String? = null
override fun delete(){
checkLazyLoad();
internal_deleteInProgress = true
(this as org.kevoree.modeling.api.persistence.KMFContainerProxy).originFactory!!.remove(this)
advertiseInboundRefs(org.kevoree.modeling.api.util.ActionType.REMOVE, this)
internal_inboundReferences.clear()
if(internal_unsetCmd!=null){internal_unsetCmd!!.run()}
internal_is_deleted = true;
}
override public fun withName(p : String) : kpcmmm.kSimple{
name=p;
return this;
}
public override var name : String? = kpcmmm.util.Constants.STRING_DEFAULTVAL
	 set(iP : String?){
checkLazyLoad()
internal_name(iP, true)
	}//end of setter
get(){
checkLazyLoad()
return $name
}

	private fun internal_name(iP : String?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != name){
val oldPath = path()
val kmf_previousVal = $name
$name = iP
if(!inResolution){
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_name, name,kmf_previousVal,this,oldPath))
}
}
	}
	}//end of setter
override public fun withConfident(p : Boolean) : kpcmmm.kSimple{
confident=p;
return this;
}
public override var confident : Boolean? = kpcmmm.util.Constants.BOOLEAN_DEFAULTVAL
	 set(iP : Boolean?){
checkLazyLoad()
internal_confident(iP, true)
	}//end of setter
get(){
checkLazyLoad()
return $confident
}

	private fun internal_confident(iP : Boolean?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != confident){
val oldPath = path()
val kmf_previousVal = $confident
$confident = iP
if(!inResolution){
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_confident, confident,kmf_previousVal,this,oldPath))
}
}
	}
	}//end of setter
override public fun withVerbatim(p : String) : kpcmmm.kSimple{
verbatim=p;
return this;
}
public override var verbatim : String? = kpcmmm.util.Constants.STRING_DEFAULTVAL
	 set(iP : String?){
checkLazyLoad()
internal_verbatim(iP, true)
	}//end of setter
get(){
checkLazyLoad()
return $verbatim
}

	private fun internal_verbatim(iP : String?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != verbatim){
val oldPath = path()
val kmf_previousVal = $verbatim
$verbatim = iP
if(!inResolution){
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_verbatim, verbatim,kmf_previousVal,this,oldPath))
}
}
	}
	}//end of setter
override public fun withGenerated_KMF_ID(p : String) : kpcmmm.kSimple{
generated_KMF_ID=p;
return this;
}
public override var generated_KMF_ID : String? = ""+Math.random() + java.util.Date().getTime()
	 set(iP : String?){
checkLazyLoad()
internal_generated_KMF_ID(iP, true)
	}//end of setter
get(){
checkLazyLoad()
return $generated_KMF_ID
}

	private fun internal_generated_KMF_ID(iP : String?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != generated_KMF_ID){
val oldPath = path()
val oldId = internalGetKey()
if(!inResolution){
path_cache = null
key_cache = null
}
val previousParent = eContainer();
val previousRefNameInParent = getRefInParent();
val kmf_previousVal = $generated_KMF_ID
$generated_KMF_ID = iP
if(!inResolution){
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_generated_KMF_ID, generated_KMF_ID,kmf_previousVal,this,oldPath))
}
if(previousParent!=null){
previousParent.reflexiveMutator(org.kevoree.modeling.api.util.ActionType.RENEW_INDEX, previousRefNameInParent!!, oldId,false,false)
}
advertiseInboundRefs(org.kevoree.modeling.api.util.ActionType.RENEW_INDEX, oldId)
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.RENEW_INDEX, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_generated_KMF_ID, path(),null,this,oldPath))
}
visit(kpcmmm.container.cleanCacheVisitor,true,true,false)
}
	}
	}//end of setter
override fun reflexiveMutator(mutationType : org.kevoree.modeling.api.util.ActionType, refName : String, value : Any?, setOpposite : Boolean, fireEvents : Boolean) {
checkLazyLoad()
when(refName) {
kpcmmm.util.Constants.Att_name -> {
this.internal_name((value as? String), fireEvents)
}
kpcmmm.util.Constants.Att_confident -> {
this.internal_confident(("true" == value || true == value), fireEvents)
}
kpcmmm.util.Constants.Att_verbatim -> {
this.internal_verbatim((value as? String), fireEvents)
}
kpcmmm.util.Constants.Att_generated_KMF_ID -> {
this.internal_generated_KMF_ID((value as? String), fireEvents)
}
    else -> { throw Exception("Can not reflexively "+mutationType+" for "+refName + " on "+ this) }
}
}
override fun internalGetKey() : String? {
if(key_cache != null){
return key_cache
} else {
key_cache =  generated_KMF_ID
}
return key_cache
}
override fun findByID(relationName:String,idP : String) : org.kevoree.modeling.api.KMFContainer? {when(relationName) {
else -> {return null}
}
}





override fun visit(visitor : org.kevoree.modeling.api.util.ModelVisitor, recursive : Boolean, containedReference : Boolean,nonContainedReference : Boolean){
                        checkLazyLoad()
                        visitor.beginVisitElem(this)
                                                                          visitor.endVisitElem(this)
}

override fun visitAttributes(visitor : org.kevoree.modeling.api.util.ModelAttributeVisitor){
        checkLazyLoad()
                visitor.visit(confident,kpcmmm.util.Constants.Att_confident,this)
            visitor.visit(name,kpcmmm.util.Constants.Att_name,this)
            visitor.visit(verbatim,kpcmmm.util.Constants.Att_verbatim,this)
            visitor.visit(generated_KMF_ID,kpcmmm.util.Constants.Att_generated_KMF_ID,this)
    }
override fun metaClassName() : String {
return kpcmmm.util.Constants.kpcmmm_kSimple;
}
}
