/**
 * AlterarStatusProjetoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class AlterarStatusProjetoRequest  implements java.io.Serializable {
    private boolean ativo;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.ProjetoRef projetoRef;

    public AlterarStatusProjetoRequest() {
    }

    public AlterarStatusProjetoRequest(
           boolean ativo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.ProjetoRef projetoRef) {
           this.ativo = ativo;
           this.projetoRef = projetoRef;
    }


    /**
     * Gets the ativo value for this AlterarStatusProjetoRequest.
     * 
     * @return ativo
     */
    public boolean isAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this AlterarStatusProjetoRequest.
     * 
     * @param ativo
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    /**
     * Gets the projetoRef value for this AlterarStatusProjetoRequest.
     * 
     * @return projetoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.ProjetoRef getProjetoRef() {
        return projetoRef;
    }


    /**
     * Sets the projetoRef value for this AlterarStatusProjetoRequest.
     * 
     * @param projetoRef
     */
    public void setProjetoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.ProjetoRef projetoRef) {
        this.projetoRef = projetoRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlterarStatusProjetoRequest)) return false;
        AlterarStatusProjetoRequest other = (AlterarStatusProjetoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ativo == other.isAtivo() &&
            ((this.projetoRef==null && other.getProjetoRef()==null) || 
             (this.projetoRef!=null &&
              this.projetoRef.equals(other.getProjetoRef())));
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
        if (getProjetoRef() != null) {
            _hashCode += getProjetoRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlterarStatusProjetoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusProjetoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projetoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projetoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "projetoRef"));
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
