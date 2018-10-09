package org.quatriememavengroupid.loizani.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.quatriememavengroupid.loizani.bean.Course;
import org.quatriememavengroupid.loizani.monservices.IServiceListeCourses;

import java.util.List;


@Controller
@RequestMapping(value="/afficherListeCourses")
@Configuration
@ComponentScan("org.quatriememavengroupid.loizani")

public class AfficherListeCoursesController {    

    
    @Autowired
    private IServiceListeCourses pAttService;      


	@RequestMapping(method = RequestMethod.GET)
    public String afficher(ModelMap pModel) {
        final List<Course> lListeCourses = pAttService.rechercherCourses();
        pModel.addAttribute("listeCourses", lListeCourses);
        return "listeCourses";
    }
	
    public AfficherListeCoursesController() {
    	System.out.println("******* constructeur AfficherListeCoursesController : package org.quatriememavengroupid.loizani.controller"   );	
    	
	}
	
}