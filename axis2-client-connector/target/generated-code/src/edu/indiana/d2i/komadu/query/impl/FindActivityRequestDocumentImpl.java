/*
 * An XML document type.
 * Localname: findActivityRequest
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.FindActivityRequestDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query.impl;
/**
 * A document containing one findActivityRequest(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public class FindActivityRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.indiana.d2i.komadu.query.FindActivityRequestDocument
{
    
    public FindActivityRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINDACTIVITYREQUEST$0 = 
        new javax.xml.namespace.QName("http://komadu.d2i.indiana.edu/query", "findActivityRequest");
    
    
    /**
     * Gets the "findActivityRequest" element
     */
    public edu.indiana.d2i.komadu.query.FindActivityRequestType getFindActivityRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FindActivityRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.FindActivityRequestType)get_store().find_element_user(FINDACTIVITYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "findActivityRequest" element
     */
    public void setFindActivityRequest(edu.indiana.d2i.komadu.query.FindActivityRequestType findActivityRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FindActivityRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.FindActivityRequestType)get_store().find_element_user(FINDACTIVITYREQUEST$0, 0);
            if (target == null)
            {
                target = (edu.indiana.d2i.komadu.query.FindActivityRequestType)get_store().add_element_user(FINDACTIVITYREQUEST$0);
            }
            target.set(findActivityRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "findActivityRequest" element
     */
    public edu.indiana.d2i.komadu.query.FindActivityRequestType addNewFindActivityRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.indiana.d2i.komadu.query.FindActivityRequestType target = null;
            target = (edu.indiana.d2i.komadu.query.FindActivityRequestType)get_store().add_element_user(FINDACTIVITYREQUEST$0);
            return target;
        }
    }
}
