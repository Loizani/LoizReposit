package org.loiz.AnnoTraining.Geometrie;

public class ObjetGeometrique {	
	 
	private String privNomFigure;

	private FigureCirculaire privObjFigCirc ;
	
	public FigureCirculaire getPrivObjFigCirc() {
		return privObjFigCirc;
	}

	public void setPrivObjFigCirc(FigureCirculaire privObjFigCirc) {
		this.privObjFigCirc = privObjFigCirc;
	}

	public ObjetGeometrique() {
		super(); 
	}	

	public void setChaine(String NomFigure) {
		this.privNomFigure = NomFigure;
	}

	public String afficher() {
		return privNomFigure ;
	}	
}
