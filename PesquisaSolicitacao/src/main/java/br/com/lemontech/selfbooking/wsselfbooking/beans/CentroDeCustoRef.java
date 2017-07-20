/**
 * CentroDeCustoRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class CentroDeCustoRef  implements java.io.Serializable {
    /* Codigo do centro de custo. */
    private java.lang.String codigo;

    /* Regional que o centro de custo pertence. */
    private br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef regionalRef;

    public CentroDeCustoRef() {
    }

    public CentroDeCustoRef(
           java.lang.String codigo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef regionalRef) {
           this.codigo = codigo;
           this.regionalRef = regionalRef;
    }


    /**
     * Gets the codigo value for this CentroDeCustoRef.
     * 
     * @return codigo   * Codigo do centro de custo.
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this CentroDeCustoRef.
     * 
     * @param codigo   * Codigo do centro de custo.
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the regionalRef value for this CentroDeCustoRef.
     * 
     * @return regionalRef   * Regional que o centro de custo pertence.
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef getRegionalRef() {
        return regionalRef;
    }


    /**
     * Sets the regionalRef value for this CentroDeCustoRef.
     * 
     * @param regionalRef   * Regional que o centro de custo pertence.
     */
    public void setRegionalRef(br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef regionalRef) {
        this.regionalRef = regionalRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CentroDeCustoRef)) return false;
        CentroDeCustoRef other = (CentroDeCustoRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.regionalRef==null && other.getRegionalRef()==null) || 
             (this.regionalRef!=null &&
              this.regionalRef.equals(other.getRegionalRef())));
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
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getRegionalRef() != null) {
            _hashCode += getRegionalRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CentroDeCustoRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "centroDeCustoRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionalRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionalRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "regionalRef"));
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
