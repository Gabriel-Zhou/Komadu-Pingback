/*
 * An XML document type.
 * Localname: wasInformedBy
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.WasInformedByDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one wasInformedBy(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class WasInformedByDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.WasInformedByDocument
{
    
    public WasInformedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WASINFORMEDBY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasInformedBy");
    
    
    /**
     * Gets the "wasInformedBy" element
     */
    public org.w3.www.ns.prov.Communication getWasInformedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Communication target = null;
            target = (org.w3.www.ns.prov.Communication)get_store().find_element_user(WASINFORMEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wasInformedBy" element
     */
    public void setWasInformedBy(org.w3.www.ns.prov.Communication wasInformedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Communication target = null;
            target = (org.w3.www.ns.prov.Communication)get_store().find_element_user(WASINFORMEDBY$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Communication)get_store().add_element_user(WASINFORMEDBY$0);
            }
            target.set(wasInformedBy);
        }
    }
    
    /**
     * Appends and returns a new empty "wasInformedBy" element
     */
    public org.w3.www.ns.prov.Communication addNewWasInformedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Communication target = null;
            target = (org.w3.www.ns.prov.Communication)get_store().add_element_user(WASINFORMEDBY$0);
            return target;
        }
    }
}
