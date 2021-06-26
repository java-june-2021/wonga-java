<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel=”stylesheet” href=”/css/style.css”>
<title>Counter homepage</title>
<link rel=”stylesheet” href=”/css/style.css”>
</head>
<body>
	<p> Counter home page </p>
	<h4>Visited the page count: <c:out value="${count}"/></h4>
<a href="/counter">Counter1</a>
<a href="/counter2">Counter2</a>
</body>
</html>