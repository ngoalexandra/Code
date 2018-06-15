<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>HOME</title>
	
</head>
<body>
	<p> What is the code? </p>
	<form method = "POST" action="/">
	<input type = text name = "code">
	<input type = submit value = "Try Code">
	<p><c:out value="${ error }"></c:out></p>
	</form>
</body>
</html>