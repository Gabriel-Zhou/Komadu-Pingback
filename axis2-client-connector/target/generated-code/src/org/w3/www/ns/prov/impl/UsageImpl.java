/*
 * XML Type:  Usage
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.Usage
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * An XML Usage(@http://www.w3.org/ns/prov#).
 *
 * This is a complex type.
 */
public class UsageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.Usage
{
    
    public UsageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "activity");
    private static final javax.xml.namespace.QName ENTITY$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "entity");
    private static final javax.xml.namespace.QName TIME$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "time");
    private static final javax.xml.namespace.QName LABEL$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "label");
    private static final javax.xml.namespace.QName LOCATION$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "location");
    private static final javax.xml.namespace.QName ROLE$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "role");
    private static final javax.xml.namespace.QName TYPE$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "type");
    private static final javax.xml.namespace.QName ID$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "id");
    
    
    /**
     * Gets the "activity" element
     */
    public org.w3.www.ns.prov.IDRef getActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(ACTIVITY$0, 0);
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
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(ACTIVITY$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(ACTIVITY$0);
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
            target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(ACTIVITY$0);
            return target;
        }
    }
    
    /**
     * Gets the "entity" element
     */
    public org.w3.www.ns.prov.IDRef getEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(ENTITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entity" element
     */
    public void setEntity(org.w3.www.ns.prov.IDRef entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(ENTITY$2, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(ENTITY$2);
            }
            target.set(entity);
        }
    }
    
    /**
     * Appends and returns a new empty "entity" element
     */
    public org.w3.www.ns.prov.IDRef addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(ENTITY$2);
            return target;
        }
    }
    
    /**
     * Gets the "time" element
     */
    public java.util.Calendar getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "time" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "time" element
     */
    public boolean isSetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIME$4) != 0;
        }
    }
    
    /**
     * Sets the "time" element
     */
    public void setTime(java.util.Calendar time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIME$4);
            }
            target.setCalendarValue(time);
        }
    }
    
    /**
     * Sets (as xml) the "time" element
     */
    public void xsetTime(org.apache.xmlbeans.XmlDateTime time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIME$4);
            }
            target.set(time);
        }
    }
    
    /**
     * Unsets the "time" element
     */
    public void unsetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIME$4, 0);
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
     * Gets array of all "location" elements
     */
    public org.w3.www.ns.prov.Location[] getLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATION$8, targetList);
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
            target = (org.w3.www.ns.prov.Location)get_store().find_element_user(LOCATION$8, i);
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
            return get_store().count_elements(LOCATION$8);
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
            arraySetterHelper(locationArray, LOCATION$8);
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
            target = (org.w3.www.ns.prov.Location)get_store().find_element_user(LOCATION$8, i);
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
            target = (org.w3.www.ns.prov.Location)get_store().insert_element_user(LOCATION$8, i);
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
            target = (org.w3.www.ns.prov.Location)get_store().add_element_user(LOCATION$8);
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
            get_store().remove_element(LOCATION$8, i);
        }
    }
    
    /**
     * Gets array of all "role" elements
     */
    public org.w3.www.ns.prov.Role[] getRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLE$10, targetList);
            org.w3.www.ns.prov.Role[] result = new org.w3.www.ns.prov.Role[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "role" element
     */
    public org.w3.www.ns.prov.Role getRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Role target = null;
            target = (org.w3.www.ns.prov.Role)get_store().find_element_user(ROLE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "role" element
     */
    public int sizeOfRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLE$10);
        }
    }
    
    /**
     * Sets array of all "role" element
     */
    public void setRoleArray(org.w3.www.ns.prov.Role[] roleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(roleArray, ROLE$10);
        }
    }
    
    /**
     * Sets ith "role" element
     */
    public void setRoleArray(int i, org.w3.www.ns.prov.Role role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Role target = null;
            target = (org.w3.www.ns.prov.Role)get_store().find_element_user(ROLE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(role);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "role" element
     */
    public org.w3.www.ns.prov.Role insertNewRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Role target = null;
            target = (org.w3.www.ns.prov.Role)get_store().insert_element_user(ROLE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role" element
     */
    public org.w3.www.ns.prov.Role addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Role target = null;
            target = (org.w3.www.ns.prov.Role)get_store().add_element_user(ROLE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "role" element
     */
    public void removeRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLE$10, i);
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
            get_store().find_all_element_users(TYPE$12, targetList);
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
            target = (org.w3.www.ns.prov.Type)get_store().find_element_user(TYPE$12, i);
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
            return get_store().count_elements(TYPE$12);
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
            arraySetterHelper(typeArray, TYPE$12);
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
            target = (org.w3.www.ns.prov.Type)get_store().find_element_user(TYPE$12, i);
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
            target = (org.w3.www.ns.prov.Type)get_store().insert_element_user(TYPE$12, i);
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
            target = (org.w3.www.ns.prov.Type)get_store().add_element_user(TYPE$12);
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
            get_store().remove_element(TYPE$12, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ID$14);
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
            return get_store().find_attribute_user(ID$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$14);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ID$14);
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
            get_store().remove_attribute(ID$14);
        }
    }
}
