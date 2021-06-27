<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel=”stylesheet” href=”/css/style.css”>
<title>Counter home page</title>
</head>
<body>
	<p> Counter home page </p>
	<h4>Visited the page count: <c:out value="${count}"/></h4>
	<a href="/">Home Page</a>
	<a href="/counter">Counter</a>
	<a href="/counter2">Counter2</a>
	<a href="/reset">Reset Counter</a>

</body>
</html>