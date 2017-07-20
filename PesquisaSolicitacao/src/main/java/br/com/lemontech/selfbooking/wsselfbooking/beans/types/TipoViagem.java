/**
 * TipoViagem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class TipoViagem implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TipoViagem(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TODOS = "TODOS";
    public static final java.lang.String _NACIONAL = "NACIONAL";
    public static final java.lang.String _CONTINENTAL = "CONTINENTAL";
    public static final java.lang.String _INTERNACIONAL = "INTERNACIONAL";
    public static final java.lang.String _INTERCONTINENTAL = "INTERCONTINENTAL";
    public static final TipoViagem TODOS = new TipoViagem(_TODOS);
    public static final TipoViagem NACIONAL = new TipoViagem(_NACIONAL);
    public static final TipoViagem CONTINENTAL = new TipoViagem(_CONTINENTAL);
    public static final TipoViagem INTERNACIONAL = new TipoViagem(_INTERNACIONAL);
    public static final TipoViagem INTERCONTINENTAL = new TipoViagem(_INTERCONTINENTAL);
    public java.lang.String getValue() { return _value_;}
    public static TipoViagem fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TipoViagem enumeration = (TipoViagem)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TipoViagem fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TipoViagem.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoViagem"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
