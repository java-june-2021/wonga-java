<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<h5>Name: </h5>
	<c:out value="${language.name}"/>
	<h5>Creator: </h5>
	<c:out value="${language.creator}"/>
	<h5>Version: </h5>
	<c:out value="${language.version}"/>
	<br>
	<a href="/languages">Dashboard</a>
	<a href="/languages/delete/${language.id}">Delete</a>
	<a href="/languages/edit/${language.id}">Edit</a></td>
</body>
</html>

