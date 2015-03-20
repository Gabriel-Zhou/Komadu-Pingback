/*
 * An XML document type.
 * Localname: location
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.LocationDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov.impl;
/**
 * A document containing one location(@http://www.w3.org/ns/prov#) element.
 *
 * This is a complex type.
 */
public class LocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.www.ns.prov.LocationDocument
{
    
    public LocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/ns/prov#", "location");
    
    
    /**
     * Gets the "location" element
     */
    public org.w3.www.ns.prov.Location getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Location target = null;
            target = (org.w3.www.ns.prov.Location)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(org.w3.www.ns.prov.Location location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Location target = null;
            target = (org.w3.www.ns.prov.Location)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                target = (org.w3.www.ns.prov.Location)get_store().add_element_user(LOCATION$0);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public org.w3.www.ns.prov.Location addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.www.ns.prov.Location target = null;
            target = (org.w3.www.ns.prov.Location)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
}
