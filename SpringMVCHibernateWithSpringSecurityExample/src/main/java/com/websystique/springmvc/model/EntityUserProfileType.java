package com.websystique.springmvc.model;

import java.io.Serializable;

public enum EntityUserProfileType implements Serializable{
	USER("USER"), 
	             DBA("DBA"),
	                        ADMIN("ADMIN");
	
	String userProfileType;
	
	private EntityUserProfileType(String userProfileType){
		this.userProfileType = userProfileType;
	}
	
	public String getUserProfileType(){
		return userProfileType;
	}
	
}
