/**
 * FormaPagamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class FormaPagamento  implements java.io.Serializable {
    private java.lang.String autorizacao;

    private java.lang.String numero;

    private java.lang.Integer parcelas;

    private java.lang.Double valor;

    private java.lang.String formaPagameno;

    private java.util.Calendar vencimentoCartao;

    private java.lang.String numeroRequisicaoGov;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.EnumTipoFormaPagamento tipo;

    private java.lang.Boolean VCN;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.EnumFornecedorVCN fornecedorVCN;

    private java.lang.Boolean VCNAgencia;

    private java.lang.String codigoConvenioVCN;

    public FormaPagamento() {
    }

    public FormaPagamento(
           java.lang.String autorizacao,
           java.lang.String numero,
           java.lang.Integer parcelas,
           java.lang.Double valor,
           java.lang.String formaPagameno,
           java.util.Calendar vencimentoCartao,
           java.lang.String numeroRequisicaoGov,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.EnumTipoFormaPagamento tipo,
           java.lang.Boolean VCN,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.EnumFornecedorVCN fornecedorVCN,
           java.lang.Boolean VCNAgencia,
           java.lang.String codigoConvenioVCN) {
           this.autorizacao = autorizacao;
           this.numero = numero;
           this.parcelas = parcelas;
           this.valor = valor;
           this.formaPagameno = formaPagameno;
           this.vencimentoCartao = vencimentoCartao;
           this.numeroRequisicaoGov = numeroRequisicaoGov;
           this.tipo = tipo;
           this.VCN = VCN;
           this.fornecedorVCN = fornecedorVCN;
           this.VCNAgencia = VCNAgencia;
           this.codigoConvenioVCN = codigoConvenioVCN;
    }


    /**
     * Gets the autorizacao value for this FormaPagamento.
     * 
     * @return autorizacao
     */
    public java.lang.String getAutorizacao() {
        return autorizacao;
    }


    /**
     * Sets the autorizacao value for this FormaPagamento.
     * 
     * @param autorizacao
     */
    public void setAutorizacao(java.lang.String autorizacao) {
        this.autorizacao = autorizacao;
    }


    /**
     * Gets the numero value for this FormaPagamento.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this FormaPagamento.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the parcelas value for this FormaPagamento.
     * 
     * @return parcelas
     */
    public java.lang.Integer getParcelas() {
        return parcelas;
    }


    /**
     * Sets the parcelas value for this FormaPagamento.
     * 
     * @param parcelas
     */
    public void setParcelas(java.lang.Integer parcelas) {
        this.parcelas = parcelas;
    }


    /**
     * Gets the valor value for this FormaPagamento.
     * 
     * @return valor
     */
    public java.lang.Double getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this FormaPagamento.
     * 
     * @param valor
     */
    public void setValor(java.lang.Double valor) {
        this.valor = valor;
    }


    /**
     * Gets the formaPagameno value for this FormaPagamento.
     * 
     * @return formaPagameno
     */
    public java.lang.String getFormaPagameno() {
        return formaPagameno;
    }


    /**
     * Sets the formaPagameno value for this FormaPagamento.
     * 
     * @param formaPagameno
     */
    public void setFormaPagameno(java.lang.String formaPagameno) {
        this.formaPagameno = formaPagameno;
    }


    /**
     * Gets the vencimentoCartao value for this FormaPagamento.
     * 
     * @return vencimentoCartao
     */
    public java.util.Calendar getVencimentoCartao() {
        return vencimentoCartao;
    }


    /**
     * Sets the vencimentoCartao value for this FormaPagamento.
     * 
     * @param vencimentoCartao
     */
    public void setVencimentoCartao(java.util.Calendar vencimentoCartao) {
        this.vencimentoCartao = vencimentoCartao;
    }


    /**
     * Gets the numeroRequisicaoGov value for this FormaPagamento.
     * 
     * @return numeroRequisicaoGov
     */
    public java.lang.String getNumeroRequisicaoGov() {
        return numeroRequisicaoGov;
    }


    /**
     * Sets the numeroRequisicaoGov value for this FormaPagamento.
     * 
     * @param numeroRequisicaoGov
     */
    public void setNumeroRequisicaoGov(java.lang.String numeroRequisicaoGov) {
        this.numeroRequisicaoGov = numeroRequisicaoGov;
    }


    /**
     * Gets the tipo value for this FormaPagamento.
     * 
     * @return tipo
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.EnumTipoFormaPagamento getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this FormaPagamento.
     * 
     * @param tipo
     */
    public void setTipo(br.com.lemontech.selfbooking.wsselfbooking.beans.types.EnumTipoFormaPagamento tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the VCN value for this FormaPagamento.
     * 
     * @return VCN
     */
    public java.lang.Boolean getVCN() {
        return VCN;
    }


    /**
     * Sets the VCN value for this FormaPagamento.
     * 
     * @param VCN
     */
    public void setVCN(java.lang.Boolean VCN) {
        this.VCN = VCN;
    }


    /**
     * Gets the fornecedorVCN value for this FormaPagamento.
     * 
     * @return fornecedorVCN
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.EnumFornecedorVCN getFornecedorVCN() {
        return fornecedorVCN;
    }


    /**
     * Sets the fornecedorVCN value for this FormaPagamento.
     * 
     * @param fornecedorVCN
     */
    public void setFornecedorVCN(br.com.lemontech.selfbooking.wsselfbooking.beans.types.EnumFornecedorVCN fornecedorVCN) {
        this.fornecedorVCN = fornecedorVCN;
    }


    /**
     * Gets the VCNAgencia value for this FormaPagamento.
     * 
     * @return VCNAgencia
     */
    public java.lang.Boolean getVCNAgencia() {
        return VCNAgencia;
    }


    /**
     * Sets the VCNAgencia value for this FormaPagamento.
     * 
     * @param VCNAgencia
     */
    public void setVCNAgencia(java.lang.Boolean VCNAgencia) {
        this.VCNAgencia = VCNAgencia;
    }


    /**
     * Gets the codigoConvenioVCN value for this FormaPagamento.
     * 
     * @return codigoConvenioVCN
     */
    public java.lang.String getCodigoConvenioVCN() {
        return codigoConvenioVCN;
    }


    /**
     * Sets the codigoConvenioVCN value for this FormaPagamento.
     * 
     * @param codigoConvenioVCN
     */
    public void setCodigoConvenioVCN(java.lang.String codigoConvenioVCN) {
        this.codigoConvenioVCN = codigoConvenioVCN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FormaPagamento)) return false;
        FormaPagamento other = (FormaPagamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autorizacao==null && other.getAutorizacao()==null) || 
             (this.autorizacao!=null &&
              this.autorizacao.equals(other.getAutorizacao()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.parcelas==null && other.getParcelas()==null) || 
             (this.parcelas!=null &&
              this.parcelas.equals(other.getParcelas()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor()))) &&
            ((this.formaPagameno==null && other.getFormaPagameno()==null) || 
             (this.formaPagameno!=null &&
              this.formaPagameno.equals(other.getFormaPagameno()))) &&
            ((this.vencimentoCartao==null && other.getVencimentoCartao()==null) || 
             (this.vencimentoCartao!=null &&
              this.vencimentoCartao.equals(other.getVencimentoCartao()))) &&
            ((this.numeroRequisicaoGov==null && other.getNumeroRequisicaoGov()==null) || 
             (this.numeroRequisicaoGov!=null &&
              this.numeroRequisicaoGov.equals(other.getNumeroRequisicaoGov()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.VCN==null && other.getVCN()==null) || 
             (this.VCN!=null &&
              this.VCN.equals(other.getVCN()))) &&
            ((this.fornecedorVCN==null && other.getFornecedorVCN()==null) || 
             (this.fornecedorVCN!=null &&
              this.fornecedorVCN.equals(other.getFornecedorVCN()))) &&
            ((this.VCNAgencia==null && other.getVCNAgencia()==null) || 
             (this.VCNAgencia!=null &&
              this.VCNAgencia.equals(other.getVCNAgencia()))) &&
            ((this.codigoConvenioVCN==null && other.getCodigoConvenioVCN()==null) || 
             (this.codigoConvenioVCN!=null &&
              this.codigoConvenioVCN.equals(other.getCodigoConvenioVCN())));
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
        if (getAutorizacao() != null) {
            _hashCode += getAutorizacao().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getParcelas() != null) {
            _hashCode += getParcelas().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        if (getFormaPagameno() != null) {
            _hashCode += getFormaPagameno().hashCode();
        }
        if (getVencimentoCartao() != null) {
            _hashCode += getVencimentoCartao().hashCode();
        }
        if (getNumeroRequisicaoGov() != null) {
            _hashCode += getNumeroRequisicaoGov().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getVCN() != null) {
            _hashCode += getVCN().hashCode();
        }
        if (getFornecedorVCN() != null) {
            _hashCode += getFornecedorVCN().hashCode();
        }
        if (getVCNAgencia() != null) {
            _hashCode += getVCNAgencia().hashCode();
        }
        if (getCodigoConvenioVCN() != null) {
            _hashCode += getCodigoConvenioVCN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FormaPagamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "formaPagamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autorizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("formaPagameno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formaPagameno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vencimentoCartao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vencimentoCartao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRequisicaoGov");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroRequisicaoGov"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "enumTipoFormaPagamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VCN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VCN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fornecedorVCN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fornecedorVCN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "enumFornecedorVCN"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VCNAgencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VCNAgencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoConvenioVCN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoConvenioVCN"));
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
