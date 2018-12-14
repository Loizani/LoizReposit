package com.websystique.springmvc.security;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.model.EntityUser;
import com.websystique.springmvc.model.EntityUserProfile;
import com.websystique.springmvc.service.InterfaceUserService;


@Service("customUserDetailsService")
public class ImplementedSecurity_UserDetailsService implements UserDetailsService{
	
	//config Secu 3 : logger de class CustomUserDetailsService
	static final Logger logger = LoggerFactory.getLogger(ImplementedSecurity_UserDetailsService.class);    
	
	@Autowired
	private InterfaceUserService userService;
	
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String ssoId)
			throws UsernameNotFoundException {
		EntityUser user = userService.findBySSO(ssoId);
		logger.info("User : {}", user);
		if(user==null){
			logger.info("User not found");
			throw new UsernameNotFoundException("Username not found");
		}
			return new org.springframework.security.core.userdetails.User(user.getSsoId(), user.getPassword(), 
				 true, true, true, true, getGrantedAuthorities(user));
	}

	
	private List<GrantedAuthority> getGrantedAuthorities(EntityUser user){		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(); 		
		for(EntityUserProfile userProfile : user.getUserProfiles()){
			logger.info("UserProfile : {}", userProfile);
			authorities.add(new SimpleGrantedAuthority("ROLE_"+userProfile.getType()));
		}
		logger.info("authorities : {}", authorities);
		return authorities;
	}
	
}
