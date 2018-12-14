package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.EntityUserProfile;


public interface InterfaceUserProfileService {

	EntityUserProfile findById(int id);

	EntityUserProfile findByType(String type);
	
	List<EntityUserProfile> findAll();
	
}
