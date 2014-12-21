<html>
	<head>
		<title >Main Menu</title>
		
		<script type="text/javascript">

			function verify()
			{	
				 
				 window.location.assign("http://localhost:8080/IP/Add%20Student.jsp");
			}
			function verify1()
			{	
				window.location.assign("http://localhost:8080/IP/Calculate%20Fine.jsp");
			}
			function verify2()
			{	
				alert("END");
				window.location.assign("http://localhost:8080/IP/Add%20Teacher.jsp");
			}
			function verify3()
			{	
				alert("END book");
				window.location.assign("http://localhost:8080/IP/Add%20A%20Book.jsp");
			}
			function verify4()
			{	
				alert("END book");
				window.location.assign("http://localhost:8080/IP/Search%20a%20student.jsp");
			}
			function verify5()
			{	
				alert("END book");
				window.location.assign("http://localhost:8080/IP/Search%20a%20teacher.jsp");
			}
			function verify6()
			{	
				window.location.assign("http://localhost:8080/IP/Book%20issued%20by%20a%20particular%20student%28Input%29.jsp");
			}
			function verify7()
			{	
				window.location.assign("http://localhost:8080/IP/Book%20issue.jsp");
			}
			function verify8()
			{	
				window.location.assign("http://localhost:8080/IP/Book%20Return.jsp");
			}
			function verify9()
			{
				window.location.assign("http://localhost:8080/IP/Status.jsp");
			}
			function verify11()
			{	
				window.location.assign("http://localhost:8080/IP/logout");
			}
		</script>
	</head>
	<body background="LMS.jpg">
		
		<% 

		   String a=(String)session.getAttribute("name");
		  
		   if(session.getAttribute("name")==null)
		   {
				response.sendRedirect("Welcome1.html");
		   }
	    	   
		%>
		
		<h2 style="color: black;text-align:center;background-color:#6495ed">Library Managment System</h2>
		</br>
		
		<form name="form8" id="form8" action="logout" method="POST">
		<table align="left">
		   <tr>
			<td colspan=2 align="center">
				<h2>Main Menu</h2>
			</td>
		   </tr>
		   <tr>
			<td align=center>
				<input type=button name="a" value="Add A Student" onClick=verify()>
				</br>
			</td>
		   </tr>
		   <tr>
			<td align="center">
				<input type="button" name="b" value="Add A Teacher" onClick="verify2()">
				</br>
			</td>
		   </tr>
		   <tr>
			<td align="center">
				<input type="button" name="c" value="Add A Book" onClick="verify3()">
				</br>
			</td>
		   </tr>
		   <tr>
			<td align="center">
				<input type="button" name="t" value="Change Status of a Book" onClick="verify9()">
				</br>
			</td>
		   </tr>
		   <tr>
			<td align="center">
				<input type="button" name="d" value="Search A Student" onClick="verify4()">
				</br>
			</td>
		   </tr>
		   <tr>
			<td align="center">
				<input type="button" name="e" value="Calculate fine" onClick="verify1()">
				</br>
			</td>
		   </tr>
		   <tr>
			<td align="center">
				<input type="button" name="f" value="Book Issued by a student" onClick="verify6()">
				</br>
			</td>
		   </tr>
		   <tr>
			<td align="center">
				<input type="button" name="g" value="Search a Teacher" onClick="verify5()">
				</br>
			</td>
		   </tr>
		   
		   <tr>
			<td align="center">
				<input type="button" name="r" value="Issue Book" onClick="verify7()">
				</br>
			</td>
		   </tr>
		   <tr>
			<td align="center">
				<input type="button" name="s" value="Return Book" onClick="verify8()">
				</br>
			</td>
		   </tr>
		   <tr>
			<td align="center">
				<input type="submit" name="z" value="Logout" onClick="verify11()">
				</br>
			</td>
		   </tr>
		  
		</table>
			
		</form>
	</body>
</html>