/*
 * XML Type:  agentType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.AgentType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client;


/**
 * An XML agentType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public interface AgentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AgentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("agenttype0762type");
    
    /**
     * Gets the "userAgent" element
     */
    edu.indiana.d2i.komadu.axis2.client.UserAgentType getUserAgent();
    
    /**
     * True if has "userAgent" element
     */
    boolean isSetUserAgent();
    
    /**
     * Sets the "userAgent" element
     */
    void setUserAgent(edu.indiana.d2i.komadu.axis2.client.UserAgentType userAgent);
    
    /**
     * Appends and returns a new empty "userAgent" element
     */
    edu.indiana.d2i.komadu.axis2.client.UserAgentType addNewUserAgent();
    
    /**
     * Unsets the "userAgent" element
     */
    void unsetUserAgent();
    
    /**
     * Gets the "genericAgent" element
     */
    edu.indiana.d2i.komadu.axis2.client.GenericAgentType getGenericAgent();
    
    /**
     * True if has "genericAgent" element
     */
    boolean isSetGenericAgent();
    
    /**
     * Sets the "genericAgent" element
     */
    void setGenericAgent(edu.indiana.d2i.komadu.axis2.client.GenericAgentType genericAgent);
    
    /**
     * Appends and returns a new empty "genericAgent" element
     */
    edu.indiana.d2i.komadu.axis2.client.GenericAgentType addNewGenericAgent();
    
    /**
     * Unsets the "genericAgent" element
     */
    void unsetGenericAgent();
    
    /**
     * Gets the "type" element
     */
    edu.indiana.d2i.komadu.axis2.client.AgentEnumType.Enum getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    edu.indiana.d2i.komadu.axis2.client.AgentEnumType xgetType();
    
    /**
     * Sets the "type" element
     */
    void setType(edu.indiana.d2i.komadu.axis2.client.AgentEnumType.Enum type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(edu.indiana.d2i.komadu.axis2.client.AgentEnumType type);
    
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
        public static edu.indiana.d2i.komadu.axis2.client.AgentType newInstance() {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AgentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.AgentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.AgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
