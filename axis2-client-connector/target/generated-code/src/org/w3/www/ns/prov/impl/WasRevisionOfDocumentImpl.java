/*
 * An XML document type.
 * Localname: wasRevisionOf
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.WasRevisionOfDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one wasRevisionOf(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class WasRevisionOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.WasRevisionOfDocument
{
    
    public WasRevisionOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WASREVISIONOF$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasRevisionOf");
    
    
    /**
     * Gets the "wasRevisionOf" element
     */
    public org.w3.www.ns.prov.Revision getWasRevisionOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Revision target = null;
            target = (org.w3.www.ns.prov.Revision)get_store().find_element_user(WASREVISIONOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wasRevisionOf" element
     */
    public void setWasRevisionOf(org.w3.www.ns.prov.Revision wasRevisionOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Revision target = null;
            target = (org.w3.www.ns.prov.Revision)get_store().find_element_user(WASREVISIONOF$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Revision)get_store().add_element_user(WASREVISIONOF$0);
            }
            target.set(wasRevisionOf);
        }
    }
    
    /**
     * Appends and returns a new empty "wasRevisionOf" element
     */
    public org.w3.www.ns.prov.Revision addNewWasRevisionOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Revision target = null;
            target = (org.w3.www.ns.prov.Revision)get_store().add_element_user(WASREVISIONOF$0);
            return target;
        }
    }
}
