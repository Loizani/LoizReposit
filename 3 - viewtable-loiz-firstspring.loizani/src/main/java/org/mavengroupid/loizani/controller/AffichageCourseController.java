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

//@Configuration
//@ComponentScan("org.mavengroupid.loizani")

public class AffichageCourseController {      
	
	@Autowired
    private InterfaceServiceListeCourses privIntService;      
	
	@RequestMapping(value="/afficherListeCourses",method = RequestMethod.GET)
    public String afficherListeC(ModelMap pModel) {
       // @SuppressWarnings("unchecked")
		final List<EntityCourse> ListeEntityCourses = (List<EntityCourse>) privIntService.rechercherListeCourses();
        final EntityCourse premiereCourses = (EntityCourse) privIntService.rechercherPremiereCourses();
        pModel.addAttribute("listeCourses", ListeEntityCourses);
        pModel.addAttribute("premiereCourse", premiereCourses);
        return "vues/listeCourses";
    }
	
	
	@RequestMapping(value="/afficherpremiereCourse",method = RequestMethod.GET)
    public String afficherPremiereC(ModelMap pModel) {
       // @SuppressWarnings("unchecked")
	   final EntityCourse premiereCourses = (EntityCourse) privIntService.rechercherPremiereCourses();    
        pModel.addAttribute("premiereCourse", premiereCourses);
        return "vues/premiereCourse";
    }
	
	
    public AffichageCourseController() {
    	System.out.println("******* constructeur AffichageCourseController : package org.mavengroupid.loizani.controller"   );	
    	
	}
	
}