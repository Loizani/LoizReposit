package loiz.Acquisition.main;

import org.hibernate.Session;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import loiz.Acquisition.bean.EntityAcquisitionDenree;
import loiz.Acquisition.bean.EntityDenree;
import loiz.Acquisition.bean.EntityJoinDetailAcquisition;
   
public class CreerTablesAcquisition {

	public static void main(String[] args) {		
		
		  
		Configuration hibConf = new Configuration().configure("hibernateAcquisitionCreate.cfg.xml");        

		hibConf = hibConf.addAnnotatedClass(EntityAcquisitionDenree.class) ;
		hibConf = hibConf.addAnnotatedClass(EntityDenree.class) ;
		hibConf = hibConf.addAnnotatedClass(EntityJoinDetailAcquisition.class) ;
		
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
