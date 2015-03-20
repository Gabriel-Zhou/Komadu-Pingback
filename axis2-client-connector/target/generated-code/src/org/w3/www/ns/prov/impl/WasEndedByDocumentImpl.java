/*
 * An XML document type.
 * Localname: wasEndedBy
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.WasEndedByDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one wasEndedBy(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class WasEndedByDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.WasEndedByDocument
{
    
    public WasEndedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WASENDEDBY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasEndedBy");
    
    
    /**
     * Gets the "wasEndedBy" element
     */
    public org.w3.www.ns.prov.End getWasEndedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.End target = null;
            target = (org.w3.www.ns.prov.End)get_store().find_element_user(WASENDEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wasEndedBy" element
     */
    public void setWasEndedBy(org.w3.www.ns.prov.End wasEndedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.End target = null;
            target = (org.w3.www.ns.prov.End)get_store().find_element_user(WASENDEDBY$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.End)get_store().add_element_user(WASENDEDBY$0);
            }
            target.set(wasEndedBy);
        }
    }
    
    /**
     * Appends and returns a new empty "wasEndedBy" element
     */
    public org.w3.www.ns.prov.End addNewWasEndedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.End target = null;
            target = (org.w3.www.ns.prov.End)get_store().add_element_user(WASENDEDBY$0);
            return target;
        }
    }
}
