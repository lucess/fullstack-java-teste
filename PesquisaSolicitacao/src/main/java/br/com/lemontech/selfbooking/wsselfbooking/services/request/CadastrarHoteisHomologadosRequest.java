/**
 * CadastrarHoteisHomologadosRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class CadastrarHoteisHomologadosRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.CadastrarHoteisHomologados cadastrarHoteisHomologados;

    public CadastrarHoteisHomologadosRequest() {
    }

    public CadastrarHoteisHomologadosRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.CadastrarHoteisHomologados cadastrarHoteisHomologados) {
           this.cadastrarHoteisHomologados = cadastrarHoteisHomologados;
    }


    /**
     * Gets the cadastrarHoteisHomologados value for this CadastrarHoteisHomologadosRequest.
     * 
     * @return cadastrarHoteisHomologados
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.CadastrarHoteisHomologados getCadastrarHoteisHomologados() {
        return cadastrarHoteisHomologados;
    }


    /**
     * Sets the cadastrarHoteisHomologados value for this CadastrarHoteisHomologadosRequest.
     * 
     * @param cadastrarHoteisHomologados
     */
    public void setCadastrarHoteisHomologados(br.com.lemontech.selfbooking.wsselfbooking.beans.CadastrarHoteisHomologados cadastrarHoteisHomologados) {
        this.cadastrarHoteisHomologados = cadastrarHoteisHomologados;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarHoteisHomologadosRequest)) return false;
        CadastrarHoteisHomologadosRequest other = (CadastrarHoteisHomologadosRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cadastrarHoteisHomologados==null && other.getCadastrarHoteisHomologados()==null) || 
             (this.cadastrarHoteisHomologados!=null &&
              this.cadastrarHoteisHomologados.equals(other.getCadastrarHoteisHomologados())));
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
        if (getCadastrarHoteisHomologados() != null) {
            _hashCode += getCadastrarHoteisHomologados().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarHoteisHomologadosRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarHoteisHomologadosRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cadastrarHoteisHomologados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cadastrarHoteisHomologados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "cadastrarHoteisHomologados"));
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
