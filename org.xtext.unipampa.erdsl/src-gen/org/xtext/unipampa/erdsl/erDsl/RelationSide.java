/**
 * generated by Xtext 2.17.1
 */
package org.xtext.unipampa.erdsl.erDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Side</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.unipampa.erdsl.erDsl.RelationSide#isMinimalCardinality <em>Minimal Cardinality</em>}</li>
 *   <li>{@link org.xtext.unipampa.erdsl.erDsl.RelationSide#getMaximumCardinality <em>Maximum Cardinality</em>}</li>
 *   <li>{@link org.xtext.unipampa.erdsl.erDsl.RelationSide#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.xtext.unipampa.erdsl.erDsl.ErDslPackage#getRelationSide()
 * @model
 * @generated
 */
public interface RelationSide extends EObject
{
  /**
   * Returns the value of the '<em><b>Minimal Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minimal Cardinality</em>' attribute.
   * @see #setMinimalCardinality(boolean)
   * @see org.xtext.unipampa.erdsl.erDsl.ErDslPackage#getRelationSide_MinimalCardinality()
   * @model
   * @generated
   */
  boolean isMinimalCardinality();

  /**
   * Sets the value of the '{@link org.xtext.unipampa.erdsl.erDsl.RelationSide#isMinimalCardinality <em>Minimal Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minimal Cardinality</em>' attribute.
   * @see #isMinimalCardinality()
   * @generated
   */
  void setMinimalCardinality(boolean value);

  /**
   * Returns the value of the '<em><b>Maximum Cardinality</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.unipampa.erdsl.erDsl.CardinalityType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maximum Cardinality</em>' attribute.
   * @see org.xtext.unipampa.erdsl.erDsl.CardinalityType
   * @see #setMaximumCardinality(CardinalityType)
   * @see org.xtext.unipampa.erdsl.erDsl.ErDslPackage#getRelationSide_MaximumCardinality()
   * @model
   * @generated
   */
  CardinalityType getMaximumCardinality();

  /**
   * Sets the value of the '{@link org.xtext.unipampa.erdsl.erDsl.RelationSide#getMaximumCardinality <em>Maximum Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maximum Cardinality</em>' attribute.
   * @see org.xtext.unipampa.erdsl.erDsl.CardinalityType
   * @see #getMaximumCardinality()
   * @generated
   */
  void setMaximumCardinality(CardinalityType value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Entity)
   * @see org.xtext.unipampa.erdsl.erDsl.ErDslPackage#getRelationSide_Target()
   * @model
   * @generated
   */
  Entity getTarget();

  /**
   * Sets the value of the '{@link org.xtext.unipampa.erdsl.erDsl.RelationSide#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Entity value);

} // RelationSide
