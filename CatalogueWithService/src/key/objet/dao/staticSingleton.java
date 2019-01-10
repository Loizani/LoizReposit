package key.objet.dao;

import key.objet.service.InterfaceService;
import key.objet.service.ServiceImpl;

public class staticSingleton {
	
	private static  InterfacefillDataDao IMPDAO ;
	private static InterfaceService  IMPSER ;
	static {
		IMPDAO =  new fillDataDaoImplem();
		IMPDAO.initialisation();
		IMPSER = new ServiceImpl(IMPDAO);
		
		System.out.println("staticSingleton : static{}") ;
	}

	public static InterfaceService getIMPSER() {
		System.out.println("staticSingleton : getIMPDAO()") ;	
		return IMPSER;
	}
	
	
}