/**
 * AereoVooAssento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

public class AereoVooAssento  implements java.io.Serializable {
    private java.lang.Integer passageiroRef;

    private java.lang.String assento;

    public AereoVooAssento() {
    }

    public AereoVooAssento(
           java.lang.Integer passageiroRef,
           java.lang.String assento) {
           this.passageiroRef = passageiroRef;
           this.assento = assento;
    }


    /**
     * Gets the passageiroRef value for this AereoVooAssento.
     * 
     * @return passageiroRef
     */
    public java.lang.Integer getPassageiroRef() {
        return passageiroRef;
    }


    /**
     * Sets the passageiroRef value for this AereoVooAssento.
     * 
     * @param passageiroRef
     */
    public void setPassageiroRef(java.lang.Integer passageiroRef) {
        this.passageiroRef = passageiroRef;
    }


    /**
     * Gets the assento value for this AereoVooAssento.
     * 
     * @return assento
     */
    public java.lang.String getAssento() {
        return assento;
    }


    /**
     * Sets the assento value for this AereoVooAssento.
     * 
     * @param assento
     */
    public void setAssento(java.lang.String assento) {
        this.assento = assento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AereoVooAssento)) return false;
        AereoVooAssento other = (AereoVooAssento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.passageiroRef==null && other.getPassageiroRef()==null) || 
             (this.passageiroRef!=null &&
              this.passageiroRef.equals(other.getPassageiroRef()))) &&
            ((this.assento==null && other.getAssento()==null) || 
             (this.assento!=null &&
              this.assento.equals(other.getAssento())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPassageiroRef() != null) {
            _hashCode += getPassageiroRef().hashCode();
        }
        if (getAssento() != null) {
            _hashCode += getAssento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AereoVooAssento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoVooAssento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passageiroRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passageiroRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
