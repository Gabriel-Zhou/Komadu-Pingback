/*
 * An XML document type.
 * Localname: hadDictionaryMember
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.HadDictionaryMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one hadDictionaryMember(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class HadDictionaryMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.HadDictionaryMemberDocument
{
    
    public HadDictionaryMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HADDICTIONARYMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "hadDictionaryMember");
    
    
    /**
     * Gets the "hadDictionaryMember" element
     */
    public org.w3.www.ns.prov.DictionaryMembership getHadDictionaryMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.DictionaryMembership target = null;
            target = (org.w3.www.ns.prov.DictionaryMembership)get_store().find_element_user(HADDICTIONARYMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hadDictionaryMember" element
     */
    public void setHadDictionaryMember(org.w3.www.ns.prov.DictionaryMembership hadDictionaryMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.DictionaryMembership target = null;
            target = (org.w3.www.ns.prov.DictionaryMembership)get_store().find_element_user(HADDICTIONARYMEMBER$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.DictionaryMembership)get_store().add_element_user(HADDICTIONARYMEMBER$0);
            }
            target.set(hadDictionaryMember);
        }
    }
    
    /**
     * Appends and returns a new empty "hadDictionaryMember" element
     */
    public org.w3.www.ns.prov.DictionaryMembership addNewHadDictionaryMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.DictionaryMembership target = null;
            target = (org.w3.www.ns.prov.DictionaryMembership)get_store().add_element_user(HADDICTIONARYMEMBER$0);
            return target;
        }
    }
}
