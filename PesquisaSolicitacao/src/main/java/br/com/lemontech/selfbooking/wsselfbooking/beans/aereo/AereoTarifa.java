/**
 * AereoTarifa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

public class AereoTarifa  implements java.io.Serializable {
    private java.lang.String acordo;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Classe classe;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoTarifaPax[] aereoTarifaPax;

    public AereoTarifa() {
    }

    public AereoTarifa(
           java.lang.String acordo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Classe classe,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoTarifaPax[] aereoTarifaPax) {
           this.acordo = acordo;
           this.classe = classe;
           this.aereoTarifaPax = aereoTarifaPax;
    }


    /**
     * Gets the acordo value for this AereoTarifa.
     * 
     * @return acordo
     */
    public java.lang.String getAcordo() {
        return acordo;
    }


    /**
     * Sets the acordo value for this AereoTarifa.
     * 
     * @param acordo
     */
    public void setAcordo(java.lang.String acordo) {
        this.acordo = acordo;
    }


    /**
     * Gets the classe value for this AereoTarifa.
     * 
     * @return classe
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Classe getClasse() {
        return classe;
    }


    /**
     * Sets the classe value for this AereoTarifa.
     * 
     * @param classe
     */
    public void setClasse(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Classe classe) {
        this.classe = classe;
    }


    /**
     * Gets the aereoTarifaPax value for this AereoTarifa.
     * 
     * @return aereoTarifaPax
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoTarifaPax[] getAereoTarifaPax() {
        return aereoTarifaPax;
    }


    /**
     * Sets the aereoTarifaPax value for this AereoTarifa.
     * 
     * @param aereoTarifaPax
     */
    public void setAereoTarifaPax(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoTarifaPax[] aereoTarifaPax) {
        this.aereoTarifaPax = aereoTarifaPax;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoTarifaPax getAereoTarifaPax(int i) {
        return this.aereoTarifaPax[i];
    }

    public void setAereoTarifaPax(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoTarifaPax _value) {
        this.aereoTarifaPax[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AereoTarifa)) return false;
        AereoTarifa other = (AereoTarifa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acordo==null && other.getAcordo()==null) || 
             (this.acordo!=null &&
              this.acordo.equals(other.getAcordo()))) &&
            ((this.classe==null && other.getClasse()==null) || 
             (this.classe!=null &&
              this.classe.equals(other.getClasse()))) &&
            ((this.aereoTarifaPax==null && other.getAereoTarifaPax()==null) || 
             (this.aereoTarifaPax!=null &&
              java.util.Arrays.equals(this.aereoTarifaPax, other.getAereoTarifaPax())));
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
        if (getAcordo() != null) {
            _hashCode += getAcordo().hashCode();
        }
        if (getClasse() != null) {
            _hashCode += getClasse().hashCode();
        }
        if (getAereoTarifaPax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAereoTarifaPax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAereoTarifaPax(), i);
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
        new org.apache.axis.description.TypeDesc(AereoTarifa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoTarifa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acordo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acordo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "classe"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aereoTarifaPax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aereoTarifaPax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoTarifaPax"));
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
