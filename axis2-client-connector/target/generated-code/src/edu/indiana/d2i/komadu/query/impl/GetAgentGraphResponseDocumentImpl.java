/*
 * An XML document type.
 * Localname: getAgentGraphResponse
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetAgentGraphResponseDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one getAgentGraphResponse(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class GetAgentGraphResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetAgentGraphResponseDocument
{
    
    public GetAgentGraphResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETAGENTGRAPHRESPONSE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "getAgentGraphResponse");
    
    
    /**
     * Gets the "getAgentGraphResponse" element
     */
    public edu.indiana.d2i.komadu.query.GetAgentGraphResponseType getGetAgentGraphResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetAgentGraphResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetAgentGraphResponseType)get_store().find_element_user(GETAGENTGRAPHRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAgentGraphResponse" element
     */
    public void setGetAgentGraphResponse(edu.indiana.d2i.komadu.query.GetAgentGraphResponseType getAgentGraphResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetAgentGraphResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetAgentGraphResponseType)get_store().find_element_user(GETAGENTGRAPHRESPONSE$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.GetAgentGraphResponseType)get_store().add_element_user(GETAGENTGRAPHRESPONSE$0);
            }
            target.set(getAgentGraphResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getAgentGraphResponse" element
     */
    public edu.indiana.d2i.komadu.query.GetAgentGraphResponseType addNewGetAgentGraphResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetAgentGraphResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetAgentGraphResponseType)get_store().add_element_user(GETAGENTGRAPHRESPONSE$0);
            return target;
        }
    }
}
