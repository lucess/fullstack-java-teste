/**
 * Hotel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.hotel;

public class Hotel  implements java.io.Serializable {
    private int id;

    private java.lang.String codigoApartamento;

    private java.lang.String nome;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento tipoApartamento;

    private java.lang.String source;

    private java.lang.String codigoHotelSource;

    private java.util.Calendar checkIn;

    private java.util.Calendar checkOut;

    private java.lang.Integer[] idRegime;

    private java.lang.Integer[] idCategApto;

    private java.lang.String localizador;

    private java.lang.String codigoEmissor;

    private java.lang.String codigoReservador;

    private java.lang.String nomeReservador;

    private java.util.Calendar dataReserva;

    private java.lang.String moeda;

    private java.lang.Double diaria;

    private java.lang.Double taxa;

    private java.lang.String titularCartao;

    private java.lang.Boolean cartaoVirtual;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamento;

    private java.lang.Integer[] idPassageiroRef;

    private java.lang.String justificativaMaiorTarifa;

    private java.lang.String local;

    private java.lang.String cidade;

    private java.lang.String codigoFornecedor;

    private java.lang.Boolean nacional;

    private java.lang.String observacao;

    private java.lang.String voucher;

    private java.lang.String codigoReserva;

    private java.lang.String codigoJustificativaMaiorTarifa;

    private java.lang.String identificadorIntegracao;

    private java.lang.String identificadorBackOfficeTipoProduto;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks;

    private java.lang.Integer statusCancelamento;

    private java.lang.Double taxaCancelamento;

    private java.util.Calendar dataModificacaoStatusCancelamento;

    private java.lang.Integer usuarioModificouStatusCancelamento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.CategoriaApartamento categoriaApartamento;

    private java.lang.String nomeEmissor;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.GarantiaNoShow garantiaNoShow;

    private java.lang.String titularCartaoNoShow;

    private java.lang.Boolean cartaoVirtualNoShow;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamentoGarantiaNoShow;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.ItenFaturamento[] itensFaturamentoHotel;

    private java.lang.Double totalHotel;

    private boolean cancelado;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao;

    private java.lang.Double taxaFee;

    private boolean selfbook;

    private boolean tarifaComissionada;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Regime regime;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoTarifa tipoTarifa;

    private java.lang.Integer quantidadeTipoTarifa;

    private java.lang.Double tarifa;

    private java.lang.Double valorCambio;

    private java.lang.Double earlyCheckin;

    private java.lang.Double lateCheckout;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.PlanoAlimentar planoAlimentar;

    private java.lang.Integer quantidadePlanoAlimentar;

    private java.lang.Double valorPlanoAlimentar;

    private java.util.Calendar prazoCancelamento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora;

    private boolean online;

    private java.util.Calendar dataConfirmacaoReserva;

    private java.lang.String moedaBase;

    private java.lang.Double diariaBase;

    private java.lang.Double taxaBase;

    private java.lang.Double earlyCheckinBase;

    private java.lang.Double lateCheckoutBase;

    private boolean agenteOnline;

    private boolean importado;

    private java.lang.String telefone;

    private java.lang.String pais;

    private java.lang.String estado;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda;

    private java.lang.String emailEmissor;

    private java.lang.String iataCidade;

    private java.lang.String localizadorPreTrip;

    private int identificadorUnidadeOperacional;

    public Hotel() {
    }

    public Hotel(
           int id,
           java.lang.String codigoApartamento,
           java.lang.String nome,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento tipoApartamento,
           java.lang.String source,
           java.lang.String codigoHotelSource,
           java.util.Calendar checkIn,
           java.util.Calendar checkOut,
           java.lang.Integer[] idRegime,
           java.lang.Integer[] idCategApto,
           java.lang.String localizador,
           java.lang.String codigoEmissor,
           java.lang.String codigoReservador,
           java.lang.String nomeReservador,
           java.util.Calendar dataReserva,
           java.lang.String moeda,
           java.lang.Double diaria,
           java.lang.Double taxa,
           java.lang.String titularCartao,
           java.lang.Boolean cartaoVirtual,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamento,
           java.lang.Integer[] idPassageiroRef,
           java.lang.String justificativaMaiorTarifa,
           java.lang.String local,
           java.lang.String cidade,
           java.lang.String codigoFornecedor,
           java.lang.Boolean nacional,
           java.lang.String observacao,
           java.lang.String voucher,
           java.lang.String codigoReserva,
           java.lang.String codigoJustificativaMaiorTarifa,
           java.lang.String identificadorIntegracao,
           java.lang.String identificadorBackOfficeTipoProduto,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks,
           java.lang.Integer statusCancelamento,
           java.lang.Double taxaCancelamento,
           java.util.Calendar dataModificacaoStatusCancelamento,
           java.lang.Integer usuarioModificouStatusCancelamento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.CategoriaApartamento categoriaApartamento,
           java.lang.String nomeEmissor,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.GarantiaNoShow garantiaNoShow,
           java.lang.String titularCartaoNoShow,
           java.lang.Boolean cartaoVirtualNoShow,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamentoGarantiaNoShow,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.ItenFaturamento[] itensFaturamentoHotel,
           java.lang.Double totalHotel,
           boolean cancelado,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao,
           java.lang.Double taxaFee,
           boolean selfbook,
           boolean tarifaComissionada,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Regime regime,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoTarifa tipoTarifa,
           java.lang.Integer quantidadeTipoTarifa,
           java.lang.Double tarifa,
           java.lang.Double valorCambio,
           java.lang.Double earlyCheckin,
           java.lang.Double lateCheckout,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.PlanoAlimentar planoAlimentar,
           java.lang.Integer quantidadePlanoAlimentar,
           java.lang.Double valorPlanoAlimentar,
           java.util.Calendar prazoCancelamento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora,
           boolean online,
           java.util.Calendar dataConfirmacaoReserva,
           java.lang.String moedaBase,
           java.lang.Double diariaBase,
           java.lang.Double taxaBase,
           java.lang.Double earlyCheckinBase,
           java.lang.Double lateCheckoutBase,
           boolean agenteOnline,
           boolean importado,
           java.lang.String telefone,
           java.lang.String pais,
           java.lang.String estado,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda,
           java.lang.String emailEmissor,
           java.lang.String iataCidade,
           java.lang.String localizadorPreTrip,
           int identificadorUnidadeOperacional) {
           this.id = id;
           this.codigoApartamento = codigoApartamento;
           this.nome = nome;
           this.tipoApartamento = tipoApartamento;
           this.source = source;
           this.codigoHotelSource = codigoHotelSource;
           this.checkIn = checkIn;
           this.checkOut = checkOut;
           this.idRegime = idRegime;
           this.idCategApto = idCategApto;
           this.localizador = localizador;
           this.codigoEmissor = codigoEmissor;
           this.codigoReservador = codigoReservador;
           this.nomeReservador = nomeReservador;
           this.dataReserva = dataReserva;
           this.moeda = moeda;
           this.diaria = diaria;
           this.taxa = taxa;
           this.titularCartao = titularCartao;
           this.cartaoVirtual = cartaoVirtual;
           this.formaPagamento = formaPagamento;
           this.idPassageiroRef = idPassageiroRef;
           this.justificativaMaiorTarifa = justificativaMaiorTarifa;
           this.local = local;
           this.cidade = cidade;
           this.codigoFornecedor = codigoFornecedor;
           this.nacional = nacional;
           this.observacao = observacao;
           this.voucher = voucher;
           this.codigoReserva = codigoReserva;
           this.codigoJustificativaMaiorTarifa = codigoJustificativaMaiorTarifa;
           this.identificadorIntegracao = identificadorIntegracao;
           this.identificadorBackOfficeTipoProduto = identificadorBackOfficeTipoProduto;
           this.remarks = remarks;
           this.statusCancelamento = statusCancelamento;
           this.taxaCancelamento = taxaCancelamento;
           this.dataModificacaoStatusCancelamento = dataModificacaoStatusCancelamento;
           this.usuarioModificouStatusCancelamento = usuarioModificouStatusCancelamento;
           this.categoriaApartamento = categoriaApartamento;
           this.nomeEmissor = nomeEmissor;
           this.garantiaNoShow = garantiaNoShow;
           this.titularCartaoNoShow = titularCartaoNoShow;
           this.cartaoVirtualNoShow = cartaoVirtualNoShow;
           this.formaPagamentoGarantiaNoShow = formaPagamentoGarantiaNoShow;
           this.itensFaturamentoHotel = itensFaturamentoHotel;
           this.totalHotel = totalHotel;
           this.cancelado = cancelado;
           this.identificadoresIntegracao = identificadoresIntegracao;
           this.taxaFee = taxaFee;
           this.selfbook = selfbook;
           this.tarifaComissionada = tarifaComissionada;
           this.regime = regime;
           this.tipoTarifa = tipoTarifa;
           this.quantidadeTipoTarifa = quantidadeTipoTarifa;
           this.tarifa = tarifa;
           this.valorCambio = valorCambio;
           this.earlyCheckin = earlyCheckin;
           this.lateCheckout = lateCheckout;
           this.planoAlimentar = planoAlimentar;
           this.quantidadePlanoAlimentar = quantidadePlanoAlimentar;
           this.valorPlanoAlimentar = valorPlanoAlimentar;
           this.prazoCancelamento = prazoCancelamento;
           this.consolidadora = consolidadora;
           this.online = online;
           this.dataConfirmacaoReserva = dataConfirmacaoReserva;
           this.moedaBase = moedaBase;
           this.diariaBase = diariaBase;
           this.taxaBase = taxaBase;
           this.earlyCheckinBase = earlyCheckinBase;
           this.lateCheckoutBase = lateCheckoutBase;
           this.agenteOnline = agenteOnline;
           this.importado = importado;
           this.telefone = telefone;
           this.pais = pais;
           this.estado = estado;
           this.pontoVenda = pontoVenda;
           this.emailEmissor = emailEmissor;
           this.iataCidade = iataCidade;
           this.localizadorPreTrip = localizadorPreTrip;
           this.identificadorUnidadeOperacional = identificadorUnidadeOperacional;
    }


    /**
     * Gets the id value for this Hotel.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Hotel.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the codigoApartamento value for this Hotel.
     * 
     * @return codigoApartamento
     */
    public java.lang.String getCodigoApartamento() {
        return codigoApartamento;
    }


    /**
     * Sets the codigoApartamento value for this Hotel.
     * 
     * @param codigoApartamento
     */
    public void setCodigoApartamento(java.lang.String codigoApartamento) {
        this.codigoApartamento = codigoApartamento;
    }


    /**
     * Gets the nome value for this Hotel.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Hotel.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the tipoApartamento value for this Hotel.
     * 
     * @return tipoApartamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento getTipoApartamento() {
        return tipoApartamento;
    }


    /**
     * Sets the tipoApartamento value for this Hotel.
     * 
     * @param tipoApartamento
     */
    public void setTipoApartamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento tipoApartamento) {
        this.tipoApartamento = tipoApartamento;
    }


    /**
     * Gets the source value for this Hotel.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Hotel.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the codigoHotelSource value for this Hotel.
     * 
     * @return codigoHotelSource
     */
    public java.lang.String getCodigoHotelSource() {
        return codigoHotelSource;
    }


    /**
     * Sets the codigoHotelSource value for this Hotel.
     * 
     * @param codigoHotelSource
     */
    public void setCodigoHotelSource(java.lang.String codigoHotelSource) {
        this.codigoHotelSource = codigoHotelSource;
    }


    /**
     * Gets the checkIn value for this Hotel.
     * 
     * @return checkIn
     */
    public java.util.Calendar getCheckIn() {
        return checkIn;
    }


    /**
     * Sets the checkIn value for this Hotel.
     * 
     * @param checkIn
     */
    public void setCheckIn(java.util.Calendar checkIn) {
        this.checkIn = checkIn;
    }


    /**
     * Gets the checkOut value for this Hotel.
     * 
     * @return checkOut
     */
    public java.util.Calendar getCheckOut() {
        return checkOut;
    }


    /**
     * Sets the checkOut value for this Hotel.
     * 
     * @param checkOut
     */
    public void setCheckOut(java.util.Calendar checkOut) {
        this.checkOut = checkOut;
    }


    /**
     * Gets the idRegime value for this Hotel.
     * 
     * @return idRegime
     */
    public java.lang.Integer[] getIdRegime() {
        return idRegime;
    }


    /**
     * Sets the idRegime value for this Hotel.
     * 
     * @param idRegime
     */
    public void setIdRegime(java.lang.Integer[] idRegime) {
        this.idRegime = idRegime;
    }

    public java.lang.Integer getIdRegime(int i) {
        return this.idRegime[i];
    }

    public void setIdRegime(int i, java.lang.Integer _value) {
        this.idRegime[i] = _value;
    }


    /**
     * Gets the idCategApto value for this Hotel.
     * 
     * @return idCategApto
     */
    public java.lang.Integer[] getIdCategApto() {
        return idCategApto;
    }


    /**
     * Sets the idCategApto value for this Hotel.
     * 
     * @param idCategApto
     */
    public void setIdCategApto(java.lang.Integer[] idCategApto) {
        this.idCategApto = idCategApto;
    }

    public java.lang.Integer getIdCategApto(int i) {
        return this.idCategApto[i];
    }

    public void setIdCategApto(int i, java.lang.Integer _value) {
        this.idCategApto[i] = _value;
    }


    /**
     * Gets the localizador value for this Hotel.
     * 
     * @return localizador
     */
    public java.lang.String getLocalizador() {
        return localizador;
    }


    /**
     * Sets the localizador value for this Hotel.
     * 
     * @param localizador
     */
    public void setLocalizador(java.lang.String localizador) {
        this.localizador = localizador;
    }


    /**
     * Gets the codigoEmissor value for this Hotel.
     * 
     * @return codigoEmissor
     */
    public java.lang.String getCodigoEmissor() {
        return codigoEmissor;
    }


    /**
     * Sets the codigoEmissor value for this Hotel.
     * 
     * @param codigoEmissor
     */
    public void setCodigoEmissor(java.lang.String codigoEmissor) {
        this.codigoEmissor = codigoEmissor;
    }


    /**
     * Gets the codigoReservador value for this Hotel.
     * 
     * @return codigoReservador
     */
    public java.lang.String getCodigoReservador() {
        return codigoReservador;
    }


    /**
     * Sets the codigoReservador value for this Hotel.
     * 
     * @param codigoReservador
     */
    public void setCodigoReservador(java.lang.String codigoReservador) {
        this.codigoReservador = codigoReservador;
    }


    /**
     * Gets the nomeReservador value for this Hotel.
     * 
     * @return nomeReservador
     */
    public java.lang.String getNomeReservador() {
        return nomeReservador;
    }


    /**
     * Sets the nomeReservador value for this Hotel.
     * 
     * @param nomeReservador
     */
    public void setNomeReservador(java.lang.String nomeReservador) {
        this.nomeReservador = nomeReservador;
    }


    /**
     * Gets the dataReserva value for this Hotel.
     * 
     * @return dataReserva
     */
    public java.util.Calendar getDataReserva() {
        return dataReserva;
    }


    /**
     * Sets the dataReserva value for this Hotel.
     * 
     * @param dataReserva
     */
    public void setDataReserva(java.util.Calendar dataReserva) {
        this.dataReserva = dataReserva;
    }


    /**
     * Gets the moeda value for this Hotel.
     * 
     * @return moeda
     */
    public java.lang.String getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this Hotel.
     * 
     * @param moeda
     */
    public void setMoeda(java.lang.String moeda) {
        this.moeda = moeda;
    }


    /**
     * Gets the diaria value for this Hotel.
     * 
     * @return diaria
     */
    public java.lang.Double getDiaria() {
        return diaria;
    }


    /**
     * Sets the diaria value for this Hotel.
     * 
     * @param diaria
     */
    public void setDiaria(java.lang.Double diaria) {
        this.diaria = diaria;
    }


    /**
     * Gets the taxa value for this Hotel.
     * 
     * @return taxa
     */
    public java.lang.Double getTaxa() {
        return taxa;
    }


    /**
     * Sets the taxa value for this Hotel.
     * 
     * @param taxa
     */
    public void setTaxa(java.lang.Double taxa) {
        this.taxa = taxa;
    }


    /**
     * Gets the titularCartao value for this Hotel.
     * 
     * @return titularCartao
     */
    public java.lang.String getTitularCartao() {
        return titularCartao;
    }


    /**
     * Sets the titularCartao value for this Hotel.
     * 
     * @param titularCartao
     */
    public void setTitularCartao(java.lang.String titularCartao) {
        this.titularCartao = titularCartao;
    }


    /**
     * Gets the cartaoVirtual value for this Hotel.
     * 
     * @return cartaoVirtual
     */
    public java.lang.Boolean getCartaoVirtual() {
        return cartaoVirtual;
    }


    /**
     * Sets the cartaoVirtual value for this Hotel.
     * 
     * @param cartaoVirtual
     */
    public void setCartaoVirtual(java.lang.Boolean cartaoVirtual) {
        this.cartaoVirtual = cartaoVirtual;
    }


    /**
     * Gets the formaPagamento value for this Hotel.
     * 
     * @return formaPagamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }


    /**
     * Sets the formaPagamento value for this Hotel.
     * 
     * @param formaPagamento
     */
    public void setFormaPagamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }


    /**
     * Gets the idPassageiroRef value for this Hotel.
     * 
     * @return idPassageiroRef
     */
    public java.lang.Integer[] getIdPassageiroRef() {
        return idPassageiroRef;
    }


    /**
     * Sets the idPassageiroRef value for this Hotel.
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
     * Gets the justificativaMaiorTarifa value for this Hotel.
     * 
     * @return justificativaMaiorTarifa
     */
    public java.lang.String getJustificativaMaiorTarifa() {
        return justificativaMaiorTarifa;
    }


    /**
     * Sets the justificativaMaiorTarifa value for this Hotel.
     * 
     * @param justificativaMaiorTarifa
     */
    public void setJustificativaMaiorTarifa(java.lang.String justificativaMaiorTarifa) {
        this.justificativaMaiorTarifa = justificativaMaiorTarifa;
    }


    /**
     * Gets the local value for this Hotel.
     * 
     * @return local
     */
    public java.lang.String getLocal() {
        return local;
    }


    /**
     * Sets the local value for this Hotel.
     * 
     * @param local
     */
    public void setLocal(java.lang.String local) {
        this.local = local;
    }


    /**
     * Gets the cidade value for this Hotel.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this Hotel.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the codigoFornecedor value for this Hotel.
     * 
     * @return codigoFornecedor
     */
    public java.lang.String getCodigoFornecedor() {
        return codigoFornecedor;
    }


    /**
     * Sets the codigoFornecedor value for this Hotel.
     * 
     * @param codigoFornecedor
     */
    public void setCodigoFornecedor(java.lang.String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }


    /**
     * Gets the nacional value for this Hotel.
     * 
     * @return nacional
     */
    public java.lang.Boolean getNacional() {
        return nacional;
    }


    /**
     * Sets the nacional value for this Hotel.
     * 
     * @param nacional
     */
    public void setNacional(java.lang.Boolean nacional) {
        this.nacional = nacional;
    }


    /**
     * Gets the observacao value for this Hotel.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this Hotel.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }


    /**
     * Gets the voucher value for this Hotel.
     * 
     * @return voucher
     */
    public java.lang.String getVoucher() {
        return voucher;
    }


    /**
     * Sets the voucher value for this Hotel.
     * 
     * @param voucher
     */
    public void setVoucher(java.lang.String voucher) {
        this.voucher = voucher;
    }


    /**
     * Gets the codigoReserva value for this Hotel.
     * 
     * @return codigoReserva
     */
    public java.lang.String getCodigoReserva() {
        return codigoReserva;
    }


    /**
     * Sets the codigoReserva value for this Hotel.
     * 
     * @param codigoReserva
     */
    public void setCodigoReserva(java.lang.String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }


    /**
     * Gets the codigoJustificativaMaiorTarifa value for this Hotel.
     * 
     * @return codigoJustificativaMaiorTarifa
     */
    public java.lang.String getCodigoJustificativaMaiorTarifa() {
        return codigoJustificativaMaiorTarifa;
    }


    /**
     * Sets the codigoJustificativaMaiorTarifa value for this Hotel.
     * 
     * @param codigoJustificativaMaiorTarifa
     */
    public void setCodigoJustificativaMaiorTarifa(java.lang.String codigoJustificativaMaiorTarifa) {
        this.codigoJustificativaMaiorTarifa = codigoJustificativaMaiorTarifa;
    }


    /**
     * Gets the identificadorIntegracao value for this Hotel.
     * 
     * @return identificadorIntegracao
     */
    public java.lang.String getIdentificadorIntegracao() {
        return identificadorIntegracao;
    }


    /**
     * Sets the identificadorIntegracao value for this Hotel.
     * 
     * @param identificadorIntegracao
     */
    public void setIdentificadorIntegracao(java.lang.String identificadorIntegracao) {
        this.identificadorIntegracao = identificadorIntegracao;
    }


    /**
     * Gets the identificadorBackOfficeTipoProduto value for this Hotel.
     * 
     * @return identificadorBackOfficeTipoProduto
     */
    public java.lang.String getIdentificadorBackOfficeTipoProduto() {
        return identificadorBackOfficeTipoProduto;
    }


    /**
     * Sets the identificadorBackOfficeTipoProduto value for this Hotel.
     * 
     * @param identificadorBackOfficeTipoProduto
     */
    public void setIdentificadorBackOfficeTipoProduto(java.lang.String identificadorBackOfficeTipoProduto) {
        this.identificadorBackOfficeTipoProduto = identificadorBackOfficeTipoProduto;
    }


    /**
     * Gets the remarks value for this Hotel.
     * 
     * @return remarks
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this Hotel.
     * 
     * @param remarks
     */
    public void setRemarks(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the statusCancelamento value for this Hotel.
     * 
     * @return statusCancelamento
     */
    public java.lang.Integer getStatusCancelamento() {
        return statusCancelamento;
    }


    /**
     * Sets the statusCancelamento value for this Hotel.
     * 
     * @param statusCancelamento
     */
    public void setStatusCancelamento(java.lang.Integer statusCancelamento) {
        this.statusCancelamento = statusCancelamento;
    }


    /**
     * Gets the taxaCancelamento value for this Hotel.
     * 
     * @return taxaCancelamento
     */
    public java.lang.Double getTaxaCancelamento() {
        return taxaCancelamento;
    }


    /**
     * Sets the taxaCancelamento value for this Hotel.
     * 
     * @param taxaCancelamento
     */
    public void setTaxaCancelamento(java.lang.Double taxaCancelamento) {
        this.taxaCancelamento = taxaCancelamento;
    }


    /**
     * Gets the dataModificacaoStatusCancelamento value for this Hotel.
     * 
     * @return dataModificacaoStatusCancelamento
     */
    public java.util.Calendar getDataModificacaoStatusCancelamento() {
        return dataModificacaoStatusCancelamento;
    }


    /**
     * Sets the dataModificacaoStatusCancelamento value for this Hotel.
     * 
     * @param dataModificacaoStatusCancelamento
     */
    public void setDataModificacaoStatusCancelamento(java.util.Calendar dataModificacaoStatusCancelamento) {
        this.dataModificacaoStatusCancelamento = dataModificacaoStatusCancelamento;
    }


    /**
     * Gets the usuarioModificouStatusCancelamento value for this Hotel.
     * 
     * @return usuarioModificouStatusCancelamento
     */
    public java.lang.Integer getUsuarioModificouStatusCancelamento() {
        return usuarioModificouStatusCancelamento;
    }


    /**
     * Sets the usuarioModificouStatusCancelamento value for this Hotel.
     * 
     * @param usuarioModificouStatusCancelamento
     */
    public void setUsuarioModificouStatusCancelamento(java.lang.Integer usuarioModificouStatusCancelamento) {
        this.usuarioModificouStatusCancelamento = usuarioModificouStatusCancelamento;
    }


    /**
     * Gets the categoriaApartamento value for this Hotel.
     * 
     * @return categoriaApartamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.CategoriaApartamento getCategoriaApartamento() {
        return categoriaApartamento;
    }


    /**
     * Sets the categoriaApartamento value for this Hotel.
     * 
     * @param categoriaApartamento
     */
    public void setCategoriaApartamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.CategoriaApartamento categoriaApartamento) {
        this.categoriaApartamento = categoriaApartamento;
    }


    /**
     * Gets the nomeEmissor value for this Hotel.
     * 
     * @return nomeEmissor
     */
    public java.lang.String getNomeEmissor() {
        return nomeEmissor;
    }


    /**
     * Sets the nomeEmissor value for this Hotel.
     * 
     * @param nomeEmissor
     */
    public void setNomeEmissor(java.lang.String nomeEmissor) {
        this.nomeEmissor = nomeEmissor;
    }


    /**
     * Gets the garantiaNoShow value for this Hotel.
     * 
     * @return garantiaNoShow
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.GarantiaNoShow getGarantiaNoShow() {
        return garantiaNoShow;
    }


    /**
     * Sets the garantiaNoShow value for this Hotel.
     * 
     * @param garantiaNoShow
     */
    public void setGarantiaNoShow(br.com.lemontech.selfbooking.wsselfbooking.beans.types.GarantiaNoShow garantiaNoShow) {
        this.garantiaNoShow = garantiaNoShow;
    }


    /**
     * Gets the titularCartaoNoShow value for this Hotel.
     * 
     * @return titularCartaoNoShow
     */
    public java.lang.String getTitularCartaoNoShow() {
        return titularCartaoNoShow;
    }


    /**
     * Sets the titularCartaoNoShow value for this Hotel.
     * 
     * @param titularCartaoNoShow
     */
    public void setTitularCartaoNoShow(java.lang.String titularCartaoNoShow) {
        this.titularCartaoNoShow = titularCartaoNoShow;
    }


    /**
     * Gets the cartaoVirtualNoShow value for this Hotel.
     * 
     * @return cartaoVirtualNoShow
     */
    public java.lang.Boolean getCartaoVirtualNoShow() {
        return cartaoVirtualNoShow;
    }


    /**
     * Sets the cartaoVirtualNoShow value for this Hotel.
     * 
     * @param cartaoVirtualNoShow
     */
    public void setCartaoVirtualNoShow(java.lang.Boolean cartaoVirtualNoShow) {
        this.cartaoVirtualNoShow = cartaoVirtualNoShow;
    }


    /**
     * Gets the formaPagamentoGarantiaNoShow value for this Hotel.
     * 
     * @return formaPagamentoGarantiaNoShow
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento getFormaPagamentoGarantiaNoShow() {
        return formaPagamentoGarantiaNoShow;
    }


    /**
     * Sets the formaPagamentoGarantiaNoShow value for this Hotel.
     * 
     * @param formaPagamentoGarantiaNoShow
     */
    public void setFormaPagamentoGarantiaNoShow(br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamentoGarantiaNoShow) {
        this.formaPagamentoGarantiaNoShow = formaPagamentoGarantiaNoShow;
    }


    /**
     * Gets the itensFaturamentoHotel value for this Hotel.
     * 
     * @return itensFaturamentoHotel
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.ItenFaturamento[] getItensFaturamentoHotel() {
        return itensFaturamentoHotel;
    }


    /**
     * Sets the itensFaturamentoHotel value for this Hotel.
     * 
     * @param itensFaturamentoHotel
     */
    public void setItensFaturamentoHotel(br.com.lemontech.selfbooking.wsselfbooking.beans.types.ItenFaturamento[] itensFaturamentoHotel) {
        this.itensFaturamentoHotel = itensFaturamentoHotel;
    }


    /**
     * Gets the totalHotel value for this Hotel.
     * 
     * @return totalHotel
     */
    public java.lang.Double getTotalHotel() {
        return totalHotel;
    }


    /**
     * Sets the totalHotel value for this Hotel.
     * 
     * @param totalHotel
     */
    public void setTotalHotel(java.lang.Double totalHotel) {
        this.totalHotel = totalHotel;
    }


    /**
     * Gets the cancelado value for this Hotel.
     * 
     * @return cancelado
     */
    public boolean isCancelado() {
        return cancelado;
    }


    /**
     * Sets the cancelado value for this Hotel.
     * 
     * @param cancelado
     */
    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }


    /**
     * Gets the identificadoresIntegracao value for this Hotel.
     * 
     * @return identificadoresIntegracao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] getIdentificadoresIntegracao() {
        return identificadoresIntegracao;
    }


    /**
     * Sets the identificadoresIntegracao value for this Hotel.
     * 
     * @param identificadoresIntegracao
     */
    public void setIdentificadoresIntegracao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao) {
        this.identificadoresIntegracao = identificadoresIntegracao;
    }


    /**
     * Gets the taxaFee value for this Hotel.
     * 
     * @return taxaFee
     */
    public java.lang.Double getTaxaFee() {
        return taxaFee;
    }


    /**
     * Sets the taxaFee value for this Hotel.
     * 
     * @param taxaFee
     */
    public void setTaxaFee(java.lang.Double taxaFee) {
        this.taxaFee = taxaFee;
    }


    /**
     * Gets the selfbook value for this Hotel.
     * 
     * @return selfbook
     */
    public boolean isSelfbook() {
        return selfbook;
    }


    /**
     * Sets the selfbook value for this Hotel.
     * 
     * @param selfbook
     */
    public void setSelfbook(boolean selfbook) {
        this.selfbook = selfbook;
    }


    /**
     * Gets the tarifaComissionada value for this Hotel.
     * 
     * @return tarifaComissionada
     */
    public boolean isTarifaComissionada() {
        return tarifaComissionada;
    }


    /**
     * Sets the tarifaComissionada value for this Hotel.
     * 
     * @param tarifaComissionada
     */
    public void setTarifaComissionada(boolean tarifaComissionada) {
        this.tarifaComissionada = tarifaComissionada;
    }


    /**
     * Gets the regime value for this Hotel.
     * 
     * @return regime
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Regime getRegime() {
        return regime;
    }


    /**
     * Sets the regime value for this Hotel.
     * 
     * @param regime
     */
    public void setRegime(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Regime regime) {
        this.regime = regime;
    }


    /**
     * Gets the tipoTarifa value for this Hotel.
     * 
     * @return tipoTarifa
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoTarifa getTipoTarifa() {
        return tipoTarifa;
    }


    /**
     * Sets the tipoTarifa value for this Hotel.
     * 
     * @param tipoTarifa
     */
    public void setTipoTarifa(br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoTarifa tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }


    /**
     * Gets the quantidadeTipoTarifa value for this Hotel.
     * 
     * @return quantidadeTipoTarifa
     */
    public java.lang.Integer getQuantidadeTipoTarifa() {
        return quantidadeTipoTarifa;
    }


    /**
     * Sets the quantidadeTipoTarifa value for this Hotel.
     * 
     * @param quantidadeTipoTarifa
     */
    public void setQuantidadeTipoTarifa(java.lang.Integer quantidadeTipoTarifa) {
        this.quantidadeTipoTarifa = quantidadeTipoTarifa;
    }


    /**
     * Gets the tarifa value for this Hotel.
     * 
     * @return tarifa
     */
    public java.lang.Double getTarifa() {
        return tarifa;
    }


    /**
     * Sets the tarifa value for this Hotel.
     * 
     * @param tarifa
     */
    public void setTarifa(java.lang.Double tarifa) {
        this.tarifa = tarifa;
    }


    /**
     * Gets the valorCambio value for this Hotel.
     * 
     * @return valorCambio
     */
    public java.lang.Double getValorCambio() {
        return valorCambio;
    }


    /**
     * Sets the valorCambio value for this Hotel.
     * 
     * @param valorCambio
     */
    public void setValorCambio(java.lang.Double valorCambio) {
        this.valorCambio = valorCambio;
    }


    /**
     * Gets the earlyCheckin value for this Hotel.
     * 
     * @return earlyCheckin
     */
    public java.lang.Double getEarlyCheckin() {
        return earlyCheckin;
    }


    /**
     * Sets the earlyCheckin value for this Hotel.
     * 
     * @param earlyCheckin
     */
    public void setEarlyCheckin(java.lang.Double earlyCheckin) {
        this.earlyCheckin = earlyCheckin;
    }


    /**
     * Gets the lateCheckout value for this Hotel.
     * 
     * @return lateCheckout
     */
    public java.lang.Double getLateCheckout() {
        return lateCheckout;
    }


    /**
     * Sets the lateCheckout value for this Hotel.
     * 
     * @param lateCheckout
     */
    public void setLateCheckout(java.lang.Double lateCheckout) {
        this.lateCheckout = lateCheckout;
    }


    /**
     * Gets the planoAlimentar value for this Hotel.
     * 
     * @return planoAlimentar
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.PlanoAlimentar getPlanoAlimentar() {
        return planoAlimentar;
    }


    /**
     * Sets the planoAlimentar value for this Hotel.
     * 
     * @param planoAlimentar
     */
    public void setPlanoAlimentar(br.com.lemontech.selfbooking.wsselfbooking.beans.types.PlanoAlimentar planoAlimentar) {
        this.planoAlimentar = planoAlimentar;
    }


    /**
     * Gets the quantidadePlanoAlimentar value for this Hotel.
     * 
     * @return quantidadePlanoAlimentar
     */
    public java.lang.Integer getQuantidadePlanoAlimentar() {
        return quantidadePlanoAlimentar;
    }


    /**
     * Sets the quantidadePlanoAlimentar value for this Hotel.
     * 
     * @param quantidadePlanoAlimentar
     */
    public void setQuantidadePlanoAlimentar(java.lang.Integer quantidadePlanoAlimentar) {
        this.quantidadePlanoAlimentar = quantidadePlanoAlimentar;
    }


    /**
     * Gets the valorPlanoAlimentar value for this Hotel.
     * 
     * @return valorPlanoAlimentar
     */
    public java.lang.Double getValorPlanoAlimentar() {
        return valorPlanoAlimentar;
    }


    /**
     * Sets the valorPlanoAlimentar value for this Hotel.
     * 
     * @param valorPlanoAlimentar
     */
    public void setValorPlanoAlimentar(java.lang.Double valorPlanoAlimentar) {
        this.valorPlanoAlimentar = valorPlanoAlimentar;
    }


    /**
     * Gets the prazoCancelamento value for this Hotel.
     * 
     * @return prazoCancelamento
     */
    public java.util.Calendar getPrazoCancelamento() {
        return prazoCancelamento;
    }


    /**
     * Sets the prazoCancelamento value for this Hotel.
     * 
     * @param prazoCancelamento
     */
    public void setPrazoCancelamento(java.util.Calendar prazoCancelamento) {
        this.prazoCancelamento = prazoCancelamento;
    }


    /**
     * Gets the consolidadora value for this Hotel.
     * 
     * @return consolidadora
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora getConsolidadora() {
        return consolidadora;
    }


    /**
     * Sets the consolidadora value for this Hotel.
     * 
     * @param consolidadora
     */
    public void setConsolidadora(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora) {
        this.consolidadora = consolidadora;
    }


    /**
     * Gets the online value for this Hotel.
     * 
     * @return online
     */
    public boolean isOnline() {
        return online;
    }


    /**
     * Sets the online value for this Hotel.
     * 
     * @param online
     */
    public void setOnline(boolean online) {
        this.online = online;
    }


    /**
     * Gets the dataConfirmacaoReserva value for this Hotel.
     * 
     * @return dataConfirmacaoReserva
     */
    public java.util.Calendar getDataConfirmacaoReserva() {
        return dataConfirmacaoReserva;
    }


    /**
     * Sets the dataConfirmacaoReserva value for this Hotel.
     * 
     * @param dataConfirmacaoReserva
     */
    public void setDataConfirmacaoReserva(java.util.Calendar dataConfirmacaoReserva) {
        this.dataConfirmacaoReserva = dataConfirmacaoReserva;
    }


    /**
     * Gets the moedaBase value for this Hotel.
     * 
     * @return moedaBase
     */
    public java.lang.String getMoedaBase() {
        return moedaBase;
    }


    /**
     * Sets the moedaBase value for this Hotel.
     * 
     * @param moedaBase
     */
    public void setMoedaBase(java.lang.String moedaBase) {
        this.moedaBase = moedaBase;
    }


    /**
     * Gets the diariaBase value for this Hotel.
     * 
     * @return diariaBase
     */
    public java.lang.Double getDiariaBase() {
        return diariaBase;
    }


    /**
     * Sets the diariaBase value for this Hotel.
     * 
     * @param diariaBase
     */
    public void setDiariaBase(java.lang.Double diariaBase) {
        this.diariaBase = diariaBase;
    }


    /**
     * Gets the taxaBase value for this Hotel.
     * 
     * @return taxaBase
     */
    public java.lang.Double getTaxaBase() {
        return taxaBase;
    }


    /**
     * Sets the taxaBase value for this Hotel.
     * 
     * @param taxaBase
     */
    public void setTaxaBase(java.lang.Double taxaBase) {
        this.taxaBase = taxaBase;
    }


    /**
     * Gets the earlyCheckinBase value for this Hotel.
     * 
     * @return earlyCheckinBase
     */
    public java.lang.Double getEarlyCheckinBase() {
        return earlyCheckinBase;
    }


    /**
     * Sets the earlyCheckinBase value for this Hotel.
     * 
     * @param earlyCheckinBase
     */
    public void setEarlyCheckinBase(java.lang.Double earlyCheckinBase) {
        this.earlyCheckinBase = earlyCheckinBase;
    }


    /**
     * Gets the lateCheckoutBase value for this Hotel.
     * 
     * @return lateCheckoutBase
     */
    public java.lang.Double getLateCheckoutBase() {
        return lateCheckoutBase;
    }


    /**
     * Sets the lateCheckoutBase value for this Hotel.
     * 
     * @param lateCheckoutBase
     */
    public void setLateCheckoutBase(java.lang.Double lateCheckoutBase) {
        this.lateCheckoutBase = lateCheckoutBase;
    }


    /**
     * Gets the agenteOnline value for this Hotel.
     * 
     * @return agenteOnline
     */
    public boolean isAgenteOnline() {
        return agenteOnline;
    }


    /**
     * Sets the agenteOnline value for this Hotel.
     * 
     * @param agenteOnline
     */
    public void setAgenteOnline(boolean agenteOnline) {
        this.agenteOnline = agenteOnline;
    }


    /**
     * Gets the importado value for this Hotel.
     * 
     * @return importado
     */
    public boolean isImportado() {
        return importado;
    }


    /**
     * Sets the importado value for this Hotel.
     * 
     * @param importado
     */
    public void setImportado(boolean importado) {
        this.importado = importado;
    }


    /**
     * Gets the telefone value for this Hotel.
     * 
     * @return telefone
     */
    public java.lang.String getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this Hotel.
     * 
     * @param telefone
     */
    public void setTelefone(java.lang.String telefone) {
        this.telefone = telefone;
    }


    /**
     * Gets the pais value for this Hotel.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this Hotel.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the estado value for this Hotel.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Hotel.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the pontoVenda value for this Hotel.
     * 
     * @return pontoVenda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento getPontoVenda() {
        return pontoVenda;
    }


    /**
     * Sets the pontoVenda value for this Hotel.
     * 
     * @param pontoVenda
     */
    public void setPontoVenda(br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda) {
        this.pontoVenda = pontoVenda;
    }


    /**
     * Gets the emailEmissor value for this Hotel.
     * 
     * @return emailEmissor
     */
    public java.lang.String getEmailEmissor() {
        return emailEmissor;
    }


    /**
     * Sets the emailEmissor value for this Hotel.
     * 
     * @param emailEmissor
     */
    public void setEmailEmissor(java.lang.String emailEmissor) {
        this.emailEmissor = emailEmissor;
    }


    /**
     * Gets the iataCidade value for this Hotel.
     * 
     * @return iataCidade
     */
    public java.lang.String getIataCidade() {
        return iataCidade;
    }


    /**
     * Sets the iataCidade value for this Hotel.
     * 
     * @param iataCidade
     */
    public void setIataCidade(java.lang.String iataCidade) {
        this.iataCidade = iataCidade;
    }


    /**
     * Gets the localizadorPreTrip value for this Hotel.
     * 
     * @return localizadorPreTrip
     */
    public java.lang.String getLocalizadorPreTrip() {
        return localizadorPreTrip;
    }


    /**
     * Sets the localizadorPreTrip value for this Hotel.
     * 
     * @param localizadorPreTrip
     */
    public void setLocalizadorPreTrip(java.lang.String localizadorPreTrip) {
        this.localizadorPreTrip = localizadorPreTrip;
    }


    /**
     * Gets the identificadorUnidadeOperacional value for this Hotel.
     * 
     * @return identificadorUnidadeOperacional
     */
    public int getIdentificadorUnidadeOperacional() {
        return identificadorUnidadeOperacional;
    }


    /**
     * Sets the identificadorUnidadeOperacional value for this Hotel.
     * 
     * @param identificadorUnidadeOperacional
     */
    public void setIdentificadorUnidadeOperacional(int identificadorUnidadeOperacional) {
        this.identificadorUnidadeOperacional = identificadorUnidadeOperacional;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Hotel)) return false;
        Hotel other = (Hotel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.codigoApartamento==null && other.getCodigoApartamento()==null) || 
             (this.codigoApartamento!=null &&
              this.codigoApartamento.equals(other.getCodigoApartamento()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.tipoApartamento==null && other.getTipoApartamento()==null) || 
             (this.tipoApartamento!=null &&
              this.tipoApartamento.equals(other.getTipoApartamento()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.codigoHotelSource==null && other.getCodigoHotelSource()==null) || 
             (this.codigoHotelSource!=null &&
              this.codigoHotelSource.equals(other.getCodigoHotelSource()))) &&
            ((this.checkIn==null && other.getCheckIn()==null) || 
             (this.checkIn!=null &&
              this.checkIn.equals(other.getCheckIn()))) &&
            ((this.checkOut==null && other.getCheckOut()==null) || 
             (this.checkOut!=null &&
              this.checkOut.equals(other.getCheckOut()))) &&
            ((this.idRegime==null && other.getIdRegime()==null) || 
             (this.idRegime!=null &&
              java.util.Arrays.equals(this.idRegime, other.getIdRegime()))) &&
            ((this.idCategApto==null && other.getIdCategApto()==null) || 
             (this.idCategApto!=null &&
              java.util.Arrays.equals(this.idCategApto, other.getIdCategApto()))) &&
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
            ((this.dataReserva==null && other.getDataReserva()==null) || 
             (this.dataReserva!=null &&
              this.dataReserva.equals(other.getDataReserva()))) &&
            ((this.moeda==null && other.getMoeda()==null) || 
             (this.moeda!=null &&
              this.moeda.equals(other.getMoeda()))) &&
            ((this.diaria==null && other.getDiaria()==null) || 
             (this.diaria!=null &&
              this.diaria.equals(other.getDiaria()))) &&
            ((this.taxa==null && other.getTaxa()==null) || 
             (this.taxa!=null &&
              this.taxa.equals(other.getTaxa()))) &&
            ((this.titularCartao==null && other.getTitularCartao()==null) || 
             (this.titularCartao!=null &&
              this.titularCartao.equals(other.getTitularCartao()))) &&
            ((this.cartaoVirtual==null && other.getCartaoVirtual()==null) || 
             (this.cartaoVirtual!=null &&
              this.cartaoVirtual.equals(other.getCartaoVirtual()))) &&
            ((this.formaPagamento==null && other.getFormaPagamento()==null) || 
             (this.formaPagamento!=null &&
              this.formaPagamento.equals(other.getFormaPagamento()))) &&
            ((this.idPassageiroRef==null && other.getIdPassageiroRef()==null) || 
             (this.idPassageiroRef!=null &&
              java.util.Arrays.equals(this.idPassageiroRef, other.getIdPassageiroRef()))) &&
            ((this.justificativaMaiorTarifa==null && other.getJustificativaMaiorTarifa()==null) || 
             (this.justificativaMaiorTarifa!=null &&
              this.justificativaMaiorTarifa.equals(other.getJustificativaMaiorTarifa()))) &&
            ((this.local==null && other.getLocal()==null) || 
             (this.local!=null &&
              this.local.equals(other.getLocal()))) &&
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
            ((this.categoriaApartamento==null && other.getCategoriaApartamento()==null) || 
             (this.categoriaApartamento!=null &&
              this.categoriaApartamento.equals(other.getCategoriaApartamento()))) &&
            ((this.nomeEmissor==null && other.getNomeEmissor()==null) || 
             (this.nomeEmissor!=null &&
              this.nomeEmissor.equals(other.getNomeEmissor()))) &&
            ((this.garantiaNoShow==null && other.getGarantiaNoShow()==null) || 
             (this.garantiaNoShow!=null &&
              this.garantiaNoShow.equals(other.getGarantiaNoShow()))) &&
            ((this.titularCartaoNoShow==null && other.getTitularCartaoNoShow()==null) || 
             (this.titularCartaoNoShow!=null &&
              this.titularCartaoNoShow.equals(other.getTitularCartaoNoShow()))) &&
            ((this.cartaoVirtualNoShow==null && other.getCartaoVirtualNoShow()==null) || 
             (this.cartaoVirtualNoShow!=null &&
              this.cartaoVirtualNoShow.equals(other.getCartaoVirtualNoShow()))) &&
            ((this.formaPagamentoGarantiaNoShow==null && other.getFormaPagamentoGarantiaNoShow()==null) || 
             (this.formaPagamentoGarantiaNoShow!=null &&
              this.formaPagamentoGarantiaNoShow.equals(other.getFormaPagamentoGarantiaNoShow()))) &&
            ((this.itensFaturamentoHotel==null && other.getItensFaturamentoHotel()==null) || 
             (this.itensFaturamentoHotel!=null &&
              java.util.Arrays.equals(this.itensFaturamentoHotel, other.getItensFaturamentoHotel()))) &&
            ((this.totalHotel==null && other.getTotalHotel()==null) || 
             (this.totalHotel!=null &&
              this.totalHotel.equals(other.getTotalHotel()))) &&
            this.cancelado == other.isCancelado() &&
            ((this.identificadoresIntegracao==null && other.getIdentificadoresIntegracao()==null) || 
             (this.identificadoresIntegracao!=null &&
              java.util.Arrays.equals(this.identificadoresIntegracao, other.getIdentificadoresIntegracao()))) &&
            ((this.taxaFee==null && other.getTaxaFee()==null) || 
             (this.taxaFee!=null &&
              this.taxaFee.equals(other.getTaxaFee()))) &&
            this.selfbook == other.isSelfbook() &&
            this.tarifaComissionada == other.isTarifaComissionada() &&
            ((this.regime==null && other.getRegime()==null) || 
             (this.regime!=null &&
              this.regime.equals(other.getRegime()))) &&
            ((this.tipoTarifa==null && other.getTipoTarifa()==null) || 
             (this.tipoTarifa!=null &&
              this.tipoTarifa.equals(other.getTipoTarifa()))) &&
            ((this.quantidadeTipoTarifa==null && other.getQuantidadeTipoTarifa()==null) || 
             (this.quantidadeTipoTarifa!=null &&
              this.quantidadeTipoTarifa.equals(other.getQuantidadeTipoTarifa()))) &&
            ((this.tarifa==null && other.getTarifa()==null) || 
             (this.tarifa!=null &&
              this.tarifa.equals(other.getTarifa()))) &&
            ((this.valorCambio==null && other.getValorCambio()==null) || 
             (this.valorCambio!=null &&
              this.valorCambio.equals(other.getValorCambio()))) &&
            ((this.earlyCheckin==null && other.getEarlyCheckin()==null) || 
             (this.earlyCheckin!=null &&
              this.earlyCheckin.equals(other.getEarlyCheckin()))) &&
            ((this.lateCheckout==null && other.getLateCheckout()==null) || 
             (this.lateCheckout!=null &&
              this.lateCheckout.equals(other.getLateCheckout()))) &&
            ((this.planoAlimentar==null && other.getPlanoAlimentar()==null) || 
             (this.planoAlimentar!=null &&
              this.planoAlimentar.equals(other.getPlanoAlimentar()))) &&
            ((this.quantidadePlanoAlimentar==null && other.getQuantidadePlanoAlimentar()==null) || 
             (this.quantidadePlanoAlimentar!=null &&
              this.quantidadePlanoAlimentar.equals(other.getQuantidadePlanoAlimentar()))) &&
            ((this.valorPlanoAlimentar==null && other.getValorPlanoAlimentar()==null) || 
             (this.valorPlanoAlimentar!=null &&
              this.valorPlanoAlimentar.equals(other.getValorPlanoAlimentar()))) &&
            ((this.prazoCancelamento==null && other.getPrazoCancelamento()==null) || 
             (this.prazoCancelamento!=null &&
              this.prazoCancelamento.equals(other.getPrazoCancelamento()))) &&
            ((this.consolidadora==null && other.getConsolidadora()==null) || 
             (this.consolidadora!=null &&
              this.consolidadora.equals(other.getConsolidadora()))) &&
            this.online == other.isOnline() &&
            ((this.dataConfirmacaoReserva==null && other.getDataConfirmacaoReserva()==null) || 
             (this.dataConfirmacaoReserva!=null &&
              this.dataConfirmacaoReserva.equals(other.getDataConfirmacaoReserva()))) &&
            ((this.moedaBase==null && other.getMoedaBase()==null) || 
             (this.moedaBase!=null &&
              this.moedaBase.equals(other.getMoedaBase()))) &&
            ((this.diariaBase==null && other.getDiariaBase()==null) || 
             (this.diariaBase!=null &&
              this.diariaBase.equals(other.getDiariaBase()))) &&
            ((this.taxaBase==null && other.getTaxaBase()==null) || 
             (this.taxaBase!=null &&
              this.taxaBase.equals(other.getTaxaBase()))) &&
            ((this.earlyCheckinBase==null && other.getEarlyCheckinBase()==null) || 
             (this.earlyCheckinBase!=null &&
              this.earlyCheckinBase.equals(other.getEarlyCheckinBase()))) &&
            ((this.lateCheckoutBase==null && other.getLateCheckoutBase()==null) || 
             (this.lateCheckoutBase!=null &&
              this.lateCheckoutBase.equals(other.getLateCheckoutBase()))) &&
            this.agenteOnline == other.isAgenteOnline() &&
            this.importado == other.isImportado() &&
            ((this.telefone==null && other.getTelefone()==null) || 
             (this.telefone!=null &&
              this.telefone.equals(other.getTelefone()))) &&
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.pontoVenda==null && other.getPontoVenda()==null) || 
             (this.pontoVenda!=null &&
              this.pontoVenda.equals(other.getPontoVenda()))) &&
            ((this.emailEmissor==null && other.getEmailEmissor()==null) || 
             (this.emailEmissor!=null &&
              this.emailEmissor.equals(other.getEmailEmissor()))) &&
            ((this.iataCidade==null && other.getIataCidade()==null) || 
             (this.iataCidade!=null &&
              this.iataCidade.equals(other.getIataCidade()))) &&
            ((this.localizadorPreTrip==null && other.getLocalizadorPreTrip()==null) || 
             (this.localizadorPreTrip!=null &&
              this.localizadorPreTrip.equals(other.getLocalizadorPreTrip()))) &&
            this.identificadorUnidadeOperacional == other.getIdentificadorUnidadeOperacional();
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
        if (getCodigoApartamento() != null) {
            _hashCode += getCodigoApartamento().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getTipoApartamento() != null) {
            _hashCode += getTipoApartamento().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getCodigoHotelSource() != null) {
            _hashCode += getCodigoHotelSource().hashCode();
        }
        if (getCheckIn() != null) {
            _hashCode += getCheckIn().hashCode();
        }
        if (getCheckOut() != null) {
            _hashCode += getCheckOut().hashCode();
        }
        if (getIdRegime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdRegime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdRegime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdCategApto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdCategApto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdCategApto(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getDataReserva() != null) {
            _hashCode += getDataReserva().hashCode();
        }
        if (getMoeda() != null) {
            _hashCode += getMoeda().hashCode();
        }
        if (getDiaria() != null) {
            _hashCode += getDiaria().hashCode();
        }
        if (getTaxa() != null) {
            _hashCode += getTaxa().hashCode();
        }
        if (getTitularCartao() != null) {
            _hashCode += getTitularCartao().hashCode();
        }
        if (getCartaoVirtual() != null) {
            _hashCode += getCartaoVirtual().hashCode();
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
        if (getLocal() != null) {
            _hashCode += getLocal().hashCode();
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
        if (getCategoriaApartamento() != null) {
            _hashCode += getCategoriaApartamento().hashCode();
        }
        if (getNomeEmissor() != null) {
            _hashCode += getNomeEmissor().hashCode();
        }
        if (getGarantiaNoShow() != null) {
            _hashCode += getGarantiaNoShow().hashCode();
        }
        if (getTitularCartaoNoShow() != null) {
            _hashCode += getTitularCartaoNoShow().hashCode();
        }
        if (getCartaoVirtualNoShow() != null) {
            _hashCode += getCartaoVirtualNoShow().hashCode();
        }
        if (getFormaPagamentoGarantiaNoShow() != null) {
            _hashCode += getFormaPagamentoGarantiaNoShow().hashCode();
        }
        if (getItensFaturamentoHotel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItensFaturamentoHotel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItensFaturamentoHotel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalHotel() != null) {
            _hashCode += getTotalHotel().hashCode();
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
        _hashCode += (isTarifaComissionada() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRegime() != null) {
            _hashCode += getRegime().hashCode();
        }
        if (getTipoTarifa() != null) {
            _hashCode += getTipoTarifa().hashCode();
        }
        if (getQuantidadeTipoTarifa() != null) {
            _hashCode += getQuantidadeTipoTarifa().hashCode();
        }
        if (getTarifa() != null) {
            _hashCode += getTarifa().hashCode();
        }
        if (getValorCambio() != null) {
            _hashCode += getValorCambio().hashCode();
        }
        if (getEarlyCheckin() != null) {
            _hashCode += getEarlyCheckin().hashCode();
        }
        if (getLateCheckout() != null) {
            _hashCode += getLateCheckout().hashCode();
        }
        if (getPlanoAlimentar() != null) {
            _hashCode += getPlanoAlimentar().hashCode();
        }
        if (getQuantidadePlanoAlimentar() != null) {
            _hashCode += getQuantidadePlanoAlimentar().hashCode();
        }
        if (getValorPlanoAlimentar() != null) {
            _hashCode += getValorPlanoAlimentar().hashCode();
        }
        if (getPrazoCancelamento() != null) {
            _hashCode += getPrazoCancelamento().hashCode();
        }
        if (getConsolidadora() != null) {
            _hashCode += getConsolidadora().hashCode();
        }
        _hashCode += (isOnline() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDataConfirmacaoReserva() != null) {
            _hashCode += getDataConfirmacaoReserva().hashCode();
        }
        if (getMoedaBase() != null) {
            _hashCode += getMoedaBase().hashCode();
        }
        if (getDiariaBase() != null) {
            _hashCode += getDiariaBase().hashCode();
        }
        if (getTaxaBase() != null) {
            _hashCode += getTaxaBase().hashCode();
        }
        if (getEarlyCheckinBase() != null) {
            _hashCode += getEarlyCheckinBase().hashCode();
        }
        if (getLateCheckoutBase() != null) {
            _hashCode += getLateCheckoutBase().hashCode();
        }
        _hashCode += (isAgenteOnline() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isImportado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTelefone() != null) {
            _hashCode += getTelefone().hashCode();
        }
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getPontoVenda() != null) {
            _hashCode += getPontoVenda().hashCode();
        }
        if (getEmailEmissor() != null) {
            _hashCode += getEmailEmissor().hashCode();
        }
        if (getIataCidade() != null) {
            _hashCode += getIataCidade().hashCode();
        }
        if (getLocalizadorPreTrip() != null) {
            _hashCode += getLocalizadorPreTrip().hashCode();
        }
        _hashCode += getIdentificadorUnidadeOperacional();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Hotel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/hotel", "hotel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoApartamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoApartamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("tipoApartamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoApartamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoApartamento"));
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
        elemField.setFieldName("codigoHotelSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoHotelSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRegime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idRegime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCategApto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCategApto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("dataReserva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataReserva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("titularCartao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titularCartao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartaoVirtual");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cartaoVirtual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("local");
        elemField.setXmlName(new javax.xml.namespace.QName("", "local"));
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
        elemField.setFieldName("categoriaApartamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoriaApartamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "categoriaApartamento"));
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
        elemField.setFieldName("garantiaNoShow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "garantiaNoShow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "garantiaNoShow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titularCartaoNoShow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titularCartaoNoShow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartaoVirtualNoShow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cartaoVirtualNoShow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaPagamentoGarantiaNoShow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formaPagamentoGarantiaNoShow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "formaPagamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itensFaturamentoHotel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itensFaturamentoHotel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "itenFaturamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "itenFaturamento"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalHotel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalHotel"));
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
        elemField.setFieldName("tarifaComissionada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifaComissionada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "regime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoTarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoTarifa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidadeTipoTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantidadeTipoTarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorCambio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorCambio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earlyCheckin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "earlyCheckin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lateCheckout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lateCheckout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planoAlimentar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planoAlimentar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "planoAlimentar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidadePlanoAlimentar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantidadePlanoAlimentar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorPlanoAlimentar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorPlanoAlimentar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prazoCancelamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prazoCancelamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("online");
        elemField.setXmlName(new javax.xml.namespace.QName("", "online"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataConfirmacaoReserva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataConfirmacaoReserva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moedaBase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moedaBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diariaBase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diariaBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxaBase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxaBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earlyCheckinBase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "earlyCheckinBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lateCheckoutBase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lateCheckoutBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agenteOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agenteOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorUnidadeOperacional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificadorUnidadeOperacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
