/**
 * Cobertura.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class Cobertura  implements java.io.Serializable {
    private java.lang.String descricao;

    private java.lang.String limite;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCobertura tipoCobertura;

    public Cobertura() {
    }

    public Cobertura(
           java.lang.String descricao,
           java.lang.String limite,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCobertura tipoCobertura) {
           this.descricao = descricao;
           this.limite = limite;
           this.tipoCobertura = tipoCobertura;
    }


    /**
     * Gets the descricao value for this Cobertura.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Cobertura.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the limite value for this Cobertura.
     * 
     * @return limite
     */
    public java.lang.String getLimite() {
        return limite;
    }


    /**
     * Sets the limite value for this Cobertura.
     * 
     * @param limite
     */
    public void setLimite(java.lang.String limite) {
        this.limite = limite;
    }


    /**
     * Gets the tipoCobertura value for this Cobertura.
     * 
     * @return tipoCobertura
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }


    /**
     * Sets the tipoCobertura value for this Cobertura.
     * 
     * @param tipoCobertura
     */
    public void setTipoCobertura(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cobertura)) return false;
        Cobertura other = (Cobertura) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.limite==null && other.getLimite()==null) || 
             (this.limite!=null &&
              this.limite.equals(other.getLimite()))) &&
            ((this.tipoCobertura==null && other.getTipoCobertura()==null) || 
             (this.tipoCobertura!=null &&
              this.tipoCobertura.equals(other.getTipoCobertura())));
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
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getLimite() != null) {
            _hashCode += getLimite().hashCode();
        }
        if (getTipoCobertura() != null) {
            _hashCode += getTipoCobertura().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cobertura.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "cobertura"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCobertura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoCobertura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoCobertura"));
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
