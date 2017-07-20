/**
 * Moeda.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class Moeda implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Moeda(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ARS = "ARS";
    public static final java.lang.String _BRL = "BRL";
    public static final java.lang.String _USD = "USD";
    public static final java.lang.String _NUC = "NUC";
    public static final java.lang.String _EUR = "EUR";
    public static final java.lang.String _GBP = "GBP";
    public static final java.lang.String _JPY = "JPY";
    public static final java.lang.String _CNY = "CNY";
    public static final java.lang.String _PLN = "PLN";
    public static final java.lang.String _KHR = "KHR";
    public static final java.lang.String _CAD = "CAD";
    public static final java.lang.String _MXN = "MXN";
    public static final java.lang.String _COP = "COP";
    public static final java.lang.String _AFA = "AFA";
    public static final java.lang.String _PEN = "PEN";
    public static final java.lang.String _SGD = "SGD";
    public static final java.lang.String _ZAR = "ZAR";
    public static final java.lang.String _PYG = "PYG";
    public static final java.lang.String _CLP = "CLP";
    public static final java.lang.String _CHF = "CHF";
    public static final Moeda ARS = new Moeda(_ARS);
    public static final Moeda BRL = new Moeda(_BRL);
    public static final Moeda USD = new Moeda(_USD);
    public static final Moeda NUC = new Moeda(_NUC);
    public static final Moeda EUR = new Moeda(_EUR);
    public static final Moeda GBP = new Moeda(_GBP);
    public static final Moeda JPY = new Moeda(_JPY);
    public static final Moeda CNY = new Moeda(_CNY);
    public static final Moeda PLN = new Moeda(_PLN);
    public static final Moeda KHR = new Moeda(_KHR);
    public static final Moeda CAD = new Moeda(_CAD);
    public static final Moeda MXN = new Moeda(_MXN);
    public static final Moeda COP = new Moeda(_COP);
    public static final Moeda AFA = new Moeda(_AFA);
    public static final Moeda PEN = new Moeda(_PEN);
    public static final Moeda SGD = new Moeda(_SGD);
    public static final Moeda ZAR = new Moeda(_ZAR);
    public static final Moeda PYG = new Moeda(_PYG);
    public static final Moeda CLP = new Moeda(_CLP);
    public static final Moeda CHF = new Moeda(_CHF);
    public java.lang.String getValue() { return _value_;}
    public static Moeda fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Moeda enumeration = (Moeda)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Moeda fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Moeda.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "moeda"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
