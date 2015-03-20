/*
 * An XML document type.
 * Localname: findEntityResponse
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.FindEntityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one findEntityResponse(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class FindEntityResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.FindEntityResponseDocument
{
    
    public FindEntityResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINDENTITYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "findEntityResponse");
    
    
    /**
     * Gets the "findEntityResponse" element
     */
    public edu.indiana.d2i.komadu.query.FindEntityResponseType getFindEntityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FindEntityResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.FindEntityResponseType)get_store().find_element_user(FINDENTITYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "findEntityResponse" element
     */
    public void setFindEntityResponse(edu.indiana.d2i.komadu.query.FindEntityResponseType findEntityResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FindEntityResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.FindEntityResponseType)get_store().find_element_user(FINDENTITYRESPONSE$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.FindEntityResponseType)get_store().add_element_user(FINDENTITYRESPONSE$0);
            }
            target.set(findEntityResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "findEntityResponse" element
     */
    public edu.indiana.d2i.komadu.query.FindEntityResponseType addNewFindEntityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FindEntityResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.FindEntityResponseType)get_store().add_element_user(FINDENTITYRESPONSE$0);
            return target;
        }
    }
}
