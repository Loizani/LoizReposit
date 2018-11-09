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
   
public class AddDateToTables {

	public static void main(String[] args) {		
		
		
		
		List <TableDenree> listDenrees = new ArrayList<TableDenree>() ;
		//public TableDenree(String Arg_nomDenree, String Arg_typeDenree, String Arg_uniteDeVenteDenree, String Arg_valeurUniteDenree) {		
		listDenrees.add(new TableDenree("Tomates", "Legume", "tonne", "100"));
		listDenrees.add(new TableDenree("RIZ", "Feculent", "tonne", "50"));
		listDenrees.add(new TableDenree("Farine", "Cereale", "tonne", "200"));
		
		Configuration hibConf = new Configuration().configure("hibernateBaseAcquisitionHUpdate.cfg.xml");        

		//hibConf = hibConf.addAnnotatedClass(TableAcquisition.class) ;
		hibConf = hibConf.addAnnotatedClass(TableDenree.class) ;
		//hibConf = hibConf.addAnnotatedClass(TableOperation.class) ;
		//hibConf = hibConf.addAnnotatedClass(TablePlace.class) ;
		
		
		ServiceRegistryBuilder objSerRegBuild = new ServiceRegistryBuilder();
		objSerRegBuild = objSerRegBuild.applySettings(hibConf.getProperties()) ;
		ServiceRegistry objSerReg = objSerRegBuild.buildServiceRegistry() ;  
		SessionFactory sessFac = hibConf.buildSessionFactory(objSerReg); 

		Session mySess = sessFac.openSession();
		Transaction objTrans = mySess.beginTransaction();					
		try {
			for(TableDenree eleDentree : listDenrees) {
				mySess.save(eleDentree);
			}
			objTrans.commit();	
		}

		catch (HibernateException hibernateEx) {

			System.err.printf("**************************** Save data problem : \n", hibernateEx);
			hibernateEx.printStackTrace();
		}

		
	}

}
