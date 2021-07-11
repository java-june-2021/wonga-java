<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>new dojo page</p>
	<a href="/dojos/new">Add New Dojo</a>
	<a href="/ninjas/new">Add New Ninja</a>
	<a href="/">Show All Dojos</a>
	<h1>New Dojo</h1>
	    <form:form action="/dojos/new" method="post" modelAttribute="dojo">
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    <input type="submit" value="Create"/>
	    </form:form>
</body>
</html>