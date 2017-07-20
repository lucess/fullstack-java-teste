/**
 * Aereo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

public class Aereo  implements java.io.Serializable {
    private int id;

    private java.lang.String localizador;

    private java.lang.Boolean localizadorGds;

    private java.lang.String source;

    private java.lang.String codigoEmissor;

    private java.lang.String nomeEmissor;

    private java.lang.String emailEmissor;

    private java.lang.String codigoReservador;

    private java.lang.String nomeReservador;

    private java.util.Calendar dataVencimento;

    private java.util.Calendar dataEmissao;

    private java.util.Calendar dataReserva;

    private java.lang.Double menorTarifa;

    private java.lang.Double maiorTarifa;

    private java.lang.String ciaMenorTarifa;

    private java.lang.String codigoFornecedor;

    private java.lang.Integer[] idPassageiroRef;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoTarifa aereoTarifa;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento[] aereoSeguimento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento[] formaPagamento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoBilhete[] aereoBilhete;

    private boolean selfbook;

    private java.lang.String justificativaMaiorTarifa;

    private java.lang.Boolean canceladoEmitido;

    private java.lang.Boolean nacional;

    private java.lang.String codigoJustificativaMaiorTarifa;

    private java.lang.String observacao;

    private java.lang.String tipoVoo;

    private java.lang.String identificadorIntegracao;

    private java.lang.String identificadorBackOfficeTipoProduto;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks;

    private java.lang.Integer statusCancelamento;

    private java.lang.Double valorMulta;

    private java.lang.Double valorReembolso;

    private java.util.Calendar dataModificacaoStatusCancelamento;

    private java.lang.Integer usuarioModificouStatusCancelamento;

    private java.lang.Double totalAereo;

    private boolean cancelado;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Reemissao reemissao;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora;

    private boolean autoEmissao;

    private boolean importado;

    private boolean online;

    private java.lang.String complementoJustificativaMaiorTarifa;

    private boolean agenteOnline;

    private boolean opcaoRota;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda;

    private java.lang.String localizadorPreTripGds;

    public Aereo() {
    }

    public Aereo(
           int id,
           java.lang.String localizador,
           java.lang.Boolean localizadorGds,
           java.lang.String source,
           java.lang.String codigoEmissor,
           java.lang.String nomeEmissor,
           java.lang.String emailEmissor,
           java.lang.String codigoReservador,
           java.lang.String nomeReservador,
           java.util.Calendar dataVencimento,
           java.util.Calendar dataEmissao,
           java.util.Calendar dataReserva,
           java.lang.Double menorTarifa,
           java.lang.Double maiorTarifa,
           java.lang.String ciaMenorTarifa,
           java.lang.String codigoFornecedor,
           java.lang.Integer[] idPassageiroRef,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoTarifa aereoTarifa,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento[] aereoSeguimento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento[] formaPagamento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoBilhete[] aereoBilhete,
           boolean selfbook,
           java.lang.String justificativaMaiorTarifa,
           java.lang.Boolean canceladoEmitido,
           java.lang.Boolean nacional,
           java.lang.String codigoJustificativaMaiorTarifa,
           java.lang.String observacao,
           java.lang.String tipoVoo,
           java.lang.String identificadorIntegracao,
           java.lang.String identificadorBackOfficeTipoProduto,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks,
           java.lang.Integer statusCancelamento,
           java.lang.Double valorMulta,
           java.lang.Double valorReembolso,
           java.util.Calendar dataModificacaoStatusCancelamento,
           java.lang.Integer usuarioModificouStatusCancelamento,
           java.lang.Double totalAereo,
           boolean cancelado,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Reemissao reemissao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora,
           boolean autoEmissao,
           boolean importado,
           boolean online,
           java.lang.String complementoJustificativaMaiorTarifa,
           boolean agenteOnline,
           boolean opcaoRota,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda,
           java.lang.String localizadorPreTripGds) {
           this.id = id;
           this.localizador = localizador;
           this.localizadorGds = localizadorGds;
           this.source = source;
           this.codigoEmissor = codigoEmissor;
           this.nomeEmissor = nomeEmissor;
           this.emailEmissor = emailEmissor;
           this.codigoReservador = codigoReservador;
           this.nomeReservador = nomeReservador;
           this.dataVencimento = dataVencimento;
           this.dataEmissao = dataEmissao;
           this.dataReserva = dataReserva;
           this.menorTarifa = menorTarifa;
           this.maiorTarifa = maiorTarifa;
           this.ciaMenorTarifa = ciaMenorTarifa;
           this.codigoFornecedor = codigoFornecedor;
           this.idPassageiroRef = idPassageiroRef;
           this.aereoTarifa = aereoTarifa;
           this.aereoSeguimento = aereoSeguimento;
           this.formaPagamento = formaPagamento;
           this.aereoBilhete = aereoBilhete;
           this.selfbook = selfbook;
           this.justificativaMaiorTarifa = justificativaMaiorTarifa;
           this.canceladoEmitido = canceladoEmitido;
           this.nacional = nacional;
           this.codigoJustificativaMaiorTarifa = codigoJustificativaMaiorTarifa;
           this.observacao = observacao;
           this.tipoVoo = tipoVoo;
           this.identificadorIntegracao = identificadorIntegracao;
           this.identificadorBackOfficeTipoProduto = identificadorBackOfficeTipoProduto;
           this.remarks = remarks;
           this.statusCancelamento = statusCancelamento;
           this.valorMulta = valorMulta;
           this.valorReembolso = valorReembolso;
           this.dataModificacaoStatusCancelamento = dataModificacaoStatusCancelamento;
           this.usuarioModificouStatusCancelamento = usuarioModificouStatusCancelamento;
           this.totalAereo = totalAereo;
           this.cancelado = cancelado;
           this.identificadoresIntegracao = identificadoresIntegracao;
           this.reemissao = reemissao;
           this.consolidadora = consolidadora;
           this.autoEmissao = autoEmissao;
           this.importado = importado;
           this.online = online;
           this.complementoJustificativaMaiorTarifa = complementoJustificativaMaiorTarifa;
           this.agenteOnline = agenteOnline;
           this.opcaoRota = opcaoRota;
           this.pontoVenda = pontoVenda;
           this.localizadorPreTripGds = localizadorPreTripGds;
    }


    /**
     * Gets the id value for this Aereo.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Aereo.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the localizador value for this Aereo.
     * 
     * @return localizador
     */
    public java.lang.String getLocalizador() {
        return localizador;
    }


    /**
     * Sets the localizador value for this Aereo.
     * 
     * @param localizador
     */
    public void setLocalizador(java.lang.String localizador) {
        this.localizador = localizador;
    }


    /**
     * Gets the localizadorGds value for this Aereo.
     * 
     * @return localizadorGds
     */
    public java.lang.Boolean getLocalizadorGds() {
        return localizadorGds;
    }


    /**
     * Sets the localizadorGds value for this Aereo.
     * 
     * @param localizadorGds
     */
    public void setLocalizadorGds(java.lang.Boolean localizadorGds) {
        this.localizadorGds = localizadorGds;
    }


    /**
     * Gets the source value for this Aereo.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Aereo.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the codigoEmissor value for this Aereo.
     * 
     * @return codigoEmissor
     */
    public java.lang.String getCodigoEmissor() {
        return codigoEmissor;
    }


    /**
     * Sets the codigoEmissor value for this Aereo.
     * 
     * @param codigoEmissor
     */
    public void setCodigoEmissor(java.lang.String codigoEmissor) {
        this.codigoEmissor = codigoEmissor;
    }


    /**
     * Gets the nomeEmissor value for this Aereo.
     * 
     * @return nomeEmissor
     */
    public java.lang.String getNomeEmissor() {
        return nomeEmissor;
    }


    /**
     * Sets the nomeEmissor value for this Aereo.
     * 
     * @param nomeEmissor
     */
    public void setNomeEmissor(java.lang.String nomeEmissor) {
        this.nomeEmissor = nomeEmissor;
    }


    /**
     * Gets the emailEmissor value for this Aereo.
     * 
     * @return emailEmissor
     */
    public java.lang.String getEmailEmissor() {
        return emailEmissor;
    }


    /**
     * Sets the emailEmissor value for this Aereo.
     * 
     * @param emailEmissor
     */
    public void setEmailEmissor(java.lang.String emailEmissor) {
        this.emailEmissor = emailEmissor;
    }


    /**
     * Gets the codigoReservador value for this Aereo.
     * 
     * @return codigoReservador
     */
    public java.lang.String getCodigoReservador() {
        return codigoReservador;
    }


    /**
     * Sets the codigoReservador value for this Aereo.
     * 
     * @param codigoReservador
     */
    public void setCodigoReservador(java.lang.String codigoReservador) {
        this.codigoReservador = codigoReservador;
    }


    /**
     * Gets the nomeReservador value for this Aereo.
     * 
     * @return nomeReservador
     */
    public java.lang.String getNomeReservador() {
        return nomeReservador;
    }


    /**
     * Sets the nomeReservador value for this Aereo.
     * 
     * @param nomeReservador
     */
    public void setNomeReservador(java.lang.String nomeReservador) {
        this.nomeReservador = nomeReservador;
    }


    /**
     * Gets the dataVencimento value for this Aereo.
     * 
     * @return dataVencimento
     */
    public java.util.Calendar getDataVencimento() {
        return dataVencimento;
    }


    /**
     * Sets the dataVencimento value for this Aereo.
     * 
     * @param dataVencimento
     */
    public void setDataVencimento(java.util.Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }


    /**
     * Gets the dataEmissao value for this Aereo.
     * 
     * @return dataEmissao
     */
    public java.util.Calendar getDataEmissao() {
        return dataEmissao;
    }


    /**
     * Sets the dataEmissao value for this Aereo.
     * 
     * @param dataEmissao
     */
    public void setDataEmissao(java.util.Calendar dataEmissao) {
        this.dataEmissao = dataEmissao;
    }


    /**
     * Gets the dataReserva value for this Aereo.
     * 
     * @return dataReserva
     */
    public java.util.Calendar getDataReserva() {
        return dataReserva;
    }


    /**
     * Sets the dataReserva value for this Aereo.
     * 
     * @param dataReserva
     */
    public void setDataReserva(java.util.Calendar dataReserva) {
        this.dataReserva = dataReserva;
    }


    /**
     * Gets the menorTarifa value for this Aereo.
     * 
     * @return menorTarifa
     */
    public java.lang.Double getMenorTarifa() {
        return menorTarifa;
    }


    /**
     * Sets the menorTarifa value for this Aereo.
     * 
     * @param menorTarifa
     */
    public void setMenorTarifa(java.lang.Double menorTarifa) {
        this.menorTarifa = menorTarifa;
    }


    /**
     * Gets the maiorTarifa value for this Aereo.
     * 
     * @return maiorTarifa
     */
    public java.lang.Double getMaiorTarifa() {
        return maiorTarifa;
    }


    /**
     * Sets the maiorTarifa value for this Aereo.
     * 
     * @param maiorTarifa
     */
    public void setMaiorTarifa(java.lang.Double maiorTarifa) {
        this.maiorTarifa = maiorTarifa;
    }


    /**
     * Gets the ciaMenorTarifa value for this Aereo.
     * 
     * @return ciaMenorTarifa
     */
    public java.lang.String getCiaMenorTarifa() {
        return ciaMenorTarifa;
    }


    /**
     * Sets the ciaMenorTarifa value for this Aereo.
     * 
     * @param ciaMenorTarifa
     */
    public void setCiaMenorTarifa(java.lang.String ciaMenorTarifa) {
        this.ciaMenorTarifa = ciaMenorTarifa;
    }


    /**
     * Gets the codigoFornecedor value for this Aereo.
     * 
     * @return codigoFornecedor
     */
    public java.lang.String getCodigoFornecedor() {
        return codigoFornecedor;
    }


    /**
     * Sets the codigoFornecedor value for this Aereo.
     * 
     * @param codigoFornecedor
     */
    public void setCodigoFornecedor(java.lang.String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }


    /**
     * Gets the idPassageiroRef value for this Aereo.
     * 
     * @return idPassageiroRef
     */
    public java.lang.Integer[] getIdPassageiroRef() {
        return idPassageiroRef;
    }


    /**
     * Sets the idPassageiroRef value for this Aereo.
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
     * Gets the aereoTarifa value for this Aereo.
     * 
     * @return aereoTarifa
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoTarifa getAereoTarifa() {
        return aereoTarifa;
    }


    /**
     * Sets the aereoTarifa value for this Aereo.
     * 
     * @param aereoTarifa
     */
    public void setAereoTarifa(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoTarifa aereoTarifa) {
        this.aereoTarifa = aereoTarifa;
    }


    /**
     * Gets the aereoSeguimento value for this Aereo.
     * 
     * @return aereoSeguimento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento[] getAereoSeguimento() {
        return aereoSeguimento;
    }


    /**
     * Sets the aereoSeguimento value for this Aereo.
     * 
     * @param aereoSeguimento
     */
    public void setAereoSeguimento(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento[] aereoSeguimento) {
        this.aereoSeguimento = aereoSeguimento;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento getAereoSeguimento(int i) {
        return this.aereoSeguimento[i];
    }

    public void setAereoSeguimento(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento _value) {
        this.aereoSeguimento[i] = _value;
    }


    /**
     * Gets the formaPagamento value for this Aereo.
     * 
     * @return formaPagamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento[] getFormaPagamento() {
        return formaPagamento;
    }


    /**
     * Sets the formaPagamento value for this Aereo.
     * 
     * @param formaPagamento
     */
    public void setFormaPagamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento[] formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento getFormaPagamento(int i) {
        return this.formaPagamento[i];
    }

    public void setFormaPagamento(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento _value) {
        this.formaPagamento[i] = _value;
    }


    /**
     * Gets the aereoBilhete value for this Aereo.
     * 
     * @return aereoBilhete
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoBilhete[] getAereoBilhete() {
        return aereoBilhete;
    }


    /**
     * Sets the aereoBilhete value for this Aereo.
     * 
     * @param aereoBilhete
     */
    public void setAereoBilhete(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoBilhete[] aereoBilhete) {
        this.aereoBilhete = aereoBilhete;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoBilhete getAereoBilhete(int i) {
        return this.aereoBilhete[i];
    }

    public void setAereoBilhete(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoBilhete _value) {
        this.aereoBilhete[i] = _value;
    }


    /**
     * Gets the selfbook value for this Aereo.
     * 
     * @return selfbook
     */
    public boolean isSelfbook() {
        return selfbook;
    }


    /**
     * Sets the selfbook value for this Aereo.
     * 
     * @param selfbook
     */
    public void setSelfbook(boolean selfbook) {
        this.selfbook = selfbook;
    }


    /**
     * Gets the justificativaMaiorTarifa value for this Aereo.
     * 
     * @return justificativaMaiorTarifa
     */
    public java.lang.String getJustificativaMaiorTarifa() {
        return justificativaMaiorTarifa;
    }


    /**
     * Sets the justificativaMaiorTarifa value for this Aereo.
     * 
     * @param justificativaMaiorTarifa
     */
    public void setJustificativaMaiorTarifa(java.lang.String justificativaMaiorTarifa) {
        this.justificativaMaiorTarifa = justificativaMaiorTarifa;
    }


    /**
     * Gets the canceladoEmitido value for this Aereo.
     * 
     * @return canceladoEmitido
     */
    public java.lang.Boolean getCanceladoEmitido() {
        return canceladoEmitido;
    }


    /**
     * Sets the canceladoEmitido value for this Aereo.
     * 
     * @param canceladoEmitido
     */
    public void setCanceladoEmitido(java.lang.Boolean canceladoEmitido) {
        this.canceladoEmitido = canceladoEmitido;
    }


    /**
     * Gets the nacional value for this Aereo.
     * 
     * @return nacional
     */
    public java.lang.Boolean getNacional() {
        return nacional;
    }


    /**
     * Sets the nacional value for this Aereo.
     * 
     * @param nacional
     */
    public void setNacional(java.lang.Boolean nacional) {
        this.nacional = nacional;
    }


    /**
     * Gets the codigoJustificativaMaiorTarifa value for this Aereo.
     * 
     * @return codigoJustificativaMaiorTarifa
     */
    public java.lang.String getCodigoJustificativaMaiorTarifa() {
        return codigoJustificativaMaiorTarifa;
    }


    /**
     * Sets the codigoJustificativaMaiorTarifa value for this Aereo.
     * 
     * @param codigoJustificativaMaiorTarifa
     */
    public void setCodigoJustificativaMaiorTarifa(java.lang.String codigoJustificativaMaiorTarifa) {
        this.codigoJustificativaMaiorTarifa = codigoJustificativaMaiorTarifa;
    }


    /**
     * Gets the observacao value for this Aereo.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this Aereo.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }


    /**
     * Gets the tipoVoo value for this Aereo.
     * 
     * @return tipoVoo
     */
    public java.lang.String getTipoVoo() {
        return tipoVoo;
    }


    /**
     * Sets the tipoVoo value for this Aereo.
     * 
     * @param tipoVoo
     */
    public void setTipoVoo(java.lang.String tipoVoo) {
        this.tipoVoo = tipoVoo;
    }


    /**
     * Gets the identificadorIntegracao value for this Aereo.
     * 
     * @return identificadorIntegracao
     */
    public java.lang.String getIdentificadorIntegracao() {
        return identificadorIntegracao;
    }


    /**
     * Sets the identificadorIntegracao value for this Aereo.
     * 
     * @param identificadorIntegracao
     */
    public void setIdentificadorIntegracao(java.lang.String identificadorIntegracao) {
        this.identificadorIntegracao = identificadorIntegracao;
    }


    /**
     * Gets the identificadorBackOfficeTipoProduto value for this Aereo.
     * 
     * @return identificadorBackOfficeTipoProduto
     */
    public java.lang.String getIdentificadorBackOfficeTipoProduto() {
        return identificadorBackOfficeTipoProduto;
    }


    /**
     * Sets the identificadorBackOfficeTipoProduto value for this Aereo.
     * 
     * @param identificadorBackOfficeTipoProduto
     */
    public void setIdentificadorBackOfficeTipoProduto(java.lang.String identificadorBackOfficeTipoProduto) {
        this.identificadorBackOfficeTipoProduto = identificadorBackOfficeTipoProduto;
    }


    /**
     * Gets the remarks value for this Aereo.
     * 
     * @return remarks
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this Aereo.
     * 
     * @param remarks
     */
    public void setRemarks(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the statusCancelamento value for this Aereo.
     * 
     * @return statusCancelamento
     */
    public java.lang.Integer getStatusCancelamento() {
        return statusCancelamento;
    }


    /**
     * Sets the statusCancelamento value for this Aereo.
     * 
     * @param statusCancelamento
     */
    public void setStatusCancelamento(java.lang.Integer statusCancelamento) {
        this.statusCancelamento = statusCancelamento;
    }


    /**
     * Gets the valorMulta value for this Aereo.
     * 
     * @return valorMulta
     */
    public java.lang.Double getValorMulta() {
        return valorMulta;
    }


    /**
     * Sets the valorMulta value for this Aereo.
     * 
     * @param valorMulta
     */
    public void setValorMulta(java.lang.Double valorMulta) {
        this.valorMulta = valorMulta;
    }


    /**
     * Gets the valorReembolso value for this Aereo.
     * 
     * @return valorReembolso
     */
    public java.lang.Double getValorReembolso() {
        return valorReembolso;
    }


    /**
     * Sets the valorReembolso value for this Aereo.
     * 
     * @param valorReembolso
     */
    public void setValorReembolso(java.lang.Double valorReembolso) {
        this.valorReembolso = valorReembolso;
    }


    /**
     * Gets the dataModificacaoStatusCancelamento value for this Aereo.
     * 
     * @return dataModificacaoStatusCancelamento
     */
    public java.util.Calendar getDataModificacaoStatusCancelamento() {
        return dataModificacaoStatusCancelamento;
    }


    /**
     * Sets the dataModificacaoStatusCancelamento value for this Aereo.
     * 
     * @param dataModificacaoStatusCancelamento
     */
    public void setDataModificacaoStatusCancelamento(java.util.Calendar dataModificacaoStatusCancelamento) {
        this.dataModificacaoStatusCancelamento = dataModificacaoStatusCancelamento;
    }


    /**
     * Gets the usuarioModificouStatusCancelamento value for this Aereo.
     * 
     * @return usuarioModificouStatusCancelamento
     */
    public java.lang.Integer getUsuarioModificouStatusCancelamento() {
        return usuarioModificouStatusCancelamento;
    }


    /**
     * Sets the usuarioModificouStatusCancelamento value for this Aereo.
     * 
     * @param usuarioModificouStatusCancelamento
     */
    public void setUsuarioModificouStatusCancelamento(java.lang.Integer usuarioModificouStatusCancelamento) {
        this.usuarioModificouStatusCancelamento = usuarioModificouStatusCancelamento;
    }


    /**
     * Gets the totalAereo value for this Aereo.
     * 
     * @return totalAereo
     */
    public java.lang.Double getTotalAereo() {
        return totalAereo;
    }


    /**
     * Sets the totalAereo value for this Aereo.
     * 
     * @param totalAereo
     */
    public void setTotalAereo(java.lang.Double totalAereo) {
        this.totalAereo = totalAereo;
    }


    /**
     * Gets the cancelado value for this Aereo.
     * 
     * @return cancelado
     */
    public boolean isCancelado() {
        return cancelado;
    }


    /**
     * Sets the cancelado value for this Aereo.
     * 
     * @param cancelado
     */
    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }


    /**
     * Gets the identificadoresIntegracao value for this Aereo.
     * 
     * @return identificadoresIntegracao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] getIdentificadoresIntegracao() {
        return identificadoresIntegracao;
    }


    /**
     * Sets the identificadoresIntegracao value for this Aereo.
     * 
     * @param identificadoresIntegracao
     */
    public void setIdentificadoresIntegracao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao) {
        this.identificadoresIntegracao = identificadoresIntegracao;
    }


    /**
     * Gets the reemissao value for this Aereo.
     * 
     * @return reemissao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Reemissao getReemissao() {
        return reemissao;
    }


    /**
     * Sets the reemissao value for this Aereo.
     * 
     * @param reemissao
     */
    public void setReemissao(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Reemissao reemissao) {
        this.reemissao = reemissao;
    }


    /**
     * Gets the consolidadora value for this Aereo.
     * 
     * @return consolidadora
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora getConsolidadora() {
        return consolidadora;
    }


    /**
     * Sets the consolidadora value for this Aereo.
     * 
     * @param consolidadora
     */
    public void setConsolidadora(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora) {
        this.consolidadora = consolidadora;
    }


    /**
     * Gets the autoEmissao value for this Aereo.
     * 
     * @return autoEmissao
     */
    public boolean isAutoEmissao() {
        return autoEmissao;
    }


    /**
     * Sets the autoEmissao value for this Aereo.
     * 
     * @param autoEmissao
     */
    public void setAutoEmissao(boolean autoEmissao) {
        this.autoEmissao = autoEmissao;
    }


    /**
     * Gets the importado value for this Aereo.
     * 
     * @return importado
     */
    public boolean isImportado() {
        return importado;
    }


    /**
     * Sets the importado value for this Aereo.
     * 
     * @param importado
     */
    public void setImportado(boolean importado) {
        this.importado = importado;
    }


    /**
     * Gets the online value for this Aereo.
     * 
     * @return online
     */
    public boolean isOnline() {
        return online;
    }


    /**
     * Sets the online value for this Aereo.
     * 
     * @param online
     */
    public void setOnline(boolean online) {
        this.online = online;
    }


    /**
     * Gets the complementoJustificativaMaiorTarifa value for this Aereo.
     * 
     * @return complementoJustificativaMaiorTarifa
     */
    public java.lang.String getComplementoJustificativaMaiorTarifa() {
        return complementoJustificativaMaiorTarifa;
    }


    /**
     * Sets the complementoJustificativaMaiorTarifa value for this Aereo.
     * 
     * @param complementoJustificativaMaiorTarifa
     */
    public void setComplementoJustificativaMaiorTarifa(java.lang.String complementoJustificativaMaiorTarifa) {
        this.complementoJustificativaMaiorTarifa = complementoJustificativaMaiorTarifa;
    }


    /**
     * Gets the agenteOnline value for this Aereo.
     * 
     * @return agenteOnline
     */
    public boolean isAgenteOnline() {
        return agenteOnline;
    }


    /**
     * Sets the agenteOnline value for this Aereo.
     * 
     * @param agenteOnline
     */
    public void setAgenteOnline(boolean agenteOnline) {
        this.agenteOnline = agenteOnline;
    }


    /**
     * Gets the opcaoRota value for this Aereo.
     * 
     * @return opcaoRota
     */
    public boolean isOpcaoRota() {
        return opcaoRota;
    }


    /**
     * Sets the opcaoRota value for this Aereo.
     * 
     * @param opcaoRota
     */
    public void setOpcaoRota(boolean opcaoRota) {
        this.opcaoRota = opcaoRota;
    }


    /**
     * Gets the pontoVenda value for this Aereo.
     * 
     * @return pontoVenda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento getPontoVenda() {
        return pontoVenda;
    }


    /**
     * Sets the pontoVenda value for this Aereo.
     * 
     * @param pontoVenda
     */
    public void setPontoVenda(br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda) {
        this.pontoVenda = pontoVenda;
    }


    /**
     * Gets the localizadorPreTripGds value for this Aereo.
     * 
     * @return localizadorPreTripGds
     */
    public java.lang.String getLocalizadorPreTripGds() {
        return localizadorPreTripGds;
    }


    /**
     * Sets the localizadorPreTripGds value for this Aereo.
     * 
     * @param localizadorPreTripGds
     */
    public void setLocalizadorPreTripGds(java.lang.String localizadorPreTripGds) {
        this.localizadorPreTripGds = localizadorPreTripGds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aereo)) return false;
        Aereo other = (Aereo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.localizador==null && other.getLocalizador()==null) || 
             (this.localizador!=null &&
              this.localizador.equals(other.getLocalizador()))) &&
            ((this.localizadorGds==null && other.getLocalizadorGds()==null) || 
             (this.localizadorGds!=null &&
              this.localizadorGds.equals(other.getLocalizadorGds()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.codigoEmissor==null && other.getCodigoEmissor()==null) || 
             (this.codigoEmissor!=null &&
              this.codigoEmissor.equals(other.getCodigoEmissor()))) &&
            ((this.nomeEmissor==null && other.getNomeEmissor()==null) || 
             (this.nomeEmissor!=null &&
              this.nomeEmissor.equals(other.getNomeEmissor()))) &&
            ((this.emailEmissor==null && other.getEmailEmissor()==null) || 
             (this.emailEmissor!=null &&
              this.emailEmissor.equals(other.getEmailEmissor()))) &&
            ((this.codigoReservador==null && other.getCodigoReservador()==null) || 
             (this.codigoReservador!=null &&
              this.codigoReservador.equals(other.getCodigoReservador()))) &&
            ((this.nomeReservador==null && other.getNomeReservador()==null) || 
             (this.nomeReservador!=null &&
              this.nomeReservador.equals(other.getNomeReservador()))) &&
            ((this.dataVencimento==null && other.getDataVencimento()==null) || 
             (this.dataVencimento!=null &&
              this.dataVencimento.equals(other.getDataVencimento()))) &&
            ((this.dataEmissao==null && other.getDataEmissao()==null) || 
             (this.dataEmissao!=null &&
              this.dataEmissao.equals(other.getDataEmissao()))) &&
            ((this.dataReserva==null && other.getDataReserva()==null) || 
             (this.dataReserva!=null &&
              this.dataReserva.equals(other.getDataReserva()))) &&
            ((this.menorTarifa==null && other.getMenorTarifa()==null) || 
             (this.menorTarifa!=null &&
              this.menorTarifa.equals(other.getMenorTarifa()))) &&
            ((this.maiorTarifa==null && other.getMaiorTarifa()==null) || 
             (this.maiorTarifa!=null &&
              this.maiorTarifa.equals(other.getMaiorTarifa()))) &&
            ((this.ciaMenorTarifa==null && other.getCiaMenorTarifa()==null) || 
             (this.ciaMenorTarifa!=null &&
              this.ciaMenorTarifa.equals(other.getCiaMenorTarifa()))) &&
            ((this.codigoFornecedor==null && other.getCodigoFornecedor()==null) || 
             (this.codigoFornecedor!=null &&
              this.codigoFornecedor.equals(other.getCodigoFornecedor()))) &&
            ((this.idPassageiroRef==null && other.getIdPassageiroRef()==null) || 
             (this.idPassageiroRef!=null &&
              java.util.Arrays.equals(this.idPassageiroRef, other.getIdPassageiroRef()))) &&
            ((this.aereoTarifa==null && other.getAereoTarifa()==null) || 
             (this.aereoTarifa!=null &&
              this.aereoTarifa.equals(other.getAereoTarifa()))) &&
            ((this.aereoSeguimento==null && other.getAereoSeguimento()==null) || 
             (this.aereoSeguimento!=null &&
              java.util.Arrays.equals(this.aereoSeguimento, other.getAereoSeguimento()))) &&
            ((this.formaPagamento==null && other.getFormaPagamento()==null) || 
             (this.formaPagamento!=null &&
              java.util.Arrays.equals(this.formaPagamento, other.getFormaPagamento()))) &&
            ((this.aereoBilhete==null && other.getAereoBilhete()==null) || 
             (this.aereoBilhete!=null &&
              java.util.Arrays.equals(this.aereoBilhete, other.getAereoBilhete()))) &&
            this.selfbook == other.isSelfbook() &&
            ((this.justificativaMaiorTarifa==null && other.getJustificativaMaiorTarifa()==null) || 
             (this.justificativaMaiorTarifa!=null &&
              this.justificativaMaiorTarifa.equals(other.getJustificativaMaiorTarifa()))) &&
            ((this.canceladoEmitido==null && other.getCanceladoEmitido()==null) || 
             (this.canceladoEmitido!=null &&
              this.canceladoEmitido.equals(other.getCanceladoEmitido()))) &&
            ((this.nacional==null && other.getNacional()==null) || 
             (this.nacional!=null &&
              this.nacional.equals(other.getNacional()))) &&
            ((this.codigoJustificativaMaiorTarifa==null && other.getCodigoJustificativaMaiorTarifa()==null) || 
             (this.codigoJustificativaMaiorTarifa!=null &&
              this.codigoJustificativaMaiorTarifa.equals(other.getCodigoJustificativaMaiorTarifa()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao()))) &&
            ((this.tipoVoo==null && other.getTipoVoo()==null) || 
             (this.tipoVoo!=null &&
              this.tipoVoo.equals(other.getTipoVoo()))) &&
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
            ((this.valorMulta==null && other.getValorMulta()==null) || 
             (this.valorMulta!=null &&
              this.valorMulta.equals(other.getValorMulta()))) &&
            ((this.valorReembolso==null && other.getValorReembolso()==null) || 
             (this.valorReembolso!=null &&
              this.valorReembolso.equals(other.getValorReembolso()))) &&
            ((this.dataModificacaoStatusCancelamento==null && other.getDataModificacaoStatusCancelamento()==null) || 
             (this.dataModificacaoStatusCancelamento!=null &&
              this.dataModificacaoStatusCancelamento.equals(other.getDataModificacaoStatusCancelamento()))) &&
            ((this.usuarioModificouStatusCancelamento==null && other.getUsuarioModificouStatusCancelamento()==null) || 
             (this.usuarioModificouStatusCancelamento!=null &&
              this.usuarioModificouStatusCancelamento.equals(other.getUsuarioModificouStatusCancelamento()))) &&
            ((this.totalAereo==null && other.getTotalAereo()==null) || 
             (this.totalAereo!=null &&
              this.totalAereo.equals(other.getTotalAereo()))) &&
            this.cancelado == other.isCancelado() &&
            ((this.identificadoresIntegracao==null && other.getIdentificadoresIntegracao()==null) || 
             (this.identificadoresIntegracao!=null &&
              java.util.Arrays.equals(this.identificadoresIntegracao, other.getIdentificadoresIntegracao()))) &&
            ((this.reemissao==null && other.getReemissao()==null) || 
             (this.reemissao!=null &&
              this.reemissao.equals(other.getReemissao()))) &&
            ((this.consolidadora==null && other.getConsolidadora()==null) || 
             (this.consolidadora!=null &&
              this.consolidadora.equals(other.getConsolidadora()))) &&
            this.autoEmissao == other.isAutoEmissao() &&
            this.importado == other.isImportado() &&
            this.online == other.isOnline() &&
            ((this.complementoJustificativaMaiorTarifa==null && other.getComplementoJustificativaMaiorTarifa()==null) || 
             (this.complementoJustificativaMaiorTarifa!=null &&
              this.complementoJustificativaMaiorTarifa.equals(other.getComplementoJustificativaMaiorTarifa()))) &&
            this.agenteOnline == other.isAgenteOnline() &&
            this.opcaoRota == other.isOpcaoRota() &&
            ((this.pontoVenda==null && other.getPontoVenda()==null) || 
             (this.pontoVenda!=null &&
              this.pontoVenda.equals(other.getPontoVenda()))) &&
            ((this.localizadorPreTripGds==null && other.getLocalizadorPreTripGds()==null) || 
             (this.localizadorPreTripGds!=null &&
              this.localizadorPreTripGds.equals(other.getLocalizadorPreTripGds())));
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
        if (getLocalizador() != null) {
            _hashCode += getLocalizador().hashCode();
        }
        if (getLocalizadorGds() != null) {
            _hashCode += getLocalizadorGds().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getCodigoEmissor() != null) {
            _hashCode += getCodigoEmissor().hashCode();
        }
        if (getNomeEmissor() != null) {
            _hashCode += getNomeEmissor().hashCode();
        }
        if (getEmailEmissor() != null) {
            _hashCode += getEmailEmissor().hashCode();
        }
        if (getCodigoReservador() != null) {
            _hashCode += getCodigoReservador().hashCode();
        }
        if (getNomeReservador() != null) {
            _hashCode += getNomeReservador().hashCode();
        }
        if (getDataVencimento() != null) {
            _hashCode += getDataVencimento().hashCode();
        }
        if (getDataEmissao() != null) {
            _hashCode += getDataEmissao().hashCode();
        }
        if (getDataReserva() != null) {
            _hashCode += getDataReserva().hashCode();
        }
        if (getMenorTarifa() != null) {
            _hashCode += getMenorTarifa().hashCode();
        }
        if (getMaiorTarifa() != null) {
            _hashCode += getMaiorTarifa().hashCode();
        }
        if (getCiaMenorTarifa() != null) {
            _hashCode += getCiaMenorTarifa().hashCode();
        }
        if (getCodigoFornecedor() != null) {
            _hashCode += getCodigoFornecedor().hashCode();
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
        if (getAereoTarifa() != null) {
            _hashCode += getAereoTarifa().hashCode();
        }
        if (getAereoSeguimento() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAereoSeguimento());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAereoSeguimento(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormaPagamento() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFormaPagamento());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFormaPagamento(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAereoBilhete() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAereoBilhete());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAereoBilhete(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isSelfbook() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getJustificativaMaiorTarifa() != null) {
            _hashCode += getJustificativaMaiorTarifa().hashCode();
        }
        if (getCanceladoEmitido() != null) {
            _hashCode += getCanceladoEmitido().hashCode();
        }
        if (getNacional() != null) {
            _hashCode += getNacional().hashCode();
        }
        if (getCodigoJustificativaMaiorTarifa() != null) {
            _hashCode += getCodigoJustificativaMaiorTarifa().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        if (getTipoVoo() != null) {
            _hashCode += getTipoVoo().hashCode();
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
        if (getValorMulta() != null) {
            _hashCode += getValorMulta().hashCode();
        }
        if (getValorReembolso() != null) {
            _hashCode += getValorReembolso().hashCode();
        }
        if (getDataModificacaoStatusCancelamento() != null) {
            _hashCode += getDataModificacaoStatusCancelamento().hashCode();
        }
        if (getUsuarioModificouStatusCancelamento() != null) {
            _hashCode += getUsuarioModificouStatusCancelamento().hashCode();
        }
        if (getTotalAereo() != null) {
            _hashCode += getTotalAereo().hashCode();
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
        if (getReemissao() != null) {
            _hashCode += getReemissao().hashCode();
        }
        if (getConsolidadora() != null) {
            _hashCode += getConsolidadora().hashCode();
        }
        _hashCode += (isAutoEmissao() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isImportado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOnline() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getComplementoJustificativaMaiorTarifa() != null) {
            _hashCode += getComplementoJustificativaMaiorTarifa().hashCode();
        }
        _hashCode += (isAgenteOnline() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOpcaoRota() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPontoVenda() != null) {
            _hashCode += getPontoVenda().hashCode();
        }
        if (getLocalizadorPreTripGds() != null) {
            _hashCode += getLocalizadorPreTripGds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aereo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("localizadorGds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizadorGds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("emailEmissor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailEmissor"));
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
        elemField.setFieldName("dataVencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataVencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataEmissao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataEmissao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("menorTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "menorTarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("ciaMenorTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ciaMenorTarifa"));
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
        elemField.setFieldName("idPassageiroRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPassageiroRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aereoTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aereoTarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoTarifa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aereoSeguimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aereoSeguimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoSeguimento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formaPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "formaPagamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aereoBilhete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aereoBilhete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoBilhete"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfbook");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selfbook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justificativaMaiorTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "justificativaMaiorTarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canceladoEmitido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "canceladoEmitido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("codigoJustificativaMaiorTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoJustificativaMaiorTarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("tipoVoo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoVoo"));
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
        elemField.setFieldName("valorMulta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorMulta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorReembolso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorReembolso"));
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
        elemField.setFieldName("totalAereo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAereo"));
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
        elemField.setFieldName("reemissao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reemissao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "reemissao"));
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
        elemField.setFieldName("autoEmissao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoEmissao"));
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
        elemField.setFieldName("online");
        elemField.setXmlName(new javax.xml.namespace.QName("", "online"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complementoJustificativaMaiorTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "complementoJustificativaMaiorTarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("opcaoRota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opcaoRota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("localizadorPreTripGds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizadorPreTripGds"));
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
