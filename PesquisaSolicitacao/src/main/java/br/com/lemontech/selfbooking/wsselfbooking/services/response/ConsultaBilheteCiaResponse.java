/**
 * ConsultaBilheteCiaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.response;

public class ConsultaBilheteCiaResponse  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao resultadoAcao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo[] aereo;

    private java.lang.String mensagemRetorno;

    public ConsultaBilheteCiaResponse() {
    }

    public ConsultaBilheteCiaResponse(
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao resultadoAcao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo[] aereo,
           java.lang.String mensagemRetorno) {
           this.resultadoAcao = resultadoAcao;
           this.aereo = aereo;
           this.mensagemRetorno = mensagemRetorno;
    }


    /**
     * Gets the resultadoAcao value for this ConsultaBilheteCiaResponse.
     * 
     * @return resultadoAcao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao getResultadoAcao() {
        return resultadoAcao;
    }


    /**
     * Sets the resultadoAcao value for this ConsultaBilheteCiaResponse.
     * 
     * @param resultadoAcao
     */
    public void setResultadoAcao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao resultadoAcao) {
        this.resultadoAcao = resultadoAcao;
    }


    /**
     * Gets the aereo value for this ConsultaBilheteCiaResponse.
     * 
     * @return aereo
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo[] getAereo() {
        return aereo;
    }


    /**
     * Sets the aereo value for this ConsultaBilheteCiaResponse.
     * 
     * @param aereo
     */
    public void setAereo(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo[] aereo) {
        this.aereo = aereo;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo getAereo(int i) {
        return this.aereo[i];
    }

    public void setAereo(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo _value) {
        this.aereo[i] = _value;
    }


    /**
     * Gets the mensagemRetorno value for this ConsultaBilheteCiaResponse.
     * 
     * @return mensagemRetorno
     */
    public java.lang.String getMensagemRetorno() {
        return mensagemRetorno;
    }


    /**
     * Sets the mensagemRetorno value for this ConsultaBilheteCiaResponse.
     * 
     * @param mensagemRetorno
     */
    public void setMensagemRetorno(java.lang.String mensagemRetorno) {
        this.mensagemRetorno = mensagemRetorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaBilheteCiaResponse)) return false;
        ConsultaBilheteCiaResponse other = (ConsultaBilheteCiaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultadoAcao==null && other.getResultadoAcao()==null) || 
             (this.resultadoAcao!=null &&
              this.resultadoAcao.equals(other.getResultadoAcao()))) &&
            ((this.aereo==null && other.getAereo()==null) || 
             (this.aereo!=null &&
              java.util.Arrays.equals(this.aereo, other.getAereo()))) &&
            ((this.mensagemRetorno==null && other.getMensagemRetorno()==null) || 
             (this.mensagemRetorno!=null &&
              this.mensagemRetorno.equals(other.getMensagemRetorno())));
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
        if (getResultadoAcao() != null) {
            _hashCode += getResultadoAcao().hashCode();
        }
        if (getAereo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAereo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAereo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMensagemRetorno() != null) {
            _hashCode += getMensagemRetorno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaBilheteCiaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "consultaBilheteCiaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoAcao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultadoAcao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "resultadoAcao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aereo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aereo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensagemRetorno"));
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
