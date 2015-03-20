/*
 * XML Type:  activityDetail
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.ActivityDetail
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML activityDetail(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class ActivityDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.ActivityDetail
{
    
    public ActivityDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "type");
    private static final javax.xml.namespace.QName WORKFLOWID$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "workflowID");
    private static final javax.xml.namespace.QName SERVICEID$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "serviceID");
    private static final javax.xml.namespace.QName TIMESTEP$6 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "timestep");
    private static final javax.xml.namespace.QName WORKFLOWNODEID$8 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "workflowNodeID");
    private static final javax.xml.namespace.QName INSTANCEOF$10 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "instanceOf");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "workflowID" element
     */
    public java.lang.String getWorkflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "workflowID" element
     */
    public org.apache.xmlbeans.XmlString xgetWorkflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKFLOWID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "workflowID" element
     */
    public boolean isSetWorkflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKFLOWID$2) != 0;
        }
    }
    
    /**
     * Sets the "workflowID" element
     */
    public void setWorkflowID(java.lang.String workflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKFLOWID$2);
            }
            target.setStringValue(workflowID);
        }
    }
    
    /**
     * Sets (as xml) the "workflowID" element
     */
    public void xsetWorkflowID(org.apache.xmlbeans.XmlString workflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKFLOWID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKFLOWID$2);
            }
            target.set(workflowID);
        }
    }
    
    /**
     * Unsets the "workflowID" element
     */
    public void unsetWorkflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKFLOWID$2, 0);
        }
    }
    
    /**
     * Gets the "serviceID" element
     */
    public java.lang.String getServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serviceID" element
     */
    public org.apache.xmlbeans.XmlString xgetServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "serviceID" element
     */
    public boolean isSetServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEID$4) != 0;
        }
    }
    
    /**
     * Sets the "serviceID" element
     */
    public void setServiceID(java.lang.String serviceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEID$4);
            }
            target.setStringValue(serviceID);
        }
    }
    
    /**
     * Sets (as xml) the "serviceID" element
     */
    public void xsetServiceID(org.apache.xmlbeans.XmlString serviceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICEID$4);
            }
            target.set(serviceID);
        }
    }
    
    /**
     * Unsets the "serviceID" element
     */
    public void unsetServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEID$4, 0);
        }
    }
    
    /**
     * Gets the "timestep" element
     */
    public int getTimestep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTEP$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "timestep" element
     */
    public org.apache.xmlbeans.XmlInt xgetTimestep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIMESTEP$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "timestep" element
     */
    public boolean isSetTimestep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMESTEP$6) != 0;
        }
    }
    
    /**
     * Sets the "timestep" element
     */
    public void setTimestep(int timestep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTEP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESTEP$6);
            }
            target.setIntValue(timestep);
        }
    }
    
    /**
     * Sets (as xml) the "timestep" element
     */
    public void xsetTimestep(org.apache.xmlbeans.XmlInt timestep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIMESTEP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIMESTEP$6);
            }
            target.set(timestep);
        }
    }
    
    /**
     * Unsets the "timestep" element
     */
    public void unsetTimestep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMESTEP$6, 0);
        }
    }
    
    /**
     * Gets the "workflowNodeID" element
     */
    public java.lang.String getWorkflowNodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWNODEID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "workflowNodeID" element
     */
    public org.apache.xmlbeans.XmlString xgetWorkflowNodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKFLOWNODEID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "workflowNodeID" element
     */
    public boolean isSetWorkflowNodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKFLOWNODEID$8) != 0;
        }
    }
    
    /**
     * Sets the "workflowNodeID" element
     */
    public void setWorkflowNodeID(java.lang.String workflowNodeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWNODEID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKFLOWNODEID$8);
            }
            target.setStringValue(workflowNodeID);
        }
    }
    
    /**
     * Sets (as xml) the "workflowNodeID" element
     */
    public void xsetWorkflowNodeID(org.apache.xmlbeans.XmlString workflowNodeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKFLOWNODEID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKFLOWNODEID$8);
            }
            target.set(workflowNodeID);
        }
    }
    
    /**
     * Unsets the "workflowNodeID" element
     */
    public void unsetWorkflowNodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKFLOWNODEID$8, 0);
        }
    }
    
    /**
     * Gets the "instanceOf" element
     */
    public java.lang.String getInstanceOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTANCEOF$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "instanceOf" element
     */
    public org.apache.xmlbeans.XmlString xgetInstanceOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTANCEOF$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "instanceOf" element
     */
    public boolean isSetInstanceOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTANCEOF$10) != 0;
        }
    }
    
    /**
     * Sets the "instanceOf" element
     */
    public void setInstanceOf(java.lang.String xinstanceOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTANCEOF$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSTANCEOF$10);
            }
            target.setStringValue(xinstanceOf);
        }
    }
    
    /**
     * Sets (as xml) the "instanceOf" element
     */
    public void xsetInstanceOf(org.apache.xmlbeans.XmlString xinstanceOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTANCEOF$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSTANCEOF$10);
            }
            target.set(xinstanceOf);
        }
    }
    
    /**
     * Unsets the "instanceOf" element
     */
    public void unsetInstanceOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTANCEOF$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$12);
            }
            target.set(id);
        }
    }
}
