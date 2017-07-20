/**
 * Contato.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class Contato  implements java.io.Serializable {
    /* Email. */
    private java.lang.String email;

    private java.lang.String ddiTelefone;

    private java.lang.String dddTelefone;

    private java.lang.String telefone;

    private java.lang.String ddiCelular;

    private java.lang.String dddCelular;

    private java.lang.String celular;

    private java.lang.Boolean forcaAtualizacao;

    public Contato() {
    }

    public Contato(
           java.lang.String email,
           java.lang.String ddiTelefone,
           java.lang.String dddTelefone,
           java.lang.String telefone,
           java.lang.String ddiCelular,
           java.lang.String dddCelular,
           java.lang.String celular,
           java.lang.Boolean forcaAtualizacao) {
           this.email = email;
           this.ddiTelefone = ddiTelefone;
           this.dddTelefone = dddTelefone;
           this.telefone = telefone;
           this.ddiCelular = ddiCelular;
           this.dddCelular = dddCelular;
           this.celular = celular;
           this.forcaAtualizacao = forcaAtualizacao;
    }


    /**
     * Gets the email value for this Contato.
     * 
     * @return email   * Email.
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Contato.
     * 
     * @param email   * Email.
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the ddiTelefone value for this Contato.
     * 
     * @return ddiTelefone
     */
    public java.lang.String getDdiTelefone() {
        return ddiTelefone;
    }


    /**
     * Sets the ddiTelefone value for this Contato.
     * 
     * @param ddiTelefone
     */
    public void setDdiTelefone(java.lang.String ddiTelefone) {
        this.ddiTelefone = ddiTelefone;
    }


    /**
     * Gets the dddTelefone value for this Contato.
     * 
     * @return dddTelefone
     */
    public java.lang.String getDddTelefone() {
        return dddTelefone;
    }


    /**
     * Sets the dddTelefone value for this Contato.
     * 
     * @param dddTelefone
     */
    public void setDddTelefone(java.lang.String dddTelefone) {
        this.dddTelefone = dddTelefone;
    }


    /**
     * Gets the telefone value for this Contato.
     * 
     * @return telefone
     */
    public java.lang.String getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this Contato.
     * 
     * @param telefone
     */
    public void setTelefone(java.lang.String telefone) {
        this.telefone = telefone;
    }


    /**
     * Gets the ddiCelular value for this Contato.
     * 
     * @return ddiCelular
     */
    public java.lang.String getDdiCelular() {
        return ddiCelular;
    }


    /**
     * Sets the ddiCelular value for this Contato.
     * 
     * @param ddiCelular
     */
    public void setDdiCelular(java.lang.String ddiCelular) {
        this.ddiCelular = ddiCelular;
    }


    /**
     * Gets the dddCelular value for this Contato.
     * 
     * @return dddCelular
     */
    public java.lang.String getDddCelular() {
        return dddCelular;
    }


    /**
     * Sets the dddCelular value for this Contato.
     * 
     * @param dddCelular
     */
    public void setDddCelular(java.lang.String dddCelular) {
        this.dddCelular = dddCelular;
    }


    /**
     * Gets the celular value for this Contato.
     * 
     * @return celular
     */
    public java.lang.String getCelular() {
        return celular;
    }


    /**
     * Sets the celular value for this Contato.
     * 
     * @param celular
     */
    public void setCelular(java.lang.String celular) {
        this.celular = celular;
    }


    /**
     * Gets the forcaAtualizacao value for this Contato.
     * 
     * @return forcaAtualizacao
     */
    public java.lang.Boolean getForcaAtualizacao() {
        return forcaAtualizacao;
    }


    /**
     * Sets the forcaAtualizacao value for this Contato.
     * 
     * @param forcaAtualizacao
     */
    public void setForcaAtualizacao(java.lang.Boolean forcaAtualizacao) {
        this.forcaAtualizacao = forcaAtualizacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contato)) return false;
        Contato other = (Contato) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.ddiTelefone==null && other.getDdiTelefone()==null) || 
             (this.ddiTelefone!=null &&
              this.ddiTelefone.equals(other.getDdiTelefone()))) &&
            ((this.dddTelefone==null && other.getDddTelefone()==null) || 
             (this.dddTelefone!=null &&
              this.dddTelefone.equals(other.getDddTelefone()))) &&
            ((this.telefone==null && other.getTelefone()==null) || 
             (this.telefone!=null &&
              this.telefone.equals(other.getTelefone()))) &&
            ((this.ddiCelular==null && other.getDdiCelular()==null) || 
             (this.ddiCelular!=null &&
              this.ddiCelular.equals(other.getDdiCelular()))) &&
            ((this.dddCelular==null && other.getDddCelular()==null) || 
             (this.dddCelular!=null &&
              this.dddCelular.equals(other.getDddCelular()))) &&
            ((this.celular==null && other.getCelular()==null) || 
             (this.celular!=null &&
              this.celular.equals(other.getCelular()))) &&
            ((this.forcaAtualizacao==null && other.getForcaAtualizacao()==null) || 
             (this.forcaAtualizacao!=null &&
              this.forcaAtualizacao.equals(other.getForcaAtualizacao())));
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getDdiTelefone() != null) {
            _hashCode += getDdiTelefone().hashCode();
        }
        if (getDddTelefone() != null) {
            _hashCode += getDddTelefone().hashCode();
        }
        if (getTelefone() != null) {
            _hashCode += getTelefone().hashCode();
        }
        if (getDdiCelular() != null) {
            _hashCode += getDdiCelular().hashCode();
        }
        if (getDddCelular() != null) {
            _hashCode += getDddCelular().hashCode();
        }
        if (getCelular() != null) {
            _hashCode += getCelular().hashCode();
        }
        if (getForcaAtualizacao() != null) {
            _hashCode += getForcaAtualizacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contato.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "contato"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ddiTelefone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ddiTelefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dddTelefone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dddTelefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ddiCelular");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ddiCelular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dddCelular");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dddCelular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("celular");
        elemField.setXmlName(new javax.xml.namespace.QName("", "celular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forcaAtualizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forcaAtualizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
