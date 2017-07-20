/**
 * Solicitacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class Solicitacao  implements java.io.Serializable {
    private int idSolicitacao;

    private java.lang.String localVenda;

    private java.util.Calendar dataAprovacao;

    private java.lang.String descricaoCentroCusto;

    private java.lang.String descricaoSubCentroCusto;

    private java.util.Calendar dataCriacaoSv;

    private java.lang.String codigoAutorizacaoViagem;

    private java.lang.String codigoClienteFranquia;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro solicitante;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro aprovador;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Atendimento atendimento;

    private java.util.Calendar dataConclusao;

    private java.lang.String regional;

    private java.lang.String centroDeCusto;

    private java.lang.String subCentroDeCusto;

    private java.lang.String contaContabil;

    private boolean nacional;

    private java.lang.String codigoCliente;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro[] passageiros;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo[] aereos;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.Hotel[] hoteis;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.carro.Carro[] carros;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.outro.Outro[] outros;

    private java.lang.String motivoViagem;

    private java.lang.Double adiantamento;

    private java.lang.String moedaAdiantamento;

    private java.lang.String controleCliente;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Totais totais;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusSolicitacao statusSolicitacao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao;

    private java.lang.Boolean autoConclusao;

    /* A soma de todas as porcentagem dos rateios será de 100%. */
    private br.com.lemontech.selfbooking.wsselfbooking.beans.Rateio[] rateios;

    private java.lang.String codigoUnidadeNegocio;

    private java.lang.String unidadeNegocio;

    private int idCliente;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.Seguro[] seguros;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Agencia agencia;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Filial filial;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.InstrucoesFaturamento instrucoesFaturamento;

    private java.lang.Boolean frontOffice;

    private java.lang.String complementoMotivoViagem;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.PontoVenda pontoVenda;

    private java.lang.String observacao;

    private java.lang.String justificativaPrazoMinimo;

    private java.lang.String complementoJustificativaPrazoMinimo;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.Traslado[] traslados;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoSolicitacao tipoSolicitacao;

    private java.lang.Integer idSolicitacaoPrincipal;

    private java.lang.String projeto;

    private java.lang.String contaContabilAereo;

    private java.lang.String contaContabilHotel;

    private java.lang.String contaContabilCarro;

    private java.lang.String contaContabilSeguro;

    private java.lang.String contaContabilOutro;

    private java.lang.String contaContabilTraslado;

    private java.lang.String descricaoProjeto;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro aprovadorResponsavel;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.expense.Expense expense;

    private java.lang.String codigoContaContabil;

    private java.lang.String codRegional;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.rodoviario.Rodoviario[] rodoviarios;

    private java.lang.String contaContabilRodoviario;

    public Solicitacao() {
    }

    public Solicitacao(
           int idSolicitacao,
           java.lang.String localVenda,
           java.util.Calendar dataAprovacao,
           java.lang.String descricaoCentroCusto,
           java.lang.String descricaoSubCentroCusto,
           java.util.Calendar dataCriacaoSv,
           java.lang.String codigoAutorizacaoViagem,
           java.lang.String codigoClienteFranquia,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro solicitante,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro aprovador,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Atendimento atendimento,
           java.util.Calendar dataConclusao,
           java.lang.String regional,
           java.lang.String centroDeCusto,
           java.lang.String subCentroDeCusto,
           java.lang.String contaContabil,
           boolean nacional,
           java.lang.String codigoCliente,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro[] passageiros,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo[] aereos,
           br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.Hotel[] hoteis,
           br.com.lemontech.selfbooking.wsselfbooking.beans.carro.Carro[] carros,
           br.com.lemontech.selfbooking.wsselfbooking.beans.outro.Outro[] outros,
           java.lang.String motivoViagem,
           java.lang.Double adiantamento,
           java.lang.String moedaAdiantamento,
           java.lang.String controleCliente,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Totais totais,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusSolicitacao statusSolicitacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao,
           java.lang.Boolean autoConclusao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Rateio[] rateios,
           java.lang.String codigoUnidadeNegocio,
           java.lang.String unidadeNegocio,
           int idCliente,
           br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.Seguro[] seguros,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Agencia agencia,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Filial filial,
           br.com.lemontech.selfbooking.wsselfbooking.beans.InstrucoesFaturamento instrucoesFaturamento,
           java.lang.Boolean frontOffice,
           java.lang.String complementoMotivoViagem,
           br.com.lemontech.selfbooking.wsselfbooking.beans.PontoVenda pontoVenda,
           java.lang.String observacao,
           java.lang.String justificativaPrazoMinimo,
           java.lang.String complementoJustificativaPrazoMinimo,
           br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.Traslado[] traslados,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoSolicitacao tipoSolicitacao,
           java.lang.Integer idSolicitacaoPrincipal,
           java.lang.String projeto,
           java.lang.String contaContabilAereo,
           java.lang.String contaContabilHotel,
           java.lang.String contaContabilCarro,
           java.lang.String contaContabilSeguro,
           java.lang.String contaContabilOutro,
           java.lang.String contaContabilTraslado,
           java.lang.String descricaoProjeto,
           br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro aprovadorResponsavel,
           br.com.lemontech.selfbooking.wsselfbooking.beans.expense.Expense expense,
           java.lang.String codigoContaContabil,
           java.lang.String codRegional,
           br.com.lemontech.selfbooking.wsselfbooking.beans.rodoviario.Rodoviario[] rodoviarios,
           java.lang.String contaContabilRodoviario) {
           this.idSolicitacao = idSolicitacao;
           this.localVenda = localVenda;
           this.dataAprovacao = dataAprovacao;
           this.descricaoCentroCusto = descricaoCentroCusto;
           this.descricaoSubCentroCusto = descricaoSubCentroCusto;
           this.dataCriacaoSv = dataCriacaoSv;
           this.codigoAutorizacaoViagem = codigoAutorizacaoViagem;
           this.codigoClienteFranquia = codigoClienteFranquia;
           this.solicitante = solicitante;
           this.aprovador = aprovador;
           this.atendimento = atendimento;
           this.dataConclusao = dataConclusao;
           this.regional = regional;
           this.centroDeCusto = centroDeCusto;
           this.subCentroDeCusto = subCentroDeCusto;
           this.contaContabil = contaContabil;
           this.nacional = nacional;
           this.codigoCliente = codigoCliente;
           this.passageiros = passageiros;
           this.aereos = aereos;
           this.hoteis = hoteis;
           this.carros = carros;
           this.outros = outros;
           this.motivoViagem = motivoViagem;
           this.adiantamento = adiantamento;
           this.moedaAdiantamento = moedaAdiantamento;
           this.controleCliente = controleCliente;
           this.totais = totais;
           this.statusSolicitacao = statusSolicitacao;
           this.identificadoresIntegracao = identificadoresIntegracao;
           this.autoConclusao = autoConclusao;
           this.rateios = rateios;
           this.codigoUnidadeNegocio = codigoUnidadeNegocio;
           this.unidadeNegocio = unidadeNegocio;
           this.idCliente = idCliente;
           this.seguros = seguros;
           this.agencia = agencia;
           this.filial = filial;
           this.instrucoesFaturamento = instrucoesFaturamento;
           this.frontOffice = frontOffice;
           this.complementoMotivoViagem = complementoMotivoViagem;
           this.pontoVenda = pontoVenda;
           this.observacao = observacao;
           this.justificativaPrazoMinimo = justificativaPrazoMinimo;
           this.complementoJustificativaPrazoMinimo = complementoJustificativaPrazoMinimo;
           this.traslados = traslados;
           this.tipoSolicitacao = tipoSolicitacao;
           this.idSolicitacaoPrincipal = idSolicitacaoPrincipal;
           this.projeto = projeto;
           this.contaContabilAereo = contaContabilAereo;
           this.contaContabilHotel = contaContabilHotel;
           this.contaContabilCarro = contaContabilCarro;
           this.contaContabilSeguro = contaContabilSeguro;
           this.contaContabilOutro = contaContabilOutro;
           this.contaContabilTraslado = contaContabilTraslado;
           this.descricaoProjeto = descricaoProjeto;
           this.aprovadorResponsavel = aprovadorResponsavel;
           this.expense = expense;
           this.codigoContaContabil = codigoContaContabil;
           this.codRegional = codRegional;
           this.rodoviarios = rodoviarios;
           this.contaContabilRodoviario = contaContabilRodoviario;
    }


    /**
     * Gets the idSolicitacao value for this Solicitacao.
     * 
     * @return idSolicitacao
     */
    public int getIdSolicitacao() {
        return idSolicitacao;
    }


    /**
     * Sets the idSolicitacao value for this Solicitacao.
     * 
     * @param idSolicitacao
     */
    public void setIdSolicitacao(int idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }


    /**
     * Gets the localVenda value for this Solicitacao.
     * 
     * @return localVenda
     */
    public java.lang.String getLocalVenda() {
        return localVenda;
    }


    /**
     * Sets the localVenda value for this Solicitacao.
     * 
     * @param localVenda
     */
    public void setLocalVenda(java.lang.String localVenda) {
        this.localVenda = localVenda;
    }


    /**
     * Gets the dataAprovacao value for this Solicitacao.
     * 
     * @return dataAprovacao
     */
    public java.util.Calendar getDataAprovacao() {
        return dataAprovacao;
    }


    /**
     * Sets the dataAprovacao value for this Solicitacao.
     * 
     * @param dataAprovacao
     */
    public void setDataAprovacao(java.util.Calendar dataAprovacao) {
        this.dataAprovacao = dataAprovacao;
    }


    /**
     * Gets the descricaoCentroCusto value for this Solicitacao.
     * 
     * @return descricaoCentroCusto
     */
    public java.lang.String getDescricaoCentroCusto() {
        return descricaoCentroCusto;
    }


    /**
     * Sets the descricaoCentroCusto value for this Solicitacao.
     * 
     * @param descricaoCentroCusto
     */
    public void setDescricaoCentroCusto(java.lang.String descricaoCentroCusto) {
        this.descricaoCentroCusto = descricaoCentroCusto;
    }


    /**
     * Gets the descricaoSubCentroCusto value for this Solicitacao.
     * 
     * @return descricaoSubCentroCusto
     */
    public java.lang.String getDescricaoSubCentroCusto() {
        return descricaoSubCentroCusto;
    }


    /**
     * Sets the descricaoSubCentroCusto value for this Solicitacao.
     * 
     * @param descricaoSubCentroCusto
     */
    public void setDescricaoSubCentroCusto(java.lang.String descricaoSubCentroCusto) {
        this.descricaoSubCentroCusto = descricaoSubCentroCusto;
    }


    /**
     * Gets the dataCriacaoSv value for this Solicitacao.
     * 
     * @return dataCriacaoSv
     */
    public java.util.Calendar getDataCriacaoSv() {
        return dataCriacaoSv;
    }


    /**
     * Sets the dataCriacaoSv value for this Solicitacao.
     * 
     * @param dataCriacaoSv
     */
    public void setDataCriacaoSv(java.util.Calendar dataCriacaoSv) {
        this.dataCriacaoSv = dataCriacaoSv;
    }


    /**
     * Gets the codigoAutorizacaoViagem value for this Solicitacao.
     * 
     * @return codigoAutorizacaoViagem
     */
    public java.lang.String getCodigoAutorizacaoViagem() {
        return codigoAutorizacaoViagem;
    }


    /**
     * Sets the codigoAutorizacaoViagem value for this Solicitacao.
     * 
     * @param codigoAutorizacaoViagem
     */
    public void setCodigoAutorizacaoViagem(java.lang.String codigoAutorizacaoViagem) {
        this.codigoAutorizacaoViagem = codigoAutorizacaoViagem;
    }


    /**
     * Gets the codigoClienteFranquia value for this Solicitacao.
     * 
     * @return codigoClienteFranquia
     */
    public java.lang.String getCodigoClienteFranquia() {
        return codigoClienteFranquia;
    }


    /**
     * Sets the codigoClienteFranquia value for this Solicitacao.
     * 
     * @param codigoClienteFranquia
     */
    public void setCodigoClienteFranquia(java.lang.String codigoClienteFranquia) {
        this.codigoClienteFranquia = codigoClienteFranquia;
    }


    /**
     * Gets the solicitante value for this Solicitacao.
     * 
     * @return solicitante
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro getSolicitante() {
        return solicitante;
    }


    /**
     * Sets the solicitante value for this Solicitacao.
     * 
     * @param solicitante
     */
    public void setSolicitante(br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro solicitante) {
        this.solicitante = solicitante;
    }


    /**
     * Gets the aprovador value for this Solicitacao.
     * 
     * @return aprovador
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro getAprovador() {
        return aprovador;
    }


    /**
     * Sets the aprovador value for this Solicitacao.
     * 
     * @param aprovador
     */
    public void setAprovador(br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro aprovador) {
        this.aprovador = aprovador;
    }


    /**
     * Gets the atendimento value for this Solicitacao.
     * 
     * @return atendimento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Atendimento getAtendimento() {
        return atendimento;
    }


    /**
     * Sets the atendimento value for this Solicitacao.
     * 
     * @param atendimento
     */
    public void setAtendimento(br.com.lemontech.selfbooking.wsselfbooking.beans.Atendimento atendimento) {
        this.atendimento = atendimento;
    }


    /**
     * Gets the dataConclusao value for this Solicitacao.
     * 
     * @return dataConclusao
     */
    public java.util.Calendar getDataConclusao() {
        return dataConclusao;
    }


    /**
     * Sets the dataConclusao value for this Solicitacao.
     * 
     * @param dataConclusao
     */
    public void setDataConclusao(java.util.Calendar dataConclusao) {
        this.dataConclusao = dataConclusao;
    }


    /**
     * Gets the regional value for this Solicitacao.
     * 
     * @return regional
     */
    public java.lang.String getRegional() {
        return regional;
    }


    /**
     * Sets the regional value for this Solicitacao.
     * 
     * @param regional
     */
    public void setRegional(java.lang.String regional) {
        this.regional = regional;
    }


    /**
     * Gets the centroDeCusto value for this Solicitacao.
     * 
     * @return centroDeCusto
     */
    public java.lang.String getCentroDeCusto() {
        return centroDeCusto;
    }


    /**
     * Sets the centroDeCusto value for this Solicitacao.
     * 
     * @param centroDeCusto
     */
    public void setCentroDeCusto(java.lang.String centroDeCusto) {
        this.centroDeCusto = centroDeCusto;
    }


    /**
     * Gets the subCentroDeCusto value for this Solicitacao.
     * 
     * @return subCentroDeCusto
     */
    public java.lang.String getSubCentroDeCusto() {
        return subCentroDeCusto;
    }


    /**
     * Sets the subCentroDeCusto value for this Solicitacao.
     * 
     * @param subCentroDeCusto
     */
    public void setSubCentroDeCusto(java.lang.String subCentroDeCusto) {
        this.subCentroDeCusto = subCentroDeCusto;
    }


    /**
     * Gets the contaContabil value for this Solicitacao.
     * 
     * @return contaContabil
     */
    public java.lang.String getContaContabil() {
        return contaContabil;
    }


    /**
     * Sets the contaContabil value for this Solicitacao.
     * 
     * @param contaContabil
     */
    public void setContaContabil(java.lang.String contaContabil) {
        this.contaContabil = contaContabil;
    }


    /**
     * Gets the nacional value for this Solicitacao.
     * 
     * @return nacional
     */
    public boolean isNacional() {
        return nacional;
    }


    /**
     * Sets the nacional value for this Solicitacao.
     * 
     * @param nacional
     */
    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }


    /**
     * Gets the codigoCliente value for this Solicitacao.
     * 
     * @return codigoCliente
     */
    public java.lang.String getCodigoCliente() {
        return codigoCliente;
    }


    /**
     * Sets the codigoCliente value for this Solicitacao.
     * 
     * @param codigoCliente
     */
    public void setCodigoCliente(java.lang.String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }


    /**
     * Gets the passageiros value for this Solicitacao.
     * 
     * @return passageiros
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro[] getPassageiros() {
        return passageiros;
    }


    /**
     * Sets the passageiros value for this Solicitacao.
     * 
     * @param passageiros
     */
    public void setPassageiros(br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro[] passageiros) {
        this.passageiros = passageiros;
    }


    /**
     * Gets the aereos value for this Solicitacao.
     * 
     * @return aereos
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo[] getAereos() {
        return aereos;
    }


    /**
     * Sets the aereos value for this Solicitacao.
     * 
     * @param aereos
     */
    public void setAereos(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo[] aereos) {
        this.aereos = aereos;
    }


    /**
     * Gets the hoteis value for this Solicitacao.
     * 
     * @return hoteis
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.Hotel[] getHoteis() {
        return hoteis;
    }


    /**
     * Sets the hoteis value for this Solicitacao.
     * 
     * @param hoteis
     */
    public void setHoteis(br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.Hotel[] hoteis) {
        this.hoteis = hoteis;
    }


    /**
     * Gets the carros value for this Solicitacao.
     * 
     * @return carros
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.carro.Carro[] getCarros() {
        return carros;
    }


    /**
     * Sets the carros value for this Solicitacao.
     * 
     * @param carros
     */
    public void setCarros(br.com.lemontech.selfbooking.wsselfbooking.beans.carro.Carro[] carros) {
        this.carros = carros;
    }


    /**
     * Gets the outros value for this Solicitacao.
     * 
     * @return outros
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.outro.Outro[] getOutros() {
        return outros;
    }


    /**
     * Sets the outros value for this Solicitacao.
     * 
     * @param outros
     */
    public void setOutros(br.com.lemontech.selfbooking.wsselfbooking.beans.outro.Outro[] outros) {
        this.outros = outros;
    }


    /**
     * Gets the motivoViagem value for this Solicitacao.
     * 
     * @return motivoViagem
     */
    public java.lang.String getMotivoViagem() {
        return motivoViagem;
    }


    /**
     * Sets the motivoViagem value for this Solicitacao.
     * 
     * @param motivoViagem
     */
    public void setMotivoViagem(java.lang.String motivoViagem) {
        this.motivoViagem = motivoViagem;
    }


    /**
     * Gets the adiantamento value for this Solicitacao.
     * 
     * @return adiantamento
     */
    public java.lang.Double getAdiantamento() {
        return adiantamento;
    }


    /**
     * Sets the adiantamento value for this Solicitacao.
     * 
     * @param adiantamento
     */
    public void setAdiantamento(java.lang.Double adiantamento) {
        this.adiantamento = adiantamento;
    }


    /**
     * Gets the moedaAdiantamento value for this Solicitacao.
     * 
     * @return moedaAdiantamento
     */
    public java.lang.String getMoedaAdiantamento() {
        return moedaAdiantamento;
    }


    /**
     * Sets the moedaAdiantamento value for this Solicitacao.
     * 
     * @param moedaAdiantamento
     */
    public void setMoedaAdiantamento(java.lang.String moedaAdiantamento) {
        this.moedaAdiantamento = moedaAdiantamento;
    }


    /**
     * Gets the controleCliente value for this Solicitacao.
     * 
     * @return controleCliente
     */
    public java.lang.String getControleCliente() {
        return controleCliente;
    }


    /**
     * Sets the controleCliente value for this Solicitacao.
     * 
     * @param controleCliente
     */
    public void setControleCliente(java.lang.String controleCliente) {
        this.controleCliente = controleCliente;
    }


    /**
     * Gets the totais value for this Solicitacao.
     * 
     * @return totais
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Totais getTotais() {
        return totais;
    }


    /**
     * Sets the totais value for this Solicitacao.
     * 
     * @param totais
     */
    public void setTotais(br.com.lemontech.selfbooking.wsselfbooking.beans.Totais totais) {
        this.totais = totais;
    }


    /**
     * Gets the statusSolicitacao value for this Solicitacao.
     * 
     * @return statusSolicitacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusSolicitacao getStatusSolicitacao() {
        return statusSolicitacao;
    }


    /**
     * Sets the statusSolicitacao value for this Solicitacao.
     * 
     * @param statusSolicitacao
     */
    public void setStatusSolicitacao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusSolicitacao statusSolicitacao) {
        this.statusSolicitacao = statusSolicitacao;
    }


    /**
     * Gets the identificadoresIntegracao value for this Solicitacao.
     * 
     * @return identificadoresIntegracao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] getIdentificadoresIntegracao() {
        return identificadoresIntegracao;
    }


    /**
     * Sets the identificadoresIntegracao value for this Solicitacao.
     * 
     * @param identificadoresIntegracao
     */
    public void setIdentificadoresIntegracao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao) {
        this.identificadoresIntegracao = identificadoresIntegracao;
    }


    /**
     * Gets the autoConclusao value for this Solicitacao.
     * 
     * @return autoConclusao
     */
    public java.lang.Boolean getAutoConclusao() {
        return autoConclusao;
    }


    /**
     * Sets the autoConclusao value for this Solicitacao.
     * 
     * @param autoConclusao
     */
    public void setAutoConclusao(java.lang.Boolean autoConclusao) {
        this.autoConclusao = autoConclusao;
    }


    /**
     * Gets the rateios value for this Solicitacao.
     * 
     * @return rateios   * A soma de todas as porcentagem dos rateios será de 100%.
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Rateio[] getRateios() {
        return rateios;
    }


    /**
     * Sets the rateios value for this Solicitacao.
     * 
     * @param rateios   * A soma de todas as porcentagem dos rateios será de 100%.
     */
    public void setRateios(br.com.lemontech.selfbooking.wsselfbooking.beans.Rateio[] rateios) {
        this.rateios = rateios;
    }


    /**
     * Gets the codigoUnidadeNegocio value for this Solicitacao.
     * 
     * @return codigoUnidadeNegocio
     */
    public java.lang.String getCodigoUnidadeNegocio() {
        return codigoUnidadeNegocio;
    }


    /**
     * Sets the codigoUnidadeNegocio value for this Solicitacao.
     * 
     * @param codigoUnidadeNegocio
     */
    public void setCodigoUnidadeNegocio(java.lang.String codigoUnidadeNegocio) {
        this.codigoUnidadeNegocio = codigoUnidadeNegocio;
    }


    /**
     * Gets the unidadeNegocio value for this Solicitacao.
     * 
     * @return unidadeNegocio
     */
    public java.lang.String getUnidadeNegocio() {
        return unidadeNegocio;
    }


    /**
     * Sets the unidadeNegocio value for this Solicitacao.
     * 
     * @param unidadeNegocio
     */
    public void setUnidadeNegocio(java.lang.String unidadeNegocio) {
        this.unidadeNegocio = unidadeNegocio;
    }


    /**
     * Gets the idCliente value for this Solicitacao.
     * 
     * @return idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }


    /**
     * Sets the idCliente value for this Solicitacao.
     * 
     * @param idCliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    /**
     * Gets the seguros value for this Solicitacao.
     * 
     * @return seguros
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.Seguro[] getSeguros() {
        return seguros;
    }


    /**
     * Sets the seguros value for this Solicitacao.
     * 
     * @param seguros
     */
    public void setSeguros(br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.Seguro[] seguros) {
        this.seguros = seguros;
    }


    /**
     * Gets the agencia value for this Solicitacao.
     * 
     * @return agencia
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Agencia getAgencia() {
        return agencia;
    }


    /**
     * Sets the agencia value for this Solicitacao.
     * 
     * @param agencia
     */
    public void setAgencia(br.com.lemontech.selfbooking.wsselfbooking.beans.Agencia agencia) {
        this.agencia = agencia;
    }


    /**
     * Gets the filial value for this Solicitacao.
     * 
     * @return filial
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Filial getFilial() {
        return filial;
    }


    /**
     * Sets the filial value for this Solicitacao.
     * 
     * @param filial
     */
    public void setFilial(br.com.lemontech.selfbooking.wsselfbooking.beans.Filial filial) {
        this.filial = filial;
    }


    /**
     * Gets the instrucoesFaturamento value for this Solicitacao.
     * 
     * @return instrucoesFaturamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.InstrucoesFaturamento getInstrucoesFaturamento() {
        return instrucoesFaturamento;
    }


    /**
     * Sets the instrucoesFaturamento value for this Solicitacao.
     * 
     * @param instrucoesFaturamento
     */
    public void setInstrucoesFaturamento(br.com.lemontech.selfbooking.wsselfbooking.beans.InstrucoesFaturamento instrucoesFaturamento) {
        this.instrucoesFaturamento = instrucoesFaturamento;
    }


    /**
     * Gets the frontOffice value for this Solicitacao.
     * 
     * @return frontOffice
     */
    public java.lang.Boolean getFrontOffice() {
        return frontOffice;
    }


    /**
     * Sets the frontOffice value for this Solicitacao.
     * 
     * @param frontOffice
     */
    public void setFrontOffice(java.lang.Boolean frontOffice) {
        this.frontOffice = frontOffice;
    }


    /**
     * Gets the complementoMotivoViagem value for this Solicitacao.
     * 
     * @return complementoMotivoViagem
     */
    public java.lang.String getComplementoMotivoViagem() {
        return complementoMotivoViagem;
    }


    /**
     * Sets the complementoMotivoViagem value for this Solicitacao.
     * 
     * @param complementoMotivoViagem
     */
    public void setComplementoMotivoViagem(java.lang.String complementoMotivoViagem) {
        this.complementoMotivoViagem = complementoMotivoViagem;
    }


    /**
     * Gets the pontoVenda value for this Solicitacao.
     * 
     * @return pontoVenda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.PontoVenda getPontoVenda() {
        return pontoVenda;
    }


    /**
     * Sets the pontoVenda value for this Solicitacao.
     * 
     * @param pontoVenda
     */
    public void setPontoVenda(br.com.lemontech.selfbooking.wsselfbooking.beans.PontoVenda pontoVenda) {
        this.pontoVenda = pontoVenda;
    }


    /**
     * Gets the observacao value for this Solicitacao.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this Solicitacao.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }


    /**
     * Gets the justificativaPrazoMinimo value for this Solicitacao.
     * 
     * @return justificativaPrazoMinimo
     */
    public java.lang.String getJustificativaPrazoMinimo() {
        return justificativaPrazoMinimo;
    }


    /**
     * Sets the justificativaPrazoMinimo value for this Solicitacao.
     * 
     * @param justificativaPrazoMinimo
     */
    public void setJustificativaPrazoMinimo(java.lang.String justificativaPrazoMinimo) {
        this.justificativaPrazoMinimo = justificativaPrazoMinimo;
    }


    /**
     * Gets the complementoJustificativaPrazoMinimo value for this Solicitacao.
     * 
     * @return complementoJustificativaPrazoMinimo
     */
    public java.lang.String getComplementoJustificativaPrazoMinimo() {
        return complementoJustificativaPrazoMinimo;
    }


    /**
     * Sets the complementoJustificativaPrazoMinimo value for this Solicitacao.
     * 
     * @param complementoJustificativaPrazoMinimo
     */
    public void setComplementoJustificativaPrazoMinimo(java.lang.String complementoJustificativaPrazoMinimo) {
        this.complementoJustificativaPrazoMinimo = complementoJustificativaPrazoMinimo;
    }


    /**
     * Gets the traslados value for this Solicitacao.
     * 
     * @return traslados
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.Traslado[] getTraslados() {
        return traslados;
    }


    /**
     * Sets the traslados value for this Solicitacao.
     * 
     * @param traslados
     */
    public void setTraslados(br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.Traslado[] traslados) {
        this.traslados = traslados;
    }


    /**
     * Gets the tipoSolicitacao value for this Solicitacao.
     * 
     * @return tipoSolicitacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoSolicitacao getTipoSolicitacao() {
        return tipoSolicitacao;
    }


    /**
     * Sets the tipoSolicitacao value for this Solicitacao.
     * 
     * @param tipoSolicitacao
     */
    public void setTipoSolicitacao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoSolicitacao tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }


    /**
     * Gets the idSolicitacaoPrincipal value for this Solicitacao.
     * 
     * @return idSolicitacaoPrincipal
     */
    public java.lang.Integer getIdSolicitacaoPrincipal() {
        return idSolicitacaoPrincipal;
    }


    /**
     * Sets the idSolicitacaoPrincipal value for this Solicitacao.
     * 
     * @param idSolicitacaoPrincipal
     */
    public void setIdSolicitacaoPrincipal(java.lang.Integer idSolicitacaoPrincipal) {
        this.idSolicitacaoPrincipal = idSolicitacaoPrincipal;
    }


    /**
     * Gets the projeto value for this Solicitacao.
     * 
     * @return projeto
     */
    public java.lang.String getProjeto() {
        return projeto;
    }


    /**
     * Sets the projeto value for this Solicitacao.
     * 
     * @param projeto
     */
    public void setProjeto(java.lang.String projeto) {
        this.projeto = projeto;
    }


    /**
     * Gets the contaContabilAereo value for this Solicitacao.
     * 
     * @return contaContabilAereo
     */
    public java.lang.String getContaContabilAereo() {
        return contaContabilAereo;
    }


    /**
     * Sets the contaContabilAereo value for this Solicitacao.
     * 
     * @param contaContabilAereo
     */
    public void setContaContabilAereo(java.lang.String contaContabilAereo) {
        this.contaContabilAereo = contaContabilAereo;
    }


    /**
     * Gets the contaContabilHotel value for this Solicitacao.
     * 
     * @return contaContabilHotel
     */
    public java.lang.String getContaContabilHotel() {
        return contaContabilHotel;
    }


    /**
     * Sets the contaContabilHotel value for this Solicitacao.
     * 
     * @param contaContabilHotel
     */
    public void setContaContabilHotel(java.lang.String contaContabilHotel) {
        this.contaContabilHotel = contaContabilHotel;
    }


    /**
     * Gets the contaContabilCarro value for this Solicitacao.
     * 
     * @return contaContabilCarro
     */
    public java.lang.String getContaContabilCarro() {
        return contaContabilCarro;
    }


    /**
     * Sets the contaContabilCarro value for this Solicitacao.
     * 
     * @param contaContabilCarro
     */
    public void setContaContabilCarro(java.lang.String contaContabilCarro) {
        this.contaContabilCarro = contaContabilCarro;
    }


    /**
     * Gets the contaContabilSeguro value for this Solicitacao.
     * 
     * @return contaContabilSeguro
     */
    public java.lang.String getContaContabilSeguro() {
        return contaContabilSeguro;
    }


    /**
     * Sets the contaContabilSeguro value for this Solicitacao.
     * 
     * @param contaContabilSeguro
     */
    public void setContaContabilSeguro(java.lang.String contaContabilSeguro) {
        this.contaContabilSeguro = contaContabilSeguro;
    }


    /**
     * Gets the contaContabilOutro value for this Solicitacao.
     * 
     * @return contaContabilOutro
     */
    public java.lang.String getContaContabilOutro() {
        return contaContabilOutro;
    }


    /**
     * Sets the contaContabilOutro value for this Solicitacao.
     * 
     * @param contaContabilOutro
     */
    public void setContaContabilOutro(java.lang.String contaContabilOutro) {
        this.contaContabilOutro = contaContabilOutro;
    }


    /**
     * Gets the contaContabilTraslado value for this Solicitacao.
     * 
     * @return contaContabilTraslado
     */
    public java.lang.String getContaContabilTraslado() {
        return contaContabilTraslado;
    }


    /**
     * Sets the contaContabilTraslado value for this Solicitacao.
     * 
     * @param contaContabilTraslado
     */
    public void setContaContabilTraslado(java.lang.String contaContabilTraslado) {
        this.contaContabilTraslado = contaContabilTraslado;
    }


    /**
     * Gets the descricaoProjeto value for this Solicitacao.
     * 
     * @return descricaoProjeto
     */
    public java.lang.String getDescricaoProjeto() {
        return descricaoProjeto;
    }


    /**
     * Sets the descricaoProjeto value for this Solicitacao.
     * 
     * @param descricaoProjeto
     */
    public void setDescricaoProjeto(java.lang.String descricaoProjeto) {
        this.descricaoProjeto = descricaoProjeto;
    }


    /**
     * Gets the aprovadorResponsavel value for this Solicitacao.
     * 
     * @return aprovadorResponsavel
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro getAprovadorResponsavel() {
        return aprovadorResponsavel;
    }


    /**
     * Sets the aprovadorResponsavel value for this Solicitacao.
     * 
     * @param aprovadorResponsavel
     */
    public void setAprovadorResponsavel(br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro aprovadorResponsavel) {
        this.aprovadorResponsavel = aprovadorResponsavel;
    }


    /**
     * Gets the expense value for this Solicitacao.
     * 
     * @return expense
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.expense.Expense getExpense() {
        return expense;
    }


    /**
     * Sets the expense value for this Solicitacao.
     * 
     * @param expense
     */
    public void setExpense(br.com.lemontech.selfbooking.wsselfbooking.beans.expense.Expense expense) {
        this.expense = expense;
    }


    /**
     * Gets the codigoContaContabil value for this Solicitacao.
     * 
     * @return codigoContaContabil
     */
    public java.lang.String getCodigoContaContabil() {
        return codigoContaContabil;
    }


    /**
     * Sets the codigoContaContabil value for this Solicitacao.
     * 
     * @param codigoContaContabil
     */
    public void setCodigoContaContabil(java.lang.String codigoContaContabil) {
        this.codigoContaContabil = codigoContaContabil;
    }


    /**
     * Gets the codRegional value for this Solicitacao.
     * 
     * @return codRegional
     */
    public java.lang.String getCodRegional() {
        return codRegional;
    }


    /**
     * Sets the codRegional value for this Solicitacao.
     * 
     * @param codRegional
     */
    public void setCodRegional(java.lang.String codRegional) {
        this.codRegional = codRegional;
    }


    /**
     * Gets the rodoviarios value for this Solicitacao.
     * 
     * @return rodoviarios
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.rodoviario.Rodoviario[] getRodoviarios() {
        return rodoviarios;
    }


    /**
     * Sets the rodoviarios value for this Solicitacao.
     * 
     * @param rodoviarios
     */
    public void setRodoviarios(br.com.lemontech.selfbooking.wsselfbooking.beans.rodoviario.Rodoviario[] rodoviarios) {
        this.rodoviarios = rodoviarios;
    }


    /**
     * Gets the contaContabilRodoviario value for this Solicitacao.
     * 
     * @return contaContabilRodoviario
     */
    public java.lang.String getContaContabilRodoviario() {
        return contaContabilRodoviario;
    }


    /**
     * Sets the contaContabilRodoviario value for this Solicitacao.
     * 
     * @param contaContabilRodoviario
     */
    public void setContaContabilRodoviario(java.lang.String contaContabilRodoviario) {
        this.contaContabilRodoviario = contaContabilRodoviario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Solicitacao)) return false;
        Solicitacao other = (Solicitacao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idSolicitacao == other.getIdSolicitacao() &&
            ((this.localVenda==null && other.getLocalVenda()==null) || 
             (this.localVenda!=null &&
              this.localVenda.equals(other.getLocalVenda()))) &&
            ((this.dataAprovacao==null && other.getDataAprovacao()==null) || 
             (this.dataAprovacao!=null &&
              this.dataAprovacao.equals(other.getDataAprovacao()))) &&
            ((this.descricaoCentroCusto==null && other.getDescricaoCentroCusto()==null) || 
             (this.descricaoCentroCusto!=null &&
              this.descricaoCentroCusto.equals(other.getDescricaoCentroCusto()))) &&
            ((this.descricaoSubCentroCusto==null && other.getDescricaoSubCentroCusto()==null) || 
             (this.descricaoSubCentroCusto!=null &&
              this.descricaoSubCentroCusto.equals(other.getDescricaoSubCentroCusto()))) &&
            ((this.dataCriacaoSv==null && other.getDataCriacaoSv()==null) || 
             (this.dataCriacaoSv!=null &&
              this.dataCriacaoSv.equals(other.getDataCriacaoSv()))) &&
            ((this.codigoAutorizacaoViagem==null && other.getCodigoAutorizacaoViagem()==null) || 
             (this.codigoAutorizacaoViagem!=null &&
              this.codigoAutorizacaoViagem.equals(other.getCodigoAutorizacaoViagem()))) &&
            ((this.codigoClienteFranquia==null && other.getCodigoClienteFranquia()==null) || 
             (this.codigoClienteFranquia!=null &&
              this.codigoClienteFranquia.equals(other.getCodigoClienteFranquia()))) &&
            ((this.solicitante==null && other.getSolicitante()==null) || 
             (this.solicitante!=null &&
              this.solicitante.equals(other.getSolicitante()))) &&
            ((this.aprovador==null && other.getAprovador()==null) || 
             (this.aprovador!=null &&
              this.aprovador.equals(other.getAprovador()))) &&
            ((this.atendimento==null && other.getAtendimento()==null) || 
             (this.atendimento!=null &&
              this.atendimento.equals(other.getAtendimento()))) &&
            ((this.dataConclusao==null && other.getDataConclusao()==null) || 
             (this.dataConclusao!=null &&
              this.dataConclusao.equals(other.getDataConclusao()))) &&
            ((this.regional==null && other.getRegional()==null) || 
             (this.regional!=null &&
              this.regional.equals(other.getRegional()))) &&
            ((this.centroDeCusto==null && other.getCentroDeCusto()==null) || 
             (this.centroDeCusto!=null &&
              this.centroDeCusto.equals(other.getCentroDeCusto()))) &&
            ((this.subCentroDeCusto==null && other.getSubCentroDeCusto()==null) || 
             (this.subCentroDeCusto!=null &&
              this.subCentroDeCusto.equals(other.getSubCentroDeCusto()))) &&
            ((this.contaContabil==null && other.getContaContabil()==null) || 
             (this.contaContabil!=null &&
              this.contaContabil.equals(other.getContaContabil()))) &&
            this.nacional == other.isNacional() &&
            ((this.codigoCliente==null && other.getCodigoCliente()==null) || 
             (this.codigoCliente!=null &&
              this.codigoCliente.equals(other.getCodigoCliente()))) &&
            ((this.passageiros==null && other.getPassageiros()==null) || 
             (this.passageiros!=null &&
              java.util.Arrays.equals(this.passageiros, other.getPassageiros()))) &&
            ((this.aereos==null && other.getAereos()==null) || 
             (this.aereos!=null &&
              java.util.Arrays.equals(this.aereos, other.getAereos()))) &&
            ((this.hoteis==null && other.getHoteis()==null) || 
             (this.hoteis!=null &&
              java.util.Arrays.equals(this.hoteis, other.getHoteis()))) &&
            ((this.carros==null && other.getCarros()==null) || 
             (this.carros!=null &&
              java.util.Arrays.equals(this.carros, other.getCarros()))) &&
            ((this.outros==null && other.getOutros()==null) || 
             (this.outros!=null &&
              java.util.Arrays.equals(this.outros, other.getOutros()))) &&
            ((this.motivoViagem==null && other.getMotivoViagem()==null) || 
             (this.motivoViagem!=null &&
              this.motivoViagem.equals(other.getMotivoViagem()))) &&
            ((this.adiantamento==null && other.getAdiantamento()==null) || 
             (this.adiantamento!=null &&
              this.adiantamento.equals(other.getAdiantamento()))) &&
            ((this.moedaAdiantamento==null && other.getMoedaAdiantamento()==null) || 
             (this.moedaAdiantamento!=null &&
              this.moedaAdiantamento.equals(other.getMoedaAdiantamento()))) &&
            ((this.controleCliente==null && other.getControleCliente()==null) || 
             (this.controleCliente!=null &&
              this.controleCliente.equals(other.getControleCliente()))) &&
            ((this.totais==null && other.getTotais()==null) || 
             (this.totais!=null &&
              this.totais.equals(other.getTotais()))) &&
            ((this.statusSolicitacao==null && other.getStatusSolicitacao()==null) || 
             (this.statusSolicitacao!=null &&
              this.statusSolicitacao.equals(other.getStatusSolicitacao()))) &&
            ((this.identificadoresIntegracao==null && other.getIdentificadoresIntegracao()==null) || 
             (this.identificadoresIntegracao!=null &&
              java.util.Arrays.equals(this.identificadoresIntegracao, other.getIdentificadoresIntegracao()))) &&
            ((this.autoConclusao==null && other.getAutoConclusao()==null) || 
             (this.autoConclusao!=null &&
              this.autoConclusao.equals(other.getAutoConclusao()))) &&
            ((this.rateios==null && other.getRateios()==null) || 
             (this.rateios!=null &&
              java.util.Arrays.equals(this.rateios, other.getRateios()))) &&
            ((this.codigoUnidadeNegocio==null && other.getCodigoUnidadeNegocio()==null) || 
             (this.codigoUnidadeNegocio!=null &&
              this.codigoUnidadeNegocio.equals(other.getCodigoUnidadeNegocio()))) &&
            ((this.unidadeNegocio==null && other.getUnidadeNegocio()==null) || 
             (this.unidadeNegocio!=null &&
              this.unidadeNegocio.equals(other.getUnidadeNegocio()))) &&
            this.idCliente == other.getIdCliente() &&
            ((this.seguros==null && other.getSeguros()==null) || 
             (this.seguros!=null &&
              java.util.Arrays.equals(this.seguros, other.getSeguros()))) &&
            ((this.agencia==null && other.getAgencia()==null) || 
             (this.agencia!=null &&
              this.agencia.equals(other.getAgencia()))) &&
            ((this.filial==null && other.getFilial()==null) || 
             (this.filial!=null &&
              this.filial.equals(other.getFilial()))) &&
            ((this.instrucoesFaturamento==null && other.getInstrucoesFaturamento()==null) || 
             (this.instrucoesFaturamento!=null &&
              this.instrucoesFaturamento.equals(other.getInstrucoesFaturamento()))) &&
            ((this.frontOffice==null && other.getFrontOffice()==null) || 
             (this.frontOffice!=null &&
              this.frontOffice.equals(other.getFrontOffice()))) &&
            ((this.complementoMotivoViagem==null && other.getComplementoMotivoViagem()==null) || 
             (this.complementoMotivoViagem!=null &&
              this.complementoMotivoViagem.equals(other.getComplementoMotivoViagem()))) &&
            ((this.pontoVenda==null && other.getPontoVenda()==null) || 
             (this.pontoVenda!=null &&
              this.pontoVenda.equals(other.getPontoVenda()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao()))) &&
            ((this.justificativaPrazoMinimo==null && other.getJustificativaPrazoMinimo()==null) || 
             (this.justificativaPrazoMinimo!=null &&
              this.justificativaPrazoMinimo.equals(other.getJustificativaPrazoMinimo()))) &&
            ((this.complementoJustificativaPrazoMinimo==null && other.getComplementoJustificativaPrazoMinimo()==null) || 
             (this.complementoJustificativaPrazoMinimo!=null &&
              this.complementoJustificativaPrazoMinimo.equals(other.getComplementoJustificativaPrazoMinimo()))) &&
            ((this.traslados==null && other.getTraslados()==null) || 
             (this.traslados!=null &&
              java.util.Arrays.equals(this.traslados, other.getTraslados()))) &&
            ((this.tipoSolicitacao==null && other.getTipoSolicitacao()==null) || 
             (this.tipoSolicitacao!=null &&
              this.tipoSolicitacao.equals(other.getTipoSolicitacao()))) &&
            ((this.idSolicitacaoPrincipal==null && other.getIdSolicitacaoPrincipal()==null) || 
             (this.idSolicitacaoPrincipal!=null &&
              this.idSolicitacaoPrincipal.equals(other.getIdSolicitacaoPrincipal()))) &&
            ((this.projeto==null && other.getProjeto()==null) || 
             (this.projeto!=null &&
              this.projeto.equals(other.getProjeto()))) &&
            ((this.contaContabilAereo==null && other.getContaContabilAereo()==null) || 
             (this.contaContabilAereo!=null &&
              this.contaContabilAereo.equals(other.getContaContabilAereo()))) &&
            ((this.contaContabilHotel==null && other.getContaContabilHotel()==null) || 
             (this.contaContabilHotel!=null &&
              this.contaContabilHotel.equals(other.getContaContabilHotel()))) &&
            ((this.contaContabilCarro==null && other.getContaContabilCarro()==null) || 
             (this.contaContabilCarro!=null &&
              this.contaContabilCarro.equals(other.getContaContabilCarro()))) &&
            ((this.contaContabilSeguro==null && other.getContaContabilSeguro()==null) || 
             (this.contaContabilSeguro!=null &&
              this.contaContabilSeguro.equals(other.getContaContabilSeguro()))) &&
            ((this.contaContabilOutro==null && other.getContaContabilOutro()==null) || 
             (this.contaContabilOutro!=null &&
              this.contaContabilOutro.equals(other.getContaContabilOutro()))) &&
            ((this.contaContabilTraslado==null && other.getContaContabilTraslado()==null) || 
             (this.contaContabilTraslado!=null &&
              this.contaContabilTraslado.equals(other.getContaContabilTraslado()))) &&
            ((this.descricaoProjeto==null && other.getDescricaoProjeto()==null) || 
             (this.descricaoProjeto!=null &&
              this.descricaoProjeto.equals(other.getDescricaoProjeto()))) &&
            ((this.aprovadorResponsavel==null && other.getAprovadorResponsavel()==null) || 
             (this.aprovadorResponsavel!=null &&
              this.aprovadorResponsavel.equals(other.getAprovadorResponsavel()))) &&
            ((this.expense==null && other.getExpense()==null) || 
             (this.expense!=null &&
              this.expense.equals(other.getExpense()))) &&
            ((this.codigoContaContabil==null && other.getCodigoContaContabil()==null) || 
             (this.codigoContaContabil!=null &&
              this.codigoContaContabil.equals(other.getCodigoContaContabil()))) &&
            ((this.codRegional==null && other.getCodRegional()==null) || 
             (this.codRegional!=null &&
              this.codRegional.equals(other.getCodRegional()))) &&
            ((this.rodoviarios==null && other.getRodoviarios()==null) || 
             (this.rodoviarios!=null &&
              java.util.Arrays.equals(this.rodoviarios, other.getRodoviarios()))) &&
            ((this.contaContabilRodoviario==null && other.getContaContabilRodoviario()==null) || 
             (this.contaContabilRodoviario!=null &&
              this.contaContabilRodoviario.equals(other.getContaContabilRodoviario())));
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
        _hashCode += getIdSolicitacao();
        if (getLocalVenda() != null) {
            _hashCode += getLocalVenda().hashCode();
        }
        if (getDataAprovacao() != null) {
            _hashCode += getDataAprovacao().hashCode();
        }
        if (getDescricaoCentroCusto() != null) {
            _hashCode += getDescricaoCentroCusto().hashCode();
        }
        if (getDescricaoSubCentroCusto() != null) {
            _hashCode += getDescricaoSubCentroCusto().hashCode();
        }
        if (getDataCriacaoSv() != null) {
            _hashCode += getDataCriacaoSv().hashCode();
        }
        if (getCodigoAutorizacaoViagem() != null) {
            _hashCode += getCodigoAutorizacaoViagem().hashCode();
        }
        if (getCodigoClienteFranquia() != null) {
            _hashCode += getCodigoClienteFranquia().hashCode();
        }
        if (getSolicitante() != null) {
            _hashCode += getSolicitante().hashCode();
        }
        if (getAprovador() != null) {
            _hashCode += getAprovador().hashCode();
        }
        if (getAtendimento() != null) {
            _hashCode += getAtendimento().hashCode();
        }
        if (getDataConclusao() != null) {
            _hashCode += getDataConclusao().hashCode();
        }
        if (getRegional() != null) {
            _hashCode += getRegional().hashCode();
        }
        if (getCentroDeCusto() != null) {
            _hashCode += getCentroDeCusto().hashCode();
        }
        if (getSubCentroDeCusto() != null) {
            _hashCode += getSubCentroDeCusto().hashCode();
        }
        if (getContaContabil() != null) {
            _hashCode += getContaContabil().hashCode();
        }
        _hashCode += (isNacional() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCodigoCliente() != null) {
            _hashCode += getCodigoCliente().hashCode();
        }
        if (getPassageiros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassageiros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassageiros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAereos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAereos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAereos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHoteis() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHoteis());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHoteis(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCarros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCarros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMotivoViagem() != null) {
            _hashCode += getMotivoViagem().hashCode();
        }
        if (getAdiantamento() != null) {
            _hashCode += getAdiantamento().hashCode();
        }
        if (getMoedaAdiantamento() != null) {
            _hashCode += getMoedaAdiantamento().hashCode();
        }
        if (getControleCliente() != null) {
            _hashCode += getControleCliente().hashCode();
        }
        if (getTotais() != null) {
            _hashCode += getTotais().hashCode();
        }
        if (getStatusSolicitacao() != null) {
            _hashCode += getStatusSolicitacao().hashCode();
        }
        if (getIdentificadoresIntegracao() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdentificadoresIntegracao());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdentificadoresIntegracao(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutoConclusao() != null) {
            _hashCode += getAutoConclusao().hashCode();
        }
        if (getRateios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRateios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRateios(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodigoUnidadeNegocio() != null) {
            _hashCode += getCodigoUnidadeNegocio().hashCode();
        }
        if (getUnidadeNegocio() != null) {
            _hashCode += getUnidadeNegocio().hashCode();
        }
        _hashCode += getIdCliente();
        if (getSeguros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeguros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeguros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAgencia() != null) {
            _hashCode += getAgencia().hashCode();
        }
        if (getFilial() != null) {
            _hashCode += getFilial().hashCode();
        }
        if (getInstrucoesFaturamento() != null) {
            _hashCode += getInstrucoesFaturamento().hashCode();
        }
        if (getFrontOffice() != null) {
            _hashCode += getFrontOffice().hashCode();
        }
        if (getComplementoMotivoViagem() != null) {
            _hashCode += getComplementoMotivoViagem().hashCode();
        }
        if (getPontoVenda() != null) {
            _hashCode += getPontoVenda().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        if (getJustificativaPrazoMinimo() != null) {
            _hashCode += getJustificativaPrazoMinimo().hashCode();
        }
        if (getComplementoJustificativaPrazoMinimo() != null) {
            _hashCode += getComplementoJustificativaPrazoMinimo().hashCode();
        }
        if (getTraslados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTraslados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTraslados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTipoSolicitacao() != null) {
            _hashCode += getTipoSolicitacao().hashCode();
        }
        if (getIdSolicitacaoPrincipal() != null) {
            _hashCode += getIdSolicitacaoPrincipal().hashCode();
        }
        if (getProjeto() != null) {
            _hashCode += getProjeto().hashCode();
        }
        if (getContaContabilAereo() != null) {
            _hashCode += getContaContabilAereo().hashCode();
        }
        if (getContaContabilHotel() != null) {
            _hashCode += getContaContabilHotel().hashCode();
        }
        if (getContaContabilCarro() != null) {
            _hashCode += getContaContabilCarro().hashCode();
        }
        if (getContaContabilSeguro() != null) {
            _hashCode += getContaContabilSeguro().hashCode();
        }
        if (getContaContabilOutro() != null) {
            _hashCode += getContaContabilOutro().hashCode();
        }
        if (getContaContabilTraslado() != null) {
            _hashCode += getContaContabilTraslado().hashCode();
        }
        if (getDescricaoProjeto() != null) {
            _hashCode += getDescricaoProjeto().hashCode();
        }
        if (getAprovadorResponsavel() != null) {
            _hashCode += getAprovadorResponsavel().hashCode();
        }
        if (getExpense() != null) {
            _hashCode += getExpense().hashCode();
        }
        if (getCodigoContaContabil() != null) {
            _hashCode += getCodigoContaContabil().hashCode();
        }
        if (getCodRegional() != null) {
            _hashCode += getCodRegional().hashCode();
        }
        if (getRodoviarios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRodoviarios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRodoviarios(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContaContabilRodoviario() != null) {
            _hashCode += getContaContabilRodoviario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Solicitacao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "solicitacao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localVenda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localVenda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAprovacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataAprovacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoCentroCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricaoCentroCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoSubCentroCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricaoSubCentroCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCriacaoSv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCriacaoSv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAutorizacaoViagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoAutorizacaoViagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoClienteFranquia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoClienteFranquia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "solicitante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "passageiro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aprovador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aprovador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "passageiro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atendimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atendimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "atendimento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataConclusao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataConclusao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroDeCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "centroDeCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCentroDeCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subCentroDeCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaContabil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contaContabil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nacional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passageiros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passageiros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "passageiro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "passageiro"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aereos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aereos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "aereo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoteis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hoteis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/hotel", "hotel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "hotel"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/carro", "carro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "carro"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/outro", "outro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "outros"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoViagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motivoViagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adiantamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adiantamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moedaAdiantamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moedaAdiantamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controleCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controleCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "totais"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "statusSolicitacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadoresIntegracao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadoresIntegracao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "identificador"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "identificador"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoConclusao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoConclusao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "rateio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "rateio"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoUnidadeNegocio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoUnidadeNegocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadeNegocio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidadeNegocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seguros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seguros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/seguro", "seguro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "seguro"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "agencia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "filial"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instrucoesFaturamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instrucoesFaturamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "instrucoesFaturamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frontOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frontOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complementoMotivoViagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "complementoMotivoViagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pontoVenda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pontoVenda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "pontoVenda"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justificativaPrazoMinimo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "justificativaPrazoMinimo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complementoJustificativaPrazoMinimo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "complementoJustificativaPrazoMinimo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traslados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traslados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/traslado", "traslado"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "traslados"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoSolicitacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacaoPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSolicitacaoPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projeto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projeto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaContabilAereo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contaContabilAereo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaContabilHotel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contaContabilHotel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaContabilCarro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contaContabilCarro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaContabilSeguro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contaContabilSeguro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaContabilOutro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contaContabilOutro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaContabilTraslado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contaContabilTraslado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoProjeto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricaoProjeto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aprovadorResponsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aprovadorResponsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "passageiro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expense");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "expense"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoContaContabil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoContaContabil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codRegional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codRegional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rodoviarios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rodoviarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/rodoviario", "rodoviario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "rodoviarios"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaContabilRodoviario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contaContabilRodoviario"));
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
