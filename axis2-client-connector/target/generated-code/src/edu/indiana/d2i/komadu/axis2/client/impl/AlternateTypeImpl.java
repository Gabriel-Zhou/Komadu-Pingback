/*
 * XML Type:  alternateType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AlternateType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML alternateType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class AlternateTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AlternateType
{
    
    public AlternateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTERNATE1ID$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "alternate1ID");
    private static final javax.xml.namespace.QName ALTERNATE2ID$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "alternate2ID");
    
    
    /**
     * Gets the "alternate1ID" element
     */
    public java.lang.String getAlternate1ID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERNATE1ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "alternate1ID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetAlternate1ID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ALTERNATE1ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "alternate1ID" element
     */
    public void setAlternate1ID(java.lang.String alternate1ID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERNATE1ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTERNATE1ID$0);
            }
            target.setStringValue(alternate1ID);
        }
    }
    
    /**
     * Sets (as xml) the "alternate1ID" element
     */
    public void xsetAlternate1ID(org.apache.xmlbeans.XmlAnyURI alternate1ID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ALTERNATE1ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ALTERNATE1ID$0);
            }
            target.set(alternate1ID);
        }
    }
    
    /**
     * Gets the "alternate2ID" element
     */
    public java.lang.String getAlternate2ID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERNATE2ID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "alternate2ID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetAlternate2ID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ALTERNATE2ID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "alternate2ID" element
     */
    public void setAlternate2ID(java.lang.String alternate2ID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERNATE2ID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTERNATE2ID$2);
            }
            target.setStringValue(alternate2ID);
        }
    }
    
    /**
     * Sets (as xml) the "alternate2ID" element
     */
    public void xsetAlternate2ID(org.apache.xmlbeans.XmlAnyURI alternate2ID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ALTERNATE2ID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ALTERNATE2ID$2);
            }
            target.set(alternate2ID);
        }
    }
}
