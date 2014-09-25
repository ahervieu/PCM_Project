package kpcmmm.impl

/**
 * Created by Kevoree Model Generator(KMF).
 * @developers: Gregory Nain, Fouquet Francois
 * Date: 22 sept. 14 Time: 18:04
 * Meta-Model:NS_URI=http://kpcmmm
 */
class kVariabilityConceptImpl : kpcmmm.container.KMFContainerImpl, kpcmmm.kVariabilityConcept { 
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
override var path_cache : String? = null
override var key_cache: String? = null
override fun delete(){
internal_deleteInProgress = true
removeAllConstraints()
advertiseInboundRefs(org.kevoree.modeling.api.util.ActionType.REMOVE, this)
internal_inboundReferences.clear()
if(internal_unsetCmd!=null){internal_unsetCmd!!.run()}
internal_is_deleted = true;
}
override public fun withName(p : String) : kpcmmm.kVariabilityConcept{
name=p;
return this;
}
public override var name : String? = kpcmmm.util.Constants.STRING_DEFAULTVAL
	 set(iP : String?){
internal_name(iP, true)
	}//end of setter

	private fun internal_name(iP : String?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != name){
val oldPath = path()
val kmf_previousVal = $name
$name = iP
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_name, name,kmf_previousVal,this,oldPath))
}
	}
	}//end of setter
override public fun withGenerated_KMF_ID(p : String) : kpcmmm.kVariabilityConcept{
generated_KMF_ID=p;
return this;
}
public override var generated_KMF_ID : String? = ""+hashCode() + java.util.Date().getTime()
	 set(iP : String?){
internal_generated_KMF_ID(iP, true)
	}//end of setter

	private fun internal_generated_KMF_ID(iP : String?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != generated_KMF_ID){
val oldPath = path()
val oldId = internalGetKey()
path_cache = null
key_cache = null
val previousParent = eContainer();
val previousRefNameInParent = getRefInParent();
val kmf_previousVal = $generated_KMF_ID
$generated_KMF_ID = iP
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
	}//end of setter
internal val _constraints : MutableMap<String,kpcmmm.kValuedCell> = java.util.concurrent.ConcurrentHashMap<String,kpcmmm.kValuedCell>()
override var constraints:List<kpcmmm.kValuedCell>
	  get(){
		  return _constraints.values().toList()
	  }
	 set(constraintsP){if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(constraintsP == null){ throw IllegalArgumentException(kpcmmm.util.Constants.LIST_PARAMETER_OF_SET_IS_NULL_EXCEPTION) }
internal_constraints(constraintsP, true, true)
}
fun internal_constraints(constraintsP : List<kpcmmm.kValuedCell>, setOpposite : Boolean, fireEvents : Boolean ) {
if(_constraints.values()!= constraintsP){
val kmf_previousVal = _constraints
this.internal_removeAllConstraints(true, false)
for(el in constraintsP){
val elKey = el.internalGetKey()
if(elKey == null){throw Exception(kpcmmm.util.Constants.ELEMENT_HAS_NO_KEY_IN_COLLECTION)}
_constraints.put(elKey!!,el)
(el as kpcmmm.container.KMFContainerImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_constraints)
(el as kpcmmm.container.KMFContainerImpl).reflexiveMutator(org.kevoree.modeling.api.util.ActionType.ADD, kpcmmm.util.Constants.Ref_concepts, this, false, fireEvents)
}
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.REFERENCE, kpcmmm.util.Constants.Ref_constraints, constraintsP,kmf_previousVal,this,path()))
}
}
}


private fun doAddConstraints(constraintsP : kpcmmm.kValuedCell) {
val _key_ = constraintsP.internalGetKey()
if(_key_ == null || _key_ == ""){ throw Exception(kpcmmm.util.Constants.EMPTY_KEY) }
if(!_constraints.containsKey(_key_)) {
_constraints.put(_key_,constraintsP)
(constraintsP as kpcmmm.container.KMFContainerImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_constraints)
}
}

override fun addConstraints(constraintsP : kpcmmm.kValuedCell) : kpcmmm.kVariabilityConcept{
internal_addConstraints(constraintsP, true, true)
return this;
}

override fun addAllConstraints(constraintsP :List<kpcmmm.kValuedCell>) : kpcmmm.kVariabilityConcept{
internal_addAllConstraints(constraintsP, true, true)
return this;
}

private fun internal_addConstraints(constraintsP : kpcmmm.kValuedCell, setOpposite : Boolean, fireEvents : Boolean) {
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
doAddConstraints(constraintsP)
if(setOpposite){
(constraintsP as kpcmmm.kValuedCell).reflexiveMutator(org.kevoree.modeling.api.util.ActionType.ADD, kpcmmm.util.Constants.Ref_concepts, this, false, fireEvents)
}
if(fireEvents){
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.ADD, org.kevoree.modeling.api.util.ElementAttributeType.REFERENCE, kpcmmm.util.Constants.Ref_constraints, constraintsP,null,this,path()))
}
}

private fun internal_addAllConstraints(constraintsP :List<kpcmmm.kValuedCell>, setOpposite : Boolean, fireEvents : Boolean) {
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if (setOpposite) {
for(el in constraintsP){
doAddConstraints(el)
(el as kpcmmm.container.KMFContainerImpl).reflexiveMutator(org.kevoree.modeling.api.util.ActionType.ADD, kpcmmm.util.Constants.Ref_concepts, this, false, fireEvents)
}
} else {
for(el in constraintsP){
doAddConstraints(el)
}
}
if (fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.ADD_ALL, org.kevoree.modeling.api.util.ElementAttributeType.REFERENCE, kpcmmm.util.Constants.Ref_constraints, constraintsP,null,this,path()))
}
}


override fun removeConstraints(constraintsP : kpcmmm.kValuedCell) : kpcmmm.kVariabilityConcept{
internal_removeConstraints(constraintsP, true, true)
return this;
}

override fun removeAllConstraints() : kpcmmm.kVariabilityConcept{
internal_removeAllConstraints(true, true)
return this;
}

private fun internal_removeConstraints(constraintsP : kpcmmm.kValuedCell, setOpposite : Boolean, fireEvents : Boolean) {
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(_constraints.size() != 0 && _constraints.containsKey(constraintsP.internalGetKey())) {
val previousPathToBeRemoved = constraintsP.path()
_constraints.remove(constraintsP.internalGetKey())
(constraintsP as kpcmmm.container.KMFContainerImpl).removeInboundReference(this, kpcmmm.util.Constants.Ref_constraints)
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.REMOVE, org.kevoree.modeling.api.util.ElementAttributeType.REFERENCE, kpcmmm.util.Constants.Ref_constraints, constraintsP,previousPathToBeRemoved,this,path()))
}
if(setOpposite){
(constraintsP as kpcmmm.kValuedCell).reflexiveMutator(org.kevoree.modeling.api.util.ActionType.REMOVE, kpcmmm.util.Constants.Ref_concepts, this, false, fireEvents)
}
}
}

private fun internal_removeAllConstraints(setOpposite : Boolean, fireEvents : Boolean) {
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
val temp_els = constraints!!
if(setOpposite){
for(el in temp_els!!){
(el as kpcmmm.container.KMFContainerImpl).removeInboundReference(this, kpcmmm.util.Constants.Ref_constraints)
(el as kpcmmm.container.KMFContainerImpl).reflexiveMutator(org.kevoree.modeling.api.util.ActionType.REMOVE, kpcmmm.util.Constants.Ref_concepts, this, false, fireEvents)
}
}
_constraints.clear()
if(fireEvents){
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.REMOVE_ALL, org.kevoree.modeling.api.util.ElementAttributeType.REFERENCE, kpcmmm.util.Constants.Ref_constraints, temp_els,null,this,path()))
}
}

override fun reflexiveMutator(mutationType : org.kevoree.modeling.api.util.ActionType, refName : String, value : Any?, setOpposite : Boolean, fireEvents : Boolean) {
when(refName) {
kpcmmm.util.Constants.Att_name -> {
this.internal_name((value as? String), fireEvents)
}
kpcmmm.util.Constants.Att_generated_KMF_ID -> {
this.internal_generated_KMF_ID((value as? String), fireEvents)
}
kpcmmm.util.Constants.Ref_constraints -> {
when(mutationType) {
org.kevoree.modeling.api.util.ActionType.ADD -> {
this.internal_addConstraints(value as kpcmmm.kValuedCell, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.ADD_ALL -> {
this.internal_addAllConstraints(value as List<kpcmmm.kValuedCell>, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE -> {
        this.internal_removeConstraints(value as kpcmmm.kValuedCell, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE_ALL -> {
        this.internal_removeAllConstraints(setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.RENEW_INDEX -> {
if(_constraints.size() != 0 && _constraints.containsKey(value)) {
val obj = _constraints.get(value)
val objNewKey = obj!!.internalGetKey()

if(objNewKey == null){throw Exception("Key newed to null "+obj)}

_constraints.remove(value)
_constraints.put(objNewKey,obj)
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
override fun findConstraintsByID(key : String) : kpcmmm.kValuedCell? {
return _constraints.get(key)
}
override fun findByID(relationName:String,idP : String) : org.kevoree.modeling.api.KMFContainer? {when(relationName) {
kpcmmm.util.Constants.Ref_constraints -> {
return findConstraintsByID(idP)}
else -> {return null}
}
}





override fun visit(visitor : org.kevoree.modeling.api.util.ModelVisitor, recursive : Boolean, containedReference : Boolean,nonContainedReference : Boolean){
                        visitor.beginVisitElem(this)
                                                                                                           if(nonContainedReference){
                                                                            if(visitor.beginVisitRef(kpcmmm.util.Constants.Ref_constraints, kpcmmm.util.Constants.kpcmmm_kValuedCell)){
                                                    for(KMFLoopEntryKey in _constraints.keySet()){
                                internal_visit(visitor,_constraints.get(KMFLoopEntryKey),recursive,containedReference,nonContainedReference,kpcmmm.util.Constants.Ref_constraints)
                            }
                                                }
                        visitor.endVisitRef(kpcmmm.util.Constants.Ref_constraints)
                                                          }
                      visitor.endVisitElem(this)
}

override fun visitAttributes(visitor : org.kevoree.modeling.api.util.ModelAttributeVisitor){
                visitor.visit(name,kpcmmm.util.Constants.Att_name,this)
            visitor.visit(generated_KMF_ID,kpcmmm.util.Constants.Att_generated_KMF_ID,this)
    }
override fun metaClassName() : String {
return kpcmmm.util.Constants.kpcmmm_kVariabilityConcept;
}
}
