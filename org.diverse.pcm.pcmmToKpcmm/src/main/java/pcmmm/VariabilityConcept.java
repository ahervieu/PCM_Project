/**
 */
package pcmmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variability Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VariabilityConcept#getName <em>Name</em>}</li>
 *   <li>{@link VariabilityConcept#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see PcmmmPackage#getVariabilityConcept()
 * @model abstract="true"
 * @generated
 */
public interface VariabilityConcept extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PcmmmPackage#getVariabilityConcept_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link VariabilityConcept#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference list.
	 * The list contents are of type {@link ValuedCell}.
	 * It is bidirectional and its opposite is '{@link ValuedCell#getConcepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference list.
	 * @see PcmmmPackage#getVariabilityConcept_Constraints()
	 * @see ValuedCell#getConcepts
	 * @model opposite="concepts"
	 * @generated
	 */
	EList<ValuedCell> getConstraints();

} // VariabilityConcept
