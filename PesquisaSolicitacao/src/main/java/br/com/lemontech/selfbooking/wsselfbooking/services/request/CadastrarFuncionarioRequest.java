/**
 * CadastrarFuncionarioRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class CadastrarFuncionarioRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.Funcionario funcionario;

    public CadastrarFuncionarioRequest() {
    }

    public CadastrarFuncionarioRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.Funcionario funcionario) {
           this.funcionario = funcionario;
    }


    /**
     * Gets the funcionario value for this CadastrarFuncionarioRequest.
     * 
     * @return funcionario
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Funcionario getFuncionario() {
        return funcionario;
    }


    /**
     * Sets the funcionario value for this CadastrarFuncionarioRequest.
     * 
     * @param funcionario
     */
    public void setFuncionario(br.com.lemontech.selfbooking.wsselfbooking.beans.Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarFuncionarioRequest)) return false;
        CadastrarFuncionarioRequest other = (CadastrarFuncionarioRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.funcionario==null && other.getFuncionario()==null) || 
             (this.funcionario!=null &&
              this.funcionario.equals(other.getFuncionario())));
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
        if (getFuncionario() != null) {
            _hashCode += getFuncionario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarFuncionarioRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarFuncionarioRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funcionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionario"));
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
