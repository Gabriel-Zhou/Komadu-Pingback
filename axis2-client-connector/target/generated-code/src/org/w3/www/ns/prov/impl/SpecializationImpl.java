/*
 * XML Type:  Specialization
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.Specialization
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * An XML Specialization(@http://www.w3.org/ns/prov#).
 *
 * This is a complex type.
 */
public class SpecializationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.Specialization
{
    
    public SpecializationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPECIFICENTITY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "specificEntity");
    private static final javax.xml.namespace.QName GENERALENTITY$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "generalEntity");
    
    
    /**
     * Gets the "specificEntity" element
     */
    public org.w3.www.ns.prov.IDRef getSpecificEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(SPECIFICENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "specificEntity" element
     */
    public void setSpecificEntity(org.w3.www.ns.prov.IDRef specificEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(SPECIFICENTITY$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(SPECIFICENTITY$0);
            }
            target.set(specificEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "specificEntity" element
     */
    public org.w3.www.ns.prov.IDRef addNewSpecificEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(SPECIFICENTITY$0);
            return target;
        }
    }
    
    /**
     * Gets the "generalEntity" element
     */
    public org.w3.www.ns.prov.IDRef getGeneralEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(GENERALENTITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "generalEntity" element
     */
    public void setGeneralEntity(org.w3.www.ns.prov.IDRef generalEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(GENERALENTITY$2, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(GENERALENTITY$2);
            }
            target.set(generalEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "generalEntity" element
     */
    public org.w3.www.ns.prov.IDRef addNewGeneralEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(GENERALENTITY$2);
            return target;
        }
    }
}
