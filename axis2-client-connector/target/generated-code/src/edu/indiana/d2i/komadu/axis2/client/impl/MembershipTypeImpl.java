/*
 * XML Type:  membershipType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.MembershipType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML membershipType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class MembershipTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.MembershipType
{
    
    public MembershipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLLECTIONID$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "collectionID");
    private static final javax.xml.namespace.QName ENTITYID$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "entityID");
    
    
    /**
     * Gets the "collectionID" element
     */
    public java.lang.String getCollectionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "collectionID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetCollectionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COLLECTIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "collectionID" element
     */
    public void setCollectionID(java.lang.String collectionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLLECTIONID$0);
            }
            target.setStringValue(collectionID);
        }
    }
    
    /**
     * Sets (as xml) the "collectionID" element
     */
    public void xsetCollectionID(org.apache.xmlbeans.XmlAnyURI collectionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COLLECTIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(COLLECTIONID$0);
            }
            target.set(collectionID);
        }
    }
    
    /**
     * Gets the "entityID" element
     */
    public java.lang.String getEntityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "entityID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetEntityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENTITYID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "entityID" element
     */
    public void setEntityID(java.lang.String entityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYID$2);
            }
            target.setStringValue(entityID);
        }
    }
    
    /**
     * Sets (as xml) the "entityID" element
     */
    public void xsetEntityID(org.apache.xmlbeans.XmlAnyURI entityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENTITYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ENTITYID$2);
            }
            target.set(entityID);
        }
    }
}
