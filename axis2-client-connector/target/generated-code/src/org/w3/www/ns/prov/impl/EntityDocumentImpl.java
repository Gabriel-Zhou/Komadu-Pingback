/*
 * An XML document type.
 * Localname: entity
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.EntityDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one entity(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class EntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.EntityDocument
{
    
    public EntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "entity");
    
    
    /**
     * Gets the "entity" element
     */
    public org.w3.www.ns.prov.Entity getEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Entity target = null;
            target = (org.w3.www.ns.prov.Entity)get_store().find_element_user(ENTITY$0, 0);
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
    public void setEntity(org.w3.www.ns.prov.Entity entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Entity target = null;
            target = (org.w3.www.ns.prov.Entity)get_store().find_element_user(ENTITY$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Entity)get_store().add_element_user(ENTITY$0);
            }
            target.set(entity);
        }
    }
    
    /**
     * Appends and returns a new empty "entity" element
     */
    public org.w3.www.ns.prov.Entity addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Entity target = null;
            target = (org.w3.www.ns.prov.Entity)get_store().add_element_user(ENTITY$0);
            return target;
        }
    }
}
