package org.loiz.AnnoTrainng.Telephonie.common;

import java.util.List;


public interface InterfaceMondeDuMobile  {
	
	public List<Entreprise> listEntreprises();
	
	public void constituerListeEntreprise() ;

	public void listerEntreprises(); 
	
	public void listerPortablesEntreprise(Entreprise e);
	
	
}
