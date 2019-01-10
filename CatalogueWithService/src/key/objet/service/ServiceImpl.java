package key.objet.service;

import java.util.List;
import java.util.Map;

import key.objet.beans.magasin;
import key.objet.beans.produit;
import key.objet.dao.InterfacefillDataDao;

public class ServiceImpl implements InterfaceService {
	

	private InterfacefillDataDao IDAO ;
	
	public ServiceImpl(InterfacefillDataDao iDAO) {
		super();
		IDAO = iDAO;
	}

	public List<magasin> getListeMagasins() {
		return IDAO.getListeMagasins();
	}

	public List<produit> getListeProduits() {
		return IDAO.getListeProduits();
	}


	public  Map<magasin, produit> getCatalogMap() {
		return IDAO.getCatalogMap();
	}





}
