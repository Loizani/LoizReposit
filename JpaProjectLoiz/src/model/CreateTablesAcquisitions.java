package model;

import org.hibernate.Session;

/*import java.util.ArrayList;
import java.util.List;*/
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

   
public class CreateTablesAcquisitions {
    //Ajout, acquisition de deux denrée denrée de type riz et saumaon sur la place de marché de Tokto sydney
	public static void main(String[] args) {		
		
		//Creation d'un acquisition à Sydney
/*		TableAcquisitionDenree objActeAchatdenree = new TableAcquisitionDenree();
		objActeAchatdenree.setIdAcquisition((int)1);
		objActeAchatdenree.setDateAcquisition(); //date du jour
		objActeAchatdenree.setMontantAcquisition((int)30000);
	
		List <TableAcquisitionDenree> ListTableAcquisitionDenrees = new ArrayList<TableAcquisitionDenree>() ;
		ListTableAcquisitionDenrees.add(objActeAchatdenree);
		
		
		TableDesDenree objDenree = new TableDesDenree();
		objDenree.setIdDenree((int)1);
		objDenree.setNomDenree("RIZ");
		objDenree.setPrixParUnite((int)100);
		objDenree.setUniteValeurDenree("tonne");
		objDenree.setTableAcquisitionDenrees(ListTableAcquisitionDenrees);
		
		TableDesPlaces objPlace = new TableDesPlaces();
		objPlace.setIdPlace((int)0);
		objPlace.setNomPlace("Tokyo");
		objPlace.setPays("Japon");
		objPlace.setTableAcquisitionDenrees(ListTableAcquisitionDenrees);	*/		
		
		
		Configuration hibConf = new Configuration().configure("hibernateAcquisitionCreate.cfg.xml");        
		hibConf = hibConf.addAnnotatedClass(TableAcquisitionDenree.class) ;
		hibConf = hibConf.addAnnotatedClass(TableDesDenree.class) ;
		hibConf = hibConf.addAnnotatedClass(TableDesPlaces.class) ;
		
		ServiceRegistryBuilder objSerRegBuild = new ServiceRegistryBuilder();
		objSerRegBuild = objSerRegBuild.applySettings(hibConf.getProperties()) ;
		ServiceRegistry objSerReg = objSerRegBuild.buildServiceRegistry() ;  
		SessionFactory sessFac = hibConf.buildSessionFactory(objSerReg); 

		Session mySess = sessFac.openSession();
		Transaction objTrans = mySess.beginTransaction();
		
		try {
/*			mySess.save(objDenree);
			mySess.save(objPlace);
			mySess.save(objActeAchatdenree);*/

			objTrans.commit();	
		}

		catch (HibernateException hibernateEx) {

			System.err.printf("**************************** Save data problem : \n", hibernateEx);
			hibernateEx.printStackTrace();
		}

		
	}

}
