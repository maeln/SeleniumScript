/**
 * generated by Xtext 2.10.0
 */
package emn.fil.a3.seleniumScript.impl;

import emn.fil.a3.seleniumScript.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeleniumScriptFactoryImpl extends EFactoryImpl implements SeleniumScriptFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SeleniumScriptFactory init()
  {
    try
    {
      SeleniumScriptFactory theSeleniumScriptFactory = (SeleniumScriptFactory)EPackage.Registry.INSTANCE.getEFactory(SeleniumScriptPackage.eNS_URI);
      if (theSeleniumScriptFactory != null)
      {
        return theSeleniumScriptFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SeleniumScriptFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumScriptFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SeleniumScriptPackage.SCRIPT: return createScript();
      case SeleniumScriptPackage.FUNCTION: return createFunction();
      case SeleniumScriptPackage.EXPRESSION: return createExpression();
      case SeleniumScriptPackage.SELECTORS: return createSelectors();
      case SeleniumScriptPackage.SELECTOR: return createSelector();
      case SeleniumScriptPackage.PROP_SELECTOR: return createPropSelector();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selectors createSelectors()
  {
    SelectorsImpl selectors = new SelectorsImpl();
    return selectors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selector createSelector()
  {
    SelectorImpl selector = new SelectorImpl();
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropSelector createPropSelector()
  {
    PropSelectorImpl propSelector = new PropSelectorImpl();
    return propSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumScriptPackage getSeleniumScriptPackage()
  {
    return (SeleniumScriptPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SeleniumScriptPackage getPackage()
  {
    return SeleniumScriptPackage.eINSTANCE;
  }

} //SeleniumScriptFactoryImpl
