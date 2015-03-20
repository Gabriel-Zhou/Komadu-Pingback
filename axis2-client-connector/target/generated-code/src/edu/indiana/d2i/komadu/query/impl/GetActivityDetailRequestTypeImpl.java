/*
 * XML Type:  getActivityDetailRequestType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetActivityDetailRequestType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML getActivityDetailRequestType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class GetActivityDetailRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetActivityDetailRequestType
{
    
    public GetActivityDetailRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNIQUEURILIST$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "uniqueURIList");
    private static final javax.xml.namespace.QName UNIQUEIDLIST$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "uniqueIDList");
    
    
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
     * Gets the "uniqueIDList" element
     */
    public edu.indiana.d2i.komadu.query.UniqueIDListType getUniqueIDList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.UniqueIDListType target = null;
            target = (edu.indiana.d2i.komadu.query.UniqueIDListType)get_store().find_element_user(UNIQUEIDLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uniqueIDList" element
     */
    public boolean isSetUniqueIDList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUEIDLIST$2) != 0;
        }
    }
    
    /**
     * Sets the "uniqueIDList" element
     */
    public void setUniqueIDList(edu.indiana.d2i.komadu.query.UniqueIDListType uniqueIDList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.UniqueIDListType target = null;
            target = (edu.indiana.d2i.komadu.query.UniqueIDListType)get_store().find_element_user(UNIQUEIDLIST$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.UniqueIDListType)get_store().add_element_user(UNIQUEIDLIST$2);
            }
            target.set(uniqueIDList);
        }
    }
    
    /**
     * Appends and returns a new empty "uniqueIDList" element
     */
    public edu.indiana.d2i.komadu.query.UniqueIDListType addNewUniqueIDList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.UniqueIDListType target = null;
            target = (edu.indiana.d2i.komadu.query.UniqueIDListType)get_store().add_element_user(UNIQUEIDLIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "uniqueIDList" element
     */
    public void unsetUniqueIDList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUEIDLIST$2, 0);
        }
    }
}
