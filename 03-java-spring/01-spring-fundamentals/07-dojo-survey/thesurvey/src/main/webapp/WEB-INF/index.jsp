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
	<form action="/trySurvey" method="POST">
	  <label for="name">Your name:</label>
	  <input type="text" id="name" name="name"><br><br>
	  <label for="location">Dojo Location: </label>
	  <select name = "location">
	  	<option value="San Jose">San Jose </option>
	  	<option value="Burbank">Burbank </option>
	  	<option value="Oakland">Oakland </option>
	  </select>
	  <br><br>
	  <label for="language">Favorite Language: </label>
	  <select name = "language">
	  	<option value="Python">Python </option>
	  	<option value="Java">Java </option>
	  	<option value="JavaScript">JavaScript </option>
	  </select>
	  <br><br>
	  <label for="comment">Comment: </label>
	  <input type="text" name="comment"><br><br>
	  <input type="submit" value="button">
	</form>
	<a href="/">Home Page</a>
	<a href="/survey">Survey Result</a>
</body>
</html>