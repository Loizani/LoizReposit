package key.objet;

import java.util.List;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import key.objet.entities.magasin;
import key.objet.entities.produit;
import key.objet.service.InterfaceService;
import key.objet.service.ServiceImpl;

public class ProductPageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private List<magasin> ListeMagasins;

	private List<produit> ListeProduits;
	
//	private Map<magasin, produit> CatalogMap;

	private InterfaceService attrService;

	@Override
	public String execute() throws Exception {
		attrService = new ServiceImpl() ;
		ListeMagasins = attrService.getListeMagasins();
		ListeProduits = attrService.getListeProduits();
//		CatalogMap = attrService.getCatalogMap();
		 
		return SUCCESS;
	}	
	
	public List<magasin> getListeMagasins() {
		return ListeMagasins;
	}

	public List<produit> getListeProduits() {
		return ListeProduits;
	}

}
