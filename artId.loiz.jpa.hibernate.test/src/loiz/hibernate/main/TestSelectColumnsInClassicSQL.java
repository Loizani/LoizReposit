package loiz.hibernate.main;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import loiz.hibernate.beans.*;


public class TestSelectColumnsInClassicSQL {
	// Cette bibliothèque fetch deux fois mais une seule reqête est exécutée :
	public static void main(String[] args) {		
		myObjHibSQLClassic unObjHib = new myObjHibSQLClassic();
		Configuration hibConf = new Configuration().configure("hibernateBaseAcquisitionHUpdate.cfg.xml");
		hibConf = hibConf.addAnnotatedClass(TableAcquisition.class);
		hibConf = hibConf.addAnnotatedClass(TableDenrees.class);
		hibConf = hibConf.addAnnotatedClass(TableOperation.class);
		hibConf = hibConf.addAnnotatedClass(TablePlaces.class);

		StandardServiceRegistryBuilder objSerRegBuild = new StandardServiceRegistryBuilder();
		objSerRegBuild = objSerRegBuild.applySettings(hibConf.getProperties());
		ServiceRegistry objSerReg = objSerRegBuild.build();
		SessionFactory sessFac = hibConf.buildSessionFactory(objSerReg);
		Session mySess = sessFac.openSession();		
		
		try {			
			unObjHib.runFetchOperation(mySess);
			unObjHib.runFetchOperation(mySess);
			unObjHib.runFetchOperation(mySess);
		}

		catch (Exception Ex) {
			System.err.printf("**************************** Problème : \n", Ex);
			Ex.printStackTrace();
		}
	}
} 

class myObjHibSQLClassic {

	public myObjHibSQLClassic() {
		super();
	}

	public void runFetchOperation(Session ArgMySess ) { 
		System.out.println("*************************** DEBUT runFetchOperation() **************************************");		
		Transaction objTrans = ArgMySess.beginTransaction();
  		@SuppressWarnings("unchecked")
//  		NativeQuery<Object[]> mySQLquery = ArgMySess.createNativeQuery("SELECT NomDenree,TypeDenree,UniteDeVenteDenree,ValeurUniteDenree FROM TableDenrees");
//  		NativeQuery<Object[]> mySQLquery = ArgMySess.createNativeQuery("SELECT * FROM TableDenrees");
//  		NativeQuery<Object[]> mySQLquery = ArgMySess.createNativeQuery("SELECT TOP (1000) [IdDenree],[NomDenree],[TypeDenree],[UniteDeVenteDenree],[ValeurUniteDenree]  FROM [BaseAcquisitionH].[dbo].[TableDenrees]");
  		NativeQuery<Object[]> mySQLquery = ArgMySess.createNativeQuery("SELECT * FROM [afer].[dbo].[WEBCOOPA]");
  		mySQLquery.setCacheable(false);		
  		List<Object[]> objListSelectDenrees = mySQLquery.getResultList() ;
		System.out.println("objSelectDenrees : " + objListSelectDenrees +"\n");
		
		for (Object[] eleObj:objListSelectDenrees) {
			System.out.println("-------------------------------");
			for(int i=0;i<eleObj.length;i++){						
			System.out.printf( "<"+eleObj[i] +">, ");
			}
			System.out.println("-------------------------------");
		}
		
		
		
		objTrans.commit();
		//emptyObject( objTrans, myHQLquery);
		System.out.println("*************************** FIN runFetchOperation() **************************************");
	}

	public void emptyObject( Transaction ArgobjTrans, Query<Object[]> ArgMyHQLquery) {
		ArgobjTrans = null;
		ArgMyHQLquery = null;
	}

}
