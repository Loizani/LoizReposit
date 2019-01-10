package key.objet.dao;


import java.util.List;
import java.util.Map;

import key.objet.beans.magasin;
import key.objet.beans.produit;


public interface InterfacefillDataDao {	
		

	public void initialisation();		
	
	
	public List<magasin> getListeMagasins() ;



	public List<produit> getListeProduits() ;




	public  Map<magasin, produit> getCatalogMap() ;


	
}
