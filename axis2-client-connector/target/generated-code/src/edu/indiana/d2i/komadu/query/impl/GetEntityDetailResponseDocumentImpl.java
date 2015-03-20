/*
 * An XML document type.
 * Localname: getEntityDetailResponse
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetEntityDetailResponseDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one getEntityDetailResponse(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class GetEntityDetailResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetEntityDetailResponseDocument
{
    
    public GetEntityDetailResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETENTITYDETAILRESPONSE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "getEntityDetailResponse");
    
    
    /**
     * Gets the "getEntityDetailResponse" element
     */
    public edu.indiana.d2i.komadu.query.GetEntityDetailResponseType getGetEntityDetailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetEntityDetailResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetEntityDetailResponseType)get_store().find_element_user(GETENTITYDETAILRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEntityDetailResponse" element
     */
    public void setGetEntityDetailResponse(edu.indiana.d2i.komadu.query.GetEntityDetailResponseType getEntityDetailResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetEntityDetailResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetEntityDetailResponseType)get_store().find_element_user(GETENTITYDETAILRESPONSE$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.GetEntityDetailResponseType)get_store().add_element_user(GETENTITYDETAILRESPONSE$0);
            }
            target.set(getEntityDetailResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getEntityDetailResponse" element
     */
    public edu.indiana.d2i.komadu.query.GetEntityDetailResponseType addNewGetEntityDetailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetEntityDetailResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetEntityDetailResponseType)get_store().add_element_user(GETENTITYDETAILRESPONSE$0);
            return target;
        }
    }
}
