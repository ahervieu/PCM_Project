/**
 */
package pcmmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PCM#getTitle <em>Title</em>}</li>
 *   <li>{@link PCM#getDescription <em>Description</em>}</li>
 *   <li>{@link PCM#getMatrices <em>Matrices</em>}</li>
 *   <li>{@link PCM#getName <em>Name</em>}</li>
 *   <li>{@link PCM#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link PCM#getDomainCollection <em>Domain Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see PcmmmPackage#getPCM()
 * @model
 * @generated
 */
public interface PCM extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see PcmmmPackage#getPCM_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link PCM#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute list.
	 * The list contents are of type {@link String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute list.
	 * @see PcmmmPackage#getPCM_Description()
	 * @model
	 * @generated
	 */
	EList<String> getDescription();

	/**
	 * Returns the value of the '<em><b>Matrices</b></em>' containment reference list.
	 * The list contents are of type {@link Matrix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrices</em>' containment reference list.
	 * @see PcmmmPackage#getPCM_Matrices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Matrix> getMatrices();

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
	 * @see PcmmmPackage#getPCM_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PCM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Concepts</b></em>' containment reference list.
	 * The list contents are of type {@link VariabilityConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concepts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concepts</em>' containment reference list.
	 * @see PcmmmPackage#getPCM_Concepts()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariabilityConcept> getConcepts();

	/**
	 * Returns the value of the '<em><b>Domain Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Collection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Collection</em>' containment reference.
	 * @see #setDomainCollection(pcmmm.DomainCollection)
	 * @see PcmmmPackage#getPCM_DomainCollection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DomainCollection getDomainCollection();

	/**
	 * Sets the value of the '{@link PCM#getDomainCollection <em>Domain Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Collection</em>' containment reference.
	 * @see #getDomainCollection()
	 * @generated
	 */
	void setDomainCollection(DomainCollection value);

} // PCM
