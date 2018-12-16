package org.loiz.AnnoTraining.Geometrie;

import org.loiz.AnnoTraining.Geometrie.configurations.AppConfigDesSurfaces;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppCalculSurface {

	public static void main(String[] argv) {
		double dRayon = 4;		
		String msgS = "" ;
		String messV = ""  ;
		ApplicationContext objFactory = new AnnotationConfigApplicationContext(	AppConfigDesSurfaces.class);
		// declarationde l'objet "Beané" ObjetGeometrique
		ObjetGeometrique objFactorySurCer = (ObjetGeometrique) objFactory.getBean("ObjetGeometrique");
		// Création d'un objet "FigureCirculaire" dans l'objet Beané "ObjetGeometrique"
		//SANS @Autowire : le lien se fait avec l'instruction new
		InterfaceFigureCirculaire objFigCirc = new FigureCirculaire();		
		
		objFactorySurCer.setPrivInterfaceObjFigCirc(objFigCirc);
		objFactorySurCer.setRayon(dRayon);
		objFactorySurCer.setChaine("cercle");
		
		msgS = objFactorySurCer.afficherSurface() ;
		System.out.println(msgS);
		
		messV = objFactorySurCer.afficherVolume();
		System.out.println(messV);
		
		((AnnotationConfigApplicationContext) objFactory).close();
	}

}
