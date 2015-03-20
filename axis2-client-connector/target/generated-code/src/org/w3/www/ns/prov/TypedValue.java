/*
 * XML Type:  TypedValue
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.TypedValue
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov;


/**
 * An XML TypedValue(@http://www.w3.org/ns/prov#).
 *
 * This is an atomic type that is a restriction of org.w3.www.ns.prov.TypedValue.
 */
public interface TypedValue extends org.apache.xmlbeans.XmlAnySimpleType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypedValue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("typedvaluea014type");
    
    /**
     * Gets the "type" attribute
     */
    javax.xml.namespace.QName getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlQName xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(javax.xml.namespace.QName type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlQName type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.www.ns.prov.TypedValue newInstance() {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.www.ns.prov.TypedValue newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.www.ns.prov.TypedValue parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.www.ns.prov.TypedValue parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.www.ns.prov.TypedValue parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.www.ns.prov.TypedValue parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.www.ns.prov.TypedValue parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.www.ns.prov.TypedValue parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.www.ns.prov.TypedValue parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.www.ns.prov.TypedValue parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.www.ns.prov.TypedValue parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.www.ns.prov.TypedValue parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.www.ns.prov.TypedValue parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.www.ns.prov.TypedValue parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.www.ns.prov.TypedValue parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.www.ns.prov.TypedValue parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.www.ns.prov.TypedValue parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.www.ns.prov.TypedValue parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.www.ns.prov.TypedValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}