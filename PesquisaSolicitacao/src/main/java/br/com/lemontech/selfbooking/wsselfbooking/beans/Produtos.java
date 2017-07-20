/**
 * Produtos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class Produtos  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo[] aereo;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.Hotel[] hotel;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.carro.Carro[] carro;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.outro.Outro[] outro;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.Seguro[] seguro;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.Traslado[] traslado;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.rodoviario.Rodoviario[] rodoviario;

    public Produtos() {
    }

    public Produtos(
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo[] aereo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.Hotel[] hotel,
           br.com.lemontech.selfbooking.wsselfbooking.beans.carro.Carro[] carro,
           br.com.lemontech.selfbooking.wsselfbooking.beans.outro.Outro[] outro,
           br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.Seguro[] seguro,
           br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.Traslado[] traslado,
           br.com.lemontech.selfbooking.wsselfbooking.beans.rodoviario.Rodoviario[] rodoviario) {
           this.aereo = aereo;
           this.hotel = hotel;
           this.carro = carro;
           this.outro = outro;
           this.seguro = seguro;
           this.traslado = traslado;
           this.rodoviario = rodoviario;
    }


    /**
     * Gets the aereo value for this Produtos.
     * 
     * @return aereo
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo[] getAereo() {
        return aereo;
    }


    /**
     * Sets the aereo value for this Produtos.
     * 
     * @param aereo
     */
    public void setAereo(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo[] aereo) {
        this.aereo = aereo;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo getAereo(int i) {
        return this.aereo[i];
    }

    public void setAereo(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo _value) {
        this.aereo[i] = _value;
    }


    /**
     * Gets the hotel value for this Produtos.
     * 
     * @return hotel
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.Hotel[] getHotel() {
        return hotel;
    }


    /**
     * Sets the hotel value for this Produtos.
     * 
     * @param hotel
     */
    public void setHotel(br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.Hotel[] hotel) {
        this.hotel = hotel;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.Hotel getHotel(int i) {
        return this.hotel[i];
    }

    public void setHotel(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.Hotel _value) {
        this.hotel[i] = _value;
    }


    /**
     * Gets the carro value for this Produtos.
     * 
     * @return carro
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.carro.Carro[] getCarro() {
        return carro;
    }


    /**
     * Sets the carro value for this Produtos.
     * 
     * @param carro
     */
    public void setCarro(br.com.lemontech.selfbooking.wsselfbooking.beans.carro.Carro[] carro) {
        this.carro = carro;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.carro.Carro getCarro(int i) {
        return this.carro[i];
    }

    public void setCarro(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.carro.Carro _value) {
        this.carro[i] = _value;
    }


    /**
     * Gets the outro value for this Produtos.
     * 
     * @return outro
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.outro.Outro[] getOutro() {
        return outro;
    }


    /**
     * Sets the outro value for this Produtos.
     * 
     * @param outro
     */
    public void setOutro(br.com.lemontech.selfbooking.wsselfbooking.beans.outro.Outro[] outro) {
        this.outro = outro;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.outro.Outro getOutro(int i) {
        return this.outro[i];
    }

    public void setOutro(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.outro.Outro _value) {
        this.outro[i] = _value;
    }


    /**
     * Gets the seguro value for this Produtos.
     * 
     * @return seguro
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.Seguro[] getSeguro() {
        return seguro;
    }


    /**
     * Sets the seguro value for this Produtos.
     * 
     * @param seguro
     */
    public void setSeguro(br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.Seguro[] seguro) {
        this.seguro = seguro;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.Seguro getSeguro(int i) {
        return this.seguro[i];
    }

    public void setSeguro(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.Seguro _value) {
        this.seguro[i] = _value;
    }


    /**
     * Gets the traslado value for this Produtos.
     * 
     * @return traslado
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.Traslado[] getTraslado() {
        return traslado;
    }


    /**
     * Sets the traslado value for this Produtos.
     * 
     * @param traslado
     */
    public void setTraslado(br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.Traslado[] traslado) {
        this.traslado = traslado;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.Traslado getTraslado(int i) {
        return this.traslado[i];
    }

    public void setTraslado(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.Traslado _value) {
        this.traslado[i] = _value;
    }


    /**
     * Gets the rodoviario value for this Produtos.
     * 
     * @return rodoviario
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.rodoviario.Rodoviario[] getRodoviario() {
        return rodoviario;
    }


    /**
     * Sets the rodoviario value for this Produtos.
     * 
     * @param rodoviario
     */
    public void setRodoviario(br.com.lemontech.selfbooking.wsselfbooking.beans.rodoviario.Rodoviario[] rodoviario) {
        this.rodoviario = rodoviario;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.rodoviario.Rodoviario getRodoviario(int i) {
        return this.rodoviario[i];
    }

    public void setRodoviario(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.rodoviario.Rodoviario _value) {
        this.rodoviario[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Produtos)) return false;
        Produtos other = (Produtos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aereo==null && other.getAereo()==null) || 
             (this.aereo!=null &&
              java.util.Arrays.equals(this.aereo, other.getAereo()))) &&
            ((this.hotel==null && other.getHotel()==null) || 
             (this.hotel!=null &&
              java.util.Arrays.equals(this.hotel, other.getHotel()))) &&
            ((this.carro==null && other.getCarro()==null) || 
             (this.carro!=null &&
              java.util.Arrays.equals(this.carro, other.getCarro()))) &&
            ((this.outro==null && other.getOutro()==null) || 
             (this.outro!=null &&
              java.util.Arrays.equals(this.outro, other.getOutro()))) &&
            ((this.seguro==null && other.getSeguro()==null) || 
             (this.seguro!=null &&
              java.util.Arrays.equals(this.seguro, other.getSeguro()))) &&
            ((this.traslado==null && other.getTraslado()==null) || 
             (this.traslado!=null &&
              java.util.Arrays.equals(this.traslado, other.getTraslado()))) &&
            ((this.rodoviario==null && other.getRodoviario()==null) || 
             (this.rodoviario!=null &&
              java.util.Arrays.equals(this.rodoviario, other.getRodoviario())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAereo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAereo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAereo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHotel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHotel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHotel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCarro() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarro());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCarro(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutro() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutro());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutro(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeguro() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeguro());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeguro(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTraslado() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTraslado());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTraslado(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRodoviario() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRodoviario());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRodoviario(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Produtos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "produtos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aereo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aereo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hotel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/hotel", "hotel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/carro", "carro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/outro", "outro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seguro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seguro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/seguro", "seguro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traslado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traslado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/traslado", "traslado"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rodoviario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rodoviario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/rodoviario", "rodoviario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
