/*
 * XML Type:  agentEntityType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AgentEntityType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML agentEntityType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class AgentEntityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AgentEntityType
{
    
    public AgentEntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENT$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "agent");
    private static final javax.xml.namespace.QName ENTITY$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "entity");
    private static final javax.xml.namespace.QName ATTRIBUTION$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "attribution");
    
    
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
     * Gets the "entity" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityType getEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().find_element_user(ENTITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entity" element
     */
    public void setEntity(edu.indiana.d2i.komadu.axis2.client.EntityType entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().find_element_user(ENTITY$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().add_element_user(ENTITY$2);
            }
            target.set(entity);
        }
    }
    
    /**
     * Appends and returns a new empty "entity" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityType addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().add_element_user(ENTITY$2);
            return target;
        }
    }
    
    /**
     * Gets the "attribution" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AttributionType getAttribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributionType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributionType)get_store().find_element_user(ATTRIBUTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "attribution" element
     */
    public void setAttribution(edu.indiana.d2i.komadu.axis2.client.AttributionType attribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributionType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributionType)get_store().find_element_user(ATTRIBUTION$4, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AttributionType)get_store().add_element_user(ATTRIBUTION$4);
            }
            target.set(attribution);
        }
    }
    
    /**
     * Appends and returns a new empty "attribution" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AttributionType addNewAttribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributionType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributionType)get_store().add_element_user(ATTRIBUTION$4);
            return target;
        }
    }
}
