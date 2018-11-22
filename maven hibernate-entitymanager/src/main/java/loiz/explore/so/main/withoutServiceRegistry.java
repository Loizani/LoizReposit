package loiz.explore.so.main ;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;


import loiz.explore.so.bean.TableSociete;

//using provider :  org.hibernate.jpa.HibernatePersistenceProvider ;

public class withoutServiceRegistry {

	public static void main(String argv[]) {
		
	System.out.println("Debut.");
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyHibernatePersistenceUnitName");
	EntityManager em = entityManagerFactory.createEntityManager();
	
	em.getTransaction().begin();
	TableSociete objTS = new TableSociete("nomSociete2", "paysSociete2", "adresseSociete2") ;
	em.persist(objTS);
	em.getTransaction().commit();
	em.close();
	//JPAUtility.close();		
	System.out.println("Entity saved.");
	
//	em.createQuery(qlString)
	System.out.println("fin");
	}
}
