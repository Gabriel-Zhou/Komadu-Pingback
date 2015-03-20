/*
 * XML Type:  activityIDListType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.ActivityIDListType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML activityIDListType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class ActivityIDListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.ActivityIDListType
{
    
    public ActivityIDListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYID$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "activityID");
    
    
    /**
     * Gets array of all "activityID" elements
     */
    public java.lang.String[] getActivityIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITYID$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "activityID" element
     */
    public java.lang.String getActivityIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "activityID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetActivityIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITYID$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "activityID" element
     */
    public org.apache.xmlbeans.XmlString xgetActivityIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "activityID" element
     */
    public int sizeOfActivityIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYID$0);
        }
    }
    
    /**
     * Sets array of all "activityID" element
     */
    public void setActivityIDArray(java.lang.String[] activityIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activityIDArray, ACTIVITYID$0);
        }
    }
    
    /**
     * Sets ith "activityID" element
     */
    public void setActivityIDArray(int i, java.lang.String activityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(activityID);
        }
    }
    
    /**
     * Sets (as xml) array of all "activityID" element
     */
    public void xsetActivityIDArray(org.apache.xmlbeans.XmlString[]activityIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activityIDArray, ACTIVITYID$0);
        }
    }
    
    /**
     * Sets (as xml) ith "activityID" element
     */
    public void xsetActivityIDArray(int i, org.apache.xmlbeans.XmlString activityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activityID);
        }
    }
    
    /**
     * Inserts the value as the ith "activityID" element
     */
    public void insertActivityID(int i, java.lang.String activityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ACTIVITYID$0, i);
            target.setStringValue(activityID);
        }
    }
    
    /**
     * Appends the value as the last "activityID" element
     */
    public void addActivityID(java.lang.String activityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYID$0);
            target.setStringValue(activityID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activityID" element
     */
    public org.apache.xmlbeans.XmlString insertNewActivityID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ACTIVITYID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activityID" element
     */
    public org.apache.xmlbeans.XmlString addNewActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITYID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "activityID" element
     */
    public void removeActivityID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYID$0, i);
        }
    }
}
