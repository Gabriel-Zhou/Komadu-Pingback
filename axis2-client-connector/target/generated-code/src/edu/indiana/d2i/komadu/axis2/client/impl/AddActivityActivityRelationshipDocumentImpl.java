/*
 * An XML document type.
 * Localname: addActivityActivityRelationship
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AddActivityActivityRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * A document containing one addActivityActivityRelationship(@http://komadu.d2i.indiana.edu) element.
 *
 * This is a complex type.
 */
public class AddActivityActivityRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AddActivityActivityRelationshipDocument
{
    
    public AddActivityActivityRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDACTIVITYACTIVITYRELATIONSHIP$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "addActivityActivityRelationship");
    
    
    /**
     * Gets the "addActivityActivityRelationship" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityActivityType getAddActivityActivityRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityActivityType)get_store().find_element_user(ADDACTIVITYACTIVITYRELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addActivityActivityRelationship" element
     */
    public void setAddActivityActivityRelationship(edu.indiana.d2i.komadu.axis2.client.ActivityActivityType addActivityActivityRelationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityActivityType)get_store().find_element_user(ADDACTIVITYACTIVITYRELATIONSHIP$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.ActivityActivityType)get_store().add_element_user(ADDACTIVITYACTIVITYRELATIONSHIP$0);
            }
            target.set(addActivityActivityRelationship);
        }
    }
    
    /**
     * Appends and returns a new empty "addActivityActivityRelationship" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityActivityType addNewAddActivityActivityRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityActivityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityActivityType)get_store().add_element_user(ADDACTIVITYACTIVITYRELATIONSHIP$0);
            return target;
        }
    }
}
