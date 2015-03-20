/*
 * An XML document type.
 * Localname: addAgentEntityRelationship
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AddAgentEntityRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * A document containing one addAgentEntityRelationship(@http://komadu.d2i.indiana.edu) element.
 *
 * This is a complex type.
 */
public class AddAgentEntityRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AddAgentEntityRelationshipDocument
{
    
    public AddAgentEntityRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDAGENTENTITYRELATIONSHIP$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "addAgentEntityRelationship");
    
    
    /**
     * Gets the "addAgentEntityRelationship" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AgentEntityType getAddAgentEntityRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentEntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentEntityType)get_store().find_element_user(ADDAGENTENTITYRELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addAgentEntityRelationship" element
     */
    public void setAddAgentEntityRelationship(edu.indiana.d2i.komadu.axis2.client.AgentEntityType addAgentEntityRelationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentEntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentEntityType)get_store().find_element_user(ADDAGENTENTITYRELATIONSHIP$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AgentEntityType)get_store().add_element_user(ADDAGENTENTITYRELATIONSHIP$0);
            }
            target.set(addAgentEntityRelationship);
        }
    }
    
    /**
     * Appends and returns a new empty "addAgentEntityRelationship" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AgentEntityType addNewAddAgentEntityRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentEntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentEntityType)get_store().add_element_user(ADDAGENTENTITYRELATIONSHIP$0);
            return target;
        }
    }
}
