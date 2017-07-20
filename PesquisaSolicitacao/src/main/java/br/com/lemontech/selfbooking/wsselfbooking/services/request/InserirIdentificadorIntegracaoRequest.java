/**
 * InserirIdentificadorIntegracaoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class InserirIdentificadorIntegracaoRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.IdentificadorIntegracaoRef identificadorIntegracaoRef;

    public InserirIdentificadorIntegracaoRequest() {
    }

    public InserirIdentificadorIntegracaoRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.IdentificadorIntegracaoRef identificadorIntegracaoRef) {
           this.identificadorIntegracaoRef = identificadorIntegracaoRef;
    }


    /**
     * Gets the identificadorIntegracaoRef value for this InserirIdentificadorIntegracaoRequest.
     * 
     * @return identificadorIntegracaoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.IdentificadorIntegracaoRef getIdentificadorIntegracaoRef() {
        return identificadorIntegracaoRef;
    }


    /**
     * Sets the identificadorIntegracaoRef value for this InserirIdentificadorIntegracaoRequest.
     * 
     * @param identificadorIntegracaoRef
     */
    public void setIdentificadorIntegracaoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.IdentificadorIntegracaoRef identificadorIntegracaoRef) {
        this.identificadorIntegracaoRef = identificadorIntegracaoRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InserirIdentificadorIntegracaoRequest)) return false;
        InserirIdentificadorIntegracaoRequest other = (InserirIdentificadorIntegracaoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificadorIntegracaoRef==null && other.getIdentificadorIntegracaoRef()==null) || 
             (this.identificadorIntegracaoRef!=null &&
              this.identificadorIntegracaoRef.equals(other.getIdentificadorIntegracaoRef())));
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
        if (getIdentificadorIntegracaoRef() != null) {
            _hashCode += getIdentificadorIntegracaoRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InserirIdentificadorIntegracaoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "inserirIdentificadorIntegracaoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorIntegracaoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorIntegracaoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "identificadorIntegracaoRef"));
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
