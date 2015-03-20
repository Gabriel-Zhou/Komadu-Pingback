/*
 * An XML document type.
 * Localname: getEntityGraphResponse
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetEntityGraphResponseDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one getEntityGraphResponse(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class GetEntityGraphResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetEntityGraphResponseDocument
{
    
    public GetEntityGraphResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETENTITYGRAPHRESPONSE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "getEntityGraphResponse");
    
    
    /**
     * Gets the "getEntityGraphResponse" element
     */
    public edu.indiana.d2i.komadu.query.GetEntityGraphResponseType getGetEntityGraphResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetEntityGraphResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetEntityGraphResponseType)get_store().find_element_user(GETENTITYGRAPHRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEntityGraphResponse" element
     */
    public void setGetEntityGraphResponse(edu.indiana.d2i.komadu.query.GetEntityGraphResponseType getEntityGraphResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetEntityGraphResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetEntityGraphResponseType)get_store().find_element_user(GETENTITYGRAPHRESPONSE$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.GetEntityGraphResponseType)get_store().add_element_user(GETENTITYGRAPHRESPONSE$0);
            }
            target.set(getEntityGraphResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getEntityGraphResponse" element
     */
    public edu.indiana.d2i.komadu.query.GetEntityGraphResponseType addNewGetEntityGraphResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetEntityGraphResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetEntityGraphResponseType)get_store().add_element_user(GETENTITYGRAPHRESPONSE$0);
            return target;
        }
    }
}
