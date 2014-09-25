package kpcmmm.impl

/**
 * Created by Kevoree Model Generator(KMF).
 * @developers: Gregory Nain, Fouquet Francois
 * Date: 22 sept. 14 Time: 18:04
 * Meta-Model:NS_URI=http://kpcmmm
 */
class kPartialImpl : kpcmmm.container.KMFContainerImpl, kpcmmm.kPartial { 
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
if(condition != null) {
(condition!! as kpcmmm.container.KMFContainerImpl).removeInboundReference(this,kpcmmm.util.Constants.Ref_condition)
condition = null
}
if(argument != null) {
(argument!! as kpcmmm.container.KMFContainerImpl).removeInboundReference(this,kpcmmm.util.Constants.Ref_argument)
argument = null
}
advertiseInboundRefs(org.kevoree.modeling.api.util.ActionType.REMOVE, this)
internal_inboundReferences.clear()
if(internal_unsetCmd!=null){internal_unsetCmd!!.run()}
internal_is_deleted = true;
}
override public fun withName(p : String) : kpcmmm.kPartial{
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
override public fun withConfident(p : Boolean) : kpcmmm.kPartial{
confident=p;
return this;
}
public override var confident : Boolean? = kpcmmm.util.Constants.BOOLEAN_DEFAULTVAL
	 set(iP : Boolean?){
internal_confident(iP, true)
	}//end of setter

	private fun internal_confident(iP : Boolean?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != confident){
val oldPath = path()
val kmf_previousVal = $confident
$confident = iP
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_confident, confident,kmf_previousVal,this,oldPath))
}
	}
	}//end of setter
override public fun withVerbatim(p : String) : kpcmmm.kPartial{
verbatim=p;
return this;
}
public override var verbatim : String? = kpcmmm.util.Constants.STRING_DEFAULTVAL
	 set(iP : String?){
internal_verbatim(iP, true)
	}//end of setter

	private fun internal_verbatim(iP : String?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != verbatim){
val oldPath = path()
val kmf_previousVal = $verbatim
$verbatim = iP
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_verbatim, verbatim,kmf_previousVal,this,oldPath))
}
	}
	}//end of setter
override public fun withGenerated_KMF_ID(p : String) : kpcmmm.kPartial{
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
override var condition:kpcmmm.kConstraint?=null
	 set(conditionP){if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
internal_condition(conditionP, true, true)
}
fun internal_condition(conditionP : kpcmmm.kConstraint?, setOpposite : Boolean, fireEvents : Boolean ) {
if($condition!= conditionP){
if($condition != null){
($condition!! as kpcmmm.container.KMFContainerImpl ).setEContainer(null, null,null)
}
if(conditionP!=null){
(conditionP as kpcmmm.container.KMFContainerImpl).setEContainer(this, kpcmmm.container.RemoveFromContainerCommand(this, org.kevoree.modeling.api.util.ActionType.SET, kpcmmm.util.Constants.Ref_condition, null),kpcmmm.util.Constants.Ref_condition)
}
val kmf_previousVal = $condition
if(conditionP != null) {
(conditionP!! as kpcmmm.container.KMFContainerImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_condition)
} else {
if($condition != null) {
($condition!! as kpcmmm.container.KMFContainerImpl).removeInboundReference(this, kpcmmm.util.Constants.Ref_condition)
}
}
$condition = conditionP
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_condition, conditionP,kmf_previousVal,this,path()))
}
}
}

override public fun withCondition(ref : kpcmmm.kConstraint) : kpcmmm.kPartial{
return this;
}
override var argument:kpcmmm.kConstraint?=null
	 set(argumentP){if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
internal_argument(argumentP, true, true)
}
fun internal_argument(argumentP : kpcmmm.kConstraint?, setOpposite : Boolean, fireEvents : Boolean ) {
if($argument!= argumentP){
if($argument != null){
($argument!! as kpcmmm.container.KMFContainerImpl ).setEContainer(null, null,null)
}
if(argumentP!=null){
(argumentP as kpcmmm.container.KMFContainerImpl).setEContainer(this, kpcmmm.container.RemoveFromContainerCommand(this, org.kevoree.modeling.api.util.ActionType.SET, kpcmmm.util.Constants.Ref_argument, null),kpcmmm.util.Constants.Ref_argument)
}
val kmf_previousVal = $argument
if(argumentP != null) {
(argumentP!! as kpcmmm.container.KMFContainerImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_argument)
} else {
if($argument != null) {
($argument!! as kpcmmm.container.KMFContainerImpl).removeInboundReference(this, kpcmmm.util.Constants.Ref_argument)
}
}
$argument = argumentP
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_argument, argumentP,kmf_previousVal,this,path()))
}
}
}

override public fun withArgument(ref : kpcmmm.kConstraint) : kpcmmm.kPartial{
return this;
}
override fun reflexiveMutator(mutationType : org.kevoree.modeling.api.util.ActionType, refName : String, value : Any?, setOpposite : Boolean, fireEvents : Boolean) {
when(refName) {
kpcmmm.util.Constants.Att_name -> {
this.internal_name((value as? String), fireEvents)
}
kpcmmm.util.Constants.Att_confident -> {
this.internal_confident((value.toString().toBoolean()), fireEvents)
}
kpcmmm.util.Constants.Att_verbatim -> {
this.internal_verbatim((value as? String), fireEvents)
}
kpcmmm.util.Constants.Att_generated_KMF_ID -> {
this.internal_generated_KMF_ID((value as? String), fireEvents)
}
kpcmmm.util.Constants.Ref_condition -> {
when(mutationType) {
org.kevoree.modeling.api.util.ActionType.SET -> {
      this.internal_condition(value as? kpcmmm.kConstraint, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE -> {
        this.internal_condition(null, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.ADD -> {
        this.internal_condition(value as? kpcmmm.kConstraint, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.RENEW_INDEX -> {
}
else -> {throw Exception(kpcmmm.util.Constants.UNKNOWN_MUTATION_TYPE_EXCEPTION + mutationType)}
}
}
kpcmmm.util.Constants.Ref_argument -> {
when(mutationType) {
org.kevoree.modeling.api.util.ActionType.SET -> {
      this.internal_argument(value as? kpcmmm.kConstraint, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE -> {
        this.internal_argument(null, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.ADD -> {
        this.internal_argument(value as? kpcmmm.kConstraint, setOpposite, fireEvents)
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
override fun findByID(relationName:String,idP : String) : org.kevoree.modeling.api.KMFContainer? {when(relationName) {
kpcmmm.util.Constants.Ref_condition -> {
val objFound = condition
if(objFound!=null && objFound.internalGetKey() == idP){
return objFound
}else{return null}
}
kpcmmm.util.Constants.Ref_argument -> {
val objFound = argument
if(objFound!=null && objFound.internalGetKey() == idP){
return objFound
}else{return null}
}
else -> {return null}
}
}





override fun visit(visitor : org.kevoree.modeling.api.util.ModelVisitor, recursive : Boolean, containedReference : Boolean,nonContainedReference : Boolean){
                        visitor.beginVisitElem(this)
                                                    if(containedReference){
                                                    if(visitor.beginVisitRef(kpcmmm.util.Constants.Ref_condition, kpcmmm.util.Constants.kpcmmm_kConstraint)){
                                    internal_visit(visitor,condition,recursive,containedReference,nonContainedReference,kpcmmm.util.Constants.Ref_condition)
                                }
                visitor.endVisitRef(kpcmmm.util.Constants.Ref_condition)
                                            if(visitor.beginVisitRef(kpcmmm.util.Constants.Ref_argument, kpcmmm.util.Constants.kpcmmm_kConstraint)){
                                    internal_visit(visitor,argument,recursive,containedReference,nonContainedReference,kpcmmm.util.Constants.Ref_argument)
                                }
                visitor.endVisitRef(kpcmmm.util.Constants.Ref_argument)
                                    }
                                                                                                                          visitor.endVisitElem(this)
}

override fun visitAttributes(visitor : org.kevoree.modeling.api.util.ModelAttributeVisitor){
                visitor.visit(confident,kpcmmm.util.Constants.Att_confident,this)
            visitor.visit(name,kpcmmm.util.Constants.Att_name,this)
            visitor.visit(verbatim,kpcmmm.util.Constants.Att_verbatim,this)
            visitor.visit(generated_KMF_ID,kpcmmm.util.Constants.Att_generated_KMF_ID,this)
    }
override fun metaClassName() : String {
return kpcmmm.util.Constants.kpcmmm_kPartial;
}
}
