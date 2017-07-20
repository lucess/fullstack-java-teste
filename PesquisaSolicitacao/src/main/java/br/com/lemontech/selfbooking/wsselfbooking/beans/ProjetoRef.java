/**
 * ProjetoRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class ProjetoRef  implements java.io.Serializable {
    private java.lang.String codigo;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef;

    public ProjetoRef() {
    }

    public ProjetoRef(
           java.lang.String codigo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef) {
           this.codigo = codigo;
           this.centroDeCustoRef = centroDeCustoRef;
           this.subCentroDeCustoRef = subCentroDeCustoRef;
    }


    /**
     * Gets the codigo value for this ProjetoRef.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this ProjetoRef.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the centroDeCustoRef value for this ProjetoRef.
     * 
     * @return centroDeCustoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }


    /**
     * Sets the centroDeCustoRef value for this ProjetoRef.
     * 
     * @param centroDeCustoRef
     */
    public void setCentroDeCustoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef) {
        this.centroDeCustoRef = centroDeCustoRef;
    }


    /**
     * Gets the subCentroDeCustoRef value for this ProjetoRef.
     * 
     * @return subCentroDeCustoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef getSubCentroDeCustoRef() {
        return subCentroDeCustoRef;
    }


    /**
     * Sets the subCentroDeCustoRef value for this ProjetoRef.
     * 
     * @param subCentroDeCustoRef
     */
    public void setSubCentroDeCustoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef) {
        this.subCentroDeCustoRef = subCentroDeCustoRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjetoRef)) return false;
        ProjetoRef other = (ProjetoRef) obj;
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
            ((this.centroDeCustoRef==null && other.getCentroDeCustoRef()==null) || 
             (this.centroDeCustoRef!=null &&
              this.centroDeCustoRef.equals(other.getCentroDeCustoRef()))) &&
            ((this.subCentroDeCustoRef==null && other.getSubCentroDeCustoRef()==null) || 
             (this.subCentroDeCustoRef!=null &&
              this.subCentroDeCustoRef.equals(other.getSubCentroDeCustoRef())));
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
        if (getCentroDeCustoRef() != null) {
            _hashCode += getCentroDeCustoRef().hashCode();
        }
        if (getSubCentroDeCustoRef() != null) {
            _hashCode += getSubCentroDeCustoRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjetoRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "projetoRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroDeCustoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "centroDeCustoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "centroDeCustoRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCentroDeCustoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subCentroDeCustoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "subCentroDeCustoRef"));
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
