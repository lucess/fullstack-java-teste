/**
 * Agencia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class Agencia  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.String razaoSocial;

    private java.lang.String endereco;

    private java.lang.String cidade;

    private java.lang.String estado;

    private java.lang.String pais;

    private java.lang.String cep;

    private java.lang.String telefone;

    private java.lang.String fax;

    private java.lang.String email;

    private java.lang.String cnpj;

    private java.lang.String iata;

    public Agencia() {
    }

    public Agencia(
           java.lang.String nome,
           java.lang.String razaoSocial,
           java.lang.String endereco,
           java.lang.String cidade,
           java.lang.String estado,
           java.lang.String pais,
           java.lang.String cep,
           java.lang.String telefone,
           java.lang.String fax,
           java.lang.String email,
           java.lang.String cnpj,
           java.lang.String iata) {
           this.nome = nome;
           this.razaoSocial = razaoSocial;
           this.endereco = endereco;
           this.cidade = cidade;
           this.estado = estado;
           this.pais = pais;
           this.cep = cep;
           this.telefone = telefone;
           this.fax = fax;
           this.email = email;
           this.cnpj = cnpj;
           this.iata = iata;
    }


    /**
     * Gets the nome value for this Agencia.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Agencia.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the razaoSocial value for this Agencia.
     * 
     * @return razaoSocial
     */
    public java.lang.String getRazaoSocial() {
        return razaoSocial;
    }


    /**
     * Sets the razaoSocial value for this Agencia.
     * 
     * @param razaoSocial
     */
    public void setRazaoSocial(java.lang.String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }


    /**
     * Gets the endereco value for this Agencia.
     * 
     * @return endereco
     */
    public java.lang.String getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this Agencia.
     * 
     * @param endereco
     */
    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the cidade value for this Agencia.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this Agencia.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the estado value for this Agencia.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Agencia.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the pais value for this Agencia.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this Agencia.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the cep value for this Agencia.
     * 
     * @return cep
     */
    public java.lang.String getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this Agencia.
     * 
     * @param cep
     */
    public void setCep(java.lang.String cep) {
        this.cep = cep;
    }


    /**
     * Gets the telefone value for this Agencia.
     * 
     * @return telefone
     */
    public java.lang.String getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this Agencia.
     * 
     * @param telefone
     */
    public void setTelefone(java.lang.String telefone) {
        this.telefone = telefone;
    }


    /**
     * Gets the fax value for this Agencia.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Agencia.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the email value for this Agencia.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Agencia.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the cnpj value for this Agencia.
     * 
     * @return cnpj
     */
    public java.lang.String getCnpj() {
        return cnpj;
    }


    /**
     * Sets the cnpj value for this Agencia.
     * 
     * @param cnpj
     */
    public void setCnpj(java.lang.String cnpj) {
        this.cnpj = cnpj;
    }


    /**
     * Gets the iata value for this Agencia.
     * 
     * @return iata
     */
    public java.lang.String getIata() {
        return iata;
    }


    /**
     * Sets the iata value for this Agencia.
     * 
     * @param iata
     */
    public void setIata(java.lang.String iata) {
        this.iata = iata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Agencia)) return false;
        Agencia other = (Agencia) obj;
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
            ((this.telefone==null && other.getTelefone()==null) || 
             (this.telefone!=null &&
              this.telefone.equals(other.getTelefone()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.cnpj==null && other.getCnpj()==null) || 
             (this.cnpj!=null &&
              this.cnpj.equals(other.getCnpj()))) &&
            ((this.iata==null && other.getIata()==null) || 
             (this.iata!=null &&
              this.iata.equals(other.getIata())));
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
        if (getTelefone() != null) {
            _hashCode += getTelefone().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getCnpj() != null) {
            _hashCode += getCnpj().hashCode();
        }
        if (getIata() != null) {
            _hashCode += getIata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Agencia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "agencia"));
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
        elemField.setFieldName("telefone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fax"));
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
        elemField.setFieldName("cnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iata"));
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
