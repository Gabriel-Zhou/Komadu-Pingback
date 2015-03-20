/*
 * XML Type:  agentAgentType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AgentAgentType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML agentAgentType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class AgentAgentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AgentAgentType
{
    
    public AgentAgentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELEGATEAGENT$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "delegateAgent");
    private static final javax.xml.namespace.QName RESPONSIBLEAGENT$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "responsibleAgent");
    private static final javax.xml.namespace.QName DELEGATION$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "delegation");
    
    
    /**
     * Gets the "delegateAgent" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AgentType getDelegateAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentType)get_store().find_element_user(DELEGATEAGENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "delegateAgent" element
     */
    public void setDelegateAgent(edu.indiana.d2i.komadu.axis2.client.AgentType delegateAgent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentType)get_store().find_element_user(DELEGATEAGENT$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AgentType)get_store().add_element_user(DELEGATEAGENT$0);
            }
            target.set(delegateAgent);
        }
    }
    
    /**
     * Appends and returns a new empty "delegateAgent" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AgentType addNewDelegateAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentType)get_store().add_element_user(DELEGATEAGENT$0);
            return target;
        }
    }
    
    /**
     * Gets the "responsibleAgent" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AgentType getResponsibleAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentType)get_store().find_element_user(RESPONSIBLEAGENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "responsibleAgent" element
     */
    public void setResponsibleAgent(edu.indiana.d2i.komadu.axis2.client.AgentType responsibleAgent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentType)get_store().find_element_user(RESPONSIBLEAGENT$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AgentType)get_store().add_element_user(RESPONSIBLEAGENT$2);
            }
            target.set(responsibleAgent);
        }
    }
    
    /**
     * Appends and returns a new empty "responsibleAgent" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AgentType addNewResponsibleAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentType)get_store().add_element_user(RESPONSIBLEAGENT$2);
            return target;
        }
    }
    
    /**
     * Gets the "delegation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.DelegationType getDelegation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.DelegationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.DelegationType)get_store().find_element_user(DELEGATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "delegation" element
     */
    public void setDelegation(edu.indiana.d2i.komadu.axis2.client.DelegationType delegation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.DelegationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.DelegationType)get_store().find_element_user(DELEGATION$4, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.DelegationType)get_store().add_element_user(DELEGATION$4);
            }
            target.set(delegation);
        }
    }
    
    /**
     * Appends and returns a new empty "delegation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.DelegationType addNewDelegation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.DelegationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.DelegationType)get_store().add_element_user(DELEGATION$4);
            return target;
        }
    }
}
