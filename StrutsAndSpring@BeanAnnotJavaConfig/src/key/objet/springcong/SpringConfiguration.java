package key.objet.springcong ;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import key.objet.service.InterfaceService;
import key.objet.service.ServiceImpl;

//@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "key.objet")
public class SpringConfiguration   { 	
	
	@Bean()
	public InterfaceService attrService() {
	
	return new ServiceImpl();	
	}
	
	
}