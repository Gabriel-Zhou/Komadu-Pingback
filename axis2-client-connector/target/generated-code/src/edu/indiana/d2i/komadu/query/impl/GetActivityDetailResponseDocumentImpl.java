/*
 * An XML document type.
 * Localname: getActivityDetailResponse
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetActivityDetailResponseDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one getActivityDetailResponse(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class GetActivityDetailResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetActivityDetailResponseDocument
{
    
    public GetActivityDetailResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETACTIVITYDETAILRESPONSE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "getActivityDetailResponse");
    
    
    /**
     * Gets the "getActivityDetailResponse" element
     */
    public edu.indiana.d2i.komadu.query.GetActivityDetailResponseType getGetActivityDetailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetActivityDetailResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetActivityDetailResponseType)get_store().find_element_user(GETACTIVITYDETAILRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getActivityDetailResponse" element
     */
    public void setGetActivityDetailResponse(edu.indiana.d2i.komadu.query.GetActivityDetailResponseType getActivityDetailResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetActivityDetailResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetActivityDetailResponseType)get_store().find_element_user(GETACTIVITYDETAILRESPONSE$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.GetActivityDetailResponseType)get_store().add_element_user(GETACTIVITYDETAILRESPONSE$0);
            }
            target.set(getActivityDetailResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getActivityDetailResponse" element
     */
    public edu.indiana.d2i.komadu.query.GetActivityDetailResponseType addNewGetActivityDetailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetActivityDetailResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetActivityDetailResponseType)get_store().add_element_user(GETACTIVITYDETAILRESPONSE$0);
            return target;
        }
    }
}
