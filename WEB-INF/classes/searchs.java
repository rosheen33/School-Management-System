import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import javax.swing.*;

public class searchs extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();

	String s_id = request.getParameter("s_id");
	

    	out.println("<html>");
    	out.println("<head>");
    	out.println("<title>Student Record</title>");
    	out.println("</head>");
    	out.println("<body background=LMS.jpg style=background-color:#6495ed>");
	out.println("<h2 align=center style=background-color:#6495ed >Library Managment System</h2>");
		out.println("<h2 align=left>Student Record</h2>");
	try
	{
	Class.forName("com.mysql.jdbc.Driver");

    	String url = "jdbc:mysql://127.0.0.1/ip";
	Connection c=DriverManager.getConnection(url,"root","11111111");
	Statement s=c.createStatement();
	String querey ="SELECT * FROM student WHERE id='"+s_id+"' ";
    	ResultSet rs=s.executeQuery(querey);
	 
	boolean z=true;
	
	while(rs.next())
	{
		z=false;
		
		out.println("<table align=left>");
		   out.println("<tr>");
			out.println("<td>");
				out.println("Name:");
			out.println("</td>"); 
			out.println("<td>");
				out.println("<input type=text name=name1 value ="+rs.getString("name")+" >");
				out.println("<br/>");
			out.println("</td>");
		   out.println("</tr>");
		   out.println("<tr>");
			out.println("<td>");
				out.println("Last Name:");
			out.println("</td>");
			out.println("<td>");
				 out.println("<input type=text name=name2 value ="+rs.getString("l_name")+">");
				out.println("<br/>");
			out.println("</td>");
		   out.println("</tr>");
		   out.println("<tr>");
			out.println("<td>");
				out.println("Phone no:");
			out.println("</td>");
			out.println("<td>");
				out.println("<input type=text name=p_no value ="+rs.getString("p_no")+">");
				out.println("<br/>");
			out.println("</td>");
		   out.println("</tr>");
		   out.println("<tr>");
			out.println("<td>");
				out.println("Address :");
			out.println("</td>");	
			out.println("<td>");
				out.println("<input type=text name=address value ="+rs.getString("address")+">");
				out.println("<br/>");
			out.println("</td>");
		   out.println("</tr>");
		   out.println("<tr>");
			out.println("<td>");
				out.println("City:");
			out.println("</td>");
			out.println("<td>");
				 out.println("<input type=text name=city value ="+rs.getString("city")+">");
				out.println("<br/>");
			out.println("</td>");
		   out.println("</tr>");
		   out.println("<tr>");
			out.println("<td>");
				out.println("State:");
			out.println("</td>");
			out.println("<td>");
				out.println("<input type=text name=con value="+rs.getString("country")+">");
			out.println("<br/>");
			out.println("</td>");
		   out.println("</tr>");
		   out.println("<tr>");
			out.println("<td>");
				out.println("Student ID:");
			out.println("</td>");
			out.println("<td>");
				out.println("<input type=text name=id value ="+rs.getString("id")+">");
				out.println("<br/>");
			out.println("</td>");
		   out.println("</tr>");
		   out.println("<tr>");
			out.println("<td>");
				out.println("Gender: ");
			out.println("</td>");
			out.println("<td>");
				out.println("<input type=text name=gender value="+rs.getString("gender")+">");
			
				out.println("<br/>");
			out.println("</td>");
		   out.println("</tr>");
			
		out.println("</table>");



	}
	if(z)
	{
		out.println("<p align=center>No student exist with this ID</p>");
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