/**
 * Budget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class Budget  implements java.io.Serializable {
    private br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef regionalRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.ModalidadeLancamentoBudget modalidadeLancamentoBudget;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoOperacaoBudget tipoOperacaoBudget;

    private double valor;

    public Budget() {
    }

    public Budget(
           br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef regionalRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.ModalidadeLancamentoBudget modalidadeLancamentoBudget,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoOperacaoBudget tipoOperacaoBudget,
           double valor) {
           this.regionalRef = regionalRef;
           this.centroDeCustoRef = centroDeCustoRef;
           this.subCentroDeCustoRef = subCentroDeCustoRef;
           this.modalidadeLancamentoBudget = modalidadeLancamentoBudget;
           this.tipoOperacaoBudget = tipoOperacaoBudget;
           this.valor = valor;
    }


    /**
     * Gets the regionalRef value for this Budget.
     * 
     * @return regionalRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef getRegionalRef() {
        return regionalRef;
    }


    /**
     * Sets the regionalRef value for this Budget.
     * 
     * @param regionalRef
     */
    public void setRegionalRef(br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef regionalRef) {
        this.regionalRef = regionalRef;
    }


    /**
     * Gets the centroDeCustoRef value for this Budget.
     * 
     * @return centroDeCustoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }


    /**
     * Sets the centroDeCustoRef value for this Budget.
     * 
     * @param centroDeCustoRef
     */
    public void setCentroDeCustoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef) {
        this.centroDeCustoRef = centroDeCustoRef;
    }


    /**
     * Gets the subCentroDeCustoRef value for this Budget.
     * 
     * @return subCentroDeCustoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef getSubCentroDeCustoRef() {
        return subCentroDeCustoRef;
    }


    /**
     * Sets the subCentroDeCustoRef value for this Budget.
     * 
     * @param subCentroDeCustoRef
     */
    public void setSubCentroDeCustoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef) {
        this.subCentroDeCustoRef = subCentroDeCustoRef;
    }


    /**
     * Gets the modalidadeLancamentoBudget value for this Budget.
     * 
     * @return modalidadeLancamentoBudget
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.ModalidadeLancamentoBudget getModalidadeLancamentoBudget() {
        return modalidadeLancamentoBudget;
    }


    /**
     * Sets the modalidadeLancamentoBudget value for this Budget.
     * 
     * @param modalidadeLancamentoBudget
     */
    public void setModalidadeLancamentoBudget(br.com.lemontech.selfbooking.wsselfbooking.beans.types.ModalidadeLancamentoBudget modalidadeLancamentoBudget) {
        this.modalidadeLancamentoBudget = modalidadeLancamentoBudget;
    }


    /**
     * Gets the tipoOperacaoBudget value for this Budget.
     * 
     * @return tipoOperacaoBudget
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoOperacaoBudget getTipoOperacaoBudget() {
        return tipoOperacaoBudget;
    }


    /**
     * Sets the tipoOperacaoBudget value for this Budget.
     * 
     * @param tipoOperacaoBudget
     */
    public void setTipoOperacaoBudget(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoOperacaoBudget tipoOperacaoBudget) {
        this.tipoOperacaoBudget = tipoOperacaoBudget;
    }


    /**
     * Gets the valor value for this Budget.
     * 
     * @return valor
     */
    public double getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this Budget.
     * 
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Budget)) return false;
        Budget other = (Budget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regionalRef==null && other.getRegionalRef()==null) || 
             (this.regionalRef!=null &&
              this.regionalRef.equals(other.getRegionalRef()))) &&
            ((this.centroDeCustoRef==null && other.getCentroDeCustoRef()==null) || 
             (this.centroDeCustoRef!=null &&
              this.centroDeCustoRef.equals(other.getCentroDeCustoRef()))) &&
            ((this.subCentroDeCustoRef==null && other.getSubCentroDeCustoRef()==null) || 
             (this.subCentroDeCustoRef!=null &&
              this.subCentroDeCustoRef.equals(other.getSubCentroDeCustoRef()))) &&
            ((this.modalidadeLancamentoBudget==null && other.getModalidadeLancamentoBudget()==null) || 
             (this.modalidadeLancamentoBudget!=null &&
              this.modalidadeLancamentoBudget.equals(other.getModalidadeLancamentoBudget()))) &&
            ((this.tipoOperacaoBudget==null && other.getTipoOperacaoBudget()==null) || 
             (this.tipoOperacaoBudget!=null &&
              this.tipoOperacaoBudget.equals(other.getTipoOperacaoBudget()))) &&
            this.valor == other.getValor();
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
        if (getRegionalRef() != null) {
            _hashCode += getRegionalRef().hashCode();
        }
        if (getCentroDeCustoRef() != null) {
            _hashCode += getCentroDeCustoRef().hashCode();
        }
        if (getSubCentroDeCustoRef() != null) {
            _hashCode += getSubCentroDeCustoRef().hashCode();
        }
        if (getModalidadeLancamentoBudget() != null) {
            _hashCode += getModalidadeLancamentoBudget().hashCode();
        }
        if (getTipoOperacaoBudget() != null) {
            _hashCode += getTipoOperacaoBudget().hashCode();
        }
        _hashCode += new Double(getValor()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Budget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "budget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionalRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionalRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "regionalRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroDeCustoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "centroDeCustoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "centroDeCustoRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCentroDeCustoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subCentroDeCustoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "subCentroDeCustoRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modalidadeLancamentoBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modalidadeLancamentoBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "modalidadeLancamentoBudget"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoOperacaoBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoOperacaoBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoOperacaoBudget"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
