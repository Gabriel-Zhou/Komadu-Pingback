/*
 * An XML document type.
 * Localname: softwareAgent
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.SoftwareAgentDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one softwareAgent(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class SoftwareAgentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.SoftwareAgentDocument
{
    
    public SoftwareAgentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOFTWAREAGENT$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "softwareAgent");
    
    
    /**
     * Gets the "softwareAgent" element
     */
    public org.w3.www.ns.prov.SoftwareAgent getSoftwareAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.SoftwareAgent target = null;
            target = (org.w3.www.ns.prov.SoftwareAgent)get_store().find_element_user(SOFTWAREAGENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "softwareAgent" element
     */
    public void setSoftwareAgent(org.w3.www.ns.prov.SoftwareAgent softwareAgent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.SoftwareAgent target = null;
            target = (org.w3.www.ns.prov.SoftwareAgent)get_store().find_element_user(SOFTWAREAGENT$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.SoftwareAgent)get_store().add_element_user(SOFTWAREAGENT$0);
            }
            target.set(softwareAgent);
        }
    }
    
    /**
     * Appends and returns a new empty "softwareAgent" element
     */
    public org.w3.www.ns.prov.SoftwareAgent addNewSoftwareAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.SoftwareAgent target = null;
            target = (org.w3.www.ns.prov.SoftwareAgent)get_store().add_element_user(SOFTWAREAGENT$0);
            return target;
        }
    }
}
