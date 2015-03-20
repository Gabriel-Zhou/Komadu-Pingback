/*
 * XML Type:  entityNameListType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.EntityNameListType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML entityNameListType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class EntityNameListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.EntityNameListType
{
    
    public EntityNameListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYNAME$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "entityName");
    
    
    /**
     * Gets array of all "entityName" elements
     */
    public java.lang.String[] getEntityNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITYNAME$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "entityName" element
     */
    public java.lang.String getEntityNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "entityName" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetEntityNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITYNAME$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "entityName" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "entityName" element
     */
    public int sizeOfEntityNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYNAME$0);
        }
    }
    
    /**
     * Sets array of all "entityName" element
     */
    public void setEntityNameArray(java.lang.String[] entityNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entityNameArray, ENTITYNAME$0);
        }
    }
    
    /**
     * Sets ith "entityName" element
     */
    public void setEntityNameArray(int i, java.lang.String entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(entityName);
        }
    }
    
    /**
     * Sets (as xml) array of all "entityName" element
     */
    public void xsetEntityNameArray(org.apache.xmlbeans.XmlString[]entityNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entityNameArray, ENTITYNAME$0);
        }
    }
    
    /**
     * Sets (as xml) ith "entityName" element
     */
    public void xsetEntityNameArray(int i, org.apache.xmlbeans.XmlString entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entityName);
        }
    }
    
    /**
     * Inserts the value as the ith "entityName" element
     */
    public void insertEntityName(int i, java.lang.String entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ENTITYNAME$0, i);
            target.setStringValue(entityName);
        }
    }
    
    /**
     * Appends the value as the last "entityName" element
     */
    public void addEntityName(java.lang.String entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYNAME$0);
            target.setStringValue(entityName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityName" element
     */
    public org.apache.xmlbeans.XmlString insertNewEntityName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ENTITYNAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entityName" element
     */
    public org.apache.xmlbeans.XmlString addNewEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "entityName" element
     */
    public void removeEntityName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYNAME$0, i);
        }
    }
}
