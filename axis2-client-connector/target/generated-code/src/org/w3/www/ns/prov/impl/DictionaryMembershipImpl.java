/*
 * XML Type:  DictionaryMembership
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.DictionaryMembership
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * An XML DictionaryMembership(@http://www.w3.org/ns/prov#).
 *
 * This is a complex type.
 */
public class DictionaryMembershipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.DictionaryMembership
{
    
    public DictionaryMembershipImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DICTIONARY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "dictionary");
    private static final javax.xml.namespace.QName KEYENTITYPAIR$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "keyEntityPair");
    
    
    /**
     * Gets the "dictionary" element
     */
    public org.w3.www.ns.prov.IDRef getDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(DICTIONARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dictionary" element
     */
    public void setDictionary(org.w3.www.ns.prov.IDRef dictionary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().find_element_user(DICTIONARY$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(DICTIONARY$0);
            }
            target.set(dictionary);
        }
    }
    
    /**
     * Appends and returns a new empty "dictionary" element
     */
    public org.w3.www.ns.prov.IDRef addNewDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.IDRef target = null;
            target = (org.w3.www.ns.prov.IDRef)get_store().add_element_user(DICTIONARY$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "keyEntityPair" elements
     */
    public org.w3.www.ns.prov.KeyEntityPair[] getKeyEntityPairArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYENTITYPAIR$2, targetList);
            org.w3.www.ns.prov.KeyEntityPair[] result = new org.w3.www.ns.prov.KeyEntityPair[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "keyEntityPair" element
     */
    public org.w3.www.ns.prov.KeyEntityPair getKeyEntityPairArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.KeyEntityPair target = null;
            target = (org.w3.www.ns.prov.KeyEntityPair)get_store().find_element_user(KEYENTITYPAIR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "keyEntityPair" element
     */
    public int sizeOfKeyEntityPairArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYENTITYPAIR$2);
        }
    }
    
    /**
     * Sets array of all "keyEntityPair" element
     */
    public void setKeyEntityPairArray(org.w3.www.ns.prov.KeyEntityPair[] keyEntityPairArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyEntityPairArray, KEYENTITYPAIR$2);
        }
    }
    
    /**
     * Sets ith "keyEntityPair" element
     */
    public void setKeyEntityPairArray(int i, org.w3.www.ns.prov.KeyEntityPair keyEntityPair)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.KeyEntityPair target = null;
            target = (org.w3.www.ns.prov.KeyEntityPair)get_store().find_element_user(KEYENTITYPAIR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyEntityPair);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "keyEntityPair" element
     */
    public org.w3.www.ns.prov.KeyEntityPair insertNewKeyEntityPair(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.KeyEntityPair target = null;
            target = (org.w3.www.ns.prov.KeyEntityPair)get_store().insert_element_user(KEYENTITYPAIR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "keyEntityPair" element
     */
    public org.w3.www.ns.prov.KeyEntityPair addNewKeyEntityPair()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.KeyEntityPair target = null;
            target = (org.w3.www.ns.prov.KeyEntityPair)get_store().add_element_user(KEYENTITYPAIR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "keyEntityPair" element
     */
    public void removeKeyEntityPair(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYENTITYPAIR$2, i);
        }
    }
}
