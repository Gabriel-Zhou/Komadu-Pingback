/*
 * XML Type:  abstractServiceDetailListType
 * Namespace: http://komadu.d2i.indiana.edu/query
 * Java type: edu.indiana.d2i.komadu.query.AbstractServiceDetailListType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.query;


/**
 * An XML abstractServiceDetailListType(@http://komadu.d2i.indiana.edu/query).
 *
 * This is a complex type.
 */
public interface AbstractServiceDetailListType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractServiceDetailListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("abstractservicedetaillisttype3778type");
    
    /**
     * Gets array of all "abstractServiceDetail" elements
     */
    edu.indiana.d2i.komadu.query.AbstractServiceDetail[] getAbstractServiceDetailArray();
    
    /**
     * Gets ith "abstractServiceDetail" element
     */
    edu.indiana.d2i.komadu.query.AbstractServiceDetail getAbstractServiceDetailArray(int i);
    
    /**
     * Returns number of "abstractServiceDetail" element
     */
    int sizeOfAbstractServiceDetailArray();
    
    /**
     * Sets array of all "abstractServiceDetail" element
     */
    void setAbstractServiceDetailArray(edu.indiana.d2i.komadu.query.AbstractServiceDetail[] abstractServiceDetailArray);
    
    /**
     * Sets ith "abstractServiceDetail" element
     */
    void setAbstractServiceDetailArray(int i, edu.indiana.d2i.komadu.query.AbstractServiceDetail abstractServiceDetail);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "abstractServiceDetail" element
     */
    edu.indiana.d2i.komadu.query.AbstractServiceDetail insertNewAbstractServiceDetail(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "abstractServiceDetail" element
     */
    edu.indiana.d2i.komadu.query.AbstractServiceDetail addNewAbstractServiceDetail();
    
    /**
     * Removes the ith "abstractServiceDetail" element
     */
    void removeAbstractServiceDetail(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType newInstance() {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.query.AbstractServiceDetailListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.query.AbstractServiceDetailListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
