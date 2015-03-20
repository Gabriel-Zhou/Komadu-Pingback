/*
 * XML Type:  fileType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.FileType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML fileType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class FileTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.FileType
{
    
    public FileTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILEURI$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "fileURI");
    private static final javax.xml.namespace.QName OWNERDN$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "ownerDN");
    private static final javax.xml.namespace.QName CREATEDATE$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "createDate");
    private static final javax.xml.namespace.QName SIZE$6 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "size");
    private static final javax.xml.namespace.QName MD5SUM$8 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "md5sum");
    private static final javax.xml.namespace.QName FILENAME$10 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "fileName");
    
    
    /**
     * Gets the "fileURI" element
     */
    public java.lang.String getFileURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fileURI" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetFileURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(FILEURI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fileURI" element
     */
    public void setFileURI(java.lang.String fileURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEURI$0);
            }
            target.setStringValue(fileURI);
        }
    }
    
    /**
     * Sets (as xml) the "fileURI" element
     */
    public void xsetFileURI(org.apache.xmlbeans.XmlAnyURI fileURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(FILEURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(FILEURI$0);
            }
            target.set(fileURI);
        }
    }
    
    /**
     * Gets the "ownerDN" element
     */
    public java.lang.String getOwnerDN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERDN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ownerDN" element
     */
    public org.apache.xmlbeans.XmlString xgetOwnerDN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNERDN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ownerDN" element
     */
    public boolean isSetOwnerDN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNERDN$2) != 0;
        }
    }
    
    /**
     * Sets the "ownerDN" element
     */
    public void setOwnerDN(java.lang.String ownerDN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERDN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNERDN$2);
            }
            target.setStringValue(ownerDN);
        }
    }
    
    /**
     * Sets (as xml) the "ownerDN" element
     */
    public void xsetOwnerDN(org.apache.xmlbeans.XmlString ownerDN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNERDN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OWNERDN$2);
            }
            target.set(ownerDN);
        }
    }
    
    /**
     * Unsets the "ownerDN" element
     */
    public void unsetOwnerDN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNERDN$2, 0);
        }
    }
    
    /**
     * Gets the "createDate" element
     */
    public java.util.Calendar getCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "createDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "createDate" element
     */
    public boolean isSetCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "createDate" element
     */
    public void setCreateDate(java.util.Calendar createDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDATE$4);
            }
            target.setCalendarValue(createDate);
        }
    }
    
    /**
     * Sets (as xml) the "createDate" element
     */
    public void xsetCreateDate(org.apache.xmlbeans.XmlDateTime createDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATEDATE$4);
            }
            target.set(createDate);
        }
    }
    
    /**
     * Unsets the "createDate" element
     */
    public void unsetCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDATE$4, 0);
        }
    }
    
    /**
     * Gets the "size" element
     */
    public long getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$6, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "size" element
     */
    public org.apache.xmlbeans.XmlLong xgetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SIZE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "size" element
     */
    public boolean isSetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIZE$6) != 0;
        }
    }
    
    /**
     * Sets the "size" element
     */
    public void setSize(long size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIZE$6);
            }
            target.setLongValue(size);
        }
    }
    
    /**
     * Sets (as xml) the "size" element
     */
    public void xsetSize(org.apache.xmlbeans.XmlLong size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SIZE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(SIZE$6);
            }
            target.set(size);
        }
    }
    
    /**
     * Unsets the "size" element
     */
    public void unsetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIZE$6, 0);
        }
    }
    
    /**
     * Gets the "md5sum" element
     */
    public java.lang.String getMd5Sum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MD5SUM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "md5sum" element
     */
    public org.apache.xmlbeans.XmlString xgetMd5Sum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MD5SUM$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "md5sum" element
     */
    public boolean isSetMd5Sum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MD5SUM$8) != 0;
        }
    }
    
    /**
     * Sets the "md5sum" element
     */
    public void setMd5Sum(java.lang.String md5Sum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MD5SUM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MD5SUM$8);
            }
            target.setStringValue(md5Sum);
        }
    }
    
    /**
     * Sets (as xml) the "md5sum" element
     */
    public void xsetMd5Sum(org.apache.xmlbeans.XmlString md5Sum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MD5SUM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MD5SUM$8);
            }
            target.set(md5Sum);
        }
    }
    
    /**
     * Unsets the "md5sum" element
     */
    public void unsetMd5Sum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MD5SUM$8, 0);
        }
    }
    
    /**
     * Gets the "fileName" element
     */
    public java.lang.String getFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fileName" element
     */
    public org.apache.xmlbeans.XmlString xgetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "fileName" element
     */
    public boolean isSetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILENAME$10) != 0;
        }
    }
    
    /**
     * Sets the "fileName" element
     */
    public void setFileName(java.lang.String fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILENAME$10);
            }
            target.setStringValue(fileName);
        }
    }
    
    /**
     * Sets (as xml) the "fileName" element
     */
    public void xsetFileName(org.apache.xmlbeans.XmlString fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILENAME$10);
            }
            target.set(fileName);
        }
    }
    
    /**
     * Unsets the "fileName" element
     */
    public void unsetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILENAME$10, 0);
        }
    }
}
