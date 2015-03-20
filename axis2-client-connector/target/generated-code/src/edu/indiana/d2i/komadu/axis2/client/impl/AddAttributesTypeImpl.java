/*
 * XML Type:  addAttributesType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AddAttributesType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML addAttributesType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class AddAttributesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AddAttributesType
{
    
    public AddAttributesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTTYPE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "objectType");
    private static final javax.xml.namespace.QName OBJECTID$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "objectID");
    private static final javax.xml.namespace.QName ENTITYTYPE$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "entityType");
    private static final javax.xml.namespace.QName ATTRIBUTES$6 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "attributes");
    private static final javax.xml.namespace.QName ADDATTRIBUTETIMESTAMP$8 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "addAttributeTimestamp");
    private static final javax.xml.namespace.QName NOTIFICATIONTIMESTAMP$10 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "notificationTimestamp");
    
    
    /**
     * Gets the "objectType" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ObjectEnumType.Enum getObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (edu.indiana.d2i.komadu.axis2.client.ObjectEnumType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "objectType" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ObjectEnumType xgetObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ObjectEnumType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ObjectEnumType)get_store().find_element_user(OBJECTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "objectType" element
     */
    public void setObjectType(edu.indiana.d2i.komadu.axis2.client.ObjectEnumType.Enum objectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTTYPE$0);
            }
            target.setEnumValue(objectType);
        }
    }
    
    /**
     * Sets (as xml) the "objectType" element
     */
    public void xsetObjectType(edu.indiana.d2i.komadu.axis2.client.ObjectEnumType objectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ObjectEnumType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ObjectEnumType)get_store().find_element_user(OBJECTTYPE$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.ObjectEnumType)get_store().add_element_user(OBJECTTYPE$0);
            }
            target.set(objectType);
        }
    }
    
    /**
     * Gets the "objectID" element
     */
    public java.lang.String getObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "objectID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(OBJECTID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "objectID" element
     */
    public void setObjectID(java.lang.String objectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTID$2);
            }
            target.setStringValue(objectID);
        }
    }
    
    /**
     * Sets (as xml) the "objectID" element
     */
    public void xsetObjectID(org.apache.xmlbeans.XmlAnyURI objectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(OBJECTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(OBJECTID$2);
            }
            target.set(objectID);
        }
    }
    
    /**
     * Gets the "entityType" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityEnumType.Enum getEntityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (edu.indiana.d2i.komadu.axis2.client.EntityEnumType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "entityType" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityEnumType xgetEntityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityEnumType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityEnumType)get_store().find_element_user(ENTITYTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "entityType" element
     */
    public boolean isSetEntityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "entityType" element
     */
    public void setEntityType(edu.indiana.d2i.komadu.axis2.client.EntityEnumType.Enum entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYTYPE$4);
            }
            target.setEnumValue(entityType);
        }
    }
    
    /**
     * Sets (as xml) the "entityType" element
     */
    public void xsetEntityType(edu.indiana.d2i.komadu.axis2.client.EntityEnumType entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityEnumType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityEnumType)get_store().find_element_user(ENTITYTYPE$4, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.EntityEnumType)get_store().add_element_user(ENTITYTYPE$4);
            }
            target.set(entityType);
        }
    }
    
    /**
     * Unsets the "entityType" element
     */
    public void unsetEntityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "attributes" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AttributesType getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "attributes" element
     */
    public void setAttributes(edu.indiana.d2i.komadu.axis2.client.AttributesType attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTES$6, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTES$6);
            }
            target.set(attributes);
        }
    }
    
    /**
     * Appends and returns a new empty "attributes" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AttributesType addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTES$6);
            return target;
        }
    }
    
    /**
     * Gets the "addAttributeTimestamp" element
     */
    public java.util.Calendar getAddAttributeTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDATTRIBUTETIMESTAMP$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "addAttributeTimestamp" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetAddAttributeTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ADDATTRIBUTETIMESTAMP$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "addAttributeTimestamp" element
     */
    public boolean isSetAddAttributeTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDATTRIBUTETIMESTAMP$8) != 0;
        }
    }
    
    /**
     * Sets the "addAttributeTimestamp" element
     */
    public void setAddAttributeTimestamp(java.util.Calendar addAttributeTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDATTRIBUTETIMESTAMP$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDATTRIBUTETIMESTAMP$8);
            }
            target.setCalendarValue(addAttributeTimestamp);
        }
    }
    
    /**
     * Sets (as xml) the "addAttributeTimestamp" element
     */
    public void xsetAddAttributeTimestamp(org.apache.xmlbeans.XmlDateTime addAttributeTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ADDATTRIBUTETIMESTAMP$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ADDATTRIBUTETIMESTAMP$8);
            }
            target.set(addAttributeTimestamp);
        }
    }
    
    /**
     * Unsets the "addAttributeTimestamp" element
     */
    public void unsetAddAttributeTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDATTRIBUTETIMESTAMP$8, 0);
        }
    }
    
    /**
     * Gets the "notificationTimestamp" element
     */
    public java.util.Calendar getNotificationTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONTIMESTAMP$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "notificationTimestamp" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetNotificationTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(NOTIFICATIONTIMESTAMP$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "notificationTimestamp" element
     */
    public void setNotificationTimestamp(java.util.Calendar notificationTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONTIMESTAMP$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTIFICATIONTIMESTAMP$10);
            }
            target.setCalendarValue(notificationTimestamp);
        }
    }
    
    /**
     * Sets (as xml) the "notificationTimestamp" element
     */
    public void xsetNotificationTimestamp(org.apache.xmlbeans.XmlDateTime notificationTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(NOTIFICATIONTIMESTAMP$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(NOTIFICATIONTIMESTAMP$10);
            }
            target.set(notificationTimestamp);
        }
    }
}
