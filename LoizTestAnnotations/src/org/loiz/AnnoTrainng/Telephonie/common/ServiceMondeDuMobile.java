package org.loiz.AnnoTrainng.Telephonie.common;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.ArrayList;
//import java.util.List;
//
//import org.loiz.AnnoTrainng.Telephonie.model.OperateurTelecom;
//import org.loiz.AnnoTrainng.Telephonie.model.VersionDeProtable;


public  class ServiceMondeDuMobile 
{

	@Autowired
	InterfaceMondeDuMobile iSMM ;	
		
	public InterfaceMondeDuMobile getiSMM() {
		return iSMM;
	}

	public void setiSMM(InterfaceMondeDuMobile iSMM) {
		this.iSMM = iSMM;
	}

	public void constituerEtlisterEntreprises(){	
		iSMM.constituerListeEntreprise();
		iSMM.listerEntreprises();
	} 	
	
	public void listerPortablesEntreprise(Entreprise argEnt) {
		iSMM.listerPortablesEntreprise(argEnt);
	}


}
