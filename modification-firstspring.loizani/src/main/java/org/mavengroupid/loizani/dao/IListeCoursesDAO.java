package org.mavengroupid.loizani.dao;

import java.util.List;

import org.mavengroupid.loizani.bean.Course;

public interface IListeCoursesDAO {
    List<Course> rechercherCourses();
    void creerCourse(final Course pCourse);
    void supprimerCourse(final Course pCourse);
    void modifierCourse(final Course pCourse);
}
