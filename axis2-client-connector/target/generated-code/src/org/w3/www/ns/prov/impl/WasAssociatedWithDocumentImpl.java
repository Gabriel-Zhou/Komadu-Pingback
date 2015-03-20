/*
 * An XML document type.
 * Localname: wasAssociatedWith
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.WasAssociatedWithDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one wasAssociatedWith(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class WasAssociatedWithDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.WasAssociatedWithDocument
{
    
    public WasAssociatedWithDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WASASSOCIATEDWITH$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasAssociatedWith");
    
    
    /**
     * Gets the "wasAssociatedWith" element
     */
    public org.w3.www.ns.prov.Association getWasAssociatedWith()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Association target = null;
            target = (org.w3.www.ns.prov.Association)get_store().find_element_user(WASASSOCIATEDWITH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wasAssociatedWith" element
     */
    public void setWasAssociatedWith(org.w3.www.ns.prov.Association wasAssociatedWith)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Association target = null;
            target = (org.w3.www.ns.prov.Association)get_store().find_element_user(WASASSOCIATEDWITH$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Association)get_store().add_element_user(WASASSOCIATEDWITH$0);
            }
            target.set(wasAssociatedWith);
        }
    }
    
    /**
     * Appends and returns a new empty "wasAssociatedWith" element
     */
    public org.w3.www.ns.prov.Association addNewWasAssociatedWith()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Association target = null;
            target = (org.w3.www.ns.prov.Association)get_store().add_element_user(WASASSOCIATEDWITH$0);
            return target;
        }
    }
}
