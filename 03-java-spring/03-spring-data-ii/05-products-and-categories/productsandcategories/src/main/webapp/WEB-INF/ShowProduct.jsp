<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Show Product</title>
</head>
<body>
<p>Hello World Format New</p>
<a href="/">Go Home</a>
<a href="/products/new">New Product</a>
<a href="/categories/new">New Category</a>     
    	<table>
		<tr>
			<th>Category ID</th>
			<th>Name</th>
		</tr>
	<!-- This is a for loop -->
	    <c:forEach items="${product.categories}" var="c">
		<tr>
	        <td><a href="/categories/${c.id}"><c:out value="${c.id}"/></a></td>
	        <td><c:out value="${c.name}"/></td>
	        <td><a href="/categories/delete/${c.id}">Delete</a></td>
	    </tr>
	    </c:forEach>
		<!-- End the for loop loop -->
    </table>
		    <form action="/category/update/${product.id}" method="post">
		        <label>Add Product</label>
		        <select name="categoryName">
		        <c:forEach items="${ categories }" var="p">
		        	<option value="${ p.id }">${p.name}</option>
		        </c:forEach>
		        </select>
		        	<input type="submit" value="Add"/>
		        </form>
</body>
</html>