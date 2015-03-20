/*
 * An XML document type.
 * Localname: organization
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.OrganizationDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one organization(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class OrganizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.OrganizationDocument
{
    
    public OrganizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATION$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "organization");
    
    
    /**
     * Gets the "organization" element
     */
    public org.w3.www.ns.prov.Organization getOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Organization target = null;
            target = (org.w3.www.ns.prov.Organization)get_store().find_element_user(ORGANIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "organization" element
     */
    public void setOrganization(org.w3.www.ns.prov.Organization organization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Organization target = null;
            target = (org.w3.www.ns.prov.Organization)get_store().find_element_user(ORGANIZATION$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Organization)get_store().add_element_user(ORGANIZATION$0);
            }
            target.set(organization);
        }
    }
    
    /**
     * Appends and returns a new empty "organization" element
     */
    public org.w3.www.ns.prov.Organization addNewOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Organization target = null;
            target = (org.w3.www.ns.prov.Organization)get_store().add_element_user(ORGANIZATION$0);
            return target;
        }
    }
}
