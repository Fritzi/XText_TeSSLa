/**
 * generated by Xtext 2.12.0
 */
package de.uniluebeck.isp.tessla.teSSLa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uniluebeck.isp.tessla.teSSLa.value#getOp <em>Op</em>}</li>
 *   <li>{@link de.uniluebeck.isp.tessla.teSSLa.value#getExp <em>Exp</em>}</li>
 *   <li>{@link de.uniluebeck.isp.tessla.teSSLa.value#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.uniluebeck.isp.tessla.teSSLa.value#getName <em>Name</em>}</li>
 *   <li>{@link de.uniluebeck.isp.tessla.teSSLa.value#getArgs <em>Args</em>}</li>
 *   <li>{@link de.uniluebeck.isp.tessla.teSSLa.value#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getvalue()
 * @model
 * @generated
 */
public interface value extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getvalue_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link de.uniluebeck.isp.tessla.teSSLa.value#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(typedExpression)
   * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getvalue_Exp()
   * @model containment="true"
   * @generated
   */
  typedExpression getExp();

  /**
   * Sets the value of the '{@link de.uniluebeck.isp.tessla.teSSLa.value#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(typedExpression value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link de.uniluebeck.isp.tessla.teSSLa.statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getvalue_Statements()
   * @model containment="true"
   * @generated
   */
  EList<statement> getStatements();

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
   * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getvalue_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniluebeck.isp.tessla.teSSLa.value#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link de.uniluebeck.isp.tessla.teSSLa.arg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getvalue_Args()
   * @model containment="true"
   * @generated
   */
  EList<arg> getArgs();

  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(int)
   * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getvalue_Val()
   * @model
   * @generated
   */
  int getVal();

  /**
   * Sets the value of the '{@link de.uniluebeck.isp.tessla.teSSLa.value#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(int value);

} // value
