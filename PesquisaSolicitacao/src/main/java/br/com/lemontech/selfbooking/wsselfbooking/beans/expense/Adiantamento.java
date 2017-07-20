/**
 * Adiantamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

public class Adiantamento  implements java.io.Serializable {
    private int id;

    private java.lang.String matriculaAutorizador;

    private java.lang.String nomeAutorizador;

    private java.util.Calendar dataInicial;

    private java.util.Calendar dataFinal;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCredito tipoCredito;

    private java.lang.String numeroAutorizacao;

    private java.lang.String observacaoSolicitante;

    private java.lang.String observacaoFinanceiro;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.AdiantamentoStatus status;

    private java.util.Calendar dataLiberacao;

    private java.lang.String matriculaCancelador;

    private java.lang.String nomeCancelador;

    private java.util.Calendar dataCancelamento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.expense.AdiantamentoItem[] itens;

    public Adiantamento() {
    }

    public Adiantamento(
           int id,
           java.lang.String matriculaAutorizador,
           java.lang.String nomeAutorizador,
           java.util.Calendar dataInicial,
           java.util.Calendar dataFinal,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCredito tipoCredito,
           java.lang.String numeroAutorizacao,
           java.lang.String observacaoSolicitante,
           java.lang.String observacaoFinanceiro,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.AdiantamentoStatus status,
           java.util.Calendar dataLiberacao,
           java.lang.String matriculaCancelador,
           java.lang.String nomeCancelador,
           java.util.Calendar dataCancelamento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.expense.AdiantamentoItem[] itens) {
           this.id = id;
           this.matriculaAutorizador = matriculaAutorizador;
           this.nomeAutorizador = nomeAutorizador;
           this.dataInicial = dataInicial;
           this.dataFinal = dataFinal;
           this.tipoCredito = tipoCredito;
           this.numeroAutorizacao = numeroAutorizacao;
           this.observacaoSolicitante = observacaoSolicitante;
           this.observacaoFinanceiro = observacaoFinanceiro;
           this.status = status;
           this.dataLiberacao = dataLiberacao;
           this.matriculaCancelador = matriculaCancelador;
           this.nomeCancelador = nomeCancelador;
           this.dataCancelamento = dataCancelamento;
           this.itens = itens;
    }


    /**
     * Gets the id value for this Adiantamento.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Adiantamento.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the matriculaAutorizador value for this Adiantamento.
     * 
     * @return matriculaAutorizador
     */
    public java.lang.String getMatriculaAutorizador() {
        return matriculaAutorizador;
    }


    /**
     * Sets the matriculaAutorizador value for this Adiantamento.
     * 
     * @param matriculaAutorizador
     */
    public void setMatriculaAutorizador(java.lang.String matriculaAutorizador) {
        this.matriculaAutorizador = matriculaAutorizador;
    }


    /**
     * Gets the nomeAutorizador value for this Adiantamento.
     * 
     * @return nomeAutorizador
     */
    public java.lang.String getNomeAutorizador() {
        return nomeAutorizador;
    }


    /**
     * Sets the nomeAutorizador value for this Adiantamento.
     * 
     * @param nomeAutorizador
     */
    public void setNomeAutorizador(java.lang.String nomeAutorizador) {
        this.nomeAutorizador = nomeAutorizador;
    }


    /**
     * Gets the dataInicial value for this Adiantamento.
     * 
     * @return dataInicial
     */
    public java.util.Calendar getDataInicial() {
        return dataInicial;
    }


    /**
     * Sets the dataInicial value for this Adiantamento.
     * 
     * @param dataInicial
     */
    public void setDataInicial(java.util.Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }


    /**
     * Gets the dataFinal value for this Adiantamento.
     * 
     * @return dataFinal
     */
    public java.util.Calendar getDataFinal() {
        return dataFinal;
    }


    /**
     * Sets the dataFinal value for this Adiantamento.
     * 
     * @param dataFinal
     */
    public void setDataFinal(java.util.Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }


    /**
     * Gets the tipoCredito value for this Adiantamento.
     * 
     * @return tipoCredito
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCredito getTipoCredito() {
        return tipoCredito;
    }


    /**
     * Sets the tipoCredito value for this Adiantamento.
     * 
     * @param tipoCredito
     */
    public void setTipoCredito(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCredito tipoCredito) {
        this.tipoCredito = tipoCredito;
    }


    /**
     * Gets the numeroAutorizacao value for this Adiantamento.
     * 
     * @return numeroAutorizacao
     */
    public java.lang.String getNumeroAutorizacao() {
        return numeroAutorizacao;
    }


    /**
     * Sets the numeroAutorizacao value for this Adiantamento.
     * 
     * @param numeroAutorizacao
     */
    public void setNumeroAutorizacao(java.lang.String numeroAutorizacao) {
        this.numeroAutorizacao = numeroAutorizacao;
    }


    /**
     * Gets the observacaoSolicitante value for this Adiantamento.
     * 
     * @return observacaoSolicitante
     */
    public java.lang.String getObservacaoSolicitante() {
        return observacaoSolicitante;
    }


    /**
     * Sets the observacaoSolicitante value for this Adiantamento.
     * 
     * @param observacaoSolicitante
     */
    public void setObservacaoSolicitante(java.lang.String observacaoSolicitante) {
        this.observacaoSolicitante = observacaoSolicitante;
    }


    /**
     * Gets the observacaoFinanceiro value for this Adiantamento.
     * 
     * @return observacaoFinanceiro
     */
    public java.lang.String getObservacaoFinanceiro() {
        return observacaoFinanceiro;
    }


    /**
     * Sets the observacaoFinanceiro value for this Adiantamento.
     * 
     * @param observacaoFinanceiro
     */
    public void setObservacaoFinanceiro(java.lang.String observacaoFinanceiro) {
        this.observacaoFinanceiro = observacaoFinanceiro;
    }


    /**
     * Gets the status value for this Adiantamento.
     * 
     * @return status
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.AdiantamentoStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Adiantamento.
     * 
     * @param status
     */
    public void setStatus(br.com.lemontech.selfbooking.wsselfbooking.beans.types.AdiantamentoStatus status) {
        this.status = status;
    }


    /**
     * Gets the dataLiberacao value for this Adiantamento.
     * 
     * @return dataLiberacao
     */
    public java.util.Calendar getDataLiberacao() {
        return dataLiberacao;
    }


    /**
     * Sets the dataLiberacao value for this Adiantamento.
     * 
     * @param dataLiberacao
     */
    public void setDataLiberacao(java.util.Calendar dataLiberacao) {
        this.dataLiberacao = dataLiberacao;
    }


    /**
     * Gets the matriculaCancelador value for this Adiantamento.
     * 
     * @return matriculaCancelador
     */
    public java.lang.String getMatriculaCancelador() {
        return matriculaCancelador;
    }


    /**
     * Sets the matriculaCancelador value for this Adiantamento.
     * 
     * @param matriculaCancelador
     */
    public void setMatriculaCancelador(java.lang.String matriculaCancelador) {
        this.matriculaCancelador = matriculaCancelador;
    }


    /**
     * Gets the nomeCancelador value for this Adiantamento.
     * 
     * @return nomeCancelador
     */
    public java.lang.String getNomeCancelador() {
        return nomeCancelador;
    }


    /**
     * Sets the nomeCancelador value for this Adiantamento.
     * 
     * @param nomeCancelador
     */
    public void setNomeCancelador(java.lang.String nomeCancelador) {
        this.nomeCancelador = nomeCancelador;
    }


    /**
     * Gets the dataCancelamento value for this Adiantamento.
     * 
     * @return dataCancelamento
     */
    public java.util.Calendar getDataCancelamento() {
        return dataCancelamento;
    }


    /**
     * Sets the dataCancelamento value for this Adiantamento.
     * 
     * @param dataCancelamento
     */
    public void setDataCancelamento(java.util.Calendar dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }


    /**
     * Gets the itens value for this Adiantamento.
     * 
     * @return itens
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.expense.AdiantamentoItem[] getItens() {
        return itens;
    }


    /**
     * Sets the itens value for this Adiantamento.
     * 
     * @param itens
     */
    public void setItens(br.com.lemontech.selfbooking.wsselfbooking.beans.expense.AdiantamentoItem[] itens) {
        this.itens = itens;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Adiantamento)) return false;
        Adiantamento other = (Adiantamento) obj;
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
            ((this.dataInicial==null && other.getDataInicial()==null) || 
             (this.dataInicial!=null &&
              this.dataInicial.equals(other.getDataInicial()))) &&
            ((this.dataFinal==null && other.getDataFinal()==null) || 
             (this.dataFinal!=null &&
              this.dataFinal.equals(other.getDataFinal()))) &&
            ((this.tipoCredito==null && other.getTipoCredito()==null) || 
             (this.tipoCredito!=null &&
              this.tipoCredito.equals(other.getTipoCredito()))) &&
            ((this.numeroAutorizacao==null && other.getNumeroAutorizacao()==null) || 
             (this.numeroAutorizacao!=null &&
              this.numeroAutorizacao.equals(other.getNumeroAutorizacao()))) &&
            ((this.observacaoSolicitante==null && other.getObservacaoSolicitante()==null) || 
             (this.observacaoSolicitante!=null &&
              this.observacaoSolicitante.equals(other.getObservacaoSolicitante()))) &&
            ((this.observacaoFinanceiro==null && other.getObservacaoFinanceiro()==null) || 
             (this.observacaoFinanceiro!=null &&
              this.observacaoFinanceiro.equals(other.getObservacaoFinanceiro()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.dataLiberacao==null && other.getDataLiberacao()==null) || 
             (this.dataLiberacao!=null &&
              this.dataLiberacao.equals(other.getDataLiberacao()))) &&
            ((this.matriculaCancelador==null && other.getMatriculaCancelador()==null) || 
             (this.matriculaCancelador!=null &&
              this.matriculaCancelador.equals(other.getMatriculaCancelador()))) &&
            ((this.nomeCancelador==null && other.getNomeCancelador()==null) || 
             (this.nomeCancelador!=null &&
              this.nomeCancelador.equals(other.getNomeCancelador()))) &&
            ((this.dataCancelamento==null && other.getDataCancelamento()==null) || 
             (this.dataCancelamento!=null &&
              this.dataCancelamento.equals(other.getDataCancelamento()))) &&
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
        if (getDataInicial() != null) {
            _hashCode += getDataInicial().hashCode();
        }
        if (getDataFinal() != null) {
            _hashCode += getDataFinal().hashCode();
        }
        if (getTipoCredito() != null) {
            _hashCode += getTipoCredito().hashCode();
        }
        if (getNumeroAutorizacao() != null) {
            _hashCode += getNumeroAutorizacao().hashCode();
        }
        if (getObservacaoSolicitante() != null) {
            _hashCode += getObservacaoSolicitante().hashCode();
        }
        if (getObservacaoFinanceiro() != null) {
            _hashCode += getObservacaoFinanceiro().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDataLiberacao() != null) {
            _hashCode += getDataLiberacao().hashCode();
        }
        if (getMatriculaCancelador() != null) {
            _hashCode += getMatriculaCancelador().hashCode();
        }
        if (getNomeCancelador() != null) {
            _hashCode += getNomeCancelador().hashCode();
        }
        if (getDataCancelamento() != null) {
            _hashCode += getDataCancelamento().hashCode();
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
        new org.apache.axis.description.TypeDesc(Adiantamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "adiantamento"));
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
        elemField.setFieldName("dataInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCredito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoCredito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoCredito"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAutorizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroAutorizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacaoSolicitante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observacaoSolicitante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "adiantamentoStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataLiberacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataLiberacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matriculaCancelador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matriculaCancelador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCancelador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeCancelador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCancelamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCancelamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itens");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "adiantamentoItem"));
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
