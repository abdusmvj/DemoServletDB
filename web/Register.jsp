<%-- 
    Document   : Register
    Created on : 14-Mar-2016, 20:15:22
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            form{
 padding: 5px;
}
.form-element{
	padding: 5px;	
}
.form-element input{
	border-radius: 3px;
	border: 1px solid #ccc;
	padding: 5px;
}
.form-element label{
	display: block;
	padding: 5px;	
}
.form-element input:hover, .form-element input:focus{
	background-color: #F2F2F2;
	border: 1px solid #000;
}
.button{
	margin: 5px;
	padding: 8px;
	color: #000;
	border-radius: 4px;	
	background-color: #fff;
	border: 1px solid #ccc;
}
.button:hover{
	background-color: #ccc;	
	border: #000 solid 1px;
}

.navigation ul{
	list-style-type: none;
}
.navigation ul li{
	border: 1px solid black;
	display: inline-block;
	padding: 10px;
}
.navigation ul li:hover{
	background-color: #ccc;
	color: #fff;
}
        </style>
    </head>
    <body style="background-color: aqua;">

	<div class="navigation">
		<ul>
			<li><a href="home.html">Home</a></li><li>
			<a href="new_entry.html">New Entry</a></li><li>
			<a href="datalists">View Entries</a></li>
		</ul>
	</div>
	<h1>Phonebook Application</h1>
	<div>
	<h3>Create new Entry</h3>
	<form  action="RegisterAction" method="post">
		<div class="form-element">
			<label>Name:</label>
			<input type="text" name="name">
		</div>		
		<div class="form-element">
			<label>Phone no:</label>
			<input type="number" name="phone">
		</div>		
		<div class="form-element">
			<label>Location:</label>
			<input type="text" name="location">
		</div>
		
		<div><input type="submit" value="Submit"></div>
		
	</form>
	</div>
</body>
</html>
