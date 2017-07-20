package model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="viagem",schema="public")
public class Viagem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="viagem_id_seq")
	@SequenceGenerator(name="viagem_id_seq", sequenceName="viagem_id_seq", allocationSize=1)
    private int id;
	
	@Column(name="id_solicitacao")
	private int idSolicitacao;
    
	@Column(name="nome_passageiro")
	private String nomePassageiro;
	
	@Column(name="cia_aerea")
	private String ciaAerea;
	
	@Column(name="data_saida")
	private Calendar dataSaida;
	
	@Column(name="data_chegada")
	private Calendar dataChegada;
	
	@Column(name="cidade_origem")
	private String cidadeOrigem;
	
	@Column(name="cidade_destino")
	private String cidadeDestino;

	
	
	// Getters and Setters
	public int getIdSolicitacao() {
		return idSolicitacao;
	}

	public void setIdSolicitacao(int idSolicitacao) {
		this.idSolicitacao = idSolicitacao;
	}
	
	public String getNomePassageiro() {
		return nomePassageiro;
	}

	public void setNomePassageiro(String nomePassageiro) {
		this.nomePassageiro = nomePassageiro;
	}

	public String getCiaAerea() {
		return ciaAerea;
	}

	public void setCiaAerea(String ciaAerea) {
		this.ciaAerea = ciaAerea;
	}

	public Calendar getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Calendar dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Calendar getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(Calendar dataChegada) {
		this.dataChegada = dataChegada;
	}

	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

}
