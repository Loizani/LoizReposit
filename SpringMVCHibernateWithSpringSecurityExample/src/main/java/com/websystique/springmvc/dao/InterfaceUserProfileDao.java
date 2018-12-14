package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.EntityUserProfile;


public interface InterfaceUserProfileDao {	 
	 
    List<EntityUserProfile> findAll();
	
	EntityUserProfile findByType(String type);
	
	EntityUserProfile findById(int id);
}
