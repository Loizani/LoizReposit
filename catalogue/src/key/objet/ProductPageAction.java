package key.objet;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport ;


public class ProductPageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	public List<magasin> ListeMagasins ;
	public List<produit> ListeProduits ;
	public Map<magasin, produit> CatalogMap ;
	
	@Override
    public String execute() throws Exception {
		InterfacefillData objBuild = new fillData();
		ListeMagasins = objBuild.getListeMagasins();
		ListeProduits = objBuild.getListeProduits();
		CatalogMap = objBuild.getCatalogMap();
        return SUCCESS;
    }

}
