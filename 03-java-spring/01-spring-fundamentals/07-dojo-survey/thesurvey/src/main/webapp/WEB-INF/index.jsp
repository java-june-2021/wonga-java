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
<p>Hello survey home page</p>
	<form action="/result" method="post">
	  <label for="fname">Your name:</label>
	  <input type="text" id="yname" name="yname"><br><br>
	  <label for="location">Dojo Location: </label>
	  <input type="text" id="location" name="location"><br><br>
	  <label for="language">Favorite Language: </label>
	  <input type="text" id="language" name="language"><br><br>
	  <label for="comment">Comment: </label>
	  <input type="text" id="comment" name="comment"><br><br>
	  <input type="submit" value="button">
	</form>
	<a href="/">Home Page</a>
	<a href="/survey">Survey Result</a>
</body>
</html>