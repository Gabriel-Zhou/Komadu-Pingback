/*
 * An XML document type.
 * Localname: addAgentAgentRelationship
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AddAgentAgentRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * A document containing one addAgentAgentRelationship(@http://komadu.d2i.indiana.edu) element.
 *
 * This is a complex type.
 */
public class AddAgentAgentRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AddAgentAgentRelationshipDocument
{
    
    public AddAgentAgentRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDAGENTAGENTRELATIONSHIP$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "addAgentAgentRelationship");
    
    
    /**
     * Gets the "addAgentAgentRelationship" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AgentAgentType getAddAgentAgentRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentAgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentAgentType)get_store().find_element_user(ADDAGENTAGENTRELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addAgentAgentRelationship" element
     */
    public void setAddAgentAgentRelationship(edu.indiana.d2i.komadu.axis2.client.AgentAgentType addAgentAgentRelationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentAgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentAgentType)get_store().find_element_user(ADDAGENTAGENTRELATIONSHIP$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AgentAgentType)get_store().add_element_user(ADDAGENTAGENTRELATIONSHIP$0);
            }
            target.set(addAgentAgentRelationship);
        }
    }
    
    /**
     * Appends and returns a new empty "addAgentAgentRelationship" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AgentAgentType addNewAddAgentAgentRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentAgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentAgentType)get_store().add_element_user(ADDAGENTAGENTRELATIONSHIP$0);
            return target;
        }
    }
}
