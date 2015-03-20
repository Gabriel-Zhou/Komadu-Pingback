/*
 * XML Type:  abstractServiceDetailListType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.AbstractServiceDetailListType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML abstractServiceDetailListType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class AbstractServiceDetailListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.AbstractServiceDetailListType
{
    
    public AbstractServiceDetailListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTSERVICEDETAIL$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "abstractServiceDetail");
    
    
    /**
     * Gets array of all "abstractServiceDetail" elements
     */
    public edu.indiana.d2i.komadu.query.AbstractServiceDetail[] getAbstractServiceDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTSERVICEDETAIL$0, targetList);
            edu.indiana.d2i.komadu.query.AbstractServiceDetail[] result = new edu.indiana.d2i.komadu.query.AbstractServiceDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "abstractServiceDetail" element
     */
    public edu.indiana.d2i.komadu.query.AbstractServiceDetail getAbstractServiceDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.AbstractServiceDetail target = null;
            target = (edu.indiana.d2i.komadu.query.AbstractServiceDetail)get_store().find_element_user(ABSTRACTSERVICEDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "abstractServiceDetail" element
     */
    public int sizeOfAbstractServiceDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTSERVICEDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "abstractServiceDetail" element
     */
    public void setAbstractServiceDetailArray(edu.indiana.d2i.komadu.query.AbstractServiceDetail[] abstractServiceDetailArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(abstractServiceDetailArray, ABSTRACTSERVICEDETAIL$0);
        }
    }
    
    /**
     * Sets ith "abstractServiceDetail" element
     */
    public void setAbstractServiceDetailArray(int i, edu.indiana.d2i.komadu.query.AbstractServiceDetail abstractServiceDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.AbstractServiceDetail target = null;
            target = (edu.indiana.d2i.komadu.query.AbstractServiceDetail)get_store().find_element_user(ABSTRACTSERVICEDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractServiceDetail);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "abstractServiceDetail" element
     */
    public edu.indiana.d2i.komadu.query.AbstractServiceDetail insertNewAbstractServiceDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.AbstractServiceDetail target = null;
            target = (edu.indiana.d2i.komadu.query.AbstractServiceDetail)get_store().insert_element_user(ABSTRACTSERVICEDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "abstractServiceDetail" element
     */
    public edu.indiana.d2i.komadu.query.AbstractServiceDetail addNewAbstractServiceDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.AbstractServiceDetail target = null;
            target = (edu.indiana.d2i.komadu.query.AbstractServiceDetail)get_store().add_element_user(ABSTRACTSERVICEDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "abstractServiceDetail" element
     */
    public void removeAbstractServiceDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTSERVICEDETAIL$0, i);
        }
    }
}
