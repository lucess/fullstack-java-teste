/**
 * WsSelfBooking.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services;

public interface WsSelfBooking extends java.rmi.Remote {
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse pesquisarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest pesquisarSolicitacao) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.SincronizarSolicitacaoResponse sincronizarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.SincronizarSolicitacaoRequest sincronizarSolicitacao) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarRegionalResponse cadastrarRegional(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarRegionalRequest cadastrarRegional) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusRegionalResponse alterarStatusRegional(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusRegionalRequest alterarStatusRegional) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarContaContabilResponse cadastrarContaContabil(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarContaContabilRequest cadastrarContaContabil) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusContaContabilResponse alterarStatusContaContabil(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusContaContabilRequest alterarStatusContaContabil) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarCentroDeCustoResponse cadastrarCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarCentroDeCustoRequest cadastrarCentroDeCusto) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusCentroDeCustoResponse alterarStatusCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusCentroDeCustoRequest alterarStatusCentroDeCusto) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarSubCentroDeCustoResponse cadastrarSubCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarSubCentroDeCustoRequest cadastrarSubCentroDeCusto) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusSubCentroDeCustoResponse alterarStatusSubCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusSubCentroDeCustoRequest alterarStatusSubCentroDeCusto) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoCentroDeCustoResponse cadastrarParametrizacaoCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParametrizacaoCentroDeCustoRequest cadastrarParametrizacaoCentroDeCusto) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoCentroDeCustoResponse deletarParametrizacaoCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParametrizacaoCentroDeCustoRequest deletarParametrizacaoCentroDeCusto) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFuncionarioResponse cadastrarFuncionario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFuncionarioRequest cadastrarFuncionario) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarFuncionarioResponse pesquisarFuncionario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarFuncionarioRequest pesquisarFuncionario) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFuncionarioResponse alterarStatusFuncionario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusFuncionarioRequest alterarStatusFuncionario) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorResponse cadastrarFornecedor(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFornecedorRequest cadastrarFornecedor) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFornecedorResponse alterarStatusFornecedor(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusFornecedorRequest alterarStatusFornecedor) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarTarifarioResponse cadastrarTarifario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarTarifarioRequest cadastrarTarifario) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusTarifarioResponse alterarStatusTarifario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusTarifarioRequest alterarStatusTarifario) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AprovarSolicitacaoResponse aprovarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AprovarSolicitacaoRequest aprovarSolicitacao) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.ReprovarSolicitacaoResponse reprovarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.ReprovarSolicitacaoRequest reprovarSolicitacao) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirIdentificadorIntegracaoResponse inserirIdentificadorIntegracao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.InserirIdentificadorIntegracaoRequest inserirIdentificadorIntegracao) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoViajanteResponse cadastrarParametrizacaoViajante(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParametrizacaoViajanteRequest cadastrarParametrizacaoViajante) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoViajanteResponse deletarParametrizacaoViajante(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParametrizacaoViajanteRequest deletarParametrizacaoViajante) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarVendasConsolidadoraResponse pesquisarVendasConsolidadora(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarVendasConsolidadoraRequest pesquisarVendasConsolidadora) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorSourceResponse cadastrarFornecedorSource(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFornecedorSourceRequest cadastrarFornecedorSource) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirItemDespesaResponse inserirItemDespesa(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.InserirItemDespesaRequest inserirItemDespesa) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarProjetoResponse cadastrarProjeto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarProjetoRequest cadastrarProjeto) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusProjetoResponse alterarStatusProjeto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusProjetoRequest alterarStatusProjeto) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AtualizarBudgetResponse atualizarBudget(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AtualizarBudgetRequest atualizarBudget) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.ConsultaBilheteCiaResponse consultaBilheteCia(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.ConsultaBilheteCiaRequest consultaBilheteCia) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarHoteisHomologadosResponse cadastrarHoteisHomologados(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarHoteisHomologadosRequest cadastrarHoteisHomologados) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AtrelarUsuariosResponse atrelarUsuarios(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AtrelarUsuariosRequest atrelarUsuarios) throws java.rmi.RemoteException;
    public br.com.lemontech.selfbooking.wsselfbooking.services.response.FinalizarSolicitacaoResponse finalizarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.FinalizarSolicitacaoRequest finalizarSolicitacao) throws java.rmi.RemoteException;
}