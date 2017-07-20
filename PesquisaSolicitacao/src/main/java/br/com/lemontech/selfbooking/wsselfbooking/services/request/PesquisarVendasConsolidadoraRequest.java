/**
 * PesquisarVendasConsolidadoraRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class PesquisarVendasConsolidadoraRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoProduto produto;

    private java.util.Calendar dataInicial;

    private java.util.Calendar dataFinal;

    private int registroInicial;

    private java.lang.Integer quantidadeRegistros;

    public PesquisarVendasConsolidadoraRequest() {
    }

    public PesquisarVendasConsolidadoraRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoProduto produto,
           java.util.Calendar dataInicial,
           java.util.Calendar dataFinal,
           int registroInicial,
           java.lang.Integer quantidadeRegistros) {
           this.produto = produto;
           this.dataInicial = dataInicial;
           this.dataFinal = dataFinal;
           this.registroInicial = registroInicial;
           this.quantidadeRegistros = quantidadeRegistros;
    }


    /**
     * Gets the produto value for this PesquisarVendasConsolidadoraRequest.
     * 
     * @return produto
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoProduto getProduto() {
        return produto;
    }


    /**
     * Sets the produto value for this PesquisarVendasConsolidadoraRequest.
     * 
     * @param produto
     */
    public void setProduto(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoProduto produto) {
        this.produto = produto;
    }


    /**
     * Gets the dataInicial value for this PesquisarVendasConsolidadoraRequest.
     * 
     * @return dataInicial
     */
    public java.util.Calendar getDataInicial() {
        return dataInicial;
    }


    /**
     * Sets the dataInicial value for this PesquisarVendasConsolidadoraRequest.
     * 
     * @param dataInicial
     */
    public void setDataInicial(java.util.Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }


    /**
     * Gets the dataFinal value for this PesquisarVendasConsolidadoraRequest.
     * 
     * @return dataFinal
     */
    public java.util.Calendar getDataFinal() {
        return dataFinal;
    }


    /**
     * Sets the dataFinal value for this PesquisarVendasConsolidadoraRequest.
     * 
     * @param dataFinal
     */
    public void setDataFinal(java.util.Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }


    /**
     * Gets the registroInicial value for this PesquisarVendasConsolidadoraRequest.
     * 
     * @return registroInicial
     */
    public int getRegistroInicial() {
        return registroInicial;
    }


    /**
     * Sets the registroInicial value for this PesquisarVendasConsolidadoraRequest.
     * 
     * @param registroInicial
     */
    public void setRegistroInicial(int registroInicial) {
        this.registroInicial = registroInicial;
    }


    /**
     * Gets the quantidadeRegistros value for this PesquisarVendasConsolidadoraRequest.
     * 
     * @return quantidadeRegistros
     */
    public java.lang.Integer getQuantidadeRegistros() {
        return quantidadeRegistros;
    }


    /**
     * Sets the quantidadeRegistros value for this PesquisarVendasConsolidadoraRequest.
     * 
     * @param quantidadeRegistros
     */
    public void setQuantidadeRegistros(java.lang.Integer quantidadeRegistros) {
        this.quantidadeRegistros = quantidadeRegistros;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PesquisarVendasConsolidadoraRequest)) return false;
        PesquisarVendasConsolidadoraRequest other = (PesquisarVendasConsolidadoraRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.produto==null && other.getProduto()==null) || 
             (this.produto!=null &&
              this.produto.equals(other.getProduto()))) &&
            ((this.dataInicial==null && other.getDataInicial()==null) || 
             (this.dataInicial!=null &&
              this.dataInicial.equals(other.getDataInicial()))) &&
            ((this.dataFinal==null && other.getDataFinal()==null) || 
             (this.dataFinal!=null &&
              this.dataFinal.equals(other.getDataFinal()))) &&
            this.registroInicial == other.getRegistroInicial() &&
            ((this.quantidadeRegistros==null && other.getQuantidadeRegistros()==null) || 
             (this.quantidadeRegistros!=null &&
              this.quantidadeRegistros.equals(other.getQuantidadeRegistros())));
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
        if (getProduto() != null) {
            _hashCode += getProduto().hashCode();
        }
        if (getDataInicial() != null) {
            _hashCode += getDataInicial().hashCode();
        }
        if (getDataFinal() != null) {
            _hashCode += getDataFinal().hashCode();
        }
        _hashCode += getRegistroInicial();
        if (getQuantidadeRegistros() != null) {
            _hashCode += getQuantidadeRegistros().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PesquisarVendasConsolidadoraRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "pesquisarVendasConsolidadoraRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("produto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "produto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoProduto"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registroInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registroInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidadeRegistros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantidadeRegistros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
