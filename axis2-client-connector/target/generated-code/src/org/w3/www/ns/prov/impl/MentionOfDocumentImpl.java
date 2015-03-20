/*
 * An XML document type.
 * Localname: mentionOf
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.MentionOfDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one mentionOf(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class MentionOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.MentionOfDocument
{
    
    public MentionOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MENTIONOF$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "mentionOf");
    
    
    /**
     * Gets the "mentionOf" element
     */
    public org.w3.www.ns.prov.Mention getMentionOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Mention target = null;
            target = (org.w3.www.ns.prov.Mention)get_store().find_element_user(MENTIONOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mentionOf" element
     */
    public void setMentionOf(org.w3.www.ns.prov.Mention mentionOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Mention target = null;
            target = (org.w3.www.ns.prov.Mention)get_store().find_element_user(MENTIONOF$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Mention)get_store().add_element_user(MENTIONOF$0);
            }
            target.set(mentionOf);
        }
    }
    
    /**
     * Appends and returns a new empty "mentionOf" element
     */
    public org.w3.www.ns.prov.Mention addNewMentionOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Mention target = null;
            target = (org.w3.www.ns.prov.Mention)get_store().add_element_user(MENTIONOF$0);
            return target;
        }
    }
}
