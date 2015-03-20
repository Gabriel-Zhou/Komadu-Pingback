/*
 * An XML document type.
 * Localname: bundle
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.BundleDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one bundle(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class BundleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.BundleDocument
{
    
    public BundleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUNDLE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "bundle");
    
    
    /**
     * Gets the "bundle" element
     */
    public org.w3.www.ns.prov.Bundle getBundle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Bundle target = null;
            target = (org.w3.www.ns.prov.Bundle)get_store().find_element_user(BUNDLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bundle" element
     */
    public void setBundle(org.w3.www.ns.prov.Bundle bundle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Bundle target = null;
            target = (org.w3.www.ns.prov.Bundle)get_store().find_element_user(BUNDLE$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Bundle)get_store().add_element_user(BUNDLE$0);
            }
            target.set(bundle);
        }
    }
    
    /**
     * Appends and returns a new empty "bundle" element
     */
    public org.w3.www.ns.prov.Bundle addNewBundle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Bundle target = null;
            target = (org.w3.www.ns.prov.Bundle)get_store().add_element_user(BUNDLE$0);
            return target;
        }
    }
}
