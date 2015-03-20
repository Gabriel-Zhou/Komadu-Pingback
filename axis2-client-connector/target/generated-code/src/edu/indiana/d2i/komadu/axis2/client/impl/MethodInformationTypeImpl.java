/*
 * XML Type:  methodInformationType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.MethodInformationType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML methodInformationType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class MethodInformationTypeImpl extends edu.indiana.d2i.komadu.axis2.client.impl.ServiceInformationTypeImpl implements edu.indiana.d2i.komadu.axis2.client.MethodInformationType
{
    
    public MethodInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHODID$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "methodID");
    
    
    /**
     * Gets the "methodID" element
     */
    public java.lang.String getMethodID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METHODID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "methodID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetMethodID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(METHODID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "methodID" element
     */
    public void setMethodID(java.lang.String methodID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METHODID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METHODID$0);
            }
            target.setStringValue(methodID);
        }
    }
    
    /**
     * Sets (as xml) the "methodID" element
     */
    public void xsetMethodID(org.apache.xmlbeans.XmlAnyURI methodID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(METHODID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(METHODID$0);
            }
            target.set(methodID);
        }
    }
}
