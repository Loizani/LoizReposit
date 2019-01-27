package key.objet.dao;
 

import java.util.List;
import java.util.Map;

import key.objet.entities.magasin;
import key.objet.entities.produit;


public interface InterfacefillDataDao {	
	
	
	public List<magasin> getListeMagasins() ;



	public List<produit> getListeProduits() ;




	public  Map<magasin, produit> getCatalogMap() ;



	void initialisation();


	
}
