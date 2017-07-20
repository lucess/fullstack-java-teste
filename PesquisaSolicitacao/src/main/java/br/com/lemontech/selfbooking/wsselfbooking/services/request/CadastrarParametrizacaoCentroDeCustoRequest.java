/**
 * CadastrarParametrizacaoCentroDeCustoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class CadastrarParametrizacaoCentroDeCustoRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacao parametrizacaoCentroDeCustoAprovacao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacao parametrizacaoCentroDeCustoSolicitacao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebito parametrizacaoCentroDeCustoDebito;

    public CadastrarParametrizacaoCentroDeCustoRequest() {
    }

    public CadastrarParametrizacaoCentroDeCustoRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacao parametrizacaoCentroDeCustoAprovacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacao parametrizacaoCentroDeCustoSolicitacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebito parametrizacaoCentroDeCustoDebito) {
           this.parametrizacaoCentroDeCustoAprovacao = parametrizacaoCentroDeCustoAprovacao;
           this.parametrizacaoCentroDeCustoSolicitacao = parametrizacaoCentroDeCustoSolicitacao;
           this.parametrizacaoCentroDeCustoDebito = parametrizacaoCentroDeCustoDebito;
    }


    /**
     * Gets the parametrizacaoCentroDeCustoAprovacao value for this CadastrarParametrizacaoCentroDeCustoRequest.
     * 
     * @return parametrizacaoCentroDeCustoAprovacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacao getParametrizacaoCentroDeCustoAprovacao() {
        return parametrizacaoCentroDeCustoAprovacao;
    }


    /**
     * Sets the parametrizacaoCentroDeCustoAprovacao value for this CadastrarParametrizacaoCentroDeCustoRequest.
     * 
     * @param parametrizacaoCentroDeCustoAprovacao
     */
    public void setParametrizacaoCentroDeCustoAprovacao(br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacao parametrizacaoCentroDeCustoAprovacao) {
        this.parametrizacaoCentroDeCustoAprovacao = parametrizacaoCentroDeCustoAprovacao;
    }


    /**
     * Gets the parametrizacaoCentroDeCustoSolicitacao value for this CadastrarParametrizacaoCentroDeCustoRequest.
     * 
     * @return parametrizacaoCentroDeCustoSolicitacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacao getParametrizacaoCentroDeCustoSolicitacao() {
        return parametrizacaoCentroDeCustoSolicitacao;
    }


    /**
     * Sets the parametrizacaoCentroDeCustoSolicitacao value for this CadastrarParametrizacaoCentroDeCustoRequest.
     * 
     * @param parametrizacaoCentroDeCustoSolicitacao
     */
    public void setParametrizacaoCentroDeCustoSolicitacao(br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacao parametrizacaoCentroDeCustoSolicitacao) {
        this.parametrizacaoCentroDeCustoSolicitacao = parametrizacaoCentroDeCustoSolicitacao;
    }


    /**
     * Gets the parametrizacaoCentroDeCustoDebito value for this CadastrarParametrizacaoCentroDeCustoRequest.
     * 
     * @return parametrizacaoCentroDeCustoDebito
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebito getParametrizacaoCentroDeCustoDebito() {
        return parametrizacaoCentroDeCustoDebito;
    }


    /**
     * Sets the parametrizacaoCentroDeCustoDebito value for this CadastrarParametrizacaoCentroDeCustoRequest.
     * 
     * @param parametrizacaoCentroDeCustoDebito
     */
    public void setParametrizacaoCentroDeCustoDebito(br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebito parametrizacaoCentroDeCustoDebito) {
        this.parametrizacaoCentroDeCustoDebito = parametrizacaoCentroDeCustoDebito;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarParametrizacaoCentroDeCustoRequest)) return false;
        CadastrarParametrizacaoCentroDeCustoRequest other = (CadastrarParametrizacaoCentroDeCustoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parametrizacaoCentroDeCustoAprovacao==null && other.getParametrizacaoCentroDeCustoAprovacao()==null) || 
             (this.parametrizacaoCentroDeCustoAprovacao!=null &&
              this.parametrizacaoCentroDeCustoAprovacao.equals(other.getParametrizacaoCentroDeCustoAprovacao()))) &&
            ((this.parametrizacaoCentroDeCustoSolicitacao==null && other.getParametrizacaoCentroDeCustoSolicitacao()==null) || 
             (this.parametrizacaoCentroDeCustoSolicitacao!=null &&
              this.parametrizacaoCentroDeCustoSolicitacao.equals(other.getParametrizacaoCentroDeCustoSolicitacao()))) &&
            ((this.parametrizacaoCentroDeCustoDebito==null && other.getParametrizacaoCentroDeCustoDebito()==null) || 
             (this.parametrizacaoCentroDeCustoDebito!=null &&
              this.parametrizacaoCentroDeCustoDebito.equals(other.getParametrizacaoCentroDeCustoDebito())));
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
        if (getParametrizacaoCentroDeCustoAprovacao() != null) {
            _hashCode += getParametrizacaoCentroDeCustoAprovacao().hashCode();
        }
        if (getParametrizacaoCentroDeCustoSolicitacao() != null) {
            _hashCode += getParametrizacaoCentroDeCustoSolicitacao().hashCode();
        }
        if (getParametrizacaoCentroDeCustoDebito() != null) {
            _hashCode += getParametrizacaoCentroDeCustoDebito().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarParametrizacaoCentroDeCustoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarParametrizacaoCentroDeCustoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametrizacaoCentroDeCustoAprovacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parametrizacaoCentroDeCustoAprovacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoAprovacao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametrizacaoCentroDeCustoSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parametrizacaoCentroDeCustoSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoSolicitacao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametrizacaoCentroDeCustoDebito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parametrizacaoCentroDeCustoDebito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoDebito"));
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
