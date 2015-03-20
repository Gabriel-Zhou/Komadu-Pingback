/*
 * XML Type:  activityType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.ActivityType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client;


/**
 * An XML activityType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public interface ActivityType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("activitytypeaa9etype");
    
    /**
     * Gets the "workflowInformation" element
     */
    edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType getWorkflowInformation();
    
    /**
     * True if has "workflowInformation" element
     */
    boolean isSetWorkflowInformation();
    
    /**
     * Sets the "workflowInformation" element
     */
    void setWorkflowInformation(edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType workflowInformation);
    
    /**
     * Appends and returns a new empty "workflowInformation" element
     */
    edu.indiana.d2i.komadu.axis2.client.WorkflowInformationType addNewWorkflowInformation();
    
    /**
     * Unsets the "workflowInformation" element
     */
    void unsetWorkflowInformation();
    
    /**
     * Gets the "serviceInformation" element
     */
    edu.indiana.d2i.komadu.axis2.client.ServiceInformationType getServiceInformation();
    
    /**
     * True if has "serviceInformation" element
     */
    boolean isSetServiceInformation();
    
    /**
     * Sets the "serviceInformation" element
     */
    void setServiceInformation(edu.indiana.d2i.komadu.axis2.client.ServiceInformationType serviceInformation);
    
    /**
     * Appends and returns a new empty "serviceInformation" element
     */
    edu.indiana.d2i.komadu.axis2.client.ServiceInformationType addNewServiceInformation();
    
    /**
     * Unsets the "serviceInformation" element
     */
    void unsetServiceInformation();
    
    /**
     * Gets the "methodInformation" element
     */
    edu.indiana.d2i.komadu.axis2.client.MethodInformationType getMethodInformation();
    
    /**
     * True if has "methodInformation" element
     */
    boolean isSetMethodInformation();
    
    /**
     * Sets the "methodInformation" element
     */
    void setMethodInformation(edu.indiana.d2i.komadu.axis2.client.MethodInformationType methodInformation);
    
    /**
     * Appends and returns a new empty "methodInformation" element
     */
    edu.indiana.d2i.komadu.axis2.client.MethodInformationType addNewMethodInformation();
    
    /**
     * Unsets the "methodInformation" element
     */
    void unsetMethodInformation();
    
    /**
     * Gets the "activityInformation" element
     */
    edu.indiana.d2i.komadu.axis2.client.ActivityInformationType getActivityInformation();
    
    /**
     * True if has "activityInformation" element
     */
    boolean isSetActivityInformation();
    
    /**
     * Sets the "activityInformation" element
     */
    void setActivityInformation(edu.indiana.d2i.komadu.axis2.client.ActivityInformationType activityInformation);
    
    /**
     * Appends and returns a new empty "activityInformation" element
     */
    edu.indiana.d2i.komadu.axis2.client.ActivityInformationType addNewActivityInformation();
    
    /**
     * Unsets the "activityInformation" element
     */
    void unsetActivityInformation();
    
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
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType newInstance() {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.ActivityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
