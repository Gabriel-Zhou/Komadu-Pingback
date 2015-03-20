/*
 * An XML document type.
 * Localname: getAgentGraphRequest
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetAgentGraphRequestDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one getAgentGraphRequest(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class GetAgentGraphRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetAgentGraphRequestDocument
{
    
    public GetAgentGraphRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETAGENTGRAPHREQUEST$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "getAgentGraphRequest");
    
    
    /**
     * Gets the "getAgentGraphRequest" element
     */
    public edu.indiana.d2i.komadu.query.GetAgentGraphRequestType getGetAgentGraphRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetAgentGraphRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetAgentGraphRequestType)get_store().find_element_user(GETAGENTGRAPHREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAgentGraphRequest" element
     */
    public void setGetAgentGraphRequest(edu.indiana.d2i.komadu.query.GetAgentGraphRequestType getAgentGraphRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetAgentGraphRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetAgentGraphRequestType)get_store().find_element_user(GETAGENTGRAPHREQUEST$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.GetAgentGraphRequestType)get_store().add_element_user(GETAGENTGRAPHREQUEST$0);
            }
            target.set(getAgentGraphRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "getAgentGraphRequest" element
     */
    public edu.indiana.d2i.komadu.query.GetAgentGraphRequestType addNewGetAgentGraphRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetAgentGraphRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetAgentGraphRequestType)get_store().add_element_user(GETAGENTGRAPHREQUEST$0);
            return target;
        }
    }
}
