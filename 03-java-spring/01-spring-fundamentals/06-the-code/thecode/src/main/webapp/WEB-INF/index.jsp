<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div id="redtext">
		 <c:out value="${ tryMessage }"/>
	 </div>
	<p>What is the code?</p>
	<form action="/tryCode" method="POST">
	  <label for="fname">Try Code:</label>
	   <input type="text" name="codesubmit">
	  <button>Try Code</button>
	</form>
	<a href="/">Home Page</a>
	<a href="/code">Code Result</a>
	<p>The code is "pikachu"</p>
</body>
</html>