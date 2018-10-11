package org.mavengroupid.loizani.myservices;
 
import java.util.List;

import org.mavengroupid.loizani.bean.Course;

public interface IServiceListeCourses {
    List<Course> rechercherCourses();
    void creerCourse(final String pLibelle, final Integer pQuantite);
    void supprimerCourse(final Integer pIdCourse);
    void modifierCourses(final List<Course> pListeCourses);
}
