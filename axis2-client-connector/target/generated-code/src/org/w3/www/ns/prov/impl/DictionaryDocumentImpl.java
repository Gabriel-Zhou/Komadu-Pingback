/*
 * An XML document type.
 * Localname: dictionary
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.DictionaryDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one dictionary(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class DictionaryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.DictionaryDocument
{
    
    public DictionaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DICTIONARY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "dictionary");
    
    
    /**
     * Gets the "dictionary" element
     */
    public org.w3.www.ns.prov.Dictionary getDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Dictionary target = null;
            target = (org.w3.www.ns.prov.Dictionary)get_store().find_element_user(DICTIONARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dictionary" element
     */
    public void setDictionary(org.w3.www.ns.prov.Dictionary dictionary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Dictionary target = null;
            target = (org.w3.www.ns.prov.Dictionary)get_store().find_element_user(DICTIONARY$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Dictionary)get_store().add_element_user(DICTIONARY$0);
            }
            target.set(dictionary);
        }
    }
    
    /**
     * Appends and returns a new empty "dictionary" element
     */
    public org.w3.www.ns.prov.Dictionary addNewDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Dictionary target = null;
            target = (org.w3.www.ns.prov.Dictionary)get_store().add_element_user(DICTIONARY$0);
            return target;
        }
    }
}
