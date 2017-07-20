/**
 * ItenFaturamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class ItenFaturamento implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItenFaturamento(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALIMENTOS_BEBIDAS_NAO_ALCOOLICAS = "ALIMENTOS_BEBIDAS_NAO_ALCOOLICAS";
    public static final java.lang.String _CAFE_DA_MANHA = "CAFE_DA_MANHA";
    public static final java.lang.String _DIARIAS = "DIARIAS";
    public static final java.lang.String _LAVANDERIA = "LAVANDERIA";
    public static final java.lang.String _LIGACOES_TELEFONICAS = "LIGACOES_TELEFONICAS";
    public static final java.lang.String _TAXAS = "TAXAS";
    public static final java.lang.String _TODAS_DESPESAS_EXCETO_BEBIDAS = "TODAS_DESPESAS_EXCETO_BEBIDAS";
    public static final java.lang.String _TODAS_DESPESA = "TODAS_DESPESA";
    public static final java.lang.String _TAXA_TURISMO = "TAXA_TURISMO";
    public static final java.lang.String _AGUA = "AGUA";
    public static final java.lang.String _ESTACIONAMENTO = "ESTACIONAMENTO";
    public static final ItenFaturamento ALIMENTOS_BEBIDAS_NAO_ALCOOLICAS = new ItenFaturamento(_ALIMENTOS_BEBIDAS_NAO_ALCOOLICAS);
    public static final ItenFaturamento CAFE_DA_MANHA = new ItenFaturamento(_CAFE_DA_MANHA);
    public static final ItenFaturamento DIARIAS = new ItenFaturamento(_DIARIAS);
    public static final ItenFaturamento LAVANDERIA = new ItenFaturamento(_LAVANDERIA);
    public static final ItenFaturamento LIGACOES_TELEFONICAS = new ItenFaturamento(_LIGACOES_TELEFONICAS);
    public static final ItenFaturamento TAXAS = new ItenFaturamento(_TAXAS);
    public static final ItenFaturamento TODAS_DESPESAS_EXCETO_BEBIDAS = new ItenFaturamento(_TODAS_DESPESAS_EXCETO_BEBIDAS);
    public static final ItenFaturamento TODAS_DESPESA = new ItenFaturamento(_TODAS_DESPESA);
    public static final ItenFaturamento TAXA_TURISMO = new ItenFaturamento(_TAXA_TURISMO);
    public static final ItenFaturamento AGUA = new ItenFaturamento(_AGUA);
    public static final ItenFaturamento ESTACIONAMENTO = new ItenFaturamento(_ESTACIONAMENTO);
    public java.lang.String getValue() { return _value_;}
    public static ItenFaturamento fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItenFaturamento enumeration = (ItenFaturamento)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItenFaturamento fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItenFaturamento.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "itenFaturamento"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
