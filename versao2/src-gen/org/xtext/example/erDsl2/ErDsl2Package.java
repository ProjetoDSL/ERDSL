/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.erDsl2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.erDsl2.ErDsl2Factory
 * @model kind="package"
 * @generated
 */
public interface ErDsl2Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "erDsl2";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/ErDsl2";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "erDsl2";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ErDsl2Package eINSTANCE = org.xtext.example.erDsl2.impl.ErDsl2PackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.erDsl2.impl.ERModelImpl <em>ER Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.erDsl2.impl.ERModelImpl
   * @see org.xtext.example.erDsl2.impl.ErDsl2PackageImpl#getERModel()
   * @generated
   */
  int ER_MODEL = 0;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ER_MODEL__DOMAIN = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ER_MODEL__ENTITIES = 1;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ER_MODEL__RELATIONS = 2;

  /**
   * The number of structural features of the '<em>ER Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ER_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.erDsl2.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.erDsl2.impl.DomainImpl
   * @see org.xtext.example.erDsl2.impl.ErDsl2PackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__NAME = 0;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.erDsl2.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.erDsl2.impl.AttributeImpl
   * @see org.xtext.example.erDsl2.impl.ErDsl2PackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Is Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__IS_KEY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.erDsl2.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.erDsl2.impl.EntityImpl
   * @see org.xtext.example.erDsl2.impl.ErDsl2PackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Is A</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__IS_A = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.erDsl2.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.erDsl2.impl.RelationImpl
   * @see org.xtext.example.erDsl2.impl.ErDsl2PackageImpl#getRelation()
   * @generated
   */
  int RELATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Left Ending</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__LEFT_ENDING = 1;

  /**
   * The feature id for the '<em><b>Right Ending</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__RIGHT_ENDING = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__ATTRIBUTES = 3;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.erDsl2.impl.RelationSideImpl <em>Relation Side</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.erDsl2.impl.RelationSideImpl
   * @see org.xtext.example.erDsl2.impl.ErDsl2PackageImpl#getRelationSide()
   * @generated
   */
  int RELATION_SIDE = 5;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_SIDE__CARDINALITY = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_SIDE__TARGET = 1;

  /**
   * The number of structural features of the '<em>Relation Side</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_SIDE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.erDsl2.DataType <em>Data Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.erDsl2.DataType
   * @see org.xtext.example.erDsl2.impl.ErDsl2PackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 6;


  /**
   * Returns the meta object for class '{@link org.xtext.example.erDsl2.ERModel <em>ER Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ER Model</em>'.
   * @see org.xtext.example.erDsl2.ERModel
   * @generated
   */
  EClass getERModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.erDsl2.ERModel#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see org.xtext.example.erDsl2.ERModel#getDomain()
   * @see #getERModel()
   * @generated
   */
  EReference getERModel_Domain();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.erDsl2.ERModel#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see org.xtext.example.erDsl2.ERModel#getEntities()
   * @see #getERModel()
   * @generated
   */
  EReference getERModel_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.erDsl2.ERModel#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relations</em>'.
   * @see org.xtext.example.erDsl2.ERModel#getRelations()
   * @see #getERModel()
   * @generated
   */
  EReference getERModel_Relations();

  /**
   * Returns the meta object for class '{@link org.xtext.example.erDsl2.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see org.xtext.example.erDsl2.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.erDsl2.Domain#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.erDsl2.Domain#getName()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.erDsl2.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.example.erDsl2.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.erDsl2.Attribute#isIsKey <em>Is Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Key</em>'.
   * @see org.xtext.example.erDsl2.Attribute#isIsKey()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_IsKey();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.erDsl2.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.erDsl2.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.erDsl2.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.erDsl2.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.erDsl2.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.xtext.example.erDsl2.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.erDsl2.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.erDsl2.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.erDsl2.Entity#getIsA <em>Is A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Is A</em>'.
   * @see org.xtext.example.erDsl2.Entity#getIsA()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_IsA();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.erDsl2.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.example.erDsl2.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.erDsl2.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see org.xtext.example.erDsl2.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.erDsl2.Relation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.erDsl2.Relation#getName()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.erDsl2.Relation#getLeftEnding <em>Left Ending</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Ending</em>'.
   * @see org.xtext.example.erDsl2.Relation#getLeftEnding()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_LeftEnding();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.erDsl2.Relation#getRightEnding <em>Right Ending</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Ending</em>'.
   * @see org.xtext.example.erDsl2.Relation#getRightEnding()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_RightEnding();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.erDsl2.Relation#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.example.erDsl2.Relation#getAttributes()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Attributes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.erDsl2.RelationSide <em>Relation Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Side</em>'.
   * @see org.xtext.example.erDsl2.RelationSide
   * @generated
   */
  EClass getRelationSide();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.erDsl2.RelationSide#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see org.xtext.example.erDsl2.RelationSide#getCardinality()
   * @see #getRelationSide()
   * @generated
   */
  EAttribute getRelationSide_Cardinality();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.erDsl2.RelationSide#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.xtext.example.erDsl2.RelationSide#getTarget()
   * @see #getRelationSide()
   * @generated
   */
  EReference getRelationSide_Target();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.erDsl2.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Data Type</em>'.
   * @see org.xtext.example.erDsl2.DataType
   * @generated
   */
  EEnum getDataType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ErDsl2Factory getErDsl2Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.erDsl2.impl.ERModelImpl <em>ER Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.erDsl2.impl.ERModelImpl
     * @see org.xtext.example.erDsl2.impl.ErDsl2PackageImpl#getERModel()
     * @generated
     */
    EClass ER_MODEL = eINSTANCE.getERModel();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ER_MODEL__DOMAIN = eINSTANCE.getERModel_Domain();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ER_MODEL__ENTITIES = eINSTANCE.getERModel_Entities();

    /**
     * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ER_MODEL__RELATIONS = eINSTANCE.getERModel_Relations();

    /**
     * The meta object literal for the '{@link org.xtext.example.erDsl2.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.erDsl2.impl.DomainImpl
     * @see org.xtext.example.erDsl2.impl.ErDsl2PackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.erDsl2.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.erDsl2.impl.AttributeImpl
     * @see org.xtext.example.erDsl2.impl.ErDsl2PackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Is Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__IS_KEY = eINSTANCE.getAttribute_IsKey();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.erDsl2.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.erDsl2.impl.EntityImpl
     * @see org.xtext.example.erDsl2.impl.ErDsl2PackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Is A</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__IS_A = eINSTANCE.getEntity_IsA();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '{@link org.xtext.example.erDsl2.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.erDsl2.impl.RelationImpl
     * @see org.xtext.example.erDsl2.impl.ErDsl2PackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

    /**
     * The meta object literal for the '<em><b>Left Ending</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__LEFT_ENDING = eINSTANCE.getRelation_LeftEnding();

    /**
     * The meta object literal for the '<em><b>Right Ending</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__RIGHT_ENDING = eINSTANCE.getRelation_RightEnding();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__ATTRIBUTES = eINSTANCE.getRelation_Attributes();

    /**
     * The meta object literal for the '{@link org.xtext.example.erDsl2.impl.RelationSideImpl <em>Relation Side</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.erDsl2.impl.RelationSideImpl
     * @see org.xtext.example.erDsl2.impl.ErDsl2PackageImpl#getRelationSide()
     * @generated
     */
    EClass RELATION_SIDE = eINSTANCE.getRelationSide();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION_SIDE__CARDINALITY = eINSTANCE.getRelationSide_Cardinality();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_SIDE__TARGET = eINSTANCE.getRelationSide_Target();

    /**
     * The meta object literal for the '{@link org.xtext.example.erDsl2.DataType <em>Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.erDsl2.DataType
     * @see org.xtext.example.erDsl2.impl.ErDsl2PackageImpl#getDataType()
     * @generated
     */
    EEnum DATA_TYPE = eINSTANCE.getDataType();

  }

} //ErDsl2Package
