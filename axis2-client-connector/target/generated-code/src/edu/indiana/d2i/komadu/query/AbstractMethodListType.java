/*
 * XML Type:  abstractMethodListType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.AbstractMethodListType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query;


/**
 * An XML abstractMethodListType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public interface AbstractMethodListType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractMethodListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("abstractmethodlisttype64a9type");
    
    /**
     * Gets array of all "abstractMethod" elements
     */
    java.lang.String[] getAbstractMethodArray();
    
    /**
     * Gets ith "abstractMethod" element
     */
    java.lang.String getAbstractMethodArray(int i);
    
    /**
     * Gets (as xml) array of all "abstractMethod" elements
     */
    org.apache.xmlbeans.XmlString[] xgetAbstractMethodArray();
    
    /**
     * Gets (as xml) ith "abstractMethod" element
     */
    org.apache.xmlbeans.XmlString xgetAbstractMethodArray(int i);
    
    /**
     * Returns number of "abstractMethod" element
     */
    int sizeOfAbstractMethodArray();
    
    /**
     * Sets array of all "abstractMethod" element
     */
    void setAbstractMethodArray(java.lang.String[] abstractMethodArray);
    
    /**
     * Sets ith "abstractMethod" element
     */
    void setAbstractMethodArray(int i, java.lang.String abstractMethod);
    
    /**
     * Sets (as xml) array of all "abstractMethod" element
     */
    void xsetAbstractMethodArray(org.apache.xmlbeans.XmlString[] abstractMethodArray);
    
    /**
     * Sets (as xml) ith "abstractMethod" element
     */
    void xsetAbstractMethodArray(int i, org.apache.xmlbeans.XmlString abstractMethod);
    
    /**
     * Inserts the value as the ith "abstractMethod" element
     */
    void insertAbstractMethod(int i, java.lang.String abstractMethod);
    
    /**
     * Appends the value as the last "abstractMethod" element
     */
    void addAbstractMethod(java.lang.String abstractMethod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "abstractMethod" element
     */
    org.apache.xmlbeans.XmlString insertNewAbstractMethod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "abstractMethod" element
     */
    org.apache.xmlbeans.XmlString addNewAbstractMethod();
    
    /**
     * Removes the ith "abstractMethod" element
     */
    void removeAbstractMethod(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType newInstance() {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.query.AbstractMethodListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.query.AbstractMethodListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}