package dao;

import javax.persistence.EntityManager;

import model.Viagem;

/**
 * Classe responsável pelas operações de persistência da model Viagem
 * @author Lucian Schirmer
 *
 */
public class ViagemDAO extends DAO {
	
	/**
	 * Método que insere o objeto viagem no banco de dados
	 * @param viagem
	 */
	public void salvar(Viagem viagem){
		
		EntityManager em = getEntityManager();
		
		try{
			em.getTransaction().begin();
			em.persist(viagem);
			em.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}
}
