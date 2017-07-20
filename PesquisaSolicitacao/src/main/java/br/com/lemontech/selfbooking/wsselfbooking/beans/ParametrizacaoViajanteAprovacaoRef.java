/**
 * ParametrizacaoViajanteAprovacaoRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class ParametrizacaoViajanteAprovacaoRef  implements java.io.Serializable {
    /* Referencia ao Funcionario para onde esta parametrizacao sera
     * aplicada */
    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef;

    /* Referencia ao Funcionario que esta parametrizacao ira aprovar */
    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef viajanteRef;

    /* Nivel de aprovacao, apos aprovacao desse nivel o sistema enviara
     * a solicitacao para o proximo nivel caso tenha. Para tanto o cliente
     * devera estar devidamente parametrizado. */
    private java.lang.Integer nivelDeAprovacao;

    /* Tipo de Viagem da Aprocacao. TODOS, INTERNACIONAL, INTERCONTINENTAL,
     * CONTINENTAL E NACIONAL. Para tanto o cliente devera estar devidamente
     * parametrizado. */
    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoViagem tipoDeViagemDaAprocacao;

    /* Aprova somente dentro da politica. Quando estiver como 'true',
     * somente as solicitacoes dentro da politica poderao ser aprovadas pelo
     * aprovador. */
    private java.lang.Boolean aprovaSomenteDentroDaPolitica;

    /* Período de viagem inicial. */
    private java.util.Date periodoViagemInicial;

    public ParametrizacaoViajanteAprovacaoRef() {
    }

    public ParametrizacaoViajanteAprovacaoRef(
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef viajanteRef,
           java.lang.Integer nivelDeAprovacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoViagem tipoDeViagemDaAprocacao,
           java.lang.Boolean aprovaSomenteDentroDaPolitica,
           java.util.Date periodoViagemInicial) {
           this.funcionarioRef = funcionarioRef;
           this.viajanteRef = viajanteRef;
           this.nivelDeAprovacao = nivelDeAprovacao;
           this.tipoDeViagemDaAprocacao = tipoDeViagemDaAprocacao;
           this.aprovaSomenteDentroDaPolitica = aprovaSomenteDentroDaPolitica;
           this.periodoViagemInicial = periodoViagemInicial;
    }


    /**
     * Gets the funcionarioRef value for this ParametrizacaoViajanteAprovacaoRef.
     * 
     * @return funcionarioRef   * Referencia ao Funcionario para onde esta parametrizacao sera
     * aplicada
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getFuncionarioRef() {
        return funcionarioRef;
    }


    /**
     * Sets the funcionarioRef value for this ParametrizacaoViajanteAprovacaoRef.
     * 
     * @param funcionarioRef   * Referencia ao Funcionario para onde esta parametrizacao sera
     * aplicada
     */
    public void setFuncionarioRef(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef) {
        this.funcionarioRef = funcionarioRef;
    }


    /**
     * Gets the viajanteRef value for this ParametrizacaoViajanteAprovacaoRef.
     * 
     * @return viajanteRef   * Referencia ao Funcionario que esta parametrizacao ira aprovar
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getViajanteRef() {
        return viajanteRef;
    }


    /**
     * Sets the viajanteRef value for this ParametrizacaoViajanteAprovacaoRef.
     * 
     * @param viajanteRef   * Referencia ao Funcionario que esta parametrizacao ira aprovar
     */
    public void setViajanteRef(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef viajanteRef) {
        this.viajanteRef = viajanteRef;
    }


    /**
     * Gets the nivelDeAprovacao value for this ParametrizacaoViajanteAprovacaoRef.
     * 
     * @return nivelDeAprovacao   * Nivel de aprovacao, apos aprovacao desse nivel o sistema enviara
     * a solicitacao para o proximo nivel caso tenha. Para tanto o cliente
     * devera estar devidamente parametrizado.
     */
    public java.lang.Integer getNivelDeAprovacao() {
        return nivelDeAprovacao;
    }


    /**
     * Sets the nivelDeAprovacao value for this ParametrizacaoViajanteAprovacaoRef.
     * 
     * @param nivelDeAprovacao   * Nivel de aprovacao, apos aprovacao desse nivel o sistema enviara
     * a solicitacao para o proximo nivel caso tenha. Para tanto o cliente
     * devera estar devidamente parametrizado.
     */
    public void setNivelDeAprovacao(java.lang.Integer nivelDeAprovacao) {
        this.nivelDeAprovacao = nivelDeAprovacao;
    }


    /**
     * Gets the tipoDeViagemDaAprocacao value for this ParametrizacaoViajanteAprovacaoRef.
     * 
     * @return tipoDeViagemDaAprocacao   * Tipo de Viagem da Aprocacao. TODOS, INTERNACIONAL, INTERCONTINENTAL,
     * CONTINENTAL E NACIONAL. Para tanto o cliente devera estar devidamente
     * parametrizado.
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoViagem getTipoDeViagemDaAprocacao() {
        return tipoDeViagemDaAprocacao;
    }


    /**
     * Sets the tipoDeViagemDaAprocacao value for this ParametrizacaoViajanteAprovacaoRef.
     * 
     * @param tipoDeViagemDaAprocacao   * Tipo de Viagem da Aprocacao. TODOS, INTERNACIONAL, INTERCONTINENTAL,
     * CONTINENTAL E NACIONAL. Para tanto o cliente devera estar devidamente
     * parametrizado.
     */
    public void setTipoDeViagemDaAprocacao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoViagem tipoDeViagemDaAprocacao) {
        this.tipoDeViagemDaAprocacao = tipoDeViagemDaAprocacao;
    }


    /**
     * Gets the aprovaSomenteDentroDaPolitica value for this ParametrizacaoViajanteAprovacaoRef.
     * 
     * @return aprovaSomenteDentroDaPolitica   * Aprova somente dentro da politica. Quando estiver como 'true',
     * somente as solicitacoes dentro da politica poderao ser aprovadas pelo
     * aprovador.
     */
    public java.lang.Boolean getAprovaSomenteDentroDaPolitica() {
        return aprovaSomenteDentroDaPolitica;
    }


    /**
     * Sets the aprovaSomenteDentroDaPolitica value for this ParametrizacaoViajanteAprovacaoRef.
     * 
     * @param aprovaSomenteDentroDaPolitica   * Aprova somente dentro da politica. Quando estiver como 'true',
     * somente as solicitacoes dentro da politica poderao ser aprovadas pelo
     * aprovador.
     */
    public void setAprovaSomenteDentroDaPolitica(java.lang.Boolean aprovaSomenteDentroDaPolitica) {
        this.aprovaSomenteDentroDaPolitica = aprovaSomenteDentroDaPolitica;
    }


    /**
     * Gets the periodoViagemInicial value for this ParametrizacaoViajanteAprovacaoRef.
     * 
     * @return periodoViagemInicial   * Período de viagem inicial.
     */
    public java.util.Date getPeriodoViagemInicial() {
        return periodoViagemInicial;
    }


    /**
     * Sets the periodoViagemInicial value for this ParametrizacaoViajanteAprovacaoRef.
     * 
     * @param periodoViagemInicial   * Período de viagem inicial.
     */
    public void setPeriodoViagemInicial(java.util.Date periodoViagemInicial) {
        this.periodoViagemInicial = periodoViagemInicial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametrizacaoViajanteAprovacaoRef)) return false;
        ParametrizacaoViajanteAprovacaoRef other = (ParametrizacaoViajanteAprovacaoRef) obj;
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
            ((this.viajanteRef==null && other.getViajanteRef()==null) || 
             (this.viajanteRef!=null &&
              this.viajanteRef.equals(other.getViajanteRef()))) &&
            ((this.nivelDeAprovacao==null && other.getNivelDeAprovacao()==null) || 
             (this.nivelDeAprovacao!=null &&
              this.nivelDeAprovacao.equals(other.getNivelDeAprovacao()))) &&
            ((this.tipoDeViagemDaAprocacao==null && other.getTipoDeViagemDaAprocacao()==null) || 
             (this.tipoDeViagemDaAprocacao!=null &&
              this.tipoDeViagemDaAprocacao.equals(other.getTipoDeViagemDaAprocacao()))) &&
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
        if (getViajanteRef() != null) {
            _hashCode += getViajanteRef().hashCode();
        }
        if (getNivelDeAprovacao() != null) {
            _hashCode += getNivelDeAprovacao().hashCode();
        }
        if (getTipoDeViagemDaAprocacao() != null) {
            _hashCode += getTipoDeViagemDaAprocacao().hashCode();
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
        new org.apache.axis.description.TypeDesc(ParametrizacaoViajanteAprovacaoRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoViajanteAprovacaoRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionarioRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funcionarioRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viajanteRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viajanteRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
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
