/**
 * ContaContabilRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class ContaContabilRef  implements java.io.Serializable {
    private java.lang.String codigo;

    /* Regional que o centro de custo pertence. */
    private br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef regionalRef;

    private boolean aereo;

    private boolean hotel;

    private boolean carro;

    private boolean seguro;

    private boolean outro;

    private boolean traslado;

    private boolean rodoviario;

    public ContaContabilRef() {
    }

    public ContaContabilRef(
           java.lang.String codigo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef regionalRef,
           boolean aereo,
           boolean hotel,
           boolean carro,
           boolean seguro,
           boolean outro,
           boolean traslado,
           boolean rodoviario) {
           this.codigo = codigo;
           this.regionalRef = regionalRef;
           this.aereo = aereo;
           this.hotel = hotel;
           this.carro = carro;
           this.seguro = seguro;
           this.outro = outro;
           this.traslado = traslado;
           this.rodoviario = rodoviario;
    }


    /**
     * Gets the codigo value for this ContaContabilRef.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this ContaContabilRef.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the regionalRef value for this ContaContabilRef.
     * 
     * @return regionalRef   * Regional que o centro de custo pertence.
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef getRegionalRef() {
        return regionalRef;
    }


    /**
     * Sets the regionalRef value for this ContaContabilRef.
     * 
     * @param regionalRef   * Regional que o centro de custo pertence.
     */
    public void setRegionalRef(br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef regionalRef) {
        this.regionalRef = regionalRef;
    }


    /**
     * Gets the aereo value for this ContaContabilRef.
     * 
     * @return aereo
     */
    public boolean isAereo() {
        return aereo;
    }


    /**
     * Sets the aereo value for this ContaContabilRef.
     * 
     * @param aereo
     */
    public void setAereo(boolean aereo) {
        this.aereo = aereo;
    }


    /**
     * Gets the hotel value for this ContaContabilRef.
     * 
     * @return hotel
     */
    public boolean isHotel() {
        return hotel;
    }


    /**
     * Sets the hotel value for this ContaContabilRef.
     * 
     * @param hotel
     */
    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }


    /**
     * Gets the carro value for this ContaContabilRef.
     * 
     * @return carro
     */
    public boolean isCarro() {
        return carro;
    }


    /**
     * Sets the carro value for this ContaContabilRef.
     * 
     * @param carro
     */
    public void setCarro(boolean carro) {
        this.carro = carro;
    }


    /**
     * Gets the seguro value for this ContaContabilRef.
     * 
     * @return seguro
     */
    public boolean isSeguro() {
        return seguro;
    }


    /**
     * Sets the seguro value for this ContaContabilRef.
     * 
     * @param seguro
     */
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }


    /**
     * Gets the outro value for this ContaContabilRef.
     * 
     * @return outro
     */
    public boolean isOutro() {
        return outro;
    }


    /**
     * Sets the outro value for this ContaContabilRef.
     * 
     * @param outro
     */
    public void setOutro(boolean outro) {
        this.outro = outro;
    }


    /**
     * Gets the traslado value for this ContaContabilRef.
     * 
     * @return traslado
     */
    public boolean isTraslado() {
        return traslado;
    }


    /**
     * Sets the traslado value for this ContaContabilRef.
     * 
     * @param traslado
     */
    public void setTraslado(boolean traslado) {
        this.traslado = traslado;
    }


    /**
     * Gets the rodoviario value for this ContaContabilRef.
     * 
     * @return rodoviario
     */
    public boolean isRodoviario() {
        return rodoviario;
    }


    /**
     * Sets the rodoviario value for this ContaContabilRef.
     * 
     * @param rodoviario
     */
    public void setRodoviario(boolean rodoviario) {
        this.rodoviario = rodoviario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContaContabilRef)) return false;
        ContaContabilRef other = (ContaContabilRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.regionalRef==null && other.getRegionalRef()==null) || 
             (this.regionalRef!=null &&
              this.regionalRef.equals(other.getRegionalRef()))) &&
            this.aereo == other.isAereo() &&
            this.hotel == other.isHotel() &&
            this.carro == other.isCarro() &&
            this.seguro == other.isSeguro() &&
            this.outro == other.isOutro() &&
            this.traslado == other.isTraslado() &&
            this.rodoviario == other.isRodoviario();
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
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getRegionalRef() != null) {
            _hashCode += getRegionalRef().hashCode();
        }
        _hashCode += (isAereo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHotel() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCarro() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSeguro() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOutro() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTraslado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRodoviario() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContaContabilRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "contaContabilRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionalRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionalRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "regionalRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aereo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aereo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hotel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seguro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seguro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traslado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traslado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rodoviario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rodoviario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
