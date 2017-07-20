/**
 * PerfilHospedagem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class PerfilHospedagem implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PerfilHospedagem(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SIMPLES = "SIMPLES";
    public static final java.lang.String _MEDIO_CONFORTO = "MEDIO_CONFORTO";
    public static final java.lang.String _CONFORTAVEL = "CONFORTAVEL";
    public static final java.lang.String _MUITO_CONFORTAVEL = "MUITO_CONFORTAVEL";
    public static final java.lang.String _LUXO = "LUXO";
    public static final PerfilHospedagem SIMPLES = new PerfilHospedagem(_SIMPLES);
    public static final PerfilHospedagem MEDIO_CONFORTO = new PerfilHospedagem(_MEDIO_CONFORTO);
    public static final PerfilHospedagem CONFORTAVEL = new PerfilHospedagem(_CONFORTAVEL);
    public static final PerfilHospedagem MUITO_CONFORTAVEL = new PerfilHospedagem(_MUITO_CONFORTAVEL);
    public static final PerfilHospedagem LUXO = new PerfilHospedagem(_LUXO);
    public java.lang.String getValue() { return _value_;}
    public static PerfilHospedagem fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PerfilHospedagem enumeration = (PerfilHospedagem)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PerfilHospedagem fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PerfilHospedagem.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "perfilHospedagem"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
