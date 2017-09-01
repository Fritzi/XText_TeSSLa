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
      case TeSSLaPackage.STATEMENT: return createStatement();
      case TeSSLaPackage.DEFINITION: return createdefinition();
      case TeSSLaPackage.PARAM_LIST: return createparamList();
      case TeSSLaPackage.OUT: return createout();
      case TeSSLaPackage.IN: return createin();
      case TeSSLaPackage.TYPED_EXPRESSION: return createtypedExpression();
      case TeSSLaPackage.EXPRESSION: return createexpression();
      case TeSSLaPackage.VALUE: return createvalue();
      case TeSSLaPackage.ARG: return createarg();
      case TeSSLaPackage.IF_STATEMENT: return createIfStatement();
      case TeSSLaPackage.OPERATION: return createOperation();
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
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
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
  public typedExpression createtypedExpression()
  {
    typedExpressionImpl typedExpression = new typedExpressionImpl();
    return typedExpression;
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
  public value createvalue()
  {
    valueImpl value = new valueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arg createarg()
  {
    argImpl arg = new argImpl();
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
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
