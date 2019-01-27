package key.objet.springcong;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.DispatcherServlet;

public class SprinAppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext container) throws ServletException {

	      AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext() ; 
	      rootContext.register(SpringConfiguration.class);

		}

}