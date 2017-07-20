/**
 * PrestacaoContas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

public class PrestacaoContas  implements java.io.Serializable {
    private int id;

    private java.lang.String matriculaAutorizador;

    private java.lang.String nomeAutorizador;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.PresacaoContasStatus status;

    private java.lang.String observacaoFinanceiro;

    private java.lang.String justificativaReprovacao;

    private java.lang.Boolean reembolso;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.expense.PrestacaoContaItem[] itens;

    public PrestacaoContas() {
    }

    public PrestacaoContas(
           int id,
           java.lang.String matriculaAutorizador,
           java.lang.String nomeAutorizador,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.PresacaoContasStatus status,
           java.lang.String observacaoFinanceiro,
           java.lang.String justificativaReprovacao,
           java.lang.Boolean reembolso,
           br.com.lemontech.selfbooking.wsselfbooking.beans.expense.PrestacaoContaItem[] itens) {
           this.id = id;
           this.matriculaAutorizador = matriculaAutorizador;
           this.nomeAutorizador = nomeAutorizador;
           this.status = status;
           this.observacaoFinanceiro = observacaoFinanceiro;
           this.justificativaReprovacao = justificativaReprovacao;
           this.reembolso = reembolso;
           this.itens = itens;
    }


    /**
     * Gets the id value for this PrestacaoContas.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this PrestacaoContas.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the matriculaAutorizador value for this PrestacaoContas.
     * 
     * @return matriculaAutorizador
     */
    public java.lang.String getMatriculaAutorizador() {
        return matriculaAutorizador;
    }


    /**
     * Sets the matriculaAutorizador value for this PrestacaoContas.
     * 
     * @param matriculaAutorizador
     */
    public void setMatriculaAutorizador(java.lang.String matriculaAutorizador) {
        this.matriculaAutorizador = matriculaAutorizador;
    }


    /**
     * Gets the nomeAutorizador value for this PrestacaoContas.
     * 
     * @return nomeAutorizador
     */
    public java.lang.String getNomeAutorizador() {
        return nomeAutorizador;
    }


    /**
     * Sets the nomeAutorizador value for this PrestacaoContas.
     * 
     * @param nomeAutorizador
     */
    public void setNomeAutorizador(java.lang.String nomeAutorizador) {
        this.nomeAutorizador = nomeAutorizador;
    }


    /**
     * Gets the status value for this PrestacaoContas.
     * 
     * @return status
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.PresacaoContasStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PrestacaoContas.
     * 
     * @param status
     */
    public void setStatus(br.com.lemontech.selfbooking.wsselfbooking.beans.types.PresacaoContasStatus status) {
        this.status = status;
    }


    /**
     * Gets the observacaoFinanceiro value for this PrestacaoContas.
     * 
     * @return observacaoFinanceiro
     */
    public java.lang.String getObservacaoFinanceiro() {
        return observacaoFinanceiro;
    }


    /**
     * Sets the observacaoFinanceiro value for this PrestacaoContas.
     * 
     * @param observacaoFinanceiro
     */
    public void setObservacaoFinanceiro(java.lang.String observacaoFinanceiro) {
        this.observacaoFinanceiro = observacaoFinanceiro;
    }


    /**
     * Gets the justificativaReprovacao value for this PrestacaoContas.
     * 
     * @return justificativaReprovacao
     */
    public java.lang.String getJustificativaReprovacao() {
        return justificativaReprovacao;
    }


    /**
     * Sets the justificativaReprovacao value for this PrestacaoContas.
     * 
     * @param justificativaReprovacao
     */
    public void setJustificativaReprovacao(java.lang.String justificativaReprovacao) {
        this.justificativaReprovacao = justificativaReprovacao;
    }


    /**
     * Gets the reembolso value for this PrestacaoContas.
     * 
     * @return reembolso
     */
    public java.lang.Boolean getReembolso() {
        return reembolso;
    }


    /**
     * Sets the reembolso value for this PrestacaoContas.
     * 
     * @param reembolso
     */
    public void setReembolso(java.lang.Boolean reembolso) {
        this.reembolso = reembolso;
    }


    /**
     * Gets the itens value for this PrestacaoContas.
     * 
     * @return itens
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.expense.PrestacaoContaItem[] getItens() {
        return itens;
    }


    /**
     * Sets the itens value for this PrestacaoContas.
     * 
     * @param itens
     */
    public void setItens(br.com.lemontech.selfbooking.wsselfbooking.beans.expense.PrestacaoContaItem[] itens) {
        this.itens = itens;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrestacaoContas)) return false;
        PrestacaoContas other = (PrestacaoContas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.matriculaAutorizador==null && other.getMatriculaAutorizador()==null) || 
             (this.matriculaAutorizador!=null &&
              this.matriculaAutorizador.equals(other.getMatriculaAutorizador()))) &&
            ((this.nomeAutorizador==null && other.getNomeAutorizador()==null) || 
             (this.nomeAutorizador!=null &&
              this.nomeAutorizador.equals(other.getNomeAutorizador()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.observacaoFinanceiro==null && other.getObservacaoFinanceiro()==null) || 
             (this.observacaoFinanceiro!=null &&
              this.observacaoFinanceiro.equals(other.getObservacaoFinanceiro()))) &&
            ((this.justificativaReprovacao==null && other.getJustificativaReprovacao()==null) || 
             (this.justificativaReprovacao!=null &&
              this.justificativaReprovacao.equals(other.getJustificativaReprovacao()))) &&
            ((this.reembolso==null && other.getReembolso()==null) || 
             (this.reembolso!=null &&
              this.reembolso.equals(other.getReembolso()))) &&
            ((this.itens==null && other.getItens()==null) || 
             (this.itens!=null &&
              java.util.Arrays.equals(this.itens, other.getItens())));
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
        _hashCode += getId();
        if (getMatriculaAutorizador() != null) {
            _hashCode += getMatriculaAutorizador().hashCode();
        }
        if (getNomeAutorizador() != null) {
            _hashCode += getNomeAutorizador().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getObservacaoFinanceiro() != null) {
            _hashCode += getObservacaoFinanceiro().hashCode();
        }
        if (getJustificativaReprovacao() != null) {
            _hashCode += getJustificativaReprovacao().hashCode();
        }
        if (getReembolso() != null) {
            _hashCode += getReembolso().hashCode();
        }
        if (getItens() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItens());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItens(), i);
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
        new org.apache.axis.description.TypeDesc(PrestacaoContas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "prestacaoContas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matriculaAutorizador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matriculaAutorizador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeAutorizador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeAutorizador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "presacaoContasStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacaoFinanceiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observacaoFinanceiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justificativaReprovacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "justificativaReprovacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reembolso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reembolso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itens");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "prestacaoContaItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
