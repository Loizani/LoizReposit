package test.servletpac;
    
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException; 
 
//@WebServlet(name = "SecondeServlet", urlPatterns = {"/SecondeServlet.do"})
public class SecondeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       

    public SecondeServlet() {  
        super();     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
	 
		try 
		{	String strPetitMsg = "Juste un coucou dans une variable string" ;
			request.setAttribute("varCoucou", strPetitMsg);
			ServletContext sc = this.getServletContext() ;
			RequestDispatcher rd = sc.getRequestDispatcher("/SecondeServlet.jsp") ;
			rd.forward(request, response);	
			//this.getServletContext().getRequestDispatcher("/SecondeServlet.jsp").forward(request, response);
		} 

		catch(ServletException ex) 
		{
		    System.out.println("Servlet <SecondeServlet> Erreur \"ServletException\" suivante : " + ex.getMessage());		    
		}
		catch(IOException ioex) 
		{
		    System.out.println("Servlet <SecondeServlet> Erreur \"IOException\" suivante : " + ioex.getMessage());
		}
		
					
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
