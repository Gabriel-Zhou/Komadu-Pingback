/*
 * An XML document type.
 * Localname: wasGeneratedBy
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.WasGeneratedByDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one wasGeneratedBy(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class WasGeneratedByDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.WasGeneratedByDocument
{
    
    public WasGeneratedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WASGENERATEDBY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasGeneratedBy");
    
    
    /**
     * Gets the "wasGeneratedBy" element
     */
    public org.w3.www.ns.prov.Generation getWasGeneratedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Generation target = null;
            target = (org.w3.www.ns.prov.Generation)get_store().find_element_user(WASGENERATEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wasGeneratedBy" element
     */
    public void setWasGeneratedBy(org.w3.www.ns.prov.Generation wasGeneratedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Generation target = null;
            target = (org.w3.www.ns.prov.Generation)get_store().find_element_user(WASGENERATEDBY$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Generation)get_store().add_element_user(WASGENERATEDBY$0);
            }
            target.set(wasGeneratedBy);
        }
    }
    
    /**
     * Appends and returns a new empty "wasGeneratedBy" element
     */
    public org.w3.www.ns.prov.Generation addNewWasGeneratedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Generation target = null;
            target = (org.w3.www.ns.prov.Generation)get_store().add_element_user(WASGENERATEDBY$0);
            return target;
        }
    }
}
