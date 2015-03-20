/*
 * XML Type:  entityDetailListType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.EntityDetailListType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML entityDetailListType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class EntityDetailListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.EntityDetailListType
{
    
    public EntityDetailListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYDETAIL$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "entityDetail");
    
    
    /**
     * Gets array of all "entityDetail" elements
     */
    public edu.indiana.d2i.komadu.query.EntityDetail[] getEntityDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITYDETAIL$0, targetList);
            edu.indiana.d2i.komadu.query.EntityDetail[] result = new edu.indiana.d2i.komadu.query.EntityDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entityDetail" element
     */
    public edu.indiana.d2i.komadu.query.EntityDetail getEntityDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityDetail target = null;
            target = (edu.indiana.d2i.komadu.query.EntityDetail)get_store().find_element_user(ENTITYDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entityDetail" element
     */
    public int sizeOfEntityDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "entityDetail" element
     */
    public void setEntityDetailArray(edu.indiana.d2i.komadu.query.EntityDetail[] entityDetailArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entityDetailArray, ENTITYDETAIL$0);
        }
    }
    
    /**
     * Sets ith "entityDetail" element
     */
    public void setEntityDetailArray(int i, edu.indiana.d2i.komadu.query.EntityDetail entityDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityDetail target = null;
            target = (edu.indiana.d2i.komadu.query.EntityDetail)get_store().find_element_user(ENTITYDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entityDetail);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityDetail" element
     */
    public edu.indiana.d2i.komadu.query.EntityDetail insertNewEntityDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityDetail target = null;
            target = (edu.indiana.d2i.komadu.query.EntityDetail)get_store().insert_element_user(ENTITYDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entityDetail" element
     */
    public edu.indiana.d2i.komadu.query.EntityDetail addNewEntityDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityDetail target = null;
            target = (edu.indiana.d2i.komadu.query.EntityDetail)get_store().add_element_user(ENTITYDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "entityDetail" element
     */
    public void removeEntityDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYDETAIL$0, i);
        }
    }
}
