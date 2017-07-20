/**
 * ConfiguracaoCentroDeCusto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class ConfiguracaoCentroDeCusto  implements java.io.Serializable {
    /* Centro de custo auto aprovavel. */
    private boolean autoAprovavel;

    /* Permite debitar budget */
    private java.lang.Boolean debitaBudget;

    public ConfiguracaoCentroDeCusto() {
    }

    public ConfiguracaoCentroDeCusto(
           boolean autoAprovavel,
           java.lang.Boolean debitaBudget) {
           this.autoAprovavel = autoAprovavel;
           this.debitaBudget = debitaBudget;
    }


    /**
     * Gets the autoAprovavel value for this ConfiguracaoCentroDeCusto.
     * 
     * @return autoAprovavel   * Centro de custo auto aprovavel.
     */
    public boolean isAutoAprovavel() {
        return autoAprovavel;
    }


    /**
     * Sets the autoAprovavel value for this ConfiguracaoCentroDeCusto.
     * 
     * @param autoAprovavel   * Centro de custo auto aprovavel.
     */
    public void setAutoAprovavel(boolean autoAprovavel) {
        this.autoAprovavel = autoAprovavel;
    }


    /**
     * Gets the debitaBudget value for this ConfiguracaoCentroDeCusto.
     * 
     * @return debitaBudget   * Permite debitar budget
     */
    public java.lang.Boolean getDebitaBudget() {
        return debitaBudget;
    }


    /**
     * Sets the debitaBudget value for this ConfiguracaoCentroDeCusto.
     * 
     * @param debitaBudget   * Permite debitar budget
     */
    public void setDebitaBudget(java.lang.Boolean debitaBudget) {
        this.debitaBudget = debitaBudget;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfiguracaoCentroDeCusto)) return false;
        ConfiguracaoCentroDeCusto other = (ConfiguracaoCentroDeCusto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.autoAprovavel == other.isAutoAprovavel() &&
            ((this.debitaBudget==null && other.getDebitaBudget()==null) || 
             (this.debitaBudget!=null &&
              this.debitaBudget.equals(other.getDebitaBudget())));
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
        _hashCode += (isAutoAprovavel() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDebitaBudget() != null) {
            _hashCode += getDebitaBudget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfiguracaoCentroDeCusto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "configuracaoCentroDeCusto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAprovavel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoAprovavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitaBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "debitaBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
