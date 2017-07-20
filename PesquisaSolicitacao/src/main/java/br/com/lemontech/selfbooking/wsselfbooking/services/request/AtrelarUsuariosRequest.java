/**
 * AtrelarUsuariosRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class AtrelarUsuariosRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef principal;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef secundario;

    private boolean acessoLogas;

    private boolean acessoExpense;

    public AtrelarUsuariosRequest() {
    }

    public AtrelarUsuariosRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef principal,
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef secundario,
           boolean acessoLogas,
           boolean acessoExpense) {
           this.principal = principal;
           this.secundario = secundario;
           this.acessoLogas = acessoLogas;
           this.acessoExpense = acessoExpense;
    }


    /**
     * Gets the principal value for this AtrelarUsuariosRequest.
     * 
     * @return principal
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getPrincipal() {
        return principal;
    }


    /**
     * Sets the principal value for this AtrelarUsuariosRequest.
     * 
     * @param principal
     */
    public void setPrincipal(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef principal) {
        this.principal = principal;
    }


    /**
     * Gets the secundario value for this AtrelarUsuariosRequest.
     * 
     * @return secundario
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getSecundario() {
        return secundario;
    }


    /**
     * Sets the secundario value for this AtrelarUsuariosRequest.
     * 
     * @param secundario
     */
    public void setSecundario(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef secundario) {
        this.secundario = secundario;
    }


    /**
     * Gets the acessoLogas value for this AtrelarUsuariosRequest.
     * 
     * @return acessoLogas
     */
    public boolean isAcessoLogas() {
        return acessoLogas;
    }


    /**
     * Sets the acessoLogas value for this AtrelarUsuariosRequest.
     * 
     * @param acessoLogas
     */
    public void setAcessoLogas(boolean acessoLogas) {
        this.acessoLogas = acessoLogas;
    }


    /**
     * Gets the acessoExpense value for this AtrelarUsuariosRequest.
     * 
     * @return acessoExpense
     */
    public boolean isAcessoExpense() {
        return acessoExpense;
    }


    /**
     * Sets the acessoExpense value for this AtrelarUsuariosRequest.
     * 
     * @param acessoExpense
     */
    public void setAcessoExpense(boolean acessoExpense) {
        this.acessoExpense = acessoExpense;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtrelarUsuariosRequest)) return false;
        AtrelarUsuariosRequest other = (AtrelarUsuariosRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.principal==null && other.getPrincipal()==null) || 
             (this.principal!=null &&
              this.principal.equals(other.getPrincipal()))) &&
            ((this.secundario==null && other.getSecundario()==null) || 
             (this.secundario!=null &&
              this.secundario.equals(other.getSecundario()))) &&
            this.acessoLogas == other.isAcessoLogas() &&
            this.acessoExpense == other.isAcessoExpense();
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
        if (getPrincipal() != null) {
            _hashCode += getPrincipal().hashCode();
        }
        if (getSecundario() != null) {
            _hashCode += getSecundario().hashCode();
        }
        _hashCode += (isAcessoLogas() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAcessoExpense() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtrelarUsuariosRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "atrelarUsuariosRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("principal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "principal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secundario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secundario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acessoLogas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acessoLogas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acessoExpense");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acessoExpense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
