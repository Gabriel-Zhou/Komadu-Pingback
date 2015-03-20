/*
 * XML Type:  specializationType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.SpecializationType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML specializationType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class SpecializationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.SpecializationType
{
    
    public SpecializationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPECIFICENTITYID$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "specificEntityID");
    private static final javax.xml.namespace.QName GENERALENTITYID$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "generalEntityID");
    
    
    /**
     * Gets the "specificEntityID" element
     */
    public java.lang.String getSpecificEntityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIFICENTITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "specificEntityID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSpecificEntityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SPECIFICENTITYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "specificEntityID" element
     */
    public void setSpecificEntityID(java.lang.String specificEntityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIFICENTITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPECIFICENTITYID$0);
            }
            target.setStringValue(specificEntityID);
        }
    }
    
    /**
     * Sets (as xml) the "specificEntityID" element
     */
    public void xsetSpecificEntityID(org.apache.xmlbeans.XmlAnyURI specificEntityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SPECIFICENTITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SPECIFICENTITYID$0);
            }
            target.set(specificEntityID);
        }
    }
    
    /**
     * Gets the "generalEntityID" element
     */
    public java.lang.String getGeneralEntityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALENTITYID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "generalEntityID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetGeneralEntityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(GENERALENTITYID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "generalEntityID" element
     */
    public void setGeneralEntityID(java.lang.String generalEntityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALENTITYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERALENTITYID$2);
            }
            target.setStringValue(generalEntityID);
        }
    }
    
    /**
     * Sets (as xml) the "generalEntityID" element
     */
    public void xsetGeneralEntityID(org.apache.xmlbeans.XmlAnyURI generalEntityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(GENERALENTITYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(GENERALENTITYID$2);
            }
            target.set(generalEntityID);
        }
    }
}
