package com.mkyong.user.bo.impl;

import com.mkyong.user.bo.UserBo;

public class UserBoImpl implements UserBo{

	
	private String NomUser ;
	
	
	public String getNomUser() {
		return NomUser;
	}


	public void setNomUser(String nomUser) {
		NomUser = nomUser;
	}

	@Override
	public void printName() {
		System.out.println(getNomUser());		
	}
	
}