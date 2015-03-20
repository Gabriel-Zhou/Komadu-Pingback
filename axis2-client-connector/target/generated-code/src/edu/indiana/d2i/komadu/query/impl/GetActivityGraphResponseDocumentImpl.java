/*
 * An XML document type.
 * Localname: getActivityGraphResponse
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetActivityGraphResponseDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one getActivityGraphResponse(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class GetActivityGraphResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetActivityGraphResponseDocument
{
    
    public GetActivityGraphResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETACTIVITYGRAPHRESPONSE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "getActivityGraphResponse");
    
    
    /**
     * Gets the "getActivityGraphResponse" element
     */
    public edu.indiana.d2i.komadu.query.GetActivityGraphResponseType getGetActivityGraphResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetActivityGraphResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetActivityGraphResponseType)get_store().find_element_user(GETACTIVITYGRAPHRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getActivityGraphResponse" element
     */
    public void setGetActivityGraphResponse(edu.indiana.d2i.komadu.query.GetActivityGraphResponseType getActivityGraphResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetActivityGraphResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetActivityGraphResponseType)get_store().find_element_user(GETACTIVITYGRAPHRESPONSE$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.GetActivityGraphResponseType)get_store().add_element_user(GETACTIVITYGRAPHRESPONSE$0);
            }
            target.set(getActivityGraphResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getActivityGraphResponse" element
     */
    public edu.indiana.d2i.komadu.query.GetActivityGraphResponseType addNewGetActivityGraphResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetActivityGraphResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetActivityGraphResponseType)get_store().add_element_user(GETACTIVITYGRAPHRESPONSE$0);
            return target;
        }
    }
}
