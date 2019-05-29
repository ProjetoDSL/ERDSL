/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.erDsl2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.erDsl2.Attribute;
import org.xtext.example.erDsl2.ErDsl2Package;
import org.xtext.example.erDsl2.Relation;
import org.xtext.example.erDsl2.RelationSide;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.erDsl2.impl.RelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.erDsl2.impl.RelationImpl#getLeftEnding <em>Left Ending</em>}</li>
 *   <li>{@link org.xtext.example.erDsl2.impl.RelationImpl#getRightEnding <em>Right Ending</em>}</li>
 *   <li>{@link org.xtext.example.erDsl2.impl.RelationImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeftEnding() <em>Left Ending</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftEnding()
   * @generated
   * @ordered
   */
  protected RelationSide leftEnding;

  /**
   * The cached value of the '{@link #getRightEnding() <em>Right Ending</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightEnding()
   * @generated
   * @ordered
   */
  protected RelationSide rightEnding;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ErDsl2Package.Literals.RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErDsl2Package.RELATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelationSide getLeftEnding()
  {
    return leftEnding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftEnding(RelationSide newLeftEnding, NotificationChain msgs)
  {
    RelationSide oldLeftEnding = leftEnding;
    leftEnding = newLeftEnding;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErDsl2Package.RELATION__LEFT_ENDING, oldLeftEnding, newLeftEnding);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeftEnding(RelationSide newLeftEnding)
  {
    if (newLeftEnding != leftEnding)
    {
      NotificationChain msgs = null;
      if (leftEnding != null)
        msgs = ((InternalEObject)leftEnding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErDsl2Package.RELATION__LEFT_ENDING, null, msgs);
      if (newLeftEnding != null)
        msgs = ((InternalEObject)newLeftEnding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErDsl2Package.RELATION__LEFT_ENDING, null, msgs);
      msgs = basicSetLeftEnding(newLeftEnding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErDsl2Package.RELATION__LEFT_ENDING, newLeftEnding, newLeftEnding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelationSide getRightEnding()
  {
    return rightEnding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightEnding(RelationSide newRightEnding, NotificationChain msgs)
  {
    RelationSide oldRightEnding = rightEnding;
    rightEnding = newRightEnding;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErDsl2Package.RELATION__RIGHT_ENDING, oldRightEnding, newRightEnding);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRightEnding(RelationSide newRightEnding)
  {
    if (newRightEnding != rightEnding)
    {
      NotificationChain msgs = null;
      if (rightEnding != null)
        msgs = ((InternalEObject)rightEnding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErDsl2Package.RELATION__RIGHT_ENDING, null, msgs);
      if (newRightEnding != null)
        msgs = ((InternalEObject)newRightEnding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErDsl2Package.RELATION__RIGHT_ENDING, null, msgs);
      msgs = basicSetRightEnding(newRightEnding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErDsl2Package.RELATION__RIGHT_ENDING, newRightEnding, newRightEnding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ErDsl2Package.RELATION__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ErDsl2Package.RELATION__LEFT_ENDING:
        return basicSetLeftEnding(null, msgs);
      case ErDsl2Package.RELATION__RIGHT_ENDING:
        return basicSetRightEnding(null, msgs);
      case ErDsl2Package.RELATION__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ErDsl2Package.RELATION__NAME:
        return getName();
      case ErDsl2Package.RELATION__LEFT_ENDING:
        return getLeftEnding();
      case ErDsl2Package.RELATION__RIGHT_ENDING:
        return getRightEnding();
      case ErDsl2Package.RELATION__ATTRIBUTES:
        return getAttributes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ErDsl2Package.RELATION__NAME:
        setName((String)newValue);
        return;
      case ErDsl2Package.RELATION__LEFT_ENDING:
        setLeftEnding((RelationSide)newValue);
        return;
      case ErDsl2Package.RELATION__RIGHT_ENDING:
        setRightEnding((RelationSide)newValue);
        return;
      case ErDsl2Package.RELATION__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ErDsl2Package.RELATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ErDsl2Package.RELATION__LEFT_ENDING:
        setLeftEnding((RelationSide)null);
        return;
      case ErDsl2Package.RELATION__RIGHT_ENDING:
        setRightEnding((RelationSide)null);
        return;
      case ErDsl2Package.RELATION__ATTRIBUTES:
        getAttributes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ErDsl2Package.RELATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ErDsl2Package.RELATION__LEFT_ENDING:
        return leftEnding != null;
      case ErDsl2Package.RELATION__RIGHT_ENDING:
        return rightEnding != null;
      case ErDsl2Package.RELATION__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RelationImpl
