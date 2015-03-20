/*
 * An XML document type.
 * Localname: wasQuotedFrom
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.WasQuotedFromDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one wasQuotedFrom(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class WasQuotedFromDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.WasQuotedFromDocument
{
    
    public WasQuotedFromDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WASQUOTEDFROM$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasQuotedFrom");
    
    
    /**
     * Gets the "wasQuotedFrom" element
     */
    public org.w3.www.ns.prov.Quotation getWasQuotedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Quotation target = null;
            target = (org.w3.www.ns.prov.Quotation)get_store().find_element_user(WASQUOTEDFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wasQuotedFrom" element
     */
    public void setWasQuotedFrom(org.w3.www.ns.prov.Quotation wasQuotedFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Quotation target = null;
            target = (org.w3.www.ns.prov.Quotation)get_store().find_element_user(WASQUOTEDFROM$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Quotation)get_store().add_element_user(WASQUOTEDFROM$0);
            }
            target.set(wasQuotedFrom);
        }
    }
    
    /**
     * Appends and returns a new empty "wasQuotedFrom" element
     */
    public org.w3.www.ns.prov.Quotation addNewWasQuotedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Quotation target = null;
            target = (org.w3.www.ns.prov.Quotation)get_store().add_element_user(WASQUOTEDFROM$0);
            return target;
        }
    }
}
