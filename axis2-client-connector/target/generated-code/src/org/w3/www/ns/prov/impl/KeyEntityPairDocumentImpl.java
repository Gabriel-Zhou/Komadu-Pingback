/*
 * An XML document type.
 * Localname: keyEntityPair
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.KeyEntityPairDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one keyEntityPair(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class KeyEntityPairDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.KeyEntityPairDocument
{
    
    public KeyEntityPairDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYENTITYPAIR$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "keyEntityPair");
    
    
    /**
     * Gets the "keyEntityPair" element
     */
    public org.w3.www.ns.prov.KeyEntityPair getKeyEntityPair()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.KeyEntityPair target = null;
            target = (org.w3.www.ns.prov.KeyEntityPair)get_store().find_element_user(KEYENTITYPAIR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "keyEntityPair" element
     */
    public void setKeyEntityPair(org.w3.www.ns.prov.KeyEntityPair keyEntityPair)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.KeyEntityPair target = null;
            target = (org.w3.www.ns.prov.KeyEntityPair)get_store().find_element_user(KEYENTITYPAIR$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.KeyEntityPair)get_store().add_element_user(KEYENTITYPAIR$0);
            }
            target.set(keyEntityPair);
        }
    }
    
    /**
     * Appends and returns a new empty "keyEntityPair" element
     */
    public org.w3.www.ns.prov.KeyEntityPair addNewKeyEntityPair()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.KeyEntityPair target = null;
            target = (org.w3.www.ns.prov.KeyEntityPair)get_store().add_element_user(KEYENTITYPAIR$0);
            return target;
        }
    }
}
