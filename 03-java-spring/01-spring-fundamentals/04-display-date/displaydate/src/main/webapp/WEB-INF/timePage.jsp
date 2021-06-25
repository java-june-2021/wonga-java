<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Time Page</title>
<link rel=”stylesheet” href=”css/style.css”>
</head>
<body>
	<script>
		alert("This is the time template");
	</script>
	<h4><c:out value="${date}"/></h4>
	<h3><c:out value="${date}"/></h3>
</body>
</html>