<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="/dashboard">Dashboard</a>
	<p>Show Song Page</p>
	<h5>Name: </h5>
	<c:out value="${song.name}"/>
	<h5>Artist: </h5>
	<c:out value="${song.artist}"/>
	<h5>Rating: </h5>
	<c:out value="${song.rating}"/>
	<br>
</body>
</html>