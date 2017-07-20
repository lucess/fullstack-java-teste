/**
 * PresacaoContasStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class PresacaoContasStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PresacaoContasStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PENDENTE = "PENDENTE";
    public static final java.lang.String _APROVADO = "APROVADO";
    public static final java.lang.String _REPROVADO = "REPROVADO";
    public static final java.lang.String _AUTORIZACAO = "AUTORIZACAO";
    public static final java.lang.String _PENDENCIA_APROVADOR = "PENDENCIA_APROVADOR";
    public static final PresacaoContasStatus PENDENTE = new PresacaoContasStatus(_PENDENTE);
    public static final PresacaoContasStatus APROVADO = new PresacaoContasStatus(_APROVADO);
    public static final PresacaoContasStatus REPROVADO = new PresacaoContasStatus(_REPROVADO);
    public static final PresacaoContasStatus AUTORIZACAO = new PresacaoContasStatus(_AUTORIZACAO);
    public static final PresacaoContasStatus PENDENCIA_APROVADOR = new PresacaoContasStatus(_PENDENCIA_APROVADOR);
    public java.lang.String getValue() { return _value_;}
    public static PresacaoContasStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PresacaoContasStatus enumeration = (PresacaoContasStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PresacaoContasStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PresacaoContasStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "presacaoContasStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
