/*
 * XML Type:  derivationType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.DerivationType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML derivationType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class DerivationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.DerivationType
{
    
    public DerivationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USEDENTITYID$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "usedEntityID");
    private static final javax.xml.namespace.QName GENERATEDENTITYID$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "generatedEntityID");
    private static final javax.xml.namespace.QName ATTRIBUTES$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "attributes");
    
    
    /**
     * Gets the "usedEntityID" element
     */
    public java.lang.String getUsedEntityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEDENTITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "usedEntityID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetUsedEntityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(USEDENTITYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "usedEntityID" element
     */
    public void setUsedEntityID(java.lang.String usedEntityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEDENTITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEDENTITYID$0);
            }
            target.setStringValue(usedEntityID);
        }
    }
    
    /**
     * Sets (as xml) the "usedEntityID" element
     */
    public void xsetUsedEntityID(org.apache.xmlbeans.XmlAnyURI usedEntityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(USEDENTITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(USEDENTITYID$0);
            }
            target.set(usedEntityID);
        }
    }
    
    /**
     * Gets the "generatedEntityID" element
     */
    public java.lang.String getGeneratedEntityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERATEDENTITYID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "generatedEntityID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetGeneratedEntityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(GENERATEDENTITYID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "generatedEntityID" element
     */
    public void setGeneratedEntityID(java.lang.String generatedEntityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERATEDENTITYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERATEDENTITYID$2);
            }
            target.setStringValue(generatedEntityID);
        }
    }
    
    /**
     * Sets (as xml) the "generatedEntityID" element
     */
    public void xsetGeneratedEntityID(org.apache.xmlbeans.XmlAnyURI generatedEntityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(GENERATEDENTITYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(GENERATEDENTITYID$2);
            }
            target.set(generatedEntityID);
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
