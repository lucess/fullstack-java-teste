package dao;

import javax.persistence.EntityManager;

import model.Viagem;

public class ViagemDAO extends DAO {
	
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
