/**
 * Funcionario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class Funcionario  extends br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.String departamento;

    private java.lang.String cargo;

    private java.lang.String cpf;

    private java.lang.String passaporte;

    private java.util.Date dataNascimento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Sexo sexo;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Contato contato;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Login login;

    private java.lang.Boolean bypassAprovacaoNacional;

    private java.lang.Boolean bypassAprovacaoInternacional;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.ConfiguracaoFuncionario configuracao;

    private boolean ativo;

    public Funcionario() {
    }

    public Funcionario(
           java.lang.String matricula,
           java.lang.String nome,
           java.lang.String departamento,
           java.lang.String cargo,
           java.lang.String cpf,
           java.lang.String passaporte,
           java.util.Date dataNascimento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Sexo sexo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Contato contato,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Login login,
           java.lang.Boolean bypassAprovacaoNacional,
           java.lang.Boolean bypassAprovacaoInternacional,
           br.com.lemontech.selfbooking.wsselfbooking.beans.ConfiguracaoFuncionario configuracao,
           boolean ativo) {
        super(
            matricula);
        this.nome = nome;
        this.departamento = departamento;
        this.cargo = cargo;
        this.cpf = cpf;
        this.passaporte = passaporte;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.centroDeCustoRef = centroDeCustoRef;
        this.subCentroDeCustoRef = subCentroDeCustoRef;
        this.contato = contato;
        this.login = login;
        this.bypassAprovacaoNacional = bypassAprovacaoNacional;
        this.bypassAprovacaoInternacional = bypassAprovacaoInternacional;
        this.configuracao = configuracao;
        this.ativo = ativo;
    }


    /**
     * Gets the nome value for this Funcionario.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Funcionario.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the departamento value for this Funcionario.
     * 
     * @return departamento
     */
    public java.lang.String getDepartamento() {
        return departamento;
    }


    /**
     * Sets the departamento value for this Funcionario.
     * 
     * @param departamento
     */
    public void setDepartamento(java.lang.String departamento) {
        this.departamento = departamento;
    }


    /**
     * Gets the cargo value for this Funcionario.
     * 
     * @return cargo
     */
    public java.lang.String getCargo() {
        return cargo;
    }


    /**
     * Sets the cargo value for this Funcionario.
     * 
     * @param cargo
     */
    public void setCargo(java.lang.String cargo) {
        this.cargo = cargo;
    }


    /**
     * Gets the cpf value for this Funcionario.
     * 
     * @return cpf
     */
    public java.lang.String getCpf() {
        return cpf;
    }


    /**
     * Sets the cpf value for this Funcionario.
     * 
     * @param cpf
     */
    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }


    /**
     * Gets the passaporte value for this Funcionario.
     * 
     * @return passaporte
     */
    public java.lang.String getPassaporte() {
        return passaporte;
    }


    /**
     * Sets the passaporte value for this Funcionario.
     * 
     * @param passaporte
     */
    public void setPassaporte(java.lang.String passaporte) {
        this.passaporte = passaporte;
    }


    /**
     * Gets the dataNascimento value for this Funcionario.
     * 
     * @return dataNascimento
     */
    public java.util.Date getDataNascimento() {
        return dataNascimento;
    }


    /**
     * Sets the dataNascimento value for this Funcionario.
     * 
     * @param dataNascimento
     */
    public void setDataNascimento(java.util.Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    /**
     * Gets the sexo value for this Funcionario.
     * 
     * @return sexo
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Sexo getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this Funcionario.
     * 
     * @param sexo
     */
    public void setSexo(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Sexo sexo) {
        this.sexo = sexo;
    }


    /**
     * Gets the centroDeCustoRef value for this Funcionario.
     * 
     * @return centroDeCustoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }


    /**
     * Sets the centroDeCustoRef value for this Funcionario.
     * 
     * @param centroDeCustoRef
     */
    public void setCentroDeCustoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef centroDeCustoRef) {
        this.centroDeCustoRef = centroDeCustoRef;
    }


    /**
     * Gets the subCentroDeCustoRef value for this Funcionario.
     * 
     * @return subCentroDeCustoRef
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef getSubCentroDeCustoRef() {
        return subCentroDeCustoRef;
    }


    /**
     * Sets the subCentroDeCustoRef value for this Funcionario.
     * 
     * @param subCentroDeCustoRef
     */
    public void setSubCentroDeCustoRef(br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef subCentroDeCustoRef) {
        this.subCentroDeCustoRef = subCentroDeCustoRef;
    }


    /**
     * Gets the contato value for this Funcionario.
     * 
     * @return contato
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Contato getContato() {
        return contato;
    }


    /**
     * Sets the contato value for this Funcionario.
     * 
     * @param contato
     */
    public void setContato(br.com.lemontech.selfbooking.wsselfbooking.beans.Contato contato) {
        this.contato = contato;
    }


    /**
     * Gets the login value for this Funcionario.
     * 
     * @return login
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Login getLogin() {
        return login;
    }


    /**
     * Sets the login value for this Funcionario.
     * 
     * @param login
     */
    public void setLogin(br.com.lemontech.selfbooking.wsselfbooking.beans.Login login) {
        this.login = login;
    }


    /**
     * Gets the bypassAprovacaoNacional value for this Funcionario.
     * 
     * @return bypassAprovacaoNacional
     */
    public java.lang.Boolean getBypassAprovacaoNacional() {
        return bypassAprovacaoNacional;
    }


    /**
     * Sets the bypassAprovacaoNacional value for this Funcionario.
     * 
     * @param bypassAprovacaoNacional
     */
    public void setBypassAprovacaoNacional(java.lang.Boolean bypassAprovacaoNacional) {
        this.bypassAprovacaoNacional = bypassAprovacaoNacional;
    }


    /**
     * Gets the bypassAprovacaoInternacional value for this Funcionario.
     * 
     * @return bypassAprovacaoInternacional
     */
    public java.lang.Boolean getBypassAprovacaoInternacional() {
        return bypassAprovacaoInternacional;
    }


    /**
     * Sets the bypassAprovacaoInternacional value for this Funcionario.
     * 
     * @param bypassAprovacaoInternacional
     */
    public void setBypassAprovacaoInternacional(java.lang.Boolean bypassAprovacaoInternacional) {
        this.bypassAprovacaoInternacional = bypassAprovacaoInternacional;
    }


    /**
     * Gets the configuracao value for this Funcionario.
     * 
     * @return configuracao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.ConfiguracaoFuncionario getConfiguracao() {
        return configuracao;
    }


    /**
     * Sets the configuracao value for this Funcionario.
     * 
     * @param configuracao
     */
    public void setConfiguracao(br.com.lemontech.selfbooking.wsselfbooking.beans.ConfiguracaoFuncionario configuracao) {
        this.configuracao = configuracao;
    }


    /**
     * Gets the ativo value for this Funcionario.
     * 
     * @return ativo
     */
    public boolean isAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this Funcionario.
     * 
     * @param ativo
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Funcionario)) return false;
        Funcionario other = (Funcionario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.departamento==null && other.getDepartamento()==null) || 
             (this.departamento!=null &&
              this.departamento.equals(other.getDepartamento()))) &&
            ((this.cargo==null && other.getCargo()==null) || 
             (this.cargo!=null &&
              this.cargo.equals(other.getCargo()))) &&
            ((this.cpf==null && other.getCpf()==null) || 
             (this.cpf!=null &&
              this.cpf.equals(other.getCpf()))) &&
            ((this.passaporte==null && other.getPassaporte()==null) || 
             (this.passaporte!=null &&
              this.passaporte.equals(other.getPassaporte()))) &&
            ((this.dataNascimento==null && other.getDataNascimento()==null) || 
             (this.dataNascimento!=null &&
              this.dataNascimento.equals(other.getDataNascimento()))) &&
            ((this.sexo==null && other.getSexo()==null) || 
             (this.sexo!=null &&
              this.sexo.equals(other.getSexo()))) &&
            ((this.centroDeCustoRef==null && other.getCentroDeCustoRef()==null) || 
             (this.centroDeCustoRef!=null &&
              this.centroDeCustoRef.equals(other.getCentroDeCustoRef()))) &&
            ((this.subCentroDeCustoRef==null && other.getSubCentroDeCustoRef()==null) || 
             (this.subCentroDeCustoRef!=null &&
              this.subCentroDeCustoRef.equals(other.getSubCentroDeCustoRef()))) &&
            ((this.contato==null && other.getContato()==null) || 
             (this.contato!=null &&
              this.contato.equals(other.getContato()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.bypassAprovacaoNacional==null && other.getBypassAprovacaoNacional()==null) || 
             (this.bypassAprovacaoNacional!=null &&
              this.bypassAprovacaoNacional.equals(other.getBypassAprovacaoNacional()))) &&
            ((this.bypassAprovacaoInternacional==null && other.getBypassAprovacaoInternacional()==null) || 
             (this.bypassAprovacaoInternacional!=null &&
              this.bypassAprovacaoInternacional.equals(other.getBypassAprovacaoInternacional()))) &&
            ((this.configuracao==null && other.getConfiguracao()==null) || 
             (this.configuracao!=null &&
              this.configuracao.equals(other.getConfiguracao()))) &&
            this.ativo == other.isAtivo();
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getDepartamento() != null) {
            _hashCode += getDepartamento().hashCode();
        }
        if (getCargo() != null) {
            _hashCode += getCargo().hashCode();
        }
        if (getCpf() != null) {
            _hashCode += getCpf().hashCode();
        }
        if (getPassaporte() != null) {
            _hashCode += getPassaporte().hashCode();
        }
        if (getDataNascimento() != null) {
            _hashCode += getDataNascimento().hashCode();
        }
        if (getSexo() != null) {
            _hashCode += getSexo().hashCode();
        }
        if (getCentroDeCustoRef() != null) {
            _hashCode += getCentroDeCustoRef().hashCode();
        }
        if (getSubCentroDeCustoRef() != null) {
            _hashCode += getSubCentroDeCustoRef().hashCode();
        }
        if (getContato() != null) {
            _hashCode += getContato().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getBypassAprovacaoNacional() != null) {
            _hashCode += getBypassAprovacaoNacional().hashCode();
        }
        if (getBypassAprovacaoInternacional() != null) {
            _hashCode += getBypassAprovacaoInternacional().hashCode();
        }
        if (getConfiguracao() != null) {
            _hashCode += getConfiguracao().hashCode();
        }
        _hashCode += (isAtivo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Funcionario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("passaporte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passaporte"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroDeCustoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "centroDeCustoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "centroDeCustoRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCentroDeCustoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subCentroDeCustoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "subCentroDeCustoRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "contato"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "login"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bypassAprovacaoNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bypassAprovacaoNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bypassAprovacaoInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bypassAprovacaoInternacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configuracao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configuracao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "configuracaoFuncionario"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
