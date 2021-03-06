/**
 * generated by Xtext 2.10.0
 */
package emn.fil.a3.seleniumScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selectors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emn.fil.a3.seleniumScript.Selectors#getSelectors <em>Selectors</em>}</li>
 * </ul>
 *
 * @see emn.fil.a3.seleniumScript.SeleniumScriptPackage#getSelectors()
 * @model
 * @generated
 */
public interface Selectors extends Expression
{
  /**
   * Returns the value of the '<em><b>Selectors</b></em>' containment reference list.
   * The list contents are of type {@link emn.fil.a3.seleniumScript.Selector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selectors</em>' containment reference list.
   * @see emn.fil.a3.seleniumScript.SeleniumScriptPackage#getSelectors_Selectors()
   * @model containment="true"
   * @generated
   */
  EList<Selector> getSelectors();

} // Selectors
