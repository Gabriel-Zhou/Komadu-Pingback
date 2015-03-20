/*
 * XML Type:  getEntityDetailRequestType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetEntityDetailRequestType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML getEntityDetailRequestType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class GetEntityDetailRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetEntityDetailRequestType
{
    
    public GetEntityDetailRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYIDLIST$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "entityIDList");
    
    
    /**
     * Gets the "entityIDList" element
     */
    public edu.indiana.d2i.komadu.query.EntityIDListType getEntityIDList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityIDListType target = null;
            target = (edu.indiana.d2i.komadu.query.EntityIDListType)get_store().find_element_user(ENTITYIDLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entityIDList" element
     */
    public void setEntityIDList(edu.indiana.d2i.komadu.query.EntityIDListType entityIDList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityIDListType target = null;
            target = (edu.indiana.d2i.komadu.query.EntityIDListType)get_store().find_element_user(ENTITYIDLIST$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.EntityIDListType)get_store().add_element_user(ENTITYIDLIST$0);
            }
            target.set(entityIDList);
        }
    }
    
    /**
     * Appends and returns a new empty "entityIDList" element
     */
    public edu.indiana.d2i.komadu.query.EntityIDListType addNewEntityIDList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityIDListType target = null;
            target = (edu.indiana.d2i.komadu.query.EntityIDListType)get_store().add_element_user(ENTITYIDLIST$0);
            return target;
        }
    }
}
