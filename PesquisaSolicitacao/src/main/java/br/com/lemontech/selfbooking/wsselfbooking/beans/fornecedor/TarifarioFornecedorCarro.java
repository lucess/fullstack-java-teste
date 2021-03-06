/**
 * TarifarioFornecedorCarro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor;

public class TarifarioFornecedorCarro  extends br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarroRef  implements java.io.Serializable {
    private java.util.Date vencimento;

    private java.lang.String descricao;

    private double tarifa;

    private double seguro;

    private double tarifaDiariaAdicional;

    private double tarifaHoraAdicional;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda;

    private boolean ativo;

    public TarifarioFornecedorCarro() {
    }

    public TarifarioFornecedorCarro(
           java.lang.String identificadorBackofficeFornecedor,
           java.lang.String identificadorBackofficeCliente,
           java.lang.String modelo,
           java.lang.String categoria,
           java.util.Date vencimento,
           java.lang.String descricao,
           double tarifa,
           double seguro,
           double tarifaDiariaAdicional,
           double tarifaHoraAdicional,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda,
           boolean ativo) {
        super(
            identificadorBackofficeFornecedor,
            identificadorBackofficeCliente,
            modelo,
            categoria);
        this.vencimento = vencimento;
        this.descricao = descricao;
        this.tarifa = tarifa;
        this.seguro = seguro;
        this.tarifaDiariaAdicional = tarifaDiariaAdicional;
        this.tarifaHoraAdicional = tarifaHoraAdicional;
        this.moeda = moeda;
        this.ativo = ativo;
    }


    /**
     * Gets the vencimento value for this TarifarioFornecedorCarro.
     * 
     * @return vencimento
     */
    public java.util.Date getVencimento() {
        return vencimento;
    }


    /**
     * Sets the vencimento value for this TarifarioFornecedorCarro.
     * 
     * @param vencimento
     */
    public void setVencimento(java.util.Date vencimento) {
        this.vencimento = vencimento;
    }


    /**
     * Gets the descricao value for this TarifarioFornecedorCarro.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this TarifarioFornecedorCarro.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the tarifa value for this TarifarioFornecedorCarro.
     * 
     * @return tarifa
     */
    public double getTarifa() {
        return tarifa;
    }


    /**
     * Sets the tarifa value for this TarifarioFornecedorCarro.
     * 
     * @param tarifa
     */
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }


    /**
     * Gets the seguro value for this TarifarioFornecedorCarro.
     * 
     * @return seguro
     */
    public double getSeguro() {
        return seguro;
    }


    /**
     * Sets the seguro value for this TarifarioFornecedorCarro.
     * 
     * @param seguro
     */
    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }


    /**
     * Gets the tarifaDiariaAdicional value for this TarifarioFornecedorCarro.
     * 
     * @return tarifaDiariaAdicional
     */
    public double getTarifaDiariaAdicional() {
        return tarifaDiariaAdicional;
    }


    /**
     * Sets the tarifaDiariaAdicional value for this TarifarioFornecedorCarro.
     * 
     * @param tarifaDiariaAdicional
     */
    public void setTarifaDiariaAdicional(double tarifaDiariaAdicional) {
        this.tarifaDiariaAdicional = tarifaDiariaAdicional;
    }


    /**
     * Gets the tarifaHoraAdicional value for this TarifarioFornecedorCarro.
     * 
     * @return tarifaHoraAdicional
     */
    public double getTarifaHoraAdicional() {
        return tarifaHoraAdicional;
    }


    /**
     * Sets the tarifaHoraAdicional value for this TarifarioFornecedorCarro.
     * 
     * @param tarifaHoraAdicional
     */
    public void setTarifaHoraAdicional(double tarifaHoraAdicional) {
        this.tarifaHoraAdicional = tarifaHoraAdicional;
    }


    /**
     * Gets the moeda value for this TarifarioFornecedorCarro.
     * 
     * @return moeda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this TarifarioFornecedorCarro.
     * 
     * @param moeda
     */
    public void setMoeda(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda) {
        this.moeda = moeda;
    }


    /**
     * Gets the ativo value for this TarifarioFornecedorCarro.
     * 
     * @return ativo
     */
    public boolean isAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this TarifarioFornecedorCarro.
     * 
     * @param ativo
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TarifarioFornecedorCarro)) return false;
        TarifarioFornecedorCarro other = (TarifarioFornecedorCarro) obj;
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
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            this.tarifa == other.getTarifa() &&
            this.seguro == other.getSeguro() &&
            this.tarifaDiariaAdicional == other.getTarifaDiariaAdicional() &&
            this.tarifaHoraAdicional == other.getTarifaHoraAdicional() &&
            ((this.moeda==null && other.getMoeda()==null) || 
             (this.moeda!=null &&
              this.moeda.equals(other.getMoeda()))) &&
            this.ativo == other.isAtivo();
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
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        _hashCode += new Double(getTarifa()).hashCode();
        _hashCode += new Double(getSeguro()).hashCode();
        _hashCode += new Double(getTarifaDiariaAdicional()).hashCode();
        _hashCode += new Double(getTarifaHoraAdicional()).hashCode();
        if (getMoeda() != null) {
            _hashCode += getMoeda().hashCode();
        }
        _hashCode += (isAtivo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TarifarioFornecedorCarro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorCarro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seguro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seguro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifaDiariaAdicional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifaDiariaAdicional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifaHoraAdicional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifaHoraAdicional"));
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
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
