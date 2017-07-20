/**
 * Rodoviario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.rodoviario;

public class Rodoviario  implements java.io.Serializable {
    private int id;

    private java.util.Calendar dataSaida;

    private java.util.Calendar dataChegada;

    private java.lang.String terminalRodoviarioOrigem;

    private java.lang.String terminalRodoviarioDestino;

    private java.lang.String empresaViacao;

    private java.lang.String assento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.ClasseRodoviario classe;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.PreferenciaAssentoRodoviario preferenciaAssento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.LocalAssentoRodoviario localAssento;

    private java.lang.String localizador;

    private java.lang.Double valorTarifa;

    private java.lang.Double valorTaxa;

    private java.lang.Double valorSeguro;

    private java.lang.Double totalRodoviario;

    private java.lang.String codigoEmissor;

    private java.lang.String nomeEmissor;

    private java.lang.String codigoReservador;

    private java.lang.String nomeReservador;

    private java.util.Calendar dataReserva;

    private java.lang.String obsEmissor;

    private java.lang.Double maiorTarifa;

    private java.lang.Double menorTarifa;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamento;

    private java.lang.Integer[] idPassageiroRef;

    private java.lang.String justificativaMaiorTarifa;

    private java.lang.Integer statusCancelamento;

    private java.lang.Double taxaCancelamento;

    private java.util.Calendar dataModificacaoStatusCancelamento;

    private java.lang.Integer usuarioModificouStatusCancelamento;

    private java.lang.String codigoJustificativaMaiorTarifa;

    private java.lang.String identificadorIntegracao;

    private java.lang.String identificador;

    private java.lang.String categoria;

    private java.lang.String identificadorBackOfficeTipoProduto;

    private java.lang.String autorizacaoCartao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks;

    private boolean cancelado;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao;

    private java.lang.Double taxaFee;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora;

    private java.lang.String moeda;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda;

    public Rodoviario() {
    }

    public Rodoviario(
           int id,
           java.util.Calendar dataSaida,
           java.util.Calendar dataChegada,
           java.lang.String terminalRodoviarioOrigem,
           java.lang.String terminalRodoviarioDestino,
           java.lang.String empresaViacao,
           java.lang.String assento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.ClasseRodoviario classe,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.PreferenciaAssentoRodoviario preferenciaAssento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.LocalAssentoRodoviario localAssento,
           java.lang.String localizador,
           java.lang.Double valorTarifa,
           java.lang.Double valorTaxa,
           java.lang.Double valorSeguro,
           java.lang.Double totalRodoviario,
           java.lang.String codigoEmissor,
           java.lang.String nomeEmissor,
           java.lang.String codigoReservador,
           java.lang.String nomeReservador,
           java.util.Calendar dataReserva,
           java.lang.String obsEmissor,
           java.lang.Double maiorTarifa,
           java.lang.Double menorTarifa,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamento,
           java.lang.Integer[] idPassageiroRef,
           java.lang.String justificativaMaiorTarifa,
           java.lang.Integer statusCancelamento,
           java.lang.Double taxaCancelamento,
           java.util.Calendar dataModificacaoStatusCancelamento,
           java.lang.Integer usuarioModificouStatusCancelamento,
           java.lang.String codigoJustificativaMaiorTarifa,
           java.lang.String identificadorIntegracao,
           java.lang.String identificador,
           java.lang.String categoria,
           java.lang.String identificadorBackOfficeTipoProduto,
           java.lang.String autorizacaoCartao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks,
           boolean cancelado,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao,
           java.lang.Double taxaFee,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora,
           java.lang.String moeda,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda) {
           this.id = id;
           this.dataSaida = dataSaida;
           this.dataChegada = dataChegada;
           this.terminalRodoviarioOrigem = terminalRodoviarioOrigem;
           this.terminalRodoviarioDestino = terminalRodoviarioDestino;
           this.empresaViacao = empresaViacao;
           this.assento = assento;
           this.classe = classe;
           this.preferenciaAssento = preferenciaAssento;
           this.localAssento = localAssento;
           this.localizador = localizador;
           this.valorTarifa = valorTarifa;
           this.valorTaxa = valorTaxa;
           this.valorSeguro = valorSeguro;
           this.totalRodoviario = totalRodoviario;
           this.codigoEmissor = codigoEmissor;
           this.nomeEmissor = nomeEmissor;
           this.codigoReservador = codigoReservador;
           this.nomeReservador = nomeReservador;
           this.dataReserva = dataReserva;
           this.obsEmissor = obsEmissor;
           this.maiorTarifa = maiorTarifa;
           this.menorTarifa = menorTarifa;
           this.formaPagamento = formaPagamento;
           this.idPassageiroRef = idPassageiroRef;
           this.justificativaMaiorTarifa = justificativaMaiorTarifa;
           this.statusCancelamento = statusCancelamento;
           this.taxaCancelamento = taxaCancelamento;
           this.dataModificacaoStatusCancelamento = dataModificacaoStatusCancelamento;
           this.usuarioModificouStatusCancelamento = usuarioModificouStatusCancelamento;
           this.codigoJustificativaMaiorTarifa = codigoJustificativaMaiorTarifa;
           this.identificadorIntegracao = identificadorIntegracao;
           this.identificador = identificador;
           this.categoria = categoria;
           this.identificadorBackOfficeTipoProduto = identificadorBackOfficeTipoProduto;
           this.autorizacaoCartao = autorizacaoCartao;
           this.remarks = remarks;
           this.cancelado = cancelado;
           this.identificadoresIntegracao = identificadoresIntegracao;
           this.taxaFee = taxaFee;
           this.consolidadora = consolidadora;
           this.moeda = moeda;
           this.pontoVenda = pontoVenda;
    }


    /**
     * Gets the id value for this Rodoviario.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Rodoviario.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the dataSaida value for this Rodoviario.
     * 
     * @return dataSaida
     */
    public java.util.Calendar getDataSaida() {
        return dataSaida;
    }


    /**
     * Sets the dataSaida value for this Rodoviario.
     * 
     * @param dataSaida
     */
    public void setDataSaida(java.util.Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }


    /**
     * Gets the dataChegada value for this Rodoviario.
     * 
     * @return dataChegada
     */
    public java.util.Calendar getDataChegada() {
        return dataChegada;
    }


    /**
     * Sets the dataChegada value for this Rodoviario.
     * 
     * @param dataChegada
     */
    public void setDataChegada(java.util.Calendar dataChegada) {
        this.dataChegada = dataChegada;
    }


    /**
     * Gets the terminalRodoviarioOrigem value for this Rodoviario.
     * 
     * @return terminalRodoviarioOrigem
     */
    public java.lang.String getTerminalRodoviarioOrigem() {
        return terminalRodoviarioOrigem;
    }


    /**
     * Sets the terminalRodoviarioOrigem value for this Rodoviario.
     * 
     * @param terminalRodoviarioOrigem
     */
    public void setTerminalRodoviarioOrigem(java.lang.String terminalRodoviarioOrigem) {
        this.terminalRodoviarioOrigem = terminalRodoviarioOrigem;
    }


    /**
     * Gets the terminalRodoviarioDestino value for this Rodoviario.
     * 
     * @return terminalRodoviarioDestino
     */
    public java.lang.String getTerminalRodoviarioDestino() {
        return terminalRodoviarioDestino;
    }


    /**
     * Sets the terminalRodoviarioDestino value for this Rodoviario.
     * 
     * @param terminalRodoviarioDestino
     */
    public void setTerminalRodoviarioDestino(java.lang.String terminalRodoviarioDestino) {
        this.terminalRodoviarioDestino = terminalRodoviarioDestino;
    }


    /**
     * Gets the empresaViacao value for this Rodoviario.
     * 
     * @return empresaViacao
     */
    public java.lang.String getEmpresaViacao() {
        return empresaViacao;
    }


    /**
     * Sets the empresaViacao value for this Rodoviario.
     * 
     * @param empresaViacao
     */
    public void setEmpresaViacao(java.lang.String empresaViacao) {
        this.empresaViacao = empresaViacao;
    }


    /**
     * Gets the assento value for this Rodoviario.
     * 
     * @return assento
     */
    public java.lang.String getAssento() {
        return assento;
    }


    /**
     * Sets the assento value for this Rodoviario.
     * 
     * @param assento
     */
    public void setAssento(java.lang.String assento) {
        this.assento = assento;
    }


    /**
     * Gets the classe value for this Rodoviario.
     * 
     * @return classe
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.ClasseRodoviario getClasse() {
        return classe;
    }


    /**
     * Sets the classe value for this Rodoviario.
     * 
     * @param classe
     */
    public void setClasse(br.com.lemontech.selfbooking.wsselfbooking.beans.types.ClasseRodoviario classe) {
        this.classe = classe;
    }


    /**
     * Gets the preferenciaAssento value for this Rodoviario.
     * 
     * @return preferenciaAssento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.PreferenciaAssentoRodoviario getPreferenciaAssento() {
        return preferenciaAssento;
    }


    /**
     * Sets the preferenciaAssento value for this Rodoviario.
     * 
     * @param preferenciaAssento
     */
    public void setPreferenciaAssento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.PreferenciaAssentoRodoviario preferenciaAssento) {
        this.preferenciaAssento = preferenciaAssento;
    }


    /**
     * Gets the localAssento value for this Rodoviario.
     * 
     * @return localAssento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.LocalAssentoRodoviario getLocalAssento() {
        return localAssento;
    }


    /**
     * Sets the localAssento value for this Rodoviario.
     * 
     * @param localAssento
     */
    public void setLocalAssento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.LocalAssentoRodoviario localAssento) {
        this.localAssento = localAssento;
    }


    /**
     * Gets the localizador value for this Rodoviario.
     * 
     * @return localizador
     */
    public java.lang.String getLocalizador() {
        return localizador;
    }


    /**
     * Sets the localizador value for this Rodoviario.
     * 
     * @param localizador
     */
    public void setLocalizador(java.lang.String localizador) {
        this.localizador = localizador;
    }


    /**
     * Gets the valorTarifa value for this Rodoviario.
     * 
     * @return valorTarifa
     */
    public java.lang.Double getValorTarifa() {
        return valorTarifa;
    }


    /**
     * Sets the valorTarifa value for this Rodoviario.
     * 
     * @param valorTarifa
     */
    public void setValorTarifa(java.lang.Double valorTarifa) {
        this.valorTarifa = valorTarifa;
    }


    /**
     * Gets the valorTaxa value for this Rodoviario.
     * 
     * @return valorTaxa
     */
    public java.lang.Double getValorTaxa() {
        return valorTaxa;
    }


    /**
     * Sets the valorTaxa value for this Rodoviario.
     * 
     * @param valorTaxa
     */
    public void setValorTaxa(java.lang.Double valorTaxa) {
        this.valorTaxa = valorTaxa;
    }


    /**
     * Gets the valorSeguro value for this Rodoviario.
     * 
     * @return valorSeguro
     */
    public java.lang.Double getValorSeguro() {
        return valorSeguro;
    }


    /**
     * Sets the valorSeguro value for this Rodoviario.
     * 
     * @param valorSeguro
     */
    public void setValorSeguro(java.lang.Double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }


    /**
     * Gets the totalRodoviario value for this Rodoviario.
     * 
     * @return totalRodoviario
     */
    public java.lang.Double getTotalRodoviario() {
        return totalRodoviario;
    }


    /**
     * Sets the totalRodoviario value for this Rodoviario.
     * 
     * @param totalRodoviario
     */
    public void setTotalRodoviario(java.lang.Double totalRodoviario) {
        this.totalRodoviario = totalRodoviario;
    }


    /**
     * Gets the codigoEmissor value for this Rodoviario.
     * 
     * @return codigoEmissor
     */
    public java.lang.String getCodigoEmissor() {
        return codigoEmissor;
    }


    /**
     * Sets the codigoEmissor value for this Rodoviario.
     * 
     * @param codigoEmissor
     */
    public void setCodigoEmissor(java.lang.String codigoEmissor) {
        this.codigoEmissor = codigoEmissor;
    }


    /**
     * Gets the nomeEmissor value for this Rodoviario.
     * 
     * @return nomeEmissor
     */
    public java.lang.String getNomeEmissor() {
        return nomeEmissor;
    }


    /**
     * Sets the nomeEmissor value for this Rodoviario.
     * 
     * @param nomeEmissor
     */
    public void setNomeEmissor(java.lang.String nomeEmissor) {
        this.nomeEmissor = nomeEmissor;
    }


    /**
     * Gets the codigoReservador value for this Rodoviario.
     * 
     * @return codigoReservador
     */
    public java.lang.String getCodigoReservador() {
        return codigoReservador;
    }


    /**
     * Sets the codigoReservador value for this Rodoviario.
     * 
     * @param codigoReservador
     */
    public void setCodigoReservador(java.lang.String codigoReservador) {
        this.codigoReservador = codigoReservador;
    }


    /**
     * Gets the nomeReservador value for this Rodoviario.
     * 
     * @return nomeReservador
     */
    public java.lang.String getNomeReservador() {
        return nomeReservador;
    }


    /**
     * Sets the nomeReservador value for this Rodoviario.
     * 
     * @param nomeReservador
     */
    public void setNomeReservador(java.lang.String nomeReservador) {
        this.nomeReservador = nomeReservador;
    }


    /**
     * Gets the dataReserva value for this Rodoviario.
     * 
     * @return dataReserva
     */
    public java.util.Calendar getDataReserva() {
        return dataReserva;
    }


    /**
     * Sets the dataReserva value for this Rodoviario.
     * 
     * @param dataReserva
     */
    public void setDataReserva(java.util.Calendar dataReserva) {
        this.dataReserva = dataReserva;
    }


    /**
     * Gets the obsEmissor value for this Rodoviario.
     * 
     * @return obsEmissor
     */
    public java.lang.String getObsEmissor() {
        return obsEmissor;
    }


    /**
     * Sets the obsEmissor value for this Rodoviario.
     * 
     * @param obsEmissor
     */
    public void setObsEmissor(java.lang.String obsEmissor) {
        this.obsEmissor = obsEmissor;
    }


    /**
     * Gets the maiorTarifa value for this Rodoviario.
     * 
     * @return maiorTarifa
     */
    public java.lang.Double getMaiorTarifa() {
        return maiorTarifa;
    }


    /**
     * Sets the maiorTarifa value for this Rodoviario.
     * 
     * @param maiorTarifa
     */
    public void setMaiorTarifa(java.lang.Double maiorTarifa) {
        this.maiorTarifa = maiorTarifa;
    }


    /**
     * Gets the menorTarifa value for this Rodoviario.
     * 
     * @return menorTarifa
     */
    public java.lang.Double getMenorTarifa() {
        return menorTarifa;
    }


    /**
     * Sets the menorTarifa value for this Rodoviario.
     * 
     * @param menorTarifa
     */
    public void setMenorTarifa(java.lang.Double menorTarifa) {
        this.menorTarifa = menorTarifa;
    }


    /**
     * Gets the formaPagamento value for this Rodoviario.
     * 
     * @return formaPagamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }


    /**
     * Sets the formaPagamento value for this Rodoviario.
     * 
     * @param formaPagamento
     */
    public void setFormaPagamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }


    /**
     * Gets the idPassageiroRef value for this Rodoviario.
     * 
     * @return idPassageiroRef
     */
    public java.lang.Integer[] getIdPassageiroRef() {
        return idPassageiroRef;
    }


    /**
     * Sets the idPassageiroRef value for this Rodoviario.
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
     * Gets the justificativaMaiorTarifa value for this Rodoviario.
     * 
     * @return justificativaMaiorTarifa
     */
    public java.lang.String getJustificativaMaiorTarifa() {
        return justificativaMaiorTarifa;
    }


    /**
     * Sets the justificativaMaiorTarifa value for this Rodoviario.
     * 
     * @param justificativaMaiorTarifa
     */
    public void setJustificativaMaiorTarifa(java.lang.String justificativaMaiorTarifa) {
        this.justificativaMaiorTarifa = justificativaMaiorTarifa;
    }


    /**
     * Gets the statusCancelamento value for this Rodoviario.
     * 
     * @return statusCancelamento
     */
    public java.lang.Integer getStatusCancelamento() {
        return statusCancelamento;
    }


    /**
     * Sets the statusCancelamento value for this Rodoviario.
     * 
     * @param statusCancelamento
     */
    public void setStatusCancelamento(java.lang.Integer statusCancelamento) {
        this.statusCancelamento = statusCancelamento;
    }


    /**
     * Gets the taxaCancelamento value for this Rodoviario.
     * 
     * @return taxaCancelamento
     */
    public java.lang.Double getTaxaCancelamento() {
        return taxaCancelamento;
    }


    /**
     * Sets the taxaCancelamento value for this Rodoviario.
     * 
     * @param taxaCancelamento
     */
    public void setTaxaCancelamento(java.lang.Double taxaCancelamento) {
        this.taxaCancelamento = taxaCancelamento;
    }


    /**
     * Gets the dataModificacaoStatusCancelamento value for this Rodoviario.
     * 
     * @return dataModificacaoStatusCancelamento
     */
    public java.util.Calendar getDataModificacaoStatusCancelamento() {
        return dataModificacaoStatusCancelamento;
    }


    /**
     * Sets the dataModificacaoStatusCancelamento value for this Rodoviario.
     * 
     * @param dataModificacaoStatusCancelamento
     */
    public void setDataModificacaoStatusCancelamento(java.util.Calendar dataModificacaoStatusCancelamento) {
        this.dataModificacaoStatusCancelamento = dataModificacaoStatusCancelamento;
    }


    /**
     * Gets the usuarioModificouStatusCancelamento value for this Rodoviario.
     * 
     * @return usuarioModificouStatusCancelamento
     */
    public java.lang.Integer getUsuarioModificouStatusCancelamento() {
        return usuarioModificouStatusCancelamento;
    }


    /**
     * Sets the usuarioModificouStatusCancelamento value for this Rodoviario.
     * 
     * @param usuarioModificouStatusCancelamento
     */
    public void setUsuarioModificouStatusCancelamento(java.lang.Integer usuarioModificouStatusCancelamento) {
        this.usuarioModificouStatusCancelamento = usuarioModificouStatusCancelamento;
    }


    /**
     * Gets the codigoJustificativaMaiorTarifa value for this Rodoviario.
     * 
     * @return codigoJustificativaMaiorTarifa
     */
    public java.lang.String getCodigoJustificativaMaiorTarifa() {
        return codigoJustificativaMaiorTarifa;
    }


    /**
     * Sets the codigoJustificativaMaiorTarifa value for this Rodoviario.
     * 
     * @param codigoJustificativaMaiorTarifa
     */
    public void setCodigoJustificativaMaiorTarifa(java.lang.String codigoJustificativaMaiorTarifa) {
        this.codigoJustificativaMaiorTarifa = codigoJustificativaMaiorTarifa;
    }


    /**
     * Gets the identificadorIntegracao value for this Rodoviario.
     * 
     * @return identificadorIntegracao
     */
    public java.lang.String getIdentificadorIntegracao() {
        return identificadorIntegracao;
    }


    /**
     * Sets the identificadorIntegracao value for this Rodoviario.
     * 
     * @param identificadorIntegracao
     */
    public void setIdentificadorIntegracao(java.lang.String identificadorIntegracao) {
        this.identificadorIntegracao = identificadorIntegracao;
    }


    /**
     * Gets the identificador value for this Rodoviario.
     * 
     * @return identificador
     */
    public java.lang.String getIdentificador() {
        return identificador;
    }


    /**
     * Sets the identificador value for this Rodoviario.
     * 
     * @param identificador
     */
    public void setIdentificador(java.lang.String identificador) {
        this.identificador = identificador;
    }


    /**
     * Gets the categoria value for this Rodoviario.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this Rodoviario.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the identificadorBackOfficeTipoProduto value for this Rodoviario.
     * 
     * @return identificadorBackOfficeTipoProduto
     */
    public java.lang.String getIdentificadorBackOfficeTipoProduto() {
        return identificadorBackOfficeTipoProduto;
    }


    /**
     * Sets the identificadorBackOfficeTipoProduto value for this Rodoviario.
     * 
     * @param identificadorBackOfficeTipoProduto
     */
    public void setIdentificadorBackOfficeTipoProduto(java.lang.String identificadorBackOfficeTipoProduto) {
        this.identificadorBackOfficeTipoProduto = identificadorBackOfficeTipoProduto;
    }


    /**
     * Gets the autorizacaoCartao value for this Rodoviario.
     * 
     * @return autorizacaoCartao
     */
    public java.lang.String getAutorizacaoCartao() {
        return autorizacaoCartao;
    }


    /**
     * Sets the autorizacaoCartao value for this Rodoviario.
     * 
     * @param autorizacaoCartao
     */
    public void setAutorizacaoCartao(java.lang.String autorizacaoCartao) {
        this.autorizacaoCartao = autorizacaoCartao;
    }


    /**
     * Gets the remarks value for this Rodoviario.
     * 
     * @return remarks
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this Rodoviario.
     * 
     * @param remarks
     */
    public void setRemarks(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the cancelado value for this Rodoviario.
     * 
     * @return cancelado
     */
    public boolean isCancelado() {
        return cancelado;
    }


    /**
     * Sets the cancelado value for this Rodoviario.
     * 
     * @param cancelado
     */
    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }


    /**
     * Gets the identificadoresIntegracao value for this Rodoviario.
     * 
     * @return identificadoresIntegracao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] getIdentificadoresIntegracao() {
        return identificadoresIntegracao;
    }


    /**
     * Sets the identificadoresIntegracao value for this Rodoviario.
     * 
     * @param identificadoresIntegracao
     */
    public void setIdentificadoresIntegracao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao) {
        this.identificadoresIntegracao = identificadoresIntegracao;
    }


    /**
     * Gets the taxaFee value for this Rodoviario.
     * 
     * @return taxaFee
     */
    public java.lang.Double getTaxaFee() {
        return taxaFee;
    }


    /**
     * Sets the taxaFee value for this Rodoviario.
     * 
     * @param taxaFee
     */
    public void setTaxaFee(java.lang.Double taxaFee) {
        this.taxaFee = taxaFee;
    }


    /**
     * Gets the consolidadora value for this Rodoviario.
     * 
     * @return consolidadora
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora getConsolidadora() {
        return consolidadora;
    }


    /**
     * Sets the consolidadora value for this Rodoviario.
     * 
     * @param consolidadora
     */
    public void setConsolidadora(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora) {
        this.consolidadora = consolidadora;
    }


    /**
     * Gets the moeda value for this Rodoviario.
     * 
     * @return moeda
     */
    public java.lang.String getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this Rodoviario.
     * 
     * @param moeda
     */
    public void setMoeda(java.lang.String moeda) {
        this.moeda = moeda;
    }


    /**
     * Gets the pontoVenda value for this Rodoviario.
     * 
     * @return pontoVenda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento getPontoVenda() {
        return pontoVenda;
    }


    /**
     * Sets the pontoVenda value for this Rodoviario.
     * 
     * @param pontoVenda
     */
    public void setPontoVenda(br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda) {
        this.pontoVenda = pontoVenda;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rodoviario)) return false;
        Rodoviario other = (Rodoviario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.dataSaida==null && other.getDataSaida()==null) || 
             (this.dataSaida!=null &&
              this.dataSaida.equals(other.getDataSaida()))) &&
            ((this.dataChegada==null && other.getDataChegada()==null) || 
             (this.dataChegada!=null &&
              this.dataChegada.equals(other.getDataChegada()))) &&
            ((this.terminalRodoviarioOrigem==null && other.getTerminalRodoviarioOrigem()==null) || 
             (this.terminalRodoviarioOrigem!=null &&
              this.terminalRodoviarioOrigem.equals(other.getTerminalRodoviarioOrigem()))) &&
            ((this.terminalRodoviarioDestino==null && other.getTerminalRodoviarioDestino()==null) || 
             (this.terminalRodoviarioDestino!=null &&
              this.terminalRodoviarioDestino.equals(other.getTerminalRodoviarioDestino()))) &&
            ((this.empresaViacao==null && other.getEmpresaViacao()==null) || 
             (this.empresaViacao!=null &&
              this.empresaViacao.equals(other.getEmpresaViacao()))) &&
            ((this.assento==null && other.getAssento()==null) || 
             (this.assento!=null &&
              this.assento.equals(other.getAssento()))) &&
            ((this.classe==null && other.getClasse()==null) || 
             (this.classe!=null &&
              this.classe.equals(other.getClasse()))) &&
            ((this.preferenciaAssento==null && other.getPreferenciaAssento()==null) || 
             (this.preferenciaAssento!=null &&
              this.preferenciaAssento.equals(other.getPreferenciaAssento()))) &&
            ((this.localAssento==null && other.getLocalAssento()==null) || 
             (this.localAssento!=null &&
              this.localAssento.equals(other.getLocalAssento()))) &&
            ((this.localizador==null && other.getLocalizador()==null) || 
             (this.localizador!=null &&
              this.localizador.equals(other.getLocalizador()))) &&
            ((this.valorTarifa==null && other.getValorTarifa()==null) || 
             (this.valorTarifa!=null &&
              this.valorTarifa.equals(other.getValorTarifa()))) &&
            ((this.valorTaxa==null && other.getValorTaxa()==null) || 
             (this.valorTaxa!=null &&
              this.valorTaxa.equals(other.getValorTaxa()))) &&
            ((this.valorSeguro==null && other.getValorSeguro()==null) || 
             (this.valorSeguro!=null &&
              this.valorSeguro.equals(other.getValorSeguro()))) &&
            ((this.totalRodoviario==null && other.getTotalRodoviario()==null) || 
             (this.totalRodoviario!=null &&
              this.totalRodoviario.equals(other.getTotalRodoviario()))) &&
            ((this.codigoEmissor==null && other.getCodigoEmissor()==null) || 
             (this.codigoEmissor!=null &&
              this.codigoEmissor.equals(other.getCodigoEmissor()))) &&
            ((this.nomeEmissor==null && other.getNomeEmissor()==null) || 
             (this.nomeEmissor!=null &&
              this.nomeEmissor.equals(other.getNomeEmissor()))) &&
            ((this.codigoReservador==null && other.getCodigoReservador()==null) || 
             (this.codigoReservador!=null &&
              this.codigoReservador.equals(other.getCodigoReservador()))) &&
            ((this.nomeReservador==null && other.getNomeReservador()==null) || 
             (this.nomeReservador!=null &&
              this.nomeReservador.equals(other.getNomeReservador()))) &&
            ((this.dataReserva==null && other.getDataReserva()==null) || 
             (this.dataReserva!=null &&
              this.dataReserva.equals(other.getDataReserva()))) &&
            ((this.obsEmissor==null && other.getObsEmissor()==null) || 
             (this.obsEmissor!=null &&
              this.obsEmissor.equals(other.getObsEmissor()))) &&
            ((this.maiorTarifa==null && other.getMaiorTarifa()==null) || 
             (this.maiorTarifa!=null &&
              this.maiorTarifa.equals(other.getMaiorTarifa()))) &&
            ((this.menorTarifa==null && other.getMenorTarifa()==null) || 
             (this.menorTarifa!=null &&
              this.menorTarifa.equals(other.getMenorTarifa()))) &&
            ((this.formaPagamento==null && other.getFormaPagamento()==null) || 
             (this.formaPagamento!=null &&
              this.formaPagamento.equals(other.getFormaPagamento()))) &&
            ((this.idPassageiroRef==null && other.getIdPassageiroRef()==null) || 
             (this.idPassageiroRef!=null &&
              java.util.Arrays.equals(this.idPassageiroRef, other.getIdPassageiroRef()))) &&
            ((this.justificativaMaiorTarifa==null && other.getJustificativaMaiorTarifa()==null) || 
             (this.justificativaMaiorTarifa!=null &&
              this.justificativaMaiorTarifa.equals(other.getJustificativaMaiorTarifa()))) &&
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
            ((this.codigoJustificativaMaiorTarifa==null && other.getCodigoJustificativaMaiorTarifa()==null) || 
             (this.codigoJustificativaMaiorTarifa!=null &&
              this.codigoJustificativaMaiorTarifa.equals(other.getCodigoJustificativaMaiorTarifa()))) &&
            ((this.identificadorIntegracao==null && other.getIdentificadorIntegracao()==null) || 
             (this.identificadorIntegracao!=null &&
              this.identificadorIntegracao.equals(other.getIdentificadorIntegracao()))) &&
            ((this.identificador==null && other.getIdentificador()==null) || 
             (this.identificador!=null &&
              this.identificador.equals(other.getIdentificador()))) &&
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            ((this.identificadorBackOfficeTipoProduto==null && other.getIdentificadorBackOfficeTipoProduto()==null) || 
             (this.identificadorBackOfficeTipoProduto!=null &&
              this.identificadorBackOfficeTipoProduto.equals(other.getIdentificadorBackOfficeTipoProduto()))) &&
            ((this.autorizacaoCartao==null && other.getAutorizacaoCartao()==null) || 
             (this.autorizacaoCartao!=null &&
              this.autorizacaoCartao.equals(other.getAutorizacaoCartao()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks()))) &&
            this.cancelado == other.isCancelado() &&
            ((this.identificadoresIntegracao==null && other.getIdentificadoresIntegracao()==null) || 
             (this.identificadoresIntegracao!=null &&
              java.util.Arrays.equals(this.identificadoresIntegracao, other.getIdentificadoresIntegracao()))) &&
            ((this.taxaFee==null && other.getTaxaFee()==null) || 
             (this.taxaFee!=null &&
              this.taxaFee.equals(other.getTaxaFee()))) &&
            ((this.consolidadora==null && other.getConsolidadora()==null) || 
             (this.consolidadora!=null &&
              this.consolidadora.equals(other.getConsolidadora()))) &&
            ((this.moeda==null && other.getMoeda()==null) || 
             (this.moeda!=null &&
              this.moeda.equals(other.getMoeda()))) &&
            ((this.pontoVenda==null && other.getPontoVenda()==null) || 
             (this.pontoVenda!=null &&
              this.pontoVenda.equals(other.getPontoVenda())));
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
        if (getDataSaida() != null) {
            _hashCode += getDataSaida().hashCode();
        }
        if (getDataChegada() != null) {
            _hashCode += getDataChegada().hashCode();
        }
        if (getTerminalRodoviarioOrigem() != null) {
            _hashCode += getTerminalRodoviarioOrigem().hashCode();
        }
        if (getTerminalRodoviarioDestino() != null) {
            _hashCode += getTerminalRodoviarioDestino().hashCode();
        }
        if (getEmpresaViacao() != null) {
            _hashCode += getEmpresaViacao().hashCode();
        }
        if (getAssento() != null) {
            _hashCode += getAssento().hashCode();
        }
        if (getClasse() != null) {
            _hashCode += getClasse().hashCode();
        }
        if (getPreferenciaAssento() != null) {
            _hashCode += getPreferenciaAssento().hashCode();
        }
        if (getLocalAssento() != null) {
            _hashCode += getLocalAssento().hashCode();
        }
        if (getLocalizador() != null) {
            _hashCode += getLocalizador().hashCode();
        }
        if (getValorTarifa() != null) {
            _hashCode += getValorTarifa().hashCode();
        }
        if (getValorTaxa() != null) {
            _hashCode += getValorTaxa().hashCode();
        }
        if (getValorSeguro() != null) {
            _hashCode += getValorSeguro().hashCode();
        }
        if (getTotalRodoviario() != null) {
            _hashCode += getTotalRodoviario().hashCode();
        }
        if (getCodigoEmissor() != null) {
            _hashCode += getCodigoEmissor().hashCode();
        }
        if (getNomeEmissor() != null) {
            _hashCode += getNomeEmissor().hashCode();
        }
        if (getCodigoReservador() != null) {
            _hashCode += getCodigoReservador().hashCode();
        }
        if (getNomeReservador() != null) {
            _hashCode += getNomeReservador().hashCode();
        }
        if (getDataReserva() != null) {
            _hashCode += getDataReserva().hashCode();
        }
        if (getObsEmissor() != null) {
            _hashCode += getObsEmissor().hashCode();
        }
        if (getMaiorTarifa() != null) {
            _hashCode += getMaiorTarifa().hashCode();
        }
        if (getMenorTarifa() != null) {
            _hashCode += getMenorTarifa().hashCode();
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
        if (getCodigoJustificativaMaiorTarifa() != null) {
            _hashCode += getCodigoJustificativaMaiorTarifa().hashCode();
        }
        if (getIdentificadorIntegracao() != null) {
            _hashCode += getIdentificadorIntegracao().hashCode();
        }
        if (getIdentificador() != null) {
            _hashCode += getIdentificador().hashCode();
        }
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
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
        if (getConsolidadora() != null) {
            _hashCode += getConsolidadora().hashCode();
        }
        if (getMoeda() != null) {
            _hashCode += getMoeda().hashCode();
        }
        if (getPontoVenda() != null) {
            _hashCode += getPontoVenda().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rodoviario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/rodoviario", "rodoviario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSaida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataSaida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataChegada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataChegada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalRodoviarioOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terminalRodoviarioOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalRodoviarioDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terminalRodoviarioDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empresaViacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empresaViacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "classeRodoviario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferenciaAssento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferenciaAssento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "preferenciaAssentoRodoviario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localAssento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localAssento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "localAssentoRodoviario"));
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
        elemField.setFieldName("valorTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorTarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorTaxa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorTaxa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorSeguro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorSeguro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRodoviario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRodoviario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("nomeEmissor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeEmissor"));
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
        elemField.setFieldName("dataReserva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataReserva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obsEmissor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "obsEmissor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maiorTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maiorTarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menorTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "menorTarifa"));
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
        elemField.setFieldName("identificador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoria"));
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
        elemField.setFieldName("pontoVenda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pontoVenda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "pontoVendaOrcamento"));
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
