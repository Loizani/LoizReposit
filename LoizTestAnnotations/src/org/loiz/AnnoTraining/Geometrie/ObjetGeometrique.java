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

	public void setRayon(double rayon) {
		privInterfaceObjFigCirc.setRayon(rayon); 
	}
	
	public void setChaine(String NomFigure) {
		this.privNomFigure = NomFigure;
	}

	public String afficherSurface() {
		//Sans @Autowire
		return privNomFigure + " de surface " + privInterfaceObjFigCirc.calculSurface() ;		
	}
	
	public String afficherVolume() {
		//Sans @Autowire
		return privNomFigure + " de sphere de volume " + privInterfaceObjFigCirc.calculVolumeSphere() ;		
	}	
}






























