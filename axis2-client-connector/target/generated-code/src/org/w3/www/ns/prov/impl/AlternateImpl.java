/*
 * XML Type:  Alternate
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.Alternate
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * An XML Alternate(@http://www.w3.org/ns/prov#).
 *
 * This is a complex type.
 */
public class AlternateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.Alternate
{
    
    public AlternateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTERNATE1$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "alternate1");
    private static final javax.xml.namespace.QName ALTERNATE2$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "alternate2");
    
    
    /**
     * Gets the "alternate1" element
     */
    public org.w3.www.ns.prov.IDRef getAlternate1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(ALTERNATE1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "alternate1" element
     */
    public void setAlternate1(org.w3.www.ns.prov.IDRef alternate1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(ALTERNATE1$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(ALTERNATE1$0);
            }
            target.set(alternate1);
        }
    }
    
    /**
     * Appends and returns a new empty "alternate1" element
     */
    public org.w3.www.ns.prov.IDRef addNewAlternate1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(ALTERNATE1$0);
            return target;
        }
    }
    
    /**
     * Gets the "alternate2" element
     */
    public org.w3.www.ns.prov.IDRef getAlternate2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(ALTERNATE2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "alternate2" element
     */
    public void setAlternate2(org.w3.www.ns.prov.IDRef alternate2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(ALTERNATE2$2, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(ALTERNATE2$2);
            }
            target.set(alternate2);
        }
    }
    
    /**
     * Appends and returns a new empty "alternate2" element
     */
    public org.w3.www.ns.prov.IDRef addNewAlternate2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(ALTERNATE2$2);
            return target;
        }
    }
}
