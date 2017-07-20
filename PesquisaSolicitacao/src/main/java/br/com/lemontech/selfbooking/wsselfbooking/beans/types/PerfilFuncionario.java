/**
 * PerfilFuncionario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class PerfilFuncionario implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PerfilFuncionario(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _GESTOR = "GESTOR";
    public static final java.lang.String _APROVADOR = "APROVADOR";
    public static final java.lang.String _SOLICITANTE = "SOLICITANTE";
    public static final java.lang.String _PASSAGEIRO = "PASSAGEIRO";
    public static final java.lang.String _APROVADOR_MASTER = "APROVADOR_MASTER";
    public static final java.lang.String _PASSAGEIRO_TERCEIRO = "PASSAGEIRO_TERCEIRO";
    public static final java.lang.String _USUARIO = "USUARIO";
    public static final PerfilFuncionario GESTOR = new PerfilFuncionario(_GESTOR);
    public static final PerfilFuncionario APROVADOR = new PerfilFuncionario(_APROVADOR);
    public static final PerfilFuncionario SOLICITANTE = new PerfilFuncionario(_SOLICITANTE);
    public static final PerfilFuncionario PASSAGEIRO = new PerfilFuncionario(_PASSAGEIRO);
    public static final PerfilFuncionario APROVADOR_MASTER = new PerfilFuncionario(_APROVADOR_MASTER);
    public static final PerfilFuncionario PASSAGEIRO_TERCEIRO = new PerfilFuncionario(_PASSAGEIRO_TERCEIRO);
    public static final PerfilFuncionario USUARIO = new PerfilFuncionario(_USUARIO);
    public java.lang.String getValue() { return _value_;}
    public static PerfilFuncionario fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PerfilFuncionario enumeration = (PerfilFuncionario)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PerfilFuncionario fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PerfilFuncionario.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "perfilFuncionario"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
