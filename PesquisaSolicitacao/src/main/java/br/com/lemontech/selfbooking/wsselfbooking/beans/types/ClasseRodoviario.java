/**
 * ClasseRodoviario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class ClasseRodoviario implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ClasseRodoviario(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PRIMEIRA_CLASSE = "PRIMEIRA_CLASSE";
    public static final java.lang.String _CONVENCIONAL = "CONVENCIONAL";
    public static final java.lang.String _EXECUTIVO = "EXECUTIVO";
    public static final java.lang.String _LEITO = "LEITO";
    public static final java.lang.String _LEITO_CAMA = "LEITO_CAMA";
    public static final java.lang.String _SEMI_LEITO = "SEMI_LEITO";
    public static final ClasseRodoviario PRIMEIRA_CLASSE = new ClasseRodoviario(_PRIMEIRA_CLASSE);
    public static final ClasseRodoviario CONVENCIONAL = new ClasseRodoviario(_CONVENCIONAL);
    public static final ClasseRodoviario EXECUTIVO = new ClasseRodoviario(_EXECUTIVO);
    public static final ClasseRodoviario LEITO = new ClasseRodoviario(_LEITO);
    public static final ClasseRodoviario LEITO_CAMA = new ClasseRodoviario(_LEITO_CAMA);
    public static final ClasseRodoviario SEMI_LEITO = new ClasseRodoviario(_SEMI_LEITO);
    public java.lang.String getValue() { return _value_;}
    public static ClasseRodoviario fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ClasseRodoviario enumeration = (ClasseRodoviario)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ClasseRodoviario fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ClasseRodoviario.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "classeRodoviario"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
