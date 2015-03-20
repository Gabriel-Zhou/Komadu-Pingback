/*
 * An XML document type.
 * Localname: getContextWorkflowGraphResponse
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query;


/**
 * A document containing one getContextWorkflowGraphResponse(@http://komadu.d2i.indiana.edu/query) element.
 *
 * This is a complex type.
 */
public interface GetContextWorkflowGraphResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetContextWorkflowGraphResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("getcontextworkflowgraphresponsea6e3doctype");
    
    /**
     * Gets the "getContextWorkflowGraphResponse" element
     */
    edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseType getGetContextWorkflowGraphResponse();
    
    /**
     * Sets the "getContextWorkflowGraphResponse" element
     */
    void setGetContextWorkflowGraphResponse(edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseType getContextWorkflowGraphResponse);
    
    /**
     * Appends and returns a new empty "getContextWorkflowGraphResponse" element
     */
    edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseType addNewGetContextWorkflowGraphResponse();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument newInstance() {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.query.GetContextWorkflowGraphResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
