package kpcmmm.impl

/**
 * Created by Kevoree Model Generator(KMF).
 * @developers: Gregory Nain, Fouquet Francois
 * Date: 26 sept. 14 Time: 11:07
 * Meta-Model:NS_URI=http://kpcmmm
 */
class kPCMImpl : kpcmmm.container.KMFContainerPersistenceImpl, kpcmmm.kPCM { 
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
override public fun withTitle(p : String) : kpcmmm.kPCM{
title=p;
return this;
}
public override var title : String? = kpcmmm.util.Constants.STRING_DEFAULTVAL
	 set(iP : String?){
checkLazyLoad()
internal_title(iP, true)
	}//end of setter
get(){
checkLazyLoad()
return $title
}

	private fun internal_title(iP : String?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != title){
val oldPath = path()
val kmf_previousVal = $title
$title = iP
if(!inResolution){
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_title, title,kmf_previousVal,this,oldPath))
}
}
	}
	}//end of setter
override public fun withDescription(p : List<String>) : kpcmmm.kPCM{
description=p;
return this;
}
public override var description : List<String>? = java.util.ArrayList<String>()
	 set(iP : List<String>?){
checkLazyLoad()
internal_description(iP, true)
	}//end of setter
get(){
checkLazyLoad()
return $description
}

	private fun internal_description(iP : List<String>?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != description){
val oldPath = path()
val kmf_previousVal = $description
$description = iP
if(!inResolution){
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_description, description,kmf_previousVal,this,oldPath))
}
}
	}
	}//end of setter
override public fun withName(p : String) : kpcmmm.kPCM{
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
override public fun withGenerated_KMF_ID(p : String) : kpcmmm.kPCM{
generated_KMF_ID=p;
return this;
}
public override var generated_KMF_ID : String? = ""+hashCode() + java.util.Date().getTime()
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
internal val _concepts : MutableMap<String,kpcmmm.kVariabilityConcept> = java.util.concurrent.ConcurrentHashMap<String,kpcmmm.kVariabilityConcept>()
override var concepts:List<kpcmmm.kVariabilityConcept>
	  get(){
checkLazyLoad()
		  return _concepts.values().toList()
	  }
	 set(conceptsP){if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(conceptsP == null){ throw IllegalArgumentException(kpcmmm.util.Constants.LIST_PARAMETER_OF_SET_IS_NULL_EXCEPTION) }
internal_concepts(conceptsP, true, true)
}
fun internal_concepts(conceptsP : List<kpcmmm.kVariabilityConcept>, setOpposite : Boolean, fireEvents : Boolean ) {
checkLazyLoad()
if(_concepts.values()!= conceptsP){
val kmf_previousVal = _concepts
_concepts.clear()
for(el in conceptsP){
val elKey = el.internalGetKey()
if(elKey == null){throw Exception(kpcmmm.util.Constants.ELEMENT_HAS_NO_KEY_IN_COLLECTION)}
_concepts.put(elKey!!,el)
(el as kpcmmm.container.KMFContainerPersistenceImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_concepts)
(el as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(this,kpcmmm.container.RemoveFromContainerCommand(this, org.kevoree.modeling.api.util.ActionType.REMOVE, kpcmmm.util.Constants.Ref_concepts, el),kpcmmm.util.Constants.Ref_concepts)
}
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_concepts, conceptsP,kmf_previousVal,this,path()))
}
}
}


private fun doAddConcepts(conceptsP : kpcmmm.kVariabilityConcept) {
val _key_ = conceptsP.internalGetKey()
if(_key_ == null || _key_ == ""){ throw Exception(kpcmmm.util.Constants.EMPTY_KEY) }
if(!_concepts.containsKey(_key_)) {
_concepts.put(_key_,conceptsP)
(conceptsP as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(this,kpcmmm.container.RemoveFromContainerCommand(this, org.kevoree.modeling.api.util.ActionType.REMOVE, kpcmmm.util.Constants.Ref_concepts, conceptsP),kpcmmm.util.Constants.Ref_concepts)
(conceptsP as kpcmmm.container.KMFContainerPersistenceImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_concepts)
}
}

override fun addConcepts(conceptsP : kpcmmm.kVariabilityConcept) : kpcmmm.kPCM{
internal_addConcepts(conceptsP, true, true)
return this;
}

override fun addAllConcepts(conceptsP :List<kpcmmm.kVariabilityConcept>) : kpcmmm.kPCM{
internal_addAllConcepts(conceptsP, true, true)
return this;
}

private fun internal_addConcepts(conceptsP : kpcmmm.kVariabilityConcept, setOpposite : Boolean, fireEvents : Boolean) {
checkLazyLoad()
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
doAddConcepts(conceptsP)
if(fireEvents){
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.ADD, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_concepts, conceptsP,null,this,path()))
}
}

private fun internal_addAllConcepts(conceptsP :List<kpcmmm.kVariabilityConcept>, setOpposite : Boolean, fireEvents : Boolean) {
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if (setOpposite) {
for(el in conceptsP){
doAddConcepts(el)
}
} else {
for(el in conceptsP){
doAddConcepts(el)
}
}
if (fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.ADD_ALL, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_concepts, conceptsP,null,this,path()))
}
}


override fun removeConcepts(conceptsP : kpcmmm.kVariabilityConcept) : kpcmmm.kPCM{
internal_removeConcepts(conceptsP, true, true)
return this;
}

var removeAllConceptsCurrentlyProcessing : Boolean = false

override fun removeAllConcepts() : kpcmmm.kPCM{
internal_removeAllConcepts(true, true)
return this;
}

private fun internal_removeConcepts(conceptsP : kpcmmm.kVariabilityConcept, setOpposite : Boolean, fireEvents : Boolean) {
checkLazyLoad()
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(_concepts.size() != 0 && _concepts.containsKey(conceptsP.internalGetKey())) {
val previousPathToBeRemoved = conceptsP.path()
_concepts.remove(conceptsP.internalGetKey())
(conceptsP as kpcmmm.container.KMFContainerPersistenceImpl).removeInboundReference(this, kpcmmm.util.Constants.Ref_concepts)
(conceptsP!! as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(null,null,null)
if(!removeAllConceptsCurrentlyProcessing && fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.REMOVE, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_concepts, conceptsP,previousPathToBeRemoved,this,path()))
}
}
}

private fun internal_removeAllConcepts(setOpposite : Boolean, fireEvents : Boolean) {
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(fireEvents){

removeAllConceptsCurrentlyProcessing=true
}
val temp_els = concepts!!
for(el in temp_els!!){
(el as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(null,null,null)
}
_concepts.clear()
if(fireEvents){
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.REMOVE_ALL, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_concepts, temp_els,null,this,path()))

removeAllConceptsCurrentlyProcessing=false
}
}

override var domainCollection:kpcmmm.kDomainCollection?=null
get(){
checkLazyLoad()
return $domainCollection
}
	 set(domainCollectionP){if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
internal_domainCollection(domainCollectionP, true, true)
}
fun internal_domainCollection(domainCollectionP : kpcmmm.kDomainCollection?, setOpposite : Boolean, fireEvents : Boolean ) {
checkLazyLoad()
if($domainCollection!= domainCollectionP){
if($domainCollection != null){
originFactory!!.elementsToBeRemoved.add(($domainCollection!! as kpcmmm.container.KMFContainerPersistenceImpl).path())
($domainCollection!! as kpcmmm.container.KMFContainerPersistenceImpl ).setEContainer(null, null,null)
}
if(domainCollectionP!=null){
(domainCollectionP as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(this, kpcmmm.container.RemoveFromContainerCommand(this, org.kevoree.modeling.api.util.ActionType.SET, kpcmmm.util.Constants.Ref_domainCollection, null),kpcmmm.util.Constants.Ref_domainCollection)
}
val kmf_previousVal = $domainCollection
if(domainCollectionP != null) {
(domainCollectionP!! as kpcmmm.container.KMFContainerPersistenceImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_domainCollection)
} else {
if($domainCollection != null) {
($domainCollection!! as kpcmmm.container.KMFContainerPersistenceImpl).removeInboundReference(this, kpcmmm.util.Constants.Ref_domainCollection)
}
}
$domainCollection = domainCollectionP
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_domainCollection, domainCollectionP,kmf_previousVal,this,path()))
}
}
}

override public fun withDomainCollection(ref : kpcmmm.kDomainCollection) : kpcmmm.kPCM{
return this;
}
internal val _matrices : MutableMap<String,kpcmmm.kMatrix> = java.util.concurrent.ConcurrentHashMap<String,kpcmmm.kMatrix>()
override var matrices:List<kpcmmm.kMatrix>
	  get(){
checkLazyLoad()
		  return _matrices.values().toList()
	  }
	 set(matricesP){if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(matricesP == null){ throw IllegalArgumentException(kpcmmm.util.Constants.LIST_PARAMETER_OF_SET_IS_NULL_EXCEPTION) }
internal_matrices(matricesP, true, true)
}
fun internal_matrices(matricesP : List<kpcmmm.kMatrix>, setOpposite : Boolean, fireEvents : Boolean ) {
checkLazyLoad()
if(_matrices.values()!= matricesP){
val kmf_previousVal = _matrices
_matrices.clear()
for(el in matricesP){
val elKey = el.internalGetKey()
if(elKey == null){throw Exception(kpcmmm.util.Constants.ELEMENT_HAS_NO_KEY_IN_COLLECTION)}
_matrices.put(elKey!!,el)
(el as kpcmmm.container.KMFContainerPersistenceImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_matrices)
(el as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(this,kpcmmm.container.RemoveFromContainerCommand(this, org.kevoree.modeling.api.util.ActionType.REMOVE, kpcmmm.util.Constants.Ref_matrices, el),kpcmmm.util.Constants.Ref_matrices)
}
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_matrices, matricesP,kmf_previousVal,this,path()))
}
}
}


private fun doAddMatrices(matricesP : kpcmmm.kMatrix) {
val _key_ = matricesP.internalGetKey()
if(_key_ == null || _key_ == ""){ throw Exception(kpcmmm.util.Constants.EMPTY_KEY) }
if(!_matrices.containsKey(_key_)) {
_matrices.put(_key_,matricesP)
(matricesP as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(this,kpcmmm.container.RemoveFromContainerCommand(this, org.kevoree.modeling.api.util.ActionType.REMOVE, kpcmmm.util.Constants.Ref_matrices, matricesP),kpcmmm.util.Constants.Ref_matrices)
(matricesP as kpcmmm.container.KMFContainerPersistenceImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_matrices)
}
}

override fun addMatrices(matricesP : kpcmmm.kMatrix) : kpcmmm.kPCM{
internal_addMatrices(matricesP, true, true)
return this;
}

override fun addAllMatrices(matricesP :List<kpcmmm.kMatrix>) : kpcmmm.kPCM{
internal_addAllMatrices(matricesP, true, true)
return this;
}

private fun internal_addMatrices(matricesP : kpcmmm.kMatrix, setOpposite : Boolean, fireEvents : Boolean) {
checkLazyLoad()
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
doAddMatrices(matricesP)
if(fireEvents){
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.ADD, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_matrices, matricesP,null,this,path()))
}
}

private fun internal_addAllMatrices(matricesP :List<kpcmmm.kMatrix>, setOpposite : Boolean, fireEvents : Boolean) {
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if (setOpposite) {
for(el in matricesP){
doAddMatrices(el)
}
} else {
for(el in matricesP){
doAddMatrices(el)
}
}
if (fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.ADD_ALL, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_matrices, matricesP,null,this,path()))
}
}


override fun removeMatrices(matricesP : kpcmmm.kMatrix) : kpcmmm.kPCM{
internal_removeMatrices(matricesP, true, true)
return this;
}

var removeAllMatricesCurrentlyProcessing : Boolean = false

override fun removeAllMatrices() : kpcmmm.kPCM{
internal_removeAllMatrices(true, true)
return this;
}

private fun internal_removeMatrices(matricesP : kpcmmm.kMatrix, setOpposite : Boolean, fireEvents : Boolean) {
checkLazyLoad()
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(_matrices.size() != 0 && _matrices.containsKey(matricesP.internalGetKey())) {
val previousPathToBeRemoved = matricesP.path()
_matrices.remove(matricesP.internalGetKey())
(matricesP as kpcmmm.container.KMFContainerPersistenceImpl).removeInboundReference(this, kpcmmm.util.Constants.Ref_matrices)
(matricesP!! as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(null,null,null)
if(!removeAllMatricesCurrentlyProcessing && fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.REMOVE, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_matrices, matricesP,previousPathToBeRemoved,this,path()))
}
}
}

private fun internal_removeAllMatrices(setOpposite : Boolean, fireEvents : Boolean) {
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(fireEvents){

removeAllMatricesCurrentlyProcessing=true
}
val temp_els = matrices!!
for(el in temp_els!!){
(el as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(null,null,null)
}
_matrices.clear()
if(fireEvents){
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.REMOVE_ALL, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_matrices, temp_els,null,this,path()))

removeAllMatricesCurrentlyProcessing=false
}
}

override fun reflexiveMutator(mutationType : org.kevoree.modeling.api.util.ActionType, refName : String, value : Any?, setOpposite : Boolean, fireEvents : Boolean) {
checkLazyLoad()
when(refName) {
kpcmmm.util.Constants.Att_title -> {
this.internal_title((value as? String), fireEvents)
}
kpcmmm.util.Constants.Att_description -> {
if(value is java.util.ArrayList<*>){
this.internal_description(value as List<String>, fireEvents)
}else {
if(value is String){
val splitted = org.kevoree.modeling.api.util.AttConverter.convAttFlat(value)
var tempArrayValues : MutableList<String> = java.util.ArrayList<String>()
for(eachV in splitted){
tempArrayValues.add(eachV as String)
}
this.internal_description(tempArrayValues as List<String>, fireEvents)
}
}
}
kpcmmm.util.Constants.Att_name -> {
this.internal_name((value as? String), fireEvents)
}
kpcmmm.util.Constants.Att_generated_KMF_ID -> {
this.internal_generated_KMF_ID((value as? String), fireEvents)
}
kpcmmm.util.Constants.Ref_matrices -> {
when(mutationType) {
org.kevoree.modeling.api.util.ActionType.ADD -> {
this.internal_addMatrices(value as kpcmmm.kMatrix, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.ADD_ALL -> {
this.internal_addAllMatrices(value as List<kpcmmm.kMatrix>, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE -> {
        this.internal_removeMatrices(value as kpcmmm.kMatrix, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE_ALL -> {
        this.removeAllMatrices()
}
org.kevoree.modeling.api.util.ActionType.RENEW_INDEX -> {
if(_matrices.size() != 0 && _matrices.containsKey(value)) {
val obj = _matrices.get(value)
val objNewKey = obj!!.internalGetKey()

if(objNewKey == null){throw Exception("Key newed to null "+obj)}

_matrices.remove(value)
_matrices.put(objNewKey,obj)
}
}
else -> {throw Exception(kpcmmm.util.Constants.UNKNOWN_MUTATION_TYPE_EXCEPTION + mutationType)}
}
}
kpcmmm.util.Constants.Ref_concepts -> {
when(mutationType) {
org.kevoree.modeling.api.util.ActionType.ADD -> {
this.internal_addConcepts(value as kpcmmm.kVariabilityConcept, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.ADD_ALL -> {
this.internal_addAllConcepts(value as List<kpcmmm.kVariabilityConcept>, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE -> {
        this.internal_removeConcepts(value as kpcmmm.kVariabilityConcept, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE_ALL -> {
        this.removeAllConcepts()
}
org.kevoree.modeling.api.util.ActionType.RENEW_INDEX -> {
if(_concepts.size() != 0 && _concepts.containsKey(value)) {
val obj = _concepts.get(value)
val objNewKey = obj!!.internalGetKey()

if(objNewKey == null){throw Exception("Key newed to null "+obj)}

_concepts.remove(value)
_concepts.put(objNewKey,obj)
}
}
else -> {throw Exception(kpcmmm.util.Constants.UNKNOWN_MUTATION_TYPE_EXCEPTION + mutationType)}
}
}
kpcmmm.util.Constants.Ref_domainCollection -> {
when(mutationType) {
org.kevoree.modeling.api.util.ActionType.SET -> {
      this.internal_domainCollection(value as? kpcmmm.kDomainCollection, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE -> {
        this.internal_domainCollection(null, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.ADD -> {
        this.internal_domainCollection(value as? kpcmmm.kDomainCollection, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.RENEW_INDEX -> {
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
override fun findMatricesByID(key : String) : kpcmmm.kMatrix? {
val resolved = _matrices.get(key)
if(resolved==null){
val result = relativeLookupFrom(this,kpcmmm.util.Constants.Ref_matrices,key)
return result as? kpcmmm.kMatrix
} else {
return resolved
}
}
override fun findConceptsByID(key : String) : kpcmmm.kVariabilityConcept? {
val resolved = _concepts.get(key)
if(resolved==null){
val result = relativeLookupFrom(this,kpcmmm.util.Constants.Ref_concepts,key)
return result as? kpcmmm.kVariabilityConcept
} else {
return resolved
}
}
override fun findByID(relationName:String,idP : String) : org.kevoree.modeling.api.KMFContainer? {when(relationName) {
kpcmmm.util.Constants.Ref_matrices -> {
return findMatricesByID(idP)}
kpcmmm.util.Constants.Ref_concepts -> {
return findConceptsByID(idP)}
kpcmmm.util.Constants.Ref_domainCollection -> {
val objFound = domainCollection
if(objFound!=null && objFound.internalGetKey() == idP){
return objFound
}else{return null}
}
else -> {return null}
}
}





override fun visit(visitor : org.kevoree.modeling.api.util.ModelVisitor, recursive : Boolean, containedReference : Boolean,nonContainedReference : Boolean){
                        checkLazyLoad()
                        visitor.beginVisitElem(this)
                                                    if(containedReference){
                                                    if(visitor.beginVisitRef(kpcmmm.util.Constants.Ref_matrices, kpcmmm.util.Constants.kpcmmm_kMatrix)){
                                    for(KMFLoopEntryKey in _matrices.keySet()){
                        internal_visit(visitor,_matrices.get(KMFLoopEntryKey),recursive,containedReference,nonContainedReference,kpcmmm.util.Constants.Ref_matrices)
                    }
                                }
                visitor.endVisitRef(kpcmmm.util.Constants.Ref_matrices)
                                            if(visitor.beginVisitRef(kpcmmm.util.Constants.Ref_concepts, kpcmmm.util.Constants.kpcmmm_kVariabilityConcept)){
                                    for(KMFLoopEntryKey in _concepts.keySet()){
                        internal_visit(visitor,_concepts.get(KMFLoopEntryKey),recursive,containedReference,nonContainedReference,kpcmmm.util.Constants.Ref_concepts)
                    }
                                }
                visitor.endVisitRef(kpcmmm.util.Constants.Ref_concepts)
                                            if(visitor.beginVisitRef(kpcmmm.util.Constants.Ref_domainCollection, kpcmmm.util.Constants.kpcmmm_kDomainCollection)){
                                    internal_visit(visitor,domainCollection,recursive,containedReference,nonContainedReference,kpcmmm.util.Constants.Ref_domainCollection)
                                }
                visitor.endVisitRef(kpcmmm.util.Constants.Ref_domainCollection)
                                    }
                                                                                                                                                              visitor.endVisitElem(this)
}

override fun visitAttributes(visitor : org.kevoree.modeling.api.util.ModelAttributeVisitor){
        checkLazyLoad()
                visitor.visit(name,kpcmmm.util.Constants.Att_name,this)
            visitor.visit(description,kpcmmm.util.Constants.Att_description,this)
            visitor.visit(title,kpcmmm.util.Constants.Att_title,this)
            visitor.visit(generated_KMF_ID,kpcmmm.util.Constants.Att_generated_KMF_ID,this)
    }
override fun metaClassName() : String {
return kpcmmm.util.Constants.kpcmmm_kPCM;
}
}
