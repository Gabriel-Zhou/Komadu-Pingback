/*
 * An XML document type.
 * Localname: hadMember
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.HadMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one hadMember(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class HadMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.HadMemberDocument
{
    
    public HadMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HADMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "hadMember");
    
    
    /**
     * Gets the "hadMember" element
     */
    public org.w3.www.ns.prov.Membership getHadMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Membership target = null;
            target = (org.w3.www.ns.prov.Membership)get_store().find_element_user(HADMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hadMember" element
     */
    public void setHadMember(org.w3.www.ns.prov.Membership hadMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Membership target = null;
            target = (org.w3.www.ns.prov.Membership)get_store().find_element_user(HADMEMBER$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Membership)get_store().add_element_user(HADMEMBER$0);
            }
            target.set(hadMember);
        }
    }
    
    /**
     * Appends and returns a new empty "hadMember" element
     */
    public org.w3.www.ns.prov.Membership addNewHadMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Membership target = null;
            target = (org.w3.www.ns.prov.Membership)get_store().add_element_user(HADMEMBER$0);
            return target;
        }
    }
}
