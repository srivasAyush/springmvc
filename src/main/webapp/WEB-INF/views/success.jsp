<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored= "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
	<h1>Welcome, ${user.name} </h1>
	<h1>Your email address id ${user.email}</h1>
	<h1>Your password is ${user.password} try to secure the password.</h1>
	<h1>${form} Successfully submitted Thank You !!</h1>
</body>
</html>