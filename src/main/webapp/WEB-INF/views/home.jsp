<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOME PAGE</title>
</head>
<body>
	<h1>This is home page </h1>
	<%
		String name = (String) request.getAttribute("name");
		List<String> friends = (List<String>)request.getAttribute("f");
	%>
	<h1>I am <%=name%> </h1>
	<h1>Showing my friends name below </h1>
	
	<%
		for(String s : friends) {
	%>
	
	<h1><%=s%></h1>
	
	<%
		}
	%>
	<a href="about">Go to about page<br></a>
	<a href="index">Go to Index page</a>
</body>
</html>