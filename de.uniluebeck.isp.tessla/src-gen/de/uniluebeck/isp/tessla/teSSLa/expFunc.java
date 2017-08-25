/**
 * generated by Xtext 2.12.0
 */
package de.uniluebeck.isp.tessla.teSSLa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>exp Func</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uniluebeck.isp.tessla.teSSLa.expFunc#getName <em>Name</em>}</li>
 *   <li>{@link de.uniluebeck.isp.tessla.teSSLa.expFunc#getParams <em>Params</em>}</li>
 *   <li>{@link de.uniluebeck.isp.tessla.teSSLa.expFunc#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getexpFunc()
 * @model
 * @generated
 */
public interface expFunc extends EObject
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
   * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getexpFunc_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniluebeck.isp.tessla.teSSLa.expFunc#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link de.uniluebeck.isp.tessla.teSSLa.expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getexpFunc_Params()
   * @model containment="true"
   * @generated
   */
  EList<expression> getParams();

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
   * @see de.uniluebeck.isp.tessla.teSSLa.TeSSLaPackage#getexpFunc_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.uniluebeck.isp.tessla.teSSLa.expFunc#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // expFunc