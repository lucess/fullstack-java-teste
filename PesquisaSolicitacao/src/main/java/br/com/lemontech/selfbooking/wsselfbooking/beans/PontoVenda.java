/**
 * PontoVenda.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class PontoVenda  implements java.io.Serializable {
    private java.lang.String nomePontoVenda;

    private int codBackOffice;

    private java.lang.String pccLocalVenda;

    public PontoVenda() {
    }

    public PontoVenda(
           java.lang.String nomePontoVenda,
           int codBackOffice,
           java.lang.String pccLocalVenda) {
           this.nomePontoVenda = nomePontoVenda;
           this.codBackOffice = codBackOffice;
           this.pccLocalVenda = pccLocalVenda;
    }


    /**
     * Gets the nomePontoVenda value for this PontoVenda.
     * 
     * @return nomePontoVenda
     */
    public java.lang.String getNomePontoVenda() {
        return nomePontoVenda;
    }


    /**
     * Sets the nomePontoVenda value for this PontoVenda.
     * 
     * @param nomePontoVenda
     */
    public void setNomePontoVenda(java.lang.String nomePontoVenda) {
        this.nomePontoVenda = nomePontoVenda;
    }


    /**
     * Gets the codBackOffice value for this PontoVenda.
     * 
     * @return codBackOffice
     */
    public int getCodBackOffice() {
        return codBackOffice;
    }


    /**
     * Sets the codBackOffice value for this PontoVenda.
     * 
     * @param codBackOffice
     */
    public void setCodBackOffice(int codBackOffice) {
        this.codBackOffice = codBackOffice;
    }


    /**
     * Gets the pccLocalVenda value for this PontoVenda.
     * 
     * @return pccLocalVenda
     */
    public java.lang.String getPccLocalVenda() {
        return pccLocalVenda;
    }


    /**
     * Sets the pccLocalVenda value for this PontoVenda.
     * 
     * @param pccLocalVenda
     */
    public void setPccLocalVenda(java.lang.String pccLocalVenda) {
        this.pccLocalVenda = pccLocalVenda;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PontoVenda)) return false;
        PontoVenda other = (PontoVenda) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nomePontoVenda==null && other.getNomePontoVenda()==null) || 
             (this.nomePontoVenda!=null &&
              this.nomePontoVenda.equals(other.getNomePontoVenda()))) &&
            this.codBackOffice == other.getCodBackOffice() &&
            ((this.pccLocalVenda==null && other.getPccLocalVenda()==null) || 
             (this.pccLocalVenda!=null &&
              this.pccLocalVenda.equals(other.getPccLocalVenda())));
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
        if (getNomePontoVenda() != null) {
            _hashCode += getNomePontoVenda().hashCode();
        }
        _hashCode += getCodBackOffice();
        if (getPccLocalVenda() != null) {
            _hashCode += getPccLocalVenda().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PontoVenda.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "pontoVenda"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomePontoVenda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomePontoVenda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codBackOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codBackOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pccLocalVenda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pccLocalVenda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
