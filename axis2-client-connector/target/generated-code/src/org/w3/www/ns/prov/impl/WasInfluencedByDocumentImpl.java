/*
 * An XML document type.
 * Localname: wasInfluencedBy
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.WasInfluencedByDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one wasInfluencedBy(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class WasInfluencedByDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.WasInfluencedByDocument
{
    
    public WasInfluencedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WASINFLUENCEDBY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasInfluencedBy");
    
    
    /**
     * Gets the "wasInfluencedBy" element
     */
    public org.w3.www.ns.prov.Influence getWasInfluencedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Influence target = null;
            target = (org.w3.www.ns.prov.Influence)get_store().find_element_user(WASINFLUENCEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wasInfluencedBy" element
     */
    public void setWasInfluencedBy(org.w3.www.ns.prov.Influence wasInfluencedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Influence target = null;
            target = (org.w3.www.ns.prov.Influence)get_store().find_element_user(WASINFLUENCEDBY$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Influence)get_store().add_element_user(WASINFLUENCEDBY$0);
            }
            target.set(wasInfluencedBy);
        }
    }
    
    /**
     * Appends and returns a new empty "wasInfluencedBy" element
     */
    public org.w3.www.ns.prov.Influence addNewWasInfluencedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Influence target = null;
            target = (org.w3.www.ns.prov.Influence)get_store().add_element_user(WASINFLUENCEDBY$0);
            return target;
        }
    }
}
