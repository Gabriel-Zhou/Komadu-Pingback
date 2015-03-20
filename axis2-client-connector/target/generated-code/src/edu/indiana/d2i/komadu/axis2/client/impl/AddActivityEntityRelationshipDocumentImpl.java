/*
 * An XML document type.
 * Localname: addActivityEntityRelationship
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AddActivityEntityRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * A document containing one addActivityEntityRelationship(@http://komadu.d2i.indiana.edu) element.
 *
 * This is a complex type.
 */
public class AddActivityEntityRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AddActivityEntityRelationshipDocument
{
    
    public AddActivityEntityRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDACTIVITYENTITYRELATIONSHIP$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "addActivityEntityRelationship");
    
    
    /**
     * Gets the "addActivityEntityRelationship" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityEntityType getAddActivityEntityRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityEntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType)get_store().find_element_user(ADDACTIVITYENTITYRELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addActivityEntityRelationship" element
     */
    public void setAddActivityEntityRelationship(edu.indiana.d2i.komadu.axis2.client.ActivityEntityType addActivityEntityRelationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityEntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType)get_store().find_element_user(ADDACTIVITYENTITYRELATIONSHIP$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType)get_store().add_element_user(ADDACTIVITYENTITYRELATIONSHIP$0);
            }
            target.set(addActivityEntityRelationship);
        }
    }
    
    /**
     * Appends and returns a new empty "addActivityEntityRelationship" element
     */
    public edu.indiana.d2i.komadu.axis2.client.ActivityEntityType addNewAddActivityEntityRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.ActivityEntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType)get_store().add_element_user(ADDACTIVITYENTITYRELATIONSHIP$0);
            return target;
        }
    }
}
