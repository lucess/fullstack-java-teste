/**
 * CadastrarCentroDeCustoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class CadastrarCentroDeCustoRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCusto centroDeCusto;

    public CadastrarCentroDeCustoRequest() {
    }

    public CadastrarCentroDeCustoRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCusto centroDeCusto) {
           this.centroDeCusto = centroDeCusto;
    }


    /**
     * Gets the centroDeCusto value for this CadastrarCentroDeCustoRequest.
     * 
     * @return centroDeCusto
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCusto getCentroDeCusto() {
        return centroDeCusto;
    }


    /**
     * Sets the centroDeCusto value for this CadastrarCentroDeCustoRequest.
     * 
     * @param centroDeCusto
     */
    public void setCentroDeCusto(br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCusto centroDeCusto) {
        this.centroDeCusto = centroDeCusto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarCentroDeCustoRequest)) return false;
        CadastrarCentroDeCustoRequest other = (CadastrarCentroDeCustoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.centroDeCusto==null && other.getCentroDeCusto()==null) || 
             (this.centroDeCusto!=null &&
              this.centroDeCusto.equals(other.getCentroDeCusto())));
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
        if (getCentroDeCusto() != null) {
            _hashCode += getCentroDeCusto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarCentroDeCustoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarCentroDeCustoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroDeCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "centroDeCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "centroDeCusto"));
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
