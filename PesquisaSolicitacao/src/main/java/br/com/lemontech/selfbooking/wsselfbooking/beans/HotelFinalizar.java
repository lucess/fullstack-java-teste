/**
 * HotelFinalizar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class HotelFinalizar  implements java.io.Serializable {
    private java.lang.String localizador;

    private java.lang.String controleAgencia;

    private java.lang.String codigoFornecedor;

    private java.lang.String codigoConfirmacao;

    private java.util.Calendar dataConfirmacao;

    public HotelFinalizar() {
    }

    public HotelFinalizar(
           java.lang.String localizador,
           java.lang.String controleAgencia,
           java.lang.String codigoFornecedor,
           java.lang.String codigoConfirmacao,
           java.util.Calendar dataConfirmacao) {
           this.localizador = localizador;
           this.controleAgencia = controleAgencia;
           this.codigoFornecedor = codigoFornecedor;
           this.codigoConfirmacao = codigoConfirmacao;
           this.dataConfirmacao = dataConfirmacao;
    }


    /**
     * Gets the localizador value for this HotelFinalizar.
     * 
     * @return localizador
     */
    public java.lang.String getLocalizador() {
        return localizador;
    }


    /**
     * Sets the localizador value for this HotelFinalizar.
     * 
     * @param localizador
     */
    public void setLocalizador(java.lang.String localizador) {
        this.localizador = localizador;
    }


    /**
     * Gets the controleAgencia value for this HotelFinalizar.
     * 
     * @return controleAgencia
     */
    public java.lang.String getControleAgencia() {
        return controleAgencia;
    }


    /**
     * Sets the controleAgencia value for this HotelFinalizar.
     * 
     * @param controleAgencia
     */
    public void setControleAgencia(java.lang.String controleAgencia) {
        this.controleAgencia = controleAgencia;
    }


    /**
     * Gets the codigoFornecedor value for this HotelFinalizar.
     * 
     * @return codigoFornecedor
     */
    public java.lang.String getCodigoFornecedor() {
        return codigoFornecedor;
    }


    /**
     * Sets the codigoFornecedor value for this HotelFinalizar.
     * 
     * @param codigoFornecedor
     */
    public void setCodigoFornecedor(java.lang.String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }


    /**
     * Gets the codigoConfirmacao value for this HotelFinalizar.
     * 
     * @return codigoConfirmacao
     */
    public java.lang.String getCodigoConfirmacao() {
        return codigoConfirmacao;
    }


    /**
     * Sets the codigoConfirmacao value for this HotelFinalizar.
     * 
     * @param codigoConfirmacao
     */
    public void setCodigoConfirmacao(java.lang.String codigoConfirmacao) {
        this.codigoConfirmacao = codigoConfirmacao;
    }


    /**
     * Gets the dataConfirmacao value for this HotelFinalizar.
     * 
     * @return dataConfirmacao
     */
    public java.util.Calendar getDataConfirmacao() {
        return dataConfirmacao;
    }


    /**
     * Sets the dataConfirmacao value for this HotelFinalizar.
     * 
     * @param dataConfirmacao
     */
    public void setDataConfirmacao(java.util.Calendar dataConfirmacao) {
        this.dataConfirmacao = dataConfirmacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HotelFinalizar)) return false;
        HotelFinalizar other = (HotelFinalizar) obj;
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
            ((this.controleAgencia==null && other.getControleAgencia()==null) || 
             (this.controleAgencia!=null &&
              this.controleAgencia.equals(other.getControleAgencia()))) &&
            ((this.codigoFornecedor==null && other.getCodigoFornecedor()==null) || 
             (this.codigoFornecedor!=null &&
              this.codigoFornecedor.equals(other.getCodigoFornecedor()))) &&
            ((this.codigoConfirmacao==null && other.getCodigoConfirmacao()==null) || 
             (this.codigoConfirmacao!=null &&
              this.codigoConfirmacao.equals(other.getCodigoConfirmacao()))) &&
            ((this.dataConfirmacao==null && other.getDataConfirmacao()==null) || 
             (this.dataConfirmacao!=null &&
              this.dataConfirmacao.equals(other.getDataConfirmacao())));
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
        if (getControleAgencia() != null) {
            _hashCode += getControleAgencia().hashCode();
        }
        if (getCodigoFornecedor() != null) {
            _hashCode += getCodigoFornecedor().hashCode();
        }
        if (getCodigoConfirmacao() != null) {
            _hashCode += getCodigoConfirmacao().hashCode();
        }
        if (getDataConfirmacao() != null) {
            _hashCode += getDataConfirmacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HotelFinalizar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "hotelFinalizar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controleAgencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controleAgencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoFornecedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoFornecedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoConfirmacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoConfirmacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataConfirmacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataConfirmacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
