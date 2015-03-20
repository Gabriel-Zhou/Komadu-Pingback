/*
 * XML Type:  entityTypeListType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.EntityTypeListType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML entityTypeListType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class EntityTypeListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.EntityTypeListType
{
    
    public EntityTypeListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYTYPE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "entityType");
    
    
    /**
     * Gets array of all "entityType" elements
     */
    public edu.indiana.d2i.komadu.query.EntityEnumType.Enum[] getEntityTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITYTYPE$0, targetList);
            edu.indiana.d2i.komadu.query.EntityEnumType.Enum[] result = new edu.indiana.d2i.komadu.query.EntityEnumType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (edu.indiana.d2i.komadu.query.EntityEnumType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "entityType" element
     */
    public edu.indiana.d2i.komadu.query.EntityEnumType.Enum getEntityTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (edu.indiana.d2i.komadu.query.EntityEnumType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "entityType" elements
     */
    public edu.indiana.d2i.komadu.query.EntityEnumType[] xgetEntityTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITYTYPE$0, targetList);
            edu.indiana.d2i.komadu.query.EntityEnumType[] result = new edu.indiana.d2i.komadu.query.EntityEnumType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "entityType" element
     */
    public edu.indiana.d2i.komadu.query.EntityEnumType xgetEntityTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityEnumType target = null;
            target = (edu.indiana.d2i.komadu.query.EntityEnumType)get_store().find_element_user(ENTITYTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (edu.indiana.d2i.komadu.query.EntityEnumType)target;
        }
    }
    
    /**
     * Returns number of "entityType" element
     */
    public int sizeOfEntityTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYTYPE$0);
        }
    }
    
    /**
     * Sets array of all "entityType" element
     */
    public void setEntityTypeArray(edu.indiana.d2i.komadu.query.EntityEnumType.Enum[] entityTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entityTypeArray, ENTITYTYPE$0);
        }
    }
    
    /**
     * Sets ith "entityType" element
     */
    public void setEntityTypeArray(int i, edu.indiana.d2i.komadu.query.EntityEnumType.Enum entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(entityType);
        }
    }
    
    /**
     * Sets (as xml) array of all "entityType" element
     */
    public void xsetEntityTypeArray(edu.indiana.d2i.komadu.query.EntityEnumType[]entityTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entityTypeArray, ENTITYTYPE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "entityType" element
     */
    public void xsetEntityTypeArray(int i, edu.indiana.d2i.komadu.query.EntityEnumType entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityEnumType target = null;
            target = (edu.indiana.d2i.komadu.query.EntityEnumType)get_store().find_element_user(ENTITYTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entityType);
        }
    }
    
    /**
     * Inserts the value as the ith "entityType" element
     */
    public void insertEntityType(int i, edu.indiana.d2i.komadu.query.EntityEnumType.Enum entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ENTITYTYPE$0, i);
            target.setEnumValue(entityType);
        }
    }
    
    /**
     * Appends the value as the last "entityType" element
     */
    public void addEntityType(edu.indiana.d2i.komadu.query.EntityEnumType.Enum entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYTYPE$0);
            target.setEnumValue(entityType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityType" element
     */
    public edu.indiana.d2i.komadu.query.EntityEnumType insertNewEntityType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityEnumType target = null;
            target = (edu.indiana.d2i.komadu.query.EntityEnumType)get_store().insert_element_user(ENTITYTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entityType" element
     */
    public edu.indiana.d2i.komadu.query.EntityEnumType addNewEntityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityEnumType target = null;
            target = (edu.indiana.d2i.komadu.query.EntityEnumType)get_store().add_element_user(ENTITYTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "entityType" element
     */
    public void removeEntityType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYTYPE$0, i);
        }
    }
}
