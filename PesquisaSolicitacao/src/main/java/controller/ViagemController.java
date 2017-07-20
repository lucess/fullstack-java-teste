package controller;

import java.util.ArrayList;
import java.util.List;

import dao.ViagemDAO;
import model.Viagem;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;

public class ViagemController {
	
	private ViagemDAO viagemDAO = new ViagemDAO();
	
	/**
	 * Recebe o response do WS para validação e inserção no banco de dados
	 * 
	 * @param response
	 */
	public List<Viagem> persistResponse(PesquisarSolicitacaoResponse response) {

		System.out.println("Resultado do response: " + response.getResultadoAcao());
		System.out.println("Número de solicitações: " + response.getNumeroSolicitacoes());
		
		List<Viagem> viagens = new ArrayList<Viagem>();

		// Recupera as solicitações do response
		Solicitacao[] sol = response.getSolicitacao();
		for (Solicitacao solicitacao : sol) {

			// Analisa apenas as solicitações que possuem Aéreos
			if (solicitacao.getAereos() != null) {

				// Recupera os aereos
				Aereo aereo[] = solicitacao.getAereos();
				for (Aereo aereoObj : aereo) {

					// Recupera os seguimentos: para cada seguimento será persistido um objeto do tipo viagem no banco de dados
					AereoSeguimento seguimentos[] = aereoObj.getAereoSeguimento();
					for (AereoSeguimento aereoSeguimento : seguimentos) {

						// Objeto a ser persistido
						Viagem viagem = new Viagem();

						// Seta id da solicitacao
						viagem.setIdSolicitacao(solicitacao.getIdSolicitacao());

						// Seta nome do passageiro
						viagem.setNomePassageiro(solicitacao.getPassageiros()[0].getNomeCompleto());

						// Seta cia aerea
						viagem.setCiaAerea(aereoObj.getSource());

						// Seta data de saída/chegada
						viagem.setDataSaida(aereoSeguimento.getDataSaida());
						viagem.setDataChegada(aereoSeguimento.getDataChegada());

						// Seta cidade origem/destino
						viagem.setCidadeOrigem(aereoSeguimento.getCidadeOrigem());
						viagem.setCidadeDestino(aereoSeguimento.getCidadeDestino());

						// Chama o viagemDAO para persistencia do objeto no
						// banco de dados
						viagemDAO.salvar(viagem);
						viagens.add(viagem);
					}
				}
			}
		}
		return viagens;
	}
}
