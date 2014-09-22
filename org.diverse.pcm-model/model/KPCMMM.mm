
class kpcmmm.kAbstractProduct : kpcmmm.kVariabilityConcept {
    myValuedCells : kpcmmm.kValuedCell[0,*] oppositeOf myHeaderProducts
}

class kpcmmm.kCell  {
    name : String
    verbatim : String
    note : String[0,*]
    link : String[0,*]
    row : Int
    rowspan : Int
    column : Int
    colspan : Int
}

class kpcmmm.kAbstractFeature : kpcmmm.kVariabilityConcept {
    myValuedCells : kpcmmm.kValuedCell[0,*] oppositeOf myHeaderFeatures
}

class kpcmmm.kPCM  {
    title : String
    description : String[0,*]
    name : String
    @contained
    matrices : kpcmmm.kMatrix[0,*]
    @contained
    concepts : kpcmmm.kVariabilityConcept[0,*]
    @contained
    domainCollection : kpcmmm.kDomainCollection
}

class kpcmmm.kMatrix  {
    name : String
    id : String
    @contained
    cells : kpcmmm.kCell[0,*]
}

class kpcmmm.kProductFamily : kpcmmm.kAbstractProduct {
    @contained
    products : kpcmmm.kAbstractProduct[0,*]
}

class kpcmmm.kProduct : kpcmmm.kAbstractProduct {
}

class kpcmmm.kFeatureFamily : kpcmmm.kAbstractFeature {
    @contained
    features : kpcmmm.kAbstractFeature
}

class kpcmmm.kFeature : kpcmmm.kAbstractFeature {
    domain : kpcmmm.kDomain
}

class kpcmmm.kVariabilityConcept  {
    name : String
    constraints : kpcmmm.kValuedCell[0,*] oppositeOf concepts
}

class pcmmm.Header : kpcmmm.kCell {
    concept : kpcmmm.kVariabilityConcept[1,1]
}

class kpcmmm.kExtra : kpcmmm.kCell {
}


class kpcmmm.kHeader : kpcmmm.kCell {
    concept : kpcmmm.kVariabilityConcept
}


class kpcmmm.kConstraint  {
    name : String
    confident : Bool
    verbatim : String
}

class kpcmmm.kBoolean : kpcmmm.kSimple {
    value : Bool
}

class kpcmmm.kPartial : kpcmmm.kConstraint {
    @contained
    condition : kpcmmm.kConstraint
    @contained
    argument : kpcmmm.kConstraint
}

class kpcmmm.kSimple : kpcmmm.kConstraint {
}

class kpcmmm.kMultiple : kpcmmm.kConstraint {
    @contained
    contraints : kpcmmm.kConstraint[0,*]
}

class kpcmmm.kUnknown : kpcmmm.kConstraint {
}

class kpcmmm.kEmpty : kpcmmm.kConstraint {
}

class kpcmmm.kInconsistent : kpcmmm.kConstraint {
}

class kpcmmm.kValuedCell : kpcmmm.kCell {
    @contained
    interpretation : kpcmmm.kConstraint
    concepts : kpcmmm.kVariabilityConcept[0,*] oppositeOf constraints
    myHeaderProducts : kpcmmm.kAbstractProduct oppositeOf myValuedCells
    myHeaderFeatures : kpcmmm.kAbstractFeature oppositeOf myValuedCells
}

class kpcmmm.kAnd : kpcmmm.kMultiple {
}

class kpcmmm.kOr : kpcmmm.kMultiple {
}

class kpcmmm.kXOr : kpcmmm.kMultiple {
}

class kpcmmm.kDomain  {
    name : String
}

class kpcmmm.kDomainCollection  {
    @contained
    domains : kpcmmm.kDomain[0,*]
}

class kpcmmm.kEnum : kpcmmm.kDomain {
    values : kpcmmm.kSimple[0,*]
}

class kpcmmm.kVariabilityConceptRef : kpcmmm.kSimple {
    concept : kpcmmm.kVariabilityConcept
}

class kpcmmm.kInteger : kpcmmm.kSimple {
    value : Int
}

class kpcmmm.kDouble : kpcmmm.kSimple {
    value : Double
}
