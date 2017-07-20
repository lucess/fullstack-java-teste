/**
 * DeletarParametrizacaoCentroDeCustoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class DeletarParametrizacaoCentroDeCustoRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacaoRef parametrizacaoCentroDeCustoAprovacaoRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacaoRef parametrizacaoCentroDeCustoSolicitacaoRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebitoRef parametrizacaoCentroDeCustoDebitoRef;

    public DeletarParametrizacaoCentroDeCustoRequest() {
    }

    public DeletarParametrizacaoCentroDeCustoRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacaoRef parametrizacaoCentroDeCustoAprovacaoRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacaoRef parametrizacaoCentroDeCustoSolicitacaoRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebitoRef parametrizacaoCentroDeCustoDebitoRef) {
           this.parametrizacaoCentroDeCustoAprovacaoRef = parametrizacaoCentroDeCustoAprovacaoRef;
           this.parametrizacaoCentroDeCustoSolicitacaoRef = parametrizacaoCentroDeCustoSolicitacaoRef;
           this.parametrizacaoCentroDeCustoDebitoRef = parametrizacaoCentroDeCustoDebitoRef;
    }


    /**
     * Gets the parametrizacaoCentroDeCustoAprovacaoRef value for this DeletarParametrizacaoCentroDeCustoRequest.
     * 
     * @return parametrizacaoCentroDeCustoAprovacaoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacaoRef getParametrizacaoCentroDeCustoAprovacaoRef() {
        return parametrizacaoCentroDeCustoAprovacaoRef;
    }


    /**
     * Sets the parametrizacaoCentroDeCustoAprovacaoRef value for this DeletarParametrizacaoCentroDeCustoRequest.
     * 
     * @param parametrizacaoCentroDeCustoAprovacaoRef
     */
    public void setParametrizacaoCentroDeCustoAprovacaoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacaoRef parametrizacaoCentroDeCustoAprovacaoRef) {
        this.parametrizacaoCentroDeCustoAprovacaoRef = parametrizacaoCentroDeCustoAprovacaoRef;
    }


    /**
     * Gets the parametrizacaoCentroDeCustoSolicitacaoRef value for this DeletarParametrizacaoCentroDeCustoRequest.
     * 
     * @return parametrizacaoCentroDeCustoSolicitacaoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacaoRef getParametrizacaoCentroDeCustoSolicitacaoRef() {
        return parametrizacaoCentroDeCustoSolicitacaoRef;
    }


    /**
     * Sets the parametrizacaoCentroDeCustoSolicitacaoRef value for this DeletarParametrizacaoCentroDeCustoRequest.
     * 
     * @param parametrizacaoCentroDeCustoSolicitacaoRef
     */
    public void setParametrizacaoCentroDeCustoSolicitacaoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacaoRef parametrizacaoCentroDeCustoSolicitacaoRef) {
        this.parametrizacaoCentroDeCustoSolicitacaoRef = parametrizacaoCentroDeCustoSolicitacaoRef;
    }


    /**
     * Gets the parametrizacaoCentroDeCustoDebitoRef value for this DeletarParametrizacaoCentroDeCustoRequest.
     * 
     * @return parametrizacaoCentroDeCustoDebitoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebitoRef getParametrizacaoCentroDeCustoDebitoRef() {
        return parametrizacaoCentroDeCustoDebitoRef;
    }


    /**
     * Sets the parametrizacaoCentroDeCustoDebitoRef value for this DeletarParametrizacaoCentroDeCustoRequest.
     * 
     * @param parametrizacaoCentroDeCustoDebitoRef
     */
    public void setParametrizacaoCentroDeCustoDebitoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebitoRef parametrizacaoCentroDeCustoDebitoRef) {
        this.parametrizacaoCentroDeCustoDebitoRef = parametrizacaoCentroDeCustoDebitoRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeletarParametrizacaoCentroDeCustoRequest)) return false;
        DeletarParametrizacaoCentroDeCustoRequest other = (DeletarParametrizacaoCentroDeCustoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parametrizacaoCentroDeCustoAprovacaoRef==null && other.getParametrizacaoCentroDeCustoAprovacaoRef()==null) || 
             (this.parametrizacaoCentroDeCustoAprovacaoRef!=null &&
              this.parametrizacaoCentroDeCustoAprovacaoRef.equals(other.getParametrizacaoCentroDeCustoAprovacaoRef()))) &&
            ((this.parametrizacaoCentroDeCustoSolicitacaoRef==null && other.getParametrizacaoCentroDeCustoSolicitacaoRef()==null) || 
             (this.parametrizacaoCentroDeCustoSolicitacaoRef!=null &&
              this.parametrizacaoCentroDeCustoSolicitacaoRef.equals(other.getParametrizacaoCentroDeCustoSolicitacaoRef()))) &&
            ((this.parametrizacaoCentroDeCustoDebitoRef==null && other.getParametrizacaoCentroDeCustoDebitoRef()==null) || 
             (this.parametrizacaoCentroDeCustoDebitoRef!=null &&
              this.parametrizacaoCentroDeCustoDebitoRef.equals(other.getParametrizacaoCentroDeCustoDebitoRef())));
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
        if (getParametrizacaoCentroDeCustoAprovacaoRef() != null) {
            _hashCode += getParametrizacaoCentroDeCustoAprovacaoRef().hashCode();
        }
        if (getParametrizacaoCentroDeCustoSolicitacaoRef() != null) {
            _hashCode += getParametrizacaoCentroDeCustoSolicitacaoRef().hashCode();
        }
        if (getParametrizacaoCentroDeCustoDebitoRef() != null) {
            _hashCode += getParametrizacaoCentroDeCustoDebitoRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeletarParametrizacaoCentroDeCustoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "deletarParametrizacaoCentroDeCustoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametrizacaoCentroDeCustoAprovacaoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parametrizacaoCentroDeCustoAprovacaoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoAprovacaoRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametrizacaoCentroDeCustoSolicitacaoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parametrizacaoCentroDeCustoSolicitacaoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoSolicitacaoRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametrizacaoCentroDeCustoDebitoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parametrizacaoCentroDeCustoDebitoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoDebitoRef"));
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
