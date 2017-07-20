package br.com.lemontech.selfbooking.wsselfbooking.services;

public class WsSelfBookingProxy implements br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBooking {
  private String _endpoint = null;
  private br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBooking wsSelfBooking = null;
  
  public WsSelfBookingProxy() {
    _initWsSelfBookingProxy();
  }
  
  public WsSelfBookingProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsSelfBookingProxy();
  }
  
  private void _initWsSelfBookingProxy() {
    try {
      wsSelfBooking = (new br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBookingServiceLocator()).getWsSelfBookingPort();
      if (wsSelfBooking != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsSelfBooking)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsSelfBooking)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsSelfBooking != null)
      ((javax.xml.rpc.Stub)wsSelfBooking)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBooking getWsSelfBooking() {
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking;
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse pesquisarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest pesquisarSolicitacao) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.pesquisarSolicitacao(keyClient, userName, userPassword, pesquisarSolicitacao);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.SincronizarSolicitacaoResponse sincronizarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.SincronizarSolicitacaoRequest sincronizarSolicitacao) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.sincronizarSolicitacao(keyClient, userName, userPassword, sincronizarSolicitacao);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarRegionalResponse cadastrarRegional(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarRegionalRequest cadastrarRegional) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.cadastrarRegional(keyClient, userName, userPassword, cadastrarRegional);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusRegionalResponse alterarStatusRegional(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusRegionalRequest alterarStatusRegional) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.alterarStatusRegional(keyClient, userName, userPassword, alterarStatusRegional);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarContaContabilResponse cadastrarContaContabil(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarContaContabilRequest cadastrarContaContabil) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.cadastrarContaContabil(keyClient, userName, userPassword, cadastrarContaContabil);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusContaContabilResponse alterarStatusContaContabil(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusContaContabilRequest alterarStatusContaContabil) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.alterarStatusContaContabil(keyClient, userName, userPassword, alterarStatusContaContabil);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarCentroDeCustoResponse cadastrarCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarCentroDeCustoRequest cadastrarCentroDeCusto) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.cadastrarCentroDeCusto(keyClient, userName, userPassword, cadastrarCentroDeCusto);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusCentroDeCustoResponse alterarStatusCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusCentroDeCustoRequest alterarStatusCentroDeCusto) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.alterarStatusCentroDeCusto(keyClient, userName, userPassword, alterarStatusCentroDeCusto);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarSubCentroDeCustoResponse cadastrarSubCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarSubCentroDeCustoRequest cadastrarSubCentroDeCusto) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.cadastrarSubCentroDeCusto(keyClient, userName, userPassword, cadastrarSubCentroDeCusto);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusSubCentroDeCustoResponse alterarStatusSubCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusSubCentroDeCustoRequest alterarStatusSubCentroDeCusto) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.alterarStatusSubCentroDeCusto(keyClient, userName, userPassword, alterarStatusSubCentroDeCusto);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoCentroDeCustoResponse cadastrarParametrizacaoCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParametrizacaoCentroDeCustoRequest cadastrarParametrizacaoCentroDeCusto) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.cadastrarParametrizacaoCentroDeCusto(keyClient, userName, userPassword, cadastrarParametrizacaoCentroDeCusto);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoCentroDeCustoResponse deletarParametrizacaoCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParametrizacaoCentroDeCustoRequest deletarParametrizacaoCentroDeCusto) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.deletarParametrizacaoCentroDeCusto(keyClient, userName, userPassword, deletarParametrizacaoCentroDeCusto);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFuncionarioResponse cadastrarFuncionario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFuncionarioRequest cadastrarFuncionario) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.cadastrarFuncionario(keyClient, userName, userPassword, cadastrarFuncionario);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarFuncionarioResponse pesquisarFuncionario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarFuncionarioRequest pesquisarFuncionario) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.pesquisarFuncionario(keyClient, userName, userPassword, pesquisarFuncionario);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFuncionarioResponse alterarStatusFuncionario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusFuncionarioRequest alterarStatusFuncionario) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.alterarStatusFuncionario(keyClient, userName, userPassword, alterarStatusFuncionario);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorResponse cadastrarFornecedor(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFornecedorRequest cadastrarFornecedor) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.cadastrarFornecedor(keyClient, userName, userPassword, cadastrarFornecedor);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFornecedorResponse alterarStatusFornecedor(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusFornecedorRequest alterarStatusFornecedor) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.alterarStatusFornecedor(keyClient, userName, userPassword, alterarStatusFornecedor);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarTarifarioResponse cadastrarTarifario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarTarifarioRequest cadastrarTarifario) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.cadastrarTarifario(keyClient, userName, userPassword, cadastrarTarifario);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusTarifarioResponse alterarStatusTarifario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusTarifarioRequest alterarStatusTarifario) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.alterarStatusTarifario(keyClient, userName, userPassword, alterarStatusTarifario);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.AprovarSolicitacaoResponse aprovarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AprovarSolicitacaoRequest aprovarSolicitacao) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.aprovarSolicitacao(keyClient, userName, userPassword, aprovarSolicitacao);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.ReprovarSolicitacaoResponse reprovarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.ReprovarSolicitacaoRequest reprovarSolicitacao) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.reprovarSolicitacao(keyClient, userName, userPassword, reprovarSolicitacao);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirIdentificadorIntegracaoResponse inserirIdentificadorIntegracao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.InserirIdentificadorIntegracaoRequest inserirIdentificadorIntegracao) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.inserirIdentificadorIntegracao(keyClient, userName, userPassword, inserirIdentificadorIntegracao);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoViajanteResponse cadastrarParametrizacaoViajante(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParametrizacaoViajanteRequest cadastrarParametrizacaoViajante) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.cadastrarParametrizacaoViajante(keyClient, userName, userPassword, cadastrarParametrizacaoViajante);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoViajanteResponse deletarParametrizacaoViajante(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParametrizacaoViajanteRequest deletarParametrizacaoViajante) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.deletarParametrizacaoViajante(keyClient, userName, userPassword, deletarParametrizacaoViajante);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarVendasConsolidadoraResponse pesquisarVendasConsolidadora(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarVendasConsolidadoraRequest pesquisarVendasConsolidadora) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.pesquisarVendasConsolidadora(keyClient, userName, userPassword, pesquisarVendasConsolidadora);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorSourceResponse cadastrarFornecedorSource(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFornecedorSourceRequest cadastrarFornecedorSource) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.cadastrarFornecedorSource(keyClient, userName, userPassword, cadastrarFornecedorSource);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirItemDespesaResponse inserirItemDespesa(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.InserirItemDespesaRequest inserirItemDespesa) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.inserirItemDespesa(keyClient, userName, userPassword, inserirItemDespesa);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarProjetoResponse cadastrarProjeto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarProjetoRequest cadastrarProjeto) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.cadastrarProjeto(keyClient, userName, userPassword, cadastrarProjeto);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusProjetoResponse alterarStatusProjeto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusProjetoRequest alterarStatusProjeto) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.alterarStatusProjeto(keyClient, userName, userPassword, alterarStatusProjeto);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.AtualizarBudgetResponse atualizarBudget(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AtualizarBudgetRequest atualizarBudget) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.atualizarBudget(keyClient, userName, userPassword, atualizarBudget);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.ConsultaBilheteCiaResponse consultaBilheteCia(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.ConsultaBilheteCiaRequest consultaBilheteCia) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.consultaBilheteCia(keyClient, userName, userPassword, consultaBilheteCia);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarHoteisHomologadosResponse cadastrarHoteisHomologados(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarHoteisHomologadosRequest cadastrarHoteisHomologados) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.cadastrarHoteisHomologados(keyClient, userName, userPassword, cadastrarHoteisHomologados);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.AtrelarUsuariosResponse atrelarUsuarios(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AtrelarUsuariosRequest atrelarUsuarios) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.atrelarUsuarios(keyClient, userName, userPassword, atrelarUsuarios);
  }
  
  public br.com.lemontech.selfbooking.wsselfbooking.services.response.FinalizarSolicitacaoResponse finalizarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.FinalizarSolicitacaoRequest finalizarSolicitacao) throws java.rmi.RemoteException{
    if (wsSelfBooking == null)
      _initWsSelfBookingProxy();
    return wsSelfBooking.finalizarSolicitacao(keyClient, userName, userPassword, finalizarSolicitacao);
  }
  
  
}