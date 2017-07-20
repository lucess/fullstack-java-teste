/**
 * CategoriaApartamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class CategoriaApartamento implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CategoriaApartamento(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SEM_INFORMACAO = "SEM_INFORMACAO";
    public static final java.lang.String _SIMPLES = "SIMPLES";
    public static final java.lang.String _MEDIO_CONFORTO = "MEDIO_CONFORTO";
    public static final java.lang.String _CONFORTAVEL = "CONFORTAVEL";
    public static final java.lang.String _MUITO_CONFORTAVEL = "MUITO_CONFORTAVEL";
    public static final java.lang.String _LUXO = "LUXO";
    public static final CategoriaApartamento SEM_INFORMACAO = new CategoriaApartamento(_SEM_INFORMACAO);
    public static final CategoriaApartamento SIMPLES = new CategoriaApartamento(_SIMPLES);
    public static final CategoriaApartamento MEDIO_CONFORTO = new CategoriaApartamento(_MEDIO_CONFORTO);
    public static final CategoriaApartamento CONFORTAVEL = new CategoriaApartamento(_CONFORTAVEL);
    public static final CategoriaApartamento MUITO_CONFORTAVEL = new CategoriaApartamento(_MUITO_CONFORTAVEL);
    public static final CategoriaApartamento LUXO = new CategoriaApartamento(_LUXO);
    public java.lang.String getValue() { return _value_;}
    public static CategoriaApartamento fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CategoriaApartamento enumeration = (CategoriaApartamento)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CategoriaApartamento fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CategoriaApartamento.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "categoriaApartamento"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
