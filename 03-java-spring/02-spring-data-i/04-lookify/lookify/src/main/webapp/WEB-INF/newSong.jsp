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
	<p>New Song Page</p>
	    <form:form action="/songs/new" method="post" modelAttribute="song">
	    <p>
	        <form:label path="title">Title</form:label>
	        <form:errors path="title"/>
	        <form:input path="title"/>
	    </p>
	    <p>
	        <form:label path="artist">Artist</form:label>
	        <form:errors path="artist"/>
	        <form:textarea path="artist"/>
	    </p>
	    <p>
	        <form:label path="rating">Rating</form:label>
	        <form:errors path="rating"/>
	        <form:input path="rating"/>
	    </p>
	    <input type="submit" value="Add Song"/>
	</form:form>  
</body>
</html>