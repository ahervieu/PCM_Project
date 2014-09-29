package kpcmmm.impl

/**
 * Created by Kevoree Model Generator(KMF).
 * @developers: Gregory Nain, Fouquet Francois
 * Date: 26 sept. 14 Time: 11:07
 * Meta-Model:NS_URI=http://kpcmmm
 */
class kValuedCellImpl : kpcmmm.container.KMFContainerPersistenceImpl, kpcmmm.kValuedCell { 
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
override public fun withName(p : String) : kpcmmm.kValuedCell{
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
override public fun withVerbatim(p : String) : kpcmmm.kValuedCell{
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
override public fun withNote(p : List<String>) : kpcmmm.kValuedCell{
note=p;
return this;
}
public override var note : List<String>? = java.util.ArrayList<String>()
	 set(iP : List<String>?){
checkLazyLoad()
internal_note(iP, true)
	}//end of setter
get(){
checkLazyLoad()
return $note
}

	private fun internal_note(iP : List<String>?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != note){
val oldPath = path()
val kmf_previousVal = $note
$note = iP
if(!inResolution){
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_note, note,kmf_previousVal,this,oldPath))
}
}
	}
	}//end of setter
override public fun withLink(p : List<String>) : kpcmmm.kValuedCell{
link=p;
return this;
}
public override var link : List<String>? = java.util.ArrayList<String>()
	 set(iP : List<String>?){
checkLazyLoad()
internal_link(iP, true)
	}//end of setter
get(){
checkLazyLoad()
return $link
}

	private fun internal_link(iP : List<String>?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != link){
val oldPath = path()
val kmf_previousVal = $link
$link = iP
if(!inResolution){
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_link, link,kmf_previousVal,this,oldPath))
}
}
	}
	}//end of setter
override public fun withRow(p : Int) : kpcmmm.kValuedCell{
row=p;
return this;
}
public override var row : Int? = kpcmmm.util.Constants.INT_DEFAULTVAL
	 set(iP : Int?){
checkLazyLoad()
internal_row(iP, true)
	}//end of setter
get(){
checkLazyLoad()
return $row
}

	private fun internal_row(iP : Int?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != row){
val oldPath = path()
val kmf_previousVal = $row
$row = iP
if(!inResolution){
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_row, row,kmf_previousVal,this,oldPath))
}
}
	}
	}//end of setter
override public fun withRowspan(p : Int) : kpcmmm.kValuedCell{
rowspan=p;
return this;
}
public override var rowspan : Int? = kpcmmm.util.Constants.INT_DEFAULTVAL
	 set(iP : Int?){
checkLazyLoad()
internal_rowspan(iP, true)
	}//end of setter
get(){
checkLazyLoad()
return $rowspan
}

	private fun internal_rowspan(iP : Int?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != rowspan){
val oldPath = path()
val kmf_previousVal = $rowspan
$rowspan = iP
if(!inResolution){
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_rowspan, rowspan,kmf_previousVal,this,oldPath))
}
}
	}
	}//end of setter
override public fun withColumn(p : Int) : kpcmmm.kValuedCell{
column=p;
return this;
}
public override var column : Int? = kpcmmm.util.Constants.INT_DEFAULTVAL
	 set(iP : Int?){
checkLazyLoad()
internal_column(iP, true)
	}//end of setter
get(){
checkLazyLoad()
return $column
}

	private fun internal_column(iP : Int?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != column){
val oldPath = path()
val kmf_previousVal = $column
$column = iP
if(!inResolution){
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_column, column,kmf_previousVal,this,oldPath))
}
}
	}
	}//end of setter
override public fun withColspan(p : Int) : kpcmmm.kValuedCell{
colspan=p;
return this;
}
public override var colspan : Int? = kpcmmm.util.Constants.INT_DEFAULTVAL
	 set(iP : Int?){
checkLazyLoad()
internal_colspan(iP, true)
	}//end of setter
get(){
checkLazyLoad()
return $colspan
}

	private fun internal_colspan(iP : Int?, fireEvents : Boolean = true){
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if(iP != colspan){
val oldPath = path()
val kmf_previousVal = $colspan
$colspan = iP
if(!inResolution){
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.ATTRIBUTE, kpcmmm.util.Constants.Att_colspan, colspan,kmf_previousVal,this,oldPath))
}
}
	}
	}//end of setter
override public fun withGenerated_KMF_ID(p : String) : kpcmmm.kValuedCell{
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
this.internal_removeAllConcepts(true, false)
for(el in conceptsP){
val elKey = el.internalGetKey()
if(elKey == null){throw Exception(kpcmmm.util.Constants.ELEMENT_HAS_NO_KEY_IN_COLLECTION)}
_concepts.put(elKey!!,el)
(el as kpcmmm.container.KMFContainerPersistenceImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_concepts)
(el as kpcmmm.container.KMFContainerPersistenceImpl).reflexiveMutator(org.kevoree.modeling.api.util.ActionType.ADD, kpcmmm.util.Constants.Ref_constraints, this, false, fireEvents)
}
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.REFERENCE, kpcmmm.util.Constants.Ref_concepts, conceptsP,kmf_previousVal,this,path()))
}
}
}


private fun doAddConcepts(conceptsP : kpcmmm.kVariabilityConcept) {
val _key_ = conceptsP.internalGetKey()
if(_key_ == null || _key_ == ""){ throw Exception(kpcmmm.util.Constants.EMPTY_KEY) }
if(!_concepts.containsKey(_key_)) {
_concepts.put(_key_,conceptsP)
(conceptsP as kpcmmm.container.KMFContainerPersistenceImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_concepts)
}
}

override fun addConcepts(conceptsP : kpcmmm.kVariabilityConcept) : kpcmmm.kValuedCell{
internal_addConcepts(conceptsP, true, true)
return this;
}

override fun addAllConcepts(conceptsP :List<kpcmmm.kVariabilityConcept>) : kpcmmm.kValuedCell{
internal_addAllConcepts(conceptsP, true, true)
return this;
}

private fun internal_addConcepts(conceptsP : kpcmmm.kVariabilityConcept, setOpposite : Boolean, fireEvents : Boolean) {
checkLazyLoad()
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
doAddConcepts(conceptsP)
if(setOpposite){
(conceptsP as kpcmmm.kVariabilityConcept).reflexiveMutator(org.kevoree.modeling.api.util.ActionType.ADD, kpcmmm.util.Constants.Ref_constraints, this, false, fireEvents)
}
if(fireEvents){
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.ADD, org.kevoree.modeling.api.util.ElementAttributeType.REFERENCE, kpcmmm.util.Constants.Ref_concepts, conceptsP,null,this,path()))
}
}

private fun internal_addAllConcepts(conceptsP :List<kpcmmm.kVariabilityConcept>, setOpposite : Boolean, fireEvents : Boolean) {
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
if (setOpposite) {
for(el in conceptsP){
doAddConcepts(el)
(el as kpcmmm.container.KMFContainerPersistenceImpl).reflexiveMutator(org.kevoree.modeling.api.util.ActionType.ADD, kpcmmm.util.Constants.Ref_constraints, this, false, fireEvents)
}
} else {
for(el in conceptsP){
doAddConcepts(el)
}
}
if (fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.ADD_ALL, org.kevoree.modeling.api.util.ElementAttributeType.REFERENCE, kpcmmm.util.Constants.Ref_concepts, conceptsP,null,this,path()))
}
}


override fun removeConcepts(conceptsP : kpcmmm.kVariabilityConcept) : kpcmmm.kValuedCell{
internal_removeConcepts(conceptsP, true, true)
return this;
}

override fun removeAllConcepts() : kpcmmm.kValuedCell{
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
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.REMOVE, org.kevoree.modeling.api.util.ElementAttributeType.REFERENCE, kpcmmm.util.Constants.Ref_concepts, conceptsP,previousPathToBeRemoved,this,path()))
}
if(setOpposite){
(conceptsP as kpcmmm.kVariabilityConcept).reflexiveMutator(org.kevoree.modeling.api.util.ActionType.REMOVE, kpcmmm.util.Constants.Ref_constraints, this, false, fireEvents)
}
}
}

private fun internal_removeAllConcepts(setOpposite : Boolean, fireEvents : Boolean) {
if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
val temp_els = concepts!!
if(setOpposite){
for(el in temp_els!!){
(el as kpcmmm.container.KMFContainerPersistenceImpl).removeInboundReference(this, kpcmmm.util.Constants.Ref_concepts)
(el as kpcmmm.container.KMFContainerPersistenceImpl).reflexiveMutator(org.kevoree.modeling.api.util.ActionType.REMOVE, kpcmmm.util.Constants.Ref_constraints, this, false, fireEvents)
}
}
_concepts.clear()
if(fireEvents){
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.REMOVE_ALL, org.kevoree.modeling.api.util.ElementAttributeType.REFERENCE, kpcmmm.util.Constants.Ref_concepts, temp_els,null,this,path()))
}
}

override var myHeaderFeatures:kpcmmm.kAbstractFeature?=null
get(){
checkLazyLoad()
return $myHeaderFeatures
}
	 set(myHeaderFeaturesP){if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
internal_myHeaderFeatures(myHeaderFeaturesP, true, true)
}
fun internal_myHeaderFeatures(myHeaderFeaturesP : kpcmmm.kAbstractFeature?, setOpposite : Boolean, fireEvents : Boolean ) {
checkLazyLoad()
if($myHeaderFeatures!= myHeaderFeaturesP){
if(setOpposite) {
if($myHeaderFeatures != null) {
$myHeaderFeatures!!.reflexiveMutator(org.kevoree.modeling.api.util.ActionType.REMOVE, kpcmmm.util.Constants.Ref_myValuedCells, this, false, fireEvents)
}
if(myHeaderFeaturesP!=null) {
myHeaderFeaturesP.reflexiveMutator(org.kevoree.modeling.api.util.ActionType.ADD, kpcmmm.util.Constants.Ref_myValuedCells, this, false, fireEvents)
}
}
val kmf_previousVal = $myHeaderFeatures
if(myHeaderFeaturesP != null) {
(myHeaderFeaturesP!! as kpcmmm.container.KMFContainerPersistenceImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_myHeaderFeatures)
} else {
if($myHeaderFeatures != null) {
($myHeaderFeatures!! as kpcmmm.container.KMFContainerPersistenceImpl).removeInboundReference(this, kpcmmm.util.Constants.Ref_myHeaderFeatures)
}
}
$myHeaderFeatures = myHeaderFeaturesP
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.REFERENCE, kpcmmm.util.Constants.Ref_myHeaderFeatures, myHeaderFeaturesP,kmf_previousVal,this,path()))
}
}
}

override public fun withMyHeaderFeatures(ref : kpcmmm.kAbstractFeature) : kpcmmm.kValuedCell{
return this;
}
override var interpretation:kpcmmm.kConstraint?=null
get(){
checkLazyLoad()
return $interpretation
}
	 set(interpretationP){if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
internal_interpretation(interpretationP, true, true)
}
fun internal_interpretation(interpretationP : kpcmmm.kConstraint?, setOpposite : Boolean, fireEvents : Boolean ) {
checkLazyLoad()
if($interpretation!= interpretationP){
if($interpretation != null){
originFactory!!.elementsToBeRemoved.add(($interpretation!! as kpcmmm.container.KMFContainerPersistenceImpl).path())
($interpretation!! as kpcmmm.container.KMFContainerPersistenceImpl ).setEContainer(null, null,null)
}
if(interpretationP!=null){
(interpretationP as kpcmmm.container.KMFContainerPersistenceImpl).setEContainer(this, kpcmmm.container.RemoveFromContainerCommand(this, org.kevoree.modeling.api.util.ActionType.SET, kpcmmm.util.Constants.Ref_interpretation, null),kpcmmm.util.Constants.Ref_interpretation)
}
val kmf_previousVal = $interpretation
if(interpretationP != null) {
(interpretationP!! as kpcmmm.container.KMFContainerPersistenceImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_interpretation)
} else {
if($interpretation != null) {
($interpretation!! as kpcmmm.container.KMFContainerPersistenceImpl).removeInboundReference(this, kpcmmm.util.Constants.Ref_interpretation)
}
}
$interpretation = interpretationP
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.CONTAINMENT, kpcmmm.util.Constants.Ref_interpretation, interpretationP,kmf_previousVal,this,path()))
}
}
}

override public fun withInterpretation(ref : kpcmmm.kConstraint) : kpcmmm.kValuedCell{
return this;
}
override var myHeaderProducts:kpcmmm.kAbstractProduct?=null
get(){
checkLazyLoad()
return $myHeaderProducts
}
	 set(myHeaderProductsP){if(isReadOnly()){throw Exception(kpcmmm.util.Constants.READ_ONLY_EXCEPTION)}
internal_myHeaderProducts(myHeaderProductsP, true, true)
}
fun internal_myHeaderProducts(myHeaderProductsP : kpcmmm.kAbstractProduct?, setOpposite : Boolean, fireEvents : Boolean ) {
checkLazyLoad()
if($myHeaderProducts!= myHeaderProductsP){
if(setOpposite) {
if($myHeaderProducts != null) {
$myHeaderProducts!!.reflexiveMutator(org.kevoree.modeling.api.util.ActionType.REMOVE, kpcmmm.util.Constants.Ref_myValuedCells, this, false, fireEvents)
}
if(myHeaderProductsP!=null) {
myHeaderProductsP.reflexiveMutator(org.kevoree.modeling.api.util.ActionType.ADD, kpcmmm.util.Constants.Ref_myValuedCells, this, false, fireEvents)
}
}
val kmf_previousVal = $myHeaderProducts
if(myHeaderProductsP != null) {
(myHeaderProductsP!! as kpcmmm.container.KMFContainerPersistenceImpl).addInboundReference(this, kpcmmm.util.Constants.Ref_myHeaderProducts)
} else {
if($myHeaderProducts != null) {
($myHeaderProducts!! as kpcmmm.container.KMFContainerPersistenceImpl).removeInboundReference(this, kpcmmm.util.Constants.Ref_myHeaderProducts)
}
}
$myHeaderProducts = myHeaderProductsP
if(fireEvents) {
fireModelEvent(org.kevoree.modeling.api.events.ModelEvent(org.kevoree.modeling.api.util.ActionType.SET, org.kevoree.modeling.api.util.ElementAttributeType.REFERENCE, kpcmmm.util.Constants.Ref_myHeaderProducts, myHeaderProductsP,kmf_previousVal,this,path()))
}
}
}

override public fun withMyHeaderProducts(ref : kpcmmm.kAbstractProduct) : kpcmmm.kValuedCell{
return this;
}
override fun reflexiveMutator(mutationType : org.kevoree.modeling.api.util.ActionType, refName : String, value : Any?, setOpposite : Boolean, fireEvents : Boolean) {
checkLazyLoad()
when(refName) {
kpcmmm.util.Constants.Att_name -> {
this.internal_name((value as? String), fireEvents)
}
kpcmmm.util.Constants.Att_verbatim -> {
this.internal_verbatim((value as? String), fireEvents)
}
kpcmmm.util.Constants.Att_note -> {
if(value is java.util.ArrayList<*>){
this.internal_note(value as List<String>, fireEvents)
}else {
if(value is String){
val splitted = org.kevoree.modeling.api.util.AttConverter.convAttFlat(value)
var tempArrayValues : MutableList<String> = java.util.ArrayList<String>()
for(eachV in splitted){
tempArrayValues.add(eachV as String)
}
this.internal_note(tempArrayValues as List<String>, fireEvents)
}
}
}
kpcmmm.util.Constants.Att_link -> {
if(value is java.util.ArrayList<*>){
this.internal_link(value as List<String>, fireEvents)
}else {
if(value is String){
val splitted = org.kevoree.modeling.api.util.AttConverter.convAttFlat(value)
var tempArrayValues : MutableList<String> = java.util.ArrayList<String>()
for(eachV in splitted){
tempArrayValues.add(eachV as String)
}
this.internal_link(tempArrayValues as List<String>, fireEvents)
}
}
}
kpcmmm.util.Constants.Att_row -> {
this.internal_row((value.toString().toInt()), fireEvents)
}
kpcmmm.util.Constants.Att_rowspan -> {
this.internal_rowspan((value.toString().toInt()), fireEvents)
}
kpcmmm.util.Constants.Att_column -> {
this.internal_column((value.toString().toInt()), fireEvents)
}
kpcmmm.util.Constants.Att_colspan -> {
this.internal_colspan((value.toString().toInt()), fireEvents)
}
kpcmmm.util.Constants.Att_generated_KMF_ID -> {
this.internal_generated_KMF_ID((value as? String), fireEvents)
}
kpcmmm.util.Constants.Att_generated_KMF_ID -> {
this.internal_generated_KMF_ID((value as? String), fireEvents)
}
kpcmmm.util.Constants.Ref_interpretation -> {
when(mutationType) {
org.kevoree.modeling.api.util.ActionType.SET -> {
      this.internal_interpretation(value as? kpcmmm.kConstraint, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE -> {
        this.internal_interpretation(null, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.ADD -> {
        this.internal_interpretation(value as? kpcmmm.kConstraint, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.RENEW_INDEX -> {
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
        this.internal_removeAllConcepts(setOpposite, fireEvents)
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
kpcmmm.util.Constants.Ref_myHeaderProducts -> {
when(mutationType) {
org.kevoree.modeling.api.util.ActionType.SET -> {
      this.internal_myHeaderProducts(value as? kpcmmm.kAbstractProduct, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE -> {
        this.internal_myHeaderProducts(null, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.ADD -> {
        this.internal_myHeaderProducts(value as? kpcmmm.kAbstractProduct, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.RENEW_INDEX -> {
}
else -> {throw Exception(kpcmmm.util.Constants.UNKNOWN_MUTATION_TYPE_EXCEPTION + mutationType)}
}
}
kpcmmm.util.Constants.Ref_myHeaderFeatures -> {
when(mutationType) {
org.kevoree.modeling.api.util.ActionType.SET -> {
      this.internal_myHeaderFeatures(value as? kpcmmm.kAbstractFeature, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.REMOVE -> {
        this.internal_myHeaderFeatures(null, setOpposite, fireEvents)
}
org.kevoree.modeling.api.util.ActionType.ADD -> {
        this.internal_myHeaderFeatures(value as? kpcmmm.kAbstractFeature, setOpposite, fireEvents)
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
override fun findConceptsByID(key : String) : kpcmmm.kVariabilityConcept? {
checkLazyLoad()
return _concepts.get(key)
}
override fun findByID(relationName:String,idP : String) : org.kevoree.modeling.api.KMFContainer? {when(relationName) {
kpcmmm.util.Constants.Ref_interpretation -> {
val objFound = interpretation
if(objFound!=null && objFound.internalGetKey() == idP){
return objFound
}else{return null}
}
kpcmmm.util.Constants.Ref_concepts -> {
return findConceptsByID(idP)}
kpcmmm.util.Constants.Ref_myHeaderProducts -> {
val objFound = myHeaderProducts
if(objFound!=null && objFound.internalGetKey() == idP){
return objFound
}else{return null}
}
kpcmmm.util.Constants.Ref_myHeaderFeatures -> {
val objFound = myHeaderFeatures
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
                                                    if(visitor.beginVisitRef(kpcmmm.util.Constants.Ref_interpretation, kpcmmm.util.Constants.kpcmmm_kConstraint)){
                                    internal_visit(visitor,interpretation,recursive,containedReference,nonContainedReference,kpcmmm.util.Constants.Ref_interpretation)
                                }
                visitor.endVisitRef(kpcmmm.util.Constants.Ref_interpretation)
                                    }
                                                                                                                       if(nonContainedReference){
                                                                            if(visitor.beginVisitRef(kpcmmm.util.Constants.Ref_concepts, kpcmmm.util.Constants.kpcmmm_kVariabilityConcept)){
                                                    for(KMFLoopEntryKey in _concepts.keySet()){
                                internal_visit(visitor,_concepts.get(KMFLoopEntryKey),recursive,containedReference,nonContainedReference,kpcmmm.util.Constants.Ref_concepts)
                            }
                                                }
                        visitor.endVisitRef(kpcmmm.util.Constants.Ref_concepts)
                                                                                                        if(visitor.beginVisitRef(kpcmmm.util.Constants.Ref_myHeaderProducts, kpcmmm.util.Constants.kpcmmm_kAbstractProduct)){
                                                    internal_visit(visitor,myHeaderProducts,recursive,containedReference,nonContainedReference,kpcmmm.util.Constants.Ref_myHeaderProducts)
                                                }
                        visitor.endVisitRef(kpcmmm.util.Constants.Ref_myHeaderProducts)
                                                                                                        if(visitor.beginVisitRef(kpcmmm.util.Constants.Ref_myHeaderFeatures, kpcmmm.util.Constants.kpcmmm_kAbstractFeature)){
                                                    internal_visit(visitor,myHeaderFeatures,recursive,containedReference,nonContainedReference,kpcmmm.util.Constants.Ref_myHeaderFeatures)
                                                }
                        visitor.endVisitRef(kpcmmm.util.Constants.Ref_myHeaderFeatures)
                                                          }
                      visitor.endVisitElem(this)
}

override fun visitAttributes(visitor : org.kevoree.modeling.api.util.ModelAttributeVisitor){
        checkLazyLoad()
                visitor.visit(colspan,kpcmmm.util.Constants.Att_colspan,this)
            visitor.visit(note,kpcmmm.util.Constants.Att_note,this)
            visitor.visit(rowspan,kpcmmm.util.Constants.Att_rowspan,this)
            visitor.visit(name,kpcmmm.util.Constants.Att_name,this)
            visitor.visit(link,kpcmmm.util.Constants.Att_link,this)
            visitor.visit(column,kpcmmm.util.Constants.Att_column,this)
            visitor.visit(row,kpcmmm.util.Constants.Att_row,this)
            visitor.visit(verbatim,kpcmmm.util.Constants.Att_verbatim,this)
            visitor.visit(generated_KMF_ID,kpcmmm.util.Constants.Att_generated_KMF_ID,this)
    }
override fun metaClassName() : String {
return kpcmmm.util.Constants.kpcmmm_kValuedCell;
}
}
