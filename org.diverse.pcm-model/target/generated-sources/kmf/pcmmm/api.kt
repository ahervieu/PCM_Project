package pcmmm

trait Header : org.kevoree.modeling.api.KMFContainer , kpcmmm.kCell {
open var concept : kpcmmm.kVariabilityConcept?
public fun withConcept(ref : kpcmmm.kVariabilityConcept) : Header
}
