/**
 * Seguro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.seguro;

public class Seguro  implements java.io.Serializable {
    private int id;

    private java.lang.String nomeSeguro;

    private java.lang.String nomeSeguradora;

    private java.util.Calendar dataInicialVigencia;

    private java.util.Calendar dataFinalVigencia;

    private java.lang.String origem;

    private java.lang.String destino;

    private java.lang.String certificado;

    private java.lang.Double valorPremio;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Cobertura[] coberturas;

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

    private java.util.Calendar dataModificacaoStatusCancelamento;

    private java.lang.Integer usuarioModificouStatusCancelamento;

    private java.lang.String codigoJustificativaMaiorTarifa;

    private java.lang.String identificadorIntegracao;

    private java.lang.String identificadorBackOfficeTipoProduto;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks;

    private java.lang.Double totalSeguro;

    private boolean cancelado;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao;

    private java.lang.Double taxaFee;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora;

    private java.lang.String moeda;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda;

    public Seguro() {
    }

    public Seguro(
           int id,
           java.lang.String nomeSeguro,
           java.lang.String nomeSeguradora,
           java.util.Calendar dataInicialVigencia,
           java.util.Calendar dataFinalVigencia,
           java.lang.String origem,
           java.lang.String destino,
           java.lang.String certificado,
           java.lang.Double valorPremio,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Cobertura[] coberturas,
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
           java.util.Calendar dataModificacaoStatusCancelamento,
           java.lang.Integer usuarioModificouStatusCancelamento,
           java.lang.String codigoJustificativaMaiorTarifa,
           java.lang.String identificadorIntegracao,
           java.lang.String identificadorBackOfficeTipoProduto,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks,
           java.lang.Double totalSeguro,
           boolean cancelado,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao,
           java.lang.Double taxaFee,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora,
           java.lang.String moeda,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda) {
           this.id = id;
           this.nomeSeguro = nomeSeguro;
           this.nomeSeguradora = nomeSeguradora;
           this.dataInicialVigencia = dataInicialVigencia;
           this.dataFinalVigencia = dataFinalVigencia;
           this.origem = origem;
           this.destino = destino;
           this.certificado = certificado;
           this.valorPremio = valorPremio;
           this.coberturas = coberturas;
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
           this.dataModificacaoStatusCancelamento = dataModificacaoStatusCancelamento;
           this.usuarioModificouStatusCancelamento = usuarioModificouStatusCancelamento;
           this.codigoJustificativaMaiorTarifa = codigoJustificativaMaiorTarifa;
           this.identificadorIntegracao = identificadorIntegracao;
           this.identificadorBackOfficeTipoProduto = identificadorBackOfficeTipoProduto;
           this.remarks = remarks;
           this.totalSeguro = totalSeguro;
           this.cancelado = cancelado;
           this.identificadoresIntegracao = identificadoresIntegracao;
           this.taxaFee = taxaFee;
           this.consolidadora = consolidadora;
           this.moeda = moeda;
           this.pontoVenda = pontoVenda;
    }


    /**
     * Gets the id value for this Seguro.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Seguro.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the nomeSeguro value for this Seguro.
     * 
     * @return nomeSeguro
     */
    public java.lang.String getNomeSeguro() {
        return nomeSeguro;
    }


    /**
     * Sets the nomeSeguro value for this Seguro.
     * 
     * @param nomeSeguro
     */
    public void setNomeSeguro(java.lang.String nomeSeguro) {
        this.nomeSeguro = nomeSeguro;
    }


    /**
     * Gets the nomeSeguradora value for this Seguro.
     * 
     * @return nomeSeguradora
     */
    public java.lang.String getNomeSeguradora() {
        return nomeSeguradora;
    }


    /**
     * Sets the nomeSeguradora value for this Seguro.
     * 
     * @param nomeSeguradora
     */
    public void setNomeSeguradora(java.lang.String nomeSeguradora) {
        this.nomeSeguradora = nomeSeguradora;
    }


    /**
     * Gets the dataInicialVigencia value for this Seguro.
     * 
     * @return dataInicialVigencia
     */
    public java.util.Calendar getDataInicialVigencia() {
        return dataInicialVigencia;
    }


    /**
     * Sets the dataInicialVigencia value for this Seguro.
     * 
     * @param dataInicialVigencia
     */
    public void setDataInicialVigencia(java.util.Calendar dataInicialVigencia) {
        this.dataInicialVigencia = dataInicialVigencia;
    }


    /**
     * Gets the dataFinalVigencia value for this Seguro.
     * 
     * @return dataFinalVigencia
     */
    public java.util.Calendar getDataFinalVigencia() {
        return dataFinalVigencia;
    }


    /**
     * Sets the dataFinalVigencia value for this Seguro.
     * 
     * @param dataFinalVigencia
     */
    public void setDataFinalVigencia(java.util.Calendar dataFinalVigencia) {
        this.dataFinalVigencia = dataFinalVigencia;
    }


    /**
     * Gets the origem value for this Seguro.
     * 
     * @return origem
     */
    public java.lang.String getOrigem() {
        return origem;
    }


    /**
     * Sets the origem value for this Seguro.
     * 
     * @param origem
     */
    public void setOrigem(java.lang.String origem) {
        this.origem = origem;
    }


    /**
     * Gets the destino value for this Seguro.
     * 
     * @return destino
     */
    public java.lang.String getDestino() {
        return destino;
    }


    /**
     * Sets the destino value for this Seguro.
     * 
     * @param destino
     */
    public void setDestino(java.lang.String destino) {
        this.destino = destino;
    }


    /**
     * Gets the certificado value for this Seguro.
     * 
     * @return certificado
     */
    public java.lang.String getCertificado() {
        return certificado;
    }


    /**
     * Sets the certificado value for this Seguro.
     * 
     * @param certificado
     */
    public void setCertificado(java.lang.String certificado) {
        this.certificado = certificado;
    }


    /**
     * Gets the valorPremio value for this Seguro.
     * 
     * @return valorPremio
     */
    public java.lang.Double getValorPremio() {
        return valorPremio;
    }


    /**
     * Sets the valorPremio value for this Seguro.
     * 
     * @param valorPremio
     */
    public void setValorPremio(java.lang.Double valorPremio) {
        this.valorPremio = valorPremio;
    }


    /**
     * Gets the coberturas value for this Seguro.
     * 
     * @return coberturas
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Cobertura[] getCoberturas() {
        return coberturas;
    }


    /**
     * Sets the coberturas value for this Seguro.
     * 
     * @param coberturas
     */
    public void setCoberturas(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Cobertura[] coberturas) {
        this.coberturas = coberturas;
    }


    /**
     * Gets the codigoEmissor value for this Seguro.
     * 
     * @return codigoEmissor
     */
    public java.lang.String getCodigoEmissor() {
        return codigoEmissor;
    }


    /**
     * Sets the codigoEmissor value for this Seguro.
     * 
     * @param codigoEmissor
     */
    public void setCodigoEmissor(java.lang.String codigoEmissor) {
        this.codigoEmissor = codigoEmissor;
    }


    /**
     * Gets the nomeEmissor value for this Seguro.
     * 
     * @return nomeEmissor
     */
    public java.lang.String getNomeEmissor() {
        return nomeEmissor;
    }


    /**
     * Sets the nomeEmissor value for this Seguro.
     * 
     * @param nomeEmissor
     */
    public void setNomeEmissor(java.lang.String nomeEmissor) {
        this.nomeEmissor = nomeEmissor;
    }


    /**
     * Gets the codigoReservador value for this Seguro.
     * 
     * @return codigoReservador
     */
    public java.lang.String getCodigoReservador() {
        return codigoReservador;
    }


    /**
     * Sets the codigoReservador value for this Seguro.
     * 
     * @param codigoReservador
     */
    public void setCodigoReservador(java.lang.String codigoReservador) {
        this.codigoReservador = codigoReservador;
    }


    /**
     * Gets the nomeReservador value for this Seguro.
     * 
     * @return nomeReservador
     */
    public java.lang.String getNomeReservador() {
        return nomeReservador;
    }


    /**
     * Sets the nomeReservador value for this Seguro.
     * 
     * @param nomeReservador
     */
    public void setNomeReservador(java.lang.String nomeReservador) {
        this.nomeReservador = nomeReservador;
    }


    /**
     * Gets the dataReserva value for this Seguro.
     * 
     * @return dataReserva
     */
    public java.util.Calendar getDataReserva() {
        return dataReserva;
    }


    /**
     * Sets the dataReserva value for this Seguro.
     * 
     * @param dataReserva
     */
    public void setDataReserva(java.util.Calendar dataReserva) {
        this.dataReserva = dataReserva;
    }


    /**
     * Gets the obsEmissor value for this Seguro.
     * 
     * @return obsEmissor
     */
    public java.lang.String getObsEmissor() {
        return obsEmissor;
    }


    /**
     * Sets the obsEmissor value for this Seguro.
     * 
     * @param obsEmissor
     */
    public void setObsEmissor(java.lang.String obsEmissor) {
        this.obsEmissor = obsEmissor;
    }


    /**
     * Gets the maiorTarifa value for this Seguro.
     * 
     * @return maiorTarifa
     */
    public java.lang.Double getMaiorTarifa() {
        return maiorTarifa;
    }


    /**
     * Sets the maiorTarifa value for this Seguro.
     * 
     * @param maiorTarifa
     */
    public void setMaiorTarifa(java.lang.Double maiorTarifa) {
        this.maiorTarifa = maiorTarifa;
    }


    /**
     * Gets the menorTarifa value for this Seguro.
     * 
     * @return menorTarifa
     */
    public java.lang.Double getMenorTarifa() {
        return menorTarifa;
    }


    /**
     * Sets the menorTarifa value for this Seguro.
     * 
     * @param menorTarifa
     */
    public void setMenorTarifa(java.lang.Double menorTarifa) {
        this.menorTarifa = menorTarifa;
    }


    /**
     * Gets the formaPagamento value for this Seguro.
     * 
     * @return formaPagamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }


    /**
     * Sets the formaPagamento value for this Seguro.
     * 
     * @param formaPagamento
     */
    public void setFormaPagamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }


    /**
     * Gets the idPassageiroRef value for this Seguro.
     * 
     * @return idPassageiroRef
     */
    public java.lang.Integer[] getIdPassageiroRef() {
        return idPassageiroRef;
    }


    /**
     * Sets the idPassageiroRef value for this Seguro.
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
     * Gets the justificativaMaiorTarifa value for this Seguro.
     * 
     * @return justificativaMaiorTarifa
     */
    public java.lang.String getJustificativaMaiorTarifa() {
        return justificativaMaiorTarifa;
    }


    /**
     * Sets the justificativaMaiorTarifa value for this Seguro.
     * 
     * @param justificativaMaiorTarifa
     */
    public void setJustificativaMaiorTarifa(java.lang.String justificativaMaiorTarifa) {
        this.justificativaMaiorTarifa = justificativaMaiorTarifa;
    }


    /**
     * Gets the statusCancelamento value for this Seguro.
     * 
     * @return statusCancelamento
     */
    public java.lang.Integer getStatusCancelamento() {
        return statusCancelamento;
    }


    /**
     * Sets the statusCancelamento value for this Seguro.
     * 
     * @param statusCancelamento
     */
    public void setStatusCancelamento(java.lang.Integer statusCancelamento) {
        this.statusCancelamento = statusCancelamento;
    }


    /**
     * Gets the dataModificacaoStatusCancelamento value for this Seguro.
     * 
     * @return dataModificacaoStatusCancelamento
     */
    public java.util.Calendar getDataModificacaoStatusCancelamento() {
        return dataModificacaoStatusCancelamento;
    }


    /**
     * Sets the dataModificacaoStatusCancelamento value for this Seguro.
     * 
     * @param dataModificacaoStatusCancelamento
     */
    public void setDataModificacaoStatusCancelamento(java.util.Calendar dataModificacaoStatusCancelamento) {
        this.dataModificacaoStatusCancelamento = dataModificacaoStatusCancelamento;
    }


    /**
     * Gets the usuarioModificouStatusCancelamento value for this Seguro.
     * 
     * @return usuarioModificouStatusCancelamento
     */
    public java.lang.Integer getUsuarioModificouStatusCancelamento() {
        return usuarioModificouStatusCancelamento;
    }


    /**
     * Sets the usuarioModificouStatusCancelamento value for this Seguro.
     * 
     * @param usuarioModificouStatusCancelamento
     */
    public void setUsuarioModificouStatusCancelamento(java.lang.Integer usuarioModificouStatusCancelamento) {
        this.usuarioModificouStatusCancelamento = usuarioModificouStatusCancelamento;
    }


    /**
     * Gets the codigoJustificativaMaiorTarifa value for this Seguro.
     * 
     * @return codigoJustificativaMaiorTarifa
     */
    public java.lang.String getCodigoJustificativaMaiorTarifa() {
        return codigoJustificativaMaiorTarifa;
    }


    /**
     * Sets the codigoJustificativaMaiorTarifa value for this Seguro.
     * 
     * @param codigoJustificativaMaiorTarifa
     */
    public void setCodigoJustificativaMaiorTarifa(java.lang.String codigoJustificativaMaiorTarifa) {
        this.codigoJustificativaMaiorTarifa = codigoJustificativaMaiorTarifa;
    }


    /**
     * Gets the identificadorIntegracao value for this Seguro.
     * 
     * @return identificadorIntegracao
     */
    public java.lang.String getIdentificadorIntegracao() {
        return identificadorIntegracao;
    }


    /**
     * Sets the identificadorIntegracao value for this Seguro.
     * 
     * @param identificadorIntegracao
     */
    public void setIdentificadorIntegracao(java.lang.String identificadorIntegracao) {
        this.identificadorIntegracao = identificadorIntegracao;
    }


    /**
     * Gets the identificadorBackOfficeTipoProduto value for this Seguro.
     * 
     * @return identificadorBackOfficeTipoProduto
     */
    public java.lang.String getIdentificadorBackOfficeTipoProduto() {
        return identificadorBackOfficeTipoProduto;
    }


    /**
     * Sets the identificadorBackOfficeTipoProduto value for this Seguro.
     * 
     * @param identificadorBackOfficeTipoProduto
     */
    public void setIdentificadorBackOfficeTipoProduto(java.lang.String identificadorBackOfficeTipoProduto) {
        this.identificadorBackOfficeTipoProduto = identificadorBackOfficeTipoProduto;
    }


    /**
     * Gets the remarks value for this Seguro.
     * 
     * @return remarks
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this Seguro.
     * 
     * @param remarks
     */
    public void setRemarks(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[] remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the totalSeguro value for this Seguro.
     * 
     * @return totalSeguro
     */
    public java.lang.Double getTotalSeguro() {
        return totalSeguro;
    }


    /**
     * Sets the totalSeguro value for this Seguro.
     * 
     * @param totalSeguro
     */
    public void setTotalSeguro(java.lang.Double totalSeguro) {
        this.totalSeguro = totalSeguro;
    }


    /**
     * Gets the cancelado value for this Seguro.
     * 
     * @return cancelado
     */
    public boolean isCancelado() {
        return cancelado;
    }


    /**
     * Sets the cancelado value for this Seguro.
     * 
     * @param cancelado
     */
    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }


    /**
     * Gets the identificadoresIntegracao value for this Seguro.
     * 
     * @return identificadoresIntegracao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] getIdentificadoresIntegracao() {
        return identificadoresIntegracao;
    }


    /**
     * Sets the identificadoresIntegracao value for this Seguro.
     * 
     * @param identificadoresIntegracao
     */
    public void setIdentificadoresIntegracao(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[] identificadoresIntegracao) {
        this.identificadoresIntegracao = identificadoresIntegracao;
    }


    /**
     * Gets the taxaFee value for this Seguro.
     * 
     * @return taxaFee
     */
    public java.lang.Double getTaxaFee() {
        return taxaFee;
    }


    /**
     * Sets the taxaFee value for this Seguro.
     * 
     * @param taxaFee
     */
    public void setTaxaFee(java.lang.Double taxaFee) {
        this.taxaFee = taxaFee;
    }


    /**
     * Gets the consolidadora value for this Seguro.
     * 
     * @return consolidadora
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora getConsolidadora() {
        return consolidadora;
    }


    /**
     * Sets the consolidadora value for this Seguro.
     * 
     * @param consolidadora
     */
    public void setConsolidadora(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora) {
        this.consolidadora = consolidadora;
    }


    /**
     * Gets the moeda value for this Seguro.
     * 
     * @return moeda
     */
    public java.lang.String getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this Seguro.
     * 
     * @param moeda
     */
    public void setMoeda(java.lang.String moeda) {
        this.moeda = moeda;
    }


    /**
     * Gets the pontoVenda value for this Seguro.
     * 
     * @return pontoVenda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento getPontoVenda() {
        return pontoVenda;
    }


    /**
     * Sets the pontoVenda value for this Seguro.
     * 
     * @param pontoVenda
     */
    public void setPontoVenda(br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda) {
        this.pontoVenda = pontoVenda;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Seguro)) return false;
        Seguro other = (Seguro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.nomeSeguro==null && other.getNomeSeguro()==null) || 
             (this.nomeSeguro!=null &&
              this.nomeSeguro.equals(other.getNomeSeguro()))) &&
            ((this.nomeSeguradora==null && other.getNomeSeguradora()==null) || 
             (this.nomeSeguradora!=null &&
              this.nomeSeguradora.equals(other.getNomeSeguradora()))) &&
            ((this.dataInicialVigencia==null && other.getDataInicialVigencia()==null) || 
             (this.dataInicialVigencia!=null &&
              this.dataInicialVigencia.equals(other.getDataInicialVigencia()))) &&
            ((this.dataFinalVigencia==null && other.getDataFinalVigencia()==null) || 
             (this.dataFinalVigencia!=null &&
              this.dataFinalVigencia.equals(other.getDataFinalVigencia()))) &&
            ((this.origem==null && other.getOrigem()==null) || 
             (this.origem!=null &&
              this.origem.equals(other.getOrigem()))) &&
            ((this.destino==null && other.getDestino()==null) || 
             (this.destino!=null &&
              this.destino.equals(other.getDestino()))) &&
            ((this.certificado==null && other.getCertificado()==null) || 
             (this.certificado!=null &&
              this.certificado.equals(other.getCertificado()))) &&
            ((this.valorPremio==null && other.getValorPremio()==null) || 
             (this.valorPremio!=null &&
              this.valorPremio.equals(other.getValorPremio()))) &&
            ((this.coberturas==null && other.getCoberturas()==null) || 
             (this.coberturas!=null &&
              java.util.Arrays.equals(this.coberturas, other.getCoberturas()))) &&
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
            ((this.identificadorBackOfficeTipoProduto==null && other.getIdentificadorBackOfficeTipoProduto()==null) || 
             (this.identificadorBackOfficeTipoProduto!=null &&
              this.identificadorBackOfficeTipoProduto.equals(other.getIdentificadorBackOfficeTipoProduto()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks()))) &&
            ((this.totalSeguro==null && other.getTotalSeguro()==null) || 
             (this.totalSeguro!=null &&
              this.totalSeguro.equals(other.getTotalSeguro()))) &&
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
        if (getNomeSeguro() != null) {
            _hashCode += getNomeSeguro().hashCode();
        }
        if (getNomeSeguradora() != null) {
            _hashCode += getNomeSeguradora().hashCode();
        }
        if (getDataInicialVigencia() != null) {
            _hashCode += getDataInicialVigencia().hashCode();
        }
        if (getDataFinalVigencia() != null) {
            _hashCode += getDataFinalVigencia().hashCode();
        }
        if (getOrigem() != null) {
            _hashCode += getOrigem().hashCode();
        }
        if (getDestino() != null) {
            _hashCode += getDestino().hashCode();
        }
        if (getCertificado() != null) {
            _hashCode += getCertificado().hashCode();
        }
        if (getValorPremio() != null) {
            _hashCode += getValorPremio().hashCode();
        }
        if (getCoberturas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoberturas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoberturas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getTotalSeguro() != null) {
            _hashCode += getTotalSeguro().hashCode();
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
        new org.apache.axis.description.TypeDesc(Seguro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/seguro", "seguro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeSeguro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeSeguro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeSeguradora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeSeguradora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicialVigencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInicialVigencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFinalVigencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataFinalVigencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorPremio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorPremio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coberturas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coberturas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "cobertura"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "cobertura"));
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
        elemField.setFieldName("totalSeguro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalSeguro"));
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
