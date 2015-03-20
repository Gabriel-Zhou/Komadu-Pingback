/*
 * XML Type:  activityType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.ActivityType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML activityType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class ActivityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.ActivityType
{
    
    public ActivityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKFLOWINFORMATION$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "workflowInformation");
    private static final javax.xml.namespace.QName SERVICEINFORMATION$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "serviceInformation");
    private static final javax.xml.namespace.QName METHODINFORMATION$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "methodInformation");
    private static final javax.xml.namespace.QName ACTIVITYINFORMATION$6 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "activityInformation");
    private static final javax.xml.namespace.QName LOCATION$8 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "location");
    
    
    /**
     * Gets the "workflowInformation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType getWorkflowInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType)get_store().find_element_user(WORKFLOWINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "workflowInformation" element
     */
    public boolean isSetWorkflowInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKFLOWINFORMATION$0) != 0;
        }
    }
    
    /**
     * Sets the "workflowInformation" element
     */
    public void setWorkflowInformation(edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType workflowInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType)get_store().find_element_user(WORKFLOWINFORMATION$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType)get_store().add_element_user(WORKFLOWINFORMATION$0);
            }
            target.set(workflowInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "workflowInformation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType addNewWorkflowInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType)get_store().add_element_user(WORKFLOWINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "workflowInformation" element
     */
    public void unsetWorkflowInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKFLOWINFORMATION$0, 0);
        }
    }
    
    /**
     * Gets the "serviceInformation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ServiceInformationType getServiceInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ServiceInformationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ServiceInformationType)get_store().find_element_user(SERVICEINFORMATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "serviceInformation" element
     */
    public boolean isSetServiceInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEINFORMATION$2) != 0;
        }
    }
    
    /**
     * Sets the "serviceInformation" element
     */
    public void setServiceInformation(edu.indiana.d2i.komadu.axis2.client.ServiceInformationType serviceInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ServiceInformationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ServiceInformationType)get_store().find_element_user(SERVICEINFORMATION$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.ServiceInformationType)get_store().add_element_user(SERVICEINFORMATION$2);
            }
            target.set(serviceInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "serviceInformation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ServiceInformationType addNewServiceInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ServiceInformationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ServiceInformationType)get_store().add_element_user(SERVICEINFORMATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "serviceInformation" element
     */
    public void unsetServiceInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEINFORMATION$2, 0);
        }
    }
    
    /**
     * Gets the "methodInformation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.MethodInformationType getMethodInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.MethodInformationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.MethodInformationType)get_store().find_element_user(METHODINFORMATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "methodInformation" element
     */
    public boolean isSetMethodInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METHODINFORMATION$4) != 0;
        }
    }
    
    /**
     * Sets the "methodInformation" element
     */
    public void setMethodInformation(edu.indiana.d2i.komadu.axis2.client.MethodInformationType methodInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.MethodInformationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.MethodInformationType)get_store().find_element_user(METHODINFORMATION$4, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.MethodInformationType)get_store().add_element_user(METHODINFORMATION$4);
            }
            target.set(methodInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "methodInformation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.MethodInformationType addNewMethodInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.MethodInformationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.MethodInformationType)get_store().add_element_user(METHODINFORMATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "methodInformation" element
     */
    public void unsetMethodInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METHODINFORMATION$4, 0);
        }
    }
    
    /**
     * Gets the "activityInformation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityInformationType getActivityInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityInformationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityInformationType)get_store().find_element_user(ACTIVITYINFORMATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "activityInformation" element
     */
    public boolean isSetActivityInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYINFORMATION$6) != 0;
        }
    }
    
    /**
     * Sets the "activityInformation" element
     */
    public void setActivityInformation(edu.indiana.d2i.komadu.axis2.client.ActivityInformationType activityInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityInformationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityInformationType)get_store().find_element_user(ACTIVITYINFORMATION$6, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.ActivityInformationType)get_store().add_element_user(ACTIVITYINFORMATION$6);
            }
            target.set(activityInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "activityInformation" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityInformationType addNewActivityInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityInformationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityInformationType)get_store().add_element_user(ACTIVITYINFORMATION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "activityInformation" element
     */
    public void unsetActivityInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYINFORMATION$6, 0);
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
