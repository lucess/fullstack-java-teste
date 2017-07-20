/**
 * CarroFinalizar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class CarroFinalizar  implements java.io.Serializable {
    private java.lang.String localizador;

    private java.lang.String codigoFornecedor;

    private java.lang.String codigoReserva;

    public CarroFinalizar() {
    }

    public CarroFinalizar(
           java.lang.String localizador,
           java.lang.String codigoFornecedor,
           java.lang.String codigoReserva) {
           this.localizador = localizador;
           this.codigoFornecedor = codigoFornecedor;
           this.codigoReserva = codigoReserva;
    }


    /**
     * Gets the localizador value for this CarroFinalizar.
     * 
     * @return localizador
     */
    public java.lang.String getLocalizador() {
        return localizador;
    }


    /**
     * Sets the localizador value for this CarroFinalizar.
     * 
     * @param localizador
     */
    public void setLocalizador(java.lang.String localizador) {
        this.localizador = localizador;
    }


    /**
     * Gets the codigoFornecedor value for this CarroFinalizar.
     * 
     * @return codigoFornecedor
     */
    public java.lang.String getCodigoFornecedor() {
        return codigoFornecedor;
    }


    /**
     * Sets the codigoFornecedor value for this CarroFinalizar.
     * 
     * @param codigoFornecedor
     */
    public void setCodigoFornecedor(java.lang.String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }


    /**
     * Gets the codigoReserva value for this CarroFinalizar.
     * 
     * @return codigoReserva
     */
    public java.lang.String getCodigoReserva() {
        return codigoReserva;
    }


    /**
     * Sets the codigoReserva value for this CarroFinalizar.
     * 
     * @param codigoReserva
     */
    public void setCodigoReserva(java.lang.String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarroFinalizar)) return false;
        CarroFinalizar other = (CarroFinalizar) obj;
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
            ((this.codigoFornecedor==null && other.getCodigoFornecedor()==null) || 
             (this.codigoFornecedor!=null &&
              this.codigoFornecedor.equals(other.getCodigoFornecedor()))) &&
            ((this.codigoReserva==null && other.getCodigoReserva()==null) || 
             (this.codigoReserva!=null &&
              this.codigoReserva.equals(other.getCodigoReserva())));
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
        if (getCodigoFornecedor() != null) {
            _hashCode += getCodigoFornecedor().hashCode();
        }
        if (getCodigoReserva() != null) {
            _hashCode += getCodigoReserva().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarroFinalizar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "carroFinalizar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizador"));
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
        elemField.setFieldName("codigoReserva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoReserva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
