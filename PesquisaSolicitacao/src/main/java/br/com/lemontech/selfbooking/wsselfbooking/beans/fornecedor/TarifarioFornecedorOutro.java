/**
 * TarifarioFornecedorOutro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor;

public class TarifarioFornecedorOutro  extends br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutroRef  implements java.io.Serializable {
    private java.lang.String identificadorBackOfficeTipoProduto;

    private java.lang.String categoria;

    private java.util.Date vencimento;

    private java.lang.String descricao;

    private double tarifa;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda;

    private boolean ativo;

    public TarifarioFornecedorOutro() {
    }

    public TarifarioFornecedorOutro(
           java.lang.String identificadorBackofficeFornecedor,
           java.lang.String identificadorBackofficeCliente,
           java.lang.String identificadorBackOffice,
           java.lang.String identificadorBackOfficeTipoProduto,
           java.lang.String categoria,
           java.util.Date vencimento,
           java.lang.String descricao,
           double tarifa,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda,
           boolean ativo) {
        super(
            identificadorBackofficeFornecedor,
            identificadorBackofficeCliente,
            identificadorBackOffice);
        this.identificadorBackOfficeTipoProduto = identificadorBackOfficeTipoProduto;
        this.categoria = categoria;
        this.vencimento = vencimento;
        this.descricao = descricao;
        this.tarifa = tarifa;
        this.moeda = moeda;
        this.ativo = ativo;
    }


    /**
     * Gets the identificadorBackOfficeTipoProduto value for this TarifarioFornecedorOutro.
     * 
     * @return identificadorBackOfficeTipoProduto
     */
    public java.lang.String getIdentificadorBackOfficeTipoProduto() {
        return identificadorBackOfficeTipoProduto;
    }


    /**
     * Sets the identificadorBackOfficeTipoProduto value for this TarifarioFornecedorOutro.
     * 
     * @param identificadorBackOfficeTipoProduto
     */
    public void setIdentificadorBackOfficeTipoProduto(java.lang.String identificadorBackOfficeTipoProduto) {
        this.identificadorBackOfficeTipoProduto = identificadorBackOfficeTipoProduto;
    }


    /**
     * Gets the categoria value for this TarifarioFornecedorOutro.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this TarifarioFornecedorOutro.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the vencimento value for this TarifarioFornecedorOutro.
     * 
     * @return vencimento
     */
    public java.util.Date getVencimento() {
        return vencimento;
    }


    /**
     * Sets the vencimento value for this TarifarioFornecedorOutro.
     * 
     * @param vencimento
     */
    public void setVencimento(java.util.Date vencimento) {
        this.vencimento = vencimento;
    }


    /**
     * Gets the descricao value for this TarifarioFornecedorOutro.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this TarifarioFornecedorOutro.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the tarifa value for this TarifarioFornecedorOutro.
     * 
     * @return tarifa
     */
    public double getTarifa() {
        return tarifa;
    }


    /**
     * Sets the tarifa value for this TarifarioFornecedorOutro.
     * 
     * @param tarifa
     */
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }


    /**
     * Gets the moeda value for this TarifarioFornecedorOutro.
     * 
     * @return moeda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this TarifarioFornecedorOutro.
     * 
     * @param moeda
     */
    public void setMoeda(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda) {
        this.moeda = moeda;
    }


    /**
     * Gets the ativo value for this TarifarioFornecedorOutro.
     * 
     * @return ativo
     */
    public boolean isAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this TarifarioFornecedorOutro.
     * 
     * @param ativo
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TarifarioFornecedorOutro)) return false;
        TarifarioFornecedorOutro other = (TarifarioFornecedorOutro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.identificadorBackOfficeTipoProduto==null && other.getIdentificadorBackOfficeTipoProduto()==null) || 
             (this.identificadorBackOfficeTipoProduto!=null &&
              this.identificadorBackOfficeTipoProduto.equals(other.getIdentificadorBackOfficeTipoProduto()))) &&
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            ((this.vencimento==null && other.getVencimento()==null) || 
             (this.vencimento!=null &&
              this.vencimento.equals(other.getVencimento()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            this.tarifa == other.getTarifa() &&
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
        if (getIdentificadorBackOfficeTipoProduto() != null) {
            _hashCode += getIdentificadorBackOfficeTipoProduto().hashCode();
        }
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        if (getVencimento() != null) {
            _hashCode += getVencimento().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        _hashCode += new Double(getTarifa()).hashCode();
        if (getMoeda() != null) {
            _hashCode += getMoeda().hashCode();
        }
        _hashCode += (isAtivo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TarifarioFornecedorOutro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorOutro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorBackOfficeTipoProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorBackOfficeTipoProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
