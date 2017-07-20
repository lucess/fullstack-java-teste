/**
 * AereoFinalizar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class AereoFinalizar  implements java.io.Serializable {
    private java.lang.String localizador;

    private java.lang.String codigoCia;

    private java.lang.String bilhete;

    private java.util.Calendar dataEmissao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamento;

    public AereoFinalizar() {
    }

    public AereoFinalizar(
           java.lang.String localizador,
           java.lang.String codigoCia,
           java.lang.String bilhete,
           java.util.Calendar dataEmissao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamento) {
           this.localizador = localizador;
           this.codigoCia = codigoCia;
           this.bilhete = bilhete;
           this.dataEmissao = dataEmissao;
           this.formaPagamento = formaPagamento;
    }


    /**
     * Gets the localizador value for this AereoFinalizar.
     * 
     * @return localizador
     */
    public java.lang.String getLocalizador() {
        return localizador;
    }


    /**
     * Sets the localizador value for this AereoFinalizar.
     * 
     * @param localizador
     */
    public void setLocalizador(java.lang.String localizador) {
        this.localizador = localizador;
    }


    /**
     * Gets the codigoCia value for this AereoFinalizar.
     * 
     * @return codigoCia
     */
    public java.lang.String getCodigoCia() {
        return codigoCia;
    }


    /**
     * Sets the codigoCia value for this AereoFinalizar.
     * 
     * @param codigoCia
     */
    public void setCodigoCia(java.lang.String codigoCia) {
        this.codigoCia = codigoCia;
    }


    /**
     * Gets the bilhete value for this AereoFinalizar.
     * 
     * @return bilhete
     */
    public java.lang.String getBilhete() {
        return bilhete;
    }


    /**
     * Sets the bilhete value for this AereoFinalizar.
     * 
     * @param bilhete
     */
    public void setBilhete(java.lang.String bilhete) {
        this.bilhete = bilhete;
    }


    /**
     * Gets the dataEmissao value for this AereoFinalizar.
     * 
     * @return dataEmissao
     */
    public java.util.Calendar getDataEmissao() {
        return dataEmissao;
    }


    /**
     * Sets the dataEmissao value for this AereoFinalizar.
     * 
     * @param dataEmissao
     */
    public void setDataEmissao(java.util.Calendar dataEmissao) {
        this.dataEmissao = dataEmissao;
    }


    /**
     * Gets the formaPagamento value for this AereoFinalizar.
     * 
     * @return formaPagamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }


    /**
     * Sets the formaPagamento value for this AereoFinalizar.
     * 
     * @param formaPagamento
     */
    public void setFormaPagamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AereoFinalizar)) return false;
        AereoFinalizar other = (AereoFinalizar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.localizador==null && other.getLocalizador()==null) || 
             (this.localizador!=null &&
              this.localizador.equals(other.getLocalizador()))) &&
            ((this.codigoCia==null && other.getCodigoCia()==null) || 
             (this.codigoCia!=null &&
              this.codigoCia.equals(other.getCodigoCia()))) &&
            ((this.bilhete==null && other.getBilhete()==null) || 
             (this.bilhete!=null &&
              this.bilhete.equals(other.getBilhete()))) &&
            ((this.dataEmissao==null && other.getDataEmissao()==null) || 
             (this.dataEmissao!=null &&
              this.dataEmissao.equals(other.getDataEmissao()))) &&
            ((this.formaPagamento==null && other.getFormaPagamento()==null) || 
             (this.formaPagamento!=null &&
              this.formaPagamento.equals(other.getFormaPagamento())));
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
        if (getLocalizador() != null) {
            _hashCode += getLocalizador().hashCode();
        }
        if (getCodigoCia() != null) {
            _hashCode += getCodigoCia().hashCode();
        }
        if (getBilhete() != null) {
            _hashCode += getBilhete().hashCode();
        }
        if (getDataEmissao() != null) {
            _hashCode += getDataEmissao().hashCode();
        }
        if (getFormaPagamento() != null) {
            _hashCode += getFormaPagamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AereoFinalizar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "aereoFinalizar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bilhete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bilhete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataEmissao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataEmissao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formaPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "formaPagamento"));
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
