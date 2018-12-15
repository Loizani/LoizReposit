package org.loiz.AnnoTrainng.Telephonie;

public class FournisseurTelecom {
	
	private String FT_NomFournisseur ;
	private String FT_Pays ;
	private int    FT_ChiffreAffaire ;
	
	public FournisseurTelecom(String fT_NomFournisseur, String fT_Pays,
			int fT_ChiffreAffaire) {
		super();
		FT_NomFournisseur = fT_NomFournisseur;
		FT_Pays = fT_Pays;
		FT_ChiffreAffaire = fT_ChiffreAffaire;
	}

	public String getFT_NomFournisseur() {
		return FT_NomFournisseur;
	}

	public void setFT_NomFournisseur(String fT_NomFournisseur) {
		FT_NomFournisseur = fT_NomFournisseur;
	}

	public String getFT_Pays() {
		return FT_Pays;
	}

	public void setFT_Pays(String fT_Pays) {
		FT_Pays = fT_Pays;
	}

	public int getFT_ChiffreAffaire() {
		return FT_ChiffreAffaire;
	}

	public void setFT_ChiffreAffaire(int fT_ChiffreAffaire) {
		FT_ChiffreAffaire = fT_ChiffreAffaire;
	}

	@Override
	public String toString() {
		return "FournisseurTelecom [FT_NomFournisseur=" + FT_NomFournisseur
				+ ", FT_Pays=" + FT_Pays + ", FT_ChiffreAffaire="
				+ FT_ChiffreAffaire + "]";
	}
	
	
}
