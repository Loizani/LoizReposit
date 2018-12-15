package org.loiz.AnnoTraining.Geometrie;

import org.loiz.AnnoTraining.Geometrie.configurations.AppConfigDesSurfaces;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppCaclulSurface {

	public static void main(String[] argv) {		
		
		ApplicationContext objFactory = new AnnotationConfigApplicationContext(AppConfigDesSurfaces.class);
		 
		//SurfaceCercle objSurCer = new SurfaceCercle(4);
		SurfaceCercle objFactorySurCer = objFactory.getBean(SurfaceCercle.class) ; 
		
		objFactorySurCer.setRayon(4);
		
		//System.out.println("la surface du cercle de rayon 4cm est : " + objSurCer.getSurface() );
		
		System.out.println("Avec ApplicationContext, la surface du cercle de rayon 4cm est : " + objFactorySurCer.getSurface() );
	}
	
}
