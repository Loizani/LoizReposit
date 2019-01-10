package key.objet;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport ;

import key.objet.beans.magasin;
import key.objet.beans.produit;
import key.objet.dao.InterfacefillDataDao;
import key.objet.dao.staticSingleton;
import key.objet.service.InterfaceService;


public class ProductPageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	public List<magasin> ListeMagasins ;
	public List<produit> ListeProduits ;
	public Map<magasin, produit> CatalogMap ;
	//Sans Spring, utilisation, ici du singleton static
	private InterfaceService objBuild = staticSingleton.getIMPSER();
	
	@Override
    public String execute() throws Exception {
		
		
		ListeMagasins = objBuild.getListeMagasins();
		ListeProduits = objBuild.getListeProduits();
		
		if (ListeProduits.isEmpty())
			System.out.println("execute : aucun produit") ;		
		else {
		for(produit eleproduit:ListeProduits) 
			System.out.println("execute : "  + eleproduit.getStrDesignation()) ;
		}
		
		CatalogMap = objBuild.getCatalogMap();
        return SUCCESS;
    }

}
