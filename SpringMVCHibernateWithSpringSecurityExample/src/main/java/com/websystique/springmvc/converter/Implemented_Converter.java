package com.websystique.springmvc.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.websystique.springmvc.model.EntityUserProfile;
import com.websystique.springmvc.service.InterfaceUserProfileService;
/* A converter class used in views to map id's to actual userProfile objects. */

@Component
public class Implemented_Converter implements Converter<Object, EntityUserProfile>{

	static final Logger logger = LoggerFactory.getLogger(Implemented_Converter.class);
	
	@Autowired
	InterfaceUserProfileService userProfileService;

	/**
	 * Gets UserProfile by Id
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
	public EntityUserProfile convert(Object element) {
		Integer id = Integer.parseInt((String)element);
		EntityUserProfile profile= userProfileService.findById(id);
		logger.info("Profile : {}",profile);
		return profile;
	}
	
}