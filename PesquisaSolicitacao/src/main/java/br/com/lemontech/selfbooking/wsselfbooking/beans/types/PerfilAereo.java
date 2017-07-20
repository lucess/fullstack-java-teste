/**
 * PerfilAereo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class PerfilAereo implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PerfilAereo(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ECONOMICA = "ECONOMICA";
    public static final java.lang.String _EXECUTIVA = "EXECUTIVA";
    public static final java.lang.String _PRIMEIRA_CLASSE = "PRIMEIRA_CLASSE";
    public static final java.lang.String _ECONOMICA_PLUS = "ECONOMICA_PLUS";
    public static final PerfilAereo ECONOMICA = new PerfilAereo(_ECONOMICA);
    public static final PerfilAereo EXECUTIVA = new PerfilAereo(_EXECUTIVA);
    public static final PerfilAereo PRIMEIRA_CLASSE = new PerfilAereo(_PRIMEIRA_CLASSE);
    public static final PerfilAereo ECONOMICA_PLUS = new PerfilAereo(_ECONOMICA_PLUS);
    public java.lang.String getValue() { return _value_;}
    public static PerfilAereo fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PerfilAereo enumeration = (PerfilAereo)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PerfilAereo fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PerfilAereo.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "perfilAereo"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
