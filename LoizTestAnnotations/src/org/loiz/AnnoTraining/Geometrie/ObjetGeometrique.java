package org.loiz.AnnoTraining.Geometrie;

public class ObjetGeometrique {	
	 
	private String privNomFigure;

	private InterfaceFigureCirculaire privInterfaceObjFigCirc ;
	
	public InterfaceFigureCirculaire getPrivInterfaceObjFigCirc() {
		return privInterfaceObjFigCirc;
	}

	public void setPrivInterfaceObjFigCirc(
			InterfaceFigureCirculaire privInterfaceObjFigCirc) {
		this.privInterfaceObjFigCirc = privInterfaceObjFigCirc;
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
