/**
 * PesquisarFuncionarioRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class PesquisarFuncionarioRequest  implements java.io.Serializable {
    private java.lang.Integer idClienteRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef;

    private java.util.Calendar dataInicialAtualizacao;

    private java.util.Calendar dataFinalAtualizacao;

    private int registroInicial;

    private java.lang.Integer quantidadeRegistros;

    public PesquisarFuncionarioRequest() {
    }

    public PesquisarFuncionarioRequest(
           java.lang.Integer idClienteRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef,
           java.util.Calendar dataInicialAtualizacao,
           java.util.Calendar dataFinalAtualizacao,
           int registroInicial,
           java.lang.Integer quantidadeRegistros) {
           this.idClienteRef = idClienteRef;
           this.funcionarioRef = funcionarioRef;
           this.dataInicialAtualizacao = dataInicialAtualizacao;
           this.dataFinalAtualizacao = dataFinalAtualizacao;
           this.registroInicial = registroInicial;
           this.quantidadeRegistros = quantidadeRegistros;
    }


    /**
     * Gets the idClienteRef value for this PesquisarFuncionarioRequest.
     * 
     * @return idClienteRef
     */
    public java.lang.Integer getIdClienteRef() {
        return idClienteRef;
    }


    /**
     * Sets the idClienteRef value for this PesquisarFuncionarioRequest.
     * 
     * @param idClienteRef
     */
    public void setIdClienteRef(java.lang.Integer idClienteRef) {
        this.idClienteRef = idClienteRef;
    }


    /**
     * Gets the funcionarioRef value for this PesquisarFuncionarioRequest.
     * 
     * @return funcionarioRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getFuncionarioRef() {
        return funcionarioRef;
    }


    /**
     * Sets the funcionarioRef value for this PesquisarFuncionarioRequest.
     * 
     * @param funcionarioRef
     */
    public void setFuncionarioRef(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef) {
        this.funcionarioRef = funcionarioRef;
    }


    /**
     * Gets the dataInicialAtualizacao value for this PesquisarFuncionarioRequest.
     * 
     * @return dataInicialAtualizacao
     */
    public java.util.Calendar getDataInicialAtualizacao() {
        return dataInicialAtualizacao;
    }


    /**
     * Sets the dataInicialAtualizacao value for this PesquisarFuncionarioRequest.
     * 
     * @param dataInicialAtualizacao
     */
    public void setDataInicialAtualizacao(java.util.Calendar dataInicialAtualizacao) {
        this.dataInicialAtualizacao = dataInicialAtualizacao;
    }


    /**
     * Gets the dataFinalAtualizacao value for this PesquisarFuncionarioRequest.
     * 
     * @return dataFinalAtualizacao
     */
    public java.util.Calendar getDataFinalAtualizacao() {
        return dataFinalAtualizacao;
    }


    /**
     * Sets the dataFinalAtualizacao value for this PesquisarFuncionarioRequest.
     * 
     * @param dataFinalAtualizacao
     */
    public void setDataFinalAtualizacao(java.util.Calendar dataFinalAtualizacao) {
        this.dataFinalAtualizacao = dataFinalAtualizacao;
    }


    /**
     * Gets the registroInicial value for this PesquisarFuncionarioRequest.
     * 
     * @return registroInicial
     */
    public int getRegistroInicial() {
        return registroInicial;
    }


    /**
     * Sets the registroInicial value for this PesquisarFuncionarioRequest.
     * 
     * @param registroInicial
     */
    public void setRegistroInicial(int registroInicial) {
        this.registroInicial = registroInicial;
    }


    /**
     * Gets the quantidadeRegistros value for this PesquisarFuncionarioRequest.
     * 
     * @return quantidadeRegistros
     */
    public java.lang.Integer getQuantidadeRegistros() {
        return quantidadeRegistros;
    }


    /**
     * Sets the quantidadeRegistros value for this PesquisarFuncionarioRequest.
     * 
     * @param quantidadeRegistros
     */
    public void setQuantidadeRegistros(java.lang.Integer quantidadeRegistros) {
        this.quantidadeRegistros = quantidadeRegistros;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PesquisarFuncionarioRequest)) return false;
        PesquisarFuncionarioRequest other = (PesquisarFuncionarioRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idClienteRef==null && other.getIdClienteRef()==null) || 
             (this.idClienteRef!=null &&
              this.idClienteRef.equals(other.getIdClienteRef()))) &&
            ((this.funcionarioRef==null && other.getFuncionarioRef()==null) || 
             (this.funcionarioRef!=null &&
              this.funcionarioRef.equals(other.getFuncionarioRef()))) &&
            ((this.dataInicialAtualizacao==null && other.getDataInicialAtualizacao()==null) || 
             (this.dataInicialAtualizacao!=null &&
              this.dataInicialAtualizacao.equals(other.getDataInicialAtualizacao()))) &&
            ((this.dataFinalAtualizacao==null && other.getDataFinalAtualizacao()==null) || 
             (this.dataFinalAtualizacao!=null &&
              this.dataFinalAtualizacao.equals(other.getDataFinalAtualizacao()))) &&
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
        if (getIdClienteRef() != null) {
            _hashCode += getIdClienteRef().hashCode();
        }
        if (getFuncionarioRef() != null) {
            _hashCode += getFuncionarioRef().hashCode();
        }
        if (getDataInicialAtualizacao() != null) {
            _hashCode += getDataInicialAtualizacao().hashCode();
        }
        if (getDataFinalAtualizacao() != null) {
            _hashCode += getDataFinalAtualizacao().hashCode();
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
        new org.apache.axis.description.TypeDesc(PesquisarFuncionarioRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "pesquisarFuncionarioRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idClienteRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idClienteRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionarioRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funcionarioRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicialAtualizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInicialAtualizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFinalAtualizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataFinalAtualizacao"));
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
