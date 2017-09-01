/**
 * generated by Xtext 2.12.0
 */
package de.uniluebeck.isp.tessla.teSSLa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uniluebeck.isp.tessla.teSSLa.definition#getName <em>Name</em>}</li>
 *   <li>{@link de.uniluebeck.isp.tessla.teSSLa.definition#getParamList <em>Param List</em>}</li>
 *   <li>{@link de.uniluebeck.isp.tessla.teSSLa.definition#getType <em>Type</em>}</li>
 *   <li>{@link de.uniluebeck.isp.tessla.teSSLa.definition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getdefinition()
 * @model
 * @generated
 */
public interface definition extends EObject
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
   * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getdefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniluebeck.isp.tessla.teSSLa.definition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Param List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param List</em>' containment reference.
   * @see #setParamList(paramList)
   * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getdefinition_ParamList()
   * @model containment="true"
   * @generated
   */
  paramList getParamList();

  /**
   * Sets the value of the '{@link de.uniluebeck.isp.tessla.teSSLa.definition#getParamList <em>Param List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param List</em>' containment reference.
   * @see #getParamList()
   * @generated
   */
  void setParamList(paramList value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getdefinition_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.uniluebeck.isp.tessla.teSSLa.definition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(typedExpression)
   * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getdefinition_Expression()
   * @model containment="true"
   * @generated
   */
  typedExpression getExpression();

  /**
   * Sets the value of the '{@link de.uniluebeck.isp.tessla.teSSLa.definition#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(typedExpression value);

} // definition
