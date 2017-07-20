/**
 * Consolidadora.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

public class Consolidadora  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.String identificadorIntegracao;

    private java.lang.String identificadorIntegracaoAgencia;

    private java.lang.String usuario;

    private java.lang.String unidadeOperacional;

    private java.lang.String unidadeOperacionalAdicional;

    private int id;

    public Consolidadora() {
    }

    public Consolidadora(
           java.lang.String nome,
           java.lang.String identificadorIntegracao,
           java.lang.String identificadorIntegracaoAgencia,
           java.lang.String usuario,
           java.lang.String unidadeOperacional,
           java.lang.String unidadeOperacionalAdicional,
           int id) {
           this.nome = nome;
           this.identificadorIntegracao = identificadorIntegracao;
           this.identificadorIntegracaoAgencia = identificadorIntegracaoAgencia;
           this.usuario = usuario;
           this.unidadeOperacional = unidadeOperacional;
           this.unidadeOperacionalAdicional = unidadeOperacionalAdicional;
           this.id = id;
    }


    /**
     * Gets the nome value for this Consolidadora.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Consolidadora.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the identificadorIntegracao value for this Consolidadora.
     * 
     * @return identificadorIntegracao
     */
    public java.lang.String getIdentificadorIntegracao() {
        return identificadorIntegracao;
    }


    /**
     * Sets the identificadorIntegracao value for this Consolidadora.
     * 
     * @param identificadorIntegracao
     */
    public void setIdentificadorIntegracao(java.lang.String identificadorIntegracao) {
        this.identificadorIntegracao = identificadorIntegracao;
    }


    /**
     * Gets the identificadorIntegracaoAgencia value for this Consolidadora.
     * 
     * @return identificadorIntegracaoAgencia
     */
    public java.lang.String getIdentificadorIntegracaoAgencia() {
        return identificadorIntegracaoAgencia;
    }


    /**
     * Sets the identificadorIntegracaoAgencia value for this Consolidadora.
     * 
     * @param identificadorIntegracaoAgencia
     */
    public void setIdentificadorIntegracaoAgencia(java.lang.String identificadorIntegracaoAgencia) {
        this.identificadorIntegracaoAgencia = identificadorIntegracaoAgencia;
    }


    /**
     * Gets the usuario value for this Consolidadora.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this Consolidadora.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the unidadeOperacional value for this Consolidadora.
     * 
     * @return unidadeOperacional
     */
    public java.lang.String getUnidadeOperacional() {
        return unidadeOperacional;
    }


    /**
     * Sets the unidadeOperacional value for this Consolidadora.
     * 
     * @param unidadeOperacional
     */
    public void setUnidadeOperacional(java.lang.String unidadeOperacional) {
        this.unidadeOperacional = unidadeOperacional;
    }


    /**
     * Gets the unidadeOperacionalAdicional value for this Consolidadora.
     * 
     * @return unidadeOperacionalAdicional
     */
    public java.lang.String getUnidadeOperacionalAdicional() {
        return unidadeOperacionalAdicional;
    }


    /**
     * Sets the unidadeOperacionalAdicional value for this Consolidadora.
     * 
     * @param unidadeOperacionalAdicional
     */
    public void setUnidadeOperacionalAdicional(java.lang.String unidadeOperacionalAdicional) {
        this.unidadeOperacionalAdicional = unidadeOperacionalAdicional;
    }


    /**
     * Gets the id value for this Consolidadora.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Consolidadora.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Consolidadora)) return false;
        Consolidadora other = (Consolidadora) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.identificadorIntegracao==null && other.getIdentificadorIntegracao()==null) || 
             (this.identificadorIntegracao!=null &&
              this.identificadorIntegracao.equals(other.getIdentificadorIntegracao()))) &&
            ((this.identificadorIntegracaoAgencia==null && other.getIdentificadorIntegracaoAgencia()==null) || 
             (this.identificadorIntegracaoAgencia!=null &&
              this.identificadorIntegracaoAgencia.equals(other.getIdentificadorIntegracaoAgencia()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.unidadeOperacional==null && other.getUnidadeOperacional()==null) || 
             (this.unidadeOperacional!=null &&
              this.unidadeOperacional.equals(other.getUnidadeOperacional()))) &&
            ((this.unidadeOperacionalAdicional==null && other.getUnidadeOperacionalAdicional()==null) || 
             (this.unidadeOperacionalAdicional!=null &&
              this.unidadeOperacionalAdicional.equals(other.getUnidadeOperacionalAdicional()))) &&
            this.id == other.getId();
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getIdentificadorIntegracao() != null) {
            _hashCode += getIdentificadorIntegracao().hashCode();
        }
        if (getIdentificadorIntegracaoAgencia() != null) {
            _hashCode += getIdentificadorIntegracaoAgencia().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getUnidadeOperacional() != null) {
            _hashCode += getUnidadeOperacional().hashCode();
        }
        if (getUnidadeOperacionalAdicional() != null) {
            _hashCode += getUnidadeOperacionalAdicional().hashCode();
        }
        _hashCode += getId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Consolidadora.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "consolidadora"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorIntegracao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorIntegracao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorIntegracaoAgencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorIntegracaoAgencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadeOperacional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidadeOperacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadeOperacionalAdicional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidadeOperacionalAdicional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
