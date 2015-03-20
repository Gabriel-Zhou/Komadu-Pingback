/*
 * XML Type:  fileType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.FileType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client;


/**
 * An XML fileType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public interface FileType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FileType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("filetypece4btype");
    
    /**
     * Gets the "fileURI" element
     */
    java.lang.String getFileURI();
    
    /**
     * Gets (as xml) the "fileURI" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetFileURI();
    
    /**
     * Sets the "fileURI" element
     */
    void setFileURI(java.lang.String fileURI);
    
    /**
     * Sets (as xml) the "fileURI" element
     */
    void xsetFileURI(org.apache.xmlbeans.XmlAnyURI fileURI);
    
    /**
     * Gets the "ownerDN" element
     */
    java.lang.String getOwnerDN();
    
    /**
     * Gets (as xml) the "ownerDN" element
     */
    org.apache.xmlbeans.XmlString xgetOwnerDN();
    
    /**
     * True if has "ownerDN" element
     */
    boolean isSetOwnerDN();
    
    /**
     * Sets the "ownerDN" element
     */
    void setOwnerDN(java.lang.String ownerDN);
    
    /**
     * Sets (as xml) the "ownerDN" element
     */
    void xsetOwnerDN(org.apache.xmlbeans.XmlString ownerDN);
    
    /**
     * Unsets the "ownerDN" element
     */
    void unsetOwnerDN();
    
    /**
     * Gets the "createDate" element
     */
    java.util.Calendar getCreateDate();
    
    /**
     * Gets (as xml) the "createDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCreateDate();
    
    /**
     * True if has "createDate" element
     */
    boolean isSetCreateDate();
    
    /**
     * Sets the "createDate" element
     */
    void setCreateDate(java.util.Calendar createDate);
    
    /**
     * Sets (as xml) the "createDate" element
     */
    void xsetCreateDate(org.apache.xmlbeans.XmlDateTime createDate);
    
    /**
     * Unsets the "createDate" element
     */
    void unsetCreateDate();
    
    /**
     * Gets the "size" element
     */
    long getSize();
    
    /**
     * Gets (as xml) the "size" element
     */
    org.apache.xmlbeans.XmlLong xgetSize();
    
    /**
     * True if has "size" element
     */
    boolean isSetSize();
    
    /**
     * Sets the "size" element
     */
    void setSize(long size);
    
    /**
     * Sets (as xml) the "size" element
     */
    void xsetSize(org.apache.xmlbeans.XmlLong size);
    
    /**
     * Unsets the "size" element
     */
    void unsetSize();
    
    /**
     * Gets the "md5sum" element
     */
    java.lang.String getMd5Sum();
    
    /**
     * Gets (as xml) the "md5sum" element
     */
    org.apache.xmlbeans.XmlString xgetMd5Sum();
    
    /**
     * True if has "md5sum" element
     */
    boolean isSetMd5Sum();
    
    /**
     * Sets the "md5sum" element
     */
    void setMd5Sum(java.lang.String md5Sum);
    
    /**
     * Sets (as xml) the "md5sum" element
     */
    void xsetMd5Sum(org.apache.xmlbeans.XmlString md5Sum);
    
    /**
     * Unsets the "md5sum" element
     */
    void unsetMd5Sum();
    
    /**
     * Gets the "fileName" element
     */
    java.lang.String getFileName();
    
    /**
     * Gets (as xml) the "fileName" element
     */
    org.apache.xmlbeans.XmlString xgetFileName();
    
    /**
     * True if has "fileName" element
     */
    boolean isSetFileName();
    
    /**
     * Sets the "fileName" element
     */
    void setFileName(java.lang.String fileName);
    
    /**
     * Sets (as xml) the "fileName" element
     */
    void xsetFileName(org.apache.xmlbeans.XmlString fileName);
    
    /**
     * Unsets the "fileName" element
     */
    void unsetFileName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.indiana.d2i.komadu.axis2.client.FileType newInstance() {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.FileType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.FileType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
