<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Human Assignment</title>
<link rel=”stylesheet” href=”/css/style.css”>
</head>
<body>
	<h5><a href="/your_server/"><c:out value="${link}"/></a></h5>
	<h1>Hello <c:out value="${tester}"/></h1>
	<p> Welcome to SpringBoot!</p>
</body>
</html>