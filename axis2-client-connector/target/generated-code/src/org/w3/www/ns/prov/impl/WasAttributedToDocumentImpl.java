/*
 * An XML document type.
 * Localname: wasAttributedTo
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.WasAttributedToDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one wasAttributedTo(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class WasAttributedToDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.WasAttributedToDocument
{
    
    public WasAttributedToDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WASATTRIBUTEDTO$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasAttributedTo");
    
    
    /**
     * Gets the "wasAttributedTo" element
     */
    public org.w3.www.ns.prov.Attribution getWasAttributedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Attribution target = null;
            target = (org.w3.www.ns.prov.Attribution)get_store().find_element_user(WASATTRIBUTEDTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wasAttributedTo" element
     */
    public void setWasAttributedTo(org.w3.www.ns.prov.Attribution wasAttributedTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Attribution target = null;
            target = (org.w3.www.ns.prov.Attribution)get_store().find_element_user(WASATTRIBUTEDTO$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Attribution)get_store().add_element_user(WASATTRIBUTEDTO$0);
            }
            target.set(wasAttributedTo);
        }
    }
    
    /**
     * Appends and returns a new empty "wasAttributedTo" element
     */
    public org.w3.www.ns.prov.Attribution addNewWasAttributedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Attribution target = null;
            target = (org.w3.www.ns.prov.Attribution)get_store().add_element_user(WASATTRIBUTEDTO$0);
            return target;
        }
    }
}
