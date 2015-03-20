/*
 * XML Type:  findActivityResponseType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.FindActivityResponseType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML findActivityResponseType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class FindActivityResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.FindActivityResponseType
{
    
    public FindActivityResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNIQUEURILIST$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "uniqueURIList");
    private static final javax.xml.namespace.QName ACTIVITYIDLIST$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "activityIDList");
    
    
    /**
     * Gets the "uniqueURIList" element
     */
    public edu.indiana.d2i.komadu.query.UniqueURIListType getUniqueURIList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.UniqueURIListType target = null;
            target = (edu.indiana.d2i.komadu.query.UniqueURIListType)get_store().find_element_user(UNIQUEURILIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uniqueURIList" element
     */
    public boolean isSetUniqueURIList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUEURILIST$0) != 0;
        }
    }
    
    /**
     * Sets the "uniqueURIList" element
     */
    public void setUniqueURIList(edu.indiana.d2i.komadu.query.UniqueURIListType uniqueURIList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.UniqueURIListType target = null;
            target = (edu.indiana.d2i.komadu.query.UniqueURIListType)get_store().find_element_user(UNIQUEURILIST$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.UniqueURIListType)get_store().add_element_user(UNIQUEURILIST$0);
            }
            target.set(uniqueURIList);
        }
    }
    
    /**
     * Appends and returns a new empty "uniqueURIList" element
     */
    public edu.indiana.d2i.komadu.query.UniqueURIListType addNewUniqueURIList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.UniqueURIListType target = null;
            target = (edu.indiana.d2i.komadu.query.UniqueURIListType)get_store().add_element_user(UNIQUEURILIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "uniqueURIList" element
     */
    public void unsetUniqueURIList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUEURILIST$0, 0);
        }
    }
    
    /**
     * Gets the "activityIDList" element
     */
    public edu.indiana.d2i.komadu.query.ActivityIDListType getActivityIDList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.ActivityIDListType target = null;
            target = (edu.indiana.d2i.komadu.query.ActivityIDListType)get_store().find_element_user(ACTIVITYIDLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "activityIDList" element
     */
    public boolean isSetActivityIDList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYIDLIST$2) != 0;
        }
    }
    
    /**
     * Sets the "activityIDList" element
     */
    public void setActivityIDList(edu.indiana.d2i.komadu.query.ActivityIDListType activityIDList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.ActivityIDListType target = null;
            target = (edu.indiana.d2i.komadu.query.ActivityIDListType)get_store().find_element_user(ACTIVITYIDLIST$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.ActivityIDListType)get_store().add_element_user(ACTIVITYIDLIST$2);
            }
            target.set(activityIDList);
        }
    }
    
    /**
     * Appends and returns a new empty "activityIDList" element
     */
    public edu.indiana.d2i.komadu.query.ActivityIDListType addNewActivityIDList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.ActivityIDListType target = null;
            target = (edu.indiana.d2i.komadu.query.ActivityIDListType)get_store().add_element_user(ACTIVITYIDLIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "activityIDList" element
     */
    public void unsetActivityIDList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYIDLIST$2, 0);
        }
    }
}
