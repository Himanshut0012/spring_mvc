<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help</title>
</head>
<body>
	<h1>This is help page</h1>
	<%
	/*  String name=(String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("empId");
	LocalDate date=(LocalDate) request.getAttribute("date");
	LocalTime time=(LocalTime) request.getAttribute("time");
	LocalDateTime dateTime = (LocalDateTime) request.getAttribute("dateTime");
	List<Integer> mobile=(List<Integer>) request.getAttribute("mobile"); */
	%>

	<h1>
		My name is Himanshu Tripathi: I have Job and Everything by the grace
		of Lord
		<%-- <%= name %> --%>
		${name}
	</h1>

	<h2>
		And Currently working in JOSH, my employee ID is
		<%--  <%= id %> --%>
		${empId }
	</h2>

	<h2>
		current date is
		<%-- <%= date %> --%>
		${date }
	</h2>

	<h2>
		current time is
		<%--  <%= time %> --%>
		${time }
	</h2>

	<h2>
		current date time
		<%--  <%= dateTime %> --%>
		${dateTime }
	</h2>

	<%-- <% for(int m:mobile){ %>
<h2> mobile : <%=m %></h2>
<%} %>
 --%>
	<h1>this is print bt tostring (in one line) : ${mobile }</h1>
	<hr>
	<h1>
		list of numbers :
		<%-- <%=mobile %> --%>
		<c:forEach var="item" items="${mobile }">
			<%-- <h2>${item }</h2> --%>
			<h2><c:out value="${item }"></c:out></h2>
		</c:forEach>
	</h1>


</body>
</html>