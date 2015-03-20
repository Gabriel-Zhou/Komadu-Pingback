/*
 * XML Type:  addAttributesType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AddAttributesType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client;


/**
 * An XML addAttributesType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public interface AddAttributesType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddAttributesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("addattributestype9175type");
    
    /**
     * Gets the "objectType" element
     */
    edu.indiana.d2i.komadu.axis2.client.ObjectEnumType.Enum getObjectType();
    
    /**
     * Gets (as xml) the "objectType" element
     */
    edu.indiana.d2i.komadu.axis2.client.ObjectEnumType xgetObjectType();
    
    /**
     * Sets the "objectType" element
     */
    void setObjectType(edu.indiana.d2i.komadu.axis2.client.ObjectEnumType.Enum objectType);
    
    /**
     * Sets (as xml) the "objectType" element
     */
    void xsetObjectType(edu.indiana.d2i.komadu.axis2.client.ObjectEnumType objectType);
    
    /**
     * Gets the "objectID" element
     */
    java.lang.String getObjectID();
    
    /**
     * Gets (as xml) the "objectID" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetObjectID();
    
    /**
     * Sets the "objectID" element
     */
    void setObjectID(java.lang.String objectID);
    
    /**
     * Sets (as xml) the "objectID" element
     */
    void xsetObjectID(org.apache.xmlbeans.XmlAnyURI objectID);
    
    /**
     * Gets the "entityType" element
     */
    edu.indiana.d2i.komadu.axis2.client.EntityEnumType.Enum getEntityType();
    
    /**
     * Gets (as xml) the "entityType" element
     */
    edu.indiana.d2i.komadu.axis2.client.EntityEnumType xgetEntityType();
    
    /**
     * True if has "entityType" element
     */
    boolean isSetEntityType();
    
    /**
     * Sets the "entityType" element
     */
    void setEntityType(edu.indiana.d2i.komadu.axis2.client.EntityEnumType.Enum entityType);
    
    /**
     * Sets (as xml) the "entityType" element
     */
    void xsetEntityType(edu.indiana.d2i.komadu.axis2.client.EntityEnumType entityType);
    
    /**
     * Unsets the "entityType" element
     */
    void unsetEntityType();
    
    /**
     * Gets the "attributes" element
     */
    edu.indiana.d2i.komadu.axis2.client.AttributesType getAttributes();
    
    /**
     * Sets the "attributes" element
     */
    void setAttributes(edu.indiana.d2i.komadu.axis2.client.AttributesType attributes);
    
    /**
     * Appends and returns a new empty "attributes" element
     */
    edu.indiana.d2i.komadu.axis2.client.AttributesType addNewAttributes();
    
    /**
     * Gets the "addAttributeTimestamp" element
     */
    java.util.Calendar getAddAttributeTimestamp();
    
    /**
     * Gets (as xml) the "addAttributeTimestamp" element
     */
    org.apache.xmlbeans.XmlDateTime xgetAddAttributeTimestamp();
    
    /**
     * True if has "addAttributeTimestamp" element
     */
    boolean isSetAddAttributeTimestamp();
    
    /**
     * Sets the "addAttributeTimestamp" element
     */
    void setAddAttributeTimestamp(java.util.Calendar addAttributeTimestamp);
    
    /**
     * Sets (as xml) the "addAttributeTimestamp" element
     */
    void xsetAddAttributeTimestamp(org.apache.xmlbeans.XmlDateTime addAttributeTimestamp);
    
    /**
     * Unsets the "addAttributeTimestamp" element
     */
    void unsetAddAttributeTimestamp();
    
    /**
     * Gets the "notificationTimestamp" element
     */
    java.util.Calendar getNotificationTimestamp();
    
    /**
     * Gets (as xml) the "notificationTimestamp" element
     */
    org.apache.xmlbeans.XmlDateTime xgetNotificationTimestamp();
    
    /**
     * Sets the "notificationTimestamp" element
     */
    void setNotificationTimestamp(java.util.Calendar notificationTimestamp);
    
    /**
     * Sets (as xml) the "notificationTimestamp" element
     */
    void xsetNotificationTimestamp(org.apache.xmlbeans.XmlDateTime notificationTimestamp);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType newInstance() {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.AddAttributesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.AddAttributesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
