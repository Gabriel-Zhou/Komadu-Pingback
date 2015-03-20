/*
 * An XML document type.
 * Localname: wasStartedBy
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.WasStartedByDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one wasStartedBy(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class WasStartedByDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.WasStartedByDocument
{
    
    public WasStartedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WASSTARTEDBY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasStartedBy");
    
    
    /**
     * Gets the "wasStartedBy" element
     */
    public org.w3.www.ns.prov.Start getWasStartedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Start target = null;
            target = (org.w3.www.ns.prov.Start)get_store().find_element_user(WASSTARTEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wasStartedBy" element
     */
    public void setWasStartedBy(org.w3.www.ns.prov.Start wasStartedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Start target = null;
            target = (org.w3.www.ns.prov.Start)get_store().find_element_user(WASSTARTEDBY$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Start)get_store().add_element_user(WASSTARTEDBY$0);
            }
            target.set(wasStartedBy);
        }
    }
    
    /**
     * Appends and returns a new empty "wasStartedBy" element
     */
    public org.w3.www.ns.prov.Start addNewWasStartedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Start target = null;
            target = (org.w3.www.ns.prov.Start)get_store().add_element_user(WASSTARTEDBY$0);
            return target;
        }
    }
}
