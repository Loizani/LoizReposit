
package org.loiz.AnnoTrainng.Telephonie;
import java.util.List;

import org.loiz.AnnoTrainng.Telephonie.common.Entreprise;
import org.loiz.AnnoTrainng.Telephonie.common.ServiceMondeDuMobile;
import org.loiz.AnnoTrainng.Telephonie.common.enumSocietes;
import org.loiz.AnnoTrainng.Telephonie.common.implementedMondeDuMobile;
import org.loiz.AnnoTrainng.Telephonie.configuration.AppConfigTelephonie;
import org.loiz.AnnoTrainng.Telephonie.model.OperateurTelecom;
import org.loiz.AnnoTrainng.Telephonie.model.VersionDeProtable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppAchatPortable {
	
	public  static void main(String[] Argv) {

		ApplicationContext objFactory = new AnnotationConfigApplicationContext(AppConfigTelephonie.class);				
		ServiceMondeDuMobile objServiceMondeDuMobile = (ServiceMondeDuMobile) objFactory.getBean(ServiceMondeDuMobile.class);		 
				
		objServiceMondeDuMobile.constituerEtlisterEntreprises();
		
		implementedMondeDuMobile objIMM =  (implementedMondeDuMobile) objServiceMondeDuMobile.getiSMM();
		List<Entreprise>  objListIMM = objIMM.getPrivobjListEntreprise() ;
		
		for(Entreprise eleEnt : objListIMM){
			OperateurTelecom objOperateurTelecom  = eleEnt.getPrivObjFournisseurTelecom();
			List<VersionDeProtable> objListVersionDeProtable = eleEnt.getPrivListProtable();
			String strNomFour = objOperateurTelecom.getPrivsFT_NomFournisseur();	
			
			if (strNomFour.toString() == "SFR") {				
				for(VersionDeProtable eleVP : objListVersionDeProtable)
				System.out.println(enumSocietes.SFR.name() + " : " + eleVP.getPrivsVP_MarquePortable());
			}
		}
		
		((AnnotationConfigApplicationContext) objFactory).close();		
	}
	
}