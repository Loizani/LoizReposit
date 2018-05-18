package test.servletpac;
   
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException; 
import java.io.PrintWriter;

//@WebServlet(name="MaServlet")
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       

    public MaServlet() {  
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		response.setCharacterEncoding("UTF-8");
		String sBonjour  = "Bonjour par première servlet" ;
		PrintWriter pw = response.getWriter() ;
		pw.println("<HTML>");
		pw.println("<HEAD><TITLE> Titre </TITLE></HEAD>");
		pw.println("<BODY>");
		pw.println(sBonjour);
		pw.println("</BODY>");
		pw.println("</HTML>");	
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
