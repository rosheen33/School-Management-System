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
	//String l_name = request.getParameter("name2");
	//String p_no = request.getParameter("p_no");
	//String address = request.getParameter("address");
	//String city = request.getParameter("city");
	//String country = request.getParameter("country");
	//String id = request.getParameter("id");
	//String gender = request.getParameter("gender");
	

    	out.println("<html>");
    	out.println("<head>");
    	out.println("<title>Student Record</title>");
    	out.println("</head>");
    	out.println("<body>");
	try
	{
	Class.forName("com.mysql.jdbc.Driver");

    	String url = "jdbc:mysql://127.0.0.1/ip";
	Connection c=DriverManager.getConnection(url,"root","11111111");
	Statement s=c.createStatement();
	String querey ="SELECT * FROM student WHERE s_id=='"+s_id+"'";
    	ResultSet rs=s.executeQuery(querey);
	while(rs.next())
	{
		
		out.println("<p>sucess</p>");
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
			out.println("</td>"):
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
				out.println("Address :"):
			out.println("</td>");	
			out.println("<td>");
				out.println("<input type=text name=address value ="+rs.getString(address)+">");
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
				<input type=text name=con value="+rs.getString("country")+">
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