/**
 * Identificador.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class Identificador  implements java.io.Serializable {
    private java.lang.String conector;

    private java.lang.String codigo;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoIntegracao tipoIntegracao;

    private java.lang.String nomeConectorLemontech;

    public Identificador() {
    }

    public Identificador(
           java.lang.String conector,
           java.lang.String codigo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoIntegracao tipoIntegracao,
           java.lang.String nomeConectorLemontech) {
           this.conector = conector;
           this.codigo = codigo;
           this.tipoIntegracao = tipoIntegracao;
           this.nomeConectorLemontech = nomeConectorLemontech;
    }


    /**
     * Gets the conector value for this Identificador.
     * 
     * @return conector
     */
    public java.lang.String getConector() {
        return conector;
    }


    /**
     * Sets the conector value for this Identificador.
     * 
     * @param conector
     */
    public void setConector(java.lang.String conector) {
        this.conector = conector;
    }


    /**
     * Gets the codigo value for this Identificador.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this Identificador.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the tipoIntegracao value for this Identificador.
     * 
     * @return tipoIntegracao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoIntegracao getTipoIntegracao() {
        return tipoIntegracao;
    }


    /**
     * Sets the tipoIntegracao value for this Identificador.
     * 
     * @param tipoIntegracao
     */
    public void setTipoIntegracao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoIntegracao tipoIntegracao) {
        this.tipoIntegracao = tipoIntegracao;
    }


    /**
     * Gets the nomeConectorLemontech value for this Identificador.
     * 
     * @return nomeConectorLemontech
     */
    public java.lang.String getNomeConectorLemontech() {
        return nomeConectorLemontech;
    }


    /**
     * Sets the nomeConectorLemontech value for this Identificador.
     * 
     * @param nomeConectorLemontech
     */
    public void setNomeConectorLemontech(java.lang.String nomeConectorLemontech) {
        this.nomeConectorLemontech = nomeConectorLemontech;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Identificador)) return false;
        Identificador other = (Identificador) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conector==null && other.getConector()==null) || 
             (this.conector!=null &&
              this.conector.equals(other.getConector()))) &&
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.tipoIntegracao==null && other.getTipoIntegracao()==null) || 
             (this.tipoIntegracao!=null &&
              this.tipoIntegracao.equals(other.getTipoIntegracao()))) &&
            ((this.nomeConectorLemontech==null && other.getNomeConectorLemontech()==null) || 
             (this.nomeConectorLemontech!=null &&
              this.nomeConectorLemontech.equals(other.getNomeConectorLemontech())));
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
        if (getConector() != null) {
            _hashCode += getConector().hashCode();
        }
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getTipoIntegracao() != null) {
            _hashCode += getTipoIntegracao().hashCode();
        }
        if (getNomeConectorLemontech() != null) {
            _hashCode += getNomeConectorLemontech().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Identificador.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "identificador"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIntegracao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoIntegracao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoIntegracao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeConectorLemontech");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeConectorLemontech"));
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
