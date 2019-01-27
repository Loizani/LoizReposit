/*package key.objet.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import key.objet.service.InterfaceService;
import key.objet.service.ServiceImpl;


public class staticSingleton {
	
	private static  InterfacefillDataDao IMPDAO ;		
	private static InterfaceService  IMPSER ;	
	
	static {
		System.out.println("staticSingleton - chargement des données statiques : static{}") ;
		IMPDAO =  new fillDataDaoImplem();
		IMPDAO.initialisation();
		IMPSER = new ServiceImpl(IMPDAO);
		//IMPSER.setIDAO(IMPDAO);	
	}
	
	
	public staticSingleton() {
		super();
		System.out.println("instanciation staticSingleton") ; 
	}


	
	public static synchronized  InterfaceService getIMPSER() {
		System.out.println("staticSingleton : getIMPSER()") ;			
		return staticSingleton.IMPSER ;
	}

	public void setIMPSER(InterfaceService iMPSER) {
		IMPSER  = iMPSER;
	}	
	
}*/