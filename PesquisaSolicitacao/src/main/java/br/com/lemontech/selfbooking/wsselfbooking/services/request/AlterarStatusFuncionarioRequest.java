/**
 * AlterarStatusFuncionarioRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class AlterarStatusFuncionarioRequest  implements java.io.Serializable {
    private boolean ativo;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef;

    private java.lang.String novaMatricula;

    private java.lang.String novoLogin;

    public AlterarStatusFuncionarioRequest() {
    }

    public AlterarStatusFuncionarioRequest(
           boolean ativo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef,
           java.lang.String novaMatricula,
           java.lang.String novoLogin) {
           this.ativo = ativo;
           this.funcionarioRef = funcionarioRef;
           this.novaMatricula = novaMatricula;
           this.novoLogin = novoLogin;
    }


    /**
     * Gets the ativo value for this AlterarStatusFuncionarioRequest.
     * 
     * @return ativo
     */
    public boolean isAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this AlterarStatusFuncionarioRequest.
     * 
     * @param ativo
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    /**
     * Gets the funcionarioRef value for this AlterarStatusFuncionarioRequest.
     * 
     * @return funcionarioRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getFuncionarioRef() {
        return funcionarioRef;
    }


    /**
     * Sets the funcionarioRef value for this AlterarStatusFuncionarioRequest.
     * 
     * @param funcionarioRef
     */
    public void setFuncionarioRef(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef) {
        this.funcionarioRef = funcionarioRef;
    }


    /**
     * Gets the novaMatricula value for this AlterarStatusFuncionarioRequest.
     * 
     * @return novaMatricula
     */
    public java.lang.String getNovaMatricula() {
        return novaMatricula;
    }


    /**
     * Sets the novaMatricula value for this AlterarStatusFuncionarioRequest.
     * 
     * @param novaMatricula
     */
    public void setNovaMatricula(java.lang.String novaMatricula) {
        this.novaMatricula = novaMatricula;
    }


    /**
     * Gets the novoLogin value for this AlterarStatusFuncionarioRequest.
     * 
     * @return novoLogin
     */
    public java.lang.String getNovoLogin() {
        return novoLogin;
    }


    /**
     * Sets the novoLogin value for this AlterarStatusFuncionarioRequest.
     * 
     * @param novoLogin
     */
    public void setNovoLogin(java.lang.String novoLogin) {
        this.novoLogin = novoLogin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlterarStatusFuncionarioRequest)) return false;
        AlterarStatusFuncionarioRequest other = (AlterarStatusFuncionarioRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ativo == other.isAtivo() &&
            ((this.funcionarioRef==null && other.getFuncionarioRef()==null) || 
             (this.funcionarioRef!=null &&
              this.funcionarioRef.equals(other.getFuncionarioRef()))) &&
            ((this.novaMatricula==null && other.getNovaMatricula()==null) || 
             (this.novaMatricula!=null &&
              this.novaMatricula.equals(other.getNovaMatricula()))) &&
            ((this.novoLogin==null && other.getNovoLogin()==null) || 
             (this.novoLogin!=null &&
              this.novoLogin.equals(other.getNovoLogin())));
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
        _hashCode += (isAtivo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFuncionarioRef() != null) {
            _hashCode += getFuncionarioRef().hashCode();
        }
        if (getNovaMatricula() != null) {
            _hashCode += getNovaMatricula().hashCode();
        }
        if (getNovoLogin() != null) {
            _hashCode += getNovoLogin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlterarStatusFuncionarioRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusFuncionarioRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionarioRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funcionarioRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("novaMatricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "novaMatricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("novoLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "novoLogin"));
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
