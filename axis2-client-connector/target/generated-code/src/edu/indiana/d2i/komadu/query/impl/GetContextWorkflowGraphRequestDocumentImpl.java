/*
 * An XML document type.
 * Localname: getContextWorkflowGraphRequest
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetContextWorkflowGraphRequestDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one getContextWorkflowGraphRequest(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class GetContextWorkflowGraphRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetContextWorkflowGraphRequestDocument
{
    
    public GetContextWorkflowGraphRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCONTEXTWORKFLOWGRAPHREQUEST$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "getContextWorkflowGraphRequest");
    
    
    /**
     * Gets the "getContextWorkflowGraphRequest" element
     */
    public edu.indiana.d2i.komadu.query.GetContextWorkflowGraphRequestType getGetContextWorkflowGraphRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetContextWorkflowGraphRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphRequestType)get_store().find_element_user(GETCONTEXTWORKFLOWGRAPHREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getContextWorkflowGraphRequest" element
     */
    public void setGetContextWorkflowGraphRequest(edu.indiana.d2i.komadu.query.GetContextWorkflowGraphRequestType getContextWorkflowGraphRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetContextWorkflowGraphRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphRequestType)get_store().find_element_user(GETCONTEXTWORKFLOWGRAPHREQUEST$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphRequestType)get_store().add_element_user(GETCONTEXTWORKFLOWGRAPHREQUEST$0);
            }
            target.set(getContextWorkflowGraphRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "getContextWorkflowGraphRequest" element
     */
    public edu.indiana.d2i.komadu.query.GetContextWorkflowGraphRequestType addNewGetContextWorkflowGraphRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetContextWorkflowGraphRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphRequestType)get_store().add_element_user(GETCONTEXTWORKFLOWGRAPHREQUEST$0);
            return target;
        }
    }
}
