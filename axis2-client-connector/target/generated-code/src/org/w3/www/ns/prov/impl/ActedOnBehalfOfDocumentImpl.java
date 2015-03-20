/*
 * An XML document type.
 * Localname: actedOnBehalfOf
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.ActedOnBehalfOfDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one actedOnBehalfOf(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class ActedOnBehalfOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.ActedOnBehalfOfDocument
{
    
    public ActedOnBehalfOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTEDONBEHALFOF$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "actedOnBehalfOf");
    
    
    /**
     * Gets the "actedOnBehalfOf" element
     */
    public org.w3.www.ns.prov.Delegation getActedOnBehalfOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Delegation target = null;
            target = (org.w3.www.ns.prov.Delegation)get_store().find_element_user(ACTEDONBEHALFOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "actedOnBehalfOf" element
     */
    public void setActedOnBehalfOf(org.w3.www.ns.prov.Delegation actedOnBehalfOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Delegation target = null;
            target = (org.w3.www.ns.prov.Delegation)get_store().find_element_user(ACTEDONBEHALFOF$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Delegation)get_store().add_element_user(ACTEDONBEHALFOF$0);
            }
            target.set(actedOnBehalfOf);
        }
    }
    
    /**
     * Appends and returns a new empty "actedOnBehalfOf" element
     */
    public org.w3.www.ns.prov.Delegation addNewActedOnBehalfOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Delegation target = null;
            target = (org.w3.www.ns.prov.Delegation)get_store().add_element_user(ACTEDONBEHALFOF$0);
            return target;
        }
    }
}
