/**
 * Rateio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class Rateio  implements java.io.Serializable {
    private java.lang.String nomeCentroCusto;

    private java.lang.String nomeRegional;

    private java.lang.Double valorPorcentagem;

    private java.lang.String nomeSubCentroCusto;

    private java.lang.String descricaoCentroCusto;

    private java.lang.String descricaoSubCentroCusto;

    public Rateio() {
    }

    public Rateio(
           java.lang.String nomeCentroCusto,
           java.lang.String nomeRegional,
           java.lang.Double valorPorcentagem,
           java.lang.String nomeSubCentroCusto,
           java.lang.String descricaoCentroCusto,
           java.lang.String descricaoSubCentroCusto) {
           this.nomeCentroCusto = nomeCentroCusto;
           this.nomeRegional = nomeRegional;
           this.valorPorcentagem = valorPorcentagem;
           this.nomeSubCentroCusto = nomeSubCentroCusto;
           this.descricaoCentroCusto = descricaoCentroCusto;
           this.descricaoSubCentroCusto = descricaoSubCentroCusto;
    }


    /**
     * Gets the nomeCentroCusto value for this Rateio.
     * 
     * @return nomeCentroCusto
     */
    public java.lang.String getNomeCentroCusto() {
        return nomeCentroCusto;
    }


    /**
     * Sets the nomeCentroCusto value for this Rateio.
     * 
     * @param nomeCentroCusto
     */
    public void setNomeCentroCusto(java.lang.String nomeCentroCusto) {
        this.nomeCentroCusto = nomeCentroCusto;
    }


    /**
     * Gets the nomeRegional value for this Rateio.
     * 
     * @return nomeRegional
     */
    public java.lang.String getNomeRegional() {
        return nomeRegional;
    }


    /**
     * Sets the nomeRegional value for this Rateio.
     * 
     * @param nomeRegional
     */
    public void setNomeRegional(java.lang.String nomeRegional) {
        this.nomeRegional = nomeRegional;
    }


    /**
     * Gets the valorPorcentagem value for this Rateio.
     * 
     * @return valorPorcentagem
     */
    public java.lang.Double getValorPorcentagem() {
        return valorPorcentagem;
    }


    /**
     * Sets the valorPorcentagem value for this Rateio.
     * 
     * @param valorPorcentagem
     */
    public void setValorPorcentagem(java.lang.Double valorPorcentagem) {
        this.valorPorcentagem = valorPorcentagem;
    }


    /**
     * Gets the nomeSubCentroCusto value for this Rateio.
     * 
     * @return nomeSubCentroCusto
     */
    public java.lang.String getNomeSubCentroCusto() {
        return nomeSubCentroCusto;
    }


    /**
     * Sets the nomeSubCentroCusto value for this Rateio.
     * 
     * @param nomeSubCentroCusto
     */
    public void setNomeSubCentroCusto(java.lang.String nomeSubCentroCusto) {
        this.nomeSubCentroCusto = nomeSubCentroCusto;
    }


    /**
     * Gets the descricaoCentroCusto value for this Rateio.
     * 
     * @return descricaoCentroCusto
     */
    public java.lang.String getDescricaoCentroCusto() {
        return descricaoCentroCusto;
    }


    /**
     * Sets the descricaoCentroCusto value for this Rateio.
     * 
     * @param descricaoCentroCusto
     */
    public void setDescricaoCentroCusto(java.lang.String descricaoCentroCusto) {
        this.descricaoCentroCusto = descricaoCentroCusto;
    }


    /**
     * Gets the descricaoSubCentroCusto value for this Rateio.
     * 
     * @return descricaoSubCentroCusto
     */
    public java.lang.String getDescricaoSubCentroCusto() {
        return descricaoSubCentroCusto;
    }


    /**
     * Sets the descricaoSubCentroCusto value for this Rateio.
     * 
     * @param descricaoSubCentroCusto
     */
    public void setDescricaoSubCentroCusto(java.lang.String descricaoSubCentroCusto) {
        this.descricaoSubCentroCusto = descricaoSubCentroCusto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rateio)) return false;
        Rateio other = (Rateio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nomeCentroCusto==null && other.getNomeCentroCusto()==null) || 
             (this.nomeCentroCusto!=null &&
              this.nomeCentroCusto.equals(other.getNomeCentroCusto()))) &&
            ((this.nomeRegional==null && other.getNomeRegional()==null) || 
             (this.nomeRegional!=null &&
              this.nomeRegional.equals(other.getNomeRegional()))) &&
            ((this.valorPorcentagem==null && other.getValorPorcentagem()==null) || 
             (this.valorPorcentagem!=null &&
              this.valorPorcentagem.equals(other.getValorPorcentagem()))) &&
            ((this.nomeSubCentroCusto==null && other.getNomeSubCentroCusto()==null) || 
             (this.nomeSubCentroCusto!=null &&
              this.nomeSubCentroCusto.equals(other.getNomeSubCentroCusto()))) &&
            ((this.descricaoCentroCusto==null && other.getDescricaoCentroCusto()==null) || 
             (this.descricaoCentroCusto!=null &&
              this.descricaoCentroCusto.equals(other.getDescricaoCentroCusto()))) &&
            ((this.descricaoSubCentroCusto==null && other.getDescricaoSubCentroCusto()==null) || 
             (this.descricaoSubCentroCusto!=null &&
              this.descricaoSubCentroCusto.equals(other.getDescricaoSubCentroCusto())));
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
        if (getNomeCentroCusto() != null) {
            _hashCode += getNomeCentroCusto().hashCode();
        }
        if (getNomeRegional() != null) {
            _hashCode += getNomeRegional().hashCode();
        }
        if (getValorPorcentagem() != null) {
            _hashCode += getValorPorcentagem().hashCode();
        }
        if (getNomeSubCentroCusto() != null) {
            _hashCode += getNomeSubCentroCusto().hashCode();
        }
        if (getDescricaoCentroCusto() != null) {
            _hashCode += getDescricaoCentroCusto().hashCode();
        }
        if (getDescricaoSubCentroCusto() != null) {
            _hashCode += getDescricaoSubCentroCusto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rateio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "rateio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCentroCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeCentroCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeRegional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeRegional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorPorcentagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorPorcentagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeSubCentroCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeSubCentroCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoCentroCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricaoCentroCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoSubCentroCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricaoSubCentroCusto"));
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
