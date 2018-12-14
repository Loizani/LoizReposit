package com.websystique.springmvc.dao;

import java.io.Serializable;

//import java.lang.reflect.ParameterizedType;

//import org.hibernate.Criteria;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDaoWithGenerics<PK extends Serializable, T> {
	
	private final Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDaoWithGenerics(){
		this.persistentClass =(Class<T>) ((java.lang.reflect.ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	@Autowired
	private org.hibernate.SessionFactory sessionFactory;

	protected org.hibernate.Session localeGetSession(){
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public T getByKey(PK key) {
		return (T) localeGetSession().get(persistentClass, key);
	}

	public void persist(T entity) {
		localeGetSession().persist(entity);
	}

	public void update(T entity) {
		localeGetSession().update(entity);
	}

	public void delete(T entity) {
		localeGetSession().delete(entity);
	}
	
	//accessible que par les classes du package courant
	public org.hibernate.Criteria createEntityCriteria(){
		System.out.println(persistentClass.getCanonicalName());
		return localeGetSession().createCriteria(persistentClass);
		
	}

}
