





package kpcmmm.factory;

trait KPCMMMFactory : org.kevoree.modeling.api.KMFFactory {

    fun getVersion() : String

    fun createkAbstractProduct() : kpcmmm.kAbstractProduct
    fun createkVariabilityConcept() : kpcmmm.kVariabilityConcept
    fun createkValuedCell() : kpcmmm.kValuedCell
    fun createkCell() : kpcmmm.kCell
    fun createkAbstractFeature() : kpcmmm.kAbstractFeature
    fun createkPCM() : kpcmmm.kPCM
    fun createkMatrix() : kpcmmm.kMatrix
    fun createkDomainCollection() : kpcmmm.kDomainCollection
    fun createkProductFamily() : kpcmmm.kProductFamily
    fun createkProduct() : kpcmmm.kProduct
    fun createkFeatureFamily() : kpcmmm.kFeatureFamily
    fun createkFeature() : kpcmmm.kFeature
    fun createkDomain() : kpcmmm.kDomain
    fun createkExtra() : kpcmmm.kExtra
    fun createkHeader() : kpcmmm.kHeader
    fun createkConstraint() : kpcmmm.kConstraint
    fun createkBoolean() : kpcmmm.kBoolean
    fun createkSimple() : kpcmmm.kSimple
    fun createkPartial() : kpcmmm.kPartial
    fun createkMultiple() : kpcmmm.kMultiple
    fun createkUnknown() : kpcmmm.kUnknown
    fun createkEmpty() : kpcmmm.kEmpty
    fun createkInconsistent() : kpcmmm.kInconsistent
    fun createkAnd() : kpcmmm.kAnd
    fun createkOr() : kpcmmm.kOr
    fun createkXOr() : kpcmmm.kXOr
    fun createkEnum() : kpcmmm.kEnum
    fun createkVariabilityConceptRef() : kpcmmm.kVariabilityConceptRef
    fun createkInteger() : kpcmmm.kInteger
    fun createkDouble() : kpcmmm.kDouble
    fun createHeader() : pcmmm.Header


}