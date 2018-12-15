package org.loiz.AnnoTraining.Geometrie;

public class ObjetGeometrique {	
	
	private String chaine;

	public ObjetGeometrique() {
		super();
	}	
	
	public void setChaine(String chaine) {
		this.chaine = chaine;
	}

	public ObjetGeometrique(String chaine) {
		this.chaine = chaine;
	}

	public void afficher() {
		System.out.println("Ceci est un objet geometrique : " + chaine);
	}
	
	

}
