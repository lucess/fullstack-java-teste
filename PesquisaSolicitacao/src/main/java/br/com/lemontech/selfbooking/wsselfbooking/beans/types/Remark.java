/**
 * Remark.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class Remark  implements java.io.Serializable {
    private java.lang.String campo;

    private java.lang.String valor;

    private java.lang.Boolean criacao;

    private java.lang.Boolean finalizacao;

    public Remark() {
    }

    public Remark(
           java.lang.String campo,
           java.lang.String valor,
           java.lang.Boolean criacao,
           java.lang.Boolean finalizacao) {
           this.campo = campo;
           this.valor = valor;
           this.criacao = criacao;
           this.finalizacao = finalizacao;
    }


    /**
     * Gets the campo value for this Remark.
     * 
     * @return campo
     */
    public java.lang.String getCampo() {
        return campo;
    }


    /**
     * Sets the campo value for this Remark.
     * 
     * @param campo
     */
    public void setCampo(java.lang.String campo) {
        this.campo = campo;
    }


    /**
     * Gets the valor value for this Remark.
     * 
     * @return valor
     */
    public java.lang.String getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this Remark.
     * 
     * @param valor
     */
    public void setValor(java.lang.String valor) {
        this.valor = valor;
    }


    /**
     * Gets the criacao value for this Remark.
     * 
     * @return criacao
     */
    public java.lang.Boolean getCriacao() {
        return criacao;
    }


    /**
     * Sets the criacao value for this Remark.
     * 
     * @param criacao
     */
    public void setCriacao(java.lang.Boolean criacao) {
        this.criacao = criacao;
    }


    /**
     * Gets the finalizacao value for this Remark.
     * 
     * @return finalizacao
     */
    public java.lang.Boolean getFinalizacao() {
        return finalizacao;
    }


    /**
     * Sets the finalizacao value for this Remark.
     * 
     * @param finalizacao
     */
    public void setFinalizacao(java.lang.Boolean finalizacao) {
        this.finalizacao = finalizacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Remark)) return false;
        Remark other = (Remark) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campo==null && other.getCampo()==null) || 
             (this.campo!=null &&
              this.campo.equals(other.getCampo()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor()))) &&
            ((this.criacao==null && other.getCriacao()==null) || 
             (this.criacao!=null &&
              this.criacao.equals(other.getCriacao()))) &&
            ((this.finalizacao==null && other.getFinalizacao()==null) || 
             (this.finalizacao!=null &&
              this.finalizacao.equals(other.getFinalizacao())));
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
        if (getCampo() != null) {
            _hashCode += getCampo().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        if (getCriacao() != null) {
            _hashCode += getCriacao().hashCode();
        }
        if (getFinalizacao() != null) {
            _hashCode += getFinalizacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Remark.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "remark"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finalizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
