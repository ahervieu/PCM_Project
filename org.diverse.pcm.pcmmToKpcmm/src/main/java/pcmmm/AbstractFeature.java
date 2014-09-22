/**
 */
package pcmmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AbstractFeature#getMyValuedCells <em>My Valued Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @see PcmmmPackage#getAbstractFeature()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFeature extends VariabilityConcept {
	/**
	 * Returns the value of the '<em><b>My Valued Cells</b></em>' reference list.
	 * The list contents are of type {@link ValuedCell}.
	 * It is bidirectional and its opposite is '{@link ValuedCell#getMyHeaderFeatures <em>My Header Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Valued Cells</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Valued Cells</em>' reference list.
	 * @see PcmmmPackage#getAbstractFeature_MyValuedCells()
	 * @see ValuedCell#getMyHeaderFeatures
	 * @model opposite="myHeaderFeatures"
	 * @generated
	 */
	EList<ValuedCell> getMyValuedCells();

} // AbstractFeature
