







package kpcmmm.factory;

import kpcmmm.kAbstractProduct;
import kpcmmm.kVariabilityConcept;
import kpcmmm.kValuedCell;
import kpcmmm.kCell;
import kpcmmm.kAbstractFeature;
import kpcmmm.kPCM;
import kpcmmm.kMatrix;
import kpcmmm.kDomainCollection;
import kpcmmm.kProductFamily;
import kpcmmm.kProduct;
import kpcmmm.kFeatureFamily;
import kpcmmm.kFeature;
import kpcmmm.kDomain;
import kpcmmm.kExtra;
import kpcmmm.kHeader;
import kpcmmm.kConstraint;
import kpcmmm.kBoolean;
import kpcmmm.kSimple;
import kpcmmm.kPartial;
import kpcmmm.kMultiple;
import kpcmmm.kUnknown;
import kpcmmm.kEmpty;
import kpcmmm.kInconsistent;
import kpcmmm.kAnd;
import kpcmmm.kOr;
import kpcmmm.kXOr;
import kpcmmm.kEnum;
import kpcmmm.kVariabilityConceptRef;
import kpcmmm.kInteger;
import kpcmmm.kDouble;
import pcmmm.Header;

 class DefaultKPCMMMFactory(   ) : KPCMMMFactory    {

override fun getVersion() : String { return "1.0-SNAPSHOT" }

    override fun lookup(path: String): org.kevoree.modeling.api.KMFContainer? {
        return null
    }



override fun createkAbstractProduct() : kpcmmm.kAbstractProduct {
val tempElem = kpcmmm.impl.kAbstractProductImpl(  )
    return tempElem
}
override fun createkVariabilityConcept() : kpcmmm.kVariabilityConcept {
val tempElem = kpcmmm.impl.kVariabilityConceptImpl(  )
    return tempElem
}
override fun createkValuedCell() : kpcmmm.kValuedCell {
val tempElem = kpcmmm.impl.kValuedCellImpl(  )
    return tempElem
}
override fun createkCell() : kpcmmm.kCell {
val tempElem = kpcmmm.impl.kCellImpl(  )
    return tempElem
}
override fun createkAbstractFeature() : kpcmmm.kAbstractFeature {
val tempElem = kpcmmm.impl.kAbstractFeatureImpl(  )
    return tempElem
}
override fun createkPCM() : kpcmmm.kPCM {
val tempElem = kpcmmm.impl.kPCMImpl(  )
    return tempElem
}
override fun createkMatrix() : kpcmmm.kMatrix {
val tempElem = kpcmmm.impl.kMatrixImpl(  )
    return tempElem
}
override fun createkDomainCollection() : kpcmmm.kDomainCollection {
val tempElem = kpcmmm.impl.kDomainCollectionImpl(  )
    return tempElem
}
override fun createkProductFamily() : kpcmmm.kProductFamily {
val tempElem = kpcmmm.impl.kProductFamilyImpl(  )
    return tempElem
}
override fun createkProduct() : kpcmmm.kProduct {
val tempElem = kpcmmm.impl.kProductImpl(  )
    return tempElem
}
override fun createkFeatureFamily() : kpcmmm.kFeatureFamily {
val tempElem = kpcmmm.impl.kFeatureFamilyImpl(  )
    return tempElem
}
override fun createkFeature() : kpcmmm.kFeature {
val tempElem = kpcmmm.impl.kFeatureImpl(  )
    return tempElem
}
override fun createkDomain() : kpcmmm.kDomain {
val tempElem = kpcmmm.impl.kDomainImpl(  )
    return tempElem
}
override fun createkExtra() : kpcmmm.kExtra {
val tempElem = kpcmmm.impl.kExtraImpl(  )
    return tempElem
}
override fun createkHeader() : kpcmmm.kHeader {
val tempElem = kpcmmm.impl.kHeaderImpl(  )
    return tempElem
}
override fun createkConstraint() : kpcmmm.kConstraint {
val tempElem = kpcmmm.impl.kConstraintImpl(  )
    return tempElem
}
override fun createkBoolean() : kpcmmm.kBoolean {
val tempElem = kpcmmm.impl.kBooleanImpl(  )
    return tempElem
}
override fun createkSimple() : kpcmmm.kSimple {
val tempElem = kpcmmm.impl.kSimpleImpl(  )
    return tempElem
}
override fun createkPartial() : kpcmmm.kPartial {
val tempElem = kpcmmm.impl.kPartialImpl(  )
    return tempElem
}
override fun createkMultiple() : kpcmmm.kMultiple {
val tempElem = kpcmmm.impl.kMultipleImpl(  )
    return tempElem
}
override fun createkUnknown() : kpcmmm.kUnknown {
val tempElem = kpcmmm.impl.kUnknownImpl(  )
    return tempElem
}
override fun createkEmpty() : kpcmmm.kEmpty {
val tempElem = kpcmmm.impl.kEmptyImpl(  )
    return tempElem
}
override fun createkInconsistent() : kpcmmm.kInconsistent {
val tempElem = kpcmmm.impl.kInconsistentImpl(  )
    return tempElem
}
override fun createkAnd() : kpcmmm.kAnd {
val tempElem = kpcmmm.impl.kAndImpl(  )
    return tempElem
}
override fun createkOr() : kpcmmm.kOr {
val tempElem = kpcmmm.impl.kOrImpl(  )
    return tempElem
}
override fun createkXOr() : kpcmmm.kXOr {
val tempElem = kpcmmm.impl.kXOrImpl(  )
    return tempElem
}
override fun createkEnum() : kpcmmm.kEnum {
val tempElem = kpcmmm.impl.kEnumImpl(  )
    return tempElem
}
override fun createkVariabilityConceptRef() : kpcmmm.kVariabilityConceptRef {
val tempElem = kpcmmm.impl.kVariabilityConceptRefImpl(  )
    return tempElem
}
override fun createkInteger() : kpcmmm.kInteger {
val tempElem = kpcmmm.impl.kIntegerImpl(  )
    return tempElem
}
override fun createkDouble() : kpcmmm.kDouble {
val tempElem = kpcmmm.impl.kDoubleImpl(  )
    return tempElem
}
override fun createHeader() : pcmmm.Header {
val tempElem = pcmmm.impl.HeaderImpl(  )
    return tempElem
}

override fun create(metaClassName : String) : org.kevoree.modeling.api.KMFContainer? {
when(metaClassName){
    kpcmmm.util.Constants.kpcmmm_kAbstractProduct -> { return createkAbstractProduct() }
    kpcmmm.util.Constants.kpcmmm_kVariabilityConcept -> { return createkVariabilityConcept() }
    kpcmmm.util.Constants.kpcmmm_kValuedCell -> { return createkValuedCell() }
    kpcmmm.util.Constants.kpcmmm_kCell -> { return createkCell() }
    kpcmmm.util.Constants.kpcmmm_kAbstractFeature -> { return createkAbstractFeature() }
    kpcmmm.util.Constants.kpcmmm_kPCM -> { return createkPCM() }
    kpcmmm.util.Constants.kpcmmm_kMatrix -> { return createkMatrix() }
    kpcmmm.util.Constants.kpcmmm_kDomainCollection -> { return createkDomainCollection() }
    kpcmmm.util.Constants.kpcmmm_kProductFamily -> { return createkProductFamily() }
    kpcmmm.util.Constants.kpcmmm_kProduct -> { return createkProduct() }
    kpcmmm.util.Constants.kpcmmm_kFeatureFamily -> { return createkFeatureFamily() }
    kpcmmm.util.Constants.kpcmmm_kFeature -> { return createkFeature() }
    kpcmmm.util.Constants.kpcmmm_kDomain -> { return createkDomain() }
    kpcmmm.util.Constants.kpcmmm_kExtra -> { return createkExtra() }
    kpcmmm.util.Constants.kpcmmm_kHeader -> { return createkHeader() }
    kpcmmm.util.Constants.kpcmmm_kConstraint -> { return createkConstraint() }
    kpcmmm.util.Constants.kpcmmm_kBoolean -> { return createkBoolean() }
    kpcmmm.util.Constants.kpcmmm_kSimple -> { return createkSimple() }
    kpcmmm.util.Constants.kpcmmm_kPartial -> { return createkPartial() }
    kpcmmm.util.Constants.kpcmmm_kMultiple -> { return createkMultiple() }
    kpcmmm.util.Constants.kpcmmm_kUnknown -> { return createkUnknown() }
    kpcmmm.util.Constants.kpcmmm_kEmpty -> { return createkEmpty() }
    kpcmmm.util.Constants.kpcmmm_kInconsistent -> { return createkInconsistent() }
    kpcmmm.util.Constants.kpcmmm_kAnd -> { return createkAnd() }
    kpcmmm.util.Constants.kpcmmm_kOr -> { return createkOr() }
    kpcmmm.util.Constants.kpcmmm_kXOr -> { return createkXOr() }
    kpcmmm.util.Constants.kpcmmm_kEnum -> { return createkEnum() }
    kpcmmm.util.Constants.kpcmmm_kVariabilityConceptRef -> { return createkVariabilityConceptRef() }
    kpcmmm.util.Constants.kpcmmm_kInteger -> { return createkInteger() }
    kpcmmm.util.Constants.kpcmmm_kDouble -> { return createkDouble() }
    kpcmmm.util.Constants.pcmmm_Header -> { return createHeader() }
            else -> {return null;}
}
}


    override fun select(query: String): List<org.kevoree.modeling.api.KMFContainer> {
        //TODO
        return java.util.ArrayList<org.kevoree.modeling.api.KMFContainer>();
    }
    override fun root(elem : org.kevoree.modeling.api.KMFContainer){
    (elem as kpcmmm.container.KMFContainerImpl).is_root = true
    (elem as kpcmmm.container.KMFContainerImpl).path_cache = "/"
    }
    
    override fun createJSONSerializer(): org.kevoree.modeling.api.json.JSONModelSerializer {
        return org.kevoree.modeling.api.json.JSONModelSerializer()
    }
    override fun createJSONLoader(): org.kevoree.modeling.api.json.JSONModelLoader {
        return org.kevoree.modeling.api.json.JSONModelLoader(this)
    }
    override fun createXMISerializer(): org.kevoree.modeling.api.xmi.XMIModelSerializer {
        return org.kevoree.modeling.api.xmi.XMIModelSerializer()
    }
    override fun createXMILoader(): org.kevoree.modeling.api.xmi.XMIModelLoader {
        return org.kevoree.modeling.api.xmi.XMIModelLoader(this)
    }
    override fun createModelCompare(): org.kevoree.modeling.api.compare.ModelCompare {
        return org.kevoree.modeling.api.compare.ModelCompare(this)
    }

    override fun createModelCloner() : org.kevoree.modeling.api.ModelCloner {
        return org.kevoree.modeling.api.ModelCloner(this)
    }

    override fun createModelPruner() : org.kevoree.modeling.api.ModelPruner {
        return org.kevoree.modeling.api.ModelPruner(this)
    }

}