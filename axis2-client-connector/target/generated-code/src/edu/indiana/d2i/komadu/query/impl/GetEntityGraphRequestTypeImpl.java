/*
 * XML Type:  getEntityGraphRequestType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetEntityGraphRequestType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML getEntityGraphRequestType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class GetEntityGraphRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetEntityGraphRequestType
{
    
    public GetEntityGraphRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYURI$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "entityURI");
    private static final javax.xml.namespace.QName ENTITYTYPE$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "entityType");
    private static final javax.xml.namespace.QName INFORMATIONDETAILLEVEL$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "informationDetailLevel");
    
    
    /**
     * Gets the "entityURI" element
     */
    public java.lang.String getEntityURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "entityURI" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYURI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "entityURI" element
     */
    public void setEntityURI(java.lang.String entityURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYURI$0);
            }
            target.setStringValue(entityURI);
        }
    }
    
    /**
     * Sets (as xml) the "entityURI" element
     */
    public void xsetEntityURI(org.apache.xmlbeans.XmlString entityURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYURI$0);
            }
            target.set(entityURI);
        }
    }
    
    /**
     * Gets the "entityType" element
     */
    public edu.indiana.d2i.komadu.query.EntityEnumType.Enum getEntityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$2, 0);
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
            target = (edu.indiana.d2i.komadu.query.EntityEnumType)get_store().find_element_user(ENTITYTYPE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYTYPE$2);
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
            target = (edu.indiana.d2i.komadu.query.EntityEnumType)get_store().find_element_user(ENTITYTYPE$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.EntityEnumType)get_store().add_element_user(ENTITYTYPE$2);
            }
            target.set(entityType);
        }
    }
    
    /**
     * Gets the "informationDetailLevel" element
     */
    public edu.indiana.d2i.komadu.query.DetailEnumType.Enum getInformationDetailLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMATIONDETAILLEVEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return (edu.indiana.d2i.komadu.query.DetailEnumType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "informationDetailLevel" element
     */
    public edu.indiana.d2i.komadu.query.DetailEnumType xgetInformationDetailLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.DetailEnumType target = null;
            target = (edu.indiana.d2i.komadu.query.DetailEnumType)get_store().find_element_user(INFORMATIONDETAILLEVEL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "informationDetailLevel" element
     */
    public boolean isSetInformationDetailLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFORMATIONDETAILLEVEL$4) != 0;
        }
    }
    
    /**
     * Sets the "informationDetailLevel" element
     */
    public void setInformationDetailLevel(edu.indiana.d2i.komadu.query.DetailEnumType.Enum informationDetailLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMATIONDETAILLEVEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFORMATIONDETAILLEVEL$4);
            }
            target.setEnumValue(informationDetailLevel);
        }
    }
    
    /**
     * Sets (as xml) the "informationDetailLevel" element
     */
    public void xsetInformationDetailLevel(edu.indiana.d2i.komadu.query.DetailEnumType informationDetailLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.DetailEnumType target = null;
            target = (edu.indiana.d2i.komadu.query.DetailEnumType)get_store().find_element_user(INFORMATIONDETAILLEVEL$4, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.DetailEnumType)get_store().add_element_user(INFORMATIONDETAILLEVEL$4);
            }
            target.set(informationDetailLevel);
        }
    }
    
    /**
     * Unsets the "informationDetailLevel" element
     */
    public void unsetInformationDetailLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFORMATIONDETAILLEVEL$4, 0);
        }
    }
}
