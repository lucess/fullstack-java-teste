/**
 * WsSelfBookingPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services;

public class WsSelfBookingPortBindingStub extends org.apache.axis.client.Stub implements br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBooking {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[34];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pesquisarSolicitacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarSolicitacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "pesquisarSolicitacaoRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "pesquisarSolicitacaoResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarSolicitacaoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sincronizarSolicitacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "sincronizarSolicitacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "sincronizarSolicitacaoRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.SincronizarSolicitacaoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "sincronizarSolicitacaoResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.SincronizarSolicitacaoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "sincronizarSolicitacaoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cadastrarRegional");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarRegional"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarRegionalRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarRegionalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarRegionalResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarRegionalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarRegionalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("alterarStatusRegional");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusRegional"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusRegionalRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusRegionalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusRegionalResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusRegionalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusRegionalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cadastrarContaContabil");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarContaContabil"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarContaContabilRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarContaContabilRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarContaContabilResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarContaContabilResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarContaContabilResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("alterarStatusContaContabil");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusContaContabil"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusContaContabilRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusContaContabilRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusContaContabilResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusContaContabilResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusContaContabilResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cadastrarCentroDeCusto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarCentroDeCusto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarCentroDeCustoRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarCentroDeCustoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarCentroDeCustoResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarCentroDeCustoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarCentroDeCustoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("alterarStatusCentroDeCusto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusCentroDeCusto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusCentroDeCustoRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusCentroDeCustoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusCentroDeCustoResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusCentroDeCustoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusCentroDeCustoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cadastrarSubCentroDeCusto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarSubCentroDeCusto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarSubCentroDeCustoRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarSubCentroDeCustoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarSubCentroDeCustoResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarSubCentroDeCustoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarSubCentroDeCustoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("alterarStatusSubCentroDeCusto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusSubCentroDeCusto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusSubCentroDeCustoRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusSubCentroDeCustoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusSubCentroDeCustoResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusSubCentroDeCustoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusSubCentroDeCustoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cadastrarParametrizacaoCentroDeCusto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarParametrizacaoCentroDeCusto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarParametrizacaoCentroDeCustoRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParametrizacaoCentroDeCustoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarParametrizacaoCentroDeCustoResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoCentroDeCustoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarParametrizacaoCentroDeCustoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deletarParametrizacaoCentroDeCusto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarParametrizacaoCentroDeCusto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "deletarParametrizacaoCentroDeCustoRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParametrizacaoCentroDeCustoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "deletarParametrizacaoCentroDeCustoResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoCentroDeCustoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarParametrizacaoCentroDeCustoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cadastrarFuncionario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFuncionario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarFuncionarioRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFuncionarioRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarFuncionarioResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFuncionarioResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFuncionarioResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pesquisarFuncionario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarFuncionario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "pesquisarFuncionarioRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarFuncionarioRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "pesquisarFuncionarioResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarFuncionarioResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarFuncionarioResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("alterarStatusFuncionario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusFuncionario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusFuncionarioRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusFuncionarioRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusFuncionarioResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFuncionarioResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusFuncionarioResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cadastrarFornecedor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFornecedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarFornecedorRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFornecedorRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarFornecedorResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFornecedorResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("alterarStatusFornecedor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusFornecedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusFornecedorRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusFornecedorRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusFornecedorResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFornecedorResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusFornecedorResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cadastrarTarifario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarTarifario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarTarifarioRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarTarifarioRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarTarifarioResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarTarifarioResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarTarifarioResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("alterarStatusTarifario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusTarifario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusTarifarioRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusTarifarioRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusTarifarioResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusTarifarioResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusTarifarioResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aprovarSolicitacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "aprovarSolicitacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "aprovarSolicitacaoRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.AprovarSolicitacaoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "aprovarSolicitacaoResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.AprovarSolicitacaoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "aprovarSolicitacaoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reprovarSolicitacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "reprovarSolicitacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "reprovarSolicitacaoRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.ReprovarSolicitacaoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "reprovarSolicitacaoResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.ReprovarSolicitacaoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "reprovarSolicitacaoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserirIdentificadorIntegracao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "inserirIdentificadorIntegracao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "inserirIdentificadorIntegracaoRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.InserirIdentificadorIntegracaoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "inserirIdentificadorIntegracaoResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirIdentificadorIntegracaoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "inserirIdentificadorIntegracaoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cadastrarParametrizacaoViajante");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarParametrizacaoViajante"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarParametrizacaoViajanteRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParametrizacaoViajanteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarParametrizacaoViajanteResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoViajanteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarParametrizacaoViajanteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deletarParametrizacaoViajante");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarParametrizacaoViajante"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "deletarParametrizacaoViajanteRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParametrizacaoViajanteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "deletarParametrizacaoViajanteResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoViajanteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarParametrizacaoViajanteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pesquisarVendasConsolidadora");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarVendasConsolidadora"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "pesquisarVendasConsolidadoraRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarVendasConsolidadoraRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "pesquisarVendasConsolidadoraResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarVendasConsolidadoraResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarVendasConsolidadoraResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cadastrarFornecedorSource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFornecedorSource"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarFornecedorSourceRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFornecedorSourceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarFornecedorSourceResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorSourceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFornecedorSourceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserirItemDespesa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "inserirItemDespesa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "inserirItemDespesaRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.InserirItemDespesaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "inserirItemDespesaResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirItemDespesaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "inserirItemDespesaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cadastrarProjeto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarProjeto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarProjetoRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarProjetoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarProjetoResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarProjetoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarProjetoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("alterarStatusProjeto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusProjeto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusProjetoRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusProjetoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusProjetoResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusProjetoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusProjetoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizarBudget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "atualizarBudget"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "atualizarBudgetRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.AtualizarBudgetRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "atualizarBudgetResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.AtualizarBudgetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "atualizarBudgetResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaBilheteCia");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "consultaBilheteCia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "consultaBilheteCiaRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.ConsultaBilheteCiaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "consultaBilheteCiaResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.ConsultaBilheteCiaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "consultaBilheteCiaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cadastrarHoteisHomologados");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarHoteisHomologados"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarHoteisHomologadosRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarHoteisHomologadosRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarHoteisHomologadosResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarHoteisHomologadosResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarHoteisHomologadosResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atrelarUsuarios");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "atrelarUsuarios"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "atrelarUsuariosRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.AtrelarUsuariosRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "atrelarUsuariosResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.AtrelarUsuariosResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "atrelarUsuariosResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("finalizarSolicitacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "finalizarSolicitacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "finalizarSolicitacaoRequest"), br.com.lemontech.selfbooking.wsselfbooking.services.request.FinalizarSolicitacaoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "finalizarSolicitacaoResponse"));
        oper.setReturnClass(br.com.lemontech.selfbooking.wsselfbooking.services.response.FinalizarSolicitacaoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "finalizarSolicitacaoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

    }

    public WsSelfBookingPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WsSelfBookingPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WsSelfBookingPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereo");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoBilhete");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoBilhete.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoDetalheBaseTarifa");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoDetalheBaseTarifa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoDetalheParada");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoDetalheParada.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereos");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereo");
            qName2 = new javax.xml.namespace.QName("", "aereo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoSeguimento");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoTarifa");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoTarifa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoTarifaPax");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoTarifaPax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoVoo");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoVoo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoVooAssento");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoVooAssento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "cia");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Cia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "reemissao");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Reemissao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/carro", "carro");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.carro.Carro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/carro", "carros");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.carro.Carro[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/carro", "carro");
            qName2 = new javax.xml.namespace.QName("", "carro");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "adiantamento");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.expense.Adiantamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "adiantamentoItem");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.expense.AdiantamentoItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "adiantamentoItens");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.expense.AdiantamentoItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "adiantamentoItem");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "expense");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.expense.Expense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "prestacaoContaItem");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.expense.PrestacaoContaItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "prestacaoContaItens");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.expense.PrestacaoContaItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "prestacaoContaItem");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense", "prestacaoContas");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.expense.PrestacaoContas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", ">fornecedor>iata");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", ">fornecedor>uf");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "fornecedor");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.Fornecedor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "fornecedorClienteRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.FornecedorClienteRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "fornecedorRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.FornecedorRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorCarro");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorCarroRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarroRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorHotel");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorHotel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorHotelRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorHotelRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorOutro");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor", "tarifarioFornecedorOutroRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutroRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/hotel", "hoteis");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.Hotel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/hotel", "hotel");
            qName2 = new javax.xml.namespace.QName("", "hotel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/hotel", "hotel");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.Hotel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/outro", "outro");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.outro.Outro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/outro", "outros");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.outro.Outro[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/outro", "outro");
            qName2 = new javax.xml.namespace.QName("", "outros");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/rodoviario", "rodoviario");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.rodoviario.Rodoviario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/rodoviario", "rodoviarios");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.rodoviario.Rodoviario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/rodoviario", "rodoviario");
            qName2 = new javax.xml.namespace.QName("", "rodoviarios");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/seguro", "seguro");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.Seguro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/seguro", "seguros");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.Seguro[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/seguro", "seguro");
            qName2 = new javax.xml.namespace.QName("", "seguro");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/traslado", "traslado");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.Traslado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/traslado", "traslados");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.Traslado[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/traslado", "traslado");
            qName2 = new javax.xml.namespace.QName("", "traslados");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "adiantamentoStatus");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.AdiantamentoStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "categoriaApartamento");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.CategoriaApartamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "classe");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.Classe.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "classeRodoviario");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.ClasseRodoviario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "cobertura");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.Cobertura.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "coberturas");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.Cobertura[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "cobertura");
            qName2 = new javax.xml.namespace.QName("", "cobertura");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "consolidadora");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "deslocamentoTerrestre");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.DeslocamentoTerrestre.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "enumFornecedorVCN");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.EnumFornecedorVCN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "enumTipoFormaPagamento");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.EnumTipoFormaPagamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "formaPagamento");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "garantiaNoShow");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.GarantiaNoShow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "identificador");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "identificadoresIntegracao");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.Identificador[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "identificador");
            qName2 = new javax.xml.namespace.QName("", "identificador");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "itenFaturamento");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.ItenFaturamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "itensFaturamentoHotel");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.ItenFaturamento[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "itenFaturamento");
            qName2 = new javax.xml.namespace.QName("", "itenFaturamento");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "localAssentoRodoviario");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.LocalAssentoRodoviario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "modalidadeLancamentoBudget");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.ModalidadeLancamentoBudget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "moeda");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "perfilAereo");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilAereo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "perfilFuncionario");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilFuncionario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "perfilHospedagem");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilHospedagem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "planoAlimentar");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.PlanoAlimentar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "pontoVendaOrcamento");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "preferenciaAssentoRodoviario");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.PreferenciaAssentoRodoviario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "presacaoContasStatus");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.PresacaoContasStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "regime");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.Regime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "remark");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "remarks");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remark[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "remark");
            qName2 = new javax.xml.namespace.QName("", "remark");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "resultadoAcao");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "resultadoOperacao");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "sexo");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.Sexo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "source");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.Source.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "statusCancelamento");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusCancelamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "statusSolicitacao");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusSolicitacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoApartamento");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoCadastroFuncionario");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCadastroFuncionario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoCobertura");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCobertura.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoColetaMulta");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoColetaMulta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoCredito");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCredito.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoDeSolicitacao");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoDeSolicitacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoDocumento");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoDocumento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoIntegracao");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoIntegracao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoOperacaoBudget");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoOperacaoBudget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoPassageiro");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPassageiro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoPax");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoProduto");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoProduto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoSolicitacao");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoSolicitacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoTarifa");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoTarifa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "tipoViagem");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoViagem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", ">configuracaoFuncionario>categoriaHospedagem");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", ">configuracaoFuncionario>politicaDespesa");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", ">funcionario>cpf");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", ">funcionario>passaporte");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", ">identificadorIntegracaoRef>identificadorIntegracao");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", ">login>usuario");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "aereoFinalizar");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.AereoFinalizar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "agencia");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Agencia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "atendimento");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Atendimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "budget");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Budget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "cadastrarHoteisHomologados");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.CadastrarHoteisHomologados.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "carroFinalizar");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.CarroFinalizar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "centroDeCusto");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCusto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "centroDeCustoRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCustoRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "configuracaoCentroDeCusto");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.ConfiguracaoCentroDeCusto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "configuracaoFuncionario");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.ConfiguracaoFuncionario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "consultaBilheteCia");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.ConsultaBilheteCia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "contaContabil");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.ContaContabil.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "contaContabilRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.ContaContabilRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "contato");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Contato.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "deslocamento");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Deslocamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "filial");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Filial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionario");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Funcionario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarios");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Funcionario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionario");
            qName2 = new javax.xml.namespace.QName("", "funcionario");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "hotelFinalizar");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.HotelFinalizar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "identificadorIntegracaoRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.IdentificadorIntegracaoRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "instrucoesFaturamento");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.InstrucoesFaturamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "logAs");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.LogAs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "login");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Login.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoAprovacao");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoAprovacaoRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacaoRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoDebito");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebito.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoDebitoRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebitoRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoSolicitacao");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoCentroDeCustoSolicitacaoRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacaoRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoViajanteAprovacao");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "parametrizacaoViajanteAprovacaoRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacaoRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "passageiro");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "passageiros");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "passageiro");
            qName2 = new javax.xml.namespace.QName("", "passageiro");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "pontoVenda");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.PontoVenda.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "produtos");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Produtos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "projeto");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Projeto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "projetoRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.ProjetoRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "rateio");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Rateio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "rateios");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Rateio[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "rateio");
            qName2 = new javax.xml.namespace.QName("", "rateio");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "regional");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Regional.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "regionalRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.RegionalRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "solicitacao");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "subCentroDeCusto");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCusto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "subCentroDeCustoRef");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCustoRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "totais");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.beans.Totais.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/common/types", "codigoElemento");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/common/types", "codigoElemento50");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/common/types", "corporateIdGol");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/common/types", "ddd");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/common/types", "ddi");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/common/types", "descricaoElemento100");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/common/types", "descricaoElemento255");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/common/types", "descricaoElemento50");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/common/types", "email");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/common/types", "identificadorBackoffice");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/common/types", "matricula");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/common/types", "telefone");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", ">aprovarSolicitacaoRequest>controleCliente");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", ">inserirItemDespesaRequest>imagem");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", ">inserirItemDespesaRequest>tipoDespesa");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", ">pesquisarFuncionarioRequest>quantidadeRegistros");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", ">pesquisarFuncionarioRequest>registroInicial");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", ">pesquisarSolicitacaoRequest>quantidadeRegistros");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", ">pesquisarSolicitacaoRequest>registroInicial");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", ">pesquisarVendasConsolidadoraRequest>quantidadeRegistros");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", ">pesquisarVendasConsolidadoraRequest>registroInicial");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", ">reprovarSolicitacaoRequest>controleCliente");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", ">reprovarSolicitacaoRequest>justificativa");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", ">sincronizarSolicitacaoRequest>idSolicitacao");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusCentroDeCustoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusCentroDeCustoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusContaContabilRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusContaContabilRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusFornecedorRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusFornecedorRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusFuncionarioRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusFuncionarioRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusProjetoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusProjetoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusRegionalRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusRegionalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusSubCentroDeCustoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusSubCentroDeCustoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "alterarStatusTarifarioRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusTarifarioRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "aprovarSolicitacaoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.AprovarSolicitacaoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "atrelarUsuariosRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.AtrelarUsuariosRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "atualizarBudgetRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.AtualizarBudgetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarCentroDeCustoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarCentroDeCustoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarContaContabilRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarContaContabilRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarFornecedorRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFornecedorRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarFornecedorSourceRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFornecedorSourceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarFuncionarioRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFuncionarioRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarHoteisHomologadosRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarHoteisHomologadosRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarParametrizacaoCentroDeCustoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParametrizacaoCentroDeCustoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarParametrizacaoViajanteRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParametrizacaoViajanteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarProjetoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarProjetoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarRegionalRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarRegionalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarSubCentroDeCustoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarSubCentroDeCustoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "cadastrarTarifarioRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarTarifarioRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "consultaBilheteCiaRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.ConsultaBilheteCiaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "deletarParametrizacaoCentroDeCustoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParametrizacaoCentroDeCustoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "deletarParametrizacaoViajanteRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParametrizacaoViajanteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "finalizarSolicitacaoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.FinalizarSolicitacaoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "inserirIdentificadorIntegracaoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.InserirIdentificadorIntegracaoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "inserirItemDespesaRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.InserirItemDespesaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "pesquisarFuncionarioRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarFuncionarioRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "pesquisarSolicitacaoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "pesquisarVendasConsolidadoraRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarVendasConsolidadoraRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "reprovarSolicitacaoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.ReprovarSolicitacaoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "sincronizarSolicitacaoRequest");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.request.SincronizarSolicitacaoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusCentroDeCustoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusCentroDeCustoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusContaContabilResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusContaContabilResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusFornecedorResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFornecedorResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusFuncionarioResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFuncionarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusProjetoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusProjetoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusRegionalResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusRegionalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusSubCentroDeCustoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusSubCentroDeCustoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "alterarStatusTarifarioResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusTarifarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "aprovarSolicitacaoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.AprovarSolicitacaoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "atrelarUsuariosResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.AtrelarUsuariosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "atualizarBudgetResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.AtualizarBudgetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarCentroDeCustoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarCentroDeCustoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarContaContabilResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarContaContabilResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarFornecedorResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarFornecedorSourceResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorSourceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarFuncionarioResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFuncionarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarHoteisHomologadosResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarHoteisHomologadosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarParametrizacaoCentroDeCustoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoCentroDeCustoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarParametrizacaoViajanteResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoViajanteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarProjetoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarProjetoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarRegionalResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarRegionalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarSubCentroDeCustoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarSubCentroDeCustoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "cadastrarTarifarioResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarTarifarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "consultaBilheteCiaResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.ConsultaBilheteCiaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "deletarParametrizacaoCentroDeCustoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoCentroDeCustoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "deletarParametrizacaoViajanteResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoViajanteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "finalizarSolicitacaoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.FinalizarSolicitacaoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "inserirIdentificadorIntegracaoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirIdentificadorIntegracaoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "inserirItemDespesaResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirItemDespesaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "pesquisarFuncionarioResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarFuncionarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "pesquisarSolicitacaoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "pesquisarVendasConsolidadoraResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarVendasConsolidadoraResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "reprovarSolicitacaoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.ReprovarSolicitacaoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/response", "sincronizarSolicitacaoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.lemontech.selfbooking.wsselfbooking.services.response.SincronizarSolicitacaoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse pesquisarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest pesquisarSolicitacao) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pesquisarSolicitacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, pesquisarSolicitacao});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.SincronizarSolicitacaoResponse sincronizarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.SincronizarSolicitacaoRequest sincronizarSolicitacao) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sincronizarSolicitacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, sincronizarSolicitacao});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.SincronizarSolicitacaoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.SincronizarSolicitacaoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.SincronizarSolicitacaoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarRegionalResponse cadastrarRegional(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarRegionalRequest cadastrarRegional) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cadastrarRegional"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, cadastrarRegional});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarRegionalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarRegionalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarRegionalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusRegionalResponse alterarStatusRegional(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusRegionalRequest alterarStatusRegional) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "alterarStatusRegional"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, alterarStatusRegional});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusRegionalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusRegionalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusRegionalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarContaContabilResponse cadastrarContaContabil(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarContaContabilRequest cadastrarContaContabil) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cadastrarContaContabil"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, cadastrarContaContabil});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarContaContabilResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarContaContabilResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarContaContabilResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusContaContabilResponse alterarStatusContaContabil(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusContaContabilRequest alterarStatusContaContabil) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "alterarStatusContaContabil"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, alterarStatusContaContabil});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusContaContabilResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusContaContabilResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusContaContabilResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarCentroDeCustoResponse cadastrarCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarCentroDeCustoRequest cadastrarCentroDeCusto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cadastrarCentroDeCusto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, cadastrarCentroDeCusto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarCentroDeCustoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarCentroDeCustoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarCentroDeCustoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusCentroDeCustoResponse alterarStatusCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusCentroDeCustoRequest alterarStatusCentroDeCusto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "alterarStatusCentroDeCusto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, alterarStatusCentroDeCusto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusCentroDeCustoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusCentroDeCustoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusCentroDeCustoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarSubCentroDeCustoResponse cadastrarSubCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarSubCentroDeCustoRequest cadastrarSubCentroDeCusto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cadastrarSubCentroDeCusto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, cadastrarSubCentroDeCusto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarSubCentroDeCustoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarSubCentroDeCustoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarSubCentroDeCustoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusSubCentroDeCustoResponse alterarStatusSubCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusSubCentroDeCustoRequest alterarStatusSubCentroDeCusto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "alterarStatusSubCentroDeCusto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, alterarStatusSubCentroDeCusto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusSubCentroDeCustoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusSubCentroDeCustoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusSubCentroDeCustoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoCentroDeCustoResponse cadastrarParametrizacaoCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParametrizacaoCentroDeCustoRequest cadastrarParametrizacaoCentroDeCusto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cadastrarParametrizacaoCentroDeCusto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, cadastrarParametrizacaoCentroDeCusto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoCentroDeCustoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoCentroDeCustoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoCentroDeCustoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoCentroDeCustoResponse deletarParametrizacaoCentroDeCusto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParametrizacaoCentroDeCustoRequest deletarParametrizacaoCentroDeCusto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deletarParametrizacaoCentroDeCusto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, deletarParametrizacaoCentroDeCusto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoCentroDeCustoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoCentroDeCustoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoCentroDeCustoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFuncionarioResponse cadastrarFuncionario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFuncionarioRequest cadastrarFuncionario) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cadastrarFuncionario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, cadastrarFuncionario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFuncionarioResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFuncionarioResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFuncionarioResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarFuncionarioResponse pesquisarFuncionario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarFuncionarioRequest pesquisarFuncionario) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pesquisarFuncionario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, pesquisarFuncionario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarFuncionarioResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarFuncionarioResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarFuncionarioResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFuncionarioResponse alterarStatusFuncionario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusFuncionarioRequest alterarStatusFuncionario) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "alterarStatusFuncionario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, alterarStatusFuncionario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFuncionarioResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFuncionarioResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFuncionarioResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorResponse cadastrarFornecedor(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFornecedorRequest cadastrarFornecedor) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cadastrarFornecedor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, cadastrarFornecedor});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFornecedorResponse alterarStatusFornecedor(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusFornecedorRequest alterarStatusFornecedor) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "alterarStatusFornecedor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, alterarStatusFornecedor});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFornecedorResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFornecedorResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFornecedorResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarTarifarioResponse cadastrarTarifario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarTarifarioRequest cadastrarTarifario) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cadastrarTarifario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, cadastrarTarifario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarTarifarioResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarTarifarioResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarTarifarioResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusTarifarioResponse alterarStatusTarifario(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusTarifarioRequest alterarStatusTarifario) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "alterarStatusTarifario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, alterarStatusTarifario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusTarifarioResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusTarifarioResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusTarifarioResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AprovarSolicitacaoResponse aprovarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AprovarSolicitacaoRequest aprovarSolicitacao) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "aprovarSolicitacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, aprovarSolicitacao});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AprovarSolicitacaoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AprovarSolicitacaoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.AprovarSolicitacaoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.ReprovarSolicitacaoResponse reprovarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.ReprovarSolicitacaoRequest reprovarSolicitacao) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reprovarSolicitacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, reprovarSolicitacao});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.ReprovarSolicitacaoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.ReprovarSolicitacaoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.ReprovarSolicitacaoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirIdentificadorIntegracaoResponse inserirIdentificadorIntegracao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.InserirIdentificadorIntegracaoRequest inserirIdentificadorIntegracao) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inserirIdentificadorIntegracao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, inserirIdentificadorIntegracao});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirIdentificadorIntegracaoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirIdentificadorIntegracaoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirIdentificadorIntegracaoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoViajanteResponse cadastrarParametrizacaoViajante(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParametrizacaoViajanteRequest cadastrarParametrizacaoViajante) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cadastrarParametrizacaoViajante"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, cadastrarParametrizacaoViajante});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoViajanteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoViajanteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoViajanteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoViajanteResponse deletarParametrizacaoViajante(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParametrizacaoViajanteRequest deletarParametrizacaoViajante) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deletarParametrizacaoViajante"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, deletarParametrizacaoViajante});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoViajanteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoViajanteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoViajanteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarVendasConsolidadoraResponse pesquisarVendasConsolidadora(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarVendasConsolidadoraRequest pesquisarVendasConsolidadora) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pesquisarVendasConsolidadora"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, pesquisarVendasConsolidadora});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarVendasConsolidadoraResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarVendasConsolidadoraResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarVendasConsolidadoraResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorSourceResponse cadastrarFornecedorSource(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFornecedorSourceRequest cadastrarFornecedorSource) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cadastrarFornecedorSource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, cadastrarFornecedorSource});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorSourceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorSourceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorSourceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirItemDespesaResponse inserirItemDespesa(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.InserirItemDespesaRequest inserirItemDespesa) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inserirItemDespesa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, inserirItemDespesa});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirItemDespesaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirItemDespesaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirItemDespesaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarProjetoResponse cadastrarProjeto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarProjetoRequest cadastrarProjeto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cadastrarProjeto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, cadastrarProjeto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarProjetoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarProjetoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarProjetoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusProjetoResponse alterarStatusProjeto(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusProjetoRequest alterarStatusProjeto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "alterarStatusProjeto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, alterarStatusProjeto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusProjetoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusProjetoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusProjetoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AtualizarBudgetResponse atualizarBudget(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AtualizarBudgetRequest atualizarBudget) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "atualizarBudget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, atualizarBudget});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AtualizarBudgetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AtualizarBudgetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.AtualizarBudgetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.ConsultaBilheteCiaResponse consultaBilheteCia(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.ConsultaBilheteCiaRequest consultaBilheteCia) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "consultaBilheteCia"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, consultaBilheteCia});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.ConsultaBilheteCiaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.ConsultaBilheteCiaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.ConsultaBilheteCiaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarHoteisHomologadosResponse cadastrarHoteisHomologados(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarHoteisHomologadosRequest cadastrarHoteisHomologados) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cadastrarHoteisHomologados"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, cadastrarHoteisHomologados});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarHoteisHomologadosResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarHoteisHomologadosResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarHoteisHomologadosResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.AtrelarUsuariosResponse atrelarUsuarios(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.AtrelarUsuariosRequest atrelarUsuarios) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "atrelarUsuarios"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, atrelarUsuarios});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AtrelarUsuariosResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.AtrelarUsuariosResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.AtrelarUsuariosResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.lemontech.selfbooking.wsselfbooking.services.response.FinalizarSolicitacaoResponse finalizarSolicitacao(java.lang.String keyClient, java.lang.String userName, java.lang.String userPassword, br.com.lemontech.selfbooking.wsselfbooking.services.request.FinalizarSolicitacaoRequest finalizarSolicitacao) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "finalizarSolicitacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keyClient, userName, userPassword, finalizarSolicitacao});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.FinalizarSolicitacaoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.lemontech.selfbooking.wsselfbooking.services.response.FinalizarSolicitacaoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.lemontech.selfbooking.wsselfbooking.services.response.FinalizarSolicitacaoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
