import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import javax.swing.*;

public class issue extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();

	String id = request.getParameter("book_id");
	


    	out.println("<html>");
    	out.println("<head>");
    	out.println("<title>Student added</title>");
    	out.println("</head>");
    	out.println("<body background=LMS.jpg style=background-color:#6495ed>>");
	try
	{
	Class.forName("com.mysql.jdbc.Driver");

    	String url = "jdbc:mysql://127.0.0.1/ip";
	Connection c=DriverManager.getConnection(url,"root","11111111");
	Statement s=c.createStatement();
	String q ="SELECT bi.book_id,bi.mem_id,bi.date,bi.return_date,bi.issue_date,bi.fine,b.isbn,b.status,i.isbn,i.title,i.shelf,i.author,i.pages,i.price,i.publisher,s.catogary FROM book_issue bi,book b,isbn i,shelf s WHERE mem_id='"+id+"' and bi.book_id=b.book_id and b.isbn=i.isbn and i.shelf=s.shelf";
	ResultSet rs=s.executeQuery(q);


	 out.println("<h2 align=center style=background-color:#6495ed >Library Managment System</h2>");
	out.println("<h2 align=left>Student Record</h2>");
	
	out.println("<form name=form7  >");
	out.println("<table  border=2 align=left>");
	 out.println("<tr>");
	
			out.println("<td>");
				out.println("<h3>Title</h3>");
			out.println("</td> ");
			out.println("<td>");
				out.println("<h3>ISBN</h3>");
			out.println("</td>");
			out.println("<td>");
				out.println("<h3>ShelfNo</h3>");
			out.println("</td> ");
			out.println("<td>");
				out.println("<h3>Author</h3>");
			out.println("</td>");
			out.println("<td>");
				out.println("<h3>Price</h3>");
			out.println("</td> ");
			out.println("<td>");
				out.println("<h3>BookId</h3>");
			out.println("</td>");
			out.println("<td>");
				out.println("<h3>No OF Pages</h3>");
			out.println("</td> ");
			out.println("<td>");
				out.println("<h3>Publisher</h3>");
			out.println("</td>");
			out.println("<td>");
				out.println("<h3>Status</h3>");
			out.println("</td> ");
			out.println("<td>");
				out.println("<h3>Catogary</h3>");
			out.println("</td>");
			out.println("<td>");
				out.println("<h3>Return_Date</h3>");
			out.println("</td>");
			out.println("<td>");
				out.println("<h3>Issue_Date</h3>");
			out.println("</td>");
			out.println("<td>");
				out.println("<h3>Fine</h3>");
			out.println("</td>");

		   out.println("</tr>");

	boolean z=true;
	while(rs.next())
	{
		
		  z=false;
		      out.println("<tr>");
			out.println("<td>");
				out.println("<p>"+rs.getString("title")+"</p>");
			out.println("</td> ");
			out.println("<td>");
				out.println("<p>"+rs.getString("isbn")+"</p>");
			out.println("</td>");
			out.println("<td>");
				out.println("<p>"+rs.getString("shelf")+"</p>");
			out.println("</td>"); 
			out.println("<td>");
				out.println("<p>"+rs.getString("author")+"</p>");
			out.println("</td>");
			out.println("<td>");
				out.println("<p>"+rs.getString("price")+"</p>");
			out.println("</td> ");
			out.println("<td>");
				out.println("<p>"+rs.getString("book_id")+"</p>");
			out.println("</td>");
			out.println("<td>");
				out.println("<p>"+rs.getString("pages")+"</p>");
			out.println("</td> ");
			out.println("<td>");
				out.println("<p>"+rs.getString("publisher")+"</p>");
			out.println("</td>");
			out.println("<td>");
				out.println("<p>"+rs.getString("status")+"</p>");
			out.println("</td> ");
			out.println("<td>");
				out.println("<p>"+rs.getString("catogary")+"</p>");
			out.println("</td>");
			out.println("<td>");
				out.println("<p>"+rs.getString("return_date")+"</p>");
			out.println("</td>");
			out.println("<td>");
				out.println("<p>"+rs.getString("issue_date")+"</p>");
			out.println("</td>");
			out.println("<td>");
				out.println("<p>"+rs.getString("fine")+"</p>");
			out.println("</td>");
		  
		   out.println("</tr>");
			
		



	}

	if(z)
	{
		out.println("<p>Either no student record found or Id of student is not correct</p>");
	}



	
    	out.println("</table>");
	out.println("</form>");
	//out.println("in book issue module");
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