/**
 * Deslocamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class Deslocamento  implements java.io.Serializable {
    private java.lang.String latitudeOrigem;

    private java.lang.String longitudeOrigem;

    private java.lang.String latitudeDestino;

    private java.lang.String longitudeDestino;

    private double distanciaPercorrida;

    public Deslocamento() {
    }

    public Deslocamento(
           java.lang.String latitudeOrigem,
           java.lang.String longitudeOrigem,
           java.lang.String latitudeDestino,
           java.lang.String longitudeDestino,
           double distanciaPercorrida) {
           this.latitudeOrigem = latitudeOrigem;
           this.longitudeOrigem = longitudeOrigem;
           this.latitudeDestino = latitudeDestino;
           this.longitudeDestino = longitudeDestino;
           this.distanciaPercorrida = distanciaPercorrida;
    }


    /**
     * Gets the latitudeOrigem value for this Deslocamento.
     * 
     * @return latitudeOrigem
     */
    public java.lang.String getLatitudeOrigem() {
        return latitudeOrigem;
    }


    /**
     * Sets the latitudeOrigem value for this Deslocamento.
     * 
     * @param latitudeOrigem
     */
    public void setLatitudeOrigem(java.lang.String latitudeOrigem) {
        this.latitudeOrigem = latitudeOrigem;
    }


    /**
     * Gets the longitudeOrigem value for this Deslocamento.
     * 
     * @return longitudeOrigem
     */
    public java.lang.String getLongitudeOrigem() {
        return longitudeOrigem;
    }


    /**
     * Sets the longitudeOrigem value for this Deslocamento.
     * 
     * @param longitudeOrigem
     */
    public void setLongitudeOrigem(java.lang.String longitudeOrigem) {
        this.longitudeOrigem = longitudeOrigem;
    }


    /**
     * Gets the latitudeDestino value for this Deslocamento.
     * 
     * @return latitudeDestino
     */
    public java.lang.String getLatitudeDestino() {
        return latitudeDestino;
    }


    /**
     * Sets the latitudeDestino value for this Deslocamento.
     * 
     * @param latitudeDestino
     */
    public void setLatitudeDestino(java.lang.String latitudeDestino) {
        this.latitudeDestino = latitudeDestino;
    }


    /**
     * Gets the longitudeDestino value for this Deslocamento.
     * 
     * @return longitudeDestino
     */
    public java.lang.String getLongitudeDestino() {
        return longitudeDestino;
    }


    /**
     * Sets the longitudeDestino value for this Deslocamento.
     * 
     * @param longitudeDestino
     */
    public void setLongitudeDestino(java.lang.String longitudeDestino) {
        this.longitudeDestino = longitudeDestino;
    }


    /**
     * Gets the distanciaPercorrida value for this Deslocamento.
     * 
     * @return distanciaPercorrida
     */
    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }


    /**
     * Sets the distanciaPercorrida value for this Deslocamento.
     * 
     * @param distanciaPercorrida
     */
    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Deslocamento)) return false;
        Deslocamento other = (Deslocamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.latitudeOrigem==null && other.getLatitudeOrigem()==null) || 
             (this.latitudeOrigem!=null &&
              this.latitudeOrigem.equals(other.getLatitudeOrigem()))) &&
            ((this.longitudeOrigem==null && other.getLongitudeOrigem()==null) || 
             (this.longitudeOrigem!=null &&
              this.longitudeOrigem.equals(other.getLongitudeOrigem()))) &&
            ((this.latitudeDestino==null && other.getLatitudeDestino()==null) || 
             (this.latitudeDestino!=null &&
              this.latitudeDestino.equals(other.getLatitudeDestino()))) &&
            ((this.longitudeDestino==null && other.getLongitudeDestino()==null) || 
             (this.longitudeDestino!=null &&
              this.longitudeDestino.equals(other.getLongitudeDestino()))) &&
            this.distanciaPercorrida == other.getDistanciaPercorrida();
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
        if (getLatitudeOrigem() != null) {
            _hashCode += getLatitudeOrigem().hashCode();
        }
        if (getLongitudeOrigem() != null) {
            _hashCode += getLongitudeOrigem().hashCode();
        }
        if (getLatitudeDestino() != null) {
            _hashCode += getLatitudeDestino().hashCode();
        }
        if (getLongitudeDestino() != null) {
            _hashCode += getLongitudeDestino().hashCode();
        }
        _hashCode += new Double(getDistanciaPercorrida()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Deslocamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "deslocamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitudeOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "latitudeOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitudeOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "longitudeOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitudeDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "latitudeDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitudeDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "longitudeDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distanciaPercorrida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distanciaPercorrida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
