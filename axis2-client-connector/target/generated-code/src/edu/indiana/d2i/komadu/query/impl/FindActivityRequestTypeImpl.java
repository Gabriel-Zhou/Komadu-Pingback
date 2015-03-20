/*
 * XML Type:  findActivityRequestType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.FindActivityRequestType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML findActivityRequestType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class FindActivityRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.FindActivityRequestType
{
    
    public FindActivityRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "name");
    private static final javax.xml.namespace.QName HOSTNAME$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "hostName");
    private static final javax.xml.namespace.QName ARCHITECTURE$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "architecture");
    private static final javax.xml.namespace.QName WORKFLOWID$6 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "workflowID");
    private static final javax.xml.namespace.QName SERVICEID$8 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "serviceID");
    private static final javax.xml.namespace.QName NEXTACTIVITYID$10 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "nextActivityID");
    private static final javax.xml.namespace.QName ATTRIBUTELIST$12 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "attributeList");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "hostName" element
     */
    public java.lang.String getHostName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSTNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hostName" element
     */
    public org.apache.xmlbeans.XmlString xgetHostName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOSTNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "hostName" element
     */
    public boolean isSetHostName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOSTNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "hostName" element
     */
    public void setHostName(java.lang.String hostName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOSTNAME$2);
            }
            target.setStringValue(hostName);
        }
    }
    
    /**
     * Sets (as xml) the "hostName" element
     */
    public void xsetHostName(org.apache.xmlbeans.XmlString hostName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOSTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOSTNAME$2);
            }
            target.set(hostName);
        }
    }
    
    /**
     * Unsets the "hostName" element
     */
    public void unsetHostName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOSTNAME$2, 0);
        }
    }
    
    /**
     * Gets the "architecture" element
     */
    public java.lang.String getArchitecture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCHITECTURE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "architecture" element
     */
    public org.apache.xmlbeans.XmlString xgetArchitecture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARCHITECTURE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "architecture" element
     */
    public boolean isSetArchitecture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARCHITECTURE$4) != 0;
        }
    }
    
    /**
     * Sets the "architecture" element
     */
    public void setArchitecture(java.lang.String architecture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCHITECTURE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARCHITECTURE$4);
            }
            target.setStringValue(architecture);
        }
    }
    
    /**
     * Sets (as xml) the "architecture" element
     */
    public void xsetArchitecture(org.apache.xmlbeans.XmlString architecture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARCHITECTURE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARCHITECTURE$4);
            }
            target.set(architecture);
        }
    }
    
    /**
     * Unsets the "architecture" element
     */
    public void unsetArchitecture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARCHITECTURE$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWID$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKFLOWID$6, 0);
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
            return get_store().count_elements(WORKFLOWID$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKFLOWID$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKFLOWID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKFLOWID$6);
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
            get_store().remove_element(WORKFLOWID$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEID$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEID$8, 0);
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
            return get_store().count_elements(SERVICEID$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEID$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICEID$8);
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
            get_store().remove_element(SERVICEID$8, 0);
        }
    }
    
    /**
     * Gets the "nextActivityID" element
     */
    public java.lang.String getNextActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEXTACTIVITYID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nextActivityID" element
     */
    public org.apache.xmlbeans.XmlString xgetNextActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEXTACTIVITYID$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "nextActivityID" element
     */
    public boolean isSetNextActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEXTACTIVITYID$10) != 0;
        }
    }
    
    /**
     * Sets the "nextActivityID" element
     */
    public void setNextActivityID(java.lang.String nextActivityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEXTACTIVITYID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEXTACTIVITYID$10);
            }
            target.setStringValue(nextActivityID);
        }
    }
    
    /**
     * Sets (as xml) the "nextActivityID" element
     */
    public void xsetNextActivityID(org.apache.xmlbeans.XmlString nextActivityID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEXTACTIVITYID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NEXTACTIVITYID$10);
            }
            target.set(nextActivityID);
        }
    }
    
    /**
     * Unsets the "nextActivityID" element
     */
    public void unsetNextActivityID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEXTACTIVITYID$10, 0);
        }
    }
    
    /**
     * Gets the "attributeList" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AttributesType getAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTELIST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "attributeList" element
     */
    public boolean isSetAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTELIST$12) != 0;
        }
    }
    
    /**
     * Sets the "attributeList" element
     */
    public void setAttributeList(edu.indiana.d2i.komadu.axis2.client.AttributesType attributeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().find_element_user(ATTRIBUTELIST$12, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTELIST$12);
            }
            target.set(attributeList);
        }
    }
    
    /**
     * Appends and returns a new empty "attributeList" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AttributesType addNewAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributesType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributesType)get_store().add_element_user(ATTRIBUTELIST$12);
            return target;
        }
    }
    
    /**
     * Unsets the "attributeList" element
     */
    public void unsetAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTELIST$12, 0);
        }
    }
}
