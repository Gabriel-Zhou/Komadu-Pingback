/*
 * XML Type:  activityActivityType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.ActivityActivityType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML activityActivityType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class ActivityActivityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.ActivityActivityType
{
    
    public ActivityActivityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITY1$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "activity1");
    private static final javax.xml.namespace.QName ACTIVITY2$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "activity2");
    private static final javax.xml.namespace.QName COMMUNICATION$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "communication");
    
    
    /**
     * Gets the "activity1" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityType getActivity1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().find_element_user(ACTIVITY1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activity1" element
     */
    public void setActivity1(edu.indiana.d2i.komadu.axis2.client.ActivityType activity1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().find_element_user(ACTIVITY1$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().add_element_user(ACTIVITY1$0);
            }
            target.set(activity1);
        }
    }
    
    /**
     * Appends and returns a new empty "activity1" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityType addNewActivity1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().add_element_user(ACTIVITY1$0);
            return target;
        }
    }
    
    /**
     * Gets the "activity2" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityType getActivity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().find_element_user(ACTIVITY2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activity2" element
     */
    public void setActivity2(edu.indiana.d2i.komadu.axis2.client.ActivityType activity2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().find_element_user(ACTIVITY2$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().add_element_user(ACTIVITY2$2);
            }
            target.set(activity2);
        }
    }
    
    /**
     * Appends and returns a new empty "activity2" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityType addNewActivity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityType)get_store().add_element_user(ACTIVITY2$2);
            return target;
        }
    }
    
    /**
     * Gets the "communication" element
     */
    public edu.indiana.d2i.komadu.axis2.client.CommunicationType getCommunication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.CommunicationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.CommunicationType)get_store().find_element_user(COMMUNICATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "communication" element
     */
    public void setCommunication(edu.indiana.d2i.komadu.axis2.client.CommunicationType communication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.CommunicationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.CommunicationType)get_store().find_element_user(COMMUNICATION$4, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.CommunicationType)get_store().add_element_user(COMMUNICATION$4);
            }
            target.set(communication);
        }
    }
    
    /**
     * Appends and returns a new empty "communication" element
     */
    public edu.indiana.d2i.komadu.axis2.client.CommunicationType addNewCommunication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.CommunicationType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.CommunicationType)get_store().add_element_user(COMMUNICATION$4);
            return target;
        }
    }
}
