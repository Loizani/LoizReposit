package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.EntityUser;


public interface InterfaceUserDao {

	EntityUser findById(int id);
	
	EntityUser findBySSO(String sso);
	
	void save(EntityUser user);
	
	void deleteBySSO(String sso);
	
	List<EntityUser> findAllUsers();

}

