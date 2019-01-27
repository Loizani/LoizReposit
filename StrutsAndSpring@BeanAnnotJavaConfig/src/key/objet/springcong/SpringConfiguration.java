package key.objet.springcong ;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import key.objet.service.InterfaceService;
import key.objet.service.ServiceImpl;

@Configuration
@ComponentScan(basePackages = {"key.objet"})
public class SpringConfiguration extends  WebMvcConfigurerAdapter {

	
	
	@Bean()
	public InterfaceService attrService() {
	
	return new ServiceImpl();	
	}
	
	
}