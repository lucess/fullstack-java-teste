/**
 * AlterarStatusRegionalRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class AlterarStatusRegionalRequest  implements java.io.Serializable {
    private boolean ativo;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef regionalRef;

    public AlterarStatusRegionalRequest() {
    }

    public AlterarStatusRegionalRequest(
           boolean ativo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef regionalRef) {
           this.ativo = ativo;
           this.regionalRef = regionalRef;
    }


    /**
     * Gets the ativo value for this AlterarStatusRegionalRequest.
     * 
     * @return ativo
     */
    public boolean isAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this AlterarStatusRegionalRequest.
     * 
     * @param ativo
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    /**
     * Gets the regionalRef value for this AlterarStatusRegionalRequest.
     * 
     * @return regionalRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef getRegionalRef() {
        return regionalRef;
    }


    /**
     * Sets the regionalRef value for this AlterarStatusRegionalRequest.
     * 
     * @param regionalRef
     */
    public void setRegionalRef(br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef regionalRef) {
        this.regionalRef = regionalRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlterarStatusRegionalRequest)) return false;
        AlterarStatusRegionalRequest other = (AlterarStatusRegionalRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ativo == other.isAtivo() &&
            ((this.regionalRef==null && other.getRegionalRef()==null) || 
             (this.regionalRef!=null &&
              this.regionalRef.equals(other.getRegionalRef())));
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
        _hashCode += (isAtivo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRegionalRef() != null) {
            _hashCode += getRegionalRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlterarStatusRegionalRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusRegionalRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionalRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionalRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "regionalRef"));
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
