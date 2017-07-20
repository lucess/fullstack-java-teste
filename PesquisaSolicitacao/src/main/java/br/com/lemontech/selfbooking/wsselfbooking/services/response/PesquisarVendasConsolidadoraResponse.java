/**
 * PesquisarVendasConsolidadoraResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.response;

public class PesquisarVendasConsolidadoraResponse  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao resultadoOperacao;

    private int numeroProdutos;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro[] passageiros;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Produtos produtos;

    public PesquisarVendasConsolidadoraResponse() {
    }

    public PesquisarVendasConsolidadoraResponse(
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao resultadoOperacao,
           int numeroProdutos,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro[] passageiros,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Produtos produtos) {
           this.resultadoOperacao = resultadoOperacao;
           this.numeroProdutos = numeroProdutos;
           this.passageiros = passageiros;
           this.produtos = produtos;
    }


    /**
     * Gets the resultadoOperacao value for this PesquisarVendasConsolidadoraResponse.
     * 
     * @return resultadoOperacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao getResultadoOperacao() {
        return resultadoOperacao;
    }


    /**
     * Sets the resultadoOperacao value for this PesquisarVendasConsolidadoraResponse.
     * 
     * @param resultadoOperacao
     */
    public void setResultadoOperacao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao resultadoOperacao) {
        this.resultadoOperacao = resultadoOperacao;
    }


    /**
     * Gets the numeroProdutos value for this PesquisarVendasConsolidadoraResponse.
     * 
     * @return numeroProdutos
     */
    public int getNumeroProdutos() {
        return numeroProdutos;
    }


    /**
     * Sets the numeroProdutos value for this PesquisarVendasConsolidadoraResponse.
     * 
     * @param numeroProdutos
     */
    public void setNumeroProdutos(int numeroProdutos) {
        this.numeroProdutos = numeroProdutos;
    }


    /**
     * Gets the passageiros value for this PesquisarVendasConsolidadoraResponse.
     * 
     * @return passageiros
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro[] getPassageiros() {
        return passageiros;
    }


    /**
     * Sets the passageiros value for this PesquisarVendasConsolidadoraResponse.
     * 
     * @param passageiros
     */
    public void setPassageiros(br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro[] passageiros) {
        this.passageiros = passageiros;
    }


    /**
     * Gets the produtos value for this PesquisarVendasConsolidadoraResponse.
     * 
     * @return produtos
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Produtos getProdutos() {
        return produtos;
    }


    /**
     * Sets the produtos value for this PesquisarVendasConsolidadoraResponse.
     * 
     * @param produtos
     */
    public void setProdutos(br.com.lemontech.selfbooking.wsselfbooking.beans.Produtos produtos) {
        this.produtos = produtos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PesquisarVendasConsolidadoraResponse)) return false;
        PesquisarVendasConsolidadoraResponse other = (PesquisarVendasConsolidadoraResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultadoOperacao==null && other.getResultadoOperacao()==null) || 
             (this.resultadoOperacao!=null &&
              this.resultadoOperacao.equals(other.getResultadoOperacao()))) &&
            this.numeroProdutos == other.getNumeroProdutos() &&
            ((this.passageiros==null && other.getPassageiros()==null) || 
             (this.passageiros!=null &&
              java.util.Arrays.equals(this.passageiros, other.getPassageiros()))) &&
            ((this.produtos==null && other.getProdutos()==null) || 
             (this.produtos!=null &&
              this.produtos.equals(other.getProdutos())));
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
        if (getResultadoOperacao() != null) {
            _hashCode += getResultadoOperacao().hashCode();
        }
        _hashCode += getNumeroProdutos();
        if (getPassageiros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassageiros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassageiros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProdutos() != null) {
            _hashCode += getProdutos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PesquisarVendasConsolidadoraResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "pesquisarVendasConsolidadoraResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultadoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "resultadoOperacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProdutos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroProdutos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passageiros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passageiros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "passageiro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "passageiro"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("produtos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "produtos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "produtos"));
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
