/*
 * XML Type:  workflowInformationType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML workflowInformationType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class WorkflowInformationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType
{
    
    public WorkflowInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKFLOWID$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "workflowID");
    private static final javax.xml.namespace.QName WORKFLOWNODEID$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "workflowNodeID");
    private static final javax.xml.namespace.QName TIMESTEP$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "timestep");
    private static final javax.xml.namespace.QName ATTRIBUTES$6 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "attributes");
    private static final javax.xml.namespace.QName INSTANCEOF$8 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "instanceOf");
    
    
    /**
     * Gets the "workflowID" element
     */
    public java.lang.String getWorkflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWID$0, 0);
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
    public org.apache.xmlbeans.XmlAnyURI xgetWorkflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WORKFLOWID$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKFLOWID$0);
            }
            target.setStringValue(workflowID);
        }
    }
    
    /**
     * Sets (as xml) the "workflowID" element
     */
    public void xsetWorkflowID(org.apache.xmlbeans.XmlAnyURI workflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WORKFLOWID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(WORKFLOWID$0);
            }
            target.set(workflowID);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWNODEID$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKFLOWNODEID$2, 0);
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
            return get_store().count_elements(WORKFLOWNODEID$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWNODEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKFLOWNODEID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKFLOWNODEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKFLOWNODEID$2);
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
            get_store().remove_element(WORKFLOWNODEID$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTEP$4, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIMESTEP$4, 0);
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
            return get_store().count_elements(TIMESTEP$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTEP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESTEP$4);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIMESTEP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIMESTEP$4);
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
            get_store().remove_element(TIMESTEP$4, 0);
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
    
    /**
     * Gets the "instanceOf" element
     */
    public edu.indiana.d2i.komadu.axis2.client.InstanceOfType getInstanceOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.InstanceOfType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.InstanceOfType)get_store().find_element_user(INSTANCEOF$8, 0);
            if (target == null)
            {
                return null;
            }
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
            return get_store().count_elements(INSTANCEOF$8) != 0;
        }
    }
    
    /**
     * Sets the "instanceOf" element
     */
    public void setInstanceOf(edu.indiana.d2i.komadu.axis2.client.InstanceOfType xinstanceOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.InstanceOfType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.InstanceOfType)get_store().find_element_user(INSTANCEOF$8, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.InstanceOfType)get_store().add_element_user(INSTANCEOF$8);
            }
            target.set(xinstanceOf);
        }
    }
    
    /**
     * Appends and returns a new empty "instanceOf" element
     */
    public edu.indiana.d2i.komadu.axis2.client.InstanceOfType addNewInstanceOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.InstanceOfType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.InstanceOfType)get_store().add_element_user(INSTANCEOF$8);
            return target;
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
            get_store().remove_element(INSTANCEOF$8, 0);
        }
    }
}
