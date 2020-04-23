package br.upf.ads.CRUD.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUTIL {
	private static EntityManagerFactory factory = null;

	public static EntityManager getEntityManager(){
		if (factory == null)            
			factory = Persistence.createEntityManagerFactory("Cidade");        
		return factory.createEntityManager();    }


}
