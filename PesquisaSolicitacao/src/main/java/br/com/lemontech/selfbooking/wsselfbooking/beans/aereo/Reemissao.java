/**
 * Reemissao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

public class Reemissao  implements java.io.Serializable {
    private java.lang.String bilheteOriginal;

    private java.lang.String bilheteReemissao;

    private java.lang.Double credito;

    private java.lang.Double multa;

    private java.lang.String documentoMulta;

    private java.lang.String documentoCredito;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoColetaMulta tipoColetaMulta;

    private java.lang.String taxaColeta;

    public Reemissao() {
    }

    public Reemissao(
           java.lang.String bilheteOriginal,
           java.lang.String bilheteReemissao,
           java.lang.Double credito,
           java.lang.Double multa,
           java.lang.String documentoMulta,
           java.lang.String documentoCredito,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoColetaMulta tipoColetaMulta,
           java.lang.String taxaColeta) {
           this.bilheteOriginal = bilheteOriginal;
           this.bilheteReemissao = bilheteReemissao;
           this.credito = credito;
           this.multa = multa;
           this.documentoMulta = documentoMulta;
           this.documentoCredito = documentoCredito;
           this.tipoColetaMulta = tipoColetaMulta;
           this.taxaColeta = taxaColeta;
    }


    /**
     * Gets the bilheteOriginal value for this Reemissao.
     * 
     * @return bilheteOriginal
     */
    public java.lang.String getBilheteOriginal() {
        return bilheteOriginal;
    }


    /**
     * Sets the bilheteOriginal value for this Reemissao.
     * 
     * @param bilheteOriginal
     */
    public void setBilheteOriginal(java.lang.String bilheteOriginal) {
        this.bilheteOriginal = bilheteOriginal;
    }


    /**
     * Gets the bilheteReemissao value for this Reemissao.
     * 
     * @return bilheteReemissao
     */
    public java.lang.String getBilheteReemissao() {
        return bilheteReemissao;
    }


    /**
     * Sets the bilheteReemissao value for this Reemissao.
     * 
     * @param bilheteReemissao
     */
    public void setBilheteReemissao(java.lang.String bilheteReemissao) {
        this.bilheteReemissao = bilheteReemissao;
    }


    /**
     * Gets the credito value for this Reemissao.
     * 
     * @return credito
     */
    public java.lang.Double getCredito() {
        return credito;
    }


    /**
     * Sets the credito value for this Reemissao.
     * 
     * @param credito
     */
    public void setCredito(java.lang.Double credito) {
        this.credito = credito;
    }


    /**
     * Gets the multa value for this Reemissao.
     * 
     * @return multa
     */
    public java.lang.Double getMulta() {
        return multa;
    }


    /**
     * Sets the multa value for this Reemissao.
     * 
     * @param multa
     */
    public void setMulta(java.lang.Double multa) {
        this.multa = multa;
    }


    /**
     * Gets the documentoMulta value for this Reemissao.
     * 
     * @return documentoMulta
     */
    public java.lang.String getDocumentoMulta() {
        return documentoMulta;
    }


    /**
     * Sets the documentoMulta value for this Reemissao.
     * 
     * @param documentoMulta
     */
    public void setDocumentoMulta(java.lang.String documentoMulta) {
        this.documentoMulta = documentoMulta;
    }


    /**
     * Gets the documentoCredito value for this Reemissao.
     * 
     * @return documentoCredito
     */
    public java.lang.String getDocumentoCredito() {
        return documentoCredito;
    }


    /**
     * Sets the documentoCredito value for this Reemissao.
     * 
     * @param documentoCredito
     */
    public void setDocumentoCredito(java.lang.String documentoCredito) {
        this.documentoCredito = documentoCredito;
    }


    /**
     * Gets the tipoColetaMulta value for this Reemissao.
     * 
     * @return tipoColetaMulta
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoColetaMulta getTipoColetaMulta() {
        return tipoColetaMulta;
    }


    /**
     * Sets the tipoColetaMulta value for this Reemissao.
     * 
     * @param tipoColetaMulta
     */
    public void setTipoColetaMulta(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoColetaMulta tipoColetaMulta) {
        this.tipoColetaMulta = tipoColetaMulta;
    }


    /**
     * Gets the taxaColeta value for this Reemissao.
     * 
     * @return taxaColeta
     */
    public java.lang.String getTaxaColeta() {
        return taxaColeta;
    }


    /**
     * Sets the taxaColeta value for this Reemissao.
     * 
     * @param taxaColeta
     */
    public void setTaxaColeta(java.lang.String taxaColeta) {
        this.taxaColeta = taxaColeta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reemissao)) return false;
        Reemissao other = (Reemissao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bilheteOriginal==null && other.getBilheteOriginal()==null) || 
             (this.bilheteOriginal!=null &&
              this.bilheteOriginal.equals(other.getBilheteOriginal()))) &&
            ((this.bilheteReemissao==null && other.getBilheteReemissao()==null) || 
             (this.bilheteReemissao!=null &&
              this.bilheteReemissao.equals(other.getBilheteReemissao()))) &&
            ((this.credito==null && other.getCredito()==null) || 
             (this.credito!=null &&
              this.credito.equals(other.getCredito()))) &&
            ((this.multa==null && other.getMulta()==null) || 
             (this.multa!=null &&
              this.multa.equals(other.getMulta()))) &&
            ((this.documentoMulta==null && other.getDocumentoMulta()==null) || 
             (this.documentoMulta!=null &&
              this.documentoMulta.equals(other.getDocumentoMulta()))) &&
            ((this.documentoCredito==null && other.getDocumentoCredito()==null) || 
             (this.documentoCredito!=null &&
              this.documentoCredito.equals(other.getDocumentoCredito()))) &&
            ((this.tipoColetaMulta==null && other.getTipoColetaMulta()==null) || 
             (this.tipoColetaMulta!=null &&
              this.tipoColetaMulta.equals(other.getTipoColetaMulta()))) &&
            ((this.taxaColeta==null && other.getTaxaColeta()==null) || 
             (this.taxaColeta!=null &&
              this.taxaColeta.equals(other.getTaxaColeta())));
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
        if (getBilheteOriginal() != null) {
            _hashCode += getBilheteOriginal().hashCode();
        }
        if (getBilheteReemissao() != null) {
            _hashCode += getBilheteReemissao().hashCode();
        }
        if (getCredito() != null) {
            _hashCode += getCredito().hashCode();
        }
        if (getMulta() != null) {
            _hashCode += getMulta().hashCode();
        }
        if (getDocumentoMulta() != null) {
            _hashCode += getDocumentoMulta().hashCode();
        }
        if (getDocumentoCredito() != null) {
            _hashCode += getDocumentoCredito().hashCode();
        }
        if (getTipoColetaMulta() != null) {
            _hashCode += getTipoColetaMulta().hashCode();
        }
        if (getTaxaColeta() != null) {
            _hashCode += getTaxaColeta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reemissao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "reemissao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bilheteOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bilheteOriginal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bilheteReemissao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bilheteReemissao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "multa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoMulta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentoMulta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoCredito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentoCredito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoColetaMulta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoColetaMulta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoColetaMulta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxaColeta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxaColeta"));
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
