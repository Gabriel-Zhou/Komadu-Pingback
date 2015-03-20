/*
 * An XML document type.
 * Localname: getActivityDetailRequest
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetActivityDetailRequestDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one getActivityDetailRequest(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class GetActivityDetailRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetActivityDetailRequestDocument
{
    
    public GetActivityDetailRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETACTIVITYDETAILREQUEST$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "getActivityDetailRequest");
    
    
    /**
     * Gets the "getActivityDetailRequest" element
     */
    public edu.indiana.d2i.komadu.query.GetActivityDetailRequestType getGetActivityDetailRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetActivityDetailRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetActivityDetailRequestType)get_store().find_element_user(GETACTIVITYDETAILREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getActivityDetailRequest" element
     */
    public void setGetActivityDetailRequest(edu.indiana.d2i.komadu.query.GetActivityDetailRequestType getActivityDetailRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetActivityDetailRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetActivityDetailRequestType)get_store().find_element_user(GETACTIVITYDETAILREQUEST$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.GetActivityDetailRequestType)get_store().add_element_user(GETACTIVITYDETAILREQUEST$0);
            }
            target.set(getActivityDetailRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "getActivityDetailRequest" element
     */
    public edu.indiana.d2i.komadu.query.GetActivityDetailRequestType addNewGetActivityDetailRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetActivityDetailRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetActivityDetailRequestType)get_store().add_element_user(GETACTIVITYDETAILREQUEST$0);
            return target;
        }
    }
}
