package org.mavengroupid.loizani.controller;

import org.springframework.stereotype.Controller;  			   //spring-context-5.1.0.RELEASE.jar
import org.springframework.ui.ModelMap; 		               //spring-context-5.1.0.RELEASE.jar
import org.springframework.web.bind.annotation.RequestMapping; //spring-web-5.1.0.RELEASE.jar
import org.springframework.web.bind.annotation.RequestMethod;  //spring-web-5.1.0.RELEASE.jar


@Controller
public class bonjourspring {
    
	public bonjourspring() {
		System.out.println("******* constructeur bonjourspring package org.secondmavengroupid.loizani.controller " );	
	}
	@RequestMapping (value = "/bonjour", method = RequestMethod.GET)
	// @RequestMapping (value = "/bonjour")  //fonctionne aussi 
    public String affichebonjour(final ModelMap pModel) {       	
			pModel.addAttribute("personne", "Regis");			
			System.out.println("******* Attribut associé " );
			return "vues/bonjour";	
		
}
	
}