/*
 * An XML document type.
 * Localname: getEntityGraphRequest
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetEntityGraphRequestDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one getEntityGraphRequest(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class GetEntityGraphRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetEntityGraphRequestDocument
{
    
    public GetEntityGraphRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETENTITYGRAPHREQUEST$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "getEntityGraphRequest");
    
    
    /**
     * Gets the "getEntityGraphRequest" element
     */
    public edu.indiana.d2i.komadu.query.GetEntityGraphRequestType getGetEntityGraphRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetEntityGraphRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetEntityGraphRequestType)get_store().find_element_user(GETENTITYGRAPHREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEntityGraphRequest" element
     */
    public void setGetEntityGraphRequest(edu.indiana.d2i.komadu.query.GetEntityGraphRequestType getEntityGraphRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetEntityGraphRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetEntityGraphRequestType)get_store().find_element_user(GETENTITYGRAPHREQUEST$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.GetEntityGraphRequestType)get_store().add_element_user(GETENTITYGRAPHREQUEST$0);
            }
            target.set(getEntityGraphRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "getEntityGraphRequest" element
     */
    public edu.indiana.d2i.komadu.query.GetEntityGraphRequestType addNewGetEntityGraphRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetEntityGraphRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetEntityGraphRequestType)get_store().add_element_user(GETENTITYGRAPHREQUEST$0);
            return target;
        }
    }
}
