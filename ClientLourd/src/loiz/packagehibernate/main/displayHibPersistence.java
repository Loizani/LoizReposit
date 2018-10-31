package loiz.packagehibernate.main;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import loiz.packagehibernate.bean.EntityAcquisitionDenree;
import loiz.packagehibernate.bean.EntityDenree;
   
public class displayHibPersistence {

	public static void main(String[] args) {		
		
		EntityAcquisitionDenree objActeAchatdenree = new EntityAcquisitionDenree();
		objActeAchatdenree.setId(0);
		objActeAchatdenree.setDateAcquisition();
		objActeAchatdenree.setsLibAcquisition("Hong Kong");		
		
		EntityDenree objDenree = new EntityDenree();
		objDenree.setIdDenree(0);
		objDenree.setsNomDenree("Saumon");
		objDenree.setsUniteValeur("kilos");
		objDenree.setiValeurCotation(10000);					
		
		EntityDenree objDenree2 = new EntityDenree();
		objDenree2.setIdDenree(0);
		objDenree2.setsNomDenree("RIZ");
		objDenree2.setsUniteValeur("tonnne");
		objDenree2.setiValeurCotation(200000);	
		
		//creation d'un type liste
		List<EntityDenree> objListEntDet = new ArrayList<EntityDenree>();
		
		//Ajout des deux denrées
		objListEntDet.add(objDenree);		
		objListEntDet.add(objDenree2);
		
		objActeAchatdenree.setAttrListCotAlim(objListEntDet);
		
		Configuration hibConf = new Configuration().configure("hibernateCotation.cfg.xml");
        
		hibConf = hibConf.addAnnotatedClass(EntityAcquisitionDenree.class) ;
		hibConf = hibConf.addAnnotatedClass(EntityDenree.class) ;
		
		ServiceRegistryBuilder objSerRegBuild = new ServiceRegistryBuilder();
		objSerRegBuild = objSerRegBuild.applySettings(hibConf.getProperties()) ;
		ServiceRegistry objSerReg = objSerRegBuild.buildServiceRegistry() ;  
		SessionFactory sessFac = hibConf.buildSessionFactory(objSerReg); 

		Session mySess = sessFac.openSession();
		Transaction objTrans = mySess.beginTransaction();					
		try {

			mySess.save(objActeAchatdenree);
			mySess.save(objDenree);
			mySess.save(objDenree2);
			objTrans.commit();	
		}

		catch (HibernateException hibernateEx) {

			System.err.printf("**************************** Save data problem : \n", hibernateEx);
			hibernateEx.printStackTrace();
		}

		
	}

}
