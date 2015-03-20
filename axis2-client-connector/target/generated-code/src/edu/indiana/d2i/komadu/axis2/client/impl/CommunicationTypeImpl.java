/*
 * XML Type:  communicationType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.CommunicationType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML communicationType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class CommunicationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.CommunicationType
{
    
    public CommunicationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INFORMEDACTIVITYID$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "informedActivityID");
    private static final javax.xml.namespace.QName INFORMANTACTIVITYID$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "informantActivityID");
    private static final javax.xml.namespace.QName ATTRIBUTES$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "attributes");
    
    
    /**
     * Gets the "informedActivityID" element
     */
    public java.lang.String getInformedActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMEDACTIVITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "informedActivityID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetInformedActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(INFORMEDACTIVITYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "informedActivityID" element
     */
    public void setInformedActivityID(java.lang.String informedActivityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMEDACTIVITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFORMEDACTIVITYID$0);
            }
            target.setStringValue(informedActivityID);
        }
    }
    
    /**
     * Sets (as xml) the "informedActivityID" element
     */
    public void xsetInformedActivityID(org.apache.xmlbeans.XmlAnyURI informedActivityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(INFORMEDACTIVITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(INFORMEDACTIVITYID$0);
            }
            target.set(informedActivityID);
        }
    }
    
    /**
     * Gets the "informantActivityID" element
     */
    public java.lang.String getInformantActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMANTACTIVITYID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "informantActivityID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetInformantActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(INFORMANTACTIVITYID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "informantActivityID" element
     */
    public void setInformantActivityID(java.lang.String informantActivityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMANTACTIVITYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFORMANTACTIVITYID$2);
            }
            target.setStringValue(informantActivityID);
        }
    }
    
    /**
     * Sets (as xml) the "informantActivityID" element
     */
    public void xsetInformantActivityID(org.apache.xmlbeans.XmlAnyURI informantActivityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(INFORMANTACTIVITYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(INFORMANTACTIVITYID$2);
            }
            target.set(informantActivityID);
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
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTES$4, 0);
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
            return get_store().count_elements(ATTRIBUTES$4) != 0;
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
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTES$4, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTES$4);
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
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTES$4);
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
            get_store().remove_element(ATTRIBUTES$4, 0);
        }
    }
}
