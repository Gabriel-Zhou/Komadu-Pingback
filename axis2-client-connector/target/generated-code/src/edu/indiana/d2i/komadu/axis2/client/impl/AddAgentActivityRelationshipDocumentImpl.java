/*
 * An XML document type.
 * Localname: addAgentActivityRelationship
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AddAgentActivityRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * A document containing one addAgentActivityRelationship(@http://komadu.d2i.indiana.edu) element.
 *
 * This is a complex type.
 */
public class AddAgentActivityRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AddAgentActivityRelationshipDocument
{
    
    public AddAgentActivityRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDAGENTACTIVITYRELATIONSHIP$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "addAgentActivityRelationship");
    
    
    /**
     * Gets the "addAgentActivityRelationship" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AgentActivityType getAddAgentActivityRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentActivityType)get_store().find_element_user(ADDAGENTACTIVITYRELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addAgentActivityRelationship" element
     */
    public void setAddAgentActivityRelationship(edu.indiana.d2i.komadu.axis2.client.AgentActivityType addAgentActivityRelationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentActivityType)get_store().find_element_user(ADDAGENTACTIVITYRELATIONSHIP$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AgentActivityType)get_store().add_element_user(ADDAGENTACTIVITYRELATIONSHIP$0);
            }
            target.set(addAgentActivityRelationship);
        }
    }
    
    /**
     * Appends and returns a new empty "addAgentActivityRelationship" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AgentActivityType addNewAddAgentActivityRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentActivityType)get_store().add_element_user(ADDAGENTACTIVITYRELATIONSHIP$0);
            return target;
        }
    }
}
