/*
 * An XML document type.
 * Localname: label
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.LabelDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one label(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class LabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.LabelDocument
{
    
    public LabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABEL$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "label");
    
    
    /**
     * Gets the "label" element
     */
    public org.w3.www.ns.prov.InternationalizedString getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.InternationalizedString target = null;
            target = (org.w3.www.ns.prov.InternationalizedString)get_store().find_element_user(LABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "label" element
     */
    public void setLabel(org.w3.www.ns.prov.InternationalizedString label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.InternationalizedString target = null;
            target = (org.w3.www.ns.prov.InternationalizedString)get_store().find_element_user(LABEL$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.InternationalizedString)get_store().add_element_user(LABEL$0);
            }
            target.set(label);
        }
    }
    
    /**
     * Appends and returns a new empty "label" element
     */
    public org.w3.www.ns.prov.InternationalizedString addNewLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.InternationalizedString target = null;
            target = (org.w3.www.ns.prov.InternationalizedString)get_store().add_element_user(LABEL$0);
            return target;
        }
    }
}
