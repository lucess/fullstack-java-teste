package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe gen�rica respons�vel pela manipula��o da EntityManager
 * @author Lucian Schirmer
 *
 */
public class DAO {
	
	private EntityManagerFactory emf; 
	
	public DAO() {
		emf = Persistence.createEntityManagerFactory("lemontech");
	}
	 
	public EntityManager getEntityManager(){
		return emf.createEntityManager();
	}
}
