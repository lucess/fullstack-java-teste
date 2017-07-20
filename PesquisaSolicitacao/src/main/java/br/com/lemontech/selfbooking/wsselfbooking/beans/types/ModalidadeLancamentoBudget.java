/**
 * ModalidadeLancamentoBudget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class ModalidadeLancamentoBudget implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ModalidadeLancamentoBudget(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RESIDUAL = "RESIDUAL";
    public static final java.lang.String _MENSAL = "MENSAL";
    public static final java.lang.String _ANUAL = "ANUAL";
    public static final java.lang.String _EXTRA = "EXTRA";
    public static final java.lang.String _ACERTO = "ACERTO";
    public static final java.lang.String _ATUALIZACAO = "ATUALIZACAO";
    public static final ModalidadeLancamentoBudget RESIDUAL = new ModalidadeLancamentoBudget(_RESIDUAL);
    public static final ModalidadeLancamentoBudget MENSAL = new ModalidadeLancamentoBudget(_MENSAL);
    public static final ModalidadeLancamentoBudget ANUAL = new ModalidadeLancamentoBudget(_ANUAL);
    public static final ModalidadeLancamentoBudget EXTRA = new ModalidadeLancamentoBudget(_EXTRA);
    public static final ModalidadeLancamentoBudget ACERTO = new ModalidadeLancamentoBudget(_ACERTO);
    public static final ModalidadeLancamentoBudget ATUALIZACAO = new ModalidadeLancamentoBudget(_ATUALIZACAO);
    public java.lang.String getValue() { return _value_;}
    public static ModalidadeLancamentoBudget fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ModalidadeLancamentoBudget enumeration = (ModalidadeLancamentoBudget)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ModalidadeLancamentoBudget fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ModalidadeLancamentoBudget.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "modalidadeLancamentoBudget"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
