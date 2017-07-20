/**
 * AereoDetalheParada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

public class AereoDetalheParada  implements java.io.Serializable {
    private java.lang.String origem;

    private java.util.Calendar dataSaida;

    private java.lang.String destino;

    private java.util.Calendar dataChegada;

    public AereoDetalheParada() {
    }

    public AereoDetalheParada(
           java.lang.String origem,
           java.util.Calendar dataSaida,
           java.lang.String destino,
           java.util.Calendar dataChegada) {
           this.origem = origem;
           this.dataSaida = dataSaida;
           this.destino = destino;
           this.dataChegada = dataChegada;
    }


    /**
     * Gets the origem value for this AereoDetalheParada.
     * 
     * @return origem
     */
    public java.lang.String getOrigem() {
        return origem;
    }


    /**
     * Sets the origem value for this AereoDetalheParada.
     * 
     * @param origem
     */
    public void setOrigem(java.lang.String origem) {
        this.origem = origem;
    }


    /**
     * Gets the dataSaida value for this AereoDetalheParada.
     * 
     * @return dataSaida
     */
    public java.util.Calendar getDataSaida() {
        return dataSaida;
    }


    /**
     * Sets the dataSaida value for this AereoDetalheParada.
     * 
     * @param dataSaida
     */
    public void setDataSaida(java.util.Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }


    /**
     * Gets the destino value for this AereoDetalheParada.
     * 
     * @return destino
     */
    public java.lang.String getDestino() {
        return destino;
    }


    /**
     * Sets the destino value for this AereoDetalheParada.
     * 
     * @param destino
     */
    public void setDestino(java.lang.String destino) {
        this.destino = destino;
    }


    /**
     * Gets the dataChegada value for this AereoDetalheParada.
     * 
     * @return dataChegada
     */
    public java.util.Calendar getDataChegada() {
        return dataChegada;
    }


    /**
     * Sets the dataChegada value for this AereoDetalheParada.
     * 
     * @param dataChegada
     */
    public void setDataChegada(java.util.Calendar dataChegada) {
        this.dataChegada = dataChegada;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AereoDetalheParada)) return false;
        AereoDetalheParada other = (AereoDetalheParada) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.origem==null && other.getOrigem()==null) || 
             (this.origem!=null &&
              this.origem.equals(other.getOrigem()))) &&
            ((this.dataSaida==null && other.getDataSaida()==null) || 
             (this.dataSaida!=null &&
              this.dataSaida.equals(other.getDataSaida()))) &&
            ((this.destino==null && other.getDestino()==null) || 
             (this.destino!=null &&
              this.destino.equals(other.getDestino()))) &&
            ((this.dataChegada==null && other.getDataChegada()==null) || 
             (this.dataChegada!=null &&
              this.dataChegada.equals(other.getDataChegada())));
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
        if (getOrigem() != null) {
            _hashCode += getOrigem().hashCode();
        }
        if (getDataSaida() != null) {
            _hashCode += getDataSaida().hashCode();
        }
        if (getDestino() != null) {
            _hashCode += getDestino().hashCode();
        }
        if (getDataChegada() != null) {
            _hashCode += getDataChegada().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AereoDetalheParada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoDetalheParada"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSaida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataSaida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataChegada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataChegada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
