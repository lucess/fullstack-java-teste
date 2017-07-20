/**
 * CadastrarFornecedorSourceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class CadastrarFornecedorSourceRequest  implements java.io.Serializable {
    private java.lang.String source;

    private java.lang.String idFornecedorSource;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.FornecedorRef fornecedorRef;

    public CadastrarFornecedorSourceRequest() {
    }

    public CadastrarFornecedorSourceRequest(
           java.lang.String source,
           java.lang.String idFornecedorSource,
           br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.FornecedorRef fornecedorRef) {
           this.source = source;
           this.idFornecedorSource = idFornecedorSource;
           this.fornecedorRef = fornecedorRef;
    }


    /**
     * Gets the source value for this CadastrarFornecedorSourceRequest.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this CadastrarFornecedorSourceRequest.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the idFornecedorSource value for this CadastrarFornecedorSourceRequest.
     * 
     * @return idFornecedorSource
     */
    public java.lang.String getIdFornecedorSource() {
        return idFornecedorSource;
    }


    /**
     * Sets the idFornecedorSource value for this CadastrarFornecedorSourceRequest.
     * 
     * @param idFornecedorSource
     */
    public void setIdFornecedorSource(java.lang.String idFornecedorSource) {
        this.idFornecedorSource = idFornecedorSource;
    }


    /**
     * Gets the fornecedorRef value for this CadastrarFornecedorSourceRequest.
     * 
     * @return fornecedorRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.FornecedorRef getFornecedorRef() {
        return fornecedorRef;
    }


    /**
     * Sets the fornecedorRef value for this CadastrarFornecedorSourceRequest.
     * 
     * @param fornecedorRef
     */
    public void setFornecedorRef(br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.FornecedorRef fornecedorRef) {
        this.fornecedorRef = fornecedorRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarFornecedorSourceRequest)) return false;
        CadastrarFornecedorSourceRequest other = (CadastrarFornecedorSourceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.idFornecedorSource==null && other.getIdFornecedorSource()==null) || 
             (this.idFornecedorSource!=null &&
              this.idFornecedorSource.equals(other.getIdFornecedorSource()))) &&
            ((this.fornecedorRef==null && other.getFornecedorRef()==null) || 
             (this.fornecedorRef!=null &&
              this.fornecedorRef.equals(other.getFornecedorRef())));
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getIdFornecedorSource() != null) {
            _hashCode += getIdFornecedorSource().hashCode();
        }
        if (getFornecedorRef() != null) {
            _hashCode += getFornecedorRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarFornecedorSourceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarFornecedorSourceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idFornecedorSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idFornecedorSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fornecedorRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fornecedorRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "fornecedorRef"));
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
