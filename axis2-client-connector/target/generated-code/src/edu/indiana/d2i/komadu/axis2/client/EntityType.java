/*
 * XML Type:  entityType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.EntityType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client;


/**
 * An XML entityType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public interface EntityType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("entitytype1cb2type");
    
    /**
     * Gets the "file" element
     */
    edu.indiana.d2i.komadu.axis2.client.FileType getFile();
    
    /**
     * True if has "file" element
     */
    boolean isSetFile();
    
    /**
     * Sets the "file" element
     */
    void setFile(edu.indiana.d2i.komadu.axis2.client.FileType file);
    
    /**
     * Appends and returns a new empty "file" element
     */
    edu.indiana.d2i.komadu.axis2.client.FileType addNewFile();
    
    /**
     * Unsets the "file" element
     */
    void unsetFile();
    
    /**
     * Gets the "block" element
     */
    edu.indiana.d2i.komadu.axis2.client.BlockType getBlock();
    
    /**
     * True if has "block" element
     */
    boolean isSetBlock();
    
    /**
     * Sets the "block" element
     */
    void setBlock(edu.indiana.d2i.komadu.axis2.client.BlockType block);
    
    /**
     * Appends and returns a new empty "block" element
     */
    edu.indiana.d2i.komadu.axis2.client.BlockType addNewBlock();
    
    /**
     * Unsets the "block" element
     */
    void unsetBlock();
    
    /**
     * Gets the "collection" element
     */
    edu.indiana.d2i.komadu.axis2.client.CollectionType getCollection();
    
    /**
     * True if has "collection" element
     */
    boolean isSetCollection();
    
    /**
     * Sets the "collection" element
     */
    void setCollection(edu.indiana.d2i.komadu.axis2.client.CollectionType collection);
    
    /**
     * Appends and returns a new empty "collection" element
     */
    edu.indiana.d2i.komadu.axis2.client.CollectionType addNewCollection();
    
    /**
     * Unsets the "collection" element
     */
    void unsetCollection();
    
    /**
     * Gets the "genericEntity" element
     */
    edu.indiana.d2i.komadu.axis2.client.GenericEntityType getGenericEntity();
    
    /**
     * True if has "genericEntity" element
     */
    boolean isSetGenericEntity();
    
    /**
     * Sets the "genericEntity" element
     */
    void setGenericEntity(edu.indiana.d2i.komadu.axis2.client.GenericEntityType genericEntity);
    
    /**
     * Appends and returns a new empty "genericEntity" element
     */
    edu.indiana.d2i.komadu.axis2.client.GenericEntityType addNewGenericEntity();
    
    /**
     * Unsets the "genericEntity" element
     */
    void unsetGenericEntity();
    
    /**
     * Gets the "attributes" element
     */
    edu.indiana.d2i.komadu.axis2.client.AttributesType getAttributes();
    
    /**
     * True if has "attributes" element
     */
    boolean isSetAttributes();
    
    /**
     * Sets the "attributes" element
     */
    void setAttributes(edu.indiana.d2i.komadu.axis2.client.AttributesType attributes);
    
    /**
     * Appends and returns a new empty "attributes" element
     */
    edu.indiana.d2i.komadu.axis2.client.AttributesType addNewAttributes();
    
    /**
     * Unsets the "attributes" element
     */
    void unsetAttributes();
    
    /**
     * Gets the "role" element
     */
    java.lang.String getRole();
    
    /**
     * Gets (as xml) the "role" element
     */
    org.apache.xmlbeans.XmlString xgetRole();
    
    /**
     * True if has "role" element
     */
    boolean isSetRole();
    
    /**
     * Sets the "role" element
     */
    void setRole(java.lang.String role);
    
    /**
     * Sets (as xml) the "role" element
     */
    void xsetRole(org.apache.xmlbeans.XmlString role);
    
    /**
     * Unsets the "role" element
     */
    void unsetRole();
    
    /**
     * Gets the "location" element
     */
    java.lang.String getLocation();
    
    /**
     * Gets (as xml) the "location" element
     */
    org.apache.xmlbeans.XmlString xgetLocation();
    
    /**
     * True if has "location" element
     */
    boolean isSetLocation();
    
    /**
     * Sets the "location" element
     */
    void setLocation(java.lang.String location);
    
    /**
     * Sets (as xml) the "location" element
     */
    void xsetLocation(org.apache.xmlbeans.XmlString location);
    
    /**
     * Unsets the "location" element
     */
    void unsetLocation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.indiana.d2i.komadu.axis2.client.EntityType newInstance() {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.EntityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
