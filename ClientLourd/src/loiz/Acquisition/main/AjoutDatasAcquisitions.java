/*package loiz.Acquisition.main;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import loiz.Acquisition.bean.EntityAcquisitionDenree;
import loiz.Acquisition.bean.EntityDenree;
import loiz.Acquisition.bean.EntityJoinDetailAcquisition;
   
public class AjoutDatasAcquisitions {
    //Ajout, acquisition de deux denrée denrée de type riz et saumaon sur la place de marché de Tokto sydney
	public static void main(String[] args) {		
		
		//Creation d'un acquisition à Sydney
		EntityAcquisitionDenree objActeAchatdenree = new EntityAcquisitionDenree();
		objActeAchatdenree.setId((long)0);
		objActeAchatdenree.setDateAcquisition();
		objActeAchatdenree.setsLibNomPlaceFic("Tokyo"); 				
		
		EntityDenree objDenree = new EntityDenree();
		objDenree.setIdDenree((long)0);
		objDenree.setsNomDenree("Saumon");
		objDenree.setsUniteValeur("kilos");
		objDenree.setiValeurCotation(10000);					
		
		EntityDenree objDenree2 = new EntityDenree();
		objDenree2.setIdDenree(0);
		objDenree2.setsNomDenree("RIZ");
		objDenree2.setsUniteValeur("tonnne");
		objDenree2.setiValeurCotation(200000);	
		
		EntityJoinDetailAcquisition objEntityTableJointure = new EntityJoinDetailAcquisition();
		
		objEntityTableJointure.setId((long)0);
		objEntityTableJointure
		
		
		
		Configuration hibConf = new Configuration().configure("hibernateAcquisitionUpdate.cfg.xml");        
		hibConf = hibConf.addAnnotatedClass(EntityAcquisitionDenree.class) ;
		hibConf = hibConf.addAnnotatedClass(EntityDenree.class) ;
		hibConf = hibConf.addAnnotatedClass(EntityJoinDetailAcquisition.class) ;
		
		ServiceRegistryBuilder objSerRegBuild = new ServiceRegistryBuilder();
		objSerRegBuild = objSerRegBuild.applySettings(hibConf.getProperties()) ;
		ServiceRegistry objSerReg = objSerRegBuild.buildServiceRegistry() ;  
		SessionFactory sessFac = hibConf.buildSessionFactory(objSerReg); 

		Session mySess = sessFac.openSession();
		Transaction objTrans = mySess.beginTransaction();
		EntityDenree objDenree3 = new EntityDenree();
		objDenree3 = (EntityDenree)mySess.get(EntityDenree.class, 2);
		List<EntityDenree> objListEntDet = new ArrayList<EntityDenree>();		
		objListEntDet.add(objDenree3);
		//objActeAchatdenree.setAttrListCotAlim(objListEntDet);
		
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
*/