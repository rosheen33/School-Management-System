import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import javax.swing.*;

public class redirect extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();

	String name1 = request.getParameter("menu");
	
    	out.println("<html>");
    	out.println("<head>");
    	out.println("<title>Servlet sign up Servlet</title>");
    	out.println("</head>");
    	out.println("<body>");
	out.println("Servlet sign up Servlet");
    	out.println("</body>");
    	out.println("</html>");
    	out.close(); 
	}


}