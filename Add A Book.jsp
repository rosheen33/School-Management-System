<html>
	<head>
		<title >Form</title>
		<script type="text/javascript">

		function verify()
			{
				
				var s1=document.form3.title.value;
				if(s1.length>20 || s1=="")
				{
					alert("TiTle is either empty or have characters greater than 20");
					
				}
				
			}
		function check1(val)
		{
			
			if(val=="1")
			{
				window.location.assign("http://rosheen33.github.io/School-Management-System/Search%20a%20student.jsp");
			}
			if(val=="2")
			{
				alert("in function ");
				window.location.assign("http://rosheen33.github.io/School-Management-System/Search%20a%20teacher.jsp");
			}
			
		}
		function check2(val)
		{
			
			if(val=="a")
			{
				window.location.assign("http://rosheen33.github.io/School-Management-System/Add%20Student.jsp");
			}
			if(val=="b")
			{
				alert("in function ");
				window.location.assign("http://rosheen33.github.io/School-Management-System/Add%20Teacher.jsp");
			}
			if(val=="c")
			{
				
			}
			if(val=="d")
			{
				window.location.assign("http://rosheen33.github.io/School-Management-System/Add%20A%20Book.jsp");
			}
		}
		
		function check7(val)
		{
			
			if(val=="1")
			{
				window.location.assign("http://rosheen33.github.io/School-Management-System/Calculate%20Fine.jsp");
			}
		}
		function check6(val)
		{
			if(val=="1")
			{
				window.location.assign("http://rosheen33.github.io/School-Management-System/Book%20issue.jsp");
			}
			if(val=="2")
			{
				window.location.assign("http://rosheen33.github.io/School-Management-System/Book%20Return.jsp");
			}
			
		}
		function check8(val)
		{
			if(val=="1")
			{
				window.location.assign("http://rosheen33.github.io/School-Management-System/logout");
			}
			
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
		
		
		<select name="menu1" style="background-color: #6495ed;margin:-5px;border: 0px;font-weight: 700;font-size: 1.4em" onChange="check1(this.value)">
					<option value="Search" >Search</option>		
					<option value="1">Search a Student</option>
					<option value="2">search a Teacher</option>
					
		</select>
		<select name="menu2" style="background-color: #6495ed;margin:-1px;border: 0px;font-weight: 700 ;font-size: 1.4em" onChange="check2(this.value)">
					<option value="" >Add</option>		
					<option value="a">Add a Student</option>
					<option value="b">Add a Teacher</option>
					<option value="d">Add a Book</option>
					
		</select>
		

		<select name="menu6" style="background-color: #6495ed;margin:-3px;border: 0px;font-weight: 700 ;font-size: 1.4em" onChange="check6(this.value)">
					<option value="" >Issue</option>		
					<option value="1">Issue Book</option>
					<option value="1">Return Book</option>
					
					
		</select>
		<select name="menu7" style="background-color: #6495ed;margin:-3px;border: 0px;font-weight: 700 ;font-size: 1.4em" onChange="check7(this.value)">
					<option value="" >Fine</option>		
					<option value="1">Calculate fine</option>
					
					
		</select>
		<select name="menu8" style="background-color: #6495ed;margin:-1px;border: 0px;font-weight: 700 ;font-size: 1.4em" onChange="check8(this.value)">
					<option value="" >Close Account</option>	
					<option value="1" >Logout&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp</option>		
					
					
		</select>
		
		</br>
		</br>
		</br>
		<option value="1">Add a Student</option>

		</br>
		<h2 color="Blue" align="left">Add A Book</h2>
		</br>
		<form name="form3" id="form3" method="POST" action="book">
		
		<table align="left">
		   <tr>
			<td >
				Title:
			</td> 
			<td>
				<input type="text" name="title" >
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				ISBN:
			</td>
			<td>
				 <input type="text" name="isbn">
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				Shelf No:
			</td>
			<td>
				<input type="text" name="s_no">
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				Author :
			</td>	
			<td>
				<input type="text" name="author">
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				Price:
			</td>
			<td>
				 <input type="text" name="price">
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				Book ID:
			</td>
			<td>
				<input type="text" name="b_id">
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				No Of Pages:
			</td>
			<td>
				<input type="text" name="pages">
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				Publisher:
			</td>
			<td>
				<input type="text" name="publisher">
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				Status:
			</td>
			<td>
				<input type="text" name="status">
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				Catogary:
			</td>
			<td>
				<input type="text" name="catogary">
				<br/>
			</td>
		   </tr>
		   <tr align="center">
			<td colspan=2>
				<input type="submit"  value="Add" onclick="verify()">
			</td>
		   </tr>
			
		   
		</table>
			
		</form>
	</body>
</html>