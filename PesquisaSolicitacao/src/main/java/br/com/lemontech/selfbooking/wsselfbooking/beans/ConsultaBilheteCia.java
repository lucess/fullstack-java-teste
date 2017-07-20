/**
 * ConsultaBilheteCia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class ConsultaBilheteCia  implements java.io.Serializable {
    private java.lang.String localizador;

    private java.lang.String bilhete;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Source source;

    public ConsultaBilheteCia() {
    }

    public ConsultaBilheteCia(
           java.lang.String localizador,
           java.lang.String bilhete,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Source source) {
           this.localizador = localizador;
           this.bilhete = bilhete;
           this.source = source;
    }


    /**
     * Gets the localizador value for this ConsultaBilheteCia.
     * 
     * @return localizador
     */
    public java.lang.String getLocalizador() {
        return localizador;
    }


    /**
     * Sets the localizador value for this ConsultaBilheteCia.
     * 
     * @param localizador
     */
    public void setLocalizador(java.lang.String localizador) {
        this.localizador = localizador;
    }


    /**
     * Gets the bilhete value for this ConsultaBilheteCia.
     * 
     * @return bilhete
     */
    public java.lang.String getBilhete() {
        return bilhete;
    }


    /**
     * Sets the bilhete value for this ConsultaBilheteCia.
     * 
     * @param bilhete
     */
    public void setBilhete(java.lang.String bilhete) {
        this.bilhete = bilhete;
    }


    /**
     * Gets the source value for this ConsultaBilheteCia.
     * 
     * @return source
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Source getSource() {
        return source;
    }


    /**
     * Sets the source value for this ConsultaBilheteCia.
     * 
     * @param source
     */
    public void setSource(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Source source) {
        this.source = source;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaBilheteCia)) return false;
        ConsultaBilheteCia other = (ConsultaBilheteCia) obj;
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
            ((this.bilhete==null && other.getBilhete()==null) || 
             (this.bilhete!=null &&
              this.bilhete.equals(other.getBilhete()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource())));
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
        if (getBilhete() != null) {
            _hashCode += getBilhete().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaBilheteCia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "consultaBilheteCia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizador"));
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
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "source"));
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
