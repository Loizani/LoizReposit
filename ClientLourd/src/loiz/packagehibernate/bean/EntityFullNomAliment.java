package loiz.packagehibernate.bean;

import javax.persistence.Embeddable;

@Embeddable
public class EntityFullNomAliment {
	
	private String sNomAliment ;   //nom usuel de l'aliment 
	private String sTypeAliment ;  //fruit, legume
	private String sTypeMatiere  ; //solide, liquide, poudre
	
	public EntityFullNomAliment() {
		super();	
	}

	public String getsNomAliment() {
		return sNomAliment;
	}

	public void setsNomAliment(String sNomAliment) {
		this.sNomAliment = sNomAliment;
	}

	public String getsTypeAliment() {
		return sTypeAliment;
	}

	public void setsTypeAliment(String sTypeAliment) {
		this.sTypeAliment = sTypeAliment;
	}

	public String getsTypeMatiere() {
		return sTypeMatiere;
	}

	public void setsTypeMatiere(String sTypeMatiere) {
		this.sTypeMatiere = sTypeMatiere;
	}

	@Override
	public String toString() {
		return "EntityFullNomAliment [sNomAliment=" + sNomAliment + ", sTypeAliment=" + sTypeAliment + ", sTypeMatiere="
				+ sTypeMatiere + "]";
	}		

}
