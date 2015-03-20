/*
 * An XML document type.
 * Localname: activity
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.ActivityDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one activity(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class ActivityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.ActivityDocument
{
    
    public ActivityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "activity");
    
    
    /**
     * Gets the "activity" element
     */
    public org.w3.www.ns.prov.Activity getActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Activity target = null;
            target = (org.w3.www.ns.prov.Activity)get_store().find_element_user(ACTIVITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activity" element
     */
    public void setActivity(org.w3.www.ns.prov.Activity activity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Activity target = null;
            target = (org.w3.www.ns.prov.Activity)get_store().find_element_user(ACTIVITY$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Activity)get_store().add_element_user(ACTIVITY$0);
            }
            target.set(activity);
        }
    }
    
    /**
     * Appends and returns a new empty "activity" element
     */
    public org.w3.www.ns.prov.Activity addNewActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Activity target = null;
            target = (org.w3.www.ns.prov.Activity)get_store().add_element_user(ACTIVITY$0);
            return target;
        }
    }
}
