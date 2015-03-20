/*
 * XML Type:  attributionType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AttributionType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML attributionType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class AttributionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AttributionType
{
    
    public AttributionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "entityID");
    private static final javax.xml.namespace.QName AGENTID$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "agentID");
    private static final javax.xml.namespace.QName ATTRIBUTES$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "attributes");
    
    
    /**
     * Gets the "entityID" element
     */
    public java.lang.String getEntityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENTITYID$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYID$0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ENTITYID$0);
            }
            target.set(entityID);
        }
    }
    
    /**
     * Gets the "agentID" element
     */
    public java.lang.String getAgentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "agentID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetAgentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(AGENTID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "agentID" element
     */
    public void setAgentID(java.lang.String agentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENTID$2);
            }
            target.setStringValue(agentID);
        }
    }
    
    /**
     * Sets (as xml) the "agentID" element
     */
    public void xsetAgentID(org.apache.xmlbeans.XmlAnyURI agentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(AGENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(AGENTID$2);
            }
            target.set(agentID);
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
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTES$4, 0);
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
            return get_store().count_elements(ATTRIBUTES$4) != 0;
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
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTES$4, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTES$4);
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
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTES$4);
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
            get_store().remove_element(ATTRIBUTES$4, 0);
        }
    }
}
