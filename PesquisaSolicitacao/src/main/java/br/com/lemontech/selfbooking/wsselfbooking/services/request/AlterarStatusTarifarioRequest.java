/**
 * AlterarStatusTarifarioRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class AlterarStatusTarifarioRequest  implements java.io.Serializable {
    private boolean ativo;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorHotelRef tarifarioHotelRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarroRef tarifarioCarroRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutroRef tarifarioOutroRef;

    public AlterarStatusTarifarioRequest() {
    }

    public AlterarStatusTarifarioRequest(
           boolean ativo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorHotelRef tarifarioHotelRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarroRef tarifarioCarroRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutroRef tarifarioOutroRef) {
           this.ativo = ativo;
           this.tarifarioHotelRef = tarifarioHotelRef;
           this.tarifarioCarroRef = tarifarioCarroRef;
           this.tarifarioOutroRef = tarifarioOutroRef;
    }


    /**
     * Gets the ativo value for this AlterarStatusTarifarioRequest.
     * 
     * @return ativo
     */
    public boolean isAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this AlterarStatusTarifarioRequest.
     * 
     * @param ativo
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    /**
     * Gets the tarifarioHotelRef value for this AlterarStatusTarifarioRequest.
     * 
     * @return tarifarioHotelRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorHotelRef getTarifarioHotelRef() {
        return tarifarioHotelRef;
    }


    /**
     * Sets the tarifarioHotelRef value for this AlterarStatusTarifarioRequest.
     * 
     * @param tarifarioHotelRef
     */
    public void setTarifarioHotelRef(br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorHotelRef tarifarioHotelRef) {
        this.tarifarioHotelRef = tarifarioHotelRef;
    }


    /**
     * Gets the tarifarioCarroRef value for this AlterarStatusTarifarioRequest.
     * 
     * @return tarifarioCarroRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarroRef getTarifarioCarroRef() {
        return tarifarioCarroRef;
    }


    /**
     * Sets the tarifarioCarroRef value for this AlterarStatusTarifarioRequest.
     * 
     * @param tarifarioCarroRef
     */
    public void setTarifarioCarroRef(br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarroRef tarifarioCarroRef) {
        this.tarifarioCarroRef = tarifarioCarroRef;
    }


    /**
     * Gets the tarifarioOutroRef value for this AlterarStatusTarifarioRequest.
     * 
     * @return tarifarioOutroRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutroRef getTarifarioOutroRef() {
        return tarifarioOutroRef;
    }


    /**
     * Sets the tarifarioOutroRef value for this AlterarStatusTarifarioRequest.
     * 
     * @param tarifarioOutroRef
     */
    public void setTarifarioOutroRef(br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutroRef tarifarioOutroRef) {
        this.tarifarioOutroRef = tarifarioOutroRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlterarStatusTarifarioRequest)) return false;
        AlterarStatusTarifarioRequest other = (AlterarStatusTarifarioRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ativo == other.isAtivo() &&
            ((this.tarifarioHotelRef==null && other.getTarifarioHotelRef()==null) || 
             (this.tarifarioHotelRef!=null &&
              this.tarifarioHotelRef.equals(other.getTarifarioHotelRef()))) &&
            ((this.tarifarioCarroRef==null && other.getTarifarioCarroRef()==null) || 
             (this.tarifarioCarroRef!=null &&
              this.tarifarioCarroRef.equals(other.getTarifarioCarroRef()))) &&
            ((this.tarifarioOutroRef==null && other.getTarifarioOutroRef()==null) || 
             (this.tarifarioOutroRef!=null &&
              this.tarifarioOutroRef.equals(other.getTarifarioOutroRef())));
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
        if (getTarifarioHotelRef() != null) {
            _hashCode += getTarifarioHotelRef().hashCode();
        }
        if (getTarifarioCarroRef() != null) {
            _hashCode += getTarifarioCarroRef().hashCode();
        }
        if (getTarifarioOutroRef() != null) {
            _hashCode += getTarifarioOutroRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlterarStatusTarifarioRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusTarifarioRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifarioHotelRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifarioHotelRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorHotelRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifarioCarroRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifarioCarroRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorCarroRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifarioOutroRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifarioOutroRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorOutroRef"));
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
