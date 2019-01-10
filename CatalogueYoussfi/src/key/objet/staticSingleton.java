package key.objet;

public class staticSingleton {
	
	private static  fillDataDaoImplem IMPDAO ;
	static {
		IMPDAO =  new fillDataDaoImplem();
		IMPDAO.initialisation();		
		System.out.println("staticSingleton : static{}") ;
	}

	public static fillDataDaoImplem getIMPDAO() {
		System.out.println("staticSingleton : getIMPDAO()") ;	
		return IMPDAO;
	}
	
	
}