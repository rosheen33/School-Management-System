import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import javax.swing.*;

public class login extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	
	
	//HttpSession hs = request.getSession(true); 
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();

	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	//hs.setAttribute(id,pass);

    	out.println("<html>");
    	out.println("<head>");
    	out.println("<title>Login</title>");
    	out.println("</head>");
    	out.println("<body >");
	out.println("<p>i am in servlet</p>");
	try
	{
	Class.forName("com.mysql.jdbc.Driver");

    	String url = "jdbc:mysql://127.0.0.1/ip";
	Connection c=DriverManager.getConnection(url,"root","11111111");
	Statement s=c.createStatement();
	String querey ="SELECT * FROM administrator";
    	ResultSet rs=s.executeQuery(querey);
	
	while(rs.next())
	{

		if(rs.getString("adm_id").equals(id) && rs.getString("password").equals(pass))
		{
			
			out.println("<p>sucess</p>");
			response.sendRedirect("http://localhost:8080/project/Main%20Menu1.html");
		}
		else
		{
			out.println("<p>failure</p>");
			response.sendRedirect("http://localhost:8080/project/Welcome.html?id=&pass=");
		}
	}
    	out.println("</body>");
    	out.println("</html>");
    	out.close(); 
	}
	catch(Exception e)
	{
		out.println(e);
	}

	
	}


}