/**
 * AtualizarBudgetRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class AtualizarBudgetRequest  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.Budget budget;

    public AtualizarBudgetRequest() {
    }

    public AtualizarBudgetRequest(
           br.com.lemontech.selfbooking.wsselfbooking.beans.Budget budget) {
           this.budget = budget;
    }


    /**
     * Gets the budget value for this AtualizarBudgetRequest.
     * 
     * @return budget
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Budget getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this AtualizarBudgetRequest.
     * 
     * @param budget
     */
    public void setBudget(br.com.lemontech.selfbooking.wsselfbooking.beans.Budget budget) {
        this.budget = budget;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtualizarBudgetRequest)) return false;
        AtualizarBudgetRequest other = (AtualizarBudgetRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget())));
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
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtualizarBudgetRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "atualizarBudgetRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "budget"));
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
