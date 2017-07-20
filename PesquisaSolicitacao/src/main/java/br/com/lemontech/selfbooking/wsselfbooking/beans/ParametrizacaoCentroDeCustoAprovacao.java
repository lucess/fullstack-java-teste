/**
 * ParametrizacaoCentroDeCustoAprovacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class ParametrizacaoCentroDeCustoAprovacao  extends br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacaoRef  implements java.io.Serializable {
    /* Vencimento. */
    private java.util.Date vencimento;

    /* Período de viagem final. */
    private java.util.Date periodoViagemFinal;

    /* Valor da alçada inicial. */
    private java.lang.Double valorAlcadaInicial;

    /* Valor da alçada final. */
    private java.lang.Double valorAlcadaFinal;

    /* Tipo de solicitacao. TODOS, CORPORATIVO, EXPENSE e INCENTIVO. */
    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoDeSolicitacao tipoDeSolicitacao;

    public ParametrizacaoCentroDeCustoAprovacao() {
    }

    public ParametrizacaoCentroDeCustoAprovacao(
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef,
           java.lang.Integer nivelDeAprovacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoViagem tipoDeViagemDaAprocacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPassageiro tipoDePassageiro,
           java.lang.Boolean aprovaSomenteAprovador,
           java.lang.Boolean aprovaSomenteDentroDaPolitica,
           java.util.Date periodoViagemInicial,
           java.util.Date vencimento,
           java.util.Date periodoViagemFinal,
           java.lang.Double valorAlcadaInicial,
           java.lang.Double valorAlcadaFinal,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoDeSolicitacao tipoDeSolicitacao) {
        super(
            funcionarioRef,
            centroDeCustoRef,
            subCentroDeCustoRef,
            nivelDeAprovacao,
            tipoDeViagemDaAprocacao,
            tipoDePassageiro,
            aprovaSomenteAprovador,
            aprovaSomenteDentroDaPolitica,
            periodoViagemInicial);
        this.vencimento = vencimento;
        this.periodoViagemFinal = periodoViagemFinal;
        this.valorAlcadaInicial = valorAlcadaInicial;
        this.valorAlcadaFinal = valorAlcadaFinal;
        this.tipoDeSolicitacao = tipoDeSolicitacao;
    }


    /**
     * Gets the vencimento value for this ParametrizacaoCentroDeCustoAprovacao.
     * 
     * @return vencimento   * Vencimento.
     */
    public java.util.Date getVencimento() {
        return vencimento;
    }


    /**
     * Sets the vencimento value for this ParametrizacaoCentroDeCustoAprovacao.
     * 
     * @param vencimento   * Vencimento.
     */
    public void setVencimento(java.util.Date vencimento) {
        this.vencimento = vencimento;
    }


    /**
     * Gets the periodoViagemFinal value for this ParametrizacaoCentroDeCustoAprovacao.
     * 
     * @return periodoViagemFinal   * Período de viagem final.
     */
    public java.util.Date getPeriodoViagemFinal() {
        return periodoViagemFinal;
    }


    /**
     * Sets the periodoViagemFinal value for this ParametrizacaoCentroDeCustoAprovacao.
     * 
     * @param periodoViagemFinal   * Período de viagem final.
     */
    public void setPeriodoViagemFinal(java.util.Date periodoViagemFinal) {
        this.periodoViagemFinal = periodoViagemFinal;
    }


    /**
     * Gets the valorAlcadaInicial value for this ParametrizacaoCentroDeCustoAprovacao.
     * 
     * @return valorAlcadaInicial   * Valor da alçada inicial.
     */
    public java.lang.Double getValorAlcadaInicial() {
        return valorAlcadaInicial;
    }


    /**
     * Sets the valorAlcadaInicial value for this ParametrizacaoCentroDeCustoAprovacao.
     * 
     * @param valorAlcadaInicial   * Valor da alçada inicial.
     */
    public void setValorAlcadaInicial(java.lang.Double valorAlcadaInicial) {
        this.valorAlcadaInicial = valorAlcadaInicial;
    }


    /**
     * Gets the valorAlcadaFinal value for this ParametrizacaoCentroDeCustoAprovacao.
     * 
     * @return valorAlcadaFinal   * Valor da alçada final.
     */
    public java.lang.Double getValorAlcadaFinal() {
        return valorAlcadaFinal;
    }


    /**
     * Sets the valorAlcadaFinal value for this ParametrizacaoCentroDeCustoAprovacao.
     * 
     * @param valorAlcadaFinal   * Valor da alçada final.
     */
    public void setValorAlcadaFinal(java.lang.Double valorAlcadaFinal) {
        this.valorAlcadaFinal = valorAlcadaFinal;
    }


    /**
     * Gets the tipoDeSolicitacao value for this ParametrizacaoCentroDeCustoAprovacao.
     * 
     * @return tipoDeSolicitacao   * Tipo de solicitacao. TODOS, CORPORATIVO, EXPENSE e INCENTIVO.
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoDeSolicitacao getTipoDeSolicitacao() {
        return tipoDeSolicitacao;
    }


    /**
     * Sets the tipoDeSolicitacao value for this ParametrizacaoCentroDeCustoAprovacao.
     * 
     * @param tipoDeSolicitacao   * Tipo de solicitacao. TODOS, CORPORATIVO, EXPENSE e INCENTIVO.
     */
    public void setTipoDeSolicitacao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoDeSolicitacao tipoDeSolicitacao) {
        this.tipoDeSolicitacao = tipoDeSolicitacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametrizacaoCentroDeCustoAprovacao)) return false;
        ParametrizacaoCentroDeCustoAprovacao other = (ParametrizacaoCentroDeCustoAprovacao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vencimento==null && other.getVencimento()==null) || 
             (this.vencimento!=null &&
              this.vencimento.equals(other.getVencimento()))) &&
            ((this.periodoViagemFinal==null && other.getPeriodoViagemFinal()==null) || 
             (this.periodoViagemFinal!=null &&
              this.periodoViagemFinal.equals(other.getPeriodoViagemFinal()))) &&
            ((this.valorAlcadaInicial==null && other.getValorAlcadaInicial()==null) || 
             (this.valorAlcadaInicial!=null &&
              this.valorAlcadaInicial.equals(other.getValorAlcadaInicial()))) &&
            ((this.valorAlcadaFinal==null && other.getValorAlcadaFinal()==null) || 
             (this.valorAlcadaFinal!=null &&
              this.valorAlcadaFinal.equals(other.getValorAlcadaFinal()))) &&
            ((this.tipoDeSolicitacao==null && other.getTipoDeSolicitacao()==null) || 
             (this.tipoDeSolicitacao!=null &&
              this.tipoDeSolicitacao.equals(other.getTipoDeSolicitacao())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getVencimento() != null) {
            _hashCode += getVencimento().hashCode();
        }
        if (getPeriodoViagemFinal() != null) {
            _hashCode += getPeriodoViagemFinal().hashCode();
        }
        if (getValorAlcadaInicial() != null) {
            _hashCode += getValorAlcadaInicial().hashCode();
        }
        if (getValorAlcadaFinal() != null) {
            _hashCode += getValorAlcadaFinal().hashCode();
        }
        if (getTipoDeSolicitacao() != null) {
            _hashCode += getTipoDeSolicitacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametrizacaoCentroDeCustoAprovacao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoAprovacao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodoViagemFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodoViagemFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorAlcadaInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorAlcadaInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorAlcadaFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorAlcadaFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDeSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDeSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoDeSolicitacao"));
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
