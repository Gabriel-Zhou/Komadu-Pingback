/*
 * XML Type:  membersType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.MembersType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client.impl;
/**
 * An XML membersType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public class MembersTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.axis2.client.MembersType
{
    
    public MembersTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBER$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu", "member");
    
    
    /**
     * Gets array of all "member" elements
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityType[] getMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEMBER$0, targetList);
            edu.indiana.d2i.komadu.axis2.client.EntityType[] result = new edu.indiana.d2i.komadu.axis2.client.EntityType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "member" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityType getMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().find_element_user(MEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "member" element
     */
    public int sizeOfMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBER$0);
        }
    }
    
    /**
     * Sets array of all "member" element
     */
    public void setMemberArray(edu.indiana.d2i.komadu.axis2.client.EntityType[] memberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(memberArray, MEMBER$0);
        }
    }
    
    /**
     * Sets ith "member" element
     */
    public void setMemberArray(int i, edu.indiana.d2i.komadu.axis2.client.EntityType member)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().find_element_user(MEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(member);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "member" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityType insertNewMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().insert_element_user(MEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "member" element
     */
    public edu.indiana.d2i.komadu.axis2.client.EntityType addNewMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.axis2.client.EntityType target = null;
            target = (edu.indiana.d2i.komadu.axis2.client.EntityType)get_store().add_element_user(MEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "member" element
     */
    public void removeMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBER$0, i);
        }
    }
}
