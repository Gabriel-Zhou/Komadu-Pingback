/*
 * An XML document type.
 * Localname: type
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.TypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one type(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class TypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.TypeDocument
{
    
    public TypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "type");
    
    
    /**
     * Gets the "type" element
     */
    public org.w3.www.ns.prov.Type getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Type target = null;
            target = (org.w3.www.ns.prov.Type)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.w3.www.ns.prov.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Type target = null;
            target = (org.w3.www.ns.prov.Type)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Type)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.w3.www.ns.prov.Type addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Type target = null;
            target = (org.w3.www.ns.prov.Type)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
}
