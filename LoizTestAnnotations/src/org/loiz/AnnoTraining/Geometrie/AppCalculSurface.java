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
		// declarationde l'objet "Bean�" ObjetGeometrique
		ObjetGeometrique objFactorySurCer = (ObjetGeometrique) objFactory.getBean("ObjetGeometrique");		
		// Cr�ation d'un objet "FigureCirculaire" par declaration entant que Bean 
		// Avec @Autowire l'instruction suivante n'est pas n�cessaire 
		// Le lien avec la classe impl�mentante se fait par d�claration d'une Bean 
		//Laligne suivante est masqu�e
/*		InterfaceFigureCirculaire objFigCirc = new FigureCirculaire();			
		objFactorySurCer.setPrivInterfaceObjFigCirc(objFigCirc); */
		objFactorySurCer.setRayon(dRayon);
		objFactorySurCer.setChaine("cercle");
		
		msgS = objFactorySurCer.afficherSurface() ;
		System.out.println(msgS);
		
		messV = objFactorySurCer.afficherVolume();
		System.out.println(messV);
		
		((AnnotationConfigApplicationContext) objFactory).close();
	}

}
