package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
	
	private EntityManagerFactory emf; 
	
	public DAO() {
		emf = Persistence.createEntityManagerFactory("lemontech");
	}
	 
	public EntityManager getEntityManager(){
 
		//responsavel pela persistencia
		return emf.createEntityManager();
	}
}
