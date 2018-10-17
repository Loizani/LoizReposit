package org.mavengroupid.loizani.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.mavengroupid.loizani.bean.Course;
import org.mavengroupid.loizani.monservices.IServiceListeCourses;

import java.util.List;


@Controller
@RequestMapping(value="/afficherListeCourses")
@Configuration
@ComponentScan("org.mavengroupid.loizani")

public class AfficherListeCoursesController {    

    
    @Autowired
    private IServiceListeCourses pAttService;      


	@RequestMapping(method = RequestMethod.GET)
    public String afficher(ModelMap pModel) {
        final List<Course> lListeCourses = pAttService.rechercherCourses();
        pModel.addAttribute("listeCourses", lListeCourses);
        return "vues/listeCourses";
    }
	
    public AfficherListeCoursesController() {
    	System.out.println("******* constructeur AfficherListeCoursesController : package org.mavengroupid.loizani.controller"   );	
    	
	}
	
}