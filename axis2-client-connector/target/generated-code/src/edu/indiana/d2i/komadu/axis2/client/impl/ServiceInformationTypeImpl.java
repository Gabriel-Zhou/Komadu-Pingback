/*
 * XML Type:  serviceInformationType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.ServiceInformationType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML serviceInformationType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class ServiceInformationTypeImpl extends edu.indiana.d2i.komadu.axis2.client.impl.WorkflowInformationTypeImpl implements edu.indiana.d2i.komadu.axis2.client.ServiceInformationType
{
    
    public ServiceInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEID$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "serviceID");
    
    
    /**
     * Gets the "serviceID" element
     */
    public java.lang.String getServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEID$0, 0);
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
    public org.apache.xmlbeans.XmlAnyURI xgetServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SERVICEID$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEID$0);
            }
            target.setStringValue(serviceID);
        }
    }
    
    /**
     * Sets (as xml) the "serviceID" element
     */
    public void xsetServiceID(org.apache.xmlbeans.XmlAnyURI serviceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SERVICEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SERVICEID$0);
            }
            target.set(serviceID);
        }
    }
}
