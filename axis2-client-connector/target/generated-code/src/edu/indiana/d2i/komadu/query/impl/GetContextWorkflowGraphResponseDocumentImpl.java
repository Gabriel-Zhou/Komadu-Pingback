/*
 * An XML document type.
 * Localname: getContextWorkflowGraphResponse
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one getContextWorkflowGraphResponse(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class GetContextWorkflowGraphResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument
{
    
    public GetContextWorkflowGraphResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCONTEXTWORKFLOWGRAPHRESPONSE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "getContextWorkflowGraphResponse");
    
    
    /**
     * Gets the "getContextWorkflowGraphResponse" element
     */
    public edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseType getGetContextWorkflowGraphResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseType)get_store().find_element_user(GETCONTEXTWORKFLOWGRAPHRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getContextWorkflowGraphResponse" element
     */
    public void setGetContextWorkflowGraphResponse(edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseType getContextWorkflowGraphResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseType)get_store().find_element_user(GETCONTEXTWORKFLOWGRAPHRESPONSE$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseType)get_store().add_element_user(GETCONTEXTWORKFLOWGRAPHRESPONSE$0);
            }
            target.set(getContextWorkflowGraphResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getContextWorkflowGraphResponse" element
     */
    public edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseType addNewGetContextWorkflowGraphResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseType)get_store().add_element_user(GETCONTEXTWORKFLOWGRAPHRESPONSE$0);
            return target;
        }
    }
}
