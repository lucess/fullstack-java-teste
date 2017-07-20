/**
 * ParametrizacaoCentroDeCustoDebitoRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class ParametrizacaoCentroDeCustoDebitoRef  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef;

    public ParametrizacaoCentroDeCustoDebitoRef() {
    }

    public ParametrizacaoCentroDeCustoDebitoRef(
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef) {
           this.funcionarioRef = funcionarioRef;
           this.centroDeCustoRef = centroDeCustoRef;
           this.subCentroDeCustoRef = subCentroDeCustoRef;
    }


    /**
     * Gets the funcionarioRef value for this ParametrizacaoCentroDeCustoDebitoRef.
     * 
     * @return funcionarioRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getFuncionarioRef() {
        return funcionarioRef;
    }


    /**
     * Sets the funcionarioRef value for this ParametrizacaoCentroDeCustoDebitoRef.
     * 
     * @param funcionarioRef
     */
    public void setFuncionarioRef(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef) {
        this.funcionarioRef = funcionarioRef;
    }


    /**
     * Gets the centroDeCustoRef value for this ParametrizacaoCentroDeCustoDebitoRef.
     * 
     * @return centroDeCustoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }


    /**
     * Sets the centroDeCustoRef value for this ParametrizacaoCentroDeCustoDebitoRef.
     * 
     * @param centroDeCustoRef
     */
    public void setCentroDeCustoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef) {
        this.centroDeCustoRef = centroDeCustoRef;
    }


    /**
     * Gets the subCentroDeCustoRef value for this ParametrizacaoCentroDeCustoDebitoRef.
     * 
     * @return subCentroDeCustoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef getSubCentroDeCustoRef() {
        return subCentroDeCustoRef;
    }


    /**
     * Sets the subCentroDeCustoRef value for this ParametrizacaoCentroDeCustoDebitoRef.
     * 
     * @param subCentroDeCustoRef
     */
    public void setSubCentroDeCustoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef) {
        this.subCentroDeCustoRef = subCentroDeCustoRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametrizacaoCentroDeCustoDebitoRef)) return false;
        ParametrizacaoCentroDeCustoDebitoRef other = (ParametrizacaoCentroDeCustoDebitoRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.funcionarioRef==null && other.getFuncionarioRef()==null) || 
             (this.funcionarioRef!=null &&
              this.funcionarioRef.equals(other.getFuncionarioRef()))) &&
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
        if (getFuncionarioRef() != null) {
            _hashCode += getFuncionarioRef().hashCode();
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
        new org.apache.axis.description.TypeDesc(ParametrizacaoCentroDeCustoDebitoRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoDebitoRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionarioRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funcionarioRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
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
