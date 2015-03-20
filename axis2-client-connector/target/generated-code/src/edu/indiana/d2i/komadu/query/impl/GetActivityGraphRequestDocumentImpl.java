/*
 * An XML document type.
 * Localname: getActivityGraphRequest
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetActivityGraphRequestDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one getActivityGraphRequest(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class GetActivityGraphRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetActivityGraphRequestDocument
{
    
    public GetActivityGraphRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETACTIVITYGRAPHREQUEST$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "getActivityGraphRequest");
    
    
    /**
     * Gets the "getActivityGraphRequest" element
     */
    public edu.indiana.d2i.komadu.query.GetActivityGraphRequestType getGetActivityGraphRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetActivityGraphRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetActivityGraphRequestType)get_store().find_element_user(GETACTIVITYGRAPHREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getActivityGraphRequest" element
     */
    public void setGetActivityGraphRequest(edu.indiana.d2i.komadu.query.GetActivityGraphRequestType getActivityGraphRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetActivityGraphRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetActivityGraphRequestType)get_store().find_element_user(GETACTIVITYGRAPHREQUEST$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.GetActivityGraphRequestType)get_store().add_element_user(GETACTIVITYGRAPHREQUEST$0);
            }
            target.set(getActivityGraphRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "getActivityGraphRequest" element
     */
    public edu.indiana.d2i.komadu.query.GetActivityGraphRequestType addNewGetActivityGraphRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetActivityGraphRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetActivityGraphRequestType)get_store().add_element_user(GETACTIVITYGRAPHREQUEST$0);
            return target;
        }
    }
}
