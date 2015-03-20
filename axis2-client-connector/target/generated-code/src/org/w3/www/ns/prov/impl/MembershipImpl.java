/*
 * XML Type:  Membership
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.Membership
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * An XML Membership(@http://www.w3.org/ns/prov#).
 *
 * This is a complex type.
 */
public class MembershipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.Membership
{
    
    public MembershipImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLLECTION$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "collection");
    private static final javax.xml.namespace.QName ENTITY$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "entity");
    
    
    /**
     * Gets the "collection" element
     */
    public org.w3.www.ns.prov.IDRef getCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(COLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "collection" element
     */
    public void setCollection(org.w3.www.ns.prov.IDRef collection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(COLLECTION$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(COLLECTION$0);
            }
            target.set(collection);
        }
    }
    
    /**
     * Appends and returns a new empty "collection" element
     */
    public org.w3.www.ns.prov.IDRef addNewCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(COLLECTION$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "entity" elements
     */
    public org.w3.www.ns.prov.IDRef[] getEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITY$2, targetList);
            org.w3.www.ns.prov.IDRef[] result = new org.w3.www.ns.prov.IDRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entity" element
     */
    public org.w3.www.ns.prov.IDRef getEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(ENTITY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entity" element
     */
    public int sizeOfEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITY$2);
        }
    }
    
    /**
     * Sets array of all "entity" element
     */
    public void setEntityArray(org.w3.www.ns.prov.IDRef[] entityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entityArray, ENTITY$2);
        }
    }
    
    /**
     * Sets ith "entity" element
     */
    public void setEntityArray(int i, org.w3.www.ns.prov.IDRef entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(ENTITY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entity" element
     */
    public org.w3.www.ns.prov.IDRef insertNewEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().insert_element_user(ENTITY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entity" element
     */
    public org.w3.www.ns.prov.IDRef addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(ENTITY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "entity" element
     */
    public void removeEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITY$2, i);
        }
    }
}
