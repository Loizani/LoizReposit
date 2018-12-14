package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.InterfaceUserProfileDao;
import com.websystique.springmvc.model.EntityUserProfile;


@Service("userProfileService")
@Transactional
public class ImplementedUserProfileService implements InterfaceUserProfileService{
	
	@Autowired
	InterfaceUserProfileDao dao;
	
	public EntityUserProfile findById(int id) {
		return dao.findById(id);
	}

	public EntityUserProfile findByType(String type){
		return dao.findByType(type);
	}

	public List<EntityUserProfile> findAll() {
		return dao.findAll();
	}
}
