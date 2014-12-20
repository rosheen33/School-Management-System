import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import javax.swing.*;

public class teacher extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();

	String name1 = request.getParameter("name1");
	String l_name = request.getParameter("name2");
	String p_no = request.getParameter("p_no");
	String address = request.getParameter("address");
	String city = request.getParameter("city");
	String country = request.getParameter("country");
	String id = request.getParameter("id");
	String gender = request.getParameter("gender");
	

    	out.println("<html>");
    	out.println("<head>");
    	out.println("<title>Student added</title>");
    	out.println("</head>");
    	out.println("<body background=LMS.jpg>");
	out.println("<h2 align=center style=background-color:#6495ed>Library Managment System</h2>");
	try
	{
	Class.forName("com.mysql.jdbc.Driver");

    	String url = "jdbc:mysql://127.0.0.1/ip";
	Connection c=DriverManager.getConnection(url,"root","11111111");
	Statement s=c.createStatement();
	String querey ="INSERT INTO teacher(name,l_name,p_no,address,city,country,gender,id)VALUES('"+ name1 +"','"+l_name+"','"+ p_no +"','"+ address +"','"+ city +"','"+ country +"','" + gender +"','"+ id +"')";
    	int rs=s.executeUpdate(querey);
	if(rs>=1)
	{
		out.println("<p>sucess in Adding </p>");
	}
	else
	{
		out.println("<p>failure in adding</p>");
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