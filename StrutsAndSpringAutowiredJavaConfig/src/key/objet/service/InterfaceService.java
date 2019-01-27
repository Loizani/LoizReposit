package key.objet.service;
 
import java.util.List;
import java.util.Map;

import key.objet.dao.InterfacefillDataDao;
import key.objet.entities.magasin;
import key.objet.entities.produit;

public interface InterfaceService {
	
	
	public void setIDAO(InterfacefillDataDao iDAO);

	
	
	public List<magasin> getListeMagasins() ;





	public List<produit> getListeProduits() ;





	public  Map<magasin, produit> getCatalogMap() ;




		
	
}
