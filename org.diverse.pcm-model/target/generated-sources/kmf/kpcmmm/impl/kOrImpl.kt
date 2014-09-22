package kpcmmm.impl

/**
 * Created by Kevoree Model Generator(KMF).
 * @developers: Gregory Nain, Fouquet Francois
 * Date: 22 sept. 14 Time: 08:55
 * Meta-Model:NS_URI=http://kpcmmm
 */
class kOrImpl : kpcmmm.container.KMFContainerPersistenceImpl, kpcmmm.kOr { 
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
override public fun withName(p : String) : kpcmmm.kOr{
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
override public fun withConfident(p : Boolean) : kpcmmm.kOr{
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
override public fun withVerbatim(p : String) : kpcmmm.kOr{
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
override public fun withGenerated_KMF_ID(p : String) : kpcmmm.kOr{
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
internal val _contraints : MutableMap<String,kpcmmm.kConstraint> = java.util.concurrent.ConcurrentHashMap<String,kpcmmm.kConstraint>()
override var contraints:List<kpcmmm.kConstraint>
	  get(){
checkLazyLoad()
		  return _contraints.values().toList()
	  }
	 set(contraintsP){if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(contraintsP == null){ throw IllegalArgumentException(kpcmmm.util.Constants.LIST_PARAMETER_OF_SET_IS_NULL_EXCEPTION) }
internal_contraints(contraintsP, true, true)
}
fun internal_contraints(contraintsP : List<kpcmmm.kConstraint>, setOpposite : Boolean, fireEvents : Boolean ) {
checkLazyLoad()
if(_contraints.values()!= contraintsP){
val kmf_previousVal = _contraints
_contraints.clear()
for(el in contraintsP){
val elKey = el.internalGetKey()
if(elKey == null){throw Exception(kpcmmm.util.Constants.ELEMENT_HAS_NO_KEY_IN_COLLECTION)}
_contraints.put(elKey!!,el)
(el as kpcmmm.container.KMFContainerPersistenceImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_contraints)
(el as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(this,kpcmmm.container.RemoveFromContainerCommand(this, org.kevoree.modeling.api.util.ActionType.REMOVE, kpcmmm.util.Constants.Ref_contraints, el),kpcmmm.util.Constants.Ref_contraints)
}
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_contraints, contraintsP,kmf_previousVal,this,path()))
}
}
}


private fun doAddContraints(contraintsP : kpcmmm.kConstraint) {
val _key_ = contraintsP.internalGetKey()
if(_key_ == null || _key_ == ""){ throw Exception(kpcmmm.util.Constants.EMPTY_KEY) }
if(!_contraints.containsKey(_key_)) {
_contraints.put(_key_,contraintsP)
(contraintsP as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(this,kpcmmm.container.RemoveFromContainerCommand(this, org.kevoree.modeling.api.util.ActionType.REMOVE, kpcmmm.util.Constants.Ref_contraints, contraintsP),kpcmmm.util.Constants.Ref_contraints)
(contraintsP as kpcmmm.container.KMFContainerPersistenceImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_contraints)
}
}

override fun addContraints(contraintsP : kpcmmm.kConstraint) : kpcmmm.kOr{
internal_addContraints(contraintsP, true, true)
return this;
}

override fun addAllContraints(contraintsP :List<kpcmmm.kConstraint>) : kpcmmm.kOr{
internal_addAllContraints(contraintsP, true, true)
return this;
}

private fun internal_addContraints(contraintsP : kpcmmm.kConstraint, setOpposite : Boolean, fireEvents : Boolean) {
checkLazyLoad()
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
doAddContraints(contraintsP)
if(fireEvents){
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.ADD, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_contraints, contraintsP,null,this,path()))
}
}

private fun internal_addAllContraints(contraintsP :List<kpcmmm.kConstraint>, setOpposite : Boolean, fireEvents : Boolean) {
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if (setOpposite) {
for(el in contraintsP){
doAddContraints(el)
}
} else {
for(el in contraintsP){
doAddContraints(el)
}
}
if (fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.ADD_ALL, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_contraints, contraintsP,null,this,path()))
}
}


override fun removeContraints(contraintsP : kpcmmm.kConstraint) : kpcmmm.kOr{
internal_removeContraints(contraintsP, true, true)
return this;
}

var removeAllContraintsCurrentlyProcessing : Boolean = false

override fun removeAllContraints() : kpcmmm.kOr{
internal_removeAllContraints(true, true)
return this;
}

private fun internal_removeContraints(contraintsP : kpcmmm.kConstraint, setOpposite : Boolean, fireEvents : Boolean) {
checkLazyLoad()
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(_contraints.size() != 0 && _contraints.containsKey(contraintsP.internalGetKey())) {
val previousPathToBeRemoved = contraintsP.path()
_contraints.remove(contraintsP.internalGetKey())
(contraintsP as kpcmmm.container.KMFContainerPersistenceImpl).removeInboundReference(this, kpcmmm.util.Constants.Ref_contraints)
(contraintsP!! as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(null,null,null)
if(!removeAllContraintsCurrentlyProcessing && fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.REMOVE, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_contraints, contraintsP,previousPathToBeRemoved,this,path()))
}
}
}

private fun internal_removeAllContraints(setOpposite : Boolean, fireEvents : Boolean) {
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(fireEvents){

removeAllContraintsCurrentlyProcessing=true
}
val temp_els = contraints!!
for(el in temp_els!!){
(el as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(null,null,null)
}
_contraints.clear()
if(fireEvents){
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.REMOVE_ALL, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_contraints, temp_els,null,this,path()))

removeAllContraintsCurrentlyProcessing=false
}
}

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
kpcmmm.util.Constants.Ref_contraints -> {
when(mutationType) {
org.kevoree.modeling.api.util.ActionType.ADD -> {
this.internal_addContraints(value as kpcmmm.kConstraint, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.ADD_ALL -> {
this.internal_addAllContraints(value as List<kpcmmm.kConstraint>, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE -> {
        this.internal_removeContraints(value as kpcmmm.kConstraint, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE_ALL -> {
        this.removeAllContraints()
}
org.kevoree.modeling.api.util.ActionType.RENEW_INDEX -> {
if(_contraints.size() != 0 && _contraints.containsKey(value)) {
val obj = _contraints.get(value)
val objNewKey = obj!!.internalGetKey()

if(objNewKey == null){throw Exception("Key newed to null "+obj)}

_contraints.remove(value)
_contraints.put(objNewKey,obj)
}
}
else -> {throw Exception(kpcmmm.util.Constants.UNKNOWN_MUTATION_TYPE_EXCEPTION + mutationType)}
}
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
override fun findContraintsByID(key : String) : kpcmmm.kConstraint? {
val resolved = _contraints.get(key)
if(resolved==null){
val result = relativeLookupFrom(this,kpcmmm.util.Constants.Ref_contraints,key)
return result as? kpcmmm.kConstraint
} else {
return resolved
}
}
override fun findByID(relationName:String,idP : String) : org.kevoree.modeling.api.KMFContainer? {when(relationName) {
kpcmmm.util.Constants.Ref_contraints -> {
return findContraintsByID(idP)}
else -> {return null}
}
}





override fun visit(visitor : org.kevoree.modeling.api.util.ModelVisitor, recursive : Boolean, containedReference : Boolean,nonContainedReference : Boolean){
                        checkLazyLoad()
                        visitor.beginVisitElem(this)
                                                    if(containedReference){
                                                    if(visitor.beginVisitRef(kpcmmm.util.Constants.Ref_contraints, kpcmmm.util.Constants.kpcmmm_kConstraint)){
                                    for(KMFLoopEntryKey in _contraints.keySet()){
                        internal_visit(visitor,_contraints.get(KMFLoopEntryKey),recursive,containedReference,nonContainedReference,kpcmmm.util.Constants.Ref_contraints)
                    }
                                }
                visitor.endVisitRef(kpcmmm.util.Constants.Ref_contraints)
                                    }
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
return kpcmmm.util.Constants.kpcmmm_kOr;
}
}
