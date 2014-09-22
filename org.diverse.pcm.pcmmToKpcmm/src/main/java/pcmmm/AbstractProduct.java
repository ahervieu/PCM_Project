/**
 */
package pcmmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AbstractProduct#getMyValuedCells <em>My Valued Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @see PcmmmPackage#getAbstractProduct()
 * @model abstract="true"
 * @generated
 */
public interface AbstractProduct extends VariabilityConcept {
	/**
	 * Returns the value of the '<em><b>My Valued Cells</b></em>' reference list.
	 * The list contents are of type {@link ValuedCell}.
	 * It is bidirectional and its opposite is '{@link ValuedCell#getMyHeaderProducts <em>My Header Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Valued Cells</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Valued Cells</em>' reference list.
	 * @see PcmmmPackage#getAbstractProduct_MyValuedCells()
	 * @see ValuedCell#getMyHeaderProducts
	 * @model opposite="myHeaderProducts"
	 * @generated
	 */
	EList<ValuedCell> getMyValuedCells();

} // AbstractProduct
