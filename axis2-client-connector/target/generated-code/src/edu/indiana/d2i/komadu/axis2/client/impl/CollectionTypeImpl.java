/*
 * XML Type:  collectionType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.CollectionType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML collectionType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class CollectionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.CollectionType
{
    
    public CollectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLLECTIONURI$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "collectionURI");
    private static final javax.xml.namespace.QName MEMBERS$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "members");
    
    
    /**
     * Gets the "collectionURI" element
     */
    public java.lang.String getCollectionURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIONURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "collectionURI" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetCollectionURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COLLECTIONURI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "collectionURI" element
     */
    public void setCollectionURI(java.lang.String collectionURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIONURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLLECTIONURI$0);
            }
            target.setStringValue(collectionURI);
        }
    }
    
    /**
     * Sets (as xml) the "collectionURI" element
     */
    public void xsetCollectionURI(org.apache.xmlbeans.XmlAnyURI collectionURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COLLECTIONURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(COLLECTIONURI$0);
            }
            target.set(collectionURI);
        }
    }
    
    /**
     * Gets the "members" element
     */
    public edu.indiana.d2i.komadu.axis2.client.MembersType getMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.MembersType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.MembersType)get_store().find_element_user(MEMBERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "members" element
     */
    public boolean isSetMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBERS$2) != 0;
        }
    }
    
    /**
     * Sets the "members" element
     */
    public void setMembers(edu.indiana.d2i.komadu.axis2.client.MembersType members)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.MembersType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.MembersType)get_store().find_element_user(MEMBERS$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.MembersType)get_store().add_element_user(MEMBERS$2);
            }
            target.set(members);
        }
    }
    
    /**
     * Appends and returns a new empty "members" element
     */
    public edu.indiana.d2i.komadu.axis2.client.MembersType addNewMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.MembersType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.MembersType)get_store().add_element_user(MEMBERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "members" element
     */
    public void unsetMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBERS$2, 0);
        }
    }
}
