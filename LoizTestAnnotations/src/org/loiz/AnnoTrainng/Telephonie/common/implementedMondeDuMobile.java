package org.loiz.AnnoTrainng.Telephonie.common;

import java.util.ArrayList;
import java.util.List;

import org.loiz.AnnoTrainng.Telephonie.model.OperateurTelecom;
import org.loiz.AnnoTrainng.Telephonie.model.VersionDeProtable;
import org.springframework.stereotype.Component;

@Component
public  class implementedMondeDuMobile implements InterfaceMondeDuMobile 
{

	
	//InterfaceServiceMondeDuMobile iSMM ;
	
	private List<Entreprise> privobjListEntreprise ;
	
	public List<Entreprise> getPrivobjListEntreprise() {
		return privobjListEntreprise;
	}

	public void setPrivobjListEntreprise(List<Entreprise> privobjListEntreprise) {
		this.privobjListEntreprise = privobjListEntreprise;
	}

	public  void constituerListeEntreprise() {
		List<Entreprise> objListEntreprise = new ArrayList<Entreprise>(); 
		OperateurTelecom objOperateurTelecom = new OperateurTelecom();
		List<VersionDeProtable> listVersionDeProtable =  new ArrayList<VersionDeProtable>();
		//List<OperateurTelecom> listOperateurTelecom = new ArrayList<OperateurTelecom>();
		for (enumSocietes eleEnum : enumSocietes.values()) {	
			//System.out.println(eleEnum.name());
			Entreprise objEntreprise = new Entreprise();
			objOperateurTelecom = new OperateurTelecom();
			objOperateurTelecom.setPrivsFT_NomFournisseur(eleEnum.name());
			
			switch(eleEnum.name()) {
			
			   case "SFR" :
				   objEntreprise.setPrivObjFournisseurTelecom(objOperateurTelecom);
				   listVersionDeProtable =  new ArrayList<VersionDeProtable>();
				   for (enumMarqueProtableSFR eleEnumPort : enumMarqueProtableSFR.values()) {
					   VersionDeProtable objVersionDeProtable = new VersionDeProtable();
					   objVersionDeProtable.setPrivsVP_MarquePortable(eleEnumPort.name());
					   listVersionDeProtable.add(objVersionDeProtable);  
				   }
				   objEntreprise.setPrivListProtable(listVersionDeProtable);
				   objListEntreprise.add(objEntreprise);
			      break;
			   case "Bouygues" :
				   objEntreprise.setPrivObjFournisseurTelecom(objOperateurTelecom);
				   listVersionDeProtable =  new ArrayList<VersionDeProtable>();
				   for (enumMarqueProtableBouygues eleEnumPort : enumMarqueProtableBouygues.values()) {
					   VersionDeProtable objVersionDeProtable = new VersionDeProtable();
					   objVersionDeProtable.setPrivsVP_MarquePortable(eleEnumPort.name());
					   listVersionDeProtable.add(objVersionDeProtable);  
				   }
				   objEntreprise.setPrivListProtable(listVersionDeProtable);
				   objListEntreprise.add(objEntreprise);
			      break;
			   case "Orange" :
				   objEntreprise.setPrivObjFournisseurTelecom(objOperateurTelecom);
				   listVersionDeProtable =  new ArrayList<VersionDeProtable>();
				   for (enumMarqueProtableOrange eleEnumPort : enumMarqueProtableOrange.values()) {
					   VersionDeProtable objVersionDeProtable = new VersionDeProtable();
					   objVersionDeProtable.setPrivsVP_MarquePortable(eleEnumPort.name());
					   listVersionDeProtable.add(objVersionDeProtable);  
				   }
				   objEntreprise.setPrivListProtable(listVersionDeProtable);
				   objListEntreprise.add(objEntreprise);
			      break; 
			   
			   case "Free" :
				   objEntreprise.setPrivObjFournisseurTelecom(objOperateurTelecom);
				   listVersionDeProtable =  new ArrayList<VersionDeProtable>();
				   for (enumMarqueProtableFREE eleEnumPort : enumMarqueProtableFREE.values()) {
					   VersionDeProtable objVersionDeProtable = new VersionDeProtable();
					   objVersionDeProtable.setPrivsVP_MarquePortable(eleEnumPort.name());
					   listVersionDeProtable.add(objVersionDeProtable);  
				   }
				   objEntreprise.setPrivListProtable(listVersionDeProtable);
				   objListEntreprise.add(objEntreprise);
			      break;    
			   
			   default : break ;			      
			}			
						
		}
		
		this.privobjListEntreprise = objListEntreprise ;
	} 
	
	public void listerEntreprises(){		
		for(Entreprise eleEntreprise : privobjListEntreprise) {			
			OperateurTelecom oTel = eleEntreprise.getPrivObjFournisseurTelecom();
			System.out.println(oTel.getPrivsFT_NomFournisseur()+ " : ");
			listerPortablesEntreprise(eleEntreprise);
			System.out.println("\n");
		}		
	} 
	
	public void listerPortablesEntreprise(Entreprise argEnt) {
		List<VersionDeProtable> oblistVP = argEnt.getPrivListProtable();
		for (VersionDeProtable eleVP : oblistVP)
		System.out.println(" - " + eleVP.getPrivsVP_MarquePortable());
	}


}
