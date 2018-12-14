package com.websystique.springmvc.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class extendsAbstractAnnotationConfigDispatcherServletInitializer_AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		//config step 1 : prise en compte de la configuration par classe (AppConfig.class) =>  après //config Secu 1
		return new Class[] { extendsWebMvcConfigurerAdapter_AppConfig.class }; 
	}
 
	@Override
	protected Class<?>[] getServletConfigClasses() {
		//config step 2 : prise en compte de la configuration par servlet (pas dans ce projet)
		return null;							
	}
 
	@Override
	protected String[] getServletMappings() {
		//config step 3 : Servlet Mappings par defaut
		return new String[] { "/" };            
	}

}
