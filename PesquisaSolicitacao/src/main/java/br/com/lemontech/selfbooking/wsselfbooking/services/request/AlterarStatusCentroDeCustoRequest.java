/**
 * AlterarStatusCentroDeCustoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class AlterarStatusCentroDeCustoRequest  implements java.io.Serializable {
    private boolean ativo;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef;

    public AlterarStatusCentroDeCustoRequest() {
    }

    public AlterarStatusCentroDeCustoRequest(
           boolean ativo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef) {
           this.ativo = ativo;
           this.centroDeCustoRef = centroDeCustoRef;
    }


    /**
     * Gets the ativo value for this AlterarStatusCentroDeCustoRequest.
     * 
     * @return ativo
     */
    public boolean isAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this AlterarStatusCentroDeCustoRequest.
     * 
     * @param ativo
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    /**
     * Gets the centroDeCustoRef value for this AlterarStatusCentroDeCustoRequest.
     * 
     * @return centroDeCustoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }


    /**
     * Sets the centroDeCustoRef value for this AlterarStatusCentroDeCustoRequest.
     * 
     * @param centroDeCustoRef
     */
    public void setCentroDeCustoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef) {
        this.centroDeCustoRef = centroDeCustoRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlterarStatusCentroDeCustoRequest)) return false;
        AlterarStatusCentroDeCustoRequest other = (AlterarStatusCentroDeCustoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ativo == other.isAtivo() &&
            ((this.centroDeCustoRef==null && other.getCentroDeCustoRef()==null) || 
             (this.centroDeCustoRef!=null &&
              this.centroDeCustoRef.equals(other.getCentroDeCustoRef())));
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
        if (getCentroDeCustoRef() != null) {
            _hashCode += getCentroDeCustoRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlterarStatusCentroDeCustoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusCentroDeCustoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroDeCustoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "centroDeCustoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "centroDeCustoRef"));
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
