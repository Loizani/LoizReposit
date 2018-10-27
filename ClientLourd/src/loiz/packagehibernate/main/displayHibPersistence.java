package loiz.packagehibernate.main;

import org.hibernate.Session;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import loiz.packagehibernate.bean.EntityCourse;

public class displayHibPersistence {

	public static void main(String[] args) {

		EntityCourse objEntitCo = new EntityCourse();
		objEntitCo.setId(0);
		objEntitCo.setLibelle("Maticha");
		objEntitCo.setQuantite(8);
		
		
		Configuration hibConf = new Configuration();		
		hibConf = hibConf.configure().addAnnotatedClass(EntityCourse.class) ;
		ServiceRegistryBuilder objSerRegBuild = new ServiceRegistryBuilder();
		objSerRegBuild = objSerRegBuild.applySettings(hibConf.getProperties()) ;
		ServiceRegistry objSerReg = objSerRegBuild.buildServiceRegistry() ; 

		SessionFactory sessFac = hibConf.buildSessionFactory(objSerReg);

		Session mySess = sessFac.openSession();
		Transaction objTrans = mySess.beginTransaction();
		try {
			mySess.save(objEntitCo);
		}

		catch (HibernateException hibernateEx) {
			System.err.printf("**************************** Save data problem - HibernateException : \n\n", hibernateEx);
			hibernateEx.printStackTrace();
		}

		objTrans.commit();
	}

}
