/*
 * XML Type:  Membership
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.Membership
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov;


/**
 * An XML Membership(@http://www.w3.org/ns/prov#).
 *
 * This is a complex type.
 */
public interface Membership extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Membership.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("membership9e05type");
    
    /**
     * Gets the "collection" element
     */
    org.w3.www.ns.prov.IDRef getCollection();
    
    /**
     * Sets the "collection" element
     */
    void setCollection(org.w3.www.ns.prov.IDRef collection);
    
    /**
     * Appends and returns a new empty "collection" element
     */
    org.w3.www.ns.prov.IDRef addNewCollection();
    
    /**
     * Gets array of all "entity" elements
     */
    org.w3.www.ns.prov.IDRef[] getEntityArray();
    
    /**
     * Gets ith "entity" element
     */
    org.w3.www.ns.prov.IDRef getEntityArray(int i);
    
    /**
     * Returns number of "entity" element
     */
    int sizeOfEntityArray();
    
    /**
     * Sets array of all "entity" element
     */
    void setEntityArray(org.w3.www.ns.prov.IDRef[] entityArray);
    
    /**
     * Sets ith "entity" element
     */
    void setEntityArray(int i, org.w3.www.ns.prov.IDRef entity);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entity" element
     */
    org.w3.www.ns.prov.IDRef insertNewEntity(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entity" element
     */
    org.w3.www.ns.prov.IDRef addNewEntity();
    
    /**
     * Removes the ith "entity" element
     */
    void removeEntity(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.www.ns.prov.Membership newInstance() {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.www.ns.prov.Membership newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.www.ns.prov.Membership parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.www.ns.prov.Membership parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.www.ns.prov.Membership parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.www.ns.prov.Membership parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.www.ns.prov.Membership parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.www.ns.prov.Membership parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.www.ns.prov.Membership parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.www.ns.prov.Membership parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.www.ns.prov.Membership parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.www.ns.prov.Membership parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.www.ns.prov.Membership parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.www.ns.prov.Membership parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.www.ns.prov.Membership parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.www.ns.prov.Membership parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.www.ns.prov.Membership parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.www.ns.prov.Membership parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.www.ns.prov.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
