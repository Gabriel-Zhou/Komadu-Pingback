/*
 * An XML document type.
 * Localname: specializationOf
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.SpecializationOfDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one specializationOf(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class SpecializationOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.SpecializationOfDocument
{
    
    public SpecializationOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPECIALIZATIONOF$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "specializationOf");
    
    
    /**
     * Gets the "specializationOf" element
     */
    public org.w3.www.ns.prov.Specialization getSpecializationOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Specialization target = null;
            target = (org.w3.www.ns.prov.Specialization)get_store().find_element_user(SPECIALIZATIONOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "specializationOf" element
     */
    public void setSpecializationOf(org.w3.www.ns.prov.Specialization specializationOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Specialization target = null;
            target = (org.w3.www.ns.prov.Specialization)get_store().find_element_user(SPECIALIZATIONOF$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Specialization)get_store().add_element_user(SPECIALIZATIONOF$0);
            }
            target.set(specializationOf);
        }
    }
    
    /**
     * Appends and returns a new empty "specializationOf" element
     */
    public org.w3.www.ns.prov.Specialization addNewSpecializationOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Specialization target = null;
            target = (org.w3.www.ns.prov.Specialization)get_store().add_element_user(SPECIALIZATIONOF$0);
            return target;
        }
    }
}
