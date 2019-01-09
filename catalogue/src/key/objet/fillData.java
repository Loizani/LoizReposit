package key.objet ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class fillData {

	private  List<magasin> ListeMagasins ;
	private  List<produit> ListeProduits ;	
	private  Map<magasin, produit> CatalogMap ;	
	
	public fillData()
	 {		
		
		System.out.println("Dans fillData");
		ListeMagasins = new ArrayList<magasin>() ;
		ListeProduits = new ArrayList<produit>() ;
		CatalogMap = new HashMap<magasin, produit>();			
		
		magasin objMagasin1 = new magasin("NomMag1","Adresse1", true);
		magasin objMagasin2 = new magasin("NomMag2","Adresse2", true);
		magasin objMagasin3 = new magasin("NomMag3","Adresse3", true);
		magasin objMagasin4 = new magasin("NomMag4","Adresse4", true);
		ListeMagasins.add(objMagasin1);
		ListeMagasins.add(objMagasin2);
		ListeMagasins.add(objMagasin3);
		ListeMagasins.add(objMagasin4);
		
		
		produit objProduit1 = new produit("PR1", "Designation1", 51, false ) ;
		produit objProduit2 = new produit("PR2", "Designation2", 52, false ) ;
		produit objProduit3 = new produit("PR3", "Designation3", 53, false ) ;
		produit objProduit4 = new produit("PR4", "Designation4", 54, false ) ;
		
		ListeProduits.add(objProduit1);
		ListeProduits.add(objProduit2);
		ListeProduits.add(objProduit3);
		ListeProduits.add(objProduit4);
		
		CatalogMap.put(objMagasin1, objProduit1);
		CatalogMap.put(objMagasin2, objProduit2);
		CatalogMap.put(objMagasin3, objProduit3);
		CatalogMap.put(objMagasin4, objProduit4);
	}


	public List<magasin> getListeMagasins() {
		return ListeMagasins;
	}


	public void setListeMagasins(List<magasin> listeMagasins) {
		ListeMagasins = listeMagasins;
	}


	public List<produit> getListeProduits() {
		return ListeProduits;
	}


	public void setListeProduits(List<produit> listeProduits) {
		ListeProduits = listeProduits;
	}


	public  Map<magasin, produit> getCatalogMap() {
		return CatalogMap;
	}


	public  void setCatalogMap(Map<magasin, produit> catalogMap) {
		CatalogMap = catalogMap;
	}	
	
	
	
	
}
