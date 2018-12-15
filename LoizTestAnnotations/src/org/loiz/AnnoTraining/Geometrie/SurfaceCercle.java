package org.loiz.AnnoTraining.Geometrie;

public class SurfaceCercle {

	private  double rayon ;
	private  double surface ;	
	 
	public SurfaceCercle() {
		super();
	}

	public SurfaceCercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public double  getSurface() {		
		this.surface  = Math.PI*rayon ;
		return surface;
	}		
	
	
}
