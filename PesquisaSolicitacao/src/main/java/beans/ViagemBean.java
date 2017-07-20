package beans;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.rpc.ServiceException;

import model.Viagem;
import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBooking;
import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBookingService;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;
import controller.ViagemController;

@Named
@RequestScoped
public class ViagemBean {

	private static String KEY_CLIENT = "base_teste_qa";
	private static String USER_NAME = "d0804903bf4eeefddf55c63fc600ed5c";
	private static String USER_PASSWORD = "5c11ca0bf738c2dbb460479530b26db0";

	private ViagemController viagemController;
	private List<Viagem> viagens = new ArrayList<Viagem>();

	@Inject
	private WsSelfBookingService ws;

	@PostConstruct
	private void getResponse() {

		viagemController = new ViagemController();

		// Datas
		Calendar dataInicial = Calendar.getInstance();
		dataInicial.add(Calendar.MONTH, -3);
		Calendar dataFinal = Calendar.getInstance();

		// Preenchimento dos parâmetros do request
		PesquisarSolicitacaoRequest pesquisarSolicitacao = new PesquisarSolicitacaoRequest();
		pesquisarSolicitacao.setDataInicial(dataInicial);
		pesquisarSolicitacao.setDataFinal(dataFinal);
		pesquisarSolicitacao.setRegistroInicial(1);

		// Request do WS
		WsSelfBooking port;
		PesquisarSolicitacaoResponse response = null;
		try {
			port = ws.getWsSelfBookingPort();
			response = port.pesquisarSolicitacao(KEY_CLIENT, USER_NAME, USER_PASSWORD, pesquisarSolicitacao);
		} catch (ServiceException e) {
			System.out.println("Erro ao obter porta do WS. " + e.getMessage());
			e.printStackTrace();
		} catch (RemoteException e) {
			System.out.println("Erro ao obter response do WS. " + e.getMessage());
			e.printStackTrace();
		}

		// Chama método controller que valida e persiste o response no banco de dados
		setViagens(viagemController.persistResponse(response));
	}

	public List<Viagem> getViagens() {
		return viagens;
	}
	
	public void setViagens(List<Viagem> viagens) {
		this.viagens = viagens;
	}
}
