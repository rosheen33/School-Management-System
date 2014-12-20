import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import javax.swing.*;

public class fine1 extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	
	response.setContentType("text/html");
	
	
	String f=(String)request.getAttribute("fine");
	request.getParameterValues("fine");
    	
	} 


}