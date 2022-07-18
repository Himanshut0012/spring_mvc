<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>about</title>
</head>
<body>
<h1>Learn Spring MVC </h1>
<h3> THIS IS ONLY FOR PRACTICE</h3>
<% String name= (String) request.getAttribute("name");
   Integer ID=(Integer) request.getAttribute("ID");   %>
  <% List<String> skills =(List<String>)request.getAttribute("sp");
   %>
 
 

<h1> Please do work Hard For Learn <%= name %></h1>
<h2>my Employee ID <%= ID %></h2>
<% for(String s: skills)
	{ 
	out.println(s);
	}%>
	
	<h1> another way to print list</h1>
	<% for(String s: skills)
	{ %>
	<h1> list element : <%= s %></h1>
<%	}%> 

</body>
</html>