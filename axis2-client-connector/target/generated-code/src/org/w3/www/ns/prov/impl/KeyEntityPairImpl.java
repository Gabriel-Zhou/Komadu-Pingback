/*
 * XML Type:  KeyEntityPair
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.KeyEntityPair
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * An XML KeyEntityPair(@http://www.w3.org/ns/prov#).
 *
 * This is a complex type.
 */
public class KeyEntityPairImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.KeyEntityPair
{
    
    public KeyEntityPairImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "key");
    private static final javax.xml.namespace.QName ENTITY$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "entity");
    
    
    /**
     * Gets the "key" element
     */
    public org.w3.www.ns.prov.TypedValue getKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.TypedValue target = null;
            target = (org.w3.www.ns.prov.TypedValue)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "key" element
     */
    public void setKey(org.w3.www.ns.prov.TypedValue key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.TypedValue target = null;
            target = (org.w3.www.ns.prov.TypedValue)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.TypedValue)get_store().add_element_user(KEY$0);
            }
            target.set(key);
        }
    }
    
    /**
     * Appends and returns a new empty "key" element
     */
    public org.w3.www.ns.prov.TypedValue addNewKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.TypedValue target = null;
            target = (org.w3.www.ns.prov.TypedValue)get_store().add_element_user(KEY$0);
            return target;
        }
    }
    
    /**
     * Gets the "entity" element
     */
    public org.w3.www.ns.prov.IDRef getEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(ENTITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entity" element
     */
    public void setEntity(org.w3.www.ns.prov.IDRef entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(ENTITY$2, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(ENTITY$2);
            }
            target.set(entity);
        }
    }
    
    /**
     * Appends and returns a new empty "entity" element
     */
    public org.w3.www.ns.prov.IDRef addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(ENTITY$2);
            return target;
        }
    }
}
