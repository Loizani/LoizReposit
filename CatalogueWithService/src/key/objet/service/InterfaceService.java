package key.objet.service;

import java.util.List;
import java.util.Map;

import key.objet.beans.magasin;
import key.objet.beans.produit;

public interface InterfaceService {
	
	public List<magasin> getListeMagasins() ;





	public List<produit> getListeProduits() ;





	public  Map<magasin, produit> getCatalogMap() ;




		
	
}
