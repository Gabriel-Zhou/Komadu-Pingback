/*
 * XML Type:  userAgentType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.UserAgentType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML userAgentType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class UserAgentTypeImpl extends edu.indiana.d2i.komadu.axis2.client.impl.GenericAgentTypeImpl implements edu.indiana.d2i.komadu.axis2.client.UserAgentType
{
    
    public UserAgentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULLNAME$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "fullName");
    private static final javax.xml.namespace.QName AFFILIATION$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "affiliation");
    private static final javax.xml.namespace.QName EMAIL$4 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "email");
    
    
    /**
     * Gets the "fullName" element
     */
    public java.lang.String getFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fullName" element
     */
    public org.apache.xmlbeans.XmlString xgetFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FULLNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "fullName" element
     */
    public boolean isSetFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FULLNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "fullName" element
     */
    public void setFullName(java.lang.String fullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULLNAME$0);
            }
            target.setStringValue(fullName);
        }
    }
    
    /**
     * Sets (as xml) the "fullName" element
     */
    public void xsetFullName(org.apache.xmlbeans.XmlString fullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FULLNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FULLNAME$0);
            }
            target.set(fullName);
        }
    }
    
    /**
     * Unsets the "fullName" element
     */
    public void unsetFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FULLNAME$0, 0);
        }
    }
    
    /**
     * Gets the "affiliation" element
     */
    public java.lang.String getAffiliation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AFFILIATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "affiliation" element
     */
    public org.apache.xmlbeans.XmlString xgetAffiliation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AFFILIATION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "affiliation" element
     */
    public boolean isSetAffiliation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AFFILIATION$2) != 0;
        }
    }
    
    /**
     * Sets the "affiliation" element
     */
    public void setAffiliation(java.lang.String affiliation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AFFILIATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AFFILIATION$2);
            }
            target.setStringValue(affiliation);
        }
    }
    
    /**
     * Sets (as xml) the "affiliation" element
     */
    public void xsetAffiliation(org.apache.xmlbeans.XmlString affiliation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AFFILIATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AFFILIATION$2);
            }
            target.set(affiliation);
        }
    }
    
    /**
     * Unsets the "affiliation" element
     */
    public void unsetAffiliation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AFFILIATION$2, 0);
        }
    }
    
    /**
     * Gets the "email" element
     */
    public java.lang.String getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "email" element
     */
    public org.apache.xmlbeans.XmlString xgetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "email" element
     */
    public boolean isSetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$4) != 0;
        }
    }
    
    /**
     * Sets the "email" element
     */
    public void setEmail(java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$4);
            }
            target.setStringValue(email);
        }
    }
    
    /**
     * Sets (as xml) the "email" element
     */
    public void xsetEmail(org.apache.xmlbeans.XmlString email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$4);
            }
            target.set(email);
        }
    }
    
    /**
     * Unsets the "email" element
     */
    public void unsetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$4, 0);
        }
    }
}
