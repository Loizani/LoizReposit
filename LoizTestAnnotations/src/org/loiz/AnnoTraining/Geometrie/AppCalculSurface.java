package org.loiz.AnnoTraining.Geometrie;

import org.loiz.AnnoTraining.Geometrie.configurations.AppConfigDesSurfaces;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppCalculSurface {

	public static void main(String[] argv) {
		double dRayon = 4;
		String myString = "Cercle de " + dRayon + " cm de rayon";
		String msgS = "";
		String msgV = "";
		ApplicationContext objFactory = new AnnotationConfigApplicationContext(	AppConfigDesSurfaces.class);
		// declarationde l'objet "Beané" ObjetGeometrique
		ObjetGeometrique objFactorySurCer = (ObjetGeometrique) objFactory.getBean("ObjetGeometrique");

		// Création d'un objet "FigureCirculaire" dans l'objet Beané "ObjetGeometrique"

		FigureCirculaire objFigCirc = new FigureCirculaire();
		objFactorySurCer.setPrivObjFigCirc(objFigCirc);
		objFactorySurCer.setChaine(myString);

		objFigCirc.setRayon(dRayon);

		msgS = objFactorySurCer.afficher() + "et de surface  : "	+ objFigCirc.calculSurface() + "  cm2";
		msgV = "Sphere correpsondante de volume : "	+ objFigCirc.calculVolumeSphere() + " cm3\n\n";
		System.out.println(msgS);
		System.out.println(msgV);

		((AnnotationConfigApplicationContext) objFactory).close();
	}

}
