/*
 * XML Type:  uniqueFileListType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.UniqueFileListType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML uniqueFileListType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class UniqueFileListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.UniqueFileListType
{
    
    public UniqueFileListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILEURIDETAILSTYPE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "fileURIDetailsType");
    
    
    /**
     * Gets array of all "fileURIDetailsType" elements
     */
    public edu.indiana.d2i.komadu.query.FileURIDetailsType[] getFileURIDetailsTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILEURIDETAILSTYPE$0, targetList);
            edu.indiana.d2i.komadu.query.FileURIDetailsType[] result = new edu.indiana.d2i.komadu.query.FileURIDetailsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fileURIDetailsType" element
     */
    public edu.indiana.d2i.komadu.query.FileURIDetailsType getFileURIDetailsTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FileURIDetailsType target = null;
            target = (edu.indiana.d2i.komadu.query.FileURIDetailsType)get_store().find_element_user(FILEURIDETAILSTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fileURIDetailsType" element
     */
    public int sizeOfFileURIDetailsTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEURIDETAILSTYPE$0);
        }
    }
    
    /**
     * Sets array of all "fileURIDetailsType" element
     */
    public void setFileURIDetailsTypeArray(edu.indiana.d2i.komadu.query.FileURIDetailsType[] fileURIDetailsTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fileURIDetailsTypeArray, FILEURIDETAILSTYPE$0);
        }
    }
    
    /**
     * Sets ith "fileURIDetailsType" element
     */
    public void setFileURIDetailsTypeArray(int i, edu.indiana.d2i.komadu.query.FileURIDetailsType fileURIDetailsType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FileURIDetailsType target = null;
            target = (edu.indiana.d2i.komadu.query.FileURIDetailsType)get_store().find_element_user(FILEURIDETAILSTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fileURIDetailsType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fileURIDetailsType" element
     */
    public edu.indiana.d2i.komadu.query.FileURIDetailsType insertNewFileURIDetailsType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FileURIDetailsType target = null;
            target = (edu.indiana.d2i.komadu.query.FileURIDetailsType)get_store().insert_element_user(FILEURIDETAILSTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fileURIDetailsType" element
     */
    public edu.indiana.d2i.komadu.query.FileURIDetailsType addNewFileURIDetailsType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FileURIDetailsType target = null;
            target = (edu.indiana.d2i.komadu.query.FileURIDetailsType)get_store().add_element_user(FILEURIDETAILSTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "fileURIDetailsType" element
     */
    public void removeFileURIDetailsType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEURIDETAILSTYPE$0, i);
        }
    }
}
