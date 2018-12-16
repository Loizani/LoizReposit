package org.loiz.AnnoTraining.Geometrie;

public class FigureCirculaire  implements InterfaceFigureCirculaire
			{ 

    private double rayon ;
	private double surface;	
	
	public FigureCirculaire() {
		super();
	}	
	
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public double  calculVolumeSphere() {			
		return (4*(Math.PI)*(rayon*rayon*rayon))/3;
	}	
	
	public double  calculDiametre() {			
		return 2*rayon;
	}	
	
	public double  calculSurface() {		
		this.surface  = Math.PI * rayon ;
		return surface;
	}	
	
}
