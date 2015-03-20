/*
 * An XML document type.
 * Localname: hadPrimarySource
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.HadPrimarySourceDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one hadPrimarySource(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class HadPrimarySourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.HadPrimarySourceDocument
{
    
    public HadPrimarySourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HADPRIMARYSOURCE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "hadPrimarySource");
    
    
    /**
     * Gets the "hadPrimarySource" element
     */
    public org.w3.www.ns.prov.PrimarySource getHadPrimarySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.PrimarySource target = null;
            target = (org.w3.www.ns.prov.PrimarySource)get_store().find_element_user(HADPRIMARYSOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hadPrimarySource" element
     */
    public void setHadPrimarySource(org.w3.www.ns.prov.PrimarySource hadPrimarySource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.PrimarySource target = null;
            target = (org.w3.www.ns.prov.PrimarySource)get_store().find_element_user(HADPRIMARYSOURCE$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.PrimarySource)get_store().add_element_user(HADPRIMARYSOURCE$0);
            }
            target.set(hadPrimarySource);
        }
    }
    
    /**
     * Appends and returns a new empty "hadPrimarySource" element
     */
    public org.w3.www.ns.prov.PrimarySource addNewHadPrimarySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.PrimarySource target = null;
            target = (org.w3.www.ns.prov.PrimarySource)get_store().add_element_user(HADPRIMARYSOURCE$0);
            return target;
        }
    }
}
