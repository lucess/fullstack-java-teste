/**
 * IdentificadorIntegracaoRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class IdentificadorIntegracaoRef  implements java.io.Serializable {
    private java.lang.String identificadorIntegracao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoIntegracao tipoIntegracao;

    private java.lang.String tipoConector;

    private java.lang.String nomeConector;

    private int idSolicitacaoRef;

    private int idAereoRef;

    private int idHotelRef;

    private int idCarroRef;

    private int idOutroRef;

    private int idSeguroRef;

    private int idTrasladoRef;

    private int idRodoviarioRef;

    public IdentificadorIntegracaoRef() {
    }

    public IdentificadorIntegracaoRef(
           java.lang.String identificadorIntegracao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoIntegracao tipoIntegracao,
           java.lang.String tipoConector,
           java.lang.String nomeConector,
           int idSolicitacaoRef,
           int idAereoRef,
           int idHotelRef,
           int idCarroRef,
           int idOutroRef,
           int idSeguroRef,
           int idTrasladoRef,
           int idRodoviarioRef) {
           this.identificadorIntegracao = identificadorIntegracao;
           this.tipoIntegracao = tipoIntegracao;
           this.tipoConector = tipoConector;
           this.nomeConector = nomeConector;
           this.idSolicitacaoRef = idSolicitacaoRef;
           this.idAereoRef = idAereoRef;
           this.idHotelRef = idHotelRef;
           this.idCarroRef = idCarroRef;
           this.idOutroRef = idOutroRef;
           this.idSeguroRef = idSeguroRef;
           this.idTrasladoRef = idTrasladoRef;
           this.idRodoviarioRef = idRodoviarioRef;
    }


    /**
     * Gets the identificadorIntegracao value for this IdentificadorIntegracaoRef.
     * 
     * @return identificadorIntegracao
     */
    public java.lang.String getIdentificadorIntegracao() {
        return identificadorIntegracao;
    }


    /**
     * Sets the identificadorIntegracao value for this IdentificadorIntegracaoRef.
     * 
     * @param identificadorIntegracao
     */
    public void setIdentificadorIntegracao(java.lang.String identificadorIntegracao) {
        this.identificadorIntegracao = identificadorIntegracao;
    }


    /**
     * Gets the tipoIntegracao value for this IdentificadorIntegracaoRef.
     * 
     * @return tipoIntegracao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoIntegracao getTipoIntegracao() {
        return tipoIntegracao;
    }


    /**
     * Sets the tipoIntegracao value for this IdentificadorIntegracaoRef.
     * 
     * @param tipoIntegracao
     */
    public void setTipoIntegracao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoIntegracao tipoIntegracao) {
        this.tipoIntegracao = tipoIntegracao;
    }


    /**
     * Gets the tipoConector value for this IdentificadorIntegracaoRef.
     * 
     * @return tipoConector
     */
    public java.lang.String getTipoConector() {
        return tipoConector;
    }


    /**
     * Sets the tipoConector value for this IdentificadorIntegracaoRef.
     * 
     * @param tipoConector
     */
    public void setTipoConector(java.lang.String tipoConector) {
        this.tipoConector = tipoConector;
    }


    /**
     * Gets the nomeConector value for this IdentificadorIntegracaoRef.
     * 
     * @return nomeConector
     */
    public java.lang.String getNomeConector() {
        return nomeConector;
    }


    /**
     * Sets the nomeConector value for this IdentificadorIntegracaoRef.
     * 
     * @param nomeConector
     */
    public void setNomeConector(java.lang.String nomeConector) {
        this.nomeConector = nomeConector;
    }


    /**
     * Gets the idSolicitacaoRef value for this IdentificadorIntegracaoRef.
     * 
     * @return idSolicitacaoRef
     */
    public int getIdSolicitacaoRef() {
        return idSolicitacaoRef;
    }


    /**
     * Sets the idSolicitacaoRef value for this IdentificadorIntegracaoRef.
     * 
     * @param idSolicitacaoRef
     */
    public void setIdSolicitacaoRef(int idSolicitacaoRef) {
        this.idSolicitacaoRef = idSolicitacaoRef;
    }


    /**
     * Gets the idAereoRef value for this IdentificadorIntegracaoRef.
     * 
     * @return idAereoRef
     */
    public int getIdAereoRef() {
        return idAereoRef;
    }


    /**
     * Sets the idAereoRef value for this IdentificadorIntegracaoRef.
     * 
     * @param idAereoRef
     */
    public void setIdAereoRef(int idAereoRef) {
        this.idAereoRef = idAereoRef;
    }


    /**
     * Gets the idHotelRef value for this IdentificadorIntegracaoRef.
     * 
     * @return idHotelRef
     */
    public int getIdHotelRef() {
        return idHotelRef;
    }


    /**
     * Sets the idHotelRef value for this IdentificadorIntegracaoRef.
     * 
     * @param idHotelRef
     */
    public void setIdHotelRef(int idHotelRef) {
        this.idHotelRef = idHotelRef;
    }


    /**
     * Gets the idCarroRef value for this IdentificadorIntegracaoRef.
     * 
     * @return idCarroRef
     */
    public int getIdCarroRef() {
        return idCarroRef;
    }


    /**
     * Sets the idCarroRef value for this IdentificadorIntegracaoRef.
     * 
     * @param idCarroRef
     */
    public void setIdCarroRef(int idCarroRef) {
        this.idCarroRef = idCarroRef;
    }


    /**
     * Gets the idOutroRef value for this IdentificadorIntegracaoRef.
     * 
     * @return idOutroRef
     */
    public int getIdOutroRef() {
        return idOutroRef;
    }


    /**
     * Sets the idOutroRef value for this IdentificadorIntegracaoRef.
     * 
     * @param idOutroRef
     */
    public void setIdOutroRef(int idOutroRef) {
        this.idOutroRef = idOutroRef;
    }


    /**
     * Gets the idSeguroRef value for this IdentificadorIntegracaoRef.
     * 
     * @return idSeguroRef
     */
    public int getIdSeguroRef() {
        return idSeguroRef;
    }


    /**
     * Sets the idSeguroRef value for this IdentificadorIntegracaoRef.
     * 
     * @param idSeguroRef
     */
    public void setIdSeguroRef(int idSeguroRef) {
        this.idSeguroRef = idSeguroRef;
    }


    /**
     * Gets the idTrasladoRef value for this IdentificadorIntegracaoRef.
     * 
     * @return idTrasladoRef
     */
    public int getIdTrasladoRef() {
        return idTrasladoRef;
    }


    /**
     * Sets the idTrasladoRef value for this IdentificadorIntegracaoRef.
     * 
     * @param idTrasladoRef
     */
    public void setIdTrasladoRef(int idTrasladoRef) {
        this.idTrasladoRef = idTrasladoRef;
    }


    /**
     * Gets the idRodoviarioRef value for this IdentificadorIntegracaoRef.
     * 
     * @return idRodoviarioRef
     */
    public int getIdRodoviarioRef() {
        return idRodoviarioRef;
    }


    /**
     * Sets the idRodoviarioRef value for this IdentificadorIntegracaoRef.
     * 
     * @param idRodoviarioRef
     */
    public void setIdRodoviarioRef(int idRodoviarioRef) {
        this.idRodoviarioRef = idRodoviarioRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificadorIntegracaoRef)) return false;
        IdentificadorIntegracaoRef other = (IdentificadorIntegracaoRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificadorIntegracao==null && other.getIdentificadorIntegracao()==null) || 
             (this.identificadorIntegracao!=null &&
              this.identificadorIntegracao.equals(other.getIdentificadorIntegracao()))) &&
            ((this.tipoIntegracao==null && other.getTipoIntegracao()==null) || 
             (this.tipoIntegracao!=null &&
              this.tipoIntegracao.equals(other.getTipoIntegracao()))) &&
            ((this.tipoConector==null && other.getTipoConector()==null) || 
             (this.tipoConector!=null &&
              this.tipoConector.equals(other.getTipoConector()))) &&
            ((this.nomeConector==null && other.getNomeConector()==null) || 
             (this.nomeConector!=null &&
              this.nomeConector.equals(other.getNomeConector()))) &&
            this.idSolicitacaoRef == other.getIdSolicitacaoRef() &&
            this.idAereoRef == other.getIdAereoRef() &&
            this.idHotelRef == other.getIdHotelRef() &&
            this.idCarroRef == other.getIdCarroRef() &&
            this.idOutroRef == other.getIdOutroRef() &&
            this.idSeguroRef == other.getIdSeguroRef() &&
            this.idTrasladoRef == other.getIdTrasladoRef() &&
            this.idRodoviarioRef == other.getIdRodoviarioRef();
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
        if (getIdentificadorIntegracao() != null) {
            _hashCode += getIdentificadorIntegracao().hashCode();
        }
        if (getTipoIntegracao() != null) {
            _hashCode += getTipoIntegracao().hashCode();
        }
        if (getTipoConector() != null) {
            _hashCode += getTipoConector().hashCode();
        }
        if (getNomeConector() != null) {
            _hashCode += getNomeConector().hashCode();
        }
        _hashCode += getIdSolicitacaoRef();
        _hashCode += getIdAereoRef();
        _hashCode += getIdHotelRef();
        _hashCode += getIdCarroRef();
        _hashCode += getIdOutroRef();
        _hashCode += getIdSeguroRef();
        _hashCode += getIdTrasladoRef();
        _hashCode += getIdRodoviarioRef();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificadorIntegracaoRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "identificadorIntegracaoRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorIntegracao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorIntegracao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIntegracao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoIntegracao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoIntegracao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoConector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoConector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeConector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeConector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacaoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSolicitacaoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAereoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idAereoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idHotelRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idHotelRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCarroRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCarroRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idOutroRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idOutroRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSeguroRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSeguroRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTrasladoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idTrasladoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRodoviarioRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idRodoviarioRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
