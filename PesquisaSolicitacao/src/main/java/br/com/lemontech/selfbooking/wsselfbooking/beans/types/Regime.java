/**
 * Regime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class Regime implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Regime(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CAFE_DA_MANHA = "CAFE_DA_MANHA";
    public static final java.lang.String _MEIA_PENSAO = "MEIA_PENSAO";
    public static final java.lang.String _PENSAO_COMPLETA = "PENSAO_COMPLETA";
    public static final java.lang.String _ALL_INCLUSIVE = "ALL_INCLUSIVE";
    public static final java.lang.String _SO_HOSPEDAGEM = "SO_HOSPEDAGEM";
    public static final java.lang.String _JANTAR = "JANTAR";
    public static final java.lang.String _NAO_INCLUI = "NAO_INCLUI";
    public static final Regime CAFE_DA_MANHA = new Regime(_CAFE_DA_MANHA);
    public static final Regime MEIA_PENSAO = new Regime(_MEIA_PENSAO);
    public static final Regime PENSAO_COMPLETA = new Regime(_PENSAO_COMPLETA);
    public static final Regime ALL_INCLUSIVE = new Regime(_ALL_INCLUSIVE);
    public static final Regime SO_HOSPEDAGEM = new Regime(_SO_HOSPEDAGEM);
    public static final Regime JANTAR = new Regime(_JANTAR);
    public static final Regime NAO_INCLUI = new Regime(_NAO_INCLUI);
    public java.lang.String getValue() { return _value_;}
    public static Regime fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Regime enumeration = (Regime)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Regime fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Regime.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "regime"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
