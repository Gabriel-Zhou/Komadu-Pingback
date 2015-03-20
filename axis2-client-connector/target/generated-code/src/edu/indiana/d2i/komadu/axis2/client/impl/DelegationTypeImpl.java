/*
 * XML Type:  delegationType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.DelegationType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML delegationType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class DelegationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.DelegationType
{
    
    public DelegationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELEGATEAGENTID$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "delegateAgentID");
    private static final javax.xml.namespace.QName RESPONSIBLEAGENTID$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "responsibleAgentID");
    private static final javax.xml.namespace.QName ACTIVITY$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "activity");
    private static final javax.xml.namespace.QName ATTRIBUTES$6 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "attributes");
    
    
    /**
     * Gets the "delegateAgentID" element
     */
    public java.lang.String getDelegateAgentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELEGATEAGENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "delegateAgentID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetDelegateAgentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DELEGATEAGENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "delegateAgentID" element
     */
    public void setDelegateAgentID(java.lang.String delegateAgentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELEGATEAGENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELEGATEAGENTID$0);
            }
            target.setStringValue(delegateAgentID);
        }
    }
    
    /**
     * Sets (as xml) the "delegateAgentID" element
     */
    public void xsetDelegateAgentID(org.apache.xmlbeans.XmlAnyURI delegateAgentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DELEGATEAGENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(DELEGATEAGENTID$0);
            }
            target.set(delegateAgentID);
        }
    }
    
    /**
     * Gets the "responsibleAgentID" element
     */
    public java.lang.String getResponsibleAgentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSIBLEAGENTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "responsibleAgentID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetResponsibleAgentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(RESPONSIBLEAGENTID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "responsibleAgentID" element
     */
    public void setResponsibleAgentID(java.lang.String responsibleAgentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSIBLEAGENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSIBLEAGENTID$2);
            }
            target.setStringValue(responsibleAgentID);
        }
    }
    
    /**
     * Sets (as xml) the "responsibleAgentID" element
     */
    public void xsetResponsibleAgentID(org.apache.xmlbeans.XmlAnyURI responsibleAgentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(RESPONSIBLEAGENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(RESPONSIBLEAGENTID$2);
            }
            target.set(responsibleAgentID);
        }
    }
    
    /**
     * Gets the "activity" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityType getActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().find_element_user(ACTIVITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "activity" element
     */
    public boolean isSetActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITY$4) != 0;
        }
    }
    
    /**
     * Sets the "activity" element
     */
    public void setActivity(edu.indiana.d2i.komadu.axis2.client.ActivityType activity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().find_element_user(ACTIVITY$4, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().add_element_user(ACTIVITY$4);
            }
            target.set(activity);
        }
    }
    
    /**
     * Appends and returns a new empty "activity" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityType addNewActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().add_element_user(ACTIVITY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "activity" element
     */
    public void unsetActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITY$4, 0);
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
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTES$6, 0);
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
            return get_store().count_elements(ATTRIBUTES$6) != 0;
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
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTES$6, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTES$6);
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
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTES$6);
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
            get_store().remove_element(ATTRIBUTES$6, 0);
        }
    }
}
