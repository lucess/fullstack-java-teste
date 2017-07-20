/**
 * DeletarParametrizacaoViajanteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class DeletarParametrizacaoViajanteRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacaoRef parametrizacaoViajanteAprovacaoRef;

    public DeletarParametrizacaoViajanteRequest() {
    }

    public DeletarParametrizacaoViajanteRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacaoRef parametrizacaoViajanteAprovacaoRef) {
           this.parametrizacaoViajanteAprovacaoRef = parametrizacaoViajanteAprovacaoRef;
    }


    /**
     * Gets the parametrizacaoViajanteAprovacaoRef value for this DeletarParametrizacaoViajanteRequest.
     * 
     * @return parametrizacaoViajanteAprovacaoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacaoRef getParametrizacaoViajanteAprovacaoRef() {
        return parametrizacaoViajanteAprovacaoRef;
    }


    /**
     * Sets the parametrizacaoViajanteAprovacaoRef value for this DeletarParametrizacaoViajanteRequest.
     * 
     * @param parametrizacaoViajanteAprovacaoRef
     */
    public void setParametrizacaoViajanteAprovacaoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacaoRef parametrizacaoViajanteAprovacaoRef) {
        this.parametrizacaoViajanteAprovacaoRef = parametrizacaoViajanteAprovacaoRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeletarParametrizacaoViajanteRequest)) return false;
        DeletarParametrizacaoViajanteRequest other = (DeletarParametrizacaoViajanteRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parametrizacaoViajanteAprovacaoRef==null && other.getParametrizacaoViajanteAprovacaoRef()==null) || 
             (this.parametrizacaoViajanteAprovacaoRef!=null &&
              this.parametrizacaoViajanteAprovacaoRef.equals(other.getParametrizacaoViajanteAprovacaoRef())));
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
        if (getParametrizacaoViajanteAprovacaoRef() != null) {
            _hashCode += getParametrizacaoViajanteAprovacaoRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeletarParametrizacaoViajanteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "deletarParametrizacaoViajanteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametrizacaoViajanteAprovacaoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parametrizacaoViajanteAprovacaoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoViajanteAprovacaoRef"));
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
