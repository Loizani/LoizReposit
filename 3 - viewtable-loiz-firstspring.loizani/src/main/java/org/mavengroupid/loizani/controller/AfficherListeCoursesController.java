package org.mavengroupid.loizani.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
import org.mavengroupid.loizani.bean.EntityCourse;
import org.mavengroupid.loizani.myservices.InterfaceServiceListeCourses;

import java.util.List;


@Controller
@RequestMapping(value="/afficherListeCourses")
//@Configuration
//@ComponentScan("org.mavengroupid.loizani")

public class AfficherListeCoursesController {    
    
    @Autowired
    private InterfaceServiceListeCourses privIntService;      


	@RequestMapping(method = RequestMethod.GET)
    public String afficher(ModelMap pModel) {
        final List<EntityCourse> ListeEntityCourses = privIntService.rechercherCourses();
        pModel.addAttribute("listeCourses", ListeEntityCourses);
        return "vues/listeCourses";
    }
	
    public AfficherListeCoursesController() {
    	System.out.println("******* constructeur AfficherListeCoursesController : package org.mavengroupid.loizani.controller"   );	
    	
	}
	
}