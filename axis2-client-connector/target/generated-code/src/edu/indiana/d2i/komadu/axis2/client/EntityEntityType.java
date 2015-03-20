/*
 * XML Type:  entityEntityType
 * Namespace: http://komadu.d2i.indiana.edu
 * Java type: edu.indiana.d2i.komadu.axis2.client.EntityEntityType
 *
 * Automatically generated - do not modify.
 */
package edu.indiana.d2i.komadu.axis2.client;


/**
 * An XML entityEntityType(@http://komadu.d2i.indiana.edu).
 *
 * This is a complex type.
 */
public interface EntityEntityType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityEntityType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("entityentitytype92f5type");
    
    /**
     * Gets the "entity1" element
     */
    edu.indiana.d2i.komadu.axis2.client.EntityType getEntity1();
    
    /**
     * Sets the "entity1" element
     */
    void setEntity1(edu.indiana.d2i.komadu.axis2.client.EntityType entity1);
    
    /**
     * Appends and returns a new empty "entity1" element
     */
    edu.indiana.d2i.komadu.axis2.client.EntityType addNewEntity1();
    
    /**
     * Gets the "entity2" element
     */
    edu.indiana.d2i.komadu.axis2.client.EntityType getEntity2();
    
    /**
     * Sets the "entity2" element
     */
    void setEntity2(edu.indiana.d2i.komadu.axis2.client.EntityType entity2);
    
    /**
     * Appends and returns a new empty "entity2" element
     */
    edu.indiana.d2i.komadu.axis2.client.EntityType addNewEntity2();
    
    /**
     * Gets the "derivation" element
     */
    edu.indiana.d2i.komadu.axis2.client.DerivationType getDerivation();
    
    /**
     * True if has "derivation" element
     */
    boolean isSetDerivation();
    
    /**
     * Sets the "derivation" element
     */
    void setDerivation(edu.indiana.d2i.komadu.axis2.client.DerivationType derivation);
    
    /**
     * Appends and returns a new empty "derivation" element
     */
    edu.indiana.d2i.komadu.axis2.client.DerivationType addNewDerivation();
    
    /**
     * Unsets the "derivation" element
     */
    void unsetDerivation();
    
    /**
     * Gets the "revision" element
     */
    edu.indiana.d2i.komadu.axis2.client.RevisionType getRevision();
    
    /**
     * True if has "revision" element
     */
    boolean isSetRevision();
    
    /**
     * Sets the "revision" element
     */
    void setRevision(edu.indiana.d2i.komadu.axis2.client.RevisionType revision);
    
    /**
     * Appends and returns a new empty "revision" element
     */
    edu.indiana.d2i.komadu.axis2.client.RevisionType addNewRevision();
    
    /**
     * Unsets the "revision" element
     */
    void unsetRevision();
    
    /**
     * Gets the "quotation" element
     */
    edu.indiana.d2i.komadu.axis2.client.QuotationType getQuotation();
    
    /**
     * True if has "quotation" element
     */
    boolean isSetQuotation();
    
    /**
     * Sets the "quotation" element
     */
    void setQuotation(edu.indiana.d2i.komadu.axis2.client.QuotationType quotation);
    
    /**
     * Appends and returns a new empty "quotation" element
     */
    edu.indiana.d2i.komadu.axis2.client.QuotationType addNewQuotation();
    
    /**
     * Unsets the "quotation" element
     */
    void unsetQuotation();
    
    /**
     * Gets the "primarySource" element
     */
    edu.indiana.d2i.komadu.axis2.client.PrimarySourceType getPrimarySource();
    
    /**
     * True if has "primarySource" element
     */
    boolean isSetPrimarySource();
    
    /**
     * Sets the "primarySource" element
     */
    void setPrimarySource(edu.indiana.d2i.komadu.axis2.client.PrimarySourceType primarySource);
    
    /**
     * Appends and returns a new empty "primarySource" element
     */
    edu.indiana.d2i.komadu.axis2.client.PrimarySourceType addNewPrimarySource();
    
    /**
     * Unsets the "primarySource" element
     */
    void unsetPrimarySource();
    
    /**
     * Gets the "alternate" element
     */
    edu.indiana.d2i.komadu.axis2.client.AlternateType getAlternate();
    
    /**
     * True if has "alternate" element
     */
    boolean isSetAlternate();
    
    /**
     * Sets the "alternate" element
     */
    void setAlternate(edu.indiana.d2i.komadu.axis2.client.AlternateType alternate);
    
    /**
     * Appends and returns a new empty "alternate" element
     */
    edu.indiana.d2i.komadu.axis2.client.AlternateType addNewAlternate();
    
    /**
     * Unsets the "alternate" element
     */
    void unsetAlternate();
    
    /**
     * Gets the "specialization" element
     */
    edu.indiana.d2i.komadu.axis2.client.SpecializationType getSpecialization();
    
    /**
     * True if has "specialization" element
     */
    boolean isSetSpecialization();
    
    /**
     * Sets the "specialization" element
     */
    void setSpecialization(edu.indiana.d2i.komadu.axis2.client.SpecializationType specialization);
    
    /**
     * Appends and returns a new empty "specialization" element
     */
    edu.indiana.d2i.komadu.axis2.client.SpecializationType addNewSpecialization();
    
    /**
     * Unsets the "specialization" element
     */
    void unsetSpecialization();
    
    /**
     * Gets the "membership" element
     */
    edu.indiana.d2i.komadu.axis2.client.MembershipType getMembership();
    
    /**
     * True if has "membership" element
     */
    boolean isSetMembership();
    
    /**
     * Sets the "membership" element
     */
    void setMembership(edu.indiana.d2i.komadu.axis2.client.MembershipType membership);
    
    /**
     * Appends and returns a new empty "membership" element
     */
    edu.indiana.d2i.komadu.axis2.client.MembershipType addNewMembership();
    
    /**
     * Unsets the "membership" element
     */
    void unsetMembership();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType newInstance() {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.indiana.d2i.komadu.axis2.client.EntityEntityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.indiana.d2i.komadu.axis2.client.EntityEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
