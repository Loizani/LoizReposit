package loiz.hibenate.main;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import loiz.hibenate.beans.*;
   
public class AddDataPlace {

	public static void main(String[] args) {		
		
		
		
		List <TablePlaces> listPlaces = new ArrayList<TablePlaces>() ;
		listPlaces.add(new TablePlaces("SIDNEY", "AUSTRALIA"));
		listPlaces.add(new TablePlaces("PEKIN", "CHINA"));
		listPlaces.add(new TablePlaces("TOKYO", "JAPAN"));
		
		Configuration hibConf = new Configuration().configure("hibernateBaseAcquisitionHUpdate.cfg.xml");        

		hibConf = hibConf.addAnnotatedClass(TableAcquisition.class) ;
		hibConf = hibConf.addAnnotatedClass(TableDenrees.class) ;
		hibConf = hibConf.addAnnotatedClass(TableOperation.class) ;
		hibConf = hibConf.addAnnotatedClass(TablePlaces.class) ;
		
		
		ServiceRegistryBuilder objSerRegBuild = new ServiceRegistryBuilder();
		objSerRegBuild = objSerRegBuild.applySettings(hibConf.getProperties()) ;
		ServiceRegistry objSerReg = objSerRegBuild.buildServiceRegistry() ;  
		SessionFactory sessFac = hibConf.buildSessionFactory(objSerReg); 

		Session mySess = sessFac.openSession();
		Transaction objTrans = mySess.beginTransaction();					
		try {
			for(TablePlaces elePlace : listPlaces) {
				mySess.save(elePlace);
			}
			objTrans.commit();	
		}

		catch (HibernateException hibernateEx) {

			System.err.printf("**************************** Save data problem : \n", hibernateEx);
			hibernateEx.printStackTrace();
		}

		
	}

}
