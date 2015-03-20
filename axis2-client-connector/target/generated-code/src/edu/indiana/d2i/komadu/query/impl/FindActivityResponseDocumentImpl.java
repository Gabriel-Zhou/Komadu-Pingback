/*
 * An XML document type.
 * Localname: findActivityResponse
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.FindActivityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one findActivityResponse(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class FindActivityResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.FindActivityResponseDocument
{
    
    public FindActivityResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINDACTIVITYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "findActivityResponse");
    
    
    /**
     * Gets the "findActivityResponse" element
     */
    public edu.indiana.d2i.komadu.query.FindActivityResponseType getFindActivityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FindActivityResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.FindActivityResponseType)get_store().find_element_user(FINDACTIVITYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "findActivityResponse" element
     */
    public void setFindActivityResponse(edu.indiana.d2i.komadu.query.FindActivityResponseType findActivityResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FindActivityResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.FindActivityResponseType)get_store().find_element_user(FINDACTIVITYRESPONSE$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.FindActivityResponseType)get_store().add_element_user(FINDACTIVITYRESPONSE$0);
            }
            target.set(findActivityResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "findActivityResponse" element
     */
    public edu.indiana.d2i.komadu.query.FindActivityResponseType addNewFindActivityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FindActivityResponseType target = null;
            target = (edu.indiana.d2i.komadu.query.FindActivityResponseType)get_store().add_element_user(FINDACTIVITYRESPONSE$0);
            return target;
        }
    }
}
