<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel=”stylesheet” href=”/css/style.css”>
<title>Insert title here</title>
</head>
<body>
	<p> Counter page X2 </p>
		<h4>Visited the page count: <c:out value="${count*2}"/></h4>
	<a href="/">Home Page</a>
	<a href="/counter">Counter</a>
	<a href="/counter2">Counter2</a>
	<a href="/reset">Reset Counter</a>

</body>
</html>