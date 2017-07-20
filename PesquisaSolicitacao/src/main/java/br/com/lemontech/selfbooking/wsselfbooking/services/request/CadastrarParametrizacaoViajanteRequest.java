/**
 * CadastrarParametrizacaoViajanteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class CadastrarParametrizacaoViajanteRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacao parametrizacaoViajanteAprovacao;

    public CadastrarParametrizacaoViajanteRequest() {
    }

    public CadastrarParametrizacaoViajanteRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacao parametrizacaoViajanteAprovacao) {
           this.parametrizacaoViajanteAprovacao = parametrizacaoViajanteAprovacao;
    }


    /**
     * Gets the parametrizacaoViajanteAprovacao value for this CadastrarParametrizacaoViajanteRequest.
     * 
     * @return parametrizacaoViajanteAprovacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacao getParametrizacaoViajanteAprovacao() {
        return parametrizacaoViajanteAprovacao;
    }


    /**
     * Sets the parametrizacaoViajanteAprovacao value for this CadastrarParametrizacaoViajanteRequest.
     * 
     * @param parametrizacaoViajanteAprovacao
     */
    public void setParametrizacaoViajanteAprovacao(br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacao parametrizacaoViajanteAprovacao) {
        this.parametrizacaoViajanteAprovacao = parametrizacaoViajanteAprovacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarParametrizacaoViajanteRequest)) return false;
        CadastrarParametrizacaoViajanteRequest other = (CadastrarParametrizacaoViajanteRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parametrizacaoViajanteAprovacao==null && other.getParametrizacaoViajanteAprovacao()==null) || 
             (this.parametrizacaoViajanteAprovacao!=null &&
              this.parametrizacaoViajanteAprovacao.equals(other.getParametrizacaoViajanteAprovacao())));
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
        if (getParametrizacaoViajanteAprovacao() != null) {
            _hashCode += getParametrizacaoViajanteAprovacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarParametrizacaoViajanteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarParametrizacaoViajanteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametrizacaoViajanteAprovacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parametrizacaoViajanteAprovacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoViajanteAprovacao"));
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
