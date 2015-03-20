/*
 * An XML document type.
 * Localname: wasDerivedFrom
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.WasDerivedFromDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one wasDerivedFrom(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class WasDerivedFromDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.WasDerivedFromDocument
{
    
    public WasDerivedFromDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WASDERIVEDFROM$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "wasDerivedFrom");
    
    
    /**
     * Gets the "wasDerivedFrom" element
     */
    public org.w3.www.ns.prov.Derivation getWasDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Derivation target = null;
            target = (org.w3.www.ns.prov.Derivation)get_store().find_element_user(WASDERIVEDFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wasDerivedFrom" element
     */
    public void setWasDerivedFrom(org.w3.www.ns.prov.Derivation wasDerivedFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Derivation target = null;
            target = (org.w3.www.ns.prov.Derivation)get_store().find_element_user(WASDERIVEDFROM$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Derivation)get_store().add_element_user(WASDERIVEDFROM$0);
            }
            target.set(wasDerivedFrom);
        }
    }
    
    /**
     * Appends and returns a new empty "wasDerivedFrom" element
     */
    public org.w3.www.ns.prov.Derivation addNewWasDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Derivation target = null;
            target = (org.w3.www.ns.prov.Derivation)get_store().add_element_user(WASDERIVEDFROM$0);
            return target;
        }
    }
}
