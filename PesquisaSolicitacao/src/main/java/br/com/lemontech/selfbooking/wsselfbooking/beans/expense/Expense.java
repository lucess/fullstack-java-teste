/**
 * Expense.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

public class Expense  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.expense.Adiantamento adiantamento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.expense.PrestacaoContas prestacaoContas;

    public Expense() {
    }

    public Expense(
           br.com.lemontech.selfbooking.wsselfbooking.beans.expense.Adiantamento adiantamento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.expense.PrestacaoContas prestacaoContas) {
           this.adiantamento = adiantamento;
           this.prestacaoContas = prestacaoContas;
    }


    /**
     * Gets the adiantamento value for this Expense.
     * 
     * @return adiantamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.expense.Adiantamento getAdiantamento() {
        return adiantamento;
    }


    /**
     * Sets the adiantamento value for this Expense.
     * 
     * @param adiantamento
     */
    public void setAdiantamento(br.com.lemontech.selfbooking.wsselfbooking.beans.expense.Adiantamento adiantamento) {
        this.adiantamento = adiantamento;
    }


    /**
     * Gets the prestacaoContas value for this Expense.
     * 
     * @return prestacaoContas
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.expense.PrestacaoContas getPrestacaoContas() {
        return prestacaoContas;
    }


    /**
     * Sets the prestacaoContas value for this Expense.
     * 
     * @param prestacaoContas
     */
    public void setPrestacaoContas(br.com.lemontech.selfbooking.wsselfbooking.beans.expense.PrestacaoContas prestacaoContas) {
        this.prestacaoContas = prestacaoContas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Expense)) return false;
        Expense other = (Expense) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adiantamento==null && other.getAdiantamento()==null) || 
             (this.adiantamento!=null &&
              this.adiantamento.equals(other.getAdiantamento()))) &&
            ((this.prestacaoContas==null && other.getPrestacaoContas()==null) || 
             (this.prestacaoContas!=null &&
              this.prestacaoContas.equals(other.getPrestacaoContas())));
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
        if (getAdiantamento() != null) {
            _hashCode += getAdiantamento().hashCode();
        }
        if (getPrestacaoContas() != null) {
            _hashCode += getPrestacaoContas().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Expense.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "expense"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adiantamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adiantamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "adiantamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prestacaoContas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prestacaoContas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "prestacaoContas"));
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
