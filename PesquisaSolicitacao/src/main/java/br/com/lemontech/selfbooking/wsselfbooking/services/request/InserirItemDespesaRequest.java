/**
 * InserirItemDespesaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class InserirItemDespesaRequest  implements java.io.Serializable {
    private int idSolicitacaoRef;

    private java.lang.String tipoDespesa;

    private double valor;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda;

    private java.lang.String imagem;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Deslocamento deslocamento;

    private java.lang.String observacao;

    private java.lang.String identificadorExterno;

    public InserirItemDespesaRequest() {
    }

    public InserirItemDespesaRequest(
           int idSolicitacaoRef,
           java.lang.String tipoDespesa,
           double valor,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda,
           java.lang.String imagem,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Deslocamento deslocamento,
           java.lang.String observacao,
           java.lang.String identificadorExterno) {
           this.idSolicitacaoRef = idSolicitacaoRef;
           this.tipoDespesa = tipoDespesa;
           this.valor = valor;
           this.moeda = moeda;
           this.imagem = imagem;
           this.deslocamento = deslocamento;
           this.observacao = observacao;
           this.identificadorExterno = identificadorExterno;
    }


    /**
     * Gets the idSolicitacaoRef value for this InserirItemDespesaRequest.
     * 
     * @return idSolicitacaoRef
     */
    public int getIdSolicitacaoRef() {
        return idSolicitacaoRef;
    }


    /**
     * Sets the idSolicitacaoRef value for this InserirItemDespesaRequest.
     * 
     * @param idSolicitacaoRef
     */
    public void setIdSolicitacaoRef(int idSolicitacaoRef) {
        this.idSolicitacaoRef = idSolicitacaoRef;
    }


    /**
     * Gets the tipoDespesa value for this InserirItemDespesaRequest.
     * 
     * @return tipoDespesa
     */
    public java.lang.String getTipoDespesa() {
        return tipoDespesa;
    }


    /**
     * Sets the tipoDespesa value for this InserirItemDespesaRequest.
     * 
     * @param tipoDespesa
     */
    public void setTipoDespesa(java.lang.String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }


    /**
     * Gets the valor value for this InserirItemDespesaRequest.
     * 
     * @return valor
     */
    public double getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this InserirItemDespesaRequest.
     * 
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }


    /**
     * Gets the moeda value for this InserirItemDespesaRequest.
     * 
     * @return moeda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this InserirItemDespesaRequest.
     * 
     * @param moeda
     */
    public void setMoeda(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda) {
        this.moeda = moeda;
    }


    /**
     * Gets the imagem value for this InserirItemDespesaRequest.
     * 
     * @return imagem
     */
    public java.lang.String getImagem() {
        return imagem;
    }


    /**
     * Sets the imagem value for this InserirItemDespesaRequest.
     * 
     * @param imagem
     */
    public void setImagem(java.lang.String imagem) {
        this.imagem = imagem;
    }


    /**
     * Gets the deslocamento value for this InserirItemDespesaRequest.
     * 
     * @return deslocamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Deslocamento getDeslocamento() {
        return deslocamento;
    }


    /**
     * Sets the deslocamento value for this InserirItemDespesaRequest.
     * 
     * @param deslocamento
     */
    public void setDeslocamento(br.com.lemontech.selfbooking.wsselfbooking.beans.Deslocamento deslocamento) {
        this.deslocamento = deslocamento;
    }


    /**
     * Gets the observacao value for this InserirItemDespesaRequest.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this InserirItemDespesaRequest.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }


    /**
     * Gets the identificadorExterno value for this InserirItemDespesaRequest.
     * 
     * @return identificadorExterno
     */
    public java.lang.String getIdentificadorExterno() {
        return identificadorExterno;
    }


    /**
     * Sets the identificadorExterno value for this InserirItemDespesaRequest.
     * 
     * @param identificadorExterno
     */
    public void setIdentificadorExterno(java.lang.String identificadorExterno) {
        this.identificadorExterno = identificadorExterno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InserirItemDespesaRequest)) return false;
        InserirItemDespesaRequest other = (InserirItemDespesaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idSolicitacaoRef == other.getIdSolicitacaoRef() &&
            ((this.tipoDespesa==null && other.getTipoDespesa()==null) || 
             (this.tipoDespesa!=null &&
              this.tipoDespesa.equals(other.getTipoDespesa()))) &&
            this.valor == other.getValor() &&
            ((this.moeda==null && other.getMoeda()==null) || 
             (this.moeda!=null &&
              this.moeda.equals(other.getMoeda()))) &&
            ((this.imagem==null && other.getImagem()==null) || 
             (this.imagem!=null &&
              this.imagem.equals(other.getImagem()))) &&
            ((this.deslocamento==null && other.getDeslocamento()==null) || 
             (this.deslocamento!=null &&
              this.deslocamento.equals(other.getDeslocamento()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao()))) &&
            ((this.identificadorExterno==null && other.getIdentificadorExterno()==null) || 
             (this.identificadorExterno!=null &&
              this.identificadorExterno.equals(other.getIdentificadorExterno())));
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
        _hashCode += getIdSolicitacaoRef();
        if (getTipoDespesa() != null) {
            _hashCode += getTipoDespesa().hashCode();
        }
        _hashCode += new Double(getValor()).hashCode();
        if (getMoeda() != null) {
            _hashCode += getMoeda().hashCode();
        }
        if (getImagem() != null) {
            _hashCode += getImagem().hashCode();
        }
        if (getDeslocamento() != null) {
            _hashCode += getDeslocamento().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        if (getIdentificadorExterno() != null) {
            _hashCode += getIdentificadorExterno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InserirItemDespesaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "inserirItemDespesaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacaoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSolicitacaoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDespesa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDespesa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moeda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moeda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "moeda"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deslocamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deslocamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "deslocamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorExterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorExterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
