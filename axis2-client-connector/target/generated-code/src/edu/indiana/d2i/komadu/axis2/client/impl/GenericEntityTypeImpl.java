/*
 * XML Type:  genericEntityType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.GenericEntityType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML genericEntityType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class GenericEntityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.GenericEntityType
{
    
    public GenericEntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYURI$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "entityURI");
    
    
    /**
     * Gets the "entityURI" element
     */
    public java.lang.String getEntityURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "entityURI" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetEntityURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENTITYURI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "entityURI" element
     */
    public void setEntityURI(java.lang.String entityURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYURI$0);
            }
            target.setStringValue(entityURI);
        }
    }
    
    /**
     * Sets (as xml) the "entityURI" element
     */
    public void xsetEntityURI(org.apache.xmlbeans.XmlAnyURI entityURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENTITYURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ENTITYURI$0);
            }
            target.set(entityURI);
        }
    }
}
