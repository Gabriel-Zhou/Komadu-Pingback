/*
 * An XML document type.
 * Localname: role
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.RoleDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one role(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class RoleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.RoleDocument
{
    
    public RoleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "role");
    
    
    /**
     * Gets the "role" element
     */
    public org.w3.www.ns.prov.Role getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Role target = null;
            target = (org.w3.www.ns.prov.Role)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "role" element
     */
    public void setRole(org.w3.www.ns.prov.Role role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Role target = null;
            target = (org.w3.www.ns.prov.Role)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Role)get_store().add_element_user(ROLE$0);
            }
            target.set(role);
        }
    }
    
    /**
     * Appends and returns a new empty "role" element
     */
    public org.w3.www.ns.prov.Role addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Role target = null;
            target = (org.w3.www.ns.prov.Role)get_store().add_element_user(ROLE$0);
            return target;
        }
    }
}
