/*
 * An XML document type.
 * Localname: emptyDictionary
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.EmptyDictionaryDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one emptyDictionary(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class EmptyDictionaryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.EmptyDictionaryDocument
{
    
    public EmptyDictionaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPTYDICTIONARY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "emptyDictionary");
    
    
    /**
     * Gets the "emptyDictionary" element
     */
    public org.w3.www.ns.prov.EmptyDictionary getEmptyDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.EmptyDictionary target = null;
            target = (org.w3.www.ns.prov.EmptyDictionary)get_store().find_element_user(EMPTYDICTIONARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "emptyDictionary" element
     */
    public void setEmptyDictionary(org.w3.www.ns.prov.EmptyDictionary emptyDictionary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.EmptyDictionary target = null;
            target = (org.w3.www.ns.prov.EmptyDictionary)get_store().find_element_user(EMPTYDICTIONARY$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.EmptyDictionary)get_store().add_element_user(EMPTYDICTIONARY$0);
            }
            target.set(emptyDictionary);
        }
    }
    
    /**
     * Appends and returns a new empty "emptyDictionary" element
     */
    public org.w3.www.ns.prov.EmptyDictionary addNewEmptyDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.EmptyDictionary target = null;
            target = (org.w3.www.ns.prov.EmptyDictionary)get_store().add_element_user(EMPTYDICTIONARY$0);
            return target;
        }
    }
}
