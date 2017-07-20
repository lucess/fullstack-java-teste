/**
 * AereoTarifaPax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

public class AereoTarifaPax  implements java.io.Serializable {
    private java.lang.Double tarifa;

    private java.lang.Double taxa;

    private java.lang.Double taxaDu;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPax tipoPax;

    private java.lang.Integer quantidadePax;

    private java.lang.Double tarifaSemAcordo;

    private java.lang.String moeda;

    private java.lang.String moedaBase;

    private java.lang.Double tarifaBase;

    private java.lang.Double cotacao;

    private java.lang.String acordo;

    private java.lang.Double totalTarifaPax;

    private java.lang.Double taxaFee;

    private java.lang.Double valorFullFare;

    public AereoTarifaPax() {
    }

    public AereoTarifaPax(
           java.lang.Double tarifa,
           java.lang.Double taxa,
           java.lang.Double taxaDu,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPax tipoPax,
           java.lang.Integer quantidadePax,
           java.lang.Double tarifaSemAcordo,
           java.lang.String moeda,
           java.lang.String moedaBase,
           java.lang.Double tarifaBase,
           java.lang.Double cotacao,
           java.lang.String acordo,
           java.lang.Double totalTarifaPax,
           java.lang.Double taxaFee,
           java.lang.Double valorFullFare) {
           this.tarifa = tarifa;
           this.taxa = taxa;
           this.taxaDu = taxaDu;
           this.tipoPax = tipoPax;
           this.quantidadePax = quantidadePax;
           this.tarifaSemAcordo = tarifaSemAcordo;
           this.moeda = moeda;
           this.moedaBase = moedaBase;
           this.tarifaBase = tarifaBase;
           this.cotacao = cotacao;
           this.acordo = acordo;
           this.totalTarifaPax = totalTarifaPax;
           this.taxaFee = taxaFee;
           this.valorFullFare = valorFullFare;
    }


    /**
     * Gets the tarifa value for this AereoTarifaPax.
     * 
     * @return tarifa
     */
    public java.lang.Double getTarifa() {
        return tarifa;
    }


    /**
     * Sets the tarifa value for this AereoTarifaPax.
     * 
     * @param tarifa
     */
    public void setTarifa(java.lang.Double tarifa) {
        this.tarifa = tarifa;
    }


    /**
     * Gets the taxa value for this AereoTarifaPax.
     * 
     * @return taxa
     */
    public java.lang.Double getTaxa() {
        return taxa;
    }


    /**
     * Sets the taxa value for this AereoTarifaPax.
     * 
     * @param taxa
     */
    public void setTaxa(java.lang.Double taxa) {
        this.taxa = taxa;
    }


    /**
     * Gets the taxaDu value for this AereoTarifaPax.
     * 
     * @return taxaDu
     */
    public java.lang.Double getTaxaDu() {
        return taxaDu;
    }


    /**
     * Sets the taxaDu value for this AereoTarifaPax.
     * 
     * @param taxaDu
     */
    public void setTaxaDu(java.lang.Double taxaDu) {
        this.taxaDu = taxaDu;
    }


    /**
     * Gets the tipoPax value for this AereoTarifaPax.
     * 
     * @return tipoPax
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPax getTipoPax() {
        return tipoPax;
    }


    /**
     * Sets the tipoPax value for this AereoTarifaPax.
     * 
     * @param tipoPax
     */
    public void setTipoPax(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPax tipoPax) {
        this.tipoPax = tipoPax;
    }


    /**
     * Gets the quantidadePax value for this AereoTarifaPax.
     * 
     * @return quantidadePax
     */
    public java.lang.Integer getQuantidadePax() {
        return quantidadePax;
    }


    /**
     * Sets the quantidadePax value for this AereoTarifaPax.
     * 
     * @param quantidadePax
     */
    public void setQuantidadePax(java.lang.Integer quantidadePax) {
        this.quantidadePax = quantidadePax;
    }


    /**
     * Gets the tarifaSemAcordo value for this AereoTarifaPax.
     * 
     * @return tarifaSemAcordo
     */
    public java.lang.Double getTarifaSemAcordo() {
        return tarifaSemAcordo;
    }


    /**
     * Sets the tarifaSemAcordo value for this AereoTarifaPax.
     * 
     * @param tarifaSemAcordo
     */
    public void setTarifaSemAcordo(java.lang.Double tarifaSemAcordo) {
        this.tarifaSemAcordo = tarifaSemAcordo;
    }


    /**
     * Gets the moeda value for this AereoTarifaPax.
     * 
     * @return moeda
     */
    public java.lang.String getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this AereoTarifaPax.
     * 
     * @param moeda
     */
    public void setMoeda(java.lang.String moeda) {
        this.moeda = moeda;
    }


    /**
     * Gets the moedaBase value for this AereoTarifaPax.
     * 
     * @return moedaBase
     */
    public java.lang.String getMoedaBase() {
        return moedaBase;
    }


    /**
     * Sets the moedaBase value for this AereoTarifaPax.
     * 
     * @param moedaBase
     */
    public void setMoedaBase(java.lang.String moedaBase) {
        this.moedaBase = moedaBase;
    }


    /**
     * Gets the tarifaBase value for this AereoTarifaPax.
     * 
     * @return tarifaBase
     */
    public java.lang.Double getTarifaBase() {
        return tarifaBase;
    }


    /**
     * Sets the tarifaBase value for this AereoTarifaPax.
     * 
     * @param tarifaBase
     */
    public void setTarifaBase(java.lang.Double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }


    /**
     * Gets the cotacao value for this AereoTarifaPax.
     * 
     * @return cotacao
     */
    public java.lang.Double getCotacao() {
        return cotacao;
    }


    /**
     * Sets the cotacao value for this AereoTarifaPax.
     * 
     * @param cotacao
     */
    public void setCotacao(java.lang.Double cotacao) {
        this.cotacao = cotacao;
    }


    /**
     * Gets the acordo value for this AereoTarifaPax.
     * 
     * @return acordo
     */
    public java.lang.String getAcordo() {
        return acordo;
    }


    /**
     * Sets the acordo value for this AereoTarifaPax.
     * 
     * @param acordo
     */
    public void setAcordo(java.lang.String acordo) {
        this.acordo = acordo;
    }


    /**
     * Gets the totalTarifaPax value for this AereoTarifaPax.
     * 
     * @return totalTarifaPax
     */
    public java.lang.Double getTotalTarifaPax() {
        return totalTarifaPax;
    }


    /**
     * Sets the totalTarifaPax value for this AereoTarifaPax.
     * 
     * @param totalTarifaPax
     */
    public void setTotalTarifaPax(java.lang.Double totalTarifaPax) {
        this.totalTarifaPax = totalTarifaPax;
    }


    /**
     * Gets the taxaFee value for this AereoTarifaPax.
     * 
     * @return taxaFee
     */
    public java.lang.Double getTaxaFee() {
        return taxaFee;
    }


    /**
     * Sets the taxaFee value for this AereoTarifaPax.
     * 
     * @param taxaFee
     */
    public void setTaxaFee(java.lang.Double taxaFee) {
        this.taxaFee = taxaFee;
    }


    /**
     * Gets the valorFullFare value for this AereoTarifaPax.
     * 
     * @return valorFullFare
     */
    public java.lang.Double getValorFullFare() {
        return valorFullFare;
    }


    /**
     * Sets the valorFullFare value for this AereoTarifaPax.
     * 
     * @param valorFullFare
     */
    public void setValorFullFare(java.lang.Double valorFullFare) {
        this.valorFullFare = valorFullFare;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AereoTarifaPax)) return false;
        AereoTarifaPax other = (AereoTarifaPax) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tarifa==null && other.getTarifa()==null) || 
             (this.tarifa!=null &&
              this.tarifa.equals(other.getTarifa()))) &&
            ((this.taxa==null && other.getTaxa()==null) || 
             (this.taxa!=null &&
              this.taxa.equals(other.getTaxa()))) &&
            ((this.taxaDu==null && other.getTaxaDu()==null) || 
             (this.taxaDu!=null &&
              this.taxaDu.equals(other.getTaxaDu()))) &&
            ((this.tipoPax==null && other.getTipoPax()==null) || 
             (this.tipoPax!=null &&
              this.tipoPax.equals(other.getTipoPax()))) &&
            ((this.quantidadePax==null && other.getQuantidadePax()==null) || 
             (this.quantidadePax!=null &&
              this.quantidadePax.equals(other.getQuantidadePax()))) &&
            ((this.tarifaSemAcordo==null && other.getTarifaSemAcordo()==null) || 
             (this.tarifaSemAcordo!=null &&
              this.tarifaSemAcordo.equals(other.getTarifaSemAcordo()))) &&
            ((this.moeda==null && other.getMoeda()==null) || 
             (this.moeda!=null &&
              this.moeda.equals(other.getMoeda()))) &&
            ((this.moedaBase==null && other.getMoedaBase()==null) || 
             (this.moedaBase!=null &&
              this.moedaBase.equals(other.getMoedaBase()))) &&
            ((this.tarifaBase==null && other.getTarifaBase()==null) || 
             (this.tarifaBase!=null &&
              this.tarifaBase.equals(other.getTarifaBase()))) &&
            ((this.cotacao==null && other.getCotacao()==null) || 
             (this.cotacao!=null &&
              this.cotacao.equals(other.getCotacao()))) &&
            ((this.acordo==null && other.getAcordo()==null) || 
             (this.acordo!=null &&
              this.acordo.equals(other.getAcordo()))) &&
            ((this.totalTarifaPax==null && other.getTotalTarifaPax()==null) || 
             (this.totalTarifaPax!=null &&
              this.totalTarifaPax.equals(other.getTotalTarifaPax()))) &&
            ((this.taxaFee==null && other.getTaxaFee()==null) || 
             (this.taxaFee!=null &&
              this.taxaFee.equals(other.getTaxaFee()))) &&
            ((this.valorFullFare==null && other.getValorFullFare()==null) || 
             (this.valorFullFare!=null &&
              this.valorFullFare.equals(other.getValorFullFare())));
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
        if (getTarifa() != null) {
            _hashCode += getTarifa().hashCode();
        }
        if (getTaxa() != null) {
            _hashCode += getTaxa().hashCode();
        }
        if (getTaxaDu() != null) {
            _hashCode += getTaxaDu().hashCode();
        }
        if (getTipoPax() != null) {
            _hashCode += getTipoPax().hashCode();
        }
        if (getQuantidadePax() != null) {
            _hashCode += getQuantidadePax().hashCode();
        }
        if (getTarifaSemAcordo() != null) {
            _hashCode += getTarifaSemAcordo().hashCode();
        }
        if (getMoeda() != null) {
            _hashCode += getMoeda().hashCode();
        }
        if (getMoedaBase() != null) {
            _hashCode += getMoedaBase().hashCode();
        }
        if (getTarifaBase() != null) {
            _hashCode += getTarifaBase().hashCode();
        }
        if (getCotacao() != null) {
            _hashCode += getCotacao().hashCode();
        }
        if (getAcordo() != null) {
            _hashCode += getAcordo().hashCode();
        }
        if (getTotalTarifaPax() != null) {
            _hashCode += getTotalTarifaPax().hashCode();
        }
        if (getTaxaFee() != null) {
            _hashCode += getTaxaFee().hashCode();
        }
        if (getValorFullFare() != null) {
            _hashCode += getValorFullFare().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AereoTarifaPax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoTarifaPax"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxaDu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxaDu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoPax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoPax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidadePax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantidadePax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifaSemAcordo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifaSemAcordo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moeda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moeda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moedaBase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moedaBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifaBase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifaBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cotacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cotacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acordo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acordo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTarifaPax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalTarifaPax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxaFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxaFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorFullFare");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorFullFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
