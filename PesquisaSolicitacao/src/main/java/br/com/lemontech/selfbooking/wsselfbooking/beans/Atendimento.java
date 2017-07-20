/**
 * Atendimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class Atendimento  implements java.io.Serializable {
    private java.lang.String posto;

    private java.lang.String email;

    private java.lang.String telefone;

    private java.lang.String dddTel;

    private java.lang.String nomeAgencia;

    public Atendimento() {
    }

    public Atendimento(
           java.lang.String posto,
           java.lang.String email,
           java.lang.String telefone,
           java.lang.String dddTel,
           java.lang.String nomeAgencia) {
           this.posto = posto;
           this.email = email;
           this.telefone = telefone;
           this.dddTel = dddTel;
           this.nomeAgencia = nomeAgencia;
    }


    /**
     * Gets the posto value for this Atendimento.
     * 
     * @return posto
     */
    public java.lang.String getPosto() {
        return posto;
    }


    /**
     * Sets the posto value for this Atendimento.
     * 
     * @param posto
     */
    public void setPosto(java.lang.String posto) {
        this.posto = posto;
    }


    /**
     * Gets the email value for this Atendimento.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Atendimento.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the telefone value for this Atendimento.
     * 
     * @return telefone
     */
    public java.lang.String getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this Atendimento.
     * 
     * @param telefone
     */
    public void setTelefone(java.lang.String telefone) {
        this.telefone = telefone;
    }


    /**
     * Gets the dddTel value for this Atendimento.
     * 
     * @return dddTel
     */
    public java.lang.String getDddTel() {
        return dddTel;
    }


    /**
     * Sets the dddTel value for this Atendimento.
     * 
     * @param dddTel
     */
    public void setDddTel(java.lang.String dddTel) {
        this.dddTel = dddTel;
    }


    /**
     * Gets the nomeAgencia value for this Atendimento.
     * 
     * @return nomeAgencia
     */
    public java.lang.String getNomeAgencia() {
        return nomeAgencia;
    }


    /**
     * Sets the nomeAgencia value for this Atendimento.
     * 
     * @param nomeAgencia
     */
    public void setNomeAgencia(java.lang.String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Atendimento)) return false;
        Atendimento other = (Atendimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.posto==null && other.getPosto()==null) || 
             (this.posto!=null &&
              this.posto.equals(other.getPosto()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.telefone==null && other.getTelefone()==null) || 
             (this.telefone!=null &&
              this.telefone.equals(other.getTelefone()))) &&
            ((this.dddTel==null && other.getDddTel()==null) || 
             (this.dddTel!=null &&
              this.dddTel.equals(other.getDddTel()))) &&
            ((this.nomeAgencia==null && other.getNomeAgencia()==null) || 
             (this.nomeAgencia!=null &&
              this.nomeAgencia.equals(other.getNomeAgencia())));
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
        if (getPosto() != null) {
            _hashCode += getPosto().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getTelefone() != null) {
            _hashCode += getTelefone().hashCode();
        }
        if (getDddTel() != null) {
            _hashCode += getDddTel().hashCode();
        }
        if (getNomeAgencia() != null) {
            _hashCode += getNomeAgencia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Atendimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "atendimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
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
        elemField.setFieldName("dddTel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dddTel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeAgencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeAgencia"));
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
