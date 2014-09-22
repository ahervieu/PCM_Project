/**
 */
package pcmmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valued Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ValuedCell#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link ValuedCell#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link ValuedCell#getMyHeaderProducts <em>My Header Products</em>}</li>
 *   <li>{@link ValuedCell#getMyHeaderFeatures <em>My Header Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see PcmmmPackage#getValuedCell()
 * @model
 * @generated
 */
public interface ValuedCell extends Cell {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' containment reference.
	 * @see #setInterpretation(pcmmm.Constraint)
	 * @see PcmmmPackage#getValuedCell_Interpretation()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getInterpretation();

	/**
	 * Sets the value of the '{@link ValuedCell#getInterpretation <em>Interpretation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' containment reference.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(Constraint value);

	/**
	 * Returns the value of the '<em><b>Concepts</b></em>' reference list.
	 * The list contents are of type {@link VariabilityConcept}.
	 * It is bidirectional and its opposite is '{@link VariabilityConcept#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concepts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concepts</em>' reference list.
	 * @see PcmmmPackage#getValuedCell_Concepts()
	 * @see VariabilityConcept#getConstraints
	 * @model opposite="constraints"
	 * @generated
	 */
	EList<VariabilityConcept> getConcepts();

	/**
	 * Returns the value of the '<em><b>My Header Products</b></em>' reference list.
	 * The list contents are of type {@link AbstractProduct}.
	 * It is bidirectional and its opposite is '{@link AbstractProduct#getMyValuedCells <em>My Valued Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Header Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Header Products</em>' reference list.
	 * @see PcmmmPackage#getValuedCell_MyHeaderProducts()
	 * @see AbstractProduct#getMyValuedCells
	 * @model opposite="myValuedCells" required="true"
	 * @generated
	 */
	EList<AbstractProduct> getMyHeaderProducts();

	/**
	 * Returns the value of the '<em><b>My Header Features</b></em>' reference list.
	 * The list contents are of type {@link AbstractFeature}.
	 * It is bidirectional and its opposite is '{@link AbstractFeature#getMyValuedCells <em>My Valued Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Header Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Header Features</em>' reference list.
	 * @see PcmmmPackage#getValuedCell_MyHeaderFeatures()
	 * @see AbstractFeature#getMyValuedCells
	 * @model opposite="myValuedCells" required="true"
	 * @generated
	 */
	EList<AbstractFeature> getMyHeaderFeatures();

} // ValuedCell
