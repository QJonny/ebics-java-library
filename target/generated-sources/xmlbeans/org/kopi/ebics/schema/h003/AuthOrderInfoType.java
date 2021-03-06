/*
 * XML Type:  AuthOrderInfoType
 * Namespace: http://www.ebics.org/H003
 * Java type: org.kopi.ebics.schema.h003.AuthOrderInfoType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.h003;


/**
 * An XML AuthOrderInfoType(@http://www.ebics.org/H003).
 *
 * This is a complex type.
 */
public interface AuthOrderInfoType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuthOrderInfoType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE38346ABFB9D0612C4CA50E995509F1D").resolveHandle("authorderinfotypefa96type");
    
    /**
     * Gets the "OrderType" element
     */
    java.lang.String getOrderType();
    
    /**
     * Gets (as xml) the "OrderType" element
     */
    org.kopi.ebics.schema.h003.OrderTBaseType xgetOrderType();
    
    /**
     * Sets the "OrderType" element
     */
    void setOrderType(java.lang.String orderType);
    
    /**
     * Sets (as xml) the "OrderType" element
     */
    void xsetOrderType(org.kopi.ebics.schema.h003.OrderTBaseType orderType);
    
    /**
     * Gets the "TransferType" element
     */
    org.kopi.ebics.schema.h003.TransferType.Enum getTransferType();
    
    /**
     * Gets (as xml) the "TransferType" element
     */
    org.kopi.ebics.schema.h003.TransferType xgetTransferType();
    
    /**
     * Sets the "TransferType" element
     */
    void setTransferType(org.kopi.ebics.schema.h003.TransferType.Enum transferType);
    
    /**
     * Sets (as xml) the "TransferType" element
     */
    void xsetTransferType(org.kopi.ebics.schema.h003.TransferType transferType);
    
    /**
     * Gets the "OrderFormat" element
     */
    java.lang.String getOrderFormat();
    
    /**
     * Gets (as xml) the "OrderFormat" element
     */
    org.kopi.ebics.schema.h003.OrderFormatType xgetOrderFormat();
    
    /**
     * True if has "OrderFormat" element
     */
    boolean isSetOrderFormat();
    
    /**
     * Sets the "OrderFormat" element
     */
    void setOrderFormat(java.lang.String orderFormat);
    
    /**
     * Sets (as xml) the "OrderFormat" element
     */
    void xsetOrderFormat(org.kopi.ebics.schema.h003.OrderFormatType orderFormat);
    
    /**
     * Unsets the "OrderFormat" element
     */
    void unsetOrderFormat();
    
    /**
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.kopi.ebics.schema.h003.OrderDescriptionType xgetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.kopi.ebics.schema.h003.OrderDescriptionType description);
    
    /**
     * Gets the "NumSigRequired" element
     */
    java.math.BigInteger getNumSigRequired();
    
    /**
     * Gets (as xml) the "NumSigRequired" element
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetNumSigRequired();
    
    /**
     * True if has "NumSigRequired" element
     */
    boolean isSetNumSigRequired();
    
    /**
     * Sets the "NumSigRequired" element
     */
    void setNumSigRequired(java.math.BigInteger numSigRequired);
    
    /**
     * Sets (as xml) the "NumSigRequired" element
     */
    void xsetNumSigRequired(org.apache.xmlbeans.XmlNonNegativeInteger numSigRequired);
    
    /**
     * Unsets the "NumSigRequired" element
     */
    void unsetNumSigRequired();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType newInstance() {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.kopi.ebics.schema.h003.AuthOrderInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.kopi.ebics.schema.h003.AuthOrderInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
