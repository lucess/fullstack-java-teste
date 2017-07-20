/**
 * Regional.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class Regional  extends br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef  implements java.io.Serializable {
    private java.lang.String descricao;

    private java.lang.String pcc;

    private java.lang.String identificadorBackofficeCliente;

    private java.lang.String identificadorBackofficeFranquia;

    private boolean ativo;

    private java.lang.Double taxaFee;

    private java.lang.String corporateIdGol;

    public Regional() {
    }

    public Regional(
           java.lang.String codigo,
           java.lang.String descricao,
           java.lang.String pcc,
           java.lang.String identificadorBackofficeCliente,
           java.lang.String identificadorBackofficeFranquia,
           boolean ativo,
           java.lang.Double taxaFee,
           java.lang.String corporateIdGol) {
        super(
            codigo);
        this.descricao = descricao;
        this.pcc = pcc;
        this.identificadorBackofficeCliente = identificadorBackofficeCliente;
        this.identificadorBackofficeFranquia = identificadorBackofficeFranquia;
        this.ativo = ativo;
        this.taxaFee = taxaFee;
        this.corporateIdGol = corporateIdGol;
    }


    /**
     * Gets the descricao value for this Regional.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Regional.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the pcc value for this Regional.
     * 
     * @return pcc
     */
    public java.lang.String getPcc() {
        return pcc;
    }


    /**
     * Sets the pcc value for this Regional.
     * 
     * @param pcc
     */
    public void setPcc(java.lang.String pcc) {
        this.pcc = pcc;
    }


    /**
     * Gets the identificadorBackofficeCliente value for this Regional.
     * 
     * @return identificadorBackofficeCliente
     */
    public java.lang.String getIdentificadorBackofficeCliente() {
        return identificadorBackofficeCliente;
    }


    /**
     * Sets the identificadorBackofficeCliente value for this Regional.
     * 
     * @param identificadorBackofficeCliente
     */
    public void setIdentificadorBackofficeCliente(java.lang.String identificadorBackofficeCliente) {
        this.identificadorBackofficeCliente = identificadorBackofficeCliente;
    }


    /**
     * Gets the identificadorBackofficeFranquia value for this Regional.
     * 
     * @return identificadorBackofficeFranquia
     */
    public java.lang.String getIdentificadorBackofficeFranquia() {
        return identificadorBackofficeFranquia;
    }


    /**
     * Sets the identificadorBackofficeFranquia value for this Regional.
     * 
     * @param identificadorBackofficeFranquia
     */
    public void setIdentificadorBackofficeFranquia(java.lang.String identificadorBackofficeFranquia) {
        this.identificadorBackofficeFranquia = identificadorBackofficeFranquia;
    }


    /**
     * Gets the ativo value for this Regional.
     * 
     * @return ativo
     */
    public boolean isAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this Regional.
     * 
     * @param ativo
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    /**
     * Gets the taxaFee value for this Regional.
     * 
     * @return taxaFee
     */
    public java.lang.Double getTaxaFee() {
        return taxaFee;
    }


    /**
     * Sets the taxaFee value for this Regional.
     * 
     * @param taxaFee
     */
    public void setTaxaFee(java.lang.Double taxaFee) {
        this.taxaFee = taxaFee;
    }


    /**
     * Gets the corporateIdGol value for this Regional.
     * 
     * @return corporateIdGol
     */
    public java.lang.String getCorporateIdGol() {
        return corporateIdGol;
    }


    /**
     * Sets the corporateIdGol value for this Regional.
     * 
     * @param corporateIdGol
     */
    public void setCorporateIdGol(java.lang.String corporateIdGol) {
        this.corporateIdGol = corporateIdGol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Regional)) return false;
        Regional other = (Regional) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.pcc==null && other.getPcc()==null) || 
             (this.pcc!=null &&
              this.pcc.equals(other.getPcc()))) &&
            ((this.identificadorBackofficeCliente==null && other.getIdentificadorBackofficeCliente()==null) || 
             (this.identificadorBackofficeCliente!=null &&
              this.identificadorBackofficeCliente.equals(other.getIdentificadorBackofficeCliente()))) &&
            ((this.identificadorBackofficeFranquia==null && other.getIdentificadorBackofficeFranquia()==null) || 
             (this.identificadorBackofficeFranquia!=null &&
              this.identificadorBackofficeFranquia.equals(other.getIdentificadorBackofficeFranquia()))) &&
            this.ativo == other.isAtivo() &&
            ((this.taxaFee==null && other.getTaxaFee()==null) || 
             (this.taxaFee!=null &&
              this.taxaFee.equals(other.getTaxaFee()))) &&
            ((this.corporateIdGol==null && other.getCorporateIdGol()==null) || 
             (this.corporateIdGol!=null &&
              this.corporateIdGol.equals(other.getCorporateIdGol())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getPcc() != null) {
            _hashCode += getPcc().hashCode();
        }
        if (getIdentificadorBackofficeCliente() != null) {
            _hashCode += getIdentificadorBackofficeCliente().hashCode();
        }
        if (getIdentificadorBackofficeFranquia() != null) {
            _hashCode += getIdentificadorBackofficeFranquia().hashCode();
        }
        _hashCode += (isAtivo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTaxaFee() != null) {
            _hashCode += getTaxaFee().hashCode();
        }
        if (getCorporateIdGol() != null) {
            _hashCode += getCorporateIdGol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Regional.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "regional"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pcc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorBackofficeCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorBackofficeCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorBackofficeFranquia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorBackofficeFranquia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxaFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxaFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateIdGol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corporateIdGol"));
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
