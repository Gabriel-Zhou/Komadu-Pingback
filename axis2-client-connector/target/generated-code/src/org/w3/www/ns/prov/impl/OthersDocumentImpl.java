/*
 * An XML document type.
 * Localname: others
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.OthersDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one others(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class OthersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.OthersDocument
{
    
    public OthersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OTHERS$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "others");
    
    
    /**
     * Gets the "others" element
     */
    public org.w3.www.ns.prov.Others getOthers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Others target = null;
            target = (org.w3.www.ns.prov.Others)get_store().find_element_user(OTHERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "others" element
     */
    public void setOthers(org.w3.www.ns.prov.Others others)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Others target = null;
            target = (org.w3.www.ns.prov.Others)get_store().find_element_user(OTHERS$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Others)get_store().add_element_user(OTHERS$0);
            }
            target.set(others);
        }
    }
    
    /**
     * Appends and returns a new empty "others" element
     */
    public org.w3.www.ns.prov.Others addNewOthers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Others target = null;
            target = (org.w3.www.ns.prov.Others)get_store().add_element_user(OTHERS$0);
            return target;
        }
    }
}
