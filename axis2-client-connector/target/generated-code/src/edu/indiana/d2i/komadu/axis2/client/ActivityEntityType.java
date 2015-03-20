/*
 * XML Type:  activityEntityType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.ActivityEntityType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client;


/**
 * An XML activityEntityType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public interface ActivityEntityType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityEntityType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("activityentitytypeffe1type");
    
    /**
     * Gets the "activity" element
     */
    edu.indiana.d2i.komadu.axis2.client.ActivityType getActivity();
    
    /**
     * Sets the "activity" element
     */
    void setActivity(edu.indiana.d2i.komadu.axis2.client.ActivityType activity);
    
    /**
     * Appends and returns a new empty "activity" element
     */
    edu.indiana.d2i.komadu.axis2.client.ActivityType addNewActivity();
    
    /**
     * Gets the "entity" element
     */
    edu.indiana.d2i.komadu.axis2.client.EntityType getEntity();
    
    /**
     * Sets the "entity" element
     */
    void setEntity(edu.indiana.d2i.komadu.axis2.client.EntityType entity);
    
    /**
     * Appends and returns a new empty "entity" element
     */
    edu.indiana.d2i.komadu.axis2.client.EntityType addNewEntity();
    
    /**
     * Gets the "usage" element
     */
    edu.indiana.d2i.komadu.axis2.client.UsageType getUsage();
    
    /**
     * True if has "usage" element
     */
    boolean isSetUsage();
    
    /**
     * Sets the "usage" element
     */
    void setUsage(edu.indiana.d2i.komadu.axis2.client.UsageType usage);
    
    /**
     * Appends and returns a new empty "usage" element
     */
    edu.indiana.d2i.komadu.axis2.client.UsageType addNewUsage();
    
    /**
     * Unsets the "usage" element
     */
    void unsetUsage();
    
    /**
     * Gets the "generation" element
     */
    edu.indiana.d2i.komadu.axis2.client.GenerationType getGeneration();
    
    /**
     * True if has "generation" element
     */
    boolean isSetGeneration();
    
    /**
     * Sets the "generation" element
     */
    void setGeneration(edu.indiana.d2i.komadu.axis2.client.GenerationType generation);
    
    /**
     * Appends and returns a new empty "generation" element
     */
    edu.indiana.d2i.komadu.axis2.client.GenerationType addNewGeneration();
    
    /**
     * Unsets the "generation" element
     */
    void unsetGeneration();
    
    /**
     * Gets the "start" element
     */
    edu.indiana.d2i.komadu.axis2.client.StartType getStart();
    
    /**
     * True if has "start" element
     */
    boolean isSetStart();
    
    /**
     * Sets the "start" element
     */
    void setStart(edu.indiana.d2i.komadu.axis2.client.StartType start);
    
    /**
     * Appends and returns a new empty "start" element
     */
    edu.indiana.d2i.komadu.axis2.client.StartType addNewStart();
    
    /**
     * Unsets the "start" element
     */
    void unsetStart();
    
    /**
     * Gets the "end" element
     */
    edu.indiana.d2i.komadu.axis2.client.EndType getEnd();
    
    /**
     * True if has "end" element
     */
    boolean isSetEnd();
    
    /**
     * Sets the "end" element
     */
    void setEnd(edu.indiana.d2i.komadu.axis2.client.EndType end);
    
    /**
     * Appends and returns a new empty "end" element
     */
    edu.indiana.d2i.komadu.axis2.client.EndType addNewEnd();
    
    /**
     * Unsets the "end" element
     */
    void unsetEnd();
    
    /**
     * Gets the "invalidation" element
     */
    edu.indiana.d2i.komadu.axis2.client.InvalidationType getInvalidation();
    
    /**
     * True if has "invalidation" element
     */
    boolean isSetInvalidation();
    
    /**
     * Sets the "invalidation" element
     */
    void setInvalidation(edu.indiana.d2i.komadu.axis2.client.InvalidationType invalidation);
    
    /**
     * Appends and returns a new empty "invalidation" element
     */
    edu.indiana.d2i.komadu.axis2.client.InvalidationType addNewInvalidation();
    
    /**
     * Unsets the "invalidation" element
     */
    void unsetInvalidation();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType newInstance() {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.ActivityEntityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.ActivityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
