package loiz.gestiongroup.main;

import org.hibernate.Session;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import loiz.gestiongroup.bean.Group;
import loiz.gestiongroup.bean.User;
import loiz.gestiongroup.bean.UserGroup;

   
public class CreerUserGroupsTables {

	public static void main(String[] args) {		
		
		  
		Configuration hibConf = new Configuration().configure("hibernateBaseAnnuaireCreate.cfg.xml");        

		hibConf = hibConf.addAnnotatedClass(UserGroup.class) ;
		hibConf = hibConf.addAnnotatedClass(Group.class) ;
		hibConf = hibConf.addAnnotatedClass(User.class) ;
		
		
		ServiceRegistryBuilder objSerRegBuild = new ServiceRegistryBuilder();
		objSerRegBuild = objSerRegBuild.applySettings(hibConf.getProperties()) ;
		ServiceRegistry objSerReg = objSerRegBuild.buildServiceRegistry() ;  
		SessionFactory sessFac = hibConf.buildSessionFactory(objSerReg); 

		Session mySess = sessFac.openSession();
		Transaction objTrans = mySess.beginTransaction();					
		try {
			objTrans.commit();	
		}

		catch (HibernateException hibernateEx) {

			System.err.printf("**************************** Save data problem : \n", hibernateEx);
			hibernateEx.printStackTrace();
		}

		
	}

}
