package org.troisiememavengroupid.loizani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping (value = "/bonjourparam")
public class bonjourspringparam {
    
	public bonjourspringparam() {
		System.out.println("******* constructeur bonjourspring : package org.troisiememavengroupid.loizani.controller"   );	
	}
	
	@RequestMapping (method = RequestMethod.GET)
	    public String afficherBonjour(final ModelMap pModel, @RequestParam(value="personne") final String sArgReqParamPersonne) {
		System.out.println("******* Attribut parametre url de type sArgReqParamPersonne = " + sArgReqParamPersonne );
	        pModel.addAttribute("personne", sArgReqParamPersonne);
	        System.out.println("******* Attribut parametre url de type \"bonjourparam?personne=valparam\" attribué dans le ModelMap" );
	        
	        return "bonjourinterface";
	    }
	
}