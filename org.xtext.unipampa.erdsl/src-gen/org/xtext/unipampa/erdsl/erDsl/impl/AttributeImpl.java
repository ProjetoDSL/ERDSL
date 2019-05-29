/**
 * generated by Xtext 2.17.1
 */
package org.xtext.unipampa.erdsl.erDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.unipampa.erdsl.erDsl.Attribute;
import org.xtext.unipampa.erdsl.erDsl.DataType;
import org.xtext.unipampa.erdsl.erDsl.ErDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.unipampa.erdsl.erDsl.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.unipampa.erdsl.erDsl.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.unipampa.erdsl.erDsl.impl.AttributeImpl#isIsKey <em>Is Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final DataType TYPE_EDEFAULT = DataType.INT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DataType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsKey() <em>Is Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsKey()
   * @generated
   * @ordered
   */
  protected static final boolean IS_KEY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsKey() <em>Is Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsKey()
   * @generated
   * @ordered
   */
  protected boolean isKey = IS_KEY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return ErDslPackage.Literals.ATTRIBUTE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ErDslPackage.ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(DataType newType)
  {
    DataType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErDslPackage.ATTRIBUTE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIsKey()
  {
    return isKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIsKey(boolean newIsKey)
  {
    boolean oldIsKey = isKey;
    isKey = newIsKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErDslPackage.ATTRIBUTE__IS_KEY, oldIsKey, isKey));
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
      case ErDslPackage.ATTRIBUTE__NAME:
        return getName();
      case ErDslPackage.ATTRIBUTE__TYPE:
        return getType();
      case ErDslPackage.ATTRIBUTE__IS_KEY:
        return isIsKey();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ErDslPackage.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case ErDslPackage.ATTRIBUTE__TYPE:
        setType((DataType)newValue);
        return;
      case ErDslPackage.ATTRIBUTE__IS_KEY:
        setIsKey((Boolean)newValue);
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
      case ErDslPackage.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ErDslPackage.ATTRIBUTE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ErDslPackage.ATTRIBUTE__IS_KEY:
        setIsKey(IS_KEY_EDEFAULT);
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
      case ErDslPackage.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ErDslPackage.ATTRIBUTE__TYPE:
        return type != TYPE_EDEFAULT;
      case ErDslPackage.ATTRIBUTE__IS_KEY:
        return isKey != IS_KEY_EDEFAULT;
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
    result.append(", type: ");
    result.append(type);
    result.append(", isKey: ");
    result.append(isKey);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
