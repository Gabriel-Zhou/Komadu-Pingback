/*
 * An XML document type.
 * Localname: used
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.UsedDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one used(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class UsedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.UsedDocument
{
    
    public UsedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USED$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "used");
    
    
    /**
     * Gets the "used" element
     */
    public org.w3.www.ns.prov.Usage getUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Usage target = null;
            target = (org.w3.www.ns.prov.Usage)get_store().find_element_user(USED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "used" element
     */
    public void setUsed(org.w3.www.ns.prov.Usage used)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Usage target = null;
            target = (org.w3.www.ns.prov.Usage)get_store().find_element_user(USED$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Usage)get_store().add_element_user(USED$0);
            }
            target.set(used);
        }
    }
    
    /**
     * Appends and returns a new empty "used" element
     */
    public org.w3.www.ns.prov.Usage addNewUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Usage target = null;
            target = (org.w3.www.ns.prov.Usage)get_store().add_element_user(USED$0);
            return target;
        }
    }
}
