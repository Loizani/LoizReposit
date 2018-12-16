package org.loiz.AnnoTraining.Geometrie;

import org.loiz.AnnoTraining.Geometrie.configurations.AppConfigDesSurfaces;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppCalculSurface {

	public static void main(String[] argv) {
		double dRayon = 4;		
		String msgS = "";
		ApplicationContext objFactory = new AnnotationConfigApplicationContext(	AppConfigDesSurfaces.class);
		// declarationde l'objet "Bean�" ObjetGeometrique
		ObjetGeometrique objFactorySurCer = (ObjetGeometrique) objFactory.getBean("ObjetGeometrique");
		
		//SANS @Autowire !!
		// Cr�ation d'un objet "FigureCirculaire" dans l'objet Bean� "ObjetGeometrique"
		InterfaceFigureCirculaire objFigCirc = new FigureCirculaire();
		objFactorySurCer.setPrivInterfaceObjFigCirc(objFigCirc);
		objFigCirc.setRayon(dRayon);
		objFactorySurCer.setChaine("cercle");
		
		msgS = objFactorySurCer.afficher() ;
		System.out.println(msgS);
		
		((AnnotationConfigApplicationContext) objFactory).close();
	}

}
