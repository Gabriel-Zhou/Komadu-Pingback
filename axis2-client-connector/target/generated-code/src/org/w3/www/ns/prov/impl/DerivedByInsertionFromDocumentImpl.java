/*
 * An XML document type.
 * Localname: derivedByInsertionFrom
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.DerivedByInsertionFromDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one derivedByInsertionFrom(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class DerivedByInsertionFromDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.DerivedByInsertionFromDocument
{
    
    public DerivedByInsertionFromDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDBYINSERTIONFROM$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "derivedByInsertionFrom");
    
    
    /**
     * Gets the "derivedByInsertionFrom" element
     */
    public org.w3.www.ns.prov.Insertion getDerivedByInsertionFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Insertion target = null;
            target = (org.w3.www.ns.prov.Insertion)get_store().find_element_user(DERIVEDBYINSERTIONFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "derivedByInsertionFrom" element
     */
    public void setDerivedByInsertionFrom(org.w3.www.ns.prov.Insertion derivedByInsertionFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Insertion target = null;
            target = (org.w3.www.ns.prov.Insertion)get_store().find_element_user(DERIVEDBYINSERTIONFROM$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Insertion)get_store().add_element_user(DERIVEDBYINSERTIONFROM$0);
            }
            target.set(derivedByInsertionFrom);
        }
    }
    
    /**
     * Appends and returns a new empty "derivedByInsertionFrom" element
     */
    public org.w3.www.ns.prov.Insertion addNewDerivedByInsertionFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Insertion target = null;
            target = (org.w3.www.ns.prov.Insertion)get_store().add_element_user(DERIVEDBYINSERTIONFROM$0);
            return target;
        }
    }
}
