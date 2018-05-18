package test.javabeanpac ;
import java.io.Serializable;

public class IdentiteBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String Nom ;
	private String Prenom ; 
	private  int JourNassance ;
	private  int MoisNassance ;
	private  int AnneeNassance ;		
	
	public IdentiteBean() {
	
	}
	public String getNom() {
		return this.Nom;
	}
	public void setNom(String nom) {
		this.Nom = nom;
	}
	public String getPrenom() {
		return this.Prenom;
	}
	public void setPrenom(String prenom) {
		this.Prenom = prenom;
	}
	public int getJourNassance() {
		return this.JourNassance;
	}
	public void setJourNassance(int jourNassance) {
		this.JourNassance = jourNassance;
	}
	public int getMoisNassance() {
		return this.MoisNassance;
	}
	public void setMoisNassance(int moisNassance) {
		this.MoisNassance = moisNassance;
	}
	public int getAnneeNassance() {
		return this.AnneeNassance;
	}
	public void setAnneeNassance(int anneeNassance) {
		this.AnneeNassance = anneeNassance;
	}
	
	
}
