/**
 * generated by Xtext 2.12.0
 */
package de.uniluebeck.isp.tessla.teSSLa.impl;

import de.uniluebeck.isp.tessla.teSSLa.*;

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
public class TeSSLaFactoryImpl extends EFactoryImpl implements TeSSLaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TeSSLaFactory init()
  {
    try
    {
      TeSSLaFactory theTeSSLaFactory = (TeSSLaFactory)EPackage.Registry.INSTANCE.getEFactory(TeSSLaPackage.eNS_URI);
      if (theTeSSLaFactory != null)
      {
        return theTeSSLaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TeSSLaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TeSSLaFactoryImpl()
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
      case TeSSLaPackage.MODEL: return createModel();
      case TeSSLaPackage.STATEMENT: return createstatement();
      case TeSSLaPackage.DEFINITION: return createdefinition();
      case TeSSLaPackage.PARAM_LIST: return createparamList();
      case TeSSLaPackage.OUT: return createout();
      case TeSSLaPackage.IN: return createin();
      case TeSSLaPackage.EXPRESSION: return createexpression();
      case TeSSLaPackage.EXP_INFIX: return createexpInfix();
      case TeSSLaPackage.EXP_UNARY: return createexpUnary();
      case TeSSLaPackage.EXP_FUNC: return createexpFunc();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement createstatement()
  {
    statementImpl statement = new statementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public definition createdefinition()
  {
    definitionImpl definition = new definitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public paramList createparamList()
  {
    paramListImpl paramList = new paramListImpl();
    return paramList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public out createout()
  {
    outImpl out = new outImpl();
    return out;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public in createin()
  {
    inImpl in = new inImpl();
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression createexpression()
  {
    expressionImpl expression = new expressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expInfix createexpInfix()
  {
    expInfixImpl expInfix = new expInfixImpl();
    return expInfix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expUnary createexpUnary()
  {
    expUnaryImpl expUnary = new expUnaryImpl();
    return expUnary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expFunc createexpFunc()
  {
    expFuncImpl expFunc = new expFuncImpl();
    return expFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TeSSLaPackage getTeSSLaPackage()
  {
    return (TeSSLaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TeSSLaPackage getPackage()
  {
    return TeSSLaPackage.eINSTANCE;
  }

} //TeSSLaFactoryImpl