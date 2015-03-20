/*
 * XML Type:  Delegation
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.Delegation
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * An XML Delegation(@http://www.w3.org/ns/prov#).
 *
 * This is a complex type.
 */
public class DelegationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.Delegation
{
    
    public DelegationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELEGATE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "delegate");
    private static final javax.xml.namespace.QName RESPONSIBLE$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "responsible");
    private static final javax.xml.namespace.QName ACTIVITY$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "activity");
    private static final javax.xml.namespace.QName LABEL$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "label");
    private static final javax.xml.namespace.QName TYPE$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "type");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "id");
    
    
    /**
     * Gets the "delegate" element
     */
    public org.w3.www.ns.prov.IDRef getDelegate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(DELEGATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "delegate" element
     */
    public void setDelegate(org.w3.www.ns.prov.IDRef delegate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(DELEGATE$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(DELEGATE$0);
            }
            target.set(delegate);
        }
    }
    
    /**
     * Appends and returns a new empty "delegate" element
     */
    public org.w3.www.ns.prov.IDRef addNewDelegate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(DELEGATE$0);
            return target;
        }
    }
    
    /**
     * Gets the "responsible" element
     */
    public org.w3.www.ns.prov.IDRef getResponsible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(RESPONSIBLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "responsible" element
     */
    public void setResponsible(org.w3.www.ns.prov.IDRef responsible)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(RESPONSIBLE$2, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(RESPONSIBLE$2);
            }
            target.set(responsible);
        }
    }
    
    /**
     * Appends and returns a new empty "responsible" element
     */
    public org.w3.www.ns.prov.IDRef addNewResponsible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(RESPONSIBLE$2);
            return target;
        }
    }
    
    /**
     * Gets the "activity" element
     */
    public org.w3.www.ns.prov.IDRef getActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(ACTIVITY$4, 0);
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
    public void setActivity(org.w3.www.ns.prov.IDRef activity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(ACTIVITY$4, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(ACTIVITY$4);
            }
            target.set(activity);
        }
    }
    
    /**
     * Appends and returns a new empty "activity" element
     */
    public org.w3.www.ns.prov.IDRef addNewActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(ACTIVITY$4);
            return target;
        }
    }
    
    /**
     * Gets array of all "label" elements
     */
    public org.w3.www.ns.prov.InternationalizedString[] getLabelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LABEL$6, targetList);
            org.w3.www.ns.prov.InternationalizedString[] result = new org.w3.www.ns.prov.InternationalizedString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "label" element
     */
    public org.w3.www.ns.prov.InternationalizedString getLabelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.InternationalizedString target = null;
            target = (org.w3.www.ns.prov.InternationalizedString)get_store().find_element_user(LABEL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "label" element
     */
    public int sizeOfLabelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LABEL$6);
        }
    }
    
    /**
     * Sets array of all "label" element
     */
    public void setLabelArray(org.w3.www.ns.prov.InternationalizedString[] labelArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(labelArray, LABEL$6);
        }
    }
    
    /**
     * Sets ith "label" element
     */
    public void setLabelArray(int i, org.w3.www.ns.prov.InternationalizedString label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.InternationalizedString target = null;
            target = (org.w3.www.ns.prov.InternationalizedString)get_store().find_element_user(LABEL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(label);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "label" element
     */
    public org.w3.www.ns.prov.InternationalizedString insertNewLabel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.InternationalizedString target = null;
            target = (org.w3.www.ns.prov.InternationalizedString)get_store().insert_element_user(LABEL$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "label" element
     */
    public org.w3.www.ns.prov.InternationalizedString addNewLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.InternationalizedString target = null;
            target = (org.w3.www.ns.prov.InternationalizedString)get_store().add_element_user(LABEL$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "label" element
     */
    public void removeLabel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LABEL$6, i);
        }
    }
    
    /**
     * Gets array of all "type" elements
     */
    public org.w3.www.ns.prov.Type[] getTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TYPE$8, targetList);
            org.w3.www.ns.prov.Type[] result = new org.w3.www.ns.prov.Type[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "type" element
     */
    public org.w3.www.ns.prov.Type getTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Type target = null;
            target = (org.w3.www.ns.prov.Type)get_store().find_element_user(TYPE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "type" element
     */
    public int sizeOfTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$8);
        }
    }
    
    /**
     * Sets array of all "type" element
     */
    public void setTypeArray(org.w3.www.ns.prov.Type[] typeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(typeArray, TYPE$8);
        }
    }
    
    /**
     * Sets ith "type" element
     */
    public void setTypeArray(int i, org.w3.www.ns.prov.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Type target = null;
            target = (org.w3.www.ns.prov.Type)get_store().find_element_user(TYPE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(type);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "type" element
     */
    public org.w3.www.ns.prov.Type insertNewType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Type target = null;
            target = (org.w3.www.ns.prov.Type)get_store().insert_element_user(TYPE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "type" element
     */
    public org.w3.www.ns.prov.Type addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Type target = null;
            target = (org.w3.www.ns.prov.Type)get_store().add_element_user(TYPE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "type" element
     */
    public void removeType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$8, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public javax.xml.namespace.QName getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$10) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(javax.xml.namespace.QName id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setQNameValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlQName id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$10);
        }
    }
}
