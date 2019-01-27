package key.objet.springcong;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SprinAppInitializer implements WebApplicationInitializer {
	
	
    @Override
    public void onStartup(ServletContext ArgServletContext) throws ServletException {
    	
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        /* la ligne suivante est equivalente à : 
          <listener>
			<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
		  </listener>
		*/
        ArgServletContext.addListener(new ContextLoaderListener(rootContext));                       
        rootContext.register(SpringConfiguration.class);
        
       
    }
	

/*	public void onStartup(ServletContext argContainer) throws ServletException {

	      AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext() ;
	     argContainer.addListener(new ContextLoaderListener(context));
	      context.register(SpringConfiguration.class);
	      

		}*/

}