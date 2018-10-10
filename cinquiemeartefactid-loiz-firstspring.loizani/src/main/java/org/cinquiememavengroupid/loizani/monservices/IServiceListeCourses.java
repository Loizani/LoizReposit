package org.cinquiememavengroupid.loizani.monservices;

import java.util.List;

import org.cinquiememavengroupid.loizani.bean.Course;

public interface IServiceListeCourses {
    List<Course> rechercherCourses();
    void creerCourse(final String pLibelle, final Integer pQuantite);
}
