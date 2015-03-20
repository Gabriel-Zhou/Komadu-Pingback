/*
 * An XML document type.
 * Localname: value
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.ValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one value(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class ValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.ValueDocument
{
    
    public ValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "value");
    
    
    /**
     * Gets the "value" element
     */
    public org.w3.www.ns.prov.Value getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Value target = null;
            target = (org.w3.www.ns.prov.Value)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(org.w3.www.ns.prov.Value value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Value target = null;
            target = (org.w3.www.ns.prov.Value)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Value)get_store().add_element_user(VALUE$0);
            }
            target.set(value);
        }
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public org.w3.www.ns.prov.Value addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Value target = null;
            target = (org.w3.www.ns.prov.Value)get_store().add_element_user(VALUE$0);
            return target;
        }
    }
}
