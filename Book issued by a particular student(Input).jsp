<html>
	<head>
		<title >Form</title>
		<script type="text/javascript">

		function verify()
			{
				var s10=document.form7.s_id.value;
				if(s10=="")
				{
					alert("Please enter college id");
				}
				else if(s10.length<10 || s10.length>10)
				{
					alert("Your college id be should of exactly of 10 characters");
				}
				else if(s10[0]!='B')
				{
					alert("Your college id 1st character should be B");
				}
				else if(!(s10[1]=='C' && s10[2]=='S') && !(s10[1]=='S' && s10[2]=='E' ) && !(s10[1]=='I' && s10[2]=='T'))
				{
					alert("Your college id format is not correct");
				}
				else if(s10[3]!='F')
				{
					alert("Your college id 4th character should be F");
				}
				else if(!(s10[4]>='0' && s10[4]<='9') || !(s10[5]>='0' && s10[5]<='9'))
				{
					alert("Your college id 5th and 6th character should be a number");
				}
				else if(s10[6]!='A' && s10[6]!='M')
				{
					alert("Your college id 7th character should be A or M");
				}
				else if(!(s10[7]>='0' && s10[7]<='9') || !(s10[8]>='0' && s10[8]<='9')  || !(s10[9]>='0' && s10[9]<='9'))
				{
					alert("Your college id 8,9 and 10 charcters are not correct");
				}
				
				
			}
		function check1(val)
		{
			
			if(val=="1")
			{
				window.location.assign("http://localhost:8080/IP/Search%20a%20student.jsp");
			}
			if(val=="2")
			{
				alert("in function ");
				window.location.assign("http://localhost:8080/IP/Search%20a%20teacher.jsp");
			}
			
		}
		function check2(val)
		{
			
			if(val=="a")
			{
				window.location.assign("http://localhost:8080/IP/Add%20Student.jsp");
			}
			if(val=="b")
			{
				alert("in function ");
				window.location.assign("http://localhost:8080/IP/Add%20Teacher.jsp");
			}
			if(val=="c")
			{
				
			}
			if(val=="d")
			{
				window.location.assign("http://localhost:8080/IP/Add%20A%20Book.jsp");
			}
		}
		
		function check7(val)
		{
			
			if(val=="1")
			{
				window.location.assign("http://localhost:8080/IP/Calculate%20Fine.jsp");
			}
		}
		function check6(val)
		{
			if(val=="1")
			{
				window.location.assign("http://localhost:8080/IP/Book%20issue.jsp");
			}
			if(val=="2")
			{
				window.location.assign("http://localhost:8080/IP/Book%20Return.jsp");
			}
			
		}

		</script>
	</head>
	<body align="left" background="LMS.jpg">

	
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
		<select name="menu8" style="background-color: #6495ed;margin:-1px;border: 0px;font-weight: 700 ;font-size: 1.4em">
					<option value="" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp</option>		
					
					
		</select>
		</br>
		</br>
		</br>
		</br>
		
		<h2 color="Blue" align="left">Books issued by a Student</h2>
		<form name="form7" id="form7" method="POST" action="issue">
		
		<table border="0" align="left">
		   <tr >
			<td >
				Enter Id of a Student to Search:
			</td> 
			<td>
				<input type="text" name="book_id" >
				<input type="submit"   value=""  style="height:28px; width:28px;background: url(s.png)">
				<br/>
			</td >
		   </tr>
		   
		</table>
			
		</form>
	</body>
</html>