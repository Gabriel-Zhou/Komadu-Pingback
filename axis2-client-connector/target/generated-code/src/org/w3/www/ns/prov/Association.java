/*
 * XML Type:  Association
 * Namespace: http://www.w3.org/ns/prov#
 * Java type: org.w3.www.ns.prov.Association
 *
 * Automatically generated - do not modify.
 */
package org.w3.www.ns.prov;


/**
 * An XML Association(@http://www.w3.org/ns/prov#).
 *
 * This is a complex type.
 */
public interface Association extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Association.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDA6F656C86626D49478FC2422F787E13").resolveHandle("association132ctype");
    
    /**
     * Gets the "activity" element
     */
    org.w3.www.ns.prov.IDRef getActivity();
    
    /**
     * Sets the "activity" element
     */
    void setActivity(org.w3.www.ns.prov.IDRef activity);
    
    /**
     * Appends and returns a new empty "activity" element
     */
    org.w3.www.ns.prov.IDRef addNewActivity();
    
    /**
     * Gets the "agent" element
     */
    org.w3.www.ns.prov.IDRef getAgent();
    
    /**
     * True if has "agent" element
     */
    boolean isSetAgent();
    
    /**
     * Sets the "agent" element
     */
    void setAgent(org.w3.www.ns.prov.IDRef agent);
    
    /**
     * Appends and returns a new empty "agent" element
     */
    org.w3.www.ns.prov.IDRef addNewAgent();
    
    /**
     * Unsets the "agent" element
     */
    void unsetAgent();
    
    /**
     * Gets the "plan" element
     */
    org.w3.www.ns.prov.IDRef getPlan();
    
    /**
     * True if has "plan" element
     */
    boolean isSetPlan();
    
    /**
     * Sets the "plan" element
     */
    void setPlan(org.w3.www.ns.prov.IDRef plan);
    
    /**
     * Appends and returns a new empty "plan" element
     */
    org.w3.www.ns.prov.IDRef addNewPlan();
    
    /**
     * Unsets the "plan" element
     */
    void unsetPlan();
    
    /**
     * Gets array of all "label" elements
     */
    org.w3.www.ns.prov.InternationalizedString[] getLabelArray();
    
    /**
     * Gets ith "label" element
     */
    org.w3.www.ns.prov.InternationalizedString getLabelArray(int i);
    
    /**
     * Returns number of "label" element
     */
    int sizeOfLabelArray();
    
    /**
     * Sets array of all "label" element
     */
    void setLabelArray(org.w3.www.ns.prov.InternationalizedString[] labelArray);
    
    /**
     * Sets ith "label" element
     */
    void setLabelArray(int i, org.w3.www.ns.prov.InternationalizedString label);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "label" element
     */
    org.w3.www.ns.prov.InternationalizedString insertNewLabel(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "label" element
     */
    org.w3.www.ns.prov.InternationalizedString addNewLabel();
    
    /**
     * Removes the ith "label" element
     */
    void removeLabel(int i);
    
    /**
     * Gets array of all "role" elements
     */
    org.w3.www.ns.prov.Role[] getRoleArray();
    
    /**
     * Gets ith "role" element
     */
    org.w3.www.ns.prov.Role getRoleArray(int i);
    
    /**
     * Returns number of "role" element
     */
    int sizeOfRoleArray();
    
    /**
     * Sets array of all "role" element
     */
    void setRoleArray(org.w3.www.ns.prov.Role[] roleArray);
    
    /**
     * Sets ith "role" element
     */
    void setRoleArray(int i, org.w3.www.ns.prov.Role role);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "role" element
     */
    org.w3.www.ns.prov.Role insertNewRole(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role" element
     */
    org.w3.www.ns.prov.Role addNewRole();
    
    /**
     * Removes the ith "role" element
     */
    void removeRole(int i);
    
    /**
     * Gets array of all "type" elements
     */
    org.w3.www.ns.prov.Type[] getTypeArray();
    
    /**
     * Gets ith "type" element
     */
    org.w3.www.ns.prov.Type getTypeArray(int i);
    
    /**
     * Returns number of "type" element
     */
    int sizeOfTypeArray();
    
    /**
     * Sets array of all "type" element
     */
    void setTypeArray(org.w3.www.ns.prov.Type[] typeArray);
    
    /**
     * Sets ith "type" element
     */
    void setTypeArray(int i, org.w3.www.ns.prov.Type type);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "type" element
     */
    org.w3.www.ns.prov.Type insertNewType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "type" element
     */
    org.w3.www.ns.prov.Type addNewType();
    
    /**
     * Removes the ith "type" element
     */
    void removeType(int i);
    
    /**
     * Gets the "id" attribute
     */
    javax.xml.namespace.QName getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlQName xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(javax.xml.namespace.QName id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlQName id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.www.ns.prov.Association newInstance() {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.www.ns.prov.Association newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.www.ns.prov.Association parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.www.ns.prov.Association parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.www.ns.prov.Association parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.www.ns.prov.Association parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.www.ns.prov.Association parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.www.ns.prov.Association parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.www.ns.prov.Association parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.www.ns.prov.Association parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.www.ns.prov.Association parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.www.ns.prov.Association parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.www.ns.prov.Association parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.www.ns.prov.Association parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.www.ns.prov.Association parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.www.ns.prov.Association parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.www.ns.prov.Association parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.www.ns.prov.Association parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.www.ns.prov.Association) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
