/*
 * XML Type:  membershipDetail
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.MembershipDetail
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML membershipDetail(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class MembershipDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.MembershipDetail
{
    
    public MembershipDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYTYPE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "entityType");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "entityType" element
     */
    public edu.indiana.d2i.komadu.query.EntityEnumType.Enum getEntityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (edu.indiana.d2i.komadu.query.EntityEnumType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "entityType" element
     */
    public edu.indiana.d2i.komadu.query.EntityEnumType xgetEntityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityEnumType target = null;
            target = (edu.indiana.d2i.komadu.query.EntityEnumType)get_store().find_element_user(ENTITYTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "entityType" element
     */
    public void setEntityType(edu.indiana.d2i.komadu.query.EntityEnumType.Enum entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYTYPE$0);
            }
            target.setEnumValue(entityType);
        }
    }
    
    /**
     * Sets (as xml) the "entityType" element
     */
    public void xsetEntityType(edu.indiana.d2i.komadu.query.EntityEnumType entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityEnumType target = null;
            target = (edu.indiana.d2i.komadu.query.EntityEnumType)get_store().find_element_user(ENTITYTYPE$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.EntityEnumType)get_store().add_element_user(ENTITYTYPE$0);
            }
            target.set(entityType);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
}
