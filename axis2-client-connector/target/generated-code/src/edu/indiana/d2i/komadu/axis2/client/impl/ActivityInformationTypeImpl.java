/*
 * XML Type:  activityInformationType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.ActivityInformationType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML activityInformationType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class ActivityInformationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.ActivityInformationType
{
    
    public ActivityInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYID$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "activityID");
    private static final javax.xml.namespace.QName ATTRIBUTES$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "attributes");
    
    
    /**
     * Gets the "activityID" element
     */
    public java.lang.String getActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "activityID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ACTIVITYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "activityID" element
     */
    public void setActivityID(java.lang.String activityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYID$0);
            }
            target.setStringValue(activityID);
        }
    }
    
    /**
     * Sets (as xml) the "activityID" element
     */
    public void xsetActivityID(org.apache.xmlbeans.XmlAnyURI activityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ACTIVITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ACTIVITYID$0);
            }
            target.set(activityID);
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
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$2) != 0;
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
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTES$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTES$2);
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
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$2, 0);
        }
    }
}
