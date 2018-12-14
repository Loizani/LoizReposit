package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.EntityUser;


public interface InterfaceUserService {
	
	EntityUser findById(int id);
	
	EntityUser findBySSO(String sso);
	
	void saveUser(EntityUser user);
	
	void updateUser(EntityUser user);
	
	void deleteUserBySSO(String sso);

	List<EntityUser> findAllUsers(); 
	
	boolean isUserSSOUnique(Integer id, String sso);

}