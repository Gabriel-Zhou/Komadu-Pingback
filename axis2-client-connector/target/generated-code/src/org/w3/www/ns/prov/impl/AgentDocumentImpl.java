/*
 * An XML document type.
 * Localname: agent
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.AgentDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one agent(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class AgentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.AgentDocument
{
    
    public AgentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENT$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "agent");
    
    
    /**
     * Gets the "agent" element
     */
    public org.w3.www.ns.prov.Agent getAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Agent target = null;
            target = (org.w3.www.ns.prov.Agent)get_store().find_element_user(AGENT$0, 0);
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
    public void setAgent(org.w3.www.ns.prov.Agent agent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Agent target = null;
            target = (org.w3.www.ns.prov.Agent)get_store().find_element_user(AGENT$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Agent)get_store().add_element_user(AGENT$0);
            }
            target.set(agent);
        }
    }
    
    /**
     * Appends and returns a new empty "agent" element
     */
    public org.w3.www.ns.prov.Agent addNewAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Agent target = null;
            target = (org.w3.www.ns.prov.Agent)get_store().add_element_user(AGENT$0);
            return target;
        }
    }
}
