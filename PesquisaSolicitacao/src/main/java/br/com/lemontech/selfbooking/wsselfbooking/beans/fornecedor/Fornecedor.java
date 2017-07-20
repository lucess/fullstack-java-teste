/**
 * Fornecedor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor;

public class Fornecedor  extends br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.FornecedorRef  implements java.io.Serializable {
    private java.lang.String nomeFornecedor;

    private java.lang.String razaoSocial;

    private java.lang.String cnpj;

    private java.lang.String pais;

    private java.lang.String uf;

    private java.lang.String cidade;

    private java.lang.String bairro;

    private java.lang.String endereco;

    private java.lang.String complementoEndereco;

    private java.lang.String ddiTelefone;

    private java.lang.String dddTelefone;

    private java.lang.String telefone;

    private java.lang.String ddiFax;

    private java.lang.String dddFax;

    private java.lang.String fax;

    private java.lang.String email;

    private org.apache.axis.types.URI site;

    private java.math.BigDecimal longitude;

    private java.math.BigDecimal latitude;

    private boolean hotel;

    private boolean carro;

    private boolean outro;

    private boolean ativo;

    private java.lang.String iata;

    private java.lang.String obsConsultor;

    public Fornecedor() {
    }

    public Fornecedor(
           java.lang.String identificadorBackofficeFornecedor,
           java.lang.String nomeFornecedor,
           java.lang.String razaoSocial,
           java.lang.String cnpj,
           java.lang.String pais,
           java.lang.String uf,
           java.lang.String cidade,
           java.lang.String bairro,
           java.lang.String endereco,
           java.lang.String complementoEndereco,
           java.lang.String ddiTelefone,
           java.lang.String dddTelefone,
           java.lang.String telefone,
           java.lang.String ddiFax,
           java.lang.String dddFax,
           java.lang.String fax,
           java.lang.String email,
           org.apache.axis.types.URI site,
           java.math.BigDecimal longitude,
           java.math.BigDecimal latitude,
           boolean hotel,
           boolean carro,
           boolean outro,
           boolean ativo,
           java.lang.String iata,
           java.lang.String obsConsultor) {
        super(
            identificadorBackofficeFornecedor);
        this.nomeFornecedor = nomeFornecedor;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.pais = pais;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.endereco = endereco;
        this.complementoEndereco = complementoEndereco;
        this.ddiTelefone = ddiTelefone;
        this.dddTelefone = dddTelefone;
        this.telefone = telefone;
        this.ddiFax = ddiFax;
        this.dddFax = dddFax;
        this.fax = fax;
        this.email = email;
        this.site = site;
        this.longitude = longitude;
        this.latitude = latitude;
        this.hotel = hotel;
        this.carro = carro;
        this.outro = outro;
        this.ativo = ativo;
        this.iata = iata;
        this.obsConsultor = obsConsultor;
    }


    /**
     * Gets the nomeFornecedor value for this Fornecedor.
     * 
     * @return nomeFornecedor
     */
    public java.lang.String getNomeFornecedor() {
        return nomeFornecedor;
    }


    /**
     * Sets the nomeFornecedor value for this Fornecedor.
     * 
     * @param nomeFornecedor
     */
    public void setNomeFornecedor(java.lang.String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }


    /**
     * Gets the razaoSocial value for this Fornecedor.
     * 
     * @return razaoSocial
     */
    public java.lang.String getRazaoSocial() {
        return razaoSocial;
    }


    /**
     * Sets the razaoSocial value for this Fornecedor.
     * 
     * @param razaoSocial
     */
    public void setRazaoSocial(java.lang.String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }


    /**
     * Gets the cnpj value for this Fornecedor.
     * 
     * @return cnpj
     */
    public java.lang.String getCnpj() {
        return cnpj;
    }


    /**
     * Sets the cnpj value for this Fornecedor.
     * 
     * @param cnpj
     */
    public void setCnpj(java.lang.String cnpj) {
        this.cnpj = cnpj;
    }


    /**
     * Gets the pais value for this Fornecedor.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this Fornecedor.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the uf value for this Fornecedor.
     * 
     * @return uf
     */
    public java.lang.String getUf() {
        return uf;
    }


    /**
     * Sets the uf value for this Fornecedor.
     * 
     * @param uf
     */
    public void setUf(java.lang.String uf) {
        this.uf = uf;
    }


    /**
     * Gets the cidade value for this Fornecedor.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this Fornecedor.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the bairro value for this Fornecedor.
     * 
     * @return bairro
     */
    public java.lang.String getBairro() {
        return bairro;
    }


    /**
     * Sets the bairro value for this Fornecedor.
     * 
     * @param bairro
     */
    public void setBairro(java.lang.String bairro) {
        this.bairro = bairro;
    }


    /**
     * Gets the endereco value for this Fornecedor.
     * 
     * @return endereco
     */
    public java.lang.String getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this Fornecedor.
     * 
     * @param endereco
     */
    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the complementoEndereco value for this Fornecedor.
     * 
     * @return complementoEndereco
     */
    public java.lang.String getComplementoEndereco() {
        return complementoEndereco;
    }


    /**
     * Sets the complementoEndereco value for this Fornecedor.
     * 
     * @param complementoEndereco
     */
    public void setComplementoEndereco(java.lang.String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }


    /**
     * Gets the ddiTelefone value for this Fornecedor.
     * 
     * @return ddiTelefone
     */
    public java.lang.String getDdiTelefone() {
        return ddiTelefone;
    }


    /**
     * Sets the ddiTelefone value for this Fornecedor.
     * 
     * @param ddiTelefone
     */
    public void setDdiTelefone(java.lang.String ddiTelefone) {
        this.ddiTelefone = ddiTelefone;
    }


    /**
     * Gets the dddTelefone value for this Fornecedor.
     * 
     * @return dddTelefone
     */
    public java.lang.String getDddTelefone() {
        return dddTelefone;
    }


    /**
     * Sets the dddTelefone value for this Fornecedor.
     * 
     * @param dddTelefone
     */
    public void setDddTelefone(java.lang.String dddTelefone) {
        this.dddTelefone = dddTelefone;
    }


    /**
     * Gets the telefone value for this Fornecedor.
     * 
     * @return telefone
     */
    public java.lang.String getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this Fornecedor.
     * 
     * @param telefone
     */
    public void setTelefone(java.lang.String telefone) {
        this.telefone = telefone;
    }


    /**
     * Gets the ddiFax value for this Fornecedor.
     * 
     * @return ddiFax
     */
    public java.lang.String getDdiFax() {
        return ddiFax;
    }


    /**
     * Sets the ddiFax value for this Fornecedor.
     * 
     * @param ddiFax
     */
    public void setDdiFax(java.lang.String ddiFax) {
        this.ddiFax = ddiFax;
    }


    /**
     * Gets the dddFax value for this Fornecedor.
     * 
     * @return dddFax
     */
    public java.lang.String getDddFax() {
        return dddFax;
    }


    /**
     * Sets the dddFax value for this Fornecedor.
     * 
     * @param dddFax
     */
    public void setDddFax(java.lang.String dddFax) {
        this.dddFax = dddFax;
    }


    /**
     * Gets the fax value for this Fornecedor.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Fornecedor.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the email value for this Fornecedor.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Fornecedor.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the site value for this Fornecedor.
     * 
     * @return site
     */
    public org.apache.axis.types.URI getSite() {
        return site;
    }


    /**
     * Sets the site value for this Fornecedor.
     * 
     * @param site
     */
    public void setSite(org.apache.axis.types.URI site) {
        this.site = site;
    }


    /**
     * Gets the longitude value for this Fornecedor.
     * 
     * @return longitude
     */
    public java.math.BigDecimal getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this Fornecedor.
     * 
     * @param longitude
     */
    public void setLongitude(java.math.BigDecimal longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the latitude value for this Fornecedor.
     * 
     * @return latitude
     */
    public java.math.BigDecimal getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this Fornecedor.
     * 
     * @param latitude
     */
    public void setLatitude(java.math.BigDecimal latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the hotel value for this Fornecedor.
     * 
     * @return hotel
     */
    public boolean isHotel() {
        return hotel;
    }


    /**
     * Sets the hotel value for this Fornecedor.
     * 
     * @param hotel
     */
    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }


    /**
     * Gets the carro value for this Fornecedor.
     * 
     * @return carro
     */
    public boolean isCarro() {
        return carro;
    }


    /**
     * Sets the carro value for this Fornecedor.
     * 
     * @param carro
     */
    public void setCarro(boolean carro) {
        this.carro = carro;
    }


    /**
     * Gets the outro value for this Fornecedor.
     * 
     * @return outro
     */
    public boolean isOutro() {
        return outro;
    }


    /**
     * Sets the outro value for this Fornecedor.
     * 
     * @param outro
     */
    public void setOutro(boolean outro) {
        this.outro = outro;
    }


    /**
     * Gets the ativo value for this Fornecedor.
     * 
     * @return ativo
     */
    public boolean isAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this Fornecedor.
     * 
     * @param ativo
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    /**
     * Gets the iata value for this Fornecedor.
     * 
     * @return iata
     */
    public java.lang.String getIata() {
        return iata;
    }


    /**
     * Sets the iata value for this Fornecedor.
     * 
     * @param iata
     */
    public void setIata(java.lang.String iata) {
        this.iata = iata;
    }


    /**
     * Gets the obsConsultor value for this Fornecedor.
     * 
     * @return obsConsultor
     */
    public java.lang.String getObsConsultor() {
        return obsConsultor;
    }


    /**
     * Sets the obsConsultor value for this Fornecedor.
     * 
     * @param obsConsultor
     */
    public void setObsConsultor(java.lang.String obsConsultor) {
        this.obsConsultor = obsConsultor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Fornecedor)) return false;
        Fornecedor other = (Fornecedor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nomeFornecedor==null && other.getNomeFornecedor()==null) || 
             (this.nomeFornecedor!=null &&
              this.nomeFornecedor.equals(other.getNomeFornecedor()))) &&
            ((this.razaoSocial==null && other.getRazaoSocial()==null) || 
             (this.razaoSocial!=null &&
              this.razaoSocial.equals(other.getRazaoSocial()))) &&
            ((this.cnpj==null && other.getCnpj()==null) || 
             (this.cnpj!=null &&
              this.cnpj.equals(other.getCnpj()))) &&
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.uf==null && other.getUf()==null) || 
             (this.uf!=null &&
              this.uf.equals(other.getUf()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.bairro==null && other.getBairro()==null) || 
             (this.bairro!=null &&
              this.bairro.equals(other.getBairro()))) &&
            ((this.endereco==null && other.getEndereco()==null) || 
             (this.endereco!=null &&
              this.endereco.equals(other.getEndereco()))) &&
            ((this.complementoEndereco==null && other.getComplementoEndereco()==null) || 
             (this.complementoEndereco!=null &&
              this.complementoEndereco.equals(other.getComplementoEndereco()))) &&
            ((this.ddiTelefone==null && other.getDdiTelefone()==null) || 
             (this.ddiTelefone!=null &&
              this.ddiTelefone.equals(other.getDdiTelefone()))) &&
            ((this.dddTelefone==null && other.getDddTelefone()==null) || 
             (this.dddTelefone!=null &&
              this.dddTelefone.equals(other.getDddTelefone()))) &&
            ((this.telefone==null && other.getTelefone()==null) || 
             (this.telefone!=null &&
              this.telefone.equals(other.getTelefone()))) &&
            ((this.ddiFax==null && other.getDdiFax()==null) || 
             (this.ddiFax!=null &&
              this.ddiFax.equals(other.getDdiFax()))) &&
            ((this.dddFax==null && other.getDddFax()==null) || 
             (this.dddFax!=null &&
              this.dddFax.equals(other.getDddFax()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              this.site.equals(other.getSite()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            this.hotel == other.isHotel() &&
            this.carro == other.isCarro() &&
            this.outro == other.isOutro() &&
            this.ativo == other.isAtivo() &&
            ((this.iata==null && other.getIata()==null) || 
             (this.iata!=null &&
              this.iata.equals(other.getIata()))) &&
            ((this.obsConsultor==null && other.getObsConsultor()==null) || 
             (this.obsConsultor!=null &&
              this.obsConsultor.equals(other.getObsConsultor())));
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
        if (getNomeFornecedor() != null) {
            _hashCode += getNomeFornecedor().hashCode();
        }
        if (getRazaoSocial() != null) {
            _hashCode += getRazaoSocial().hashCode();
        }
        if (getCnpj() != null) {
            _hashCode += getCnpj().hashCode();
        }
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getUf() != null) {
            _hashCode += getUf().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getBairro() != null) {
            _hashCode += getBairro().hashCode();
        }
        if (getEndereco() != null) {
            _hashCode += getEndereco().hashCode();
        }
        if (getComplementoEndereco() != null) {
            _hashCode += getComplementoEndereco().hashCode();
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
        if (getDdiFax() != null) {
            _hashCode += getDdiFax().hashCode();
        }
        if (getDddFax() != null) {
            _hashCode += getDddFax().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getSite() != null) {
            _hashCode += getSite().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        _hashCode += (isHotel() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCarro() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOutro() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAtivo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIata() != null) {
            _hashCode += getIata().hashCode();
        }
        if (getObsConsultor() != null) {
            _hashCode += getObsConsultor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Fornecedor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "fornecedor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeFornecedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeFornecedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razaoSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "razaoSocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("pais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bairro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bairro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endereco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complementoEndereco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "complementoEndereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ddiTelefone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ddiTelefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dddTelefone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dddTelefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ddiFax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ddiFax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dddFax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dddFax"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site");
        elemField.setXmlName(new javax.xml.namespace.QName("", "site"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hotel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obsConsultor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "obsConsultor"));
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
