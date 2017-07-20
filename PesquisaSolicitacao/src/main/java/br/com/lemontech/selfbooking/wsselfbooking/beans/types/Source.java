/**
 * Source.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class Source implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Source(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AZUL = "AZUL";
    public static final java.lang.String _TAM = "TAM";
    public static final java.lang.String _TAM_MERCOSUL = "TAM_MERCOSUL";
    public static final java.lang.String _GOL = "GOL";
    public static final java.lang.String _PASSAREDO = "PASSAREDO";
    public static final java.lang.String _META = "META";
    public static final java.lang.String _SETE = "SETE";
    public static final java.lang.String _PUMAAIR = "PUMAAIR";
    public static final java.lang.String _NHT = "NHT";
    public static final java.lang.String _MAP = "MAP";
    public static final java.lang.String _PIQUIATUBA = "PIQUIATUBA";
    public static final java.lang.String _AVIANCA = "AVIANCA";
    public static final java.lang.String _AVIANCA_V2 = "AVIANCA_V2";
    public static final java.lang.String _GOL_V2 = "GOL_V2";
    public static final java.lang.String _TRAVELPORT = "TRAVELPORT";
    public static final java.lang.String _SABRE = "SABRE";
    public static final java.lang.String _FLYWAYS = "FLYWAYS";
    public static final Source AZUL = new Source(_AZUL);
    public static final Source TAM = new Source(_TAM);
    public static final Source TAM_MERCOSUL = new Source(_TAM_MERCOSUL);
    public static final Source GOL = new Source(_GOL);
    public static final Source PASSAREDO = new Source(_PASSAREDO);
    public static final Source META = new Source(_META);
    public static final Source SETE = new Source(_SETE);
    public static final Source PUMAAIR = new Source(_PUMAAIR);
    public static final Source NHT = new Source(_NHT);
    public static final Source MAP = new Source(_MAP);
    public static final Source PIQUIATUBA = new Source(_PIQUIATUBA);
    public static final Source AVIANCA = new Source(_AVIANCA);
    public static final Source AVIANCA_V2 = new Source(_AVIANCA_V2);
    public static final Source GOL_V2 = new Source(_GOL_V2);
    public static final Source TRAVELPORT = new Source(_TRAVELPORT);
    public static final Source SABRE = new Source(_SABRE);
    public static final Source FLYWAYS = new Source(_FLYWAYS);
    public java.lang.String getValue() { return _value_;}
    public static Source fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Source enumeration = (Source)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Source fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Source.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "source"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
