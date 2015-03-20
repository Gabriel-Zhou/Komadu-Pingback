/*
 * XML Type:  getEntityDetailResponseType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetEntityDetailResponseType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML getEntityDetailResponseType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class GetEntityDetailResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetEntityDetailResponseType
{
    
    public GetEntityDetailResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYDETAILLIST$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "entityDetailList");
    
    
    /**
     * Gets the "entityDetailList" element
     */
    public edu.indiana.d2i.komadu.query.EntityDetailListType getEntityDetailList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityDetailListType target = null;
            target = (edu.indiana.d2i.komadu.query.EntityDetailListType)get_store().find_element_user(ENTITYDETAILLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entityDetailList" element
     */
    public void setEntityDetailList(edu.indiana.d2i.komadu.query.EntityDetailListType entityDetailList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityDetailListType target = null;
            target = (edu.indiana.d2i.komadu.query.EntityDetailListType)get_store().find_element_user(ENTITYDETAILLIST$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.EntityDetailListType)get_store().add_element_user(ENTITYDETAILLIST$0);
            }
            target.set(entityDetailList);
        }
    }
    
    /**
     * Appends and returns a new empty "entityDetailList" element
     */
    public edu.indiana.d2i.komadu.query.EntityDetailListType addNewEntityDetailList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.EntityDetailListType target = null;
            target = (edu.indiana.d2i.komadu.query.EntityDetailListType)get_store().add_element_user(ENTITYDETAILLIST$0);
            return target;
        }
    }
}
