/*
 * An XML document type.
 * Localname: collection
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.CollectionDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one collection(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class CollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.CollectionDocument
{
    
    public CollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLLECTION$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "collection");
    
    
    /**
     * Gets the "collection" element
     */
    public org.w3.www.ns.prov.Collection getCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Collection target = null;
            target = (org.w3.www.ns.prov.Collection)get_store().find_element_user(COLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "collection" element
     */
    public void setCollection(org.w3.www.ns.prov.Collection collection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Collection target = null;
            target = (org.w3.www.ns.prov.Collection)get_store().find_element_user(COLLECTION$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Collection)get_store().add_element_user(COLLECTION$0);
            }
            target.set(collection);
        }
    }
    
    /**
     * Appends and returns a new empty "collection" element
     */
    public org.w3.www.ns.prov.Collection addNewCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Collection target = null;
            target = (org.w3.www.ns.prov.Collection)get_store().add_element_user(COLLECTION$0);
            return target;
        }
    }
}
