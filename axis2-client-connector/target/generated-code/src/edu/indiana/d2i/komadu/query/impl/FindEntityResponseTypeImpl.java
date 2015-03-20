/*
 * XML Type:  findEntityResponseType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.FindEntityResponseType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML findEntityResponseType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class FindEntityResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.FindEntityResponseType
{
    
    public FindEntityResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNIQUEBLOCKIDLIST$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "uniqueBlockIDList");
    private static final javax.xml.namespace.QName UNIQUEFILEURILIST$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "uniqueFileURIList");
    
    
    /**
     * Gets the "uniqueBlockIDList" element
     */
    public edu.indiana.d2i.komadu.query.UniqueIDListType getUniqueBlockIDList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.UniqueIDListType target = null;
            target = (edu.indiana.d2i.komadu.query.UniqueIDListType)get_store().find_element_user(UNIQUEBLOCKIDLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uniqueBlockIDList" element
     */
    public boolean isSetUniqueBlockIDList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUEBLOCKIDLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "uniqueBlockIDList" element
     */
    public void setUniqueBlockIDList(edu.indiana.d2i.komadu.query.UniqueIDListType uniqueBlockIDList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.UniqueIDListType target = null;
            target = (edu.indiana.d2i.komadu.query.UniqueIDListType)get_store().find_element_user(UNIQUEBLOCKIDLIST$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.UniqueIDListType)get_store().add_element_user(UNIQUEBLOCKIDLIST$0);
            }
            target.set(uniqueBlockIDList);
        }
    }
    
    /**
     * Appends and returns a new empty "uniqueBlockIDList" element
     */
    public edu.indiana.d2i.komadu.query.UniqueIDListType addNewUniqueBlockIDList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.UniqueIDListType target = null;
            target = (edu.indiana.d2i.komadu.query.UniqueIDListType)get_store().add_element_user(UNIQUEBLOCKIDLIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "uniqueBlockIDList" element
     */
    public void unsetUniqueBlockIDList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUEBLOCKIDLIST$0, 0);
        }
    }
    
    /**
     * Gets the "uniqueFileURIList" element
     */
    public edu.indiana.d2i.komadu.query.UniqueFileListType getUniqueFileURIList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.UniqueFileListType target = null;
            target = (edu.indiana.d2i.komadu.query.UniqueFileListType)get_store().find_element_user(UNIQUEFILEURILIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uniqueFileURIList" element
     */
    public boolean isSetUniqueFileURIList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUEFILEURILIST$2) != 0;
        }
    }
    
    /**
     * Sets the "uniqueFileURIList" element
     */
    public void setUniqueFileURIList(edu.indiana.d2i.komadu.query.UniqueFileListType uniqueFileURIList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.UniqueFileListType target = null;
            target = (edu.indiana.d2i.komadu.query.UniqueFileListType)get_store().find_element_user(UNIQUEFILEURILIST$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.UniqueFileListType)get_store().add_element_user(UNIQUEFILEURILIST$2);
            }
            target.set(uniqueFileURIList);
        }
    }
    
    /**
     * Appends and returns a new empty "uniqueFileURIList" element
     */
    public edu.indiana.d2i.komadu.query.UniqueFileListType addNewUniqueFileURIList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.UniqueFileListType target = null;
            target = (edu.indiana.d2i.komadu.query.UniqueFileListType)get_store().add_element_user(UNIQUEFILEURILIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "uniqueFileURIList" element
     */
    public void unsetUniqueFileURIList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUEFILEURILIST$2, 0);
        }
    }
}
