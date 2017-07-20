/**
 * Filial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class Filial  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.String razaoSocial;

    private java.lang.String endereco;

    private java.lang.String cidade;

    private java.lang.String estado;

    private java.lang.String pais;

    private java.lang.String cep;

    private java.lang.String cnpj;

    private java.lang.String numeroDk;

    public Filial() {
    }

    public Filial(
           java.lang.String nome,
           java.lang.String razaoSocial,
           java.lang.String endereco,
           java.lang.String cidade,
           java.lang.String estado,
           java.lang.String pais,
           java.lang.String cep,
           java.lang.String cnpj,
           java.lang.String numeroDk) {
           this.nome = nome;
           this.razaoSocial = razaoSocial;
           this.endereco = endereco;
           this.cidade = cidade;
           this.estado = estado;
           this.pais = pais;
           this.cep = cep;
           this.cnpj = cnpj;
           this.numeroDk = numeroDk;
    }


    /**
     * Gets the nome value for this Filial.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Filial.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the razaoSocial value for this Filial.
     * 
     * @return razaoSocial
     */
    public java.lang.String getRazaoSocial() {
        return razaoSocial;
    }


    /**
     * Sets the razaoSocial value for this Filial.
     * 
     * @param razaoSocial
     */
    public void setRazaoSocial(java.lang.String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }


    /**
     * Gets the endereco value for this Filial.
     * 
     * @return endereco
     */
    public java.lang.String getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this Filial.
     * 
     * @param endereco
     */
    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the cidade value for this Filial.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this Filial.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the estado value for this Filial.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Filial.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the pais value for this Filial.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this Filial.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the cep value for this Filial.
     * 
     * @return cep
     */
    public java.lang.String getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this Filial.
     * 
     * @param cep
     */
    public void setCep(java.lang.String cep) {
        this.cep = cep;
    }


    /**
     * Gets the cnpj value for this Filial.
     * 
     * @return cnpj
     */
    public java.lang.String getCnpj() {
        return cnpj;
    }


    /**
     * Sets the cnpj value for this Filial.
     * 
     * @param cnpj
     */
    public void setCnpj(java.lang.String cnpj) {
        this.cnpj = cnpj;
    }


    /**
     * Gets the numeroDk value for this Filial.
     * 
     * @return numeroDk
     */
    public java.lang.String getNumeroDk() {
        return numeroDk;
    }


    /**
     * Sets the numeroDk value for this Filial.
     * 
     * @param numeroDk
     */
    public void setNumeroDk(java.lang.String numeroDk) {
        this.numeroDk = numeroDk;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Filial)) return false;
        Filial other = (Filial) obj;
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
            ((this.razaoSocial==null && other.getRazaoSocial()==null) || 
             (this.razaoSocial!=null &&
              this.razaoSocial.equals(other.getRazaoSocial()))) &&
            ((this.endereco==null && other.getEndereco()==null) || 
             (this.endereco!=null &&
              this.endereco.equals(other.getEndereco()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.cep==null && other.getCep()==null) || 
             (this.cep!=null &&
              this.cep.equals(other.getCep()))) &&
            ((this.cnpj==null && other.getCnpj()==null) || 
             (this.cnpj!=null &&
              this.cnpj.equals(other.getCnpj()))) &&
            ((this.numeroDk==null && other.getNumeroDk()==null) || 
             (this.numeroDk!=null &&
              this.numeroDk.equals(other.getNumeroDk())));
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
        if (getRazaoSocial() != null) {
            _hashCode += getRazaoSocial().hashCode();
        }
        if (getEndereco() != null) {
            _hashCode += getEndereco().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getCep() != null) {
            _hashCode += getCep().hashCode();
        }
        if (getCnpj() != null) {
            _hashCode += getCnpj().hashCode();
        }
        if (getNumeroDk() != null) {
            _hashCode += getNumeroDk().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Filial.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "filial"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razaoSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "razaoSocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endereco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroDk"));
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
