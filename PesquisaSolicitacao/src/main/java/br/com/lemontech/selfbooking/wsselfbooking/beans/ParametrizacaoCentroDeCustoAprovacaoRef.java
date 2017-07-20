/**
 * ParametrizacaoCentroDeCustoAprovacaoRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class ParametrizacaoCentroDeCustoAprovacaoRef  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef;

    /* Nivel de aprovacao, apos aprovacao desse nivel o sistema enviara
     * a solicitacao para o proximo nivel caso tenha. Para tanto o cliente
     * devera estar devidamente parametrizado. */
    private java.lang.Integer nivelDeAprovacao;

    /* Tipo de Viagem da Aprocacao. TODOS, INTERNACIONAL, INTERCONTINENTAL,
     * CONTINENTAL E NACIONAL. Para tanto o cliente devera estar devidamente
     * parametrizado. */
    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoViagem tipoDeViagemDaAprocacao;

    /* Tipo de passageiro. TODOS, FUNCIONARIO e TERCEIRO. */
    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPassageiro tipoDePassageiro;

    /* Aprova somente Aprovador. Quando estiver como 'true', as pendencias
     * desse aprovador serao somente as que o passageiro tiver perfil de
     * aprovador. */
    private java.lang.Boolean aprovaSomenteAprovador;

    /* Aprova somente dentro da politica. Quando estiver como 'true',
     * somente as solicitacoes dentro da politica poderao ser aprovadas pelo
     * aprovador. */
    private java.lang.Boolean aprovaSomenteDentroDaPolitica;

    /* Período de viagem inicial. */
    private java.util.Date periodoViagemInicial;

    public ParametrizacaoCentroDeCustoAprovacaoRef() {
    }

    public ParametrizacaoCentroDeCustoAprovacaoRef(
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef,
           java.lang.Integer nivelDeAprovacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoViagem tipoDeViagemDaAprocacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPassageiro tipoDePassageiro,
           java.lang.Boolean aprovaSomenteAprovador,
           java.lang.Boolean aprovaSomenteDentroDaPolitica,
           java.util.Date periodoViagemInicial) {
           this.funcionarioRef = funcionarioRef;
           this.centroDeCustoRef = centroDeCustoRef;
           this.subCentroDeCustoRef = subCentroDeCustoRef;
           this.nivelDeAprovacao = nivelDeAprovacao;
           this.tipoDeViagemDaAprocacao = tipoDeViagemDaAprocacao;
           this.tipoDePassageiro = tipoDePassageiro;
           this.aprovaSomenteAprovador = aprovaSomenteAprovador;
           this.aprovaSomenteDentroDaPolitica = aprovaSomenteDentroDaPolitica;
           this.periodoViagemInicial = periodoViagemInicial;
    }


    /**
     * Gets the funcionarioRef value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @return funcionarioRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getFuncionarioRef() {
        return funcionarioRef;
    }


    /**
     * Sets the funcionarioRef value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @param funcionarioRef
     */
    public void setFuncionarioRef(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef) {
        this.funcionarioRef = funcionarioRef;
    }


    /**
     * Gets the centroDeCustoRef value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @return centroDeCustoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }


    /**
     * Sets the centroDeCustoRef value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @param centroDeCustoRef
     */
    public void setCentroDeCustoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef) {
        this.centroDeCustoRef = centroDeCustoRef;
    }


    /**
     * Gets the subCentroDeCustoRef value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @return subCentroDeCustoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef getSubCentroDeCustoRef() {
        return subCentroDeCustoRef;
    }


    /**
     * Sets the subCentroDeCustoRef value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @param subCentroDeCustoRef
     */
    public void setSubCentroDeCustoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef) {
        this.subCentroDeCustoRef = subCentroDeCustoRef;
    }


    /**
     * Gets the nivelDeAprovacao value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @return nivelDeAprovacao   * Nivel de aprovacao, apos aprovacao desse nivel o sistema enviara
     * a solicitacao para o proximo nivel caso tenha. Para tanto o cliente
     * devera estar devidamente parametrizado.
     */
    public java.lang.Integer getNivelDeAprovacao() {
        return nivelDeAprovacao;
    }


    /**
     * Sets the nivelDeAprovacao value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @param nivelDeAprovacao   * Nivel de aprovacao, apos aprovacao desse nivel o sistema enviara
     * a solicitacao para o proximo nivel caso tenha. Para tanto o cliente
     * devera estar devidamente parametrizado.
     */
    public void setNivelDeAprovacao(java.lang.Integer nivelDeAprovacao) {
        this.nivelDeAprovacao = nivelDeAprovacao;
    }


    /**
     * Gets the tipoDeViagemDaAprocacao value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @return tipoDeViagemDaAprocacao   * Tipo de Viagem da Aprocacao. TODOS, INTERNACIONAL, INTERCONTINENTAL,
     * CONTINENTAL E NACIONAL. Para tanto o cliente devera estar devidamente
     * parametrizado.
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoViagem getTipoDeViagemDaAprocacao() {
        return tipoDeViagemDaAprocacao;
    }


    /**
     * Sets the tipoDeViagemDaAprocacao value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @param tipoDeViagemDaAprocacao   * Tipo de Viagem da Aprocacao. TODOS, INTERNACIONAL, INTERCONTINENTAL,
     * CONTINENTAL E NACIONAL. Para tanto o cliente devera estar devidamente
     * parametrizado.
     */
    public void setTipoDeViagemDaAprocacao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoViagem tipoDeViagemDaAprocacao) {
        this.tipoDeViagemDaAprocacao = tipoDeViagemDaAprocacao;
    }


    /**
     * Gets the tipoDePassageiro value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @return tipoDePassageiro   * Tipo de passageiro. TODOS, FUNCIONARIO e TERCEIRO.
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPassageiro getTipoDePassageiro() {
        return tipoDePassageiro;
    }


    /**
     * Sets the tipoDePassageiro value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @param tipoDePassageiro   * Tipo de passageiro. TODOS, FUNCIONARIO e TERCEIRO.
     */
    public void setTipoDePassageiro(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPassageiro tipoDePassageiro) {
        this.tipoDePassageiro = tipoDePassageiro;
    }


    /**
     * Gets the aprovaSomenteAprovador value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @return aprovaSomenteAprovador   * Aprova somente Aprovador. Quando estiver como 'true', as pendencias
     * desse aprovador serao somente as que o passageiro tiver perfil de
     * aprovador.
     */
    public java.lang.Boolean getAprovaSomenteAprovador() {
        return aprovaSomenteAprovador;
    }


    /**
     * Sets the aprovaSomenteAprovador value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @param aprovaSomenteAprovador   * Aprova somente Aprovador. Quando estiver como 'true', as pendencias
     * desse aprovador serao somente as que o passageiro tiver perfil de
     * aprovador.
     */
    public void setAprovaSomenteAprovador(java.lang.Boolean aprovaSomenteAprovador) {
        this.aprovaSomenteAprovador = aprovaSomenteAprovador;
    }


    /**
     * Gets the aprovaSomenteDentroDaPolitica value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @return aprovaSomenteDentroDaPolitica   * Aprova somente dentro da politica. Quando estiver como 'true',
     * somente as solicitacoes dentro da politica poderao ser aprovadas pelo
     * aprovador.
     */
    public java.lang.Boolean getAprovaSomenteDentroDaPolitica() {
        return aprovaSomenteDentroDaPolitica;
    }


    /**
     * Sets the aprovaSomenteDentroDaPolitica value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @param aprovaSomenteDentroDaPolitica   * Aprova somente dentro da politica. Quando estiver como 'true',
     * somente as solicitacoes dentro da politica poderao ser aprovadas pelo
     * aprovador.
     */
    public void setAprovaSomenteDentroDaPolitica(java.lang.Boolean aprovaSomenteDentroDaPolitica) {
        this.aprovaSomenteDentroDaPolitica = aprovaSomenteDentroDaPolitica;
    }


    /**
     * Gets the periodoViagemInicial value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @return periodoViagemInicial   * Período de viagem inicial.
     */
    public java.util.Date getPeriodoViagemInicial() {
        return periodoViagemInicial;
    }


    /**
     * Sets the periodoViagemInicial value for this ParametrizacaoCentroDeCustoAprovacaoRef.
     * 
     * @param periodoViagemInicial   * Período de viagem inicial.
     */
    public void setPeriodoViagemInicial(java.util.Date periodoViagemInicial) {
        this.periodoViagemInicial = periodoViagemInicial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametrizacaoCentroDeCustoAprovacaoRef)) return false;
        ParametrizacaoCentroDeCustoAprovacaoRef other = (ParametrizacaoCentroDeCustoAprovacaoRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.funcionarioRef==null && other.getFuncionarioRef()==null) || 
             (this.funcionarioRef!=null &&
              this.funcionarioRef.equals(other.getFuncionarioRef()))) &&
            ((this.centroDeCustoRef==null && other.getCentroDeCustoRef()==null) || 
             (this.centroDeCustoRef!=null &&
              this.centroDeCustoRef.equals(other.getCentroDeCustoRef()))) &&
            ((this.subCentroDeCustoRef==null && other.getSubCentroDeCustoRef()==null) || 
             (this.subCentroDeCustoRef!=null &&
              this.subCentroDeCustoRef.equals(other.getSubCentroDeCustoRef()))) &&
            ((this.nivelDeAprovacao==null && other.getNivelDeAprovacao()==null) || 
             (this.nivelDeAprovacao!=null &&
              this.nivelDeAprovacao.equals(other.getNivelDeAprovacao()))) &&
            ((this.tipoDeViagemDaAprocacao==null && other.getTipoDeViagemDaAprocacao()==null) || 
             (this.tipoDeViagemDaAprocacao!=null &&
              this.tipoDeViagemDaAprocacao.equals(other.getTipoDeViagemDaAprocacao()))) &&
            ((this.tipoDePassageiro==null && other.getTipoDePassageiro()==null) || 
             (this.tipoDePassageiro!=null &&
              this.tipoDePassageiro.equals(other.getTipoDePassageiro()))) &&
            ((this.aprovaSomenteAprovador==null && other.getAprovaSomenteAprovador()==null) || 
             (this.aprovaSomenteAprovador!=null &&
              this.aprovaSomenteAprovador.equals(other.getAprovaSomenteAprovador()))) &&
            ((this.aprovaSomenteDentroDaPolitica==null && other.getAprovaSomenteDentroDaPolitica()==null) || 
             (this.aprovaSomenteDentroDaPolitica!=null &&
              this.aprovaSomenteDentroDaPolitica.equals(other.getAprovaSomenteDentroDaPolitica()))) &&
            ((this.periodoViagemInicial==null && other.getPeriodoViagemInicial()==null) || 
             (this.periodoViagemInicial!=null &&
              this.periodoViagemInicial.equals(other.getPeriodoViagemInicial())));
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
        if (getFuncionarioRef() != null) {
            _hashCode += getFuncionarioRef().hashCode();
        }
        if (getCentroDeCustoRef() != null) {
            _hashCode += getCentroDeCustoRef().hashCode();
        }
        if (getSubCentroDeCustoRef() != null) {
            _hashCode += getSubCentroDeCustoRef().hashCode();
        }
        if (getNivelDeAprovacao() != null) {
            _hashCode += getNivelDeAprovacao().hashCode();
        }
        if (getTipoDeViagemDaAprocacao() != null) {
            _hashCode += getTipoDeViagemDaAprocacao().hashCode();
        }
        if (getTipoDePassageiro() != null) {
            _hashCode += getTipoDePassageiro().hashCode();
        }
        if (getAprovaSomenteAprovador() != null) {
            _hashCode += getAprovaSomenteAprovador().hashCode();
        }
        if (getAprovaSomenteDentroDaPolitica() != null) {
            _hashCode += getAprovaSomenteDentroDaPolitica().hashCode();
        }
        if (getPeriodoViagemInicial() != null) {
            _hashCode += getPeriodoViagemInicial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametrizacaoCentroDeCustoAprovacaoRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoAprovacaoRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionarioRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funcionarioRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroDeCustoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "centroDeCustoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "centroDeCustoRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCentroDeCustoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subCentroDeCustoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "subCentroDeCustoRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivelDeAprovacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nivelDeAprovacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDeViagemDaAprocacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDeViagemDaAprocacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoViagem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDePassageiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDePassageiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoPassageiro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aprovaSomenteAprovador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aprovaSomenteAprovador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aprovaSomenteDentroDaPolitica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aprovaSomenteDentroDaPolitica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodoViagemInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodoViagemInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
