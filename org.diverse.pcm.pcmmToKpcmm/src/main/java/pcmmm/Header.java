/**
 */
package pcmmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Header#getConcept <em>Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @see PcmmmPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends Cell {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' reference.
	 * @see #setConcept(pcmmm.VariabilityConcept)
	 * @see PcmmmPackage#getHeader_Concept()
	 * @model required="true"
	 * @generated
	 */
	VariabilityConcept getConcept();

	/**
	 * Sets the value of the '{@link Header#getConcept <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(VariabilityConcept value);

} // Header
