package com.websystique.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.EntityUserProfile;



@Repository("userProfileDao")
public class ImplementedUserProfileDao extends AbstractDaoWithGenerics<Integer, EntityUserProfile>implements InterfaceUserProfileDao{

	public EntityUserProfile findById(int id) {
		return getByKey(id);
	}

	public EntityUserProfile findByType(String type) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("type", type));
		return (EntityUserProfile) crit.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<EntityUserProfile> findAll(){
		Criteria crit = createEntityCriteria();
		crit.addOrder(Order.asc("type"));
		return (List<EntityUserProfile>)crit.list();
	}
	
}
