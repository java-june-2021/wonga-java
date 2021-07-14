<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="UTF-8">
<title>New Product</title>
</head>
<body>
<p>Hello World Format New</p>
<a href="/">Go Home</a>
<a href="/products/new">New Product</a>
<a href="/categories/new">New Category</a>
		    <form:form action="/products/new" method="post" modelAttribute="product">
	    <!--This needs to come pre-populated somehow!?-->
	    <p>
		        <form:label path="name">Dojo Name</form:label>
		        <form:errors path="name"/>
		        <form:select path="name">
		        </form:select>
	    </p>
	    	    <p>
	        <form:label path="description">First name: </form:label>
	        <form:errors path="description"/>
	        <form:input path="description"/>
	    </p>
	    	    <p>
	        <form:label path="price">Last name:</form:label>
	        <form:errors path="price"/>
	        <form:input path="price"/>
	    </p>
	    <input type="submit" value="Create"/>
	    </form:form>
</body>
</html>