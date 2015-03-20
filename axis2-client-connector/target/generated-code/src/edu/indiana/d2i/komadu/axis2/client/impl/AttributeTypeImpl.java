/*
 * XML Type:  attributeType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AttributeType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML attributeType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class AttributeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AttributeType
{
    
    public AttributeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "property");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "value");
    
    
    /**
     * Gets the "property" element
     */
    public java.lang.String getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "property" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "property" element
     */
    public void setProperty(java.lang.String property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY$0);
            }
            target.setStringValue(property);
        }
    }
    
    /**
     * Sets (as xml) the "property" element
     */
    public void xsetProperty(org.apache.xmlbeans.XmlAnyURI property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY$0);
            }
            target.set(property);
        }
    }
    
    /**
     * Gets the "value" element
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" element
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" element
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$2);
            }
            target.set(value);
        }
    }
}
