/*
 * XML Type:  findEntityRequestType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.FindEntityRequestType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML findEntityRequestType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class FindEntityRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.FindEntityRequestType
{
    
    public FindEntityRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLOCKNAME$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "blockName");
    private static final javax.xml.namespace.QName BLOCKCONTENT$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "blockContent");
    private static final javax.xml.namespace.QName BLOCKMD5CHECKSUM$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "blockMD5Checksum");
    private static final javax.xml.namespace.QName BLOCKSIZE$6 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "blockSize");
    private static final javax.xml.namespace.QName FILENAME$8 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "fileName");
    private static final javax.xml.namespace.QName FILEURI$10 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "fileURI");
    private static final javax.xml.namespace.QName FILEOWNERID$12 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "fileOwnerID");
    private static final javax.xml.namespace.QName FILECREATIONDATE$14 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "fileCreationDate");
    private static final javax.xml.namespace.QName FILEMD5CHECKSUM$16 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "fileMD5Checksum");
    private static final javax.xml.namespace.QName FILESIZE$18 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "fileSize");
    
    
    /**
     * Gets the "blockName" element
     */
    public java.lang.String getBlockName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "blockName" element
     */
    public org.apache.xmlbeans.XmlString xgetBlockName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BLOCKNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "blockName" element
     */
    public boolean isSetBlockName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLOCKNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "blockName" element
     */
    public void setBlockName(java.lang.String blockName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLOCKNAME$0);
            }
            target.setStringValue(blockName);
        }
    }
    
    /**
     * Sets (as xml) the "blockName" element
     */
    public void xsetBlockName(org.apache.xmlbeans.XmlString blockName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BLOCKNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BLOCKNAME$0);
            }
            target.set(blockName);
        }
    }
    
    /**
     * Unsets the "blockName" element
     */
    public void unsetBlockName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLOCKNAME$0, 0);
        }
    }
    
    /**
     * Gets the "blockContent" element
     */
    public java.lang.String getBlockContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKCONTENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "blockContent" element
     */
    public org.apache.xmlbeans.XmlString xgetBlockContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BLOCKCONTENT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "blockContent" element
     */
    public boolean isSetBlockContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLOCKCONTENT$2) != 0;
        }
    }
    
    /**
     * Sets the "blockContent" element
     */
    public void setBlockContent(java.lang.String blockContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKCONTENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLOCKCONTENT$2);
            }
            target.setStringValue(blockContent);
        }
    }
    
    /**
     * Sets (as xml) the "blockContent" element
     */
    public void xsetBlockContent(org.apache.xmlbeans.XmlString blockContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BLOCKCONTENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BLOCKCONTENT$2);
            }
            target.set(blockContent);
        }
    }
    
    /**
     * Unsets the "blockContent" element
     */
    public void unsetBlockContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLOCKCONTENT$2, 0);
        }
    }
    
    /**
     * Gets the "blockMD5Checksum" element
     */
    public java.lang.String getBlockMD5Checksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKMD5CHECKSUM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "blockMD5Checksum" element
     */
    public org.apache.xmlbeans.XmlString xgetBlockMD5Checksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BLOCKMD5CHECKSUM$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "blockMD5Checksum" element
     */
    public boolean isSetBlockMD5Checksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLOCKMD5CHECKSUM$4) != 0;
        }
    }
    
    /**
     * Sets the "blockMD5Checksum" element
     */
    public void setBlockMD5Checksum(java.lang.String blockMD5Checksum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKMD5CHECKSUM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLOCKMD5CHECKSUM$4);
            }
            target.setStringValue(blockMD5Checksum);
        }
    }
    
    /**
     * Sets (as xml) the "blockMD5Checksum" element
     */
    public void xsetBlockMD5Checksum(org.apache.xmlbeans.XmlString blockMD5Checksum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BLOCKMD5CHECKSUM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BLOCKMD5CHECKSUM$4);
            }
            target.set(blockMD5Checksum);
        }
    }
    
    /**
     * Unsets the "blockMD5Checksum" element
     */
    public void unsetBlockMD5Checksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLOCKMD5CHECKSUM$4, 0);
        }
    }
    
    /**
     * Gets the "blockSize" element
     */
    public long getBlockSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKSIZE$6, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "blockSize" element
     */
    public org.apache.xmlbeans.XmlLong xgetBlockSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BLOCKSIZE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "blockSize" element
     */
    public boolean isSetBlockSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLOCKSIZE$6) != 0;
        }
    }
    
    /**
     * Sets the "blockSize" element
     */
    public void setBlockSize(long blockSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKSIZE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLOCKSIZE$6);
            }
            target.setLongValue(blockSize);
        }
    }
    
    /**
     * Sets (as xml) the "blockSize" element
     */
    public void xsetBlockSize(org.apache.xmlbeans.XmlLong blockSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BLOCKSIZE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(BLOCKSIZE$6);
            }
            target.set(blockSize);
        }
    }
    
    /**
     * Unsets the "blockSize" element
     */
    public void unsetBlockSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLOCKSIZE$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$8, 0);
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
            return get_store().count_elements(FILENAME$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILENAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILENAME$8);
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
            get_store().remove_element(FILENAME$8, 0);
        }
    }
    
    /**
     * Gets the "fileURI" element
     */
    public java.lang.String getFileURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEURI$10, 0);
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
    public org.apache.xmlbeans.XmlString xgetFileURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILEURI$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "fileURI" element
     */
    public boolean isSetFileURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEURI$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEURI$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEURI$10);
            }
            target.setStringValue(fileURI);
        }
    }
    
    /**
     * Sets (as xml) the "fileURI" element
     */
    public void xsetFileURI(org.apache.xmlbeans.XmlString fileURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILEURI$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILEURI$10);
            }
            target.set(fileURI);
        }
    }
    
    /**
     * Unsets the "fileURI" element
     */
    public void unsetFileURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEURI$10, 0);
        }
    }
    
    /**
     * Gets the "fileOwnerID" element
     */
    public java.lang.String getFileOwnerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEOWNERID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fileOwnerID" element
     */
    public org.apache.xmlbeans.XmlString xgetFileOwnerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILEOWNERID$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "fileOwnerID" element
     */
    public boolean isSetFileOwnerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEOWNERID$12) != 0;
        }
    }
    
    /**
     * Sets the "fileOwnerID" element
     */
    public void setFileOwnerID(java.lang.String fileOwnerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEOWNERID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEOWNERID$12);
            }
            target.setStringValue(fileOwnerID);
        }
    }
    
    /**
     * Sets (as xml) the "fileOwnerID" element
     */
    public void xsetFileOwnerID(org.apache.xmlbeans.XmlString fileOwnerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILEOWNERID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILEOWNERID$12);
            }
            target.set(fileOwnerID);
        }
    }
    
    /**
     * Unsets the "fileOwnerID" element
     */
    public void unsetFileOwnerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEOWNERID$12, 0);
        }
    }
    
    /**
     * Gets the "fileCreationDate" element
     */
    public java.util.Calendar getFileCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILECREATIONDATE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "fileCreationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetFileCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FILECREATIONDATE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "fileCreationDate" element
     */
    public boolean isSetFileCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILECREATIONDATE$14) != 0;
        }
    }
    
    /**
     * Sets the "fileCreationDate" element
     */
    public void setFileCreationDate(java.util.Calendar fileCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILECREATIONDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILECREATIONDATE$14);
            }
            target.setCalendarValue(fileCreationDate);
        }
    }
    
    /**
     * Sets (as xml) the "fileCreationDate" element
     */
    public void xsetFileCreationDate(org.apache.xmlbeans.XmlDateTime fileCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FILECREATIONDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FILECREATIONDATE$14);
            }
            target.set(fileCreationDate);
        }
    }
    
    /**
     * Unsets the "fileCreationDate" element
     */
    public void unsetFileCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILECREATIONDATE$14, 0);
        }
    }
    
    /**
     * Gets the "fileMD5Checksum" element
     */
    public java.lang.String getFileMD5Checksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEMD5CHECKSUM$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fileMD5Checksum" element
     */
    public org.apache.xmlbeans.XmlString xgetFileMD5Checksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILEMD5CHECKSUM$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "fileMD5Checksum" element
     */
    public boolean isSetFileMD5Checksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEMD5CHECKSUM$16) != 0;
        }
    }
    
    /**
     * Sets the "fileMD5Checksum" element
     */
    public void setFileMD5Checksum(java.lang.String fileMD5Checksum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEMD5CHECKSUM$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEMD5CHECKSUM$16);
            }
            target.setStringValue(fileMD5Checksum);
        }
    }
    
    /**
     * Sets (as xml) the "fileMD5Checksum" element
     */
    public void xsetFileMD5Checksum(org.apache.xmlbeans.XmlString fileMD5Checksum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILEMD5CHECKSUM$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILEMD5CHECKSUM$16);
            }
            target.set(fileMD5Checksum);
        }
    }
    
    /**
     * Unsets the "fileMD5Checksum" element
     */
    public void unsetFileMD5Checksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEMD5CHECKSUM$16, 0);
        }
    }
    
    /**
     * Gets the "fileSize" element
     */
    public long getFileSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILESIZE$18, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "fileSize" element
     */
    public org.apache.xmlbeans.XmlLong xgetFileSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(FILESIZE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "fileSize" element
     */
    public boolean isSetFileSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILESIZE$18) != 0;
        }
    }
    
    /**
     * Sets the "fileSize" element
     */
    public void setFileSize(long fileSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILESIZE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILESIZE$18);
            }
            target.setLongValue(fileSize);
        }
    }
    
    /**
     * Sets (as xml) the "fileSize" element
     */
    public void xsetFileSize(org.apache.xmlbeans.XmlLong fileSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(FILESIZE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(FILESIZE$18);
            }
            target.set(fileSize);
        }
    }
    
    /**
     * Unsets the "fileSize" element
     */
    public void unsetFileSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILESIZE$18, 0);
        }
    }
}
