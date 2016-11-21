/**
 * generated by Xtext 2.10.0
 */
package emn.fil.a3.seleniumScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prop Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emn.fil.a3.seleniumScript.PropSelector#getName <em>Name</em>}</li>
 *   <li>{@link emn.fil.a3.seleniumScript.PropSelector#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see emn.fil.a3.seleniumScript.SeleniumScriptPackage#getPropSelector()
 * @model
 * @generated
 */
public interface PropSelector extends EObject
{
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
   * @see emn.fil.a3.seleniumScript.SeleniumScriptPackage#getPropSelector_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link emn.fil.a3.seleniumScript.PropSelector#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(Primary)
   * @see emn.fil.a3.seleniumScript.SeleniumScriptPackage#getPropSelector_Param()
   * @model containment="true"
   * @generated
   */
  Primary getParam();

  /**
   * Sets the value of the '{@link emn.fil.a3.seleniumScript.PropSelector#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
  void setParam(Primary value);

} // PropSelector
