/*
 * An XML document type.
 * Localname: addEntityEntityRelationship
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AddEntityEntityRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * A document containing one addEntityEntityRelationship(@http://komadu.d2i.indiana.edu) element.
 *
 * This is a complex type.
 */
public class AddEntityEntityRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.AddEntityEntityRelationshipDocument
{
    
    public AddEntityEntityRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDENTITYENTITYRELATIONSHIP$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "addEntityEntityRelationship");
    
    
    /**
     * Gets the "addEntityEntityRelationship" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityEntityType getAddEntityEntityRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityEntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityEntityType)get_store().find_element_user(ADDENTITYENTITYRELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addEntityEntityRelationship" element
     */
    public void setAddEntityEntityRelationship(edu.indiana.d2i.komadu.axis2.client.EntityEntityType addEntityEntityRelationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityEntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityEntityType)get_store().find_element_user(ADDENTITYENTITYRELATIONSHIP$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.axis2.client.EntityEntityType)get_store().add_element_user(ADDENTITYENTITYRELATIONSHIP$0);
            }
            target.set(addEntityEntityRelationship);
        }
    }
    
    /**
     * Appends and returns a new empty "addEntityEntityRelationship" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityEntityType addNewAddEntityEntityRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityEntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityEntityType)get_store().add_element_user(ADDENTITYENTITYRELATIONSHIP$0);
            return target;
        }
    }
}
