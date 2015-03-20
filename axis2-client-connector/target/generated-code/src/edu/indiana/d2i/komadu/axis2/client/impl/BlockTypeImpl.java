/*
 * XML Type:  blockType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.BlockType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML blockType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class BlockTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.BlockType
{
    
    public BlockTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLOCKURI$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "blockURI");
    private static final javax.xml.namespace.QName BLOCKCONTENT$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "blockContent");
    
    
    /**
     * Gets the "blockURI" element
     */
    public java.lang.String getBlockURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "blockURI" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetBlockURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(BLOCKURI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "blockURI" element
     */
    public void setBlockURI(java.lang.String blockURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLOCKURI$0);
            }
            target.setStringValue(blockURI);
        }
    }
    
    /**
     * Sets (as xml) the "blockURI" element
     */
    public void xsetBlockURI(org.apache.xmlbeans.XmlAnyURI blockURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(BLOCKURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(BLOCKURI$0);
            }
            target.set(blockURI);
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
}
