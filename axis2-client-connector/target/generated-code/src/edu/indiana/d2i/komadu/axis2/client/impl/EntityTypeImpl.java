/*
 * XML Type:  entityType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.EntityType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML entityType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class EntityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.EntityType
{
    
    public EntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "file");
    private static final javax.xml.namespace.QName BLOCK$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "block");
    private static final javax.xml.namespace.QName COLLECTION$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "collection");
    private static final javax.xml.namespace.QName GENERICENTITY$6 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "genericEntity");
    private static final javax.xml.namespace.QName ATTRIBUTES$8 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "attributes");
    private static final javax.xml.namespace.QName ROLE$10 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "role");
    private static final javax.xml.namespace.QName LOCATION$12 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "location");
    
    
    /**
     * Gets the "file" element
     */
    public edu.indiana.d2i.komadu.axis2.client.FileType getFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.FileType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.FileType)get_store().find_element_user(FILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "file" element
     */
    public boolean isSetFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILE$0) != 0;
        }
    }
    
    /**
     * Sets the "file" element
     */
    public void setFile(edu.indiana.d2i.komadu.axis2.client.FileType file)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.FileType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.FileType)get_store().find_element_user(FILE$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.FileType)get_store().add_element_user(FILE$0);
            }
            target.set(file);
        }
    }
    
    /**
     * Appends and returns a new empty "file" element
     */
    public edu.indiana.d2i.komadu.axis2.client.FileType addNewFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.FileType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.FileType)get_store().add_element_user(FILE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "file" element
     */
    public void unsetFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILE$0, 0);
        }
    }
    
    /**
     * Gets the "block" element
     */
    public edu.indiana.d2i.komadu.axis2.client.BlockType getBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.BlockType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.BlockType)get_store().find_element_user(BLOCK$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "block" element
     */
    public boolean isSetBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLOCK$2) != 0;
        }
    }
    
    /**
     * Sets the "block" element
     */
    public void setBlock(edu.indiana.d2i.komadu.axis2.client.BlockType block)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.BlockType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.BlockType)get_store().find_element_user(BLOCK$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.BlockType)get_store().add_element_user(BLOCK$2);
            }
            target.set(block);
        }
    }
    
    /**
     * Appends and returns a new empty "block" element
     */
    public edu.indiana.d2i.komadu.axis2.client.BlockType addNewBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.BlockType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.BlockType)get_store().add_element_user(BLOCK$2);
            return target;
        }
    }
    
    /**
     * Unsets the "block" element
     */
    public void unsetBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLOCK$2, 0);
        }
    }
    
    /**
     * Gets the "collection" element
     */
    public edu.indiana.d2i.komadu.axis2.client.CollectionType getCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.CollectionType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.CollectionType)get_store().find_element_user(COLLECTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "collection" element
     */
    public boolean isSetCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLLECTION$4) != 0;
        }
    }
    
    /**
     * Sets the "collection" element
     */
    public void setCollection(edu.indiana.d2i.komadu.axis2.client.CollectionType collection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.CollectionType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.CollectionType)get_store().find_element_user(COLLECTION$4, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.CollectionType)get_store().add_element_user(COLLECTION$4);
            }
            target.set(collection);
        }
    }
    
    /**
     * Appends and returns a new empty "collection" element
     */
    public edu.indiana.d2i.komadu.axis2.client.CollectionType addNewCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.CollectionType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.CollectionType)get_store().add_element_user(COLLECTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "collection" element
     */
    public void unsetCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLLECTION$4, 0);
        }
    }
    
    /**
     * Gets the "genericEntity" element
     */
    public edu.indiana.d2i.komadu.axis2.client.GenericEntityType getGenericEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.GenericEntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.GenericEntityType)get_store().find_element_user(GENERICENTITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "genericEntity" element
     */
    public boolean isSetGenericEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENERICENTITY$6) != 0;
        }
    }
    
    /**
     * Sets the "genericEntity" element
     */
    public void setGenericEntity(edu.indiana.d2i.komadu.axis2.client.GenericEntityType genericEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.GenericEntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.GenericEntityType)get_store().find_element_user(GENERICENTITY$6, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.GenericEntityType)get_store().add_element_user(GENERICENTITY$6);
            }
            target.set(genericEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "genericEntity" element
     */
    public edu.indiana.d2i.komadu.axis2.client.GenericEntityType addNewGenericEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.GenericEntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.GenericEntityType)get_store().add_element_user(GENERICENTITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "genericEntity" element
     */
    public void unsetGenericEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENERICENTITY$6, 0);
        }
    }
    
    /**
     * Gets the "attributes" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AttributesType getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$8) != 0;
        }
    }
    
    /**
     * Sets the "attributes" element
     */
    public void setAttributes(edu.indiana.d2i.komadu.axis2.client.AttributesType attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTES$8, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTES$8);
            }
            target.set(attributes);
        }
    }
    
    /**
     * Appends and returns a new empty "attributes" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AttributesType addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTES$8);
            return target;
        }
    }
    
    /**
     * Unsets the "attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$8, 0);
        }
    }
    
    /**
     * Gets the "role" element
     */
    public java.lang.String getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "role" element
     */
    public org.apache.xmlbeans.XmlString xgetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "role" element
     */
    public boolean isSetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLE$10) != 0;
        }
    }
    
    /**
     * Sets the "role" element
     */
    public void setRole(java.lang.String role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLE$10);
            }
            target.setStringValue(role);
        }
    }
    
    /**
     * Sets (as xml) the "role" element
     */
    public void xsetRole(org.apache.xmlbeans.XmlString role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROLE$10);
            }
            target.set(role);
        }
    }
    
    /**
     * Unsets the "role" element
     */
    public void unsetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLE$10, 0);
        }
    }
    
    /**
     * Gets the "location" element
     */
    public java.lang.String getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "location" element
     */
    public org.apache.xmlbeans.XmlString xgetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "location" element
     */
    public boolean isSetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$12) != 0;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(java.lang.String location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATION$12);
            }
            target.setStringValue(location);
        }
    }
    
    /**
     * Sets (as xml) the "location" element
     */
    public void xsetLocation(org.apache.xmlbeans.XmlString location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATION$12);
            }
            target.set(location);
        }
    }
    
    /**
     * Unsets the "location" element
     */
    public void unsetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$12, 0);
        }
    }
}
