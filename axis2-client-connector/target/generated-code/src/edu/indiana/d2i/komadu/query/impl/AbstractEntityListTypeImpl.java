/*
 * XML Type:  abstractEntityListType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.AbstractEntityListType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML abstractEntityListType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class AbstractEntityListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.AbstractEntityListType
{
    
    public AbstractEntityListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTENTITYDETAIL$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "abstractEntityDetail");
    
    
    /**
     * Gets array of all "abstractEntityDetail" elements
     */
    public edu.indiana.d2i.komadu.query.AbstractEntityDetail[] getAbstractEntityDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTENTITYDETAIL$0, targetList);
            edu.indiana.d2i.komadu.query.AbstractEntityDetail[] result = new edu.indiana.d2i.komadu.query.AbstractEntityDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "abstractEntityDetail" element
     */
    public edu.indiana.d2i.komadu.query.AbstractEntityDetail getAbstractEntityDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.AbstractEntityDetail target = null;
            target = (edu.indiana.d2i.komadu.query.AbstractEntityDetail)get_store().find_element_user(ABSTRACTENTITYDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "abstractEntityDetail" element
     */
    public int sizeOfAbstractEntityDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTENTITYDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "abstractEntityDetail" element
     */
    public void setAbstractEntityDetailArray(edu.indiana.d2i.komadu.query.AbstractEntityDetail[] abstractEntityDetailArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(abstractEntityDetailArray, ABSTRACTENTITYDETAIL$0);
        }
    }
    
    /**
     * Sets ith "abstractEntityDetail" element
     */
    public void setAbstractEntityDetailArray(int i, edu.indiana.d2i.komadu.query.AbstractEntityDetail abstractEntityDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.AbstractEntityDetail target = null;
            target = (edu.indiana.d2i.komadu.query.AbstractEntityDetail)get_store().find_element_user(ABSTRACTENTITYDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractEntityDetail);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "abstractEntityDetail" element
     */
    public edu.indiana.d2i.komadu.query.AbstractEntityDetail insertNewAbstractEntityDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.AbstractEntityDetail target = null;
            target = (edu.indiana.d2i.komadu.query.AbstractEntityDetail)get_store().insert_element_user(ABSTRACTENTITYDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "abstractEntityDetail" element
     */
    public edu.indiana.d2i.komadu.query.AbstractEntityDetail addNewAbstractEntityDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.AbstractEntityDetail target = null;
            target = (edu.indiana.d2i.komadu.query.AbstractEntityDetail)get_store().add_element_user(ABSTRACTENTITYDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "abstractEntityDetail" element
     */
    public void removeAbstractEntityDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTENTITYDETAIL$0, i);
        }
    }
}
