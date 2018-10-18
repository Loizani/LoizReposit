package org.mavengroupid.loizani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class bonjourspring {
    private ModelMap pModmap ;
	public bonjourspring() {
		System.out.println("******* constructeur bonjourspring package org.secondmavengroupid.loizani.controller " );	
	}

	@RequestMapping (value = "/bonjour", method = RequestMethod.GET)
    public String affichebonjour(final ModelMap argModel) {       	
		    argModel.addAttribute("personne", "Regis");	
		    pModmap = argModel ;
		    String strAttPersonne =  (String) argModel.get("personne") ;
			System.out.println("******* fonction affichebonjour > Attribut personne vaut : " + strAttPersonne);
			return "vues/bonjour";		
}
	
	@RequestMapping (value = "/test", method = RequestMethod.GET)
    public String afficheTest() {       				
			System.out.println("******* test " );
		    String strAttPersonne =  (String) pModmap.get("personne") ;
			System.out.println("******* fonction Test > Attribut personne vaut : " + strAttPersonne);
			return "vues/bonjour";		
}
	
}