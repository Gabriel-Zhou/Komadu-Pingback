/*
 * An XML document type.
 * Localname: emptyCollection
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.EmptyCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one emptyCollection(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class EmptyCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.EmptyCollectionDocument
{
    
    public EmptyCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPTYCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "emptyCollection");
    
    
    /**
     * Gets the "emptyCollection" element
     */
    public org.w3.www.ns.prov.EmptyCollection getEmptyCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.EmptyCollection target = null;
            target = (org.w3.www.ns.prov.EmptyCollection)get_store().find_element_user(EMPTYCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "emptyCollection" element
     */
    public void setEmptyCollection(org.w3.www.ns.prov.EmptyCollection emptyCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.EmptyCollection target = null;
            target = (org.w3.www.ns.prov.EmptyCollection)get_store().find_element_user(EMPTYCOLLECTION$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.EmptyCollection)get_store().add_element_user(EMPTYCOLLECTION$0);
            }
            target.set(emptyCollection);
        }
    }
    
    /**
     * Appends and returns a new empty "emptyCollection" element
     */
    public org.w3.www.ns.prov.EmptyCollection addNewEmptyCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.EmptyCollection target = null;
            target = (org.w3.www.ns.prov.EmptyCollection)get_store().add_element_user(EMPTYCOLLECTION$0);
            return target;
        }
    }
}
