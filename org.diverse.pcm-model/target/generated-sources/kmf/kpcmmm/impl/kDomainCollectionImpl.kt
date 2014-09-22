package kpcmmm.impl

/**
 * Created by Kevoree Model Generator(KMF).
 * @developers: Gregory Nain, Fouquet Francois
 * Date: 22 sept. 14 Time: 08:55
 * Meta-Model:NS_URI=http://kpcmmm
 */
class kDomainCollectionImpl : kpcmmm.container.KMFContainerPersistenceImpl, kpcmmm.kDomainCollection { 
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
override public fun withGenerated_KMF_ID(p : String) : kpcmmm.kDomainCollection{
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
internal val _domains : MutableMap<String,kpcmmm.kDomain> = java.util.concurrent.ConcurrentHashMap<String,kpcmmm.kDomain>()
override var domains:List<kpcmmm.kDomain>
	  get(){
checkLazyLoad()
		  return _domains.values().toList()
	  }
	 set(domainsP){if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(domainsP == null){ throw IllegalArgumentException(kpcmmm.util.Constants.LIST_PARAMETER_OF_SET_IS_NULL_EXCEPTION) }
internal_domains(domainsP, true, true)
}
fun internal_domains(domainsP : List<kpcmmm.kDomain>, setOpposite : Boolean, fireEvents : Boolean ) {
checkLazyLoad()
if(_domains.values()!= domainsP){
val kmf_previousVal = _domains
_domains.clear()
for(el in domainsP){
val elKey = el.internalGetKey()
if(elKey == null){throw Exception(kpcmmm.util.Constants.ELEMENT_HAS_NO_KEY_IN_COLLECTION)}
_domains.put(elKey!!,el)
(el as kpcmmm.container.KMFContainerPersistenceImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_domains)
(el as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(this,kpcmmm.container.RemoveFromContainerCommand(this, org.kevoree.modeling.api.util.ActionType.REMOVE, kpcmmm.util.Constants.Ref_domains, el),kpcmmm.util.Constants.Ref_domains)
}
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_domains, domainsP,kmf_previousVal,this,path()))
}
}
}


private fun doAddDomains(domainsP : kpcmmm.kDomain) {
val _key_ = domainsP.internalGetKey()
if(_key_ == null || _key_ == ""){ throw Exception(kpcmmm.util.Constants.EMPTY_KEY) }
if(!_domains.containsKey(_key_)) {
_domains.put(_key_,domainsP)
(domainsP as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(this,kpcmmm.container.RemoveFromContainerCommand(this, org.kevoree.modeling.api.util.ActionType.REMOVE, kpcmmm.util.Constants.Ref_domains, domainsP),kpcmmm.util.Constants.Ref_domains)
(domainsP as kpcmmm.container.KMFContainerPersistenceImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_domains)
}
}

override fun addDomains(domainsP : kpcmmm.kDomain) : kpcmmm.kDomainCollection{
internal_addDomains(domainsP, true, true)
return this;
}

override fun addAllDomains(domainsP :List<kpcmmm.kDomain>) : kpcmmm.kDomainCollection{
internal_addAllDomains(domainsP, true, true)
return this;
}

private fun internal_addDomains(domainsP : kpcmmm.kDomain, setOpposite : Boolean, fireEvents : Boolean) {
checkLazyLoad()
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
doAddDomains(domainsP)
if(fireEvents){
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.ADD, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_domains, domainsP,null,this,path()))
}
}

private fun internal_addAllDomains(domainsP :List<kpcmmm.kDomain>, setOpposite : Boolean, fireEvents : Boolean) {
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if (setOpposite) {
for(el in domainsP){
doAddDomains(el)
}
} else {
for(el in domainsP){
doAddDomains(el)
}
}
if (fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.ADD_ALL, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_domains, domainsP,null,this,path()))
}
}


override fun removeDomains(domainsP : kpcmmm.kDomain) : kpcmmm.kDomainCollection{
internal_removeDomains(domainsP, true, true)
return this;
}

var removeAllDomainsCurrentlyProcessing : Boolean = false

override fun removeAllDomains() : kpcmmm.kDomainCollection{
internal_removeAllDomains(true, true)
return this;
}

private fun internal_removeDomains(domainsP : kpcmmm.kDomain, setOpposite : Boolean, fireEvents : Boolean) {
checkLazyLoad()
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(_domains.size() != 0 && _domains.containsKey(domainsP.internalGetKey())) {
val previousPathToBeRemoved = domainsP.path()
_domains.remove(domainsP.internalGetKey())
(domainsP as kpcmmm.container.KMFContainerPersistenceImpl).removeInboundReference(this, kpcmmm.util.Constants.Ref_domains)
(domainsP!! as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(null,null,null)
if(!removeAllDomainsCurrentlyProcessing && fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.REMOVE, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_domains, domainsP,previousPathToBeRemoved,this,path()))
}
}
}

private fun internal_removeAllDomains(setOpposite : Boolean, fireEvents : Boolean) {
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(fireEvents){

removeAllDomainsCurrentlyProcessing=true
}
val temp_els = domains!!
for(el in temp_els!!){
(el as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(null,null,null)
}
_domains.clear()
if(fireEvents){
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.REMOVE_ALL, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_domains, temp_els,null,this,path()))

removeAllDomainsCurrentlyProcessing=false
}
}

override fun reflexiveMutator(mutationType : org.kevoree.modeling.api.util.ActionType, refName : String, value : Any?, setOpposite : Boolean, fireEvents : Boolean) {
checkLazyLoad()
when(refName) {
kpcmmm.util.Constants.Att_generated_KMF_ID -> {
this.internal_generated_KMF_ID((value as? String), fireEvents)
}
kpcmmm.util.Constants.Ref_domains -> {
when(mutationType) {
org.kevoree.modeling.api.util.ActionType.ADD -> {
this.internal_addDomains(value as kpcmmm.kDomain, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.ADD_ALL -> {
this.internal_addAllDomains(value as List<kpcmmm.kDomain>, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE -> {
        this.internal_removeDomains(value as kpcmmm.kDomain, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE_ALL -> {
        this.removeAllDomains()
}
org.kevoree.modeling.api.util.ActionType.RENEW_INDEX -> {
if(_domains.size() != 0 && _domains.containsKey(value)) {
val obj = _domains.get(value)
val objNewKey = obj!!.internalGetKey()

if(objNewKey == null){throw Exception("Key newed to null "+obj)}

_domains.remove(value)
_domains.put(objNewKey,obj)
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
override fun findDomainsByID(key : String) : kpcmmm.kDomain? {
val resolved = _domains.get(key)
if(resolved==null){
val result = relativeLookupFrom(this,kpcmmm.util.Constants.Ref_domains,key)
return result as? kpcmmm.kDomain
} else {
return resolved
}
}
override fun findByID(relationName:String,idP : String) : org.kevoree.modeling.api.KMFContainer? {when(relationName) {
kpcmmm.util.Constants.Ref_domains -> {
return findDomainsByID(idP)}
else -> {return null}
}
}





override fun visit(visitor : org.kevoree.modeling.api.util.ModelVisitor, recursive : Boolean, containedReference : Boolean,nonContainedReference : Boolean){
                        checkLazyLoad()
                        visitor.beginVisitElem(this)
                                                    if(containedReference){
                                                    if(visitor.beginVisitRef(kpcmmm.util.Constants.Ref_domains, kpcmmm.util.Constants.kpcmmm_kDomain)){
                                    for(KMFLoopEntryKey in _domains.keySet()){
                        internal_visit(visitor,_domains.get(KMFLoopEntryKey),recursive,containedReference,nonContainedReference,kpcmmm.util.Constants.Ref_domains)
                    }
                                }
                visitor.endVisitRef(kpcmmm.util.Constants.Ref_domains)
                                    }
                                                                                      visitor.endVisitElem(this)
}

override fun visitAttributes(visitor : org.kevoree.modeling.api.util.ModelAttributeVisitor){
        checkLazyLoad()
                visitor.visit(generated_KMF_ID,kpcmmm.util.Constants.Att_generated_KMF_ID,this)
    }
override fun metaClassName() : String {
return kpcmmm.util.Constants.kpcmmm_kDomainCollection;
}
}
