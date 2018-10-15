package org.mavengroupid.loizani.controller ;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bonjoururi/{personne}")
public class BonjourController {

	
	
    public BonjourController() {
    
    		System.out.println("******* constructeur BonjourController : package org.springframework.stereotype.Controller"   );	
    	
	}

	@RequestMapping(method = RequestMethod.GET)
    public String afficherBonjour(final ModelMap pModel, @PathVariable(value="personne") final String sURI) {
		System.out.println("******* constructeur BonjourController - sURI = "  + sURI );	
        pModel.addAttribute("personne", sURI);
        return "bonjoururi";
    }
}