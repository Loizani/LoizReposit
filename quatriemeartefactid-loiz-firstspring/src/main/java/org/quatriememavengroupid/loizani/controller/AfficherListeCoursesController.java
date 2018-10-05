package org.quatriememavengroupid.loizani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.quatriememavengroupid.loizani.bean.Course;
import org.quatriememavengroupid.loizani.services.IServiceListeCourses;

@Controller
@RequestMapping(value="/afficherListeCourses")
public class AfficherListeCoursesController {

    @Autowired
    private IServiceListeCourses service;

    
    
    
    public AfficherListeCoursesController() {
    	System.out.println("******* constructeur AfficherListeCoursesController : package org.quatriememavengroupid.loizani.controller"   );	
    	
	}


	@RequestMapping(method = RequestMethod.GET)
    public String afficher(ModelMap pModel) {
        final List<Course> lListeCourses = service.rechercherCourses();
        pModel.addAttribute("listeCourses", lListeCourses);
        return "listeCourses";
    }
}