/*
 * An XML document type.
 * Localname: alternateOf
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.AlternateOfDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one alternateOf(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class AlternateOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.AlternateOfDocument
{
    
    public AlternateOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTERNATEOF$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "alternateOf");
    
    
    /**
     * Gets the "alternateOf" element
     */
    public org.w3.www.ns.prov.Alternate getAlternateOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Alternate target = null;
            target = (org.w3.www.ns.prov.Alternate)get_store().find_element_user(ALTERNATEOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "alternateOf" element
     */
    public void setAlternateOf(org.w3.www.ns.prov.Alternate alternateOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Alternate target = null;
            target = (org.w3.www.ns.prov.Alternate)get_store().find_element_user(ALTERNATEOF$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Alternate)get_store().add_element_user(ALTERNATEOF$0);
            }
            target.set(alternateOf);
        }
    }
    
    /**
     * Appends and returns a new empty "alternateOf" element
     */
    public org.w3.www.ns.prov.Alternate addNewAlternateOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Alternate target = null;
            target = (org.w3.www.ns.prov.Alternate)get_store().add_element_user(ALTERNATEOF$0);
            return target;
        }
    }
}
