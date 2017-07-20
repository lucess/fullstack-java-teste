/**
 * Traslado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.traslado;

public class Traslado  implements java.io.Serializable {
    private int id;

    private java.util.Calendar dataOrigem;

    private java.lang.String paisOrigem;

    private java.lang.String estadoOrigem;

    private java.lang.String cidadeOrigem;

    private java.lang.String enderecoOrigem;

    private java.lang.String paisDestino;

    private java.lang.String estadoDestino;

    private java.lang.String cidadeDestino;

    private java.lang.String enderecoDestino;

    private java.lang.Double valor;

    private java.lang.Double taxa;

    private java.lang.Double taxaFee;

    private java.lang.String moeda;

    private java.lang.String codigoTipoPagamento;

    private java.lang.String fornecedor;

    private java.lang.String codigoFornecedorBackOffice;

    private java.lang.String modeloVeiculo;

    private java.lang.String nomeMotorista;

    private java.lang.String contato;

    private java.lang.String observacaoOrcamento;

    private java.lang.String obsemissor;

    private java.lang.String codigoControleAgencia;

    private java.util.Calendar dataCadastro;

    private java.util.Calendar dataVencimento;

    private boolean aprovado;

    private boolean canceladoEmitido;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora;

    private java.lang.String nomeConsultorReserva;

    private java.lang.String nomeConsultorEmissao;

    private java.lang.String justificativamaiortarifa;

    private java.lang.Integer sequenciaProdutoAgencia;

    private java.lang.String statusPagamentoFatura;

    private java.lang.Integer statusCancelamento;

    private java.lang.Double taxaCancelamento;

    private java.util.Calendar dataModificacaoStatusCancelamento;

    private java.lang.String nomeUsuarioModificouStatusCancelamento;

    private java.lang.String unidadeOperacional;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda;

    public Traslado() {
    }

    public Traslado(
           int id,
           java.util.Calendar dataOrigem,
           java.lang.String paisOrigem,
           java.lang.String estadoOrigem,
           java.lang.String cidadeOrigem,
           java.lang.String enderecoOrigem,
           java.lang.String paisDestino,
           java.lang.String estadoDestino,
           java.lang.String cidadeDestino,
           java.lang.String enderecoDestino,
           java.lang.Double valor,
           java.lang.Double taxa,
           java.lang.Double taxaFee,
           java.lang.String moeda,
           java.lang.String codigoTipoPagamento,
           java.lang.String fornecedor,
           java.lang.String codigoFornecedorBackOffice,
           java.lang.String modeloVeiculo,
           java.lang.String nomeMotorista,
           java.lang.String contato,
           java.lang.String observacaoOrcamento,
           java.lang.String obsemissor,
           java.lang.String codigoControleAgencia,
           java.util.Calendar dataCadastro,
           java.util.Calendar dataVencimento,
           boolean aprovado,
           boolean canceladoEmitido,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora,
           java.lang.String nomeConsultorReserva,
           java.lang.String nomeConsultorEmissao,
           java.lang.String justificativamaiortarifa,
           java.lang.Integer sequenciaProdutoAgencia,
           java.lang.String statusPagamentoFatura,
           java.lang.Integer statusCancelamento,
           java.lang.Double taxaCancelamento,
           java.util.Calendar dataModificacaoStatusCancelamento,
           java.lang.String nomeUsuarioModificouStatusCancelamento,
           java.lang.String unidadeOperacional,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda) {
           this.id = id;
           this.dataOrigem = dataOrigem;
           this.paisOrigem = paisOrigem;
           this.estadoOrigem = estadoOrigem;
           this.cidadeOrigem = cidadeOrigem;
           this.enderecoOrigem = enderecoOrigem;
           this.paisDestino = paisDestino;
           this.estadoDestino = estadoDestino;
           this.cidadeDestino = cidadeDestino;
           this.enderecoDestino = enderecoDestino;
           this.valor = valor;
           this.taxa = taxa;
           this.taxaFee = taxaFee;
           this.moeda = moeda;
           this.codigoTipoPagamento = codigoTipoPagamento;
           this.fornecedor = fornecedor;
           this.codigoFornecedorBackOffice = codigoFornecedorBackOffice;
           this.modeloVeiculo = modeloVeiculo;
           this.nomeMotorista = nomeMotorista;
           this.contato = contato;
           this.observacaoOrcamento = observacaoOrcamento;
           this.obsemissor = obsemissor;
           this.codigoControleAgencia = codigoControleAgencia;
           this.dataCadastro = dataCadastro;
           this.dataVencimento = dataVencimento;
           this.aprovado = aprovado;
           this.canceladoEmitido = canceladoEmitido;
           this.consolidadora = consolidadora;
           this.nomeConsultorReserva = nomeConsultorReserva;
           this.nomeConsultorEmissao = nomeConsultorEmissao;
           this.justificativamaiortarifa = justificativamaiortarifa;
           this.sequenciaProdutoAgencia = sequenciaProdutoAgencia;
           this.statusPagamentoFatura = statusPagamentoFatura;
           this.statusCancelamento = statusCancelamento;
           this.taxaCancelamento = taxaCancelamento;
           this.dataModificacaoStatusCancelamento = dataModificacaoStatusCancelamento;
           this.nomeUsuarioModificouStatusCancelamento = nomeUsuarioModificouStatusCancelamento;
           this.unidadeOperacional = unidadeOperacional;
           this.pontoVenda = pontoVenda;
    }


    /**
     * Gets the id value for this Traslado.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Traslado.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the dataOrigem value for this Traslado.
     * 
     * @return dataOrigem
     */
    public java.util.Calendar getDataOrigem() {
        return dataOrigem;
    }


    /**
     * Sets the dataOrigem value for this Traslado.
     * 
     * @param dataOrigem
     */
    public void setDataOrigem(java.util.Calendar dataOrigem) {
        this.dataOrigem = dataOrigem;
    }


    /**
     * Gets the paisOrigem value for this Traslado.
     * 
     * @return paisOrigem
     */
    public java.lang.String getPaisOrigem() {
        return paisOrigem;
    }


    /**
     * Sets the paisOrigem value for this Traslado.
     * 
     * @param paisOrigem
     */
    public void setPaisOrigem(java.lang.String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }


    /**
     * Gets the estadoOrigem value for this Traslado.
     * 
     * @return estadoOrigem
     */
    public java.lang.String getEstadoOrigem() {
        return estadoOrigem;
    }


    /**
     * Sets the estadoOrigem value for this Traslado.
     * 
     * @param estadoOrigem
     */
    public void setEstadoOrigem(java.lang.String estadoOrigem) {
        this.estadoOrigem = estadoOrigem;
    }


    /**
     * Gets the cidadeOrigem value for this Traslado.
     * 
     * @return cidadeOrigem
     */
    public java.lang.String getCidadeOrigem() {
        return cidadeOrigem;
    }


    /**
     * Sets the cidadeOrigem value for this Traslado.
     * 
     * @param cidadeOrigem
     */
    public void setCidadeOrigem(java.lang.String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }


    /**
     * Gets the enderecoOrigem value for this Traslado.
     * 
     * @return enderecoOrigem
     */
    public java.lang.String getEnderecoOrigem() {
        return enderecoOrigem;
    }


    /**
     * Sets the enderecoOrigem value for this Traslado.
     * 
     * @param enderecoOrigem
     */
    public void setEnderecoOrigem(java.lang.String enderecoOrigem) {
        this.enderecoOrigem = enderecoOrigem;
    }


    /**
     * Gets the paisDestino value for this Traslado.
     * 
     * @return paisDestino
     */
    public java.lang.String getPaisDestino() {
        return paisDestino;
    }


    /**
     * Sets the paisDestino value for this Traslado.
     * 
     * @param paisDestino
     */
    public void setPaisDestino(java.lang.String paisDestino) {
        this.paisDestino = paisDestino;
    }


    /**
     * Gets the estadoDestino value for this Traslado.
     * 
     * @return estadoDestino
     */
    public java.lang.String getEstadoDestino() {
        return estadoDestino;
    }


    /**
     * Sets the estadoDestino value for this Traslado.
     * 
     * @param estadoDestino
     */
    public void setEstadoDestino(java.lang.String estadoDestino) {
        this.estadoDestino = estadoDestino;
    }


    /**
     * Gets the cidadeDestino value for this Traslado.
     * 
     * @return cidadeDestino
     */
    public java.lang.String getCidadeDestino() {
        return cidadeDestino;
    }


    /**
     * Sets the cidadeDestino value for this Traslado.
     * 
     * @param cidadeDestino
     */
    public void setCidadeDestino(java.lang.String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }


    /**
     * Gets the enderecoDestino value for this Traslado.
     * 
     * @return enderecoDestino
     */
    public java.lang.String getEnderecoDestino() {
        return enderecoDestino;
    }


    /**
     * Sets the enderecoDestino value for this Traslado.
     * 
     * @param enderecoDestino
     */
    public void setEnderecoDestino(java.lang.String enderecoDestino) {
        this.enderecoDestino = enderecoDestino;
    }


    /**
     * Gets the valor value for this Traslado.
     * 
     * @return valor
     */
    public java.lang.Double getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this Traslado.
     * 
     * @param valor
     */
    public void setValor(java.lang.Double valor) {
        this.valor = valor;
    }


    /**
     * Gets the taxa value for this Traslado.
     * 
     * @return taxa
     */
    public java.lang.Double getTaxa() {
        return taxa;
    }


    /**
     * Sets the taxa value for this Traslado.
     * 
     * @param taxa
     */
    public void setTaxa(java.lang.Double taxa) {
        this.taxa = taxa;
    }


    /**
     * Gets the taxaFee value for this Traslado.
     * 
     * @return taxaFee
     */
    public java.lang.Double getTaxaFee() {
        return taxaFee;
    }


    /**
     * Sets the taxaFee value for this Traslado.
     * 
     * @param taxaFee
     */
    public void setTaxaFee(java.lang.Double taxaFee) {
        this.taxaFee = taxaFee;
    }


    /**
     * Gets the moeda value for this Traslado.
     * 
     * @return moeda
     */
    public java.lang.String getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this Traslado.
     * 
     * @param moeda
     */
    public void setMoeda(java.lang.String moeda) {
        this.moeda = moeda;
    }


    /**
     * Gets the codigoTipoPagamento value for this Traslado.
     * 
     * @return codigoTipoPagamento
     */
    public java.lang.String getCodigoTipoPagamento() {
        return codigoTipoPagamento;
    }


    /**
     * Sets the codigoTipoPagamento value for this Traslado.
     * 
     * @param codigoTipoPagamento
     */
    public void setCodigoTipoPagamento(java.lang.String codigoTipoPagamento) {
        this.codigoTipoPagamento = codigoTipoPagamento;
    }


    /**
     * Gets the fornecedor value for this Traslado.
     * 
     * @return fornecedor
     */
    public java.lang.String getFornecedor() {
        return fornecedor;
    }


    /**
     * Sets the fornecedor value for this Traslado.
     * 
     * @param fornecedor
     */
    public void setFornecedor(java.lang.String fornecedor) {
        this.fornecedor = fornecedor;
    }


    /**
     * Gets the codigoFornecedorBackOffice value for this Traslado.
     * 
     * @return codigoFornecedorBackOffice
     */
    public java.lang.String getCodigoFornecedorBackOffice() {
        return codigoFornecedorBackOffice;
    }


    /**
     * Sets the codigoFornecedorBackOffice value for this Traslado.
     * 
     * @param codigoFornecedorBackOffice
     */
    public void setCodigoFornecedorBackOffice(java.lang.String codigoFornecedorBackOffice) {
        this.codigoFornecedorBackOffice = codigoFornecedorBackOffice;
    }


    /**
     * Gets the modeloVeiculo value for this Traslado.
     * 
     * @return modeloVeiculo
     */
    public java.lang.String getModeloVeiculo() {
        return modeloVeiculo;
    }


    /**
     * Sets the modeloVeiculo value for this Traslado.
     * 
     * @param modeloVeiculo
     */
    public void setModeloVeiculo(java.lang.String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }


    /**
     * Gets the nomeMotorista value for this Traslado.
     * 
     * @return nomeMotorista
     */
    public java.lang.String getNomeMotorista() {
        return nomeMotorista;
    }


    /**
     * Sets the nomeMotorista value for this Traslado.
     * 
     * @param nomeMotorista
     */
    public void setNomeMotorista(java.lang.String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }


    /**
     * Gets the contato value for this Traslado.
     * 
     * @return contato
     */
    public java.lang.String getContato() {
        return contato;
    }


    /**
     * Sets the contato value for this Traslado.
     * 
     * @param contato
     */
    public void setContato(java.lang.String contato) {
        this.contato = contato;
    }


    /**
     * Gets the observacaoOrcamento value for this Traslado.
     * 
     * @return observacaoOrcamento
     */
    public java.lang.String getObservacaoOrcamento() {
        return observacaoOrcamento;
    }


    /**
     * Sets the observacaoOrcamento value for this Traslado.
     * 
     * @param observacaoOrcamento
     */
    public void setObservacaoOrcamento(java.lang.String observacaoOrcamento) {
        this.observacaoOrcamento = observacaoOrcamento;
    }


    /**
     * Gets the obsemissor value for this Traslado.
     * 
     * @return obsemissor
     */
    public java.lang.String getObsemissor() {
        return obsemissor;
    }


    /**
     * Sets the obsemissor value for this Traslado.
     * 
     * @param obsemissor
     */
    public void setObsemissor(java.lang.String obsemissor) {
        this.obsemissor = obsemissor;
    }


    /**
     * Gets the codigoControleAgencia value for this Traslado.
     * 
     * @return codigoControleAgencia
     */
    public java.lang.String getCodigoControleAgencia() {
        return codigoControleAgencia;
    }


    /**
     * Sets the codigoControleAgencia value for this Traslado.
     * 
     * @param codigoControleAgencia
     */
    public void setCodigoControleAgencia(java.lang.String codigoControleAgencia) {
        this.codigoControleAgencia = codigoControleAgencia;
    }


    /**
     * Gets the dataCadastro value for this Traslado.
     * 
     * @return dataCadastro
     */
    public java.util.Calendar getDataCadastro() {
        return dataCadastro;
    }


    /**
     * Sets the dataCadastro value for this Traslado.
     * 
     * @param dataCadastro
     */
    public void setDataCadastro(java.util.Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


    /**
     * Gets the dataVencimento value for this Traslado.
     * 
     * @return dataVencimento
     */
    public java.util.Calendar getDataVencimento() {
        return dataVencimento;
    }


    /**
     * Sets the dataVencimento value for this Traslado.
     * 
     * @param dataVencimento
     */
    public void setDataVencimento(java.util.Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }


    /**
     * Gets the aprovado value for this Traslado.
     * 
     * @return aprovado
     */
    public boolean isAprovado() {
        return aprovado;
    }


    /**
     * Sets the aprovado value for this Traslado.
     * 
     * @param aprovado
     */
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }


    /**
     * Gets the canceladoEmitido value for this Traslado.
     * 
     * @return canceladoEmitido
     */
    public boolean isCanceladoEmitido() {
        return canceladoEmitido;
    }


    /**
     * Sets the canceladoEmitido value for this Traslado.
     * 
     * @param canceladoEmitido
     */
    public void setCanceladoEmitido(boolean canceladoEmitido) {
        this.canceladoEmitido = canceladoEmitido;
    }


    /**
     * Gets the consolidadora value for this Traslado.
     * 
     * @return consolidadora
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora getConsolidadora() {
        return consolidadora;
    }


    /**
     * Sets the consolidadora value for this Traslado.
     * 
     * @param consolidadora
     */
    public void setConsolidadora(br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora consolidadora) {
        this.consolidadora = consolidadora;
    }


    /**
     * Gets the nomeConsultorReserva value for this Traslado.
     * 
     * @return nomeConsultorReserva
     */
    public java.lang.String getNomeConsultorReserva() {
        return nomeConsultorReserva;
    }


    /**
     * Sets the nomeConsultorReserva value for this Traslado.
     * 
     * @param nomeConsultorReserva
     */
    public void setNomeConsultorReserva(java.lang.String nomeConsultorReserva) {
        this.nomeConsultorReserva = nomeConsultorReserva;
    }


    /**
     * Gets the nomeConsultorEmissao value for this Traslado.
     * 
     * @return nomeConsultorEmissao
     */
    public java.lang.String getNomeConsultorEmissao() {
        return nomeConsultorEmissao;
    }


    /**
     * Sets the nomeConsultorEmissao value for this Traslado.
     * 
     * @param nomeConsultorEmissao
     */
    public void setNomeConsultorEmissao(java.lang.String nomeConsultorEmissao) {
        this.nomeConsultorEmissao = nomeConsultorEmissao;
    }


    /**
     * Gets the justificativamaiortarifa value for this Traslado.
     * 
     * @return justificativamaiortarifa
     */
    public java.lang.String getJustificativamaiortarifa() {
        return justificativamaiortarifa;
    }


    /**
     * Sets the justificativamaiortarifa value for this Traslado.
     * 
     * @param justificativamaiortarifa
     */
    public void setJustificativamaiortarifa(java.lang.String justificativamaiortarifa) {
        this.justificativamaiortarifa = justificativamaiortarifa;
    }


    /**
     * Gets the sequenciaProdutoAgencia value for this Traslado.
     * 
     * @return sequenciaProdutoAgencia
     */
    public java.lang.Integer getSequenciaProdutoAgencia() {
        return sequenciaProdutoAgencia;
    }


    /**
     * Sets the sequenciaProdutoAgencia value for this Traslado.
     * 
     * @param sequenciaProdutoAgencia
     */
    public void setSequenciaProdutoAgencia(java.lang.Integer sequenciaProdutoAgencia) {
        this.sequenciaProdutoAgencia = sequenciaProdutoAgencia;
    }


    /**
     * Gets the statusPagamentoFatura value for this Traslado.
     * 
     * @return statusPagamentoFatura
     */
    public java.lang.String getStatusPagamentoFatura() {
        return statusPagamentoFatura;
    }


    /**
     * Sets the statusPagamentoFatura value for this Traslado.
     * 
     * @param statusPagamentoFatura
     */
    public void setStatusPagamentoFatura(java.lang.String statusPagamentoFatura) {
        this.statusPagamentoFatura = statusPagamentoFatura;
    }


    /**
     * Gets the statusCancelamento value for this Traslado.
     * 
     * @return statusCancelamento
     */
    public java.lang.Integer getStatusCancelamento() {
        return statusCancelamento;
    }


    /**
     * Sets the statusCancelamento value for this Traslado.
     * 
     * @param statusCancelamento
     */
    public void setStatusCancelamento(java.lang.Integer statusCancelamento) {
        this.statusCancelamento = statusCancelamento;
    }


    /**
     * Gets the taxaCancelamento value for this Traslado.
     * 
     * @return taxaCancelamento
     */
    public java.lang.Double getTaxaCancelamento() {
        return taxaCancelamento;
    }


    /**
     * Sets the taxaCancelamento value for this Traslado.
     * 
     * @param taxaCancelamento
     */
    public void setTaxaCancelamento(java.lang.Double taxaCancelamento) {
        this.taxaCancelamento = taxaCancelamento;
    }


    /**
     * Gets the dataModificacaoStatusCancelamento value for this Traslado.
     * 
     * @return dataModificacaoStatusCancelamento
     */
    public java.util.Calendar getDataModificacaoStatusCancelamento() {
        return dataModificacaoStatusCancelamento;
    }


    /**
     * Sets the dataModificacaoStatusCancelamento value for this Traslado.
     * 
     * @param dataModificacaoStatusCancelamento
     */
    public void setDataModificacaoStatusCancelamento(java.util.Calendar dataModificacaoStatusCancelamento) {
        this.dataModificacaoStatusCancelamento = dataModificacaoStatusCancelamento;
    }


    /**
     * Gets the nomeUsuarioModificouStatusCancelamento value for this Traslado.
     * 
     * @return nomeUsuarioModificouStatusCancelamento
     */
    public java.lang.String getNomeUsuarioModificouStatusCancelamento() {
        return nomeUsuarioModificouStatusCancelamento;
    }


    /**
     * Sets the nomeUsuarioModificouStatusCancelamento value for this Traslado.
     * 
     * @param nomeUsuarioModificouStatusCancelamento
     */
    public void setNomeUsuarioModificouStatusCancelamento(java.lang.String nomeUsuarioModificouStatusCancelamento) {
        this.nomeUsuarioModificouStatusCancelamento = nomeUsuarioModificouStatusCancelamento;
    }


    /**
     * Gets the unidadeOperacional value for this Traslado.
     * 
     * @return unidadeOperacional
     */
    public java.lang.String getUnidadeOperacional() {
        return unidadeOperacional;
    }


    /**
     * Sets the unidadeOperacional value for this Traslado.
     * 
     * @param unidadeOperacional
     */
    public void setUnidadeOperacional(java.lang.String unidadeOperacional) {
        this.unidadeOperacional = unidadeOperacional;
    }


    /**
     * Gets the pontoVenda value for this Traslado.
     * 
     * @return pontoVenda
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento getPontoVenda() {
        return pontoVenda;
    }


    /**
     * Sets the pontoVenda value for this Traslado.
     * 
     * @param pontoVenda
     */
    public void setPontoVenda(br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento pontoVenda) {
        this.pontoVenda = pontoVenda;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Traslado)) return false;
        Traslado other = (Traslado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.dataOrigem==null && other.getDataOrigem()==null) || 
             (this.dataOrigem!=null &&
              this.dataOrigem.equals(other.getDataOrigem()))) &&
            ((this.paisOrigem==null && other.getPaisOrigem()==null) || 
             (this.paisOrigem!=null &&
              this.paisOrigem.equals(other.getPaisOrigem()))) &&
            ((this.estadoOrigem==null && other.getEstadoOrigem()==null) || 
             (this.estadoOrigem!=null &&
              this.estadoOrigem.equals(other.getEstadoOrigem()))) &&
            ((this.cidadeOrigem==null && other.getCidadeOrigem()==null) || 
             (this.cidadeOrigem!=null &&
              this.cidadeOrigem.equals(other.getCidadeOrigem()))) &&
            ((this.enderecoOrigem==null && other.getEnderecoOrigem()==null) || 
             (this.enderecoOrigem!=null &&
              this.enderecoOrigem.equals(other.getEnderecoOrigem()))) &&
            ((this.paisDestino==null && other.getPaisDestino()==null) || 
             (this.paisDestino!=null &&
              this.paisDestino.equals(other.getPaisDestino()))) &&
            ((this.estadoDestino==null && other.getEstadoDestino()==null) || 
             (this.estadoDestino!=null &&
              this.estadoDestino.equals(other.getEstadoDestino()))) &&
            ((this.cidadeDestino==null && other.getCidadeDestino()==null) || 
             (this.cidadeDestino!=null &&
              this.cidadeDestino.equals(other.getCidadeDestino()))) &&
            ((this.enderecoDestino==null && other.getEnderecoDestino()==null) || 
             (this.enderecoDestino!=null &&
              this.enderecoDestino.equals(other.getEnderecoDestino()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor()))) &&
            ((this.taxa==null && other.getTaxa()==null) || 
             (this.taxa!=null &&
              this.taxa.equals(other.getTaxa()))) &&
            ((this.taxaFee==null && other.getTaxaFee()==null) || 
             (this.taxaFee!=null &&
              this.taxaFee.equals(other.getTaxaFee()))) &&
            ((this.moeda==null && other.getMoeda()==null) || 
             (this.moeda!=null &&
              this.moeda.equals(other.getMoeda()))) &&
            ((this.codigoTipoPagamento==null && other.getCodigoTipoPagamento()==null) || 
             (this.codigoTipoPagamento!=null &&
              this.codigoTipoPagamento.equals(other.getCodigoTipoPagamento()))) &&
            ((this.fornecedor==null && other.getFornecedor()==null) || 
             (this.fornecedor!=null &&
              this.fornecedor.equals(other.getFornecedor()))) &&
            ((this.codigoFornecedorBackOffice==null && other.getCodigoFornecedorBackOffice()==null) || 
             (this.codigoFornecedorBackOffice!=null &&
              this.codigoFornecedorBackOffice.equals(other.getCodigoFornecedorBackOffice()))) &&
            ((this.modeloVeiculo==null && other.getModeloVeiculo()==null) || 
             (this.modeloVeiculo!=null &&
              this.modeloVeiculo.equals(other.getModeloVeiculo()))) &&
            ((this.nomeMotorista==null && other.getNomeMotorista()==null) || 
             (this.nomeMotorista!=null &&
              this.nomeMotorista.equals(other.getNomeMotorista()))) &&
            ((this.contato==null && other.getContato()==null) || 
             (this.contato!=null &&
              this.contato.equals(other.getContato()))) &&
            ((this.observacaoOrcamento==null && other.getObservacaoOrcamento()==null) || 
             (this.observacaoOrcamento!=null &&
              this.observacaoOrcamento.equals(other.getObservacaoOrcamento()))) &&
            ((this.obsemissor==null && other.getObsemissor()==null) || 
             (this.obsemissor!=null &&
              this.obsemissor.equals(other.getObsemissor()))) &&
            ((this.codigoControleAgencia==null && other.getCodigoControleAgencia()==null) || 
             (this.codigoControleAgencia!=null &&
              this.codigoControleAgencia.equals(other.getCodigoControleAgencia()))) &&
            ((this.dataCadastro==null && other.getDataCadastro()==null) || 
             (this.dataCadastro!=null &&
              this.dataCadastro.equals(other.getDataCadastro()))) &&
            ((this.dataVencimento==null && other.getDataVencimento()==null) || 
             (this.dataVencimento!=null &&
              this.dataVencimento.equals(other.getDataVencimento()))) &&
            this.aprovado == other.isAprovado() &&
            this.canceladoEmitido == other.isCanceladoEmitido() &&
            ((this.consolidadora==null && other.getConsolidadora()==null) || 
             (this.consolidadora!=null &&
              this.consolidadora.equals(other.getConsolidadora()))) &&
            ((this.nomeConsultorReserva==null && other.getNomeConsultorReserva()==null) || 
             (this.nomeConsultorReserva!=null &&
              this.nomeConsultorReserva.equals(other.getNomeConsultorReserva()))) &&
            ((this.nomeConsultorEmissao==null && other.getNomeConsultorEmissao()==null) || 
             (this.nomeConsultorEmissao!=null &&
              this.nomeConsultorEmissao.equals(other.getNomeConsultorEmissao()))) &&
            ((this.justificativamaiortarifa==null && other.getJustificativamaiortarifa()==null) || 
             (this.justificativamaiortarifa!=null &&
              this.justificativamaiortarifa.equals(other.getJustificativamaiortarifa()))) &&
            ((this.sequenciaProdutoAgencia==null && other.getSequenciaProdutoAgencia()==null) || 
             (this.sequenciaProdutoAgencia!=null &&
              this.sequenciaProdutoAgencia.equals(other.getSequenciaProdutoAgencia()))) &&
            ((this.statusPagamentoFatura==null && other.getStatusPagamentoFatura()==null) || 
             (this.statusPagamentoFatura!=null &&
              this.statusPagamentoFatura.equals(other.getStatusPagamentoFatura()))) &&
            ((this.statusCancelamento==null && other.getStatusCancelamento()==null) || 
             (this.statusCancelamento!=null &&
              this.statusCancelamento.equals(other.getStatusCancelamento()))) &&
            ((this.taxaCancelamento==null && other.getTaxaCancelamento()==null) || 
             (this.taxaCancelamento!=null &&
              this.taxaCancelamento.equals(other.getTaxaCancelamento()))) &&
            ((this.dataModificacaoStatusCancelamento==null && other.getDataModificacaoStatusCancelamento()==null) || 
             (this.dataModificacaoStatusCancelamento!=null &&
              this.dataModificacaoStatusCancelamento.equals(other.getDataModificacaoStatusCancelamento()))) &&
            ((this.nomeUsuarioModificouStatusCancelamento==null && other.getNomeUsuarioModificouStatusCancelamento()==null) || 
             (this.nomeUsuarioModificouStatusCancelamento!=null &&
              this.nomeUsuarioModificouStatusCancelamento.equals(other.getNomeUsuarioModificouStatusCancelamento()))) &&
            ((this.unidadeOperacional==null && other.getUnidadeOperacional()==null) || 
             (this.unidadeOperacional!=null &&
              this.unidadeOperacional.equals(other.getUnidadeOperacional()))) &&
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
        if (getDataOrigem() != null) {
            _hashCode += getDataOrigem().hashCode();
        }
        if (getPaisOrigem() != null) {
            _hashCode += getPaisOrigem().hashCode();
        }
        if (getEstadoOrigem() != null) {
            _hashCode += getEstadoOrigem().hashCode();
        }
        if (getCidadeOrigem() != null) {
            _hashCode += getCidadeOrigem().hashCode();
        }
        if (getEnderecoOrigem() != null) {
            _hashCode += getEnderecoOrigem().hashCode();
        }
        if (getPaisDestino() != null) {
            _hashCode += getPaisDestino().hashCode();
        }
        if (getEstadoDestino() != null) {
            _hashCode += getEstadoDestino().hashCode();
        }
        if (getCidadeDestino() != null) {
            _hashCode += getCidadeDestino().hashCode();
        }
        if (getEnderecoDestino() != null) {
            _hashCode += getEnderecoDestino().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        if (getTaxa() != null) {
            _hashCode += getTaxa().hashCode();
        }
        if (getTaxaFee() != null) {
            _hashCode += getTaxaFee().hashCode();
        }
        if (getMoeda() != null) {
            _hashCode += getMoeda().hashCode();
        }
        if (getCodigoTipoPagamento() != null) {
            _hashCode += getCodigoTipoPagamento().hashCode();
        }
        if (getFornecedor() != null) {
            _hashCode += getFornecedor().hashCode();
        }
        if (getCodigoFornecedorBackOffice() != null) {
            _hashCode += getCodigoFornecedorBackOffice().hashCode();
        }
        if (getModeloVeiculo() != null) {
            _hashCode += getModeloVeiculo().hashCode();
        }
        if (getNomeMotorista() != null) {
            _hashCode += getNomeMotorista().hashCode();
        }
        if (getContato() != null) {
            _hashCode += getContato().hashCode();
        }
        if (getObservacaoOrcamento() != null) {
            _hashCode += getObservacaoOrcamento().hashCode();
        }
        if (getObsemissor() != null) {
            _hashCode += getObsemissor().hashCode();
        }
        if (getCodigoControleAgencia() != null) {
            _hashCode += getCodigoControleAgencia().hashCode();
        }
        if (getDataCadastro() != null) {
            _hashCode += getDataCadastro().hashCode();
        }
        if (getDataVencimento() != null) {
            _hashCode += getDataVencimento().hashCode();
        }
        _hashCode += (isAprovado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanceladoEmitido() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getConsolidadora() != null) {
            _hashCode += getConsolidadora().hashCode();
        }
        if (getNomeConsultorReserva() != null) {
            _hashCode += getNomeConsultorReserva().hashCode();
        }
        if (getNomeConsultorEmissao() != null) {
            _hashCode += getNomeConsultorEmissao().hashCode();
        }
        if (getJustificativamaiortarifa() != null) {
            _hashCode += getJustificativamaiortarifa().hashCode();
        }
        if (getSequenciaProdutoAgencia() != null) {
            _hashCode += getSequenciaProdutoAgencia().hashCode();
        }
        if (getStatusPagamentoFatura() != null) {
            _hashCode += getStatusPagamentoFatura().hashCode();
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
        if (getNomeUsuarioModificouStatusCancelamento() != null) {
            _hashCode += getNomeUsuarioModificouStatusCancelamento().hashCode();
        }
        if (getUnidadeOperacional() != null) {
            _hashCode += getUnidadeOperacional().hashCode();
        }
        if (getPontoVenda() != null) {
            _hashCode += getPontoVenda().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Traslado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/traslado", "traslado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paisOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paisOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidadeOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidadeOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enderecoOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enderecoOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paisDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paisDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidadeDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidadeDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enderecoDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enderecoDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
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
        elemField.setFieldName("taxaFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxaFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("codigoTipoPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoTipoPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fornecedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fornecedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoFornecedorBackOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoFornecedorBackOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeloVeiculo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeloVeiculo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeMotorista");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeMotorista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacaoOrcamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observacaoOrcamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obsemissor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "obsemissor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoControleAgencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoControleAgencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCadastro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCadastro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("aprovado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aprovado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canceladoEmitido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "canceladoEmitido"));
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
        elemField.setFieldName("nomeConsultorReserva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeConsultorReserva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeConsultorEmissao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeConsultorEmissao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justificativamaiortarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "justificativamaiortarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenciaProdutoAgencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequenciaProdutoAgencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusPagamentoFatura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusPagamentoFatura"));
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
        elemField.setFieldName("nomeUsuarioModificouStatusCancelamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeUsuarioModificouStatusCancelamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadeOperacional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidadeOperacional"));
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
