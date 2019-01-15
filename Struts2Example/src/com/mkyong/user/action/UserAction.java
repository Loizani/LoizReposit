package com.mkyong.user.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.mkyong.user.bo.UserBo;
import com.opensymphony.xwork2.ActionSupport;
 
public class UserAction extends ActionSupport{

	//DI via Spring
	UserBo userBo;
	
	public UserBo getUserBo() {
		return userBo;
	}

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
		userBo.printName();
	}

	public String execute() throws Exception {		
		return SUCCESS;		
	}
}