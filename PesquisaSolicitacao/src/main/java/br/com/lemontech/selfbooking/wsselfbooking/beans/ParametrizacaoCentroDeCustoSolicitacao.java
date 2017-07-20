/**
 * ParametrizacaoCentroDeCustoSolicitacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class ParametrizacaoCentroDeCustoSolicitacao  extends br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacaoRef  implements java.io.Serializable {
    private java.util.Date vencimento;

    public ParametrizacaoCentroDeCustoSolicitacao() {
    }

    public ParametrizacaoCentroDeCustoSolicitacao(
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionarioRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef,
           java.util.Date vencimento) {
        super(
            funcionarioRef,
            centroDeCustoRef,
            subCentroDeCustoRef);
        this.vencimento = vencimento;
    }


    /**
     * Gets the vencimento value for this ParametrizacaoCentroDeCustoSolicitacao.
     * 
     * @return vencimento
     */
    public java.util.Date getVencimento() {
        return vencimento;
    }


    /**
     * Sets the vencimento value for this ParametrizacaoCentroDeCustoSolicitacao.
     * 
     * @param vencimento
     */
    public void setVencimento(java.util.Date vencimento) {
        this.vencimento = vencimento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametrizacaoCentroDeCustoSolicitacao)) return false;
        ParametrizacaoCentroDeCustoSolicitacao other = (ParametrizacaoCentroDeCustoSolicitacao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vencimento==null && other.getVencimento()==null) || 
             (this.vencimento!=null &&
              this.vencimento.equals(other.getVencimento())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getVencimento() != null) {
            _hashCode += getVencimento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametrizacaoCentroDeCustoSolicitacao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoSolicitacao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
