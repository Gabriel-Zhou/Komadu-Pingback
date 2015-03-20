/*
 * An XML document type.
 * Localname: getEntityDetailRequest
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetEntityDetailRequestDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one getEntityDetailRequest(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class GetEntityDetailRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetEntityDetailRequestDocument
{
    
    public GetEntityDetailRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETENTITYDETAILREQUEST$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "getEntityDetailRequest");
    
    
    /**
     * Gets the "getEntityDetailRequest" element
     */
    public edu.indiana.d2i.komadu.query.GetEntityDetailRequestType getGetEntityDetailRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetEntityDetailRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetEntityDetailRequestType)get_store().find_element_user(GETENTITYDETAILREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEntityDetailRequest" element
     */
    public void setGetEntityDetailRequest(edu.indiana.d2i.komadu.query.GetEntityDetailRequestType getEntityDetailRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetEntityDetailRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetEntityDetailRequestType)get_store().find_element_user(GETENTITYDETAILREQUEST$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.GetEntityDetailRequestType)get_store().add_element_user(GETENTITYDETAILREQUEST$0);
            }
            target.set(getEntityDetailRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "getEntityDetailRequest" element
     */
    public edu.indiana.d2i.komadu.query.GetEntityDetailRequestType addNewGetEntityDetailRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetEntityDetailRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetEntityDetailRequestType)get_store().add_element_user(GETENTITYDETAILREQUEST$0);
            return target;
        }
    }
}
