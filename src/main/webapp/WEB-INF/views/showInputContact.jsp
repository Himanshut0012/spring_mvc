<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input data</title>
</head>
<body>
	<div style="text-align: center;">
		<h1 class="text-center">${hdr }</h1>
		<p>${desc }</p>
		<h1>
			Input data's ID is<span style="color: green;"> ${msg }</span>
		</h1>
		<hr>
		<h1>
			Welcome <span style="color: red;">${user.userName }</span>
		</h1>
		<hr>
		<h1>
			Your email is <span style="color: blue;">${user.email }</span>
		</h1>
		<hr>
		<h1>
			And your password is <span style="color: orange;">${user.password }</span>
		</h1>
	</div>
</body>
</html>