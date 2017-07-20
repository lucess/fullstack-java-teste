/**
 * CadastrarHoteisHomologados.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class CadastrarHoteisHomologados  implements java.io.Serializable {
    private java.lang.String identificadorBackOffice;

    private boolean hotelHomologado;

    private java.util.Date vencimentoHomologacao;

    public CadastrarHoteisHomologados() {
    }

    public CadastrarHoteisHomologados(
           java.lang.String identificadorBackOffice,
           boolean hotelHomologado,
           java.util.Date vencimentoHomologacao) {
           this.identificadorBackOffice = identificadorBackOffice;
           this.hotelHomologado = hotelHomologado;
           this.vencimentoHomologacao = vencimentoHomologacao;
    }


    /**
     * Gets the identificadorBackOffice value for this CadastrarHoteisHomologados.
     * 
     * @return identificadorBackOffice
     */
    public java.lang.String getIdentificadorBackOffice() {
        return identificadorBackOffice;
    }


    /**
     * Sets the identificadorBackOffice value for this CadastrarHoteisHomologados.
     * 
     * @param identificadorBackOffice
     */
    public void setIdentificadorBackOffice(java.lang.String identificadorBackOffice) {
        this.identificadorBackOffice = identificadorBackOffice;
    }


    /**
     * Gets the hotelHomologado value for this CadastrarHoteisHomologados.
     * 
     * @return hotelHomologado
     */
    public boolean isHotelHomologado() {
        return hotelHomologado;
    }


    /**
     * Sets the hotelHomologado value for this CadastrarHoteisHomologados.
     * 
     * @param hotelHomologado
     */
    public void setHotelHomologado(boolean hotelHomologado) {
        this.hotelHomologado = hotelHomologado;
    }


    /**
     * Gets the vencimentoHomologacao value for this CadastrarHoteisHomologados.
     * 
     * @return vencimentoHomologacao
     */
    public java.util.Date getVencimentoHomologacao() {
        return vencimentoHomologacao;
    }


    /**
     * Sets the vencimentoHomologacao value for this CadastrarHoteisHomologados.
     * 
     * @param vencimentoHomologacao
     */
    public void setVencimentoHomologacao(java.util.Date vencimentoHomologacao) {
        this.vencimentoHomologacao = vencimentoHomologacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarHoteisHomologados)) return false;
        CadastrarHoteisHomologados other = (CadastrarHoteisHomologados) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificadorBackOffice==null && other.getIdentificadorBackOffice()==null) || 
             (this.identificadorBackOffice!=null &&
              this.identificadorBackOffice.equals(other.getIdentificadorBackOffice()))) &&
            this.hotelHomologado == other.isHotelHomologado() &&
            ((this.vencimentoHomologacao==null && other.getVencimentoHomologacao()==null) || 
             (this.vencimentoHomologacao!=null &&
              this.vencimentoHomologacao.equals(other.getVencimentoHomologacao())));
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
        if (getIdentificadorBackOffice() != null) {
            _hashCode += getIdentificadorBackOffice().hashCode();
        }
        _hashCode += (isHotelHomologado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVencimentoHomologacao() != null) {
            _hashCode += getVencimentoHomologacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarHoteisHomologados.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "cadastrarHoteisHomologados"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorBackOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorBackOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelHomologado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hotelHomologado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vencimentoHomologacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vencimentoHomologacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
