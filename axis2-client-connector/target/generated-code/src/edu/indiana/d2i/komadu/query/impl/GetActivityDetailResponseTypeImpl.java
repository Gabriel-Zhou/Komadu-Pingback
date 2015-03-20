/*
 * XML Type:  getActivityDetailResponseType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetActivityDetailResponseType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML getActivityDetailResponseType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class GetActivityDetailResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetActivityDetailResponseType
{
    
    public GetActivityDetailResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYDETAILLIST$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "activityDetailList");
    
    
    /**
     * Gets the "activityDetailList" element
     */
    public edu.indiana.d2i.komadu.query.ActivityDetailListType getActivityDetailList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.ActivityDetailListType target = null;
            target = (edu.indiana.d2i.komadu.query.ActivityDetailListType)get_store().find_element_user(ACTIVITYDETAILLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activityDetailList" element
     */
    public void setActivityDetailList(edu.indiana.d2i.komadu.query.ActivityDetailListType activityDetailList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.ActivityDetailListType target = null;
            target = (edu.indiana.d2i.komadu.query.ActivityDetailListType)get_store().find_element_user(ACTIVITYDETAILLIST$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.ActivityDetailListType)get_store().add_element_user(ACTIVITYDETAILLIST$0);
            }
            target.set(activityDetailList);
        }
    }
    
    /**
     * Appends and returns a new empty "activityDetailList" element
     */
    public edu.indiana.d2i.komadu.query.ActivityDetailListType addNewActivityDetailList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.ActivityDetailListType target = null;
            target = (edu.indiana.d2i.komadu.query.ActivityDetailListType)get_store().add_element_user(ACTIVITYDETAILLIST$0);
            return target;
        }
    }
}
