package key.objet.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import key.objet.dao.InterfacefillDataDao;
import key.objet.dao.fillDataDaoImplem;
import key.objet.entities.magasin;
import key.objet.entities.produit;

@Component
public class ServiceImpl implements InterfaceService {

	 
	private InterfacefillDataDao IDAO ;
		
	
	public ServiceImpl() {
		super();
		IDAO =  new fillDataDaoImplem();
		IDAO.initialisation();
		System.out.println("instanciation (avec argument iDAO) de la classe ServiceImpl");
	}
	
	public void setIDAO(InterfacefillDataDao iDAO) {
		System.out.println("setIDAO (avec argument InterfacefillDataDao iDAO) de la classe ServiceImpl");
		this.IDAO = iDAO;
	}

	public InterfacefillDataDao getIDAO() {
		return IDAO;
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
