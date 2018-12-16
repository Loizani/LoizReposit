package org.loiz.AnnoTraining.Geometrie;

import org.loiz.AnnoTraining.Geometrie.Configuration.AppConfigDesSurfaces;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppCalculSurface {

	public static void main(String[] argv) {
		double dRayon = 4;		
		String msgS = "" ;
		String messV = ""  ;
		ApplicationContext objFactory = new AnnotationConfigApplicationContext(	AppConfigDesSurfaces.class);
		// declarationde l'objet "Beané" ObjetGeometrique
		ObjetGeometrique objFactorySurCer = (ObjetGeometrique) objFactory.getBean(ObjetGeometrique.class);	
		objFactorySurCer.setRayon(dRayon);
		objFactorySurCer.setChaine("cercle");
		
		msgS = objFactorySurCer.afficherSurface() ;
		System.out.println(msgS);
		
		messV = objFactorySurCer.afficherVolume();
		System.out.println(messV);
		
		((AnnotationConfigApplicationContext) objFactory).close();
	}

}
