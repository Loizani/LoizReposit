package org.mavengroupid.loizani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class using {
    
	public using() {
		System.out.println("******* constructeur using, mapping à la  racine" );	
	}
	@RequestMapping (value = "/", method = RequestMethod.GET)
    public String afficheUsing() {				
			System.out.println("******* dans afficheUsing" );
			return "Using";	
		
}
	
}