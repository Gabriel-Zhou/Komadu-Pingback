/*
 * An XML document type.
 * Localname: derivedByRemovalFrom
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.DerivedByRemovalFromDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one derivedByRemovalFrom(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class DerivedByRemovalFromDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.DerivedByRemovalFromDocument
{
    
    public DerivedByRemovalFromDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDBYREMOVALFROM$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "derivedByRemovalFrom");
    
    
    /**
     * Gets the "derivedByRemovalFrom" element
     */
    public org.w3.www.ns.prov.Removal getDerivedByRemovalFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Removal target = null;
            target = (org.w3.www.ns.prov.Removal)get_store().find_element_user(DERIVEDBYREMOVALFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "derivedByRemovalFrom" element
     */
    public void setDerivedByRemovalFrom(org.w3.www.ns.prov.Removal derivedByRemovalFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Removal target = null;
            target = (org.w3.www.ns.prov.Removal)get_store().find_element_user(DERIVEDBYREMOVALFROM$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Removal)get_store().add_element_user(DERIVEDBYREMOVALFROM$0);
            }
            target.set(derivedByRemovalFrom);
        }
    }
    
    /**
     * Appends and returns a new empty "derivedByRemovalFrom" element
     */
    public org.w3.www.ns.prov.Removal addNewDerivedByRemovalFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Removal target = null;
            target = (org.w3.www.ns.prov.Removal)get_store().add_element_user(DERIVEDBYREMOVALFROM$0);
            return target;
        }
    }
}
