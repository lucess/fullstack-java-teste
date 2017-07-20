/**
 * AereoDetalheBaseTarifa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

public class AereoDetalheBaseTarifa  implements java.io.Serializable {
    private java.lang.String baseTarifaria;

    private java.lang.String classeTarifaria;

    public AereoDetalheBaseTarifa() {
    }

    public AereoDetalheBaseTarifa(
           java.lang.String baseTarifaria,
           java.lang.String classeTarifaria) {
           this.baseTarifaria = baseTarifaria;
           this.classeTarifaria = classeTarifaria;
    }


    /**
     * Gets the baseTarifaria value for this AereoDetalheBaseTarifa.
     * 
     * @return baseTarifaria
     */
    public java.lang.String getBaseTarifaria() {
        return baseTarifaria;
    }


    /**
     * Sets the baseTarifaria value for this AereoDetalheBaseTarifa.
     * 
     * @param baseTarifaria
     */
    public void setBaseTarifaria(java.lang.String baseTarifaria) {
        this.baseTarifaria = baseTarifaria;
    }


    /**
     * Gets the classeTarifaria value for this AereoDetalheBaseTarifa.
     * 
     * @return classeTarifaria
     */
    public java.lang.String getClasseTarifaria() {
        return classeTarifaria;
    }


    /**
     * Sets the classeTarifaria value for this AereoDetalheBaseTarifa.
     * 
     * @param classeTarifaria
     */
    public void setClasseTarifaria(java.lang.String classeTarifaria) {
        this.classeTarifaria = classeTarifaria;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AereoDetalheBaseTarifa)) return false;
        AereoDetalheBaseTarifa other = (AereoDetalheBaseTarifa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseTarifaria==null && other.getBaseTarifaria()==null) || 
             (this.baseTarifaria!=null &&
              this.baseTarifaria.equals(other.getBaseTarifaria()))) &&
            ((this.classeTarifaria==null && other.getClasseTarifaria()==null) || 
             (this.classeTarifaria!=null &&
              this.classeTarifaria.equals(other.getClasseTarifaria())));
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
        if (getBaseTarifaria() != null) {
            _hashCode += getBaseTarifaria().hashCode();
        }
        if (getClasseTarifaria() != null) {
            _hashCode += getClasseTarifaria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AereoDetalheBaseTarifa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoDetalheBaseTarifa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseTarifaria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "baseTarifaria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classeTarifaria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classeTarifaria"));
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
