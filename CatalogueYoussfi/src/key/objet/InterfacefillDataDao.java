package key.objet ;


import java.util.List;
import java.util.Map;

import key.objet.beans.magasin;
import key.objet.beans.produit;


public interface InterfacefillDataDao {	
		
	
	public List<magasin> getListeMagasins() ;


	public void setListeMagasins(List<magasin> listeMagasins);


	public List<produit> getListeProduits() ;


	public void setListeProduits(List<produit> listeProduits);


	public  Map<magasin, produit> getCatalogMap() ;


	public  void setCatalogMap(Map<magasin, produit> catalogMap) ;


	public void initialisation();		
	
	
}
