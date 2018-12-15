package org.loiz.AnnoTraining.Geometrie;
import org.loiz.AnnoTraining.Geometrie.configurations.AppConfigDesSurfaces;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppCalculSurface {

	public static void main(String[] argv) {

		
		ApplicationContext objFactory = new AnnotationConfigApplicationContext(AppConfigDesSurfaces.class);			
		ObjetGeometrique objFactorySurCer = (ObjetGeometrique) objFactory.getBean("ObjetGeometrique") ;	
		String myString = "zzzzz" ;
		objFactorySurCer.setChaine(myString);
		objFactorySurCer.afficher();

		
		((AnnotationConfigApplicationContext) objFactory).close();
	}
	
}
