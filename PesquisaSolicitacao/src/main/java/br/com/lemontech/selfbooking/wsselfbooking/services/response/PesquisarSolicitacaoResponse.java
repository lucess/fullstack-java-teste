/**
 * PesquisarSolicitacaoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.response;

public class PesquisarSolicitacaoResponse  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao resultadoAcao;

    private java.lang.Integer numeroSolicitacoes;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao[] solicitacao;

    private java.lang.String mensagemRetorno;

    public PesquisarSolicitacaoResponse() {
    }

    public PesquisarSolicitacaoResponse(
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao resultadoAcao,
           java.lang.Integer numeroSolicitacoes,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao[] solicitacao,
           java.lang.String mensagemRetorno) {
           this.resultadoAcao = resultadoAcao;
           this.numeroSolicitacoes = numeroSolicitacoes;
           this.solicitacao = solicitacao;
           this.mensagemRetorno = mensagemRetorno;
    }


    /**
     * Gets the resultadoAcao value for this PesquisarSolicitacaoResponse.
     * 
     * @return resultadoAcao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao getResultadoAcao() {
        return resultadoAcao;
    }


    /**
     * Sets the resultadoAcao value for this PesquisarSolicitacaoResponse.
     * 
     * @param resultadoAcao
     */
    public void setResultadoAcao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao resultadoAcao) {
        this.resultadoAcao = resultadoAcao;
    }


    /**
     * Gets the numeroSolicitacoes value for this PesquisarSolicitacaoResponse.
     * 
     * @return numeroSolicitacoes
     */
    public java.lang.Integer getNumeroSolicitacoes() {
        return numeroSolicitacoes;
    }


    /**
     * Sets the numeroSolicitacoes value for this PesquisarSolicitacaoResponse.
     * 
     * @param numeroSolicitacoes
     */
    public void setNumeroSolicitacoes(java.lang.Integer numeroSolicitacoes) {
        this.numeroSolicitacoes = numeroSolicitacoes;
    }


    /**
     * Gets the solicitacao value for this PesquisarSolicitacaoResponse.
     * 
     * @return solicitacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao[] getSolicitacao() {
        return solicitacao;
    }


    /**
     * Sets the solicitacao value for this PesquisarSolicitacaoResponse.
     * 
     * @param solicitacao
     */
    public void setSolicitacao(br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao[] solicitacao) {
        this.solicitacao = solicitacao;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao getSolicitacao(int i) {
        return this.solicitacao[i];
    }

    public void setSolicitacao(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao _value) {
        this.solicitacao[i] = _value;
    }


    /**
     * Gets the mensagemRetorno value for this PesquisarSolicitacaoResponse.
     * 
     * @return mensagemRetorno
     */
    public java.lang.String getMensagemRetorno() {
        return mensagemRetorno;
    }


    /**
     * Sets the mensagemRetorno value for this PesquisarSolicitacaoResponse.
     * 
     * @param mensagemRetorno
     */
    public void setMensagemRetorno(java.lang.String mensagemRetorno) {
        this.mensagemRetorno = mensagemRetorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PesquisarSolicitacaoResponse)) return false;
        PesquisarSolicitacaoResponse other = (PesquisarSolicitacaoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultadoAcao==null && other.getResultadoAcao()==null) || 
             (this.resultadoAcao!=null &&
              this.resultadoAcao.equals(other.getResultadoAcao()))) &&
            ((this.numeroSolicitacoes==null && other.getNumeroSolicitacoes()==null) || 
             (this.numeroSolicitacoes!=null &&
              this.numeroSolicitacoes.equals(other.getNumeroSolicitacoes()))) &&
            ((this.solicitacao==null && other.getSolicitacao()==null) || 
             (this.solicitacao!=null &&
              java.util.Arrays.equals(this.solicitacao, other.getSolicitacao()))) &&
            ((this.mensagemRetorno==null && other.getMensagemRetorno()==null) || 
             (this.mensagemRetorno!=null &&
              this.mensagemRetorno.equals(other.getMensagemRetorno())));
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
        if (getResultadoAcao() != null) {
            _hashCode += getResultadoAcao().hashCode();
        }
        if (getNumeroSolicitacoes() != null) {
            _hashCode += getNumeroSolicitacoes().hashCode();
        }
        if (getSolicitacao() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSolicitacao());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSolicitacao(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMensagemRetorno() != null) {
            _hashCode += getMensagemRetorno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PesquisarSolicitacaoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "pesquisarSolicitacaoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoAcao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultadoAcao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "resultadoAcao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSolicitacoes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroSolicitacoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "solicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "solicitacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensagemRetorno"));
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
