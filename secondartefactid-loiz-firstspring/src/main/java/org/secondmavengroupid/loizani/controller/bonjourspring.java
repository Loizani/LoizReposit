package org.secondmavengroupid.loizani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ModelAttribute;

@Controller

public class bonjourspring {
    
	public bonjourspring() {
		System.out.println("******* constructeur bonjourspring " );	
	}

	@RequestMapping (value = "/bonjour", method = RequestMethod.GET)
    public String affichebonjour(final ModelMap pModel) {       	
			pModel.addAttribute("personne", "Regis");			
			System.out.println("******* Attribut associé " );
			return "bonjour";	
		
}
	
}