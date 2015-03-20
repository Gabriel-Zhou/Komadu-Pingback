/*
 * An XML document type.
 * Localname: wasInvalidatedBy
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.WasInvalidatedByDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one wasInvalidatedBy(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class WasInvalidatedByDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.WasInvalidatedByDocument
{
    
    public WasInvalidatedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WASINVALIDATEDBY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasInvalidatedBy");
    
    
    /**
     * Gets the "wasInvalidatedBy" element
     */
    public org.w3.www.ns.prov.Invalidation getWasInvalidatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Invalidation target = null;
            target = (org.w3.www.ns.prov.Invalidation)get_store().find_element_user(WASINVALIDATEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wasInvalidatedBy" element
     */
    public void setWasInvalidatedBy(org.w3.www.ns.prov.Invalidation wasInvalidatedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Invalidation target = null;
            target = (org.w3.www.ns.prov.Invalidation)get_store().find_element_user(WASINVALIDATEDBY$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Invalidation)get_store().add_element_user(WASINVALIDATEDBY$0);
            }
            target.set(wasInvalidatedBy);
        }
    }
    
    /**
     * Appends and returns a new empty "wasInvalidatedBy" element
     */
    public org.w3.www.ns.prov.Invalidation addNewWasInvalidatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Invalidation target = null;
            target = (org.w3.www.ns.prov.Invalidation)get_store().add_element_user(WASINVALIDATEDBY$0);
            return target;
        }
    }
}
