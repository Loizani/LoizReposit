package loiz.packagehibernate.main;

import org.hibernate.Session;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import loiz.packagehibernate.bean.EntityCourse;

//import org.hibernate.service.ServiceRegistry ; 
public class displayHibPersistence {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		EntityCourse objEntitCo = new EntityCourse();
		objEntitCo.setId(0);
		objEntitCo.setLibelle("Maticha");
		objEntitCo.setQuantite(8);
		
		
		Configuration hibConf = new Configuration().configure().addAnnotatedClass(EntityCourse.class);
		ServiceRegistry objSerReg = new ServiceRegistryBuilder().applySettings(hibConf.getProperties()).buildServiceRegistry() ; 

		SessionFactory sessFac = hibConf.buildSessionFactory(objSerReg);

		Session mySess = sessFac.openSession();
		Transaction objTrans = mySess.beginTransaction();
		try {

			mySess.save(objEntitCo);
		}

		catch (HibernateException hibernateEx) {

			System.err.printf("**************************** Save data problem : \n", hibernateEx);
			hibernateEx.printStackTrace();
		}

		objTrans.commit();
	}

}
