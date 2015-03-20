/*
 * XML Type:  getAgentGraphResponseType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetAgentGraphResponseType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * An XML getAgentGraphResponseType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public class GetAgentGraphResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.GetAgentGraphResponseType
{
    
    public GetAgentGraphResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENT$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "document");
    
    
    /**
     * Gets the "document" element
     */
    public org.w3.www.ns.prov.Document getDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Document target = null;
            target = (org.w3.www.ns.prov.Document)get_store().find_element_user(DOCUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "document" element
     */
    public void setDocument(org.w3.www.ns.prov.Document document)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Document target = null;
            target = (org.w3.www.ns.prov.Document)get_store().find_element_user(DOCUMENT$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Document)get_store().add_element_user(DOCUMENT$0);
            }
            target.set(document);
        }
    }
    
    /**
     * Appends and returns a new empty "document" element
     */
    public org.w3.www.ns.prov.Document addNewDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Document target = null;
            target = (org.w3.www.ns.prov.Document)get_store().add_element_user(DOCUMENT$0);
            return target;
        }
    }
}
