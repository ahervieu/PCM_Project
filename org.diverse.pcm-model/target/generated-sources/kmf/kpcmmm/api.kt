package kpcmmm

trait kAbstractProduct : org.kevoree.modeling.api.KMFContainer , kpcmmm.kVariabilityConcept {
open var myValuedCells : List<kpcmmm.kValuedCell>
fun addMyValuedCells(myValuedCells : kpcmmm.kValuedCell) : kAbstractProduct
fun addAllMyValuedCells(myValuedCells :List<kpcmmm.kValuedCell>) : kAbstractProduct
fun removeMyValuedCells(myValuedCells : kpcmmm.kValuedCell) : kAbstractProduct
fun removeAllMyValuedCells() : kAbstractProduct
fun findMyValuedCellsByID(key : String) : kpcmmm.kValuedCell?
}
trait kVariabilityConcept : org.kevoree.modeling.api.KMFContainer {
public open var name : String?
public fun withName(p : String) : kVariabilityConcept
public open var generated_KMF_ID : String?
public fun withGenerated_KMF_ID(p : String) : kVariabilityConcept
open var constraints : List<kpcmmm.kValuedCell>
fun addConstraints(constraints : kpcmmm.kValuedCell) : kVariabilityConcept
fun addAllConstraints(constraints :List<kpcmmm.kValuedCell>) : kVariabilityConcept
fun removeConstraints(constraints : kpcmmm.kValuedCell) : kVariabilityConcept
fun removeAllConstraints() : kVariabilityConcept
fun findConstraintsByID(key : String) : kpcmmm.kValuedCell?
}
trait kValuedCell : org.kevoree.modeling.api.KMFContainer , kpcmmm.kCell {
open var interpretation : kpcmmm.kConstraint?
public fun withInterpretation(ref : kpcmmm.kConstraint) : kValuedCell
open var concepts : List<kpcmmm.kVariabilityConcept>
fun addConcepts(concepts : kpcmmm.kVariabilityConcept) : kValuedCell
fun addAllConcepts(concepts :List<kpcmmm.kVariabilityConcept>) : kValuedCell
fun removeConcepts(concepts : kpcmmm.kVariabilityConcept) : kValuedCell
fun removeAllConcepts() : kValuedCell
fun findConceptsByID(key : String) : kpcmmm.kVariabilityConcept?
open var myHeaderProducts : kpcmmm.kAbstractProduct?
public fun withMyHeaderProducts(ref : kpcmmm.kAbstractProduct) : kValuedCell
open var myHeaderFeatures : kpcmmm.kAbstractFeature?
public fun withMyHeaderFeatures(ref : kpcmmm.kAbstractFeature) : kValuedCell
}
trait kCell : org.kevoree.modeling.api.KMFContainer {
public open var name : String?
public fun withName(p : String) : kCell
public open var verbatim : String?
public fun withVerbatim(p : String) : kCell
public open var note : List<String>?
public fun withNote(p : List<String>) : kCell
public open var link : List<String>?
public fun withLink(p : List<String>) : kCell
public open var row : Int?
public fun withRow(p : Int) : kCell
public open var rowspan : Int?
public fun withRowspan(p : Int) : kCell
public open var column : Int?
public fun withColumn(p : Int) : kCell
public open var colspan : Int?
public fun withColspan(p : Int) : kCell
public open var generated_KMF_ID : String?
public fun withGenerated_KMF_ID(p : String) : kCell
}
trait kAbstractFeature : org.kevoree.modeling.api.KMFContainer , kpcmmm.kVariabilityConcept {
open var myValuedCells : List<kpcmmm.kValuedCell>
fun addMyValuedCells(myValuedCells : kpcmmm.kValuedCell) : kAbstractFeature
fun addAllMyValuedCells(myValuedCells :List<kpcmmm.kValuedCell>) : kAbstractFeature
fun removeMyValuedCells(myValuedCells : kpcmmm.kValuedCell) : kAbstractFeature
fun removeAllMyValuedCells() : kAbstractFeature
fun findMyValuedCellsByID(key : String) : kpcmmm.kValuedCell?
}
trait kPCM : org.kevoree.modeling.api.KMFContainer {
public open var title : String?
public fun withTitle(p : String) : kPCM
public open var description : List<String>?
public fun withDescription(p : List<String>) : kPCM
public open var name : String?
public fun withName(p : String) : kPCM
public open var generated_KMF_ID : String?
public fun withGenerated_KMF_ID(p : String) : kPCM
open var matrices : List<kpcmmm.kMatrix>
fun addMatrices(matrices : kpcmmm.kMatrix) : kPCM
fun addAllMatrices(matrices :List<kpcmmm.kMatrix>) : kPCM
fun removeMatrices(matrices : kpcmmm.kMatrix) : kPCM
fun removeAllMatrices() : kPCM
fun findMatricesByID(key : String) : kpcmmm.kMatrix?
open var concepts : List<kpcmmm.kVariabilityConcept>
fun addConcepts(concepts : kpcmmm.kVariabilityConcept) : kPCM
fun addAllConcepts(concepts :List<kpcmmm.kVariabilityConcept>) : kPCM
fun removeConcepts(concepts : kpcmmm.kVariabilityConcept) : kPCM
fun removeAllConcepts() : kPCM
fun findConceptsByID(key : String) : kpcmmm.kVariabilityConcept?
open var domainCollection : kpcmmm.kDomainCollection?
public fun withDomainCollection(ref : kpcmmm.kDomainCollection) : kPCM
}
trait kMatrix : org.kevoree.modeling.api.KMFContainer {
public open var name : String?
public fun withName(p : String) : kMatrix
public open var id : String?
public fun withId(p : String) : kMatrix
public open var generated_KMF_ID : String?
public fun withGenerated_KMF_ID(p : String) : kMatrix
open var cells : List<kpcmmm.kCell>
fun addCells(cells : kpcmmm.kCell) : kMatrix
fun addAllCells(cells :List<kpcmmm.kCell>) : kMatrix
fun removeCells(cells : kpcmmm.kCell) : kMatrix
fun removeAllCells() : kMatrix
fun findCellsByID(key : String) : kpcmmm.kCell?
}
trait kDomainCollection : org.kevoree.modeling.api.KMFContainer {
public open var generated_KMF_ID : String?
public fun withGenerated_KMF_ID(p : String) : kDomainCollection
open var domains : List<kpcmmm.kDomain>
fun addDomains(domains : kpcmmm.kDomain) : kDomainCollection
fun addAllDomains(domains :List<kpcmmm.kDomain>) : kDomainCollection
fun removeDomains(domains : kpcmmm.kDomain) : kDomainCollection
fun removeAllDomains() : kDomainCollection
fun findDomainsByID(key : String) : kpcmmm.kDomain?
}
trait kProductFamily : org.kevoree.modeling.api.KMFContainer , kpcmmm.kAbstractProduct {
open var products : List<kpcmmm.kAbstractProduct>
fun addProducts(products : kpcmmm.kAbstractProduct) : kProductFamily
fun addAllProducts(products :List<kpcmmm.kAbstractProduct>) : kProductFamily
fun removeProducts(products : kpcmmm.kAbstractProduct) : kProductFamily
fun removeAllProducts() : kProductFamily
fun findProductsByID(key : String) : kpcmmm.kAbstractProduct?
}
trait kProduct : org.kevoree.modeling.api.KMFContainer , kpcmmm.kAbstractProduct {
}
trait kFeatureFamily : org.kevoree.modeling.api.KMFContainer , kpcmmm.kAbstractFeature {
open var features : kpcmmm.kAbstractFeature?
public fun withFeatures(ref : kpcmmm.kAbstractFeature) : kFeatureFamily
}
trait kFeature : org.kevoree.modeling.api.KMFContainer , kpcmmm.kAbstractFeature {
open var domain : kpcmmm.kDomain?
public fun withDomain(ref : kpcmmm.kDomain) : kFeature
}
trait kDomain : org.kevoree.modeling.api.KMFContainer {
public open var name : String?
public fun withName(p : String) : kDomain
public open var generated_KMF_ID : String?
public fun withGenerated_KMF_ID(p : String) : kDomain
}
trait kExtra : org.kevoree.modeling.api.KMFContainer , kpcmmm.kCell {
}
trait kHeader : org.kevoree.modeling.api.KMFContainer , kpcmmm.kCell {
open var concept : kpcmmm.kVariabilityConcept?
public fun withConcept(ref : kpcmmm.kVariabilityConcept) : kHeader
}
trait kConstraint : org.kevoree.modeling.api.KMFContainer {
public open var name : String?
public fun withName(p : String) : kConstraint
public open var confident : Boolean?
public fun withConfident(p : Boolean) : kConstraint
public open var verbatim : String?
public fun withVerbatim(p : String) : kConstraint
public open var generated_KMF_ID : String?
public fun withGenerated_KMF_ID(p : String) : kConstraint
}
trait kBoolean : org.kevoree.modeling.api.KMFContainer , kpcmmm.kSimple {
public open var value : Boolean?
public fun withValue(p : Boolean) : kBoolean
}
trait kSimple : org.kevoree.modeling.api.KMFContainer , kpcmmm.kConstraint {
}
trait kPartial : org.kevoree.modeling.api.KMFContainer , kpcmmm.kConstraint {
open var condition : kpcmmm.kConstraint?
public fun withCondition(ref : kpcmmm.kConstraint) : kPartial
open var argument : kpcmmm.kConstraint?
public fun withArgument(ref : kpcmmm.kConstraint) : kPartial
}
trait kMultiple : org.kevoree.modeling.api.KMFContainer , kpcmmm.kConstraint {
open var contraints : List<kpcmmm.kConstraint>
fun addContraints(contraints : kpcmmm.kConstraint) : kMultiple
fun addAllContraints(contraints :List<kpcmmm.kConstraint>) : kMultiple
fun removeContraints(contraints : kpcmmm.kConstraint) : kMultiple
fun removeAllContraints() : kMultiple
fun findContraintsByID(key : String) : kpcmmm.kConstraint?
}
trait kUnknown : org.kevoree.modeling.api.KMFContainer , kpcmmm.kConstraint {
}
trait kEmpty : org.kevoree.modeling.api.KMFContainer , kpcmmm.kConstraint {
}
trait kInconsistent : org.kevoree.modeling.api.KMFContainer , kpcmmm.kConstraint {
}
trait kAnd : org.kevoree.modeling.api.KMFContainer , kpcmmm.kMultiple {
}
trait kOr : org.kevoree.modeling.api.KMFContainer , kpcmmm.kMultiple {
}
trait kXOr : org.kevoree.modeling.api.KMFContainer , kpcmmm.kMultiple {
}
trait kEnum : org.kevoree.modeling.api.KMFContainer , kpcmmm.kDomain {
open var values : List<kpcmmm.kSimple>
fun addValues(values : kpcmmm.kSimple) : kEnum
fun addAllValues(values :List<kpcmmm.kSimple>) : kEnum
fun removeValues(values : kpcmmm.kSimple) : kEnum
fun removeAllValues() : kEnum
fun findValuesByID(key : String) : kpcmmm.kSimple?
}
trait kVariabilityConceptRef : org.kevoree.modeling.api.KMFContainer , kpcmmm.kSimple {
open var concept : kpcmmm.kVariabilityConcept?
public fun withConcept(ref : kpcmmm.kVariabilityConcept) : kVariabilityConceptRef
}
trait kInteger : org.kevoree.modeling.api.KMFContainer , kpcmmm.kSimple {
public open var value : Int?
public fun withValue(p : Int) : kInteger
}
trait kDouble : org.kevoree.modeling.api.KMFContainer , kpcmmm.kSimple {
public open var value : Double?
public fun withValue(p : Double) : kDouble
}
