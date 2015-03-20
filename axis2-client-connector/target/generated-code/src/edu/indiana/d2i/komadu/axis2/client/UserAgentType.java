/*
 * XML Type:  userAgentType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.UserAgentType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client;


/**
 * An XML userAgentType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public interface UserAgentType extends edu.indiana.d2i.komadu.axis2.client.GenericAgentType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserAgentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("useragenttype4197type");
    
    /**
     * Gets the "fullName" element
     */
    java.lang.String getFullName();
    
    /**
     * Gets (as xml) the "fullName" element
     */
    org.apache.xmlbeans.XmlString xgetFullName();
    
    /**
     * True if has "fullName" element
     */
    boolean isSetFullName();
    
    /**
     * Sets the "fullName" element
     */
    void setFullName(java.lang.String fullName);
    
    /**
     * Sets (as xml) the "fullName" element
     */
    void xsetFullName(org.apache.xmlbeans.XmlString fullName);
    
    /**
     * Unsets the "fullName" element
     */
    void unsetFullName();
    
    /**
     * Gets the "affiliation" element
     */
    java.lang.String getAffiliation();
    
    /**
     * Gets (as xml) the "affiliation" element
     */
    org.apache.xmlbeans.XmlString xgetAffiliation();
    
    /**
     * True if has "affiliation" element
     */
    boolean isSetAffiliation();
    
    /**
     * Sets the "affiliation" element
     */
    void setAffiliation(java.lang.String affiliation);
    
    /**
     * Sets (as xml) the "affiliation" element
     */
    void xsetAffiliation(org.apache.xmlbeans.XmlString affiliation);
    
    /**
     * Unsets the "affiliation" element
     */
    void unsetAffiliation();
    
    /**
     * Gets the "email" element
     */
    java.lang.String getEmail();
    
    /**
     * Gets (as xml) the "email" element
     */
    org.apache.xmlbeans.XmlString xgetEmail();
    
    /**
     * True if has "email" element
     */
    boolean isSetEmail();
    
    /**
     * Sets the "email" element
     */
    void setEmail(java.lang.String email);
    
    /**
     * Sets (as xml) the "email" element
     */
    void xsetEmail(org.apache.xmlbeans.XmlString email);
    
    /**
     * Unsets the "email" element
     */
    void unsetEmail();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType newInstance() {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.UserAgentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.UserAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
