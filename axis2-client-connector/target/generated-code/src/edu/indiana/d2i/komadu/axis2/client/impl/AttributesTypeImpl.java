/*
 * XML Type:  attributesType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AttributesType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML attributesType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class AttributesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AttributesType
{
    
    public AttributesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "attribute");
    
    
    /**
     * Gets array of all "attribute" elements
     */
    public edu.indiana.d2i.komadu.axis2.client.AttributeType[] getAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTE$0, targetList);
            edu.indiana.d2i.komadu.axis2.client.AttributeType[] result = new edu.indiana.d2i.komadu.axis2.client.AttributeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attribute" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AttributeType getAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributeType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributeType)get_store().find_element_user(ATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "attribute" element
     */
    public int sizeOfAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTE$0);
        }
    }
    
    /**
     * Sets array of all "attribute" element
     */
    public void setAttributeArray(edu.indiana.d2i.komadu.axis2.client.AttributeType[] attributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeArray, ATTRIBUTE$0);
        }
    }
    
    /**
     * Sets ith "attribute" element
     */
    public void setAttributeArray(int i, edu.indiana.d2i.komadu.axis2.client.AttributeType attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributeType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributeType)get_store().find_element_user(ATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AttributeType insertNewAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributeType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributeType)get_store().insert_element_user(ATTRIBUTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attribute" element
     */
    public edu.indiana.d2i.komadu.axis2.client.AttributeType addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.AttributeType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.AttributeType)get_store().add_element_user(ATTRIBUTE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "attribute" element
     */
    public void removeAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTE$0, i);
        }
    }
}
