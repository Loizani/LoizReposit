package org.mavengroupid.loizani.myservices;

import java.util.List;

import org.mavengroupid.loizani.bean.EntityCourse;

public interface InterfaceServiceListeCourses {
	
	List<EntityCourse> rechercherListeCourses() ;
    
	EntityCourse rechercherPremiereCourses();
    
}
