/*
 * XML Type:  Entity
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.Entity
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * An XML Entity(@http://www.w3.org/ns/prov#).
 *
 * This is a complex type.
 */
public class EntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.Entity
{
    
    public EntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABEL$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "label");
    private static final javax.xml.namespace.QName LOCATION$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "location");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "type");
    private static final javax.xml.namespace.QName VALUE$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "value");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "id");
    
    
    /**
     * Gets array of all "label" elements
     */
    public org.w3.www.ns.prov.InternationalizedString[] getLabelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LABEL$0, targetList);
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
            target = (org.w3.www.ns.prov.InternationalizedString)get_store().find_element_user(LABEL$0, i);
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
            return get_store().count_elements(LABEL$0);
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
            arraySetterHelper(labelArray, LABEL$0);
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
            target = (org.w3.www.ns.prov.InternationalizedString)get_store().find_element_user(LABEL$0, i);
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
            target = (org.w3.www.ns.prov.InternationalizedString)get_store().insert_element_user(LABEL$0, i);
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
            target = (org.w3.www.ns.prov.InternationalizedString)get_store().add_element_user(LABEL$0);
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
            get_store().remove_element(LABEL$0, i);
        }
    }
    
    /**
     * Gets array of all "location" elements
     */
    public org.w3.www.ns.prov.Location[] getLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATION$2, targetList);
            org.w3.www.ns.prov.Location[] result = new org.w3.www.ns.prov.Location[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "location" element
     */
    public org.w3.www.ns.prov.Location getLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Location target = null;
            target = (org.w3.www.ns.prov.Location)get_store().find_element_user(LOCATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "location" element
     */
    public int sizeOfLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$2);
        }
    }
    
    /**
     * Sets array of all "location" element
     */
    public void setLocationArray(org.w3.www.ns.prov.Location[] locationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationArray, LOCATION$2);
        }
    }
    
    /**
     * Sets ith "location" element
     */
    public void setLocationArray(int i, org.w3.www.ns.prov.Location location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Location target = null;
            target = (org.w3.www.ns.prov.Location)get_store().find_element_user(LOCATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(location);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "location" element
     */
    public org.w3.www.ns.prov.Location insertNewLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Location target = null;
            target = (org.w3.www.ns.prov.Location)get_store().insert_element_user(LOCATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    public org.w3.www.ns.prov.Location addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Location target = null;
            target = (org.w3.www.ns.prov.Location)get_store().add_element_user(LOCATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "location" element
     */
    public void removeLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$2, i);
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
            get_store().find_all_element_users(TYPE$4, targetList);
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
            target = (org.w3.www.ns.prov.Type)get_store().find_element_user(TYPE$4, i);
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
            return get_store().count_elements(TYPE$4);
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
            arraySetterHelper(typeArray, TYPE$4);
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
            target = (org.w3.www.ns.prov.Type)get_store().find_element_user(TYPE$4, i);
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
            target = (org.w3.www.ns.prov.Type)get_store().insert_element_user(TYPE$4, i);
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
            target = (org.w3.www.ns.prov.Type)get_store().add_element_user(TYPE$4);
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
            get_store().remove_element(TYPE$4, i);
        }
    }
    
    /**
     * Gets the "value" element
     */
    public org.w3.www.ns.prov.Value getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Value target = null;
            target = (org.w3.www.ns.prov.Value)get_store().find_element_user(VALUE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "value" element
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$6) != 0;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(org.w3.www.ns.prov.Value value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Value target = null;
            target = (org.w3.www.ns.prov.Value)get_store().find_element_user(VALUE$6, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Value)get_store().add_element_user(VALUE$6);
            }
            target.set(value);
        }
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public org.w3.www.ns.prov.Value addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Value target = null;
            target = (org.w3.www.ns.prov.Value)get_store().add_element_user(VALUE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "value" element
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ID$8);
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
            return get_store().find_attribute_user(ID$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ID$8);
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
            get_store().remove_attribute(ID$8);
        }
    }
}
