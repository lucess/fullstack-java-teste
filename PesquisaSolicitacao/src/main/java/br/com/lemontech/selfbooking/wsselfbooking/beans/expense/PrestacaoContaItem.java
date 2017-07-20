/**
 * PrestacaoContaItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

public class PrestacaoContaItem  implements java.io.Serializable {
    private java.lang.String tipoDespesa;

    private java.lang.Double valor;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda;

    private java.lang.String urlImagem;

    private java.lang.String observacao;

    private java.lang.String identificadorExterno;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.DeslocamentoTerrestre deslocamento;

    public PrestacaoContaItem() {
    }

    public PrestacaoContaItem(
           java.lang.String tipoDespesa,
           java.lang.Double valor,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda,
           java.lang.String urlImagem,
           java.lang.String observacao,
           java.lang.String identificadorExterno,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.DeslocamentoTerrestre deslocamento) {
           this.tipoDespesa = tipoDespesa;
           this.valor = valor;
           this.moeda = moeda;
           this.urlImagem = urlImagem;
           this.observacao = observacao;
           this.identificadorExterno = identificadorExterno;
           this.deslocamento = deslocamento;
    }


    /**
     * Gets the tipoDespesa value for this PrestacaoContaItem.
     * 
     * @return tipoDespesa
     */
    public java.lang.String getTipoDespesa() {
        return tipoDespesa;
    }


    /**
     * Sets the tipoDespesa value for this PrestacaoContaItem.
     * 
     * @param tipoDespesa
     */
    public void setTipoDespesa(java.lang.String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }


    /**
     * Gets the valor value for this PrestacaoContaItem.
     * 
     * @return valor
     */
    public java.lang.Double getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this PrestacaoContaItem.
     * 
     * @param valor
     */
    public void setValor(java.lang.Double valor) {
        this.valor = valor;
    }


    /**
     * Gets the moeda value for this PrestacaoContaItem.
     * 
     * @return moeda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this PrestacaoContaItem.
     * 
     * @param moeda
     */
    public void setMoeda(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda) {
        this.moeda = moeda;
    }


    /**
     * Gets the urlImagem value for this PrestacaoContaItem.
     * 
     * @return urlImagem
     */
    public java.lang.String getUrlImagem() {
        return urlImagem;
    }


    /**
     * Sets the urlImagem value for this PrestacaoContaItem.
     * 
     * @param urlImagem
     */
    public void setUrlImagem(java.lang.String urlImagem) {
        this.urlImagem = urlImagem;
    }


    /**
     * Gets the observacao value for this PrestacaoContaItem.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this PrestacaoContaItem.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }


    /**
     * Gets the identificadorExterno value for this PrestacaoContaItem.
     * 
     * @return identificadorExterno
     */
    public java.lang.String getIdentificadorExterno() {
        return identificadorExterno;
    }


    /**
     * Sets the identificadorExterno value for this PrestacaoContaItem.
     * 
     * @param identificadorExterno
     */
    public void setIdentificadorExterno(java.lang.String identificadorExterno) {
        this.identificadorExterno = identificadorExterno;
    }


    /**
     * Gets the deslocamento value for this PrestacaoContaItem.
     * 
     * @return deslocamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.DeslocamentoTerrestre getDeslocamento() {
        return deslocamento;
    }


    /**
     * Sets the deslocamento value for this PrestacaoContaItem.
     * 
     * @param deslocamento
     */
    public void setDeslocamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.DeslocamentoTerrestre deslocamento) {
        this.deslocamento = deslocamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrestacaoContaItem)) return false;
        PrestacaoContaItem other = (PrestacaoContaItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoDespesa==null && other.getTipoDespesa()==null) || 
             (this.tipoDespesa!=null &&
              this.tipoDespesa.equals(other.getTipoDespesa()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor()))) &&
            ((this.moeda==null && other.getMoeda()==null) || 
             (this.moeda!=null &&
              this.moeda.equals(other.getMoeda()))) &&
            ((this.urlImagem==null && other.getUrlImagem()==null) || 
             (this.urlImagem!=null &&
              this.urlImagem.equals(other.getUrlImagem()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao()))) &&
            ((this.identificadorExterno==null && other.getIdentificadorExterno()==null) || 
             (this.identificadorExterno!=null &&
              this.identificadorExterno.equals(other.getIdentificadorExterno()))) &&
            ((this.deslocamento==null && other.getDeslocamento()==null) || 
             (this.deslocamento!=null &&
              this.deslocamento.equals(other.getDeslocamento())));
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
        if (getTipoDespesa() != null) {
            _hashCode += getTipoDespesa().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        if (getMoeda() != null) {
            _hashCode += getMoeda().hashCode();
        }
        if (getUrlImagem() != null) {
            _hashCode += getUrlImagem().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        if (getIdentificadorExterno() != null) {
            _hashCode += getIdentificadorExterno().hashCode();
        }
        if (getDeslocamento() != null) {
            _hashCode += getDeslocamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrestacaoContaItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "prestacaoContaItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDespesa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDespesa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moeda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moeda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "moeda"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlImagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlImagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deslocamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deslocamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "deslocamentoTerrestre"));
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
