/**
 * TarifarioFornecedorHotelRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor;

public class TarifarioFornecedorHotelRef  implements java.io.Serializable {
    private java.lang.String identificadorBackofficeFornecedor;

    private java.lang.String identificadorBackofficeCliente;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilHospedagem categoriaApartamento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento tipoApartamento;

    public TarifarioFornecedorHotelRef() {
    }

    public TarifarioFornecedorHotelRef(
           java.lang.String identificadorBackofficeFornecedor,
           java.lang.String identificadorBackofficeCliente,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilHospedagem categoriaApartamento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento tipoApartamento) {
           this.identificadorBackofficeFornecedor = identificadorBackofficeFornecedor;
           this.identificadorBackofficeCliente = identificadorBackofficeCliente;
           this.categoriaApartamento = categoriaApartamento;
           this.tipoApartamento = tipoApartamento;
    }


    /**
     * Gets the identificadorBackofficeFornecedor value for this TarifarioFornecedorHotelRef.
     * 
     * @return identificadorBackofficeFornecedor
     */
    public java.lang.String getIdentificadorBackofficeFornecedor() {
        return identificadorBackofficeFornecedor;
    }


    /**
     * Sets the identificadorBackofficeFornecedor value for this TarifarioFornecedorHotelRef.
     * 
     * @param identificadorBackofficeFornecedor
     */
    public void setIdentificadorBackofficeFornecedor(java.lang.String identificadorBackofficeFornecedor) {
        this.identificadorBackofficeFornecedor = identificadorBackofficeFornecedor;
    }


    /**
     * Gets the identificadorBackofficeCliente value for this TarifarioFornecedorHotelRef.
     * 
     * @return identificadorBackofficeCliente
     */
    public java.lang.String getIdentificadorBackofficeCliente() {
        return identificadorBackofficeCliente;
    }


    /**
     * Sets the identificadorBackofficeCliente value for this TarifarioFornecedorHotelRef.
     * 
     * @param identificadorBackofficeCliente
     */
    public void setIdentificadorBackofficeCliente(java.lang.String identificadorBackofficeCliente) {
        this.identificadorBackofficeCliente = identificadorBackofficeCliente;
    }


    /**
     * Gets the categoriaApartamento value for this TarifarioFornecedorHotelRef.
     * 
     * @return categoriaApartamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilHospedagem getCategoriaApartamento() {
        return categoriaApartamento;
    }


    /**
     * Sets the categoriaApartamento value for this TarifarioFornecedorHotelRef.
     * 
     * @param categoriaApartamento
     */
    public void setCategoriaApartamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilHospedagem categoriaApartamento) {
        this.categoriaApartamento = categoriaApartamento;
    }


    /**
     * Gets the tipoApartamento value for this TarifarioFornecedorHotelRef.
     * 
     * @return tipoApartamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento getTipoApartamento() {
        return tipoApartamento;
    }


    /**
     * Sets the tipoApartamento value for this TarifarioFornecedorHotelRef.
     * 
     * @param tipoApartamento
     */
    public void setTipoApartamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento tipoApartamento) {
        this.tipoApartamento = tipoApartamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TarifarioFornecedorHotelRef)) return false;
        TarifarioFornecedorHotelRef other = (TarifarioFornecedorHotelRef) obj;
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
            ((this.categoriaApartamento==null && other.getCategoriaApartamento()==null) || 
             (this.categoriaApartamento!=null &&
              this.categoriaApartamento.equals(other.getCategoriaApartamento()))) &&
            ((this.tipoApartamento==null && other.getTipoApartamento()==null) || 
             (this.tipoApartamento!=null &&
              this.tipoApartamento.equals(other.getTipoApartamento())));
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
        if (getCategoriaApartamento() != null) {
            _hashCode += getCategoriaApartamento().hashCode();
        }
        if (getTipoApartamento() != null) {
            _hashCode += getTipoApartamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TarifarioFornecedorHotelRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorHotelRef"));
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
        elemField.setFieldName("categoriaApartamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoriaApartamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "perfilHospedagem"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoApartamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoApartamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoApartamento"));
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
