<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/style.css">
<title>Insert title here</title>
</head>
<body>
<p>Hello result page</p>
<p>Your Name: <c:out value="${ name }"/><p>
<p>Location: <c:out value="${ location }"/><p>
<p>Language: <c:out value="${ language }"/><p>
<p>Comment: <c:out value="${ comment }"/><p>
	<a href="/">Home Page</a>
	<a href="/survey">Survey Result</a>
</body>
</html>