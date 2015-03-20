/*
 * XML Type:  activityDetail
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.ActivityDetail
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query;


/**
 * An XML activityDetail(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public interface ActivityDetail extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityDetail.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("activitydetailddaetype");
    
    /**
     * Gets the "type" element
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * Sets the "type" element
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
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
     * Gets the "timestep" element
     */
    int getTimestep();
    
    /**
     * Gets (as xml) the "timestep" element
     */
    org.apache.xmlbeans.XmlInt xgetTimestep();
    
    /**
     * True if has "timestep" element
     */
    boolean isSetTimestep();
    
    /**
     * Sets the "timestep" element
     */
    void setTimestep(int timestep);
    
    /**
     * Sets (as xml) the "timestep" element
     */
    void xsetTimestep(org.apache.xmlbeans.XmlInt timestep);
    
    /**
     * Unsets the "timestep" element
     */
    void unsetTimestep();
    
    /**
     * Gets the "workflowNodeID" element
     */
    java.lang.String getWorkflowNodeID();
    
    /**
     * Gets (as xml) the "workflowNodeID" element
     */
    org.apache.xmlbeans.XmlString xgetWorkflowNodeID();
    
    /**
     * True if has "workflowNodeID" element
     */
    boolean isSetWorkflowNodeID();
    
    /**
     * Sets the "workflowNodeID" element
     */
    void setWorkflowNodeID(java.lang.String workflowNodeID);
    
    /**
     * Sets (as xml) the "workflowNodeID" element
     */
    void xsetWorkflowNodeID(org.apache.xmlbeans.XmlString workflowNodeID);
    
    /**
     * Unsets the "workflowNodeID" element
     */
    void unsetWorkflowNodeID();
    
    /**
     * Gets the "instanceOf" element
     */
    java.lang.String getInstanceOf();
    
    /**
     * Gets (as xml) the "instanceOf" element
     */
    org.apache.xmlbeans.XmlString xgetInstanceOf();
    
    /**
     * True if has "instanceOf" element
     */
    boolean isSetInstanceOf();
    
    /**
     * Sets the "instanceOf" element
     */
    void setInstanceOf(java.lang.String xinstanceOf);
    
    /**
     * Sets (as xml) the "instanceOf" element
     */
    void xsetInstanceOf(org.apache.xmlbeans.XmlString xinstanceOf);
    
    /**
     * Unsets the "instanceOf" element
     */
    void unsetInstanceOf();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.indiana.d2i.komadu.query.ActivityDetail newInstance() {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.indiana.d2i.komadu.query.ActivityDetail newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.query.ActivityDetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.query.ActivityDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
