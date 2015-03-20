/*
 * XML Type:  IDRef
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.IDRef
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * An XML IDRef(@http://www.w3.org/ns/prov#).
 *
 * This is a complex type.
 */
public class IDRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.IDRef
{
    
    public IDRefImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REF$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "ref");
    
    
    /**
     * Gets the "ref" attribute
     */
    public javax.xml.namespace.QName getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(REF$0);
            return target;
        }
    }
    
    /**
     * Sets the "ref" attribute
     */
    public void setRef(javax.xml.namespace.QName ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$0);
            }
            target.setQNameValue(ref);
        }
    }
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    public void xsetRef(org.apache.xmlbeans.XmlQName ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(REF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(REF$0);
            }
            target.set(ref);
        }
    }
}
