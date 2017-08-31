/**
 * generated by Xtext 2.12.0
 */
package de.uniluebeck.isp.tessla.teSSLa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage
 * @generated
 */
public interface TeSSLaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TeSSLaFactory eINSTANCE = de.uniluebeck.isp.tessla.teSSLa.impl.TeSSLaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>statement</em>'.
   * @generated
   */
  statement createstatement();

  /**
   * Returns a new object of class '<em>definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>definition</em>'.
   * @generated
   */
  definition createdefinition();

  /**
   * Returns a new object of class '<em>param List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>param List</em>'.
   * @generated
   */
  paramList createparamList();

  /**
   * Returns a new object of class '<em>out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>out</em>'.
   * @generated
   */
  out createout();

  /**
   * Returns a new object of class '<em>in</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>in</em>'.
   * @generated
   */
  in createin();

  /**
   * Returns a new object of class '<em>typed Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>typed Expression</em>'.
   * @generated
   */
  typedExpression createtypedExpression();

  /**
   * Returns a new object of class '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression</em>'.
   * @generated
   */
  expression createexpression();

  /**
   * Returns a new object of class '<em>value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>value</em>'.
   * @generated
   */
  value createvalue();

  /**
   * Returns a new object of class '<em>arg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>arg</em>'.
   * @generated
   */
  arg createarg();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TeSSLaPackage getTeSSLaPackage();

} //TeSSLaFactory
