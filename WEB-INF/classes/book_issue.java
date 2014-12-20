import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import javax.swing.*;

public class book_issue extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();

	String id = request.getParameter("id");
	String book_id = request.getParameter("book_id");


    	out.println("<html>");
    	out.println("<head>");
    	out.println("<title>Book Issue</title>");
    	out.println("</head>");
    	out.println("<body background=LMS.jpg style=background-color:#6495ed>");
	out.println("<h2 align=center style=background-color:#6495ed >Library Managment System</h2>");
	out.println("<h2 align=left>Book Issue</h2>");


	try
	{
	Class.forName("com.mysql.jdbc.Driver");

    	String url = "jdbc:mysql://127.0.0.1/ip";
	Connection c=DriverManager.getConnection(url,"root","11111111");
	Statement s=c.createStatement();
	String s1="Not Available";
	

	int z=0;
	String query2 ="SELECT * from student WHERE id='"+ id +"'";
	String query3 ="SELECT * from teacher WHERE id='"+ id +"'";
	ResultSet rs2=s.executeQuery(query2);
	if(rs2.next())
	{
		z=1;
	}
	rs2=s.executeQuery(query3);
    	
	if(rs2.next())
	{
		z=1;
	}
	
	//if id is correct
	if(z==1)
	{
		
		String querey ="UPDATE book SET status= '"+s1+"'  WHERE book_id= '"+book_id+"' ";
		int rs=s.executeUpdate(querey);
		if(rs>=1 )
		{
			String querey1 ="INSERT INTO book_issue VALUES('"+ book_id +"','"+ id +"',date_add(CURDATE(), INTERVAL 7 DAY),0,CURDATE(),0)";
			int rs1=s.executeUpdate(querey1);
			if(rs1>=1)
			{
				out.println("<p>Book Issued</p>");
		
			}
			else
			{
				out.println("<p>Failure in Book Issue</p>");
			}
		}
		else
		{
			out.println("<p>Book not found</p>");
		}
	}
	else
	{
		out.println("<p>Member not found</p>");
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