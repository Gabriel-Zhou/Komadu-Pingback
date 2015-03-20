/*
 * An XML document type.
 * Localname: findEntityRequest
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.FindEntityRequestDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one findEntityRequest(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class FindEntityRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.FindEntityRequestDocument
{
    
    public FindEntityRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINDENTITYREQUEST$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "findEntityRequest");
    
    
    /**
     * Gets the "findEntityRequest" element
     */
    public edu.indiana.d2i.komadu.query.FindEntityRequestType getFindEntityRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FindEntityRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.FindEntityRequestType)get_store().find_element_user(FINDENTITYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "findEntityRequest" element
     */
    public void setFindEntityRequest(edu.indiana.d2i.komadu.query.FindEntityRequestType findEntityRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FindEntityRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.FindEntityRequestType)get_store().find_element_user(FINDENTITYREQUEST$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.FindEntityRequestType)get_store().add_element_user(FINDENTITYREQUEST$0);
            }
            target.set(findEntityRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "findEntityRequest" element
     */
    public edu.indiana.d2i.komadu.query.FindEntityRequestType addNewFindEntityRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FindEntityRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.FindEntityRequestType)get_store().add_element_user(FINDENTITYREQUEST$0);
            return target;
        }
    }
}
