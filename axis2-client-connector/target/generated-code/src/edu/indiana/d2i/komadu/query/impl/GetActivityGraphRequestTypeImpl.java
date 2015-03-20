/*
 * XML Type:  getActivityGraphRequestType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetActivityGraphRequestType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML getActivityGraphRequestType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class GetActivityGraphRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetActivityGraphRequestType
{
    
    public GetActivityGraphRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYURI$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "activityURI");
    private static final javax.xml.namespace.QName INFORMATIONDETAILLEVEL$2 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "informationDetailLevel");
    
    
    /**
     * Gets the "activityURI" element
     */
    public java.lang.String getActivityURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "activityURI" element
     */
    public org.apache.xmlbeans.XmlString xgetActivityURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYURI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "activityURI" element
     */
    public void setActivityURI(java.lang.String activityURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYURI$0);
            }
            target.setStringValue(activityURI);
        }
    }
    
    /**
     * Sets (as xml) the "activityURI" element
     */
    public void xsetActivityURI(org.apache.xmlbeans.XmlString activityURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITYURI$0);
            }
            target.set(activityURI);
        }
    }
    
    /**
     * Gets the "informationDetailLevel" element
     */
    public edu.indiana.d2i.komadu.query.DetailEnumType.Enum getInformationDetailLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMATIONDETAILLEVEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return (edu.indiana.d2i.komadu.query.DetailEnumType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "informationDetailLevel" element
     */
    public edu.indiana.d2i.komadu.query.DetailEnumType xgetInformationDetailLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.DetailEnumType target = null;
            target = (edu.indiana.d2i.komadu.query.DetailEnumType)get_store().find_element_user(INFORMATIONDETAILLEVEL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "informationDetailLevel" element
     */
    public boolean isSetInformationDetailLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFORMATIONDETAILLEVEL$2) != 0;
        }
    }
    
    /**
     * Sets the "informationDetailLevel" element
     */
    public void setInformationDetailLevel(edu.indiana.d2i.komadu.query.DetailEnumType.Enum informationDetailLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMATIONDETAILLEVEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFORMATIONDETAILLEVEL$2);
            }
            target.setEnumValue(informationDetailLevel);
        }
    }
    
    /**
     * Sets (as xml) the "informationDetailLevel" element
     */
    public void xsetInformationDetailLevel(edu.indiana.d2i.komadu.query.DetailEnumType informationDetailLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.DetailEnumType target = null;
            target = (edu.indiana.d2i.komadu.query.DetailEnumType)get_store().find_element_user(INFORMATIONDETAILLEVEL$2, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.DetailEnumType)get_store().add_element_user(INFORMATIONDETAILLEVEL$2);
            }
            target.set(informationDetailLevel);
        }
    }
    
    /**
     * Unsets the "informationDetailLevel" element
     */
    public void unsetInformationDetailLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFORMATIONDETAILLEVEL$2, 0);
        }
    }
}
