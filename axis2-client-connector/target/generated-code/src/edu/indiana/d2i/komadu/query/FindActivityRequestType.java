/*
 * XML Type:  findActivityRequestType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.FindActivityRequestType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query;


/**
 * An XML findActivityRequestType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public interface FindActivityRequestType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FindActivityRequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("findactivityrequesttype0c1dtype");
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
    /**
     * Gets the "hostName" element
     */
    java.lang.String getHostName();
    
    /**
     * Gets (as xml) the "hostName" element
     */
    org.apache.xmlbeans.XmlString xgetHostName();
    
    /**
     * True if has "hostName" element
     */
    boolean isSetHostName();
    
    /**
     * Sets the "hostName" element
     */
    void setHostName(java.lang.String hostName);
    
    /**
     * Sets (as xml) the "hostName" element
     */
    void xsetHostName(org.apache.xmlbeans.XmlString hostName);
    
    /**
     * Unsets the "hostName" element
     */
    void unsetHostName();
    
    /**
     * Gets the "architecture" element
     */
    java.lang.String getArchitecture();
    
    /**
     * Gets (as xml) the "architecture" element
     */
    org.apache.xmlbeans.XmlString xgetArchitecture();
    
    /**
     * True if has "architecture" element
     */
    boolean isSetArchitecture();
    
    /**
     * Sets the "architecture" element
     */
    void setArchitecture(java.lang.String architecture);
    
    /**
     * Sets (as xml) the "architecture" element
     */
    void xsetArchitecture(org.apache.xmlbeans.XmlString architecture);
    
    /**
     * Unsets the "architecture" element
     */
    void unsetArchitecture();
    
    /**
     * Gets the "workflowID" element
     */
    java.lang.String getWorkflowID();
    
    /**
     * Gets (as xml) the "workflowID" element
     */
    org.apache.xmlbeans.XmlString xgetWorkflowID();
    
    /**
     * True if has "workflowID" element
     */
    boolean isSetWorkflowID();
    
    /**
     * Sets the "workflowID" element
     */
    void setWorkflowID(java.lang.String workflowID);
    
    /**
     * Sets (as xml) the "workflowID" element
     */
    void xsetWorkflowID(org.apache.xmlbeans.XmlString workflowID);
    
    /**
     * Unsets the "workflowID" element
     */
    void unsetWorkflowID();
    
    /**
     * Gets the "serviceID" element
     */
    java.lang.String getServiceID();
    
    /**
     * Gets (as xml) the "serviceID" element
     */
    org.apache.xmlbeans.XmlString xgetServiceID();
    
    /**
     * True if has "serviceID" element
     */
    boolean isSetServiceID();
    
    /**
     * Sets the "serviceID" element
     */
    void setServiceID(java.lang.String serviceID);
    
    /**
     * Sets (as xml) the "serviceID" element
     */
    void xsetServiceID(org.apache.xmlbeans.XmlString serviceID);
    
    /**
     * Unsets the "serviceID" element
     */
    void unsetServiceID();
    
    /**
     * Gets the "nextActivityID" element
     */
    java.lang.String getNextActivityID();
    
    /**
     * Gets (as xml) the "nextActivityID" element
     */
    org.apache.xmlbeans.XmlString xgetNextActivityID();
    
    /**
     * True if has "nextActivityID" element
     */
    boolean isSetNextActivityID();
    
    /**
     * Sets the "nextActivityID" element
     */
    void setNextActivityID(java.lang.String nextActivityID);
    
    /**
     * Sets (as xml) the "nextActivityID" element
     */
    void xsetNextActivityID(org.apache.xmlbeans.XmlString nextActivityID);
    
    /**
     * Unsets the "nextActivityID" element
     */
    void unsetNextActivityID();
    
    /**
     * Gets the "attributeList" element
     */
    edu.indiana.d2i.komadu.axis2.client.AttributesType getAttributeList();
    
    /**
     * True if has "attributeList" element
     */
    boolean isSetAttributeList();
    
    /**
     * Sets the "attributeList" element
     */
    void setAttributeList(edu.indiana.d2i.komadu.axis2.client.AttributesType attributeList);
    
    /**
     * Appends and returns a new empty "attributeList" element
     */
    edu.indiana.d2i.komadu.axis2.client.AttributesType addNewAttributeList();
    
    /**
     * Unsets the "attributeList" element
     */
    void unsetAttributeList();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType newInstance() {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.query.FindActivityRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.query.FindActivityRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
