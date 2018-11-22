package loiz.explore.so.main ;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import loiz.explore.so.bean.TableSociete;

public class withoutServiceRegistry {

	public static void main(String argv[]) {
		 
	System.out.println("Debut.");
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyHibernatePersistenceUnitName");
	EntityManager em = (EntityManager)entityManagerFactory.createEntityManager();	
	em.getTransaction().begin();
	@SuppressWarnings({ "unchecked" })
	Query<Integer> myQuery = (Query<Integer>) em.createQuery("Select idSociete from TableSociete") ;
	List<Integer> myList = myQuery.getResultList();
	int intNext = myList.size()+ 1 ;
	TableSociete objTS = new TableSociete("nomSociete"+intNext, "paysSociete"+intNext, "adresseSociete"+intNext) ;
	em.persist(objTS);	
	
	em.getTransaction().commit();
	em.close();		
	System.out.println("Entity saved.");
	
	
//	em.createQuery(qlString)
	System.out.println("fin");
	System.exit(0);
	}
}
/*
 * 10 Jars sur 17 sont indispensable pour execution client Lourd
Oblig : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\mssql-jdbc-7.0.0.jre8.jar
Oblig : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\jboss-logging-3.3.0.Final.jar
Oblig : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\javassist-3.20.0-GA.jar
Oblig : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\hibernate-jpa-2.1-api-1.0.0.Final.jar
Oblig : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\hibernate-core-5.2.6.Final.jar
Oblig : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\hibernate-commons-annotations-5.0.1.Final.jar
Oblig : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\geronimo-jta_1.1_spec-1.1.1.jar
Oblig : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\dom4j-1.6.1.jar
Oblig : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\antlr-2.7.7.jar
Oblig  : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\classmate-1.3.0.jar
Facultatif but why : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\cdi-api-1.1.jar
Facultatif : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\junit-3.8.1.jar
Facultatif : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\jsr250-api-1.0.jar
Facultatif : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\jboss-interceptors-api_1.1_spec-1.0.0.Beta1.jar
Facultatif : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\javax.inject-1.jar
Facultatif : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\jandex-2.0.3.Final.jar
Facultatif : C:\Users\Loizani Slimani\Desktop\cours j2ee\Java Hibernate\EntityFactory Jars\el-api-2.2.jar
*/
