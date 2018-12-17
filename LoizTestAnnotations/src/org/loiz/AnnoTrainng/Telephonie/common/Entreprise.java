package org.loiz.AnnoTrainng.Telephonie.common;

import java.util.List;
import org.loiz.AnnoTrainng.Telephonie.model.OperateurTelecom;
import org.loiz.AnnoTrainng.Telephonie.model.VersionDeProtable;



public class Entreprise {
	
	//Cette classe va revoyer un objet Entreprise
	//constitué d'un objet OperateurTelecom
	//Et d'une liste de portables fabriqués VersionDeProtable
	
	 private OperateurTelecom privObjFournisseurTelecom ;
     private List<VersionDeProtable> privListProtable ;
     
	public OperateurTelecom getPrivObjFournisseurTelecom() {
		return privObjFournisseurTelecom;
	}
	public void setPrivObjFournisseurTelecom(
			OperateurTelecom privObjFournisseurTelecom) {
		this.privObjFournisseurTelecom = privObjFournisseurTelecom;
	}
	public List<VersionDeProtable> getPrivListProtable() {
		return privListProtable;
	}
	public void setPrivListProtable(List<VersionDeProtable> privListProtable) {
		this.privListProtable = privListProtable;
	}      
     
    }

