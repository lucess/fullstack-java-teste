/**
 * Passageiro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class Passageiro  implements java.io.Serializable {
    private int idPassageiro;

    private java.lang.String nome;

    private java.lang.String sobrenome;

    private java.lang.String matricula;

    private java.lang.String departamento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPassageiro tipoPassageiro;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoDocumento tipoDocumento;

    private java.lang.String valorDocumento;

    /* Email. */
    private java.lang.String email;

    private java.util.Date dataNascimento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Sexo sexo;

    private java.lang.String empresa;

    private java.lang.String telefone;

    private java.lang.String celular;

    private java.lang.String dddTel;

    private java.lang.String dddCel;

    private java.lang.Boolean terceiro;

    private java.lang.Boolean acompanhante;

    private java.lang.String cpf;

    private java.lang.String nomeCompleto;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.LogAs logAs;

    public Passageiro() {
    }

    public Passageiro(
           int idPassageiro,
           java.lang.String nome,
           java.lang.String sobrenome,
           java.lang.String matricula,
           java.lang.String departamento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPassageiro tipoPassageiro,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoDocumento tipoDocumento,
           java.lang.String valorDocumento,
           java.lang.String email,
           java.util.Date dataNascimento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Sexo sexo,
           java.lang.String empresa,
           java.lang.String telefone,
           java.lang.String celular,
           java.lang.String dddTel,
           java.lang.String dddCel,
           java.lang.Boolean terceiro,
           java.lang.Boolean acompanhante,
           java.lang.String cpf,
           java.lang.String nomeCompleto,
           br.com.lemontech.selfbooking.wsselfbooking.beans.LogAs logAs) {
           this.idPassageiro = idPassageiro;
           this.nome = nome;
           this.sobrenome = sobrenome;
           this.matricula = matricula;
           this.departamento = departamento;
           this.tipoPassageiro = tipoPassageiro;
           this.tipoDocumento = tipoDocumento;
           this.valorDocumento = valorDocumento;
           this.email = email;
           this.dataNascimento = dataNascimento;
           this.sexo = sexo;
           this.empresa = empresa;
           this.telefone = telefone;
           this.celular = celular;
           this.dddTel = dddTel;
           this.dddCel = dddCel;
           this.terceiro = terceiro;
           this.acompanhante = acompanhante;
           this.cpf = cpf;
           this.nomeCompleto = nomeCompleto;
           this.logAs = logAs;
    }


    /**
     * Gets the idPassageiro value for this Passageiro.
     * 
     * @return idPassageiro
     */
    public int getIdPassageiro() {
        return idPassageiro;
    }


    /**
     * Sets the idPassageiro value for this Passageiro.
     * 
     * @param idPassageiro
     */
    public void setIdPassageiro(int idPassageiro) {
        this.idPassageiro = idPassageiro;
    }


    /**
     * Gets the nome value for this Passageiro.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Passageiro.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the sobrenome value for this Passageiro.
     * 
     * @return sobrenome
     */
    public java.lang.String getSobrenome() {
        return sobrenome;
    }


    /**
     * Sets the sobrenome value for this Passageiro.
     * 
     * @param sobrenome
     */
    public void setSobrenome(java.lang.String sobrenome) {
        this.sobrenome = sobrenome;
    }


    /**
     * Gets the matricula value for this Passageiro.
     * 
     * @return matricula
     */
    public java.lang.String getMatricula() {
        return matricula;
    }


    /**
     * Sets the matricula value for this Passageiro.
     * 
     * @param matricula
     */
    public void setMatricula(java.lang.String matricula) {
        this.matricula = matricula;
    }


    /**
     * Gets the departamento value for this Passageiro.
     * 
     * @return departamento
     */
    public java.lang.String getDepartamento() {
        return departamento;
    }


    /**
     * Sets the departamento value for this Passageiro.
     * 
     * @param departamento
     */
    public void setDepartamento(java.lang.String departamento) {
        this.departamento = departamento;
    }


    /**
     * Gets the tipoPassageiro value for this Passageiro.
     * 
     * @return tipoPassageiro
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPassageiro getTipoPassageiro() {
        return tipoPassageiro;
    }


    /**
     * Sets the tipoPassageiro value for this Passageiro.
     * 
     * @param tipoPassageiro
     */
    public void setTipoPassageiro(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPassageiro tipoPassageiro) {
        this.tipoPassageiro = tipoPassageiro;
    }


    /**
     * Gets the tipoDocumento value for this Passageiro.
     * 
     * @return tipoDocumento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this Passageiro.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the valorDocumento value for this Passageiro.
     * 
     * @return valorDocumento
     */
    public java.lang.String getValorDocumento() {
        return valorDocumento;
    }


    /**
     * Sets the valorDocumento value for this Passageiro.
     * 
     * @param valorDocumento
     */
    public void setValorDocumento(java.lang.String valorDocumento) {
        this.valorDocumento = valorDocumento;
    }


    /**
     * Gets the email value for this Passageiro.
     * 
     * @return email   * Email.
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Passageiro.
     * 
     * @param email   * Email.
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the dataNascimento value for this Passageiro.
     * 
     * @return dataNascimento
     */
    public java.util.Date getDataNascimento() {
        return dataNascimento;
    }


    /**
     * Sets the dataNascimento value for this Passageiro.
     * 
     * @param dataNascimento
     */
    public void setDataNascimento(java.util.Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    /**
     * Gets the sexo value for this Passageiro.
     * 
     * @return sexo
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Sexo getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this Passageiro.
     * 
     * @param sexo
     */
    public void setSexo(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Sexo sexo) {
        this.sexo = sexo;
    }


    /**
     * Gets the empresa value for this Passageiro.
     * 
     * @return empresa
     */
    public java.lang.String getEmpresa() {
        return empresa;
    }


    /**
     * Sets the empresa value for this Passageiro.
     * 
     * @param empresa
     */
    public void setEmpresa(java.lang.String empresa) {
        this.empresa = empresa;
    }


    /**
     * Gets the telefone value for this Passageiro.
     * 
     * @return telefone
     */
    public java.lang.String getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this Passageiro.
     * 
     * @param telefone
     */
    public void setTelefone(java.lang.String telefone) {
        this.telefone = telefone;
    }


    /**
     * Gets the celular value for this Passageiro.
     * 
     * @return celular
     */
    public java.lang.String getCelular() {
        return celular;
    }


    /**
     * Sets the celular value for this Passageiro.
     * 
     * @param celular
     */
    public void setCelular(java.lang.String celular) {
        this.celular = celular;
    }


    /**
     * Gets the dddTel value for this Passageiro.
     * 
     * @return dddTel
     */
    public java.lang.String getDddTel() {
        return dddTel;
    }


    /**
     * Sets the dddTel value for this Passageiro.
     * 
     * @param dddTel
     */
    public void setDddTel(java.lang.String dddTel) {
        this.dddTel = dddTel;
    }


    /**
     * Gets the dddCel value for this Passageiro.
     * 
     * @return dddCel
     */
    public java.lang.String getDddCel() {
        return dddCel;
    }


    /**
     * Sets the dddCel value for this Passageiro.
     * 
     * @param dddCel
     */
    public void setDddCel(java.lang.String dddCel) {
        this.dddCel = dddCel;
    }


    /**
     * Gets the terceiro value for this Passageiro.
     * 
     * @return terceiro
     */
    public java.lang.Boolean getTerceiro() {
        return terceiro;
    }


    /**
     * Sets the terceiro value for this Passageiro.
     * 
     * @param terceiro
     */
    public void setTerceiro(java.lang.Boolean terceiro) {
        this.terceiro = terceiro;
    }


    /**
     * Gets the acompanhante value for this Passageiro.
     * 
     * @return acompanhante
     */
    public java.lang.Boolean getAcompanhante() {
        return acompanhante;
    }


    /**
     * Sets the acompanhante value for this Passageiro.
     * 
     * @param acompanhante
     */
    public void setAcompanhante(java.lang.Boolean acompanhante) {
        this.acompanhante = acompanhante;
    }


    /**
     * Gets the cpf value for this Passageiro.
     * 
     * @return cpf
     */
    public java.lang.String getCpf() {
        return cpf;
    }


    /**
     * Sets the cpf value for this Passageiro.
     * 
     * @param cpf
     */
    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }


    /**
     * Gets the nomeCompleto value for this Passageiro.
     * 
     * @return nomeCompleto
     */
    public java.lang.String getNomeCompleto() {
        return nomeCompleto;
    }


    /**
     * Sets the nomeCompleto value for this Passageiro.
     * 
     * @param nomeCompleto
     */
    public void setNomeCompleto(java.lang.String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }


    /**
     * Gets the logAs value for this Passageiro.
     * 
     * @return logAs
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.LogAs getLogAs() {
        return logAs;
    }


    /**
     * Sets the logAs value for this Passageiro.
     * 
     * @param logAs
     */
    public void setLogAs(br.com.lemontech.selfbooking.wsselfbooking.beans.LogAs logAs) {
        this.logAs = logAs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Passageiro)) return false;
        Passageiro other = (Passageiro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idPassageiro == other.getIdPassageiro() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.sobrenome==null && other.getSobrenome()==null) || 
             (this.sobrenome!=null &&
              this.sobrenome.equals(other.getSobrenome()))) &&
            ((this.matricula==null && other.getMatricula()==null) || 
             (this.matricula!=null &&
              this.matricula.equals(other.getMatricula()))) &&
            ((this.departamento==null && other.getDepartamento()==null) || 
             (this.departamento!=null &&
              this.departamento.equals(other.getDepartamento()))) &&
            ((this.tipoPassageiro==null && other.getTipoPassageiro()==null) || 
             (this.tipoPassageiro!=null &&
              this.tipoPassageiro.equals(other.getTipoPassageiro()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.valorDocumento==null && other.getValorDocumento()==null) || 
             (this.valorDocumento!=null &&
              this.valorDocumento.equals(other.getValorDocumento()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.dataNascimento==null && other.getDataNascimento()==null) || 
             (this.dataNascimento!=null &&
              this.dataNascimento.equals(other.getDataNascimento()))) &&
            ((this.sexo==null && other.getSexo()==null) || 
             (this.sexo!=null &&
              this.sexo.equals(other.getSexo()))) &&
            ((this.empresa==null && other.getEmpresa()==null) || 
             (this.empresa!=null &&
              this.empresa.equals(other.getEmpresa()))) &&
            ((this.telefone==null && other.getTelefone()==null) || 
             (this.telefone!=null &&
              this.telefone.equals(other.getTelefone()))) &&
            ((this.celular==null && other.getCelular()==null) || 
             (this.celular!=null &&
              this.celular.equals(other.getCelular()))) &&
            ((this.dddTel==null && other.getDddTel()==null) || 
             (this.dddTel!=null &&
              this.dddTel.equals(other.getDddTel()))) &&
            ((this.dddCel==null && other.getDddCel()==null) || 
             (this.dddCel!=null &&
              this.dddCel.equals(other.getDddCel()))) &&
            ((this.terceiro==null && other.getTerceiro()==null) || 
             (this.terceiro!=null &&
              this.terceiro.equals(other.getTerceiro()))) &&
            ((this.acompanhante==null && other.getAcompanhante()==null) || 
             (this.acompanhante!=null &&
              this.acompanhante.equals(other.getAcompanhante()))) &&
            ((this.cpf==null && other.getCpf()==null) || 
             (this.cpf!=null &&
              this.cpf.equals(other.getCpf()))) &&
            ((this.nomeCompleto==null && other.getNomeCompleto()==null) || 
             (this.nomeCompleto!=null &&
              this.nomeCompleto.equals(other.getNomeCompleto()))) &&
            ((this.logAs==null && other.getLogAs()==null) || 
             (this.logAs!=null &&
              this.logAs.equals(other.getLogAs())));
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
        _hashCode += getIdPassageiro();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getSobrenome() != null) {
            _hashCode += getSobrenome().hashCode();
        }
        if (getMatricula() != null) {
            _hashCode += getMatricula().hashCode();
        }
        if (getDepartamento() != null) {
            _hashCode += getDepartamento().hashCode();
        }
        if (getTipoPassageiro() != null) {
            _hashCode += getTipoPassageiro().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getValorDocumento() != null) {
            _hashCode += getValorDocumento().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getDataNascimento() != null) {
            _hashCode += getDataNascimento().hashCode();
        }
        if (getSexo() != null) {
            _hashCode += getSexo().hashCode();
        }
        if (getEmpresa() != null) {
            _hashCode += getEmpresa().hashCode();
        }
        if (getTelefone() != null) {
            _hashCode += getTelefone().hashCode();
        }
        if (getCelular() != null) {
            _hashCode += getCelular().hashCode();
        }
        if (getDddTel() != null) {
            _hashCode += getDddTel().hashCode();
        }
        if (getDddCel() != null) {
            _hashCode += getDddCel().hashCode();
        }
        if (getTerceiro() != null) {
            _hashCode += getTerceiro().hashCode();
        }
        if (getAcompanhante() != null) {
            _hashCode += getAcompanhante().hashCode();
        }
        if (getCpf() != null) {
            _hashCode += getCpf().hashCode();
        }
        if (getNomeCompleto() != null) {
            _hashCode += getNomeCompleto().hashCode();
        }
        if (getLogAs() != null) {
            _hashCode += getLogAs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Passageiro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "passageiro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPassageiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPassageiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sobrenome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sobrenome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPassageiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoPassageiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoPassageiro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoDocumento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorDocumento"));
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
        elemField.setFieldName("dataNascimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataNascimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "sexo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empresa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empresa"));
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
        elemField.setFieldName("celular");
        elemField.setXmlName(new javax.xml.namespace.QName("", "celular"));
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
        elemField.setFieldName("dddCel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dddCel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terceiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terceiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acompanhante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acompanhante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCompleto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeCompleto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logAs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "logAs"));
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
