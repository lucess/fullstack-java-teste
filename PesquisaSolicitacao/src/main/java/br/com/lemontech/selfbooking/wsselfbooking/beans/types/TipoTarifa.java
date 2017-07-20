/**
 * TipoTarifa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class TipoTarifa implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TipoTarifa(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DIARIA = "DIARIA";
    public static final java.lang.String _FIM_DE_SEMANA = "FIM_DE_SEMANA";
    public static final java.lang.String _MENSAL = "MENSAL";
    public static final java.lang.String _PACOTE = "PACOTE";
    public static final java.lang.String _SEMANAL = "SEMANAL";
    public static final TipoTarifa DIARIA = new TipoTarifa(_DIARIA);
    public static final TipoTarifa FIM_DE_SEMANA = new TipoTarifa(_FIM_DE_SEMANA);
    public static final TipoTarifa MENSAL = new TipoTarifa(_MENSAL);
    public static final TipoTarifa PACOTE = new TipoTarifa(_PACOTE);
    public static final TipoTarifa SEMANAL = new TipoTarifa(_SEMANAL);
    public java.lang.String getValue() { return _value_;}
    public static TipoTarifa fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TipoTarifa enumeration = (TipoTarifa)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TipoTarifa fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TipoTarifa.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoTarifa"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
