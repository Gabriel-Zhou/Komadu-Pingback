/*
 * An XML document type.
 * Localname: person
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.PersonDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one person(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class PersonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.PersonDocument
{
    
    public PersonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSON$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "person");
    
    
    /**
     * Gets the "person" element
     */
    public org.w3.www.ns.prov.Person getPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Person target = null;
            target = (org.w3.www.ns.prov.Person)get_store().find_element_user(PERSON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "person" element
     */
    public void setPerson(org.w3.www.ns.prov.Person person)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Person target = null;
            target = (org.w3.www.ns.prov.Person)get_store().find_element_user(PERSON$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Person)get_store().add_element_user(PERSON$0);
            }
            target.set(person);
        }
    }
    
    /**
     * Appends and returns a new empty "person" element
     */
    public org.w3.www.ns.prov.Person addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Person target = null;
            target = (org.w3.www.ns.prov.Person)get_store().add_element_user(PERSON$0);
            return target;
        }
    }
}
