<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored= "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<%
		/* String name = (String) request.getAttribute("name"); */
	%>
	<h1>This is Help Page</h1>
	<h1>Hello My name is 
		<%-- <%= name %> --%>
		${name} 
	</h1>
	<hr>
	
	<c:forEach var="item" items="${f}">
		<h1>${item}</h1>
	</c:forEach>
</body>
</html>