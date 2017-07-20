/**
 * CadastrarTarifarioRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class CadastrarTarifarioRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorHotel tarifarioHotel;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarro tarifarioCarro;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutro tarifarioOutro;

    public CadastrarTarifarioRequest() {
    }

    public CadastrarTarifarioRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorHotel tarifarioHotel,
           br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarro tarifarioCarro,
           br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutro tarifarioOutro) {
           this.tarifarioHotel = tarifarioHotel;
           this.tarifarioCarro = tarifarioCarro;
           this.tarifarioOutro = tarifarioOutro;
    }


    /**
     * Gets the tarifarioHotel value for this CadastrarTarifarioRequest.
     * 
     * @return tarifarioHotel
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorHotel getTarifarioHotel() {
        return tarifarioHotel;
    }


    /**
     * Sets the tarifarioHotel value for this CadastrarTarifarioRequest.
     * 
     * @param tarifarioHotel
     */
    public void setTarifarioHotel(br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorHotel tarifarioHotel) {
        this.tarifarioHotel = tarifarioHotel;
    }


    /**
     * Gets the tarifarioCarro value for this CadastrarTarifarioRequest.
     * 
     * @return tarifarioCarro
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarro getTarifarioCarro() {
        return tarifarioCarro;
    }


    /**
     * Sets the tarifarioCarro value for this CadastrarTarifarioRequest.
     * 
     * @param tarifarioCarro
     */
    public void setTarifarioCarro(br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarro tarifarioCarro) {
        this.tarifarioCarro = tarifarioCarro;
    }


    /**
     * Gets the tarifarioOutro value for this CadastrarTarifarioRequest.
     * 
     * @return tarifarioOutro
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutro getTarifarioOutro() {
        return tarifarioOutro;
    }


    /**
     * Sets the tarifarioOutro value for this CadastrarTarifarioRequest.
     * 
     * @param tarifarioOutro
     */
    public void setTarifarioOutro(br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutro tarifarioOutro) {
        this.tarifarioOutro = tarifarioOutro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarTarifarioRequest)) return false;
        CadastrarTarifarioRequest other = (CadastrarTarifarioRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tarifarioHotel==null && other.getTarifarioHotel()==null) || 
             (this.tarifarioHotel!=null &&
              this.tarifarioHotel.equals(other.getTarifarioHotel()))) &&
            ((this.tarifarioCarro==null && other.getTarifarioCarro()==null) || 
             (this.tarifarioCarro!=null &&
              this.tarifarioCarro.equals(other.getTarifarioCarro()))) &&
            ((this.tarifarioOutro==null && other.getTarifarioOutro()==null) || 
             (this.tarifarioOutro!=null &&
              this.tarifarioOutro.equals(other.getTarifarioOutro())));
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
        if (getTarifarioHotel() != null) {
            _hashCode += getTarifarioHotel().hashCode();
        }
        if (getTarifarioCarro() != null) {
            _hashCode += getTarifarioCarro().hashCode();
        }
        if (getTarifarioOutro() != null) {
            _hashCode += getTarifarioOutro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarTarifarioRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarTarifarioRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifarioHotel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifarioHotel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorHotel"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifarioCarro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifarioCarro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorCarro"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifarioOutro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifarioOutro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorOutro"));
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
