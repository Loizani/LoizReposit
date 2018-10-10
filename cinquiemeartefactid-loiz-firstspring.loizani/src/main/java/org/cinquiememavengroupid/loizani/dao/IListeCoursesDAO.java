package org.cinquiememavengroupid.loizani.dao;

import java.util.List;

import org.cinquiememavengroupid.loizani.bean.Course;

public interface IListeCoursesDAO {
    List<Course> rechercherCourses();
    void creerCourse(final Course pCourse);
}
