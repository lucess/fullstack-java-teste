/**
 * FornecedorRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor;

public class FornecedorRef  implements java.io.Serializable {
    private java.lang.String identificadorBackofficeFornecedor;

    public FornecedorRef() {
    }

    public FornecedorRef(
           java.lang.String identificadorBackofficeFornecedor) {
           this.identificadorBackofficeFornecedor = identificadorBackofficeFornecedor;
    }


    /**
     * Gets the identificadorBackofficeFornecedor value for this FornecedorRef.
     * 
     * @return identificadorBackofficeFornecedor
     */
    public java.lang.String getIdentificadorBackofficeFornecedor() {
        return identificadorBackofficeFornecedor;
    }


    /**
     * Sets the identificadorBackofficeFornecedor value for this FornecedorRef.
     * 
     * @param identificadorBackofficeFornecedor
     */
    public void setIdentificadorBackofficeFornecedor(java.lang.String identificadorBackofficeFornecedor) {
        this.identificadorBackofficeFornecedor = identificadorBackofficeFornecedor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FornecedorRef)) return false;
        FornecedorRef other = (FornecedorRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificadorBackofficeFornecedor==null && other.getIdentificadorBackofficeFornecedor()==null) || 
             (this.identificadorBackofficeFornecedor!=null &&
              this.identificadorBackofficeFornecedor.equals(other.getIdentificadorBackofficeFornecedor())));
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
        if (getIdentificadorBackofficeFornecedor() != null) {
            _hashCode += getIdentificadorBackofficeFornecedor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FornecedorRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "fornecedorRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorBackofficeFornecedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorBackofficeFornecedor"));
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
