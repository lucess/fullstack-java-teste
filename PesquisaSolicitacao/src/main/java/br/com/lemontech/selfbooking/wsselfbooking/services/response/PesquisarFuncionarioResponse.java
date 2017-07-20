/**
 * PesquisarFuncionarioResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.response;

public class PesquisarFuncionarioResponse  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao resultadoOperacao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Funcionario[] funcionarios;

    public PesquisarFuncionarioResponse() {
    }

    public PesquisarFuncionarioResponse(
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao resultadoOperacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Funcionario[] funcionarios) {
           this.resultadoOperacao = resultadoOperacao;
           this.funcionarios = funcionarios;
    }


    /**
     * Gets the resultadoOperacao value for this PesquisarFuncionarioResponse.
     * 
     * @return resultadoOperacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao getResultadoOperacao() {
        return resultadoOperacao;
    }


    /**
     * Sets the resultadoOperacao value for this PesquisarFuncionarioResponse.
     * 
     * @param resultadoOperacao
     */
    public void setResultadoOperacao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao resultadoOperacao) {
        this.resultadoOperacao = resultadoOperacao;
    }


    /**
     * Gets the funcionarios value for this PesquisarFuncionarioResponse.
     * 
     * @return funcionarios
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Funcionario[] getFuncionarios() {
        return funcionarios;
    }


    /**
     * Sets the funcionarios value for this PesquisarFuncionarioResponse.
     * 
     * @param funcionarios
     */
    public void setFuncionarios(br.com.lemontech.selfbooking.wsselfbooking.beans.Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PesquisarFuncionarioResponse)) return false;
        PesquisarFuncionarioResponse other = (PesquisarFuncionarioResponse) obj;
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
            ((this.funcionarios==null && other.getFuncionarios()==null) || 
             (this.funcionarios!=null &&
              java.util.Arrays.equals(this.funcionarios, other.getFuncionarios())));
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
        if (getFuncionarios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFuncionarios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFuncionarios(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PesquisarFuncionarioResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "pesquisarFuncionarioResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultadoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "resultadoOperacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionarios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funcionarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "funcionario"));
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
