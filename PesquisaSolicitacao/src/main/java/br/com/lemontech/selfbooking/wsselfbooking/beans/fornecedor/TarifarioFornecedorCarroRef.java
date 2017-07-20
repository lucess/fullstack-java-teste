/**
 * TarifarioFornecedorCarroRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor;

public class TarifarioFornecedorCarroRef  implements java.io.Serializable {
    private java.lang.String identificadorBackofficeFornecedor;

    private java.lang.String identificadorBackofficeCliente;

    private java.lang.String modelo;

    private java.lang.String categoria;

    public TarifarioFornecedorCarroRef() {
    }

    public TarifarioFornecedorCarroRef(
           java.lang.String identificadorBackofficeFornecedor,
           java.lang.String identificadorBackofficeCliente,
           java.lang.String modelo,
           java.lang.String categoria) {
           this.identificadorBackofficeFornecedor = identificadorBackofficeFornecedor;
           this.identificadorBackofficeCliente = identificadorBackofficeCliente;
           this.modelo = modelo;
           this.categoria = categoria;
    }


    /**
     * Gets the identificadorBackofficeFornecedor value for this TarifarioFornecedorCarroRef.
     * 
     * @return identificadorBackofficeFornecedor
     */
    public java.lang.String getIdentificadorBackofficeFornecedor() {
        return identificadorBackofficeFornecedor;
    }


    /**
     * Sets the identificadorBackofficeFornecedor value for this TarifarioFornecedorCarroRef.
     * 
     * @param identificadorBackofficeFornecedor
     */
    public void setIdentificadorBackofficeFornecedor(java.lang.String identificadorBackofficeFornecedor) {
        this.identificadorBackofficeFornecedor = identificadorBackofficeFornecedor;
    }


    /**
     * Gets the identificadorBackofficeCliente value for this TarifarioFornecedorCarroRef.
     * 
     * @return identificadorBackofficeCliente
     */
    public java.lang.String getIdentificadorBackofficeCliente() {
        return identificadorBackofficeCliente;
    }


    /**
     * Sets the identificadorBackofficeCliente value for this TarifarioFornecedorCarroRef.
     * 
     * @param identificadorBackofficeCliente
     */
    public void setIdentificadorBackofficeCliente(java.lang.String identificadorBackofficeCliente) {
        this.identificadorBackofficeCliente = identificadorBackofficeCliente;
    }


    /**
     * Gets the modelo value for this TarifarioFornecedorCarroRef.
     * 
     * @return modelo
     */
    public java.lang.String getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this TarifarioFornecedorCarroRef.
     * 
     * @param modelo
     */
    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }


    /**
     * Gets the categoria value for this TarifarioFornecedorCarroRef.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this TarifarioFornecedorCarroRef.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TarifarioFornecedorCarroRef)) return false;
        TarifarioFornecedorCarroRef other = (TarifarioFornecedorCarroRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificadorBackofficeFornecedor==null && other.getIdentificadorBackofficeFornecedor()==null) || 
             (this.identificadorBackofficeFornecedor!=null &&
              this.identificadorBackofficeFornecedor.equals(other.getIdentificadorBackofficeFornecedor()))) &&
            ((this.identificadorBackofficeCliente==null && other.getIdentificadorBackofficeCliente()==null) || 
             (this.identificadorBackofficeCliente!=null &&
              this.identificadorBackofficeCliente.equals(other.getIdentificadorBackofficeCliente()))) &&
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              this.modelo.equals(other.getModelo()))) &&
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria())));
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
        if (getIdentificadorBackofficeFornecedor() != null) {
            _hashCode += getIdentificadorBackofficeFornecedor().hashCode();
        }
        if (getIdentificadorBackofficeCliente() != null) {
            _hashCode += getIdentificadorBackofficeCliente().hashCode();
        }
        if (getModelo() != null) {
            _hashCode += getModelo().hashCode();
        }
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TarifarioFornecedorCarroRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorCarroRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorBackofficeFornecedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorBackofficeFornecedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorBackofficeCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorBackofficeCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoria"));
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
