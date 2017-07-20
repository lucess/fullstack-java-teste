/**
 * AdiantamentoItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

public class AdiantamentoItem  implements java.io.Serializable {
    private java.lang.String tipoDespesa;

    private java.lang.Double valor;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda;

    public AdiantamentoItem() {
    }

    public AdiantamentoItem(
           java.lang.String tipoDespesa,
           java.lang.Double valor,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda) {
           this.tipoDespesa = tipoDespesa;
           this.valor = valor;
           this.moeda = moeda;
    }


    /**
     * Gets the tipoDespesa value for this AdiantamentoItem.
     * 
     * @return tipoDespesa
     */
    public java.lang.String getTipoDespesa() {
        return tipoDespesa;
    }


    /**
     * Sets the tipoDespesa value for this AdiantamentoItem.
     * 
     * @param tipoDespesa
     */
    public void setTipoDespesa(java.lang.String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }


    /**
     * Gets the valor value for this AdiantamentoItem.
     * 
     * @return valor
     */
    public java.lang.Double getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this AdiantamentoItem.
     * 
     * @param valor
     */
    public void setValor(java.lang.Double valor) {
        this.valor = valor;
    }


    /**
     * Gets the moeda value for this AdiantamentoItem.
     * 
     * @return moeda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this AdiantamentoItem.
     * 
     * @param moeda
     */
    public void setMoeda(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda moeda) {
        this.moeda = moeda;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdiantamentoItem)) return false;
        AdiantamentoItem other = (AdiantamentoItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoDespesa==null && other.getTipoDespesa()==null) || 
             (this.tipoDespesa!=null &&
              this.tipoDespesa.equals(other.getTipoDespesa()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor()))) &&
            ((this.moeda==null && other.getMoeda()==null) || 
             (this.moeda!=null &&
              this.moeda.equals(other.getMoeda())));
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
        if (getTipoDespesa() != null) {
            _hashCode += getTipoDespesa().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        if (getMoeda() != null) {
            _hashCode += getMoeda().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdiantamentoItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "adiantamentoItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDespesa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDespesa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moeda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moeda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "moeda"));
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
