/**
 * CadastrarSubCentroDeCustoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class CadastrarSubCentroDeCustoRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCusto subCentroDeCusto;

    public CadastrarSubCentroDeCustoRequest() {
    }

    public CadastrarSubCentroDeCustoRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCusto subCentroDeCusto) {
           this.subCentroDeCusto = subCentroDeCusto;
    }


    /**
     * Gets the subCentroDeCusto value for this CadastrarSubCentroDeCustoRequest.
     * 
     * @return subCentroDeCusto
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCusto getSubCentroDeCusto() {
        return subCentroDeCusto;
    }


    /**
     * Sets the subCentroDeCusto value for this CadastrarSubCentroDeCustoRequest.
     * 
     * @param subCentroDeCusto
     */
    public void setSubCentroDeCusto(br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCusto subCentroDeCusto) {
        this.subCentroDeCusto = subCentroDeCusto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarSubCentroDeCustoRequest)) return false;
        CadastrarSubCentroDeCustoRequest other = (CadastrarSubCentroDeCustoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subCentroDeCusto==null && other.getSubCentroDeCusto()==null) || 
             (this.subCentroDeCusto!=null &&
              this.subCentroDeCusto.equals(other.getSubCentroDeCusto())));
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
        if (getSubCentroDeCusto() != null) {
            _hashCode += getSubCentroDeCusto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarSubCentroDeCustoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarSubCentroDeCustoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCentroDeCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subCentroDeCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "subCentroDeCusto"));
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
