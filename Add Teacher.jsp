<html>
	<head>
		<title >Form</title>
		<script type="text/javascript">

		function verify()
			{
				alert("in function");
				if (!document.form2.gender[0].checked && !document.form2.gender[1].checked)
				{
					alert("Please choose a Gender");
				}
				var s1=document.form2.name1.value;
				if(s1.length>20 || s1=="")
				{
					alert("Name is either empty or have characters greater than 20");
				}
				var s2=document.form2.name2.value;
				if(s2=="" || s2.length>20)
				{
					alert("Last Name is either empty or have characters greater than 20");
				}
				
				var s3=document.form2.address.value;
				for(i=0;i<s3.length;i++)
				{
					if((s3[i]>='a' && s3[i]<='z') || s3[i]=='@' || s3[i]=='%' || s3[i]=='$' || s3[i]=='+' || s3[i]=='-' || s3[i]=='?')
					{
						alert("Address can not include small letters or symbols");
						break;
					}
					
				}
				
				if ( document.form2.country.value == "" )
				{
					
					alert("Please select a country");
				}
				var s8=document.form2.p_no.value;
				var i=0;
				for(i=0;i<s8.length;i++)
				{
					if(!(s8[i]>='0' && s8[i]<='9'))
					{
						alert("Phone number can only contain digits");
						break;
					}
					if(i>10)
					{
						alert("Phone number can only contain 11 digits");
						break;
					}
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
		</br>

		<h2 color="Blue" align="left">Add A Teacher</h2>
		<form name="form2" id="form2" method="POST" action="teacher">
		<table align="left">
		   <tr>
			<td>
				Name:
			</td> 
			<td>
				<input type="text" name="name1" value ="Enter your First Name" >
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				Last Name:
			</td>
			<td>
				 <input type="text" name="name2" value ="Enter your Last Name">
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				Phone no:
			</td>
			<td>
				<input type="text" name="p_no" value ="Enter your Phone No">
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				Address :
			</td>	
			<td>
				<input type="text" name="address" value ="Enter your Address here">
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				City:
			</td>
			<td>
				 <input type="text" name="city" value ="Enter your City here">
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				State:
			</td>
			<td>
			<select name="country">
				<option value=""></option>		
				<option value="Pakistan">Pakistan</option>
				<option value="Other">Other</option>
			</select>
			<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				Teacher ID:
			</td>
			<td>
				<input type="text" name="id" value ="Enter your Teacher_ID">
				<br/>
			</td>
		   </tr>
		   <tr>
			<td>
				Gender: 
			</td>
			<td>
				<input type="radio" name="gender" value="male">Male
				<input type="radio" name="gender" value="female">Female
			
				<br/>
			</td>
		   </tr>
		   <tr align="center">
			<td colspan=2>
				<input type="submit"  value="Submit" onclick="verify()">
			</td>
		   </tr>
		  
		</table>
			
		</form>
	</body>
</html>