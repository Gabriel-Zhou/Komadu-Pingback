/*
 * An XML document type.
 * Localname: addAttributes
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AddAttributesDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * A document containing one addAttributes(@http://komadu.d2i.indiana.edu) element.
 *
 * This is a complex type.
 */
public class AddAttributesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AddAttributesDocument
{
    
    public AddAttributesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDATTRIBUTES$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "addAttributes");
    
    
    /**
     * Gets the "addAttributes" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AddAttributesType getAddAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AddAttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AddAttributesType)get_store().find_element_user(ADDATTRIBUTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addAttributes" element
     */
    public void setAddAttributes(edu.indiana.d2i.komadu.axis2.client.AddAttributesType addAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AddAttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AddAttributesType)get_store().find_element_user(ADDATTRIBUTES$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AddAttributesType)get_store().add_element_user(ADDATTRIBUTES$0);
            }
            target.set(addAttributes);
        }
    }
    
    /**
     * Appends and returns a new empty "addAttributes" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AddAttributesType addNewAddAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AddAttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AddAttributesType)get_store().add_element_user(ADDATTRIBUTES$0);
            return target;
        }
    }
}
