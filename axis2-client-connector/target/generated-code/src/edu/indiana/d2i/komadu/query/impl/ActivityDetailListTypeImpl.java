/*
 * XML Type:  activityDetailListType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.ActivityDetailListType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML activityDetailListType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class ActivityDetailListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.ActivityDetailListType
{
    
    public ActivityDetailListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYDETAIL$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "activityDetail");
    
    
    /**
     * Gets array of all "activityDetail" elements
     */
    public edu.indiana.d2i.komadu.query.ActivityDetail[] getActivityDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITYDETAIL$0, targetList);
            edu.indiana.d2i.komadu.query.ActivityDetail[] result = new edu.indiana.d2i.komadu.query.ActivityDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "activityDetail" element
     */
    public edu.indiana.d2i.komadu.query.ActivityDetail getActivityDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.ActivityDetail target = null;
            target = (edu.indiana.d2i.komadu.query.ActivityDetail)get_store().find_element_user(ACTIVITYDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "activityDetail" element
     */
    public int sizeOfActivityDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "activityDetail" element
     */
    public void setActivityDetailArray(edu.indiana.d2i.komadu.query.ActivityDetail[] activityDetailArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activityDetailArray, ACTIVITYDETAIL$0);
        }
    }
    
    /**
     * Sets ith "activityDetail" element
     */
    public void setActivityDetailArray(int i, edu.indiana.d2i.komadu.query.ActivityDetail activityDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.ActivityDetail target = null;
            target = (edu.indiana.d2i.komadu.query.ActivityDetail)get_store().find_element_user(ACTIVITYDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activityDetail);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activityDetail" element
     */
    public edu.indiana.d2i.komadu.query.ActivityDetail insertNewActivityDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.ActivityDetail target = null;
            target = (edu.indiana.d2i.komadu.query.ActivityDetail)get_store().insert_element_user(ACTIVITYDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activityDetail" element
     */
    public edu.indiana.d2i.komadu.query.ActivityDetail addNewActivityDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.ActivityDetail target = null;
            target = (edu.indiana.d2i.komadu.query.ActivityDetail)get_store().add_element_user(ACTIVITYDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "activityDetail" element
     */
    public void removeActivityDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYDETAIL$0, i);
        }
    }
}
