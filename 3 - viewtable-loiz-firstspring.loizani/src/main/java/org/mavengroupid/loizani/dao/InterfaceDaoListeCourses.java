package org.mavengroupid.loizani.dao;

import java.util.List;

import org.mavengroupid.loizani.bean.EntityCourse;
/* Interface nommée "InterfaceDaoListeCourses" 
 * qui propose un squelette de fonction "rechercherCourses()" à remplir qui renvoi
 * une liste dont les éléments sont des entités de type "EntityCourse" */ 
public interface InterfaceDaoListeCourses {
    List<EntityCourse> rechercherListeCourses() ;
    EntityCourse rechercherPremiereCourse();
}
