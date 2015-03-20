/*
 * XML Type:  entityIDListType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.EntityIDListType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML entityIDListType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class EntityIDListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.EntityIDListType
{
    
    public EntityIDListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "entityID");
    
    
    /**
     * Gets array of all "entityID" elements
     */
    public java.lang.String[] getEntityIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITYID$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "entityID" element
     */
    public java.lang.String getEntityIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "entityID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetEntityIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITYID$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "entityID" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "entityID" element
     */
    public int sizeOfEntityIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYID$0);
        }
    }
    
    /**
     * Sets array of all "entityID" element
     */
    public void setEntityIDArray(java.lang.String[] entityIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entityIDArray, ENTITYID$0);
        }
    }
    
    /**
     * Sets ith "entityID" element
     */
    public void setEntityIDArray(int i, java.lang.String entityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(entityID);
        }
    }
    
    /**
     * Sets (as xml) array of all "entityID" element
     */
    public void xsetEntityIDArray(org.apache.xmlbeans.XmlString[]entityIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entityIDArray, ENTITYID$0);
        }
    }
    
    /**
     * Sets (as xml) ith "entityID" element
     */
    public void xsetEntityIDArray(int i, org.apache.xmlbeans.XmlString entityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entityID);
        }
    }
    
    /**
     * Inserts the value as the ith "entityID" element
     */
    public void insertEntityID(int i, java.lang.String entityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ENTITYID$0, i);
            target.setStringValue(entityID);
        }
    }
    
    /**
     * Appends the value as the last "entityID" element
     */
    public void addEntityID(java.lang.String entityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYID$0);
            target.setStringValue(entityID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityID" element
     */
    public org.apache.xmlbeans.XmlString insertNewEntityID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ENTITYID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entityID" element
     */
    public org.apache.xmlbeans.XmlString addNewEntityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "entityID" element
     */
    public void removeEntityID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYID$0, i);
        }
    }
}
