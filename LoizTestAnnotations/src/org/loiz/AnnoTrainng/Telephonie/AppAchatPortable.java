package org.loiz.AnnoTrainng.Telephonie;

public class AppAchatPortable {

	public  static void main(String[] Argv) {
		
		FournisseurTelecom objFourTelecom = new FournisseurTelecom("SFR", "France", 2000000000);
		FabriquantProtable objFabPortable = new FabriquantProtable("Samsung","ecran", 200);
		
		System.out.println(objFourTelecom.toString());
		System.out.println(objFabPortable.toString());
		
	}	
	
}
