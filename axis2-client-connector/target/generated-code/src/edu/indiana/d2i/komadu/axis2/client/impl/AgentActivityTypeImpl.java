/*
 * XML Type:  agentActivityType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AgentActivityType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML agentActivityType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class AgentActivityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AgentActivityType
{
    
    public AgentActivityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENT$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "agent");
    private static final javax.xml.namespace.QName ACTIVITY$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "activity");
    private static final javax.xml.namespace.QName ASSOCIATION$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "association");
    
    
    /**
     * Gets the "agent" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AgentType getAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentType)get_store().find_element_user(AGENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "agent" element
     */
    public void setAgent(edu.indiana.d2i.komadu.axis2.client.AgentType agent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentType)get_store().find_element_user(AGENT$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AgentType)get_store().add_element_user(AGENT$0);
            }
            target.set(agent);
        }
    }
    
    /**
     * Appends and returns a new empty "agent" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AgentType addNewAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentType)get_store().add_element_user(AGENT$0);
            return target;
        }
    }
    
    /**
     * Gets the "activity" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityType getActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().find_element_user(ACTIVITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activity" element
     */
    public void setActivity(edu.indiana.d2i.komadu.axis2.client.ActivityType activity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().find_element_user(ACTIVITY$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().add_element_user(ACTIVITY$2);
            }
            target.set(activity);
        }
    }
    
    /**
     * Appends and returns a new empty "activity" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityType addNewActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().add_element_user(ACTIVITY$2);
            return target;
        }
    }
    
    /**
     * Gets the "association" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AssociationType getAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AssociationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AssociationType)get_store().find_element_user(ASSOCIATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "association" element
     */
    public void setAssociation(edu.indiana.d2i.komadu.axis2.client.AssociationType association)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AssociationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AssociationType)get_store().find_element_user(ASSOCIATION$4, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AssociationType)get_store().add_element_user(ASSOCIATION$4);
            }
            target.set(association);
        }
    }
    
    /**
     * Appends and returns a new empty "association" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AssociationType addNewAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AssociationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AssociationType)get_store().add_element_user(ASSOCIATION$4);
            return target;
        }
    }
}
