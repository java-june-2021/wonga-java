<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Show Everything</title>
</head>
<body>
<p>Hello World Format New</p>
<a href="/">Go Home</a>
<a href="/products/new">New Product</a>
<a href="/categories/new">New Category</a>

	<table>
		<tr>
			<th>Product ID</th>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Action</th>
		</tr>
	<!-- This is a for loop -->
	    <c:forEach items="${products}" var="p">
		<tr>
	        <td><a href="/products/${p.id}"><c:out value="${p.id}"/></a></td>
	        <td><c:out value="${p.name}"/></td>
	        <td><c:out value="${p.description}"/></td>
	        <td><a href="/products/delete/${p.id}">Delete</a></td>
	    </tr>
	    </c:forEach>
		<!-- End the for loop loop -->
    </table>
    
    	<table>
		<tr>
			<th>Category ID</th>
			<th>Name</th>
		</tr>
	<!-- This is a for loop -->
	    <c:forEach items="${categories}" var="c">
		<tr>
	        <td><a href="/categories/${c.id}"><c:out value="${c.id}"/></a></td>
	        <td><c:out value="${c.name}"/></td>
	        <td><a href="/categories/delete/${c.id}">Delete</a></td>
	    </tr>
	    </c:forEach>
		<!-- End the for loop loop -->
    </table>
   
</body>
</html>