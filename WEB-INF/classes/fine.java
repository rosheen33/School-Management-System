import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import javax.swing.*;

public class fine extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();

	String name1 = request.getParameter("s_id");
	

    	out.println("<html>");
    	out.println("<head>");
    	out.println("<title>Student added</title>");
    	out.println("</head>");
    	out.println("<body background=LMS.jpg >");
	out.println("</br>");
	out.println("<h2 align=center style=background-color:#6495ed>Library Managment System</h2>");
	try
	{
	Class.forName("com.mysql.jdbc.Driver");

    	String url = "jdbc:mysql://127.0.0.1/ip";
	Connection c=DriverManager.getConnection(url,"root","11111111");
	Statement s=c.createStatement();
	String querey ="Select fine from book_issue WHERE mem_id='"+name1+"'";
    	ResultSet rs=s.executeQuery(querey);
	int fine=0;
	boolean z=true;

	while(rs.next())
	{
		z=false;
		int a=rs.getInt("fine");
		fine=fine+a;
		
	}
	if(z==false)
	{
		out.println("</br>");

		out.println("<form >");
		out.println("<h2 align=center>Fine</h2>");
		out.println("<table align=center>");
		   out.println("<tr>");
			out.println("<td>");
				out.println("Fine:");
			out.println("</td> ");
			out.println("<td>");
				out.println("<input type=text name=fine value="+fine+">");
				out.println("<br/>");
			out.println("</td>");
		   out.println("</tr>");
			
		out.println("</table>");
			
		out.println("</form>");
	}
	
		
	if(z)
	{
		out.println("<p align=center >Either student not exist or student id is incorrect</p>");
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