/**
 * Carro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.carro;

public class Carro  implements java.io.Serializable {
    private int id;

    private java.lang.String modelo;

    private java.lang.String nomeLocadora;

    private java.lang.String localRetirada;

    private java.util.Calendar dataRetirada;

    private java.lang.String localDevolucao;

    private java.util.Calendar dataDevolucao;

    private java.lang.String localizador;

    private java.lang.String codigoEmissor;

    private java.lang.String codigoReservador;

    private java.lang.String nomeReservador;

    private java.lang.String source;

    private java.util.Calendar dataReserva;

    private java.lang.Double diaria;

    private java.lang.Double taxa;

    private java.lang.Double taxaservico;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamento;

    private java.lang.Integer[] idPassageiroRef;

    private java.lang.String justificativaMaiorTarifa;

    private java.lang.String cidade;

    private java.lang.String codigoFornecedor;

    private java.lang.Boolean nacional;

    private java.lang.String observacao;

    private java.lang.String voucher;

    private java.lang.String codigoReserva;

    private java.lang.String codigoJustificativaMaiorTarifa;

    private java.lang.String identificadorIntegracao;

    private java.lang.String identificadorBackOfficeTipoProduto;

    private java.lang.String autorizacaoCartao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks;

    private java.lang.Integer statusCancelamento;

    private java.lang.Double taxaCancelamento;

    private java.util.Calendar dataModificacaoStatusCancelamento;

    private java.lang.Integer usuarioModificouStatusCancelamento;

    private java.lang.String nomeEmissor;

    private java.lang.Double valorHoraExtra;

    private java.lang.Double valorDiariaExtra;

    private java.lang.Double totalCarro;

    private boolean cancelado;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao;

    private java.lang.Double taxaFee;

    private boolean selfbook;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora;

    private java.lang.String moeda;

    private java.lang.String codigoLojaReserva;

    private java.lang.Integer quantidadeDiaria;

    private java.lang.String pais;

    private java.lang.String estado;

    private java.util.Calendar dataVencReserva;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda;

    private java.lang.String emailEmissor;

    private java.lang.String codigoLocadora;

    private java.lang.String iataCidade;

    private java.lang.String localizadorPreTrip;

    public Carro() {
    }

    public Carro(
           int id,
           java.lang.String modelo,
           java.lang.String nomeLocadora,
           java.lang.String localRetirada,
           java.util.Calendar dataRetirada,
           java.lang.String localDevolucao,
           java.util.Calendar dataDevolucao,
           java.lang.String localizador,
           java.lang.String codigoEmissor,
           java.lang.String codigoReservador,
           java.lang.String nomeReservador,
           java.lang.String source,
           java.util.Calendar dataReserva,
           java.lang.Double diaria,
           java.lang.Double taxa,
           java.lang.Double taxaservico,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamento,
           java.lang.Integer[] idPassageiroRef,
           java.lang.String justificativaMaiorTarifa,
           java.lang.String cidade,
           java.lang.String codigoFornecedor,
           java.lang.Boolean nacional,
           java.lang.String observacao,
           java.lang.String voucher,
           java.lang.String codigoReserva,
           java.lang.String codigoJustificativaMaiorTarifa,
           java.lang.String identificadorIntegracao,
           java.lang.String identificadorBackOfficeTipoProduto,
           java.lang.String autorizacaoCartao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks,
           java.lang.Integer statusCancelamento,
           java.lang.Double taxaCancelamento,
           java.util.Calendar dataModificacaoStatusCancelamento,
           java.lang.Integer usuarioModificouStatusCancelamento,
           java.lang.String nomeEmissor,
           java.lang.Double valorHoraExtra,
           java.lang.Double valorDiariaExtra,
           java.lang.Double totalCarro,
           boolean cancelado,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao,
           java.lang.Double taxaFee,
           boolean selfbook,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora,
           java.lang.String moeda,
           java.lang.String codigoLojaReserva,
           java.lang.Integer quantidadeDiaria,
           java.lang.String pais,
           java.lang.String estado,
           java.util.Calendar dataVencReserva,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda,
           java.lang.String emailEmissor,
           java.lang.String codigoLocadora,
           java.lang.String iataCidade,
           java.lang.String localizadorPreTrip) {
           this.id = id;
           this.modelo = modelo;
           this.nomeLocadora = nomeLocadora;
           this.localRetirada = localRetirada;
           this.dataRetirada = dataRetirada;
           this.localDevolucao = localDevolucao;
           this.dataDevolucao = dataDevolucao;
           this.localizador = localizador;
           this.codigoEmissor = codigoEmissor;
           this.codigoReservador = codigoReservador;
           this.nomeReservador = nomeReservador;
           this.source = source;
           this.dataReserva = dataReserva;
           this.diaria = diaria;
           this.taxa = taxa;
           this.taxaservico = taxaservico;
           this.formaPagamento = formaPagamento;
           this.idPassageiroRef = idPassageiroRef;
           this.justificativaMaiorTarifa = justificativaMaiorTarifa;
           this.cidade = cidade;
           this.codigoFornecedor = codigoFornecedor;
           this.nacional = nacional;
           this.observacao = observacao;
           this.voucher = voucher;
           this.codigoReserva = codigoReserva;
           this.codigoJustificativaMaiorTarifa = codigoJustificativaMaiorTarifa;
           this.identificadorIntegracao = identificadorIntegracao;
           this.identificadorBackOfficeTipoProduto = identificadorBackOfficeTipoProduto;
           this.autorizacaoCartao = autorizacaoCartao;
           this.remarks = remarks;
           this.statusCancelamento = statusCancelamento;
           this.taxaCancelamento = taxaCancelamento;
           this.dataModificacaoStatusCancelamento = dataModificacaoStatusCancelamento;
           this.usuarioModificouStatusCancelamento = usuarioModificouStatusCancelamento;
           this.nomeEmissor = nomeEmissor;
           this.valorHoraExtra = valorHoraExtra;
           this.valorDiariaExtra = valorDiariaExtra;
           this.totalCarro = totalCarro;
           this.cancelado = cancelado;
           this.identificadoresIntegracao = identificadoresIntegracao;
           this.taxaFee = taxaFee;
           this.selfbook = selfbook;
           this.consolidadora = consolidadora;
           this.moeda = moeda;
           this.codigoLojaReserva = codigoLojaReserva;
           this.quantidadeDiaria = quantidadeDiaria;
           this.pais = pais;
           this.estado = estado;
           this.dataVencReserva = dataVencReserva;
           this.pontoVenda = pontoVenda;
           this.emailEmissor = emailEmissor;
           this.codigoLocadora = codigoLocadora;
           this.iataCidade = iataCidade;
           this.localizadorPreTrip = localizadorPreTrip;
    }


    /**
     * Gets the id value for this Carro.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Carro.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the modelo value for this Carro.
     * 
     * @return modelo
     */
    public java.lang.String getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this Carro.
     * 
     * @param modelo
     */
    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }


    /**
     * Gets the nomeLocadora value for this Carro.
     * 
     * @return nomeLocadora
     */
    public java.lang.String getNomeLocadora() {
        return nomeLocadora;
    }


    /**
     * Sets the nomeLocadora value for this Carro.
     * 
     * @param nomeLocadora
     */
    public void setNomeLocadora(java.lang.String nomeLocadora) {
        this.nomeLocadora = nomeLocadora;
    }


    /**
     * Gets the localRetirada value for this Carro.
     * 
     * @return localRetirada
     */
    public java.lang.String getLocalRetirada() {
        return localRetirada;
    }


    /**
     * Sets the localRetirada value for this Carro.
     * 
     * @param localRetirada
     */
    public void setLocalRetirada(java.lang.String localRetirada) {
        this.localRetirada = localRetirada;
    }


    /**
     * Gets the dataRetirada value for this Carro.
     * 
     * @return dataRetirada
     */
    public java.util.Calendar getDataRetirada() {
        return dataRetirada;
    }


    /**
     * Sets the dataRetirada value for this Carro.
     * 
     * @param dataRetirada
     */
    public void setDataRetirada(java.util.Calendar dataRetirada) {
        this.dataRetirada = dataRetirada;
    }


    /**
     * Gets the localDevolucao value for this Carro.
     * 
     * @return localDevolucao
     */
    public java.lang.String getLocalDevolucao() {
        return localDevolucao;
    }


    /**
     * Sets the localDevolucao value for this Carro.
     * 
     * @param localDevolucao
     */
    public void setLocalDevolucao(java.lang.String localDevolucao) {
        this.localDevolucao = localDevolucao;
    }


    /**
     * Gets the dataDevolucao value for this Carro.
     * 
     * @return dataDevolucao
     */
    public java.util.Calendar getDataDevolucao() {
        return dataDevolucao;
    }


    /**
     * Sets the dataDevolucao value for this Carro.
     * 
     * @param dataDevolucao
     */
    public void setDataDevolucao(java.util.Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }


    /**
     * Gets the localizador value for this Carro.
     * 
     * @return localizador
     */
    public java.lang.String getLocalizador() {
        return localizador;
    }


    /**
     * Sets the localizador value for this Carro.
     * 
     * @param localizador
     */
    public void setLocalizador(java.lang.String localizador) {
        this.localizador = localizador;
    }


    /**
     * Gets the codigoEmissor value for this Carro.
     * 
     * @return codigoEmissor
     */
    public java.lang.String getCodigoEmissor() {
        return codigoEmissor;
    }


    /**
     * Sets the codigoEmissor value for this Carro.
     * 
     * @param codigoEmissor
     */
    public void setCodigoEmissor(java.lang.String codigoEmissor) {
        this.codigoEmissor = codigoEmissor;
    }


    /**
     * Gets the codigoReservador value for this Carro.
     * 
     * @return codigoReservador
     */
    public java.lang.String getCodigoReservador() {
        return codigoReservador;
    }


    /**
     * Sets the codigoReservador value for this Carro.
     * 
     * @param codigoReservador
     */
    public void setCodigoReservador(java.lang.String codigoReservador) {
        this.codigoReservador = codigoReservador;
    }


    /**
     * Gets the nomeReservador value for this Carro.
     * 
     * @return nomeReservador
     */
    public java.lang.String getNomeReservador() {
        return nomeReservador;
    }


    /**
     * Sets the nomeReservador value for this Carro.
     * 
     * @param nomeReservador
     */
    public void setNomeReservador(java.lang.String nomeReservador) {
        this.nomeReservador = nomeReservador;
    }


    /**
     * Gets the source value for this Carro.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Carro.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the dataReserva value for this Carro.
     * 
     * @return dataReserva
     */
    public java.util.Calendar getDataReserva() {
        return dataReserva;
    }


    /**
     * Sets the dataReserva value for this Carro.
     * 
     * @param dataReserva
     */
    public void setDataReserva(java.util.Calendar dataReserva) {
        this.dataReserva = dataReserva;
    }


    /**
     * Gets the diaria value for this Carro.
     * 
     * @return diaria
     */
    public java.lang.Double getDiaria() {
        return diaria;
    }


    /**
     * Sets the diaria value for this Carro.
     * 
     * @param diaria
     */
    public void setDiaria(java.lang.Double diaria) {
        this.diaria = diaria;
    }


    /**
     * Gets the taxa value for this Carro.
     * 
     * @return taxa
     */
    public java.lang.Double getTaxa() {
        return taxa;
    }


    /**
     * Sets the taxa value for this Carro.
     * 
     * @param taxa
     */
    public void setTaxa(java.lang.Double taxa) {
        this.taxa = taxa;
    }


    /**
     * Gets the taxaservico value for this Carro.
     * 
     * @return taxaservico
     */
    public java.lang.Double getTaxaservico() {
        return taxaservico;
    }


    /**
     * Sets the taxaservico value for this Carro.
     * 
     * @param taxaservico
     */
    public void setTaxaservico(java.lang.Double taxaservico) {
        this.taxaservico = taxaservico;
    }


    /**
     * Gets the formaPagamento value for this Carro.
     * 
     * @return formaPagamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }


    /**
     * Sets the formaPagamento value for this Carro.
     * 
     * @param formaPagamento
     */
    public void setFormaPagamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }


    /**
     * Gets the idPassageiroRef value for this Carro.
     * 
     * @return idPassageiroRef
     */
    public java.lang.Integer[] getIdPassageiroRef() {
        return idPassageiroRef;
    }


    /**
     * Sets the idPassageiroRef value for this Carro.
     * 
     * @param idPassageiroRef
     */
    public void setIdPassageiroRef(java.lang.Integer[] idPassageiroRef) {
        this.idPassageiroRef = idPassageiroRef;
    }

    public java.lang.Integer getIdPassageiroRef(int i) {
        return this.idPassageiroRef[i];
    }

    public void setIdPassageiroRef(int i, java.lang.Integer _value) {
        this.idPassageiroRef[i] = _value;
    }


    /**
     * Gets the justificativaMaiorTarifa value for this Carro.
     * 
     * @return justificativaMaiorTarifa
     */
    public java.lang.String getJustificativaMaiorTarifa() {
        return justificativaMaiorTarifa;
    }


    /**
     * Sets the justificativaMaiorTarifa value for this Carro.
     * 
     * @param justificativaMaiorTarifa
     */
    public void setJustificativaMaiorTarifa(java.lang.String justificativaMaiorTarifa) {
        this.justificativaMaiorTarifa = justificativaMaiorTarifa;
    }


    /**
     * Gets the cidade value for this Carro.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this Carro.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the codigoFornecedor value for this Carro.
     * 
     * @return codigoFornecedor
     */
    public java.lang.String getCodigoFornecedor() {
        return codigoFornecedor;
    }


    /**
     * Sets the codigoFornecedor value for this Carro.
     * 
     * @param codigoFornecedor
     */
    public void setCodigoFornecedor(java.lang.String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }


    /**
     * Gets the nacional value for this Carro.
     * 
     * @return nacional
     */
    public java.lang.Boolean getNacional() {
        return nacional;
    }


    /**
     * Sets the nacional value for this Carro.
     * 
     * @param nacional
     */
    public void setNacional(java.lang.Boolean nacional) {
        this.nacional = nacional;
    }


    /**
     * Gets the observacao value for this Carro.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this Carro.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }


    /**
     * Gets the voucher value for this Carro.
     * 
     * @return voucher
     */
    public java.lang.String getVoucher() {
        return voucher;
    }


    /**
     * Sets the voucher value for this Carro.
     * 
     * @param voucher
     */
    public void setVoucher(java.lang.String voucher) {
        this.voucher = voucher;
    }


    /**
     * Gets the codigoReserva value for this Carro.
     * 
     * @return codigoReserva
     */
    public java.lang.String getCodigoReserva() {
        return codigoReserva;
    }


    /**
     * Sets the codigoReserva value for this Carro.
     * 
     * @param codigoReserva
     */
    public void setCodigoReserva(java.lang.String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }


    /**
     * Gets the codigoJustificativaMaiorTarifa value for this Carro.
     * 
     * @return codigoJustificativaMaiorTarifa
     */
    public java.lang.String getCodigoJustificativaMaiorTarifa() {
        return codigoJustificativaMaiorTarifa;
    }


    /**
     * Sets the codigoJustificativaMaiorTarifa value for this Carro.
     * 
     * @param codigoJustificativaMaiorTarifa
     */
    public void setCodigoJustificativaMaiorTarifa(java.lang.String codigoJustificativaMaiorTarifa) {
        this.codigoJustificativaMaiorTarifa = codigoJustificativaMaiorTarifa;
    }


    /**
     * Gets the identificadorIntegracao value for this Carro.
     * 
     * @return identificadorIntegracao
     */
    public java.lang.String getIdentificadorIntegracao() {
        return identificadorIntegracao;
    }


    /**
     * Sets the identificadorIntegracao value for this Carro.
     * 
     * @param identificadorIntegracao
     */
    public void setIdentificadorIntegracao(java.lang.String identificadorIntegracao) {
        this.identificadorIntegracao = identificadorIntegracao;
    }


    /**
     * Gets the identificadorBackOfficeTipoProduto value for this Carro.
     * 
     * @return identificadorBackOfficeTipoProduto
     */
    public java.lang.String getIdentificadorBackOfficeTipoProduto() {
        return identificadorBackOfficeTipoProduto;
    }


    /**
     * Sets the identificadorBackOfficeTipoProduto value for this Carro.
     * 
     * @param identificadorBackOfficeTipoProduto
     */
    public void setIdentificadorBackOfficeTipoProduto(java.lang.String identificadorBackOfficeTipoProduto) {
        this.identificadorBackOfficeTipoProduto = identificadorBackOfficeTipoProduto;
    }


    /**
     * Gets the autorizacaoCartao value for this Carro.
     * 
     * @return autorizacaoCartao
     */
    public java.lang.String getAutorizacaoCartao() {
        return autorizacaoCartao;
    }


    /**
     * Sets the autorizacaoCartao value for this Carro.
     * 
     * @param autorizacaoCartao
     */
    public void setAutorizacaoCartao(java.lang.String autorizacaoCartao) {
        this.autorizacaoCartao = autorizacaoCartao;
    }


    /**
     * Gets the remarks value for this Carro.
     * 
     * @return remarks
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this Carro.
     * 
     * @param remarks
     */
    public void setRemarks(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the statusCancelamento value for this Carro.
     * 
     * @return statusCancelamento
     */
    public java.lang.Integer getStatusCancelamento() {
        return statusCancelamento;
    }


    /**
     * Sets the statusCancelamento value for this Carro.
     * 
     * @param statusCancelamento
     */
    public void setStatusCancelamento(java.lang.Integer statusCancelamento) {
        this.statusCancelamento = statusCancelamento;
    }


    /**
     * Gets the taxaCancelamento value for this Carro.
     * 
     * @return taxaCancelamento
     */
    public java.lang.Double getTaxaCancelamento() {
        return taxaCancelamento;
    }


    /**
     * Sets the taxaCancelamento value for this Carro.
     * 
     * @param taxaCancelamento
     */
    public void setTaxaCancelamento(java.lang.Double taxaCancelamento) {
        this.taxaCancelamento = taxaCancelamento;
    }


    /**
     * Gets the dataModificacaoStatusCancelamento value for this Carro.
     * 
     * @return dataModificacaoStatusCancelamento
     */
    public java.util.Calendar getDataModificacaoStatusCancelamento() {
        return dataModificacaoStatusCancelamento;
    }


    /**
     * Sets the dataModificacaoStatusCancelamento value for this Carro.
     * 
     * @param dataModificacaoStatusCancelamento
     */
    public void setDataModificacaoStatusCancelamento(java.util.Calendar dataModificacaoStatusCancelamento) {
        this.dataModificacaoStatusCancelamento = dataModificacaoStatusCancelamento;
    }


    /**
     * Gets the usuarioModificouStatusCancelamento value for this Carro.
     * 
     * @return usuarioModificouStatusCancelamento
     */
    public java.lang.Integer getUsuarioModificouStatusCancelamento() {
        return usuarioModificouStatusCancelamento;
    }


    /**
     * Sets the usuarioModificouStatusCancelamento value for this Carro.
     * 
     * @param usuarioModificouStatusCancelamento
     */
    public void setUsuarioModificouStatusCancelamento(java.lang.Integer usuarioModificouStatusCancelamento) {
        this.usuarioModificouStatusCancelamento = usuarioModificouStatusCancelamento;
    }


    /**
     * Gets the nomeEmissor value for this Carro.
     * 
     * @return nomeEmissor
     */
    public java.lang.String getNomeEmissor() {
        return nomeEmissor;
    }


    /**
     * Sets the nomeEmissor value for this Carro.
     * 
     * @param nomeEmissor
     */
    public void setNomeEmissor(java.lang.String nomeEmissor) {
        this.nomeEmissor = nomeEmissor;
    }


    /**
     * Gets the valorHoraExtra value for this Carro.
     * 
     * @return valorHoraExtra
     */
    public java.lang.Double getValorHoraExtra() {
        return valorHoraExtra;
    }


    /**
     * Sets the valorHoraExtra value for this Carro.
     * 
     * @param valorHoraExtra
     */
    public void setValorHoraExtra(java.lang.Double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }


    /**
     * Gets the valorDiariaExtra value for this Carro.
     * 
     * @return valorDiariaExtra
     */
    public java.lang.Double getValorDiariaExtra() {
        return valorDiariaExtra;
    }


    /**
     * Sets the valorDiariaExtra value for this Carro.
     * 
     * @param valorDiariaExtra
     */
    public void setValorDiariaExtra(java.lang.Double valorDiariaExtra) {
        this.valorDiariaExtra = valorDiariaExtra;
    }


    /**
     * Gets the totalCarro value for this Carro.
     * 
     * @return totalCarro
     */
    public java.lang.Double getTotalCarro() {
        return totalCarro;
    }


    /**
     * Sets the totalCarro value for this Carro.
     * 
     * @param totalCarro
     */
    public void setTotalCarro(java.lang.Double totalCarro) {
        this.totalCarro = totalCarro;
    }


    /**
     * Gets the cancelado value for this Carro.
     * 
     * @return cancelado
     */
    public boolean isCancelado() {
        return cancelado;
    }


    /**
     * Sets the cancelado value for this Carro.
     * 
     * @param cancelado
     */
    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }


    /**
     * Gets the identificadoresIntegracao value for this Carro.
     * 
     * @return identificadoresIntegracao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] getIdentificadoresIntegracao() {
        return identificadoresIntegracao;
    }


    /**
     * Sets the identificadoresIntegracao value for this Carro.
     * 
     * @param identificadoresIntegracao
     */
    public void setIdentificadoresIntegracao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao) {
        this.identificadoresIntegracao = identificadoresIntegracao;
    }


    /**
     * Gets the taxaFee value for this Carro.
     * 
     * @return taxaFee
     */
    public java.lang.Double getTaxaFee() {
        return taxaFee;
    }


    /**
     * Sets the taxaFee value for this Carro.
     * 
     * @param taxaFee
     */
    public void setTaxaFee(java.lang.Double taxaFee) {
        this.taxaFee = taxaFee;
    }


    /**
     * Gets the selfbook value for this Carro.
     * 
     * @return selfbook
     */
    public boolean isSelfbook() {
        return selfbook;
    }


    /**
     * Sets the selfbook value for this Carro.
     * 
     * @param selfbook
     */
    public void setSelfbook(boolean selfbook) {
        this.selfbook = selfbook;
    }


    /**
     * Gets the consolidadora value for this Carro.
     * 
     * @return consolidadora
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora getConsolidadora() {
        return consolidadora;
    }


    /**
     * Sets the consolidadora value for this Carro.
     * 
     * @param consolidadora
     */
    public void setConsolidadora(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora) {
        this.consolidadora = consolidadora;
    }


    /**
     * Gets the moeda value for this Carro.
     * 
     * @return moeda
     */
    public java.lang.String getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this Carro.
     * 
     * @param moeda
     */
    public void setMoeda(java.lang.String moeda) {
        this.moeda = moeda;
    }


    /**
     * Gets the codigoLojaReserva value for this Carro.
     * 
     * @return codigoLojaReserva
     */
    public java.lang.String getCodigoLojaReserva() {
        return codigoLojaReserva;
    }


    /**
     * Sets the codigoLojaReserva value for this Carro.
     * 
     * @param codigoLojaReserva
     */
    public void setCodigoLojaReserva(java.lang.String codigoLojaReserva) {
        this.codigoLojaReserva = codigoLojaReserva;
    }


    /**
     * Gets the quantidadeDiaria value for this Carro.
     * 
     * @return quantidadeDiaria
     */
    public java.lang.Integer getQuantidadeDiaria() {
        return quantidadeDiaria;
    }


    /**
     * Sets the quantidadeDiaria value for this Carro.
     * 
     * @param quantidadeDiaria
     */
    public void setQuantidadeDiaria(java.lang.Integer quantidadeDiaria) {
        this.quantidadeDiaria = quantidadeDiaria;
    }


    /**
     * Gets the pais value for this Carro.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this Carro.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the estado value for this Carro.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Carro.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the dataVencReserva value for this Carro.
     * 
     * @return dataVencReserva
     */
    public java.util.Calendar getDataVencReserva() {
        return dataVencReserva;
    }


    /**
     * Sets the dataVencReserva value for this Carro.
     * 
     * @param dataVencReserva
     */
    public void setDataVencReserva(java.util.Calendar dataVencReserva) {
        this.dataVencReserva = dataVencReserva;
    }


    /**
     * Gets the pontoVenda value for this Carro.
     * 
     * @return pontoVenda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento getPontoVenda() {
        return pontoVenda;
    }


    /**
     * Sets the pontoVenda value for this Carro.
     * 
     * @param pontoVenda
     */
    public void setPontoVenda(br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda) {
        this.pontoVenda = pontoVenda;
    }


    /**
     * Gets the emailEmissor value for this Carro.
     * 
     * @return emailEmissor
     */
    public java.lang.String getEmailEmissor() {
        return emailEmissor;
    }


    /**
     * Sets the emailEmissor value for this Carro.
     * 
     * @param emailEmissor
     */
    public void setEmailEmissor(java.lang.String emailEmissor) {
        this.emailEmissor = emailEmissor;
    }


    /**
     * Gets the codigoLocadora value for this Carro.
     * 
     * @return codigoLocadora
     */
    public java.lang.String getCodigoLocadora() {
        return codigoLocadora;
    }


    /**
     * Sets the codigoLocadora value for this Carro.
     * 
     * @param codigoLocadora
     */
    public void setCodigoLocadora(java.lang.String codigoLocadora) {
        this.codigoLocadora = codigoLocadora;
    }


    /**
     * Gets the iataCidade value for this Carro.
     * 
     * @return iataCidade
     */
    public java.lang.String getIataCidade() {
        return iataCidade;
    }


    /**
     * Sets the iataCidade value for this Carro.
     * 
     * @param iataCidade
     */
    public void setIataCidade(java.lang.String iataCidade) {
        this.iataCidade = iataCidade;
    }


    /**
     * Gets the localizadorPreTrip value for this Carro.
     * 
     * @return localizadorPreTrip
     */
    public java.lang.String getLocalizadorPreTrip() {
        return localizadorPreTrip;
    }


    /**
     * Sets the localizadorPreTrip value for this Carro.
     * 
     * @param localizadorPreTrip
     */
    public void setLocalizadorPreTrip(java.lang.String localizadorPreTrip) {
        this.localizadorPreTrip = localizadorPreTrip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Carro)) return false;
        Carro other = (Carro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              this.modelo.equals(other.getModelo()))) &&
            ((this.nomeLocadora==null && other.getNomeLocadora()==null) || 
             (this.nomeLocadora!=null &&
              this.nomeLocadora.equals(other.getNomeLocadora()))) &&
            ((this.localRetirada==null && other.getLocalRetirada()==null) || 
             (this.localRetirada!=null &&
              this.localRetirada.equals(other.getLocalRetirada()))) &&
            ((this.dataRetirada==null && other.getDataRetirada()==null) || 
             (this.dataRetirada!=null &&
              this.dataRetirada.equals(other.getDataRetirada()))) &&
            ((this.localDevolucao==null && other.getLocalDevolucao()==null) || 
             (this.localDevolucao!=null &&
              this.localDevolucao.equals(other.getLocalDevolucao()))) &&
            ((this.dataDevolucao==null && other.getDataDevolucao()==null) || 
             (this.dataDevolucao!=null &&
              this.dataDevolucao.equals(other.getDataDevolucao()))) &&
            ((this.localizador==null && other.getLocalizador()==null) || 
             (this.localizador!=null &&
              this.localizador.equals(other.getLocalizador()))) &&
            ((this.codigoEmissor==null && other.getCodigoEmissor()==null) || 
             (this.codigoEmissor!=null &&
              this.codigoEmissor.equals(other.getCodigoEmissor()))) &&
            ((this.codigoReservador==null && other.getCodigoReservador()==null) || 
             (this.codigoReservador!=null &&
              this.codigoReservador.equals(other.getCodigoReservador()))) &&
            ((this.nomeReservador==null && other.getNomeReservador()==null) || 
             (this.nomeReservador!=null &&
              this.nomeReservador.equals(other.getNomeReservador()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.dataReserva==null && other.getDataReserva()==null) || 
             (this.dataReserva!=null &&
              this.dataReserva.equals(other.getDataReserva()))) &&
            ((this.diaria==null && other.getDiaria()==null) || 
             (this.diaria!=null &&
              this.diaria.equals(other.getDiaria()))) &&
            ((this.taxa==null && other.getTaxa()==null) || 
             (this.taxa!=null &&
              this.taxa.equals(other.getTaxa()))) &&
            ((this.taxaservico==null && other.getTaxaservico()==null) || 
             (this.taxaservico!=null &&
              this.taxaservico.equals(other.getTaxaservico()))) &&
            ((this.formaPagamento==null && other.getFormaPagamento()==null) || 
             (this.formaPagamento!=null &&
              this.formaPagamento.equals(other.getFormaPagamento()))) &&
            ((this.idPassageiroRef==null && other.getIdPassageiroRef()==null) || 
             (this.idPassageiroRef!=null &&
              java.util.Arrays.equals(this.idPassageiroRef, other.getIdPassageiroRef()))) &&
            ((this.justificativaMaiorTarifa==null && other.getJustificativaMaiorTarifa()==null) || 
             (this.justificativaMaiorTarifa!=null &&
              this.justificativaMaiorTarifa.equals(other.getJustificativaMaiorTarifa()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.codigoFornecedor==null && other.getCodigoFornecedor()==null) || 
             (this.codigoFornecedor!=null &&
              this.codigoFornecedor.equals(other.getCodigoFornecedor()))) &&
            ((this.nacional==null && other.getNacional()==null) || 
             (this.nacional!=null &&
              this.nacional.equals(other.getNacional()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao()))) &&
            ((this.voucher==null && other.getVoucher()==null) || 
             (this.voucher!=null &&
              this.voucher.equals(other.getVoucher()))) &&
            ((this.codigoReserva==null && other.getCodigoReserva()==null) || 
             (this.codigoReserva!=null &&
              this.codigoReserva.equals(other.getCodigoReserva()))) &&
            ((this.codigoJustificativaMaiorTarifa==null && other.getCodigoJustificativaMaiorTarifa()==null) || 
             (this.codigoJustificativaMaiorTarifa!=null &&
              this.codigoJustificativaMaiorTarifa.equals(other.getCodigoJustificativaMaiorTarifa()))) &&
            ((this.identificadorIntegracao==null && other.getIdentificadorIntegracao()==null) || 
             (this.identificadorIntegracao!=null &&
              this.identificadorIntegracao.equals(other.getIdentificadorIntegracao()))) &&
            ((this.identificadorBackOfficeTipoProduto==null && other.getIdentificadorBackOfficeTipoProduto()==null) || 
             (this.identificadorBackOfficeTipoProduto!=null &&
              this.identificadorBackOfficeTipoProduto.equals(other.getIdentificadorBackOfficeTipoProduto()))) &&
            ((this.autorizacaoCartao==null && other.getAutorizacaoCartao()==null) || 
             (this.autorizacaoCartao!=null &&
              this.autorizacaoCartao.equals(other.getAutorizacaoCartao()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks()))) &&
            ((this.statusCancelamento==null && other.getStatusCancelamento()==null) || 
             (this.statusCancelamento!=null &&
              this.statusCancelamento.equals(other.getStatusCancelamento()))) &&
            ((this.taxaCancelamento==null && other.getTaxaCancelamento()==null) || 
             (this.taxaCancelamento!=null &&
              this.taxaCancelamento.equals(other.getTaxaCancelamento()))) &&
            ((this.dataModificacaoStatusCancelamento==null && other.getDataModificacaoStatusCancelamento()==null) || 
             (this.dataModificacaoStatusCancelamento!=null &&
              this.dataModificacaoStatusCancelamento.equals(other.getDataModificacaoStatusCancelamento()))) &&
            ((this.usuarioModificouStatusCancelamento==null && other.getUsuarioModificouStatusCancelamento()==null) || 
             (this.usuarioModificouStatusCancelamento!=null &&
              this.usuarioModificouStatusCancelamento.equals(other.getUsuarioModificouStatusCancelamento()))) &&
            ((this.nomeEmissor==null && other.getNomeEmissor()==null) || 
             (this.nomeEmissor!=null &&
              this.nomeEmissor.equals(other.getNomeEmissor()))) &&
            ((this.valorHoraExtra==null && other.getValorHoraExtra()==null) || 
             (this.valorHoraExtra!=null &&
              this.valorHoraExtra.equals(other.getValorHoraExtra()))) &&
            ((this.valorDiariaExtra==null && other.getValorDiariaExtra()==null) || 
             (this.valorDiariaExtra!=null &&
              this.valorDiariaExtra.equals(other.getValorDiariaExtra()))) &&
            ((this.totalCarro==null && other.getTotalCarro()==null) || 
             (this.totalCarro!=null &&
              this.totalCarro.equals(other.getTotalCarro()))) &&
            this.cancelado == other.isCancelado() &&
            ((this.identificadoresIntegracao==null && other.getIdentificadoresIntegracao()==null) || 
             (this.identificadoresIntegracao!=null &&
              java.util.Arrays.equals(this.identificadoresIntegracao, other.getIdentificadoresIntegracao()))) &&
            ((this.taxaFee==null && other.getTaxaFee()==null) || 
             (this.taxaFee!=null &&
              this.taxaFee.equals(other.getTaxaFee()))) &&
            this.selfbook == other.isSelfbook() &&
            ((this.consolidadora==null && other.getConsolidadora()==null) || 
             (this.consolidadora!=null &&
              this.consolidadora.equals(other.getConsolidadora()))) &&
            ((this.moeda==null && other.getMoeda()==null) || 
             (this.moeda!=null &&
              this.moeda.equals(other.getMoeda()))) &&
            ((this.codigoLojaReserva==null && other.getCodigoLojaReserva()==null) || 
             (this.codigoLojaReserva!=null &&
              this.codigoLojaReserva.equals(other.getCodigoLojaReserva()))) &&
            ((this.quantidadeDiaria==null && other.getQuantidadeDiaria()==null) || 
             (this.quantidadeDiaria!=null &&
              this.quantidadeDiaria.equals(other.getQuantidadeDiaria()))) &&
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.dataVencReserva==null && other.getDataVencReserva()==null) || 
             (this.dataVencReserva!=null &&
              this.dataVencReserva.equals(other.getDataVencReserva()))) &&
            ((this.pontoVenda==null && other.getPontoVenda()==null) || 
             (this.pontoVenda!=null &&
              this.pontoVenda.equals(other.getPontoVenda()))) &&
            ((this.emailEmissor==null && other.getEmailEmissor()==null) || 
             (this.emailEmissor!=null &&
              this.emailEmissor.equals(other.getEmailEmissor()))) &&
            ((this.codigoLocadora==null && other.getCodigoLocadora()==null) || 
             (this.codigoLocadora!=null &&
              this.codigoLocadora.equals(other.getCodigoLocadora()))) &&
            ((this.iataCidade==null && other.getIataCidade()==null) || 
             (this.iataCidade!=null &&
              this.iataCidade.equals(other.getIataCidade()))) &&
            ((this.localizadorPreTrip==null && other.getLocalizadorPreTrip()==null) || 
             (this.localizadorPreTrip!=null &&
              this.localizadorPreTrip.equals(other.getLocalizadorPreTrip())));
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
        _hashCode += getId();
        if (getModelo() != null) {
            _hashCode += getModelo().hashCode();
        }
        if (getNomeLocadora() != null) {
            _hashCode += getNomeLocadora().hashCode();
        }
        if (getLocalRetirada() != null) {
            _hashCode += getLocalRetirada().hashCode();
        }
        if (getDataRetirada() != null) {
            _hashCode += getDataRetirada().hashCode();
        }
        if (getLocalDevolucao() != null) {
            _hashCode += getLocalDevolucao().hashCode();
        }
        if (getDataDevolucao() != null) {
            _hashCode += getDataDevolucao().hashCode();
        }
        if (getLocalizador() != null) {
            _hashCode += getLocalizador().hashCode();
        }
        if (getCodigoEmissor() != null) {
            _hashCode += getCodigoEmissor().hashCode();
        }
        if (getCodigoReservador() != null) {
            _hashCode += getCodigoReservador().hashCode();
        }
        if (getNomeReservador() != null) {
            _hashCode += getNomeReservador().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getDataReserva() != null) {
            _hashCode += getDataReserva().hashCode();
        }
        if (getDiaria() != null) {
            _hashCode += getDiaria().hashCode();
        }
        if (getTaxa() != null) {
            _hashCode += getTaxa().hashCode();
        }
        if (getTaxaservico() != null) {
            _hashCode += getTaxaservico().hashCode();
        }
        if (getFormaPagamento() != null) {
            _hashCode += getFormaPagamento().hashCode();
        }
        if (getIdPassageiroRef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdPassageiroRef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdPassageiroRef(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJustificativaMaiorTarifa() != null) {
            _hashCode += getJustificativaMaiorTarifa().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getCodigoFornecedor() != null) {
            _hashCode += getCodigoFornecedor().hashCode();
        }
        if (getNacional() != null) {
            _hashCode += getNacional().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        if (getVoucher() != null) {
            _hashCode += getVoucher().hashCode();
        }
        if (getCodigoReserva() != null) {
            _hashCode += getCodigoReserva().hashCode();
        }
        if (getCodigoJustificativaMaiorTarifa() != null) {
            _hashCode += getCodigoJustificativaMaiorTarifa().hashCode();
        }
        if (getIdentificadorIntegracao() != null) {
            _hashCode += getIdentificadorIntegracao().hashCode();
        }
        if (getIdentificadorBackOfficeTipoProduto() != null) {
            _hashCode += getIdentificadorBackOfficeTipoProduto().hashCode();
        }
        if (getAutorizacaoCartao() != null) {
            _hashCode += getAutorizacaoCartao().hashCode();
        }
        if (getRemarks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemarks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemarks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatusCancelamento() != null) {
            _hashCode += getStatusCancelamento().hashCode();
        }
        if (getTaxaCancelamento() != null) {
            _hashCode += getTaxaCancelamento().hashCode();
        }
        if (getDataModificacaoStatusCancelamento() != null) {
            _hashCode += getDataModificacaoStatusCancelamento().hashCode();
        }
        if (getUsuarioModificouStatusCancelamento() != null) {
            _hashCode += getUsuarioModificouStatusCancelamento().hashCode();
        }
        if (getNomeEmissor() != null) {
            _hashCode += getNomeEmissor().hashCode();
        }
        if (getValorHoraExtra() != null) {
            _hashCode += getValorHoraExtra().hashCode();
        }
        if (getValorDiariaExtra() != null) {
            _hashCode += getValorDiariaExtra().hashCode();
        }
        if (getTotalCarro() != null) {
            _hashCode += getTotalCarro().hashCode();
        }
        _hashCode += (isCancelado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getTaxaFee() != null) {
            _hashCode += getTaxaFee().hashCode();
        }
        _hashCode += (isSelfbook() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getConsolidadora() != null) {
            _hashCode += getConsolidadora().hashCode();
        }
        if (getMoeda() != null) {
            _hashCode += getMoeda().hashCode();
        }
        if (getCodigoLojaReserva() != null) {
            _hashCode += getCodigoLojaReserva().hashCode();
        }
        if (getQuantidadeDiaria() != null) {
            _hashCode += getQuantidadeDiaria().hashCode();
        }
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getDataVencReserva() != null) {
            _hashCode += getDataVencReserva().hashCode();
        }
        if (getPontoVenda() != null) {
            _hashCode += getPontoVenda().hashCode();
        }
        if (getEmailEmissor() != null) {
            _hashCode += getEmailEmissor().hashCode();
        }
        if (getCodigoLocadora() != null) {
            _hashCode += getCodigoLocadora().hashCode();
        }
        if (getIataCidade() != null) {
            _hashCode += getIataCidade().hashCode();
        }
        if (getLocalizadorPreTrip() != null) {
            _hashCode += getLocalizadorPreTrip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Carro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/carro", "carro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeLocadora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeLocadora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localRetirada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localRetirada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataRetirada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataRetirada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localDevolucao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localDevolucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDevolucao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataDevolucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEmissor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoEmissor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoReservador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoReservador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeReservador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeReservador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataReserva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataReserva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diaria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diaria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxaservico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxaservico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formaPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "formaPagamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPassageiroRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPassageiroRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justificativaMaiorTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "justificativaMaiorTarifa"));
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
        elemField.setFieldName("codigoFornecedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoFornecedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nacional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("voucher");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voucher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoReserva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoReserva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoJustificativaMaiorTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoJustificativaMaiorTarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("identificadorBackOfficeTipoProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorBackOfficeTipoProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorizacaoCartao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autorizacaoCartao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "remark"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "remark"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCancelamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCancelamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxaCancelamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxaCancelamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataModificacaoStatusCancelamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataModificacaoStatusCancelamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioModificouStatusCancelamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioModificouStatusCancelamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeEmissor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeEmissor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorHoraExtra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorHoraExtra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDiariaExtra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorDiariaExtra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCarro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCarro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("taxaFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxaFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfbook");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selfbook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidadora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consolidadora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "consolidadora"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moeda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moeda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoLojaReserva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoLojaReserva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidadeDiaria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantidadeDiaria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVencReserva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataVencReserva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pontoVenda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pontoVenda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "pontoVendaOrcamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailEmissor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailEmissor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoLocadora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoLocadora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iataCidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iataCidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizadorPreTrip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizadorPreTrip"));
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
