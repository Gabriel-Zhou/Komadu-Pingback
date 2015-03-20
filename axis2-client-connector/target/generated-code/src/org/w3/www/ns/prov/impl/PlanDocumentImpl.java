/*
 * An XML document type.
 * Localname: plan
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.PlanDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one plan(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class PlanDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.PlanDocument
{
    
    public PlanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLAN$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "plan");
    
    
    /**
     * Gets the "plan" element
     */
    public org.w3.www.ns.prov.Plan getPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Plan target = null;
            target = (org.w3.www.ns.prov.Plan)get_store().find_element_user(PLAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "plan" element
     */
    public void setPlan(org.w3.www.ns.prov.Plan plan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Plan target = null;
            target = (org.w3.www.ns.prov.Plan)get_store().find_element_user(PLAN$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Plan)get_store().add_element_user(PLAN$0);
            }
            target.set(plan);
        }
    }
    
    /**
     * Appends and returns a new empty "plan" element
     */
    public org.w3.www.ns.prov.Plan addNewPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Plan target = null;
            target = (org.w3.www.ns.prov.Plan)get_store().add_element_user(PLAN$0);
            return target;
        }
    }
}
