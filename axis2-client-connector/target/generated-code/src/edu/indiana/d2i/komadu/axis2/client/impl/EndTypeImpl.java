/*
 * XML Type:  endType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.EndType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML endType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class EndTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.EndType
{
    
    public EndTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYID$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "activityID");
    private static final javax.xml.namespace.QName TRIGGERID$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "triggerID");
    private static final javax.xml.namespace.QName TIMESTAMP$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "timestamp");
    private static final javax.xml.namespace.QName ATTRIBUTES$6 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "attributes");
    private static final javax.xml.namespace.QName LOCATION$8 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "location");
    
    
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
     * Gets the "triggerID" element
     */
    public java.lang.String getTriggerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIGGERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "triggerID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTriggerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TRIGGERID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "triggerID" element
     */
    public boolean isSetTriggerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRIGGERID$2) != 0;
        }
    }
    
    /**
     * Sets the "triggerID" element
     */
    public void setTriggerID(java.lang.String triggerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIGGERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRIGGERID$2);
            }
            target.setStringValue(triggerID);
        }
    }
    
    /**
     * Sets (as xml) the "triggerID" element
     */
    public void xsetTriggerID(org.apache.xmlbeans.XmlAnyURI triggerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TRIGGERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(TRIGGERID$2);
            }
            target.set(triggerID);
        }
    }
    
    /**
     * Unsets the "triggerID" element
     */
    public void unsetTriggerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRIGGERID$2, 0);
        }
    }
    
    /**
     * Gets the "timestamp" element
     */
    public java.util.Calendar getTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "timestamp" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "timestamp" element
     */
    public boolean isSetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMESTAMP$4) != 0;
        }
    }
    
    /**
     * Sets the "timestamp" element
     */
    public void setTimestamp(java.util.Calendar timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESTAMP$4);
            }
            target.setCalendarValue(timestamp);
        }
    }
    
    /**
     * Sets (as xml) the "timestamp" element
     */
    public void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIMESTAMP$4);
            }
            target.set(timestamp);
        }
    }
    
    /**
     * Unsets the "timestamp" element
     */
    public void unsetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMESTAMP$4, 0);
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
     * True if has "attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$6) != 0;
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
     * Unsets the "attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$6, 0);
        }
    }
    
    /**
     * Gets the "location" element
     */
    public java.lang.String getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "location" element
     */
    public org.apache.xmlbeans.XmlString xgetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "location" element
     */
    public boolean isSetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$8) != 0;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(java.lang.String location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATION$8);
            }
            target.setStringValue(location);
        }
    }
    
    /**
     * Sets (as xml) the "location" element
     */
    public void xsetLocation(org.apache.xmlbeans.XmlString location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATION$8);
            }
            target.set(location);
        }
    }
    
    /**
     * Unsets the "location" element
     */
    public void unsetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$8, 0);
        }
    }
}
