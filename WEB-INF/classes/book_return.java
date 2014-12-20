import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import javax.swing.*;
import java.util.Calendar;
import java.util.Date;

public class book_return extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	long diffInDays=0;
	long diffInMillisec=0;
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();

	String id = request.getParameter("id");
	String book_id1 = request.getParameter("book_id");


    	out.println("<html>");
    	out.println("<head>");
    	out.println("<title>Book Return</title>");
    	out.println("</head>");
    	out.println("<body background=LMS.jpg style=background-color:#6495ed>");
	out.println("<h2 align=center style=background-color:#6495ed >Library Managment System</h2>");
	out.println("<h2 align=left>Book Return</h2>");


	try
	{
	
	Class.forName("com.mysql.jdbc.Driver");

    	String url = "jdbc:mysql://127.0.0.1/ip";
	Connection c=DriverManager.getConnection(url,"root","11111111");
	Statement s=c.createStatement();
	String s1="Available";
	
	




	String querey ="UPDATE book SET status= '"+s1+"'  WHERE book_id= '"+book_id1+"' ";
	
	String querey1 ="SELECT * FROM book_issue WHERE mem_id='"+ id +"' and book_id= '"+ book_id1 +"'";
	
	
	//int rs=s.executeUpdate(querey);
	ResultSet rs1 =s.executeQuery(querey1);


	
	if(rs1.next())
	{
		int rs=s.executeUpdate(querey);
		//set return date
		
		String querey3 ="UPDATE book_issue SET return_date=CURDATE()  WHERE book_id= '"+book_id1+"' and mem_id='"+ id +"' ";
		rs=s.executeUpdate(querey3);		
		rs1 =s.executeQuery(querey1);
		rs1.next();
		//calculate fine
	
		Calendar cal=Calendar.getInstance();
		Date rd=rs1.getDate("date");
		cal.setTime(rd);
		
		
		Calendar cal1=Calendar.getInstance();
		Date r=new Date();
		cal1.setTime(r);

		//cal1==current system date
		//cal ==return date
	

		diffInMillisec = cal1.getTimeInMillis() - cal.getTimeInMillis();
		diffInDays = diffInMillisec / (24 * 60 * 60 * 1000);       

		long fine=10;
		if(diffInDays>0)
		{
		out.println("<p>Fine should be assigned to the student</p>");
		fine=fine*diffInDays;
		out.println("<h3 align=left>Fine</h3>");
		out.println("<input type=text name=a value="+fine+" align=left>");
		}
		out.println("<p>Record Updated</p>");
	}
	else
	{
		out.println("<p>Either member doed not exist or member id is incorrect or book id is incorrect</p>");
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