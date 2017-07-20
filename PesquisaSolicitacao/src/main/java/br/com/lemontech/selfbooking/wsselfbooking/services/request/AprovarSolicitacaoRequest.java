/**
 * AprovarSolicitacaoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class AprovarSolicitacaoRequest  implements java.io.Serializable {
    private int idSolicitacaoRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef aprovador;

    private java.lang.String controleCliente;

    public AprovarSolicitacaoRequest() {
    }

    public AprovarSolicitacaoRequest(
           int idSolicitacaoRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef aprovador,
           java.lang.String controleCliente) {
           this.idSolicitacaoRef = idSolicitacaoRef;
           this.aprovador = aprovador;
           this.controleCliente = controleCliente;
    }


    /**
     * Gets the idSolicitacaoRef value for this AprovarSolicitacaoRequest.
     * 
     * @return idSolicitacaoRef
     */
    public int getIdSolicitacaoRef() {
        return idSolicitacaoRef;
    }


    /**
     * Sets the idSolicitacaoRef value for this AprovarSolicitacaoRequest.
     * 
     * @param idSolicitacaoRef
     */
    public void setIdSolicitacaoRef(int idSolicitacaoRef) {
        this.idSolicitacaoRef = idSolicitacaoRef;
    }


    /**
     * Gets the aprovador value for this AprovarSolicitacaoRequest.
     * 
     * @return aprovador
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getAprovador() {
        return aprovador;
    }


    /**
     * Sets the aprovador value for this AprovarSolicitacaoRequest.
     * 
     * @param aprovador
     */
    public void setAprovador(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef aprovador) {
        this.aprovador = aprovador;
    }


    /**
     * Gets the controleCliente value for this AprovarSolicitacaoRequest.
     * 
     * @return controleCliente
     */
    public java.lang.String getControleCliente() {
        return controleCliente;
    }


    /**
     * Sets the controleCliente value for this AprovarSolicitacaoRequest.
     * 
     * @param controleCliente
     */
    public void setControleCliente(java.lang.String controleCliente) {
        this.controleCliente = controleCliente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AprovarSolicitacaoRequest)) return false;
        AprovarSolicitacaoRequest other = (AprovarSolicitacaoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idSolicitacaoRef == other.getIdSolicitacaoRef() &&
            ((this.aprovador==null && other.getAprovador()==null) || 
             (this.aprovador!=null &&
              this.aprovador.equals(other.getAprovador()))) &&
            ((this.controleCliente==null && other.getControleCliente()==null) || 
             (this.controleCliente!=null &&
              this.controleCliente.equals(other.getControleCliente())));
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
        _hashCode += getIdSolicitacaoRef();
        if (getAprovador() != null) {
            _hashCode += getAprovador().hashCode();
        }
        if (getControleCliente() != null) {
            _hashCode += getControleCliente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AprovarSolicitacaoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "aprovarSolicitacaoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacaoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSolicitacaoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aprovador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aprovador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controleCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controleCliente"));
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
