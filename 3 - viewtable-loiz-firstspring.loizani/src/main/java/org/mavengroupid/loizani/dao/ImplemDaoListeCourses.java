package org.mavengroupid.loizani.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;
import org.mavengroupid.loizani.bean.EntityCourse;

@Repository
public class ImplemDaoListeCourses implements InterfaceDaoListeCourses {

    @PersistenceContext
    private EntityManager privObjEntityManager;
 
    public List<EntityCourse> rechercherListeCourses() {
        final CriteriaBuilder lCriteriaBuilder = privObjEntityManager.getCriteriaBuilder() ; 
        final CriteriaQuery<EntityCourse> lCriteriaQuery = lCriteriaBuilder.createQuery(EntityCourse.class) ; 
        final Root<EntityCourse> lRoot = lCriteriaQuery.from(EntityCourse.class) ; 
        lCriteriaQuery.select(lRoot) ; 
        final TypedQuery<EntityCourse> lTypedQuery = privObjEntityManager.createQuery(lCriteriaQuery) ; 
      
        return lTypedQuery.getResultList() ; 
    }
    public EntityCourse rechercherPremiereCourse() {
        @SuppressWarnings("unchecked")
		Query<List<EntityCourse>> myQuery = (Query<List<EntityCourse>>) privObjEntityManager.createQuery("from EntityCourse where id = 1");
        EntityCourse ec = (EntityCourse)myQuery.uniqueResult();
        return ec ; 
    }
    
}