import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import javax.swing.*;

public class book extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();

	String title = request.getParameter("title");
	String isbn = request.getParameter("isbn");
	String s_no1 = request.getParameter("s_no");
	String author = request.getParameter("author");
	String price = request.getParameter("price");
	String bid = request.getParameter("b_id");
	String pages = request.getParameter("pages");
	String publisher = request.getParameter("publisher");
	String status1 = request.getParameter("status");
	String catogary = request.getParameter("catogary");
	int s_no=Integer.parseInt(s_no1);
	int status=Integer.parseInt(status1);


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
	String querey ="INSERT INTO book VALUES('"+ bid +"','"+isbn+"','"+ status +"')";
	String querey1 ="INSERT INTO isbn VALUES('"+ isbn +"','"+title+"','"+ s_no +"')";
	String querey2 ="INSERT INTO shelf VALUES('"+ s_no +"','"+catogary+"')";
	String querey3 ="INSERT INTO title VALUES('"+ title +"','"+author+"','"+ pages +"','"+publisher+"','"+price+"')";
    	int rs=s.executeUpdate(querey);
	int rs1=s.executeUpdate(querey1);
	int rs2=s.executeUpdate(querey2);
	int rs3=s.executeUpdate(querey3);
	if(rs>=1 && rs1>=1 && rs2>=1 && rs3>=1)
	{
		out.println("<p>sucess</p>");
	}
	else
	{
		out.println("<p>failure</p>");
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