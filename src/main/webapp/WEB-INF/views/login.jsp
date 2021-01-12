<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page!!</title>
</head>
<body>
<form action="LoginServlet" method="post">
<p><font color="red">${errormsg }</font></p>
	Enter your name:<input type="text" name="name">
	<input type="password" name="pwd">
	<input type="submit" value="login">
</form>
</body>
</html>