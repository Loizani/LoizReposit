package org.mavengroupid.loizani.myservices;
import org.mavengroupid.loizani.bean.EntityCourse;
import org.mavengroupid.loizani.dao.InterfaceDaoListeCourses;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ImplemServiceListeCourses implements InterfaceServiceListeCourses {

    @Autowired
    private InterfaceDaoListeCourses dao;

    @Transactional(readOnly=true)
    public List<EntityCourse> rechercherCourses() {
    	System.out.println("dans l\'implementation du service \"ImplemServiceListeCourses\"");
        return dao.rechercherCourses();
    }
}
