package loiz.packagehibernate;

import org.hibernate.Session;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import org.hibernate.service.ServiceRegistry ; 
public class displayHibPersistence {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		EntityCourse objEntitCo = new EntityCourse();
		objEntitCo.setId(0);
		objEntitCo.setLibelle("Be3ouida");
		objEntitCo.setQuantite(5);

		Configuration hibConf = new Configuration().configure().addAnnotatedClass(EntityCourse.class);
		// ;database=maBase

		SessionFactory sessFac = hibConf.buildSessionFactory();

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
