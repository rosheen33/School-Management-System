import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import javax.swing.*;

public class status extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();

	String id = request.getParameter("isbn");
	String status = request.getParameter("id");
	

    	out.println("<html>");
    	out.println("<head>");
    	out.println("<title>Student added</title>");
    	out.println("</head>");
    	out.println("<body background=LMS.jpg >");
	out.println("</br>");
	out.println("<h2 align=center style=background-color:#6495ed>Library Managment System</h2>");
	out.println("</br>");

	try
	{
	Class.forName("com.mysql.jdbc.Driver");

    	String url = "jdbc:mysql://127.0.0.1/ip";
	Connection c=DriverManager.getConnection(url,"root","11111111");
	Statement s=c.createStatement();

	String querey ="Select * from book WHERE book_id='"+id+"'";
	String querey1 ="UPDATE  book SET status='"+ status +"' WHERE book_id='"+id+"'";
	ResultSet rs=s.executeQuery(querey);
	boolean z=true;

	
	if(rs.next())
	{
		int rs1=s.executeUpdate(querey1);
		z=false;
		out.println("<p align=center>Status sucessfully Updated</p>");
	}
	if(z)
	{
		out.println("<p align=center>Book not Found</p>");
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