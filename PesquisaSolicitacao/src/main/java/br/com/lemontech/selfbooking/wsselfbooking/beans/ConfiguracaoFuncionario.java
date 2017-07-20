/**
 * ConfiguracaoFuncionario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class ConfiguracaoFuncionario  implements java.io.Serializable {
    /* Caso o aprovador seja o passageiro e essa opcao estiver como
     * SIM. A solicitacao sera automaticamente aprovada no nivel do aprovador. */
    private java.lang.Boolean autoAprova;

    /* Quando o funcionario tiver um perfil Solicitante ou Aprovador
     * e este campo estiver como 'true', ele podera pre aprovar todas os
     * solicitacoes. Independente das parametrizacoes. */
    private java.lang.Boolean solicitaParaTodos;

    /* Para perfil Aprovador e Solicitante, indeficara se poderao
     * pre-aprovar todos os cc. */
    private java.lang.Boolean preAprovaTodos;

    /* Quando estiver como 'true' sera pedido para validar o numero
     * de autorizacao. Para tanto o cliente devera estar devidamente parametrizado. */
    private java.lang.Boolean forcaDeVenda;

    /* Numero hierarquico do funcionario, na listagem de aprovadores
     * aparecera somentes os aprovadores com numero inferior ao do passageiro.
     * Para tanto o cliente devera estar devidamente parametrizado. */
    private java.lang.Integer nivelHierarquico;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCadastroFuncionario tipoCadastro;

    /* Categoria de hotel a ser associada ao cadastro do funcionario. */
    private java.lang.String categoriaHospedagem;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilFuncionario perfilFuncionario;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilAereo perfilAereo;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilHospedagem perfilHospedagem;

    private java.lang.Boolean visualizaSaldoBudgetAprovacao;

    private java.lang.Boolean aprovaBudgetNegativo;

    private java.lang.Boolean usuarioTerceiro;

    private java.lang.Integer antecedenciaViagemNacional;

    private java.lang.Integer antecedenciaViagemInternacional;

    /* Politica de despesa a ser associada ao cadastro do funcionario. */
    private java.lang.String politicaDespesa;

    /* Bloqueio de solicitacao de viagem a ser associada ao cadastro
     * do funcionario. */
    private java.lang.Boolean bloqueiaSolicitarViagem;

    public ConfiguracaoFuncionario() {
    }

    public ConfiguracaoFuncionario(
           java.lang.Boolean autoAprova,
           java.lang.Boolean solicitaParaTodos,
           java.lang.Boolean preAprovaTodos,
           java.lang.Boolean forcaDeVenda,
           java.lang.Integer nivelHierarquico,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCadastroFuncionario tipoCadastro,
           java.lang.String categoriaHospedagem,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilFuncionario perfilFuncionario,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilAereo perfilAereo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilHospedagem perfilHospedagem,
           java.lang.Boolean visualizaSaldoBudgetAprovacao,
           java.lang.Boolean aprovaBudgetNegativo,
           java.lang.Boolean usuarioTerceiro,
           java.lang.Integer antecedenciaViagemNacional,
           java.lang.Integer antecedenciaViagemInternacional,
           java.lang.String politicaDespesa,
           java.lang.Boolean bloqueiaSolicitarViagem) {
           this.autoAprova = autoAprova;
           this.solicitaParaTodos = solicitaParaTodos;
           this.preAprovaTodos = preAprovaTodos;
           this.forcaDeVenda = forcaDeVenda;
           this.nivelHierarquico = nivelHierarquico;
           this.tipoCadastro = tipoCadastro;
           this.categoriaHospedagem = categoriaHospedagem;
           this.perfilFuncionario = perfilFuncionario;
           this.perfilAereo = perfilAereo;
           this.perfilHospedagem = perfilHospedagem;
           this.visualizaSaldoBudgetAprovacao = visualizaSaldoBudgetAprovacao;
           this.aprovaBudgetNegativo = aprovaBudgetNegativo;
           this.usuarioTerceiro = usuarioTerceiro;
           this.antecedenciaViagemNacional = antecedenciaViagemNacional;
           this.antecedenciaViagemInternacional = antecedenciaViagemInternacional;
           this.politicaDespesa = politicaDespesa;
           this.bloqueiaSolicitarViagem = bloqueiaSolicitarViagem;
    }


    /**
     * Gets the autoAprova value for this ConfiguracaoFuncionario.
     * 
     * @return autoAprova   * Caso o aprovador seja o passageiro e essa opcao estiver como
     * SIM. A solicitacao sera automaticamente aprovada no nivel do aprovador.
     */
    public java.lang.Boolean getAutoAprova() {
        return autoAprova;
    }


    /**
     * Sets the autoAprova value for this ConfiguracaoFuncionario.
     * 
     * @param autoAprova   * Caso o aprovador seja o passageiro e essa opcao estiver como
     * SIM. A solicitacao sera automaticamente aprovada no nivel do aprovador.
     */
    public void setAutoAprova(java.lang.Boolean autoAprova) {
        this.autoAprova = autoAprova;
    }


    /**
     * Gets the solicitaParaTodos value for this ConfiguracaoFuncionario.
     * 
     * @return solicitaParaTodos   * Quando o funcionario tiver um perfil Solicitante ou Aprovador
     * e este campo estiver como 'true', ele podera pre aprovar todas os
     * solicitacoes. Independente das parametrizacoes.
     */
    public java.lang.Boolean getSolicitaParaTodos() {
        return solicitaParaTodos;
    }


    /**
     * Sets the solicitaParaTodos value for this ConfiguracaoFuncionario.
     * 
     * @param solicitaParaTodos   * Quando o funcionario tiver um perfil Solicitante ou Aprovador
     * e este campo estiver como 'true', ele podera pre aprovar todas os
     * solicitacoes. Independente das parametrizacoes.
     */
    public void setSolicitaParaTodos(java.lang.Boolean solicitaParaTodos) {
        this.solicitaParaTodos = solicitaParaTodos;
    }


    /**
     * Gets the preAprovaTodos value for this ConfiguracaoFuncionario.
     * 
     * @return preAprovaTodos   * Para perfil Aprovador e Solicitante, indeficara se poderao
     * pre-aprovar todos os cc.
     */
    public java.lang.Boolean getPreAprovaTodos() {
        return preAprovaTodos;
    }


    /**
     * Sets the preAprovaTodos value for this ConfiguracaoFuncionario.
     * 
     * @param preAprovaTodos   * Para perfil Aprovador e Solicitante, indeficara se poderao
     * pre-aprovar todos os cc.
     */
    public void setPreAprovaTodos(java.lang.Boolean preAprovaTodos) {
        this.preAprovaTodos = preAprovaTodos;
    }


    /**
     * Gets the forcaDeVenda value for this ConfiguracaoFuncionario.
     * 
     * @return forcaDeVenda   * Quando estiver como 'true' sera pedido para validar o numero
     * de autorizacao. Para tanto o cliente devera estar devidamente parametrizado.
     */
    public java.lang.Boolean getForcaDeVenda() {
        return forcaDeVenda;
    }


    /**
     * Sets the forcaDeVenda value for this ConfiguracaoFuncionario.
     * 
     * @param forcaDeVenda   * Quando estiver como 'true' sera pedido para validar o numero
     * de autorizacao. Para tanto o cliente devera estar devidamente parametrizado.
     */
    public void setForcaDeVenda(java.lang.Boolean forcaDeVenda) {
        this.forcaDeVenda = forcaDeVenda;
    }


    /**
     * Gets the nivelHierarquico value for this ConfiguracaoFuncionario.
     * 
     * @return nivelHierarquico   * Numero hierarquico do funcionario, na listagem de aprovadores
     * aparecera somentes os aprovadores com numero inferior ao do passageiro.
     * Para tanto o cliente devera estar devidamente parametrizado.
     */
    public java.lang.Integer getNivelHierarquico() {
        return nivelHierarquico;
    }


    /**
     * Sets the nivelHierarquico value for this ConfiguracaoFuncionario.
     * 
     * @param nivelHierarquico   * Numero hierarquico do funcionario, na listagem de aprovadores
     * aparecera somentes os aprovadores com numero inferior ao do passageiro.
     * Para tanto o cliente devera estar devidamente parametrizado.
     */
    public void setNivelHierarquico(java.lang.Integer nivelHierarquico) {
        this.nivelHierarquico = nivelHierarquico;
    }


    /**
     * Gets the tipoCadastro value for this ConfiguracaoFuncionario.
     * 
     * @return tipoCadastro
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCadastroFuncionario getTipoCadastro() {
        return tipoCadastro;
    }


    /**
     * Sets the tipoCadastro value for this ConfiguracaoFuncionario.
     * 
     * @param tipoCadastro
     */
    public void setTipoCadastro(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCadastroFuncionario tipoCadastro) {
        this.tipoCadastro = tipoCadastro;
    }


    /**
     * Gets the categoriaHospedagem value for this ConfiguracaoFuncionario.
     * 
     * @return categoriaHospedagem   * Categoria de hotel a ser associada ao cadastro do funcionario.
     */
    public java.lang.String getCategoriaHospedagem() {
        return categoriaHospedagem;
    }


    /**
     * Sets the categoriaHospedagem value for this ConfiguracaoFuncionario.
     * 
     * @param categoriaHospedagem   * Categoria de hotel a ser associada ao cadastro do funcionario.
     */
    public void setCategoriaHospedagem(java.lang.String categoriaHospedagem) {
        this.categoriaHospedagem = categoriaHospedagem;
    }


    /**
     * Gets the perfilFuncionario value for this ConfiguracaoFuncionario.
     * 
     * @return perfilFuncionario
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilFuncionario getPerfilFuncionario() {
        return perfilFuncionario;
    }


    /**
     * Sets the perfilFuncionario value for this ConfiguracaoFuncionario.
     * 
     * @param perfilFuncionario
     */
    public void setPerfilFuncionario(br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilFuncionario perfilFuncionario) {
        this.perfilFuncionario = perfilFuncionario;
    }


    /**
     * Gets the perfilAereo value for this ConfiguracaoFuncionario.
     * 
     * @return perfilAereo
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilAereo getPerfilAereo() {
        return perfilAereo;
    }


    /**
     * Sets the perfilAereo value for this ConfiguracaoFuncionario.
     * 
     * @param perfilAereo
     */
    public void setPerfilAereo(br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilAereo perfilAereo) {
        this.perfilAereo = perfilAereo;
    }


    /**
     * Gets the perfilHospedagem value for this ConfiguracaoFuncionario.
     * 
     * @return perfilHospedagem
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilHospedagem getPerfilHospedagem() {
        return perfilHospedagem;
    }


    /**
     * Sets the perfilHospedagem value for this ConfiguracaoFuncionario.
     * 
     * @param perfilHospedagem
     */
    public void setPerfilHospedagem(br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilHospedagem perfilHospedagem) {
        this.perfilHospedagem = perfilHospedagem;
    }


    /**
     * Gets the visualizaSaldoBudgetAprovacao value for this ConfiguracaoFuncionario.
     * 
     * @return visualizaSaldoBudgetAprovacao
     */
    public java.lang.Boolean getVisualizaSaldoBudgetAprovacao() {
        return visualizaSaldoBudgetAprovacao;
    }


    /**
     * Sets the visualizaSaldoBudgetAprovacao value for this ConfiguracaoFuncionario.
     * 
     * @param visualizaSaldoBudgetAprovacao
     */
    public void setVisualizaSaldoBudgetAprovacao(java.lang.Boolean visualizaSaldoBudgetAprovacao) {
        this.visualizaSaldoBudgetAprovacao = visualizaSaldoBudgetAprovacao;
    }


    /**
     * Gets the aprovaBudgetNegativo value for this ConfiguracaoFuncionario.
     * 
     * @return aprovaBudgetNegativo
     */
    public java.lang.Boolean getAprovaBudgetNegativo() {
        return aprovaBudgetNegativo;
    }


    /**
     * Sets the aprovaBudgetNegativo value for this ConfiguracaoFuncionario.
     * 
     * @param aprovaBudgetNegativo
     */
    public void setAprovaBudgetNegativo(java.lang.Boolean aprovaBudgetNegativo) {
        this.aprovaBudgetNegativo = aprovaBudgetNegativo;
    }


    /**
     * Gets the usuarioTerceiro value for this ConfiguracaoFuncionario.
     * 
     * @return usuarioTerceiro
     */
    public java.lang.Boolean getUsuarioTerceiro() {
        return usuarioTerceiro;
    }


    /**
     * Sets the usuarioTerceiro value for this ConfiguracaoFuncionario.
     * 
     * @param usuarioTerceiro
     */
    public void setUsuarioTerceiro(java.lang.Boolean usuarioTerceiro) {
        this.usuarioTerceiro = usuarioTerceiro;
    }


    /**
     * Gets the antecedenciaViagemNacional value for this ConfiguracaoFuncionario.
     * 
     * @return antecedenciaViagemNacional
     */
    public java.lang.Integer getAntecedenciaViagemNacional() {
        return antecedenciaViagemNacional;
    }


    /**
     * Sets the antecedenciaViagemNacional value for this ConfiguracaoFuncionario.
     * 
     * @param antecedenciaViagemNacional
     */
    public void setAntecedenciaViagemNacional(java.lang.Integer antecedenciaViagemNacional) {
        this.antecedenciaViagemNacional = antecedenciaViagemNacional;
    }


    /**
     * Gets the antecedenciaViagemInternacional value for this ConfiguracaoFuncionario.
     * 
     * @return antecedenciaViagemInternacional
     */
    public java.lang.Integer getAntecedenciaViagemInternacional() {
        return antecedenciaViagemInternacional;
    }


    /**
     * Sets the antecedenciaViagemInternacional value for this ConfiguracaoFuncionario.
     * 
     * @param antecedenciaViagemInternacional
     */
    public void setAntecedenciaViagemInternacional(java.lang.Integer antecedenciaViagemInternacional) {
        this.antecedenciaViagemInternacional = antecedenciaViagemInternacional;
    }


    /**
     * Gets the politicaDespesa value for this ConfiguracaoFuncionario.
     * 
     * @return politicaDespesa   * Politica de despesa a ser associada ao cadastro do funcionario.
     */
    public java.lang.String getPoliticaDespesa() {
        return politicaDespesa;
    }


    /**
     * Sets the politicaDespesa value for this ConfiguracaoFuncionario.
     * 
     * @param politicaDespesa   * Politica de despesa a ser associada ao cadastro do funcionario.
     */
    public void setPoliticaDespesa(java.lang.String politicaDespesa) {
        this.politicaDespesa = politicaDespesa;
    }


    /**
     * Gets the bloqueiaSolicitarViagem value for this ConfiguracaoFuncionario.
     * 
     * @return bloqueiaSolicitarViagem   * Bloqueio de solicitacao de viagem a ser associada ao cadastro
     * do funcionario.
     */
    public java.lang.Boolean getBloqueiaSolicitarViagem() {
        return bloqueiaSolicitarViagem;
    }


    /**
     * Sets the bloqueiaSolicitarViagem value for this ConfiguracaoFuncionario.
     * 
     * @param bloqueiaSolicitarViagem   * Bloqueio de solicitacao de viagem a ser associada ao cadastro
     * do funcionario.
     */
    public void setBloqueiaSolicitarViagem(java.lang.Boolean bloqueiaSolicitarViagem) {
        this.bloqueiaSolicitarViagem = bloqueiaSolicitarViagem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfiguracaoFuncionario)) return false;
        ConfiguracaoFuncionario other = (ConfiguracaoFuncionario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoAprova==null && other.getAutoAprova()==null) || 
             (this.autoAprova!=null &&
              this.autoAprova.equals(other.getAutoAprova()))) &&
            ((this.solicitaParaTodos==null && other.getSolicitaParaTodos()==null) || 
             (this.solicitaParaTodos!=null &&
              this.solicitaParaTodos.equals(other.getSolicitaParaTodos()))) &&
            ((this.preAprovaTodos==null && other.getPreAprovaTodos()==null) || 
             (this.preAprovaTodos!=null &&
              this.preAprovaTodos.equals(other.getPreAprovaTodos()))) &&
            ((this.forcaDeVenda==null && other.getForcaDeVenda()==null) || 
             (this.forcaDeVenda!=null &&
              this.forcaDeVenda.equals(other.getForcaDeVenda()))) &&
            ((this.nivelHierarquico==null && other.getNivelHierarquico()==null) || 
             (this.nivelHierarquico!=null &&
              this.nivelHierarquico.equals(other.getNivelHierarquico()))) &&
            ((this.tipoCadastro==null && other.getTipoCadastro()==null) || 
             (this.tipoCadastro!=null &&
              this.tipoCadastro.equals(other.getTipoCadastro()))) &&
            ((this.categoriaHospedagem==null && other.getCategoriaHospedagem()==null) || 
             (this.categoriaHospedagem!=null &&
              this.categoriaHospedagem.equals(other.getCategoriaHospedagem()))) &&
            ((this.perfilFuncionario==null && other.getPerfilFuncionario()==null) || 
             (this.perfilFuncionario!=null &&
              this.perfilFuncionario.equals(other.getPerfilFuncionario()))) &&
            ((this.perfilAereo==null && other.getPerfilAereo()==null) || 
             (this.perfilAereo!=null &&
              this.perfilAereo.equals(other.getPerfilAereo()))) &&
            ((this.perfilHospedagem==null && other.getPerfilHospedagem()==null) || 
             (this.perfilHospedagem!=null &&
              this.perfilHospedagem.equals(other.getPerfilHospedagem()))) &&
            ((this.visualizaSaldoBudgetAprovacao==null && other.getVisualizaSaldoBudgetAprovacao()==null) || 
             (this.visualizaSaldoBudgetAprovacao!=null &&
              this.visualizaSaldoBudgetAprovacao.equals(other.getVisualizaSaldoBudgetAprovacao()))) &&
            ((this.aprovaBudgetNegativo==null && other.getAprovaBudgetNegativo()==null) || 
             (this.aprovaBudgetNegativo!=null &&
              this.aprovaBudgetNegativo.equals(other.getAprovaBudgetNegativo()))) &&
            ((this.usuarioTerceiro==null && other.getUsuarioTerceiro()==null) || 
             (this.usuarioTerceiro!=null &&
              this.usuarioTerceiro.equals(other.getUsuarioTerceiro()))) &&
            ((this.antecedenciaViagemNacional==null && other.getAntecedenciaViagemNacional()==null) || 
             (this.antecedenciaViagemNacional!=null &&
              this.antecedenciaViagemNacional.equals(other.getAntecedenciaViagemNacional()))) &&
            ((this.antecedenciaViagemInternacional==null && other.getAntecedenciaViagemInternacional()==null) || 
             (this.antecedenciaViagemInternacional!=null &&
              this.antecedenciaViagemInternacional.equals(other.getAntecedenciaViagemInternacional()))) &&
            ((this.politicaDespesa==null && other.getPoliticaDespesa()==null) || 
             (this.politicaDespesa!=null &&
              this.politicaDespesa.equals(other.getPoliticaDespesa()))) &&
            ((this.bloqueiaSolicitarViagem==null && other.getBloqueiaSolicitarViagem()==null) || 
             (this.bloqueiaSolicitarViagem!=null &&
              this.bloqueiaSolicitarViagem.equals(other.getBloqueiaSolicitarViagem())));
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
        if (getAutoAprova() != null) {
            _hashCode += getAutoAprova().hashCode();
        }
        if (getSolicitaParaTodos() != null) {
            _hashCode += getSolicitaParaTodos().hashCode();
        }
        if (getPreAprovaTodos() != null) {
            _hashCode += getPreAprovaTodos().hashCode();
        }
        if (getForcaDeVenda() != null) {
            _hashCode += getForcaDeVenda().hashCode();
        }
        if (getNivelHierarquico() != null) {
            _hashCode += getNivelHierarquico().hashCode();
        }
        if (getTipoCadastro() != null) {
            _hashCode += getTipoCadastro().hashCode();
        }
        if (getCategoriaHospedagem() != null) {
            _hashCode += getCategoriaHospedagem().hashCode();
        }
        if (getPerfilFuncionario() != null) {
            _hashCode += getPerfilFuncionario().hashCode();
        }
        if (getPerfilAereo() != null) {
            _hashCode += getPerfilAereo().hashCode();
        }
        if (getPerfilHospedagem() != null) {
            _hashCode += getPerfilHospedagem().hashCode();
        }
        if (getVisualizaSaldoBudgetAprovacao() != null) {
            _hashCode += getVisualizaSaldoBudgetAprovacao().hashCode();
        }
        if (getAprovaBudgetNegativo() != null) {
            _hashCode += getAprovaBudgetNegativo().hashCode();
        }
        if (getUsuarioTerceiro() != null) {
            _hashCode += getUsuarioTerceiro().hashCode();
        }
        if (getAntecedenciaViagemNacional() != null) {
            _hashCode += getAntecedenciaViagemNacional().hashCode();
        }
        if (getAntecedenciaViagemInternacional() != null) {
            _hashCode += getAntecedenciaViagemInternacional().hashCode();
        }
        if (getPoliticaDespesa() != null) {
            _hashCode += getPoliticaDespesa().hashCode();
        }
        if (getBloqueiaSolicitarViagem() != null) {
            _hashCode += getBloqueiaSolicitarViagem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfiguracaoFuncionario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "configuracaoFuncionario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAprova");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoAprova"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitaParaTodos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "solicitaParaTodos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preAprovaTodos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preAprovaTodos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forcaDeVenda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forcaDeVenda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivelHierarquico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nivelHierarquico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCadastro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoCadastro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoCadastroFuncionario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoriaHospedagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoriaHospedagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfilFuncionario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfilFuncionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "perfilFuncionario"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfilAereo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfilAereo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "perfilAereo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfilHospedagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfilHospedagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "perfilHospedagem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visualizaSaldoBudgetAprovacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "visualizaSaldoBudgetAprovacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aprovaBudgetNegativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aprovaBudgetNegativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioTerceiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioTerceiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antecedenciaViagemNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "antecedenciaViagemNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antecedenciaViagemInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "antecedenciaViagemInternacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("politicaDespesa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "politicaDespesa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bloqueiaSolicitarViagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bloqueiaSolicitarViagem"));
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
