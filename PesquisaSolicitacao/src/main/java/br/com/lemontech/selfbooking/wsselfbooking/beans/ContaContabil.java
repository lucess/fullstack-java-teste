/**
 * ContaContabil.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class ContaContabil  extends br.com.lemontech.selfbooking.wsselfbooking.beans.ContaContabilRef  implements java.io.Serializable {
    private java.lang.String descricao;

    private boolean ativo;

    public ContaContabil() {
    }

    public ContaContabil(
           java.lang.String codigo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef regionalRef,
           boolean aereo,
           boolean hotel,
           boolean carro,
           boolean seguro,
           boolean outro,
           boolean traslado,
           boolean rodoviario,
           java.lang.String descricao,
           boolean ativo) {
        super(
            codigo,
            regionalRef,
            aereo,
            hotel,
            carro,
            seguro,
            outro,
            traslado,
            rodoviario);
        this.descricao = descricao;
        this.ativo = ativo;
    }


    /**
     * Gets the descricao value for this ContaContabil.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this ContaContabil.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the ativo value for this ContaContabil.
     * 
     * @return ativo
     */
    public boolean isAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this ContaContabil.
     * 
     * @param ativo
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContaContabil)) return false;
        ContaContabil other = (ContaContabil) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            this.ativo == other.isAtivo();
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
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        _hashCode += (isAtivo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContaContabil.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "contaContabil"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
