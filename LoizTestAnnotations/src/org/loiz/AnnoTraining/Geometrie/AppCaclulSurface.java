package org.loiz.AnnoTraining.Geometrie;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppCaclulSurface {

	public static void main(String[] argv) {
		
		
		//ApplicationContext objFactory = new AnnotationConfigApplicationContext();
		
		SurfaceCercle objSurCer = new SurfaceCercle(4);
		//SurfaceCercle objSurCer = objFactory.getBean(SurfaceCercle.class) ; 
		
		objSurCer.setRayon(4);
		
		System.out.println("la surface du cercle de rayon 4cm est : " + objSurCer.getSurface() );
		
	}
	
}
