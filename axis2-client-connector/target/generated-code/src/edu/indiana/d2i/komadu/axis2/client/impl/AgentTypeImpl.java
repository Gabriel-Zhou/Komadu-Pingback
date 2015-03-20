/*
 * XML Type:  agentType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AgentType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML agentType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class AgentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AgentType
{
    
    public AgentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERAGENT$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "userAgent");
    private static final javax.xml.namespace.QName GENERICAGENT$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "genericAgent");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "type");
    private static final javax.xml.namespace.QName ROLE$6 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "role");
    private static final javax.xml.namespace.QName LOCATION$8 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "location");
    
    
    /**
     * Gets the "userAgent" element
     */
    public edu.indiana.d2i.komadu.axis2.client.UserAgentType getUserAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.UserAgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.UserAgentType)get_store().find_element_user(USERAGENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "userAgent" element
     */
    public boolean isSetUserAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERAGENT$0) != 0;
        }
    }
    
    /**
     * Sets the "userAgent" element
     */
    public void setUserAgent(edu.indiana.d2i.komadu.axis2.client.UserAgentType userAgent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.UserAgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.UserAgentType)get_store().find_element_user(USERAGENT$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.UserAgentType)get_store().add_element_user(USERAGENT$0);
            }
            target.set(userAgent);
        }
    }
    
    /**
     * Appends and returns a new empty "userAgent" element
     */
    public edu.indiana.d2i.komadu.axis2.client.UserAgentType addNewUserAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.UserAgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.UserAgentType)get_store().add_element_user(USERAGENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "userAgent" element
     */
    public void unsetUserAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERAGENT$0, 0);
        }
    }
    
    /**
     * Gets the "genericAgent" element
     */
    public edu.indiana.d2i.komadu.axis2.client.GenericAgentType getGenericAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.GenericAgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.GenericAgentType)get_store().find_element_user(GENERICAGENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "genericAgent" element
     */
    public boolean isSetGenericAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENERICAGENT$2) != 0;
        }
    }
    
    /**
     * Sets the "genericAgent" element
     */
    public void setGenericAgent(edu.indiana.d2i.komadu.axis2.client.GenericAgentType genericAgent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.GenericAgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.GenericAgentType)get_store().find_element_user(GENERICAGENT$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.GenericAgentType)get_store().add_element_user(GENERICAGENT$2);
            }
            target.set(genericAgent);
        }
    }
    
    /**
     * Appends and returns a new empty "genericAgent" element
     */
    public edu.indiana.d2i.komadu.axis2.client.GenericAgentType addNewGenericAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.GenericAgentType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.GenericAgentType)get_store().add_element_user(GENERICAGENT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "genericAgent" element
     */
    public void unsetGenericAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENERICAGENT$2, 0);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AgentEnumType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (edu.indiana.d2i.komadu.axis2.client.AgentEnumType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AgentEnumType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentEnumType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentEnumType)get_store().find_element_user(TYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(edu.indiana.d2i.komadu.axis2.client.AgentEnumType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$4);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(edu.indiana.d2i.komadu.axis2.client.AgentEnumType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AgentEnumType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AgentEnumType)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AgentEnumType)get_store().add_element_user(TYPE$4);
            }
            target.set(type);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLE$6, 0);
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
            return get_store().count_elements(ROLE$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLE$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROLE$6);
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
            get_store().remove_element(ROLE$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$8, 0);
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
            return get_store().count_elements(LOCATION$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATION$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATION$8);
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
            get_store().remove_element(LOCATION$8, 0);
        }
    }
}
