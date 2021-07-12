<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Dojos</title>
</head>
<body>
<p>Show dojo page</p>
	<a href="/dojos/new">Add New Dojo</a>
	<a href="/ninjas/new">Add New Ninja</a>
	<a href="/">Show All Dojos</a>
		<table>
		<tr>
			<th>ID</th>
			<th>Dojo Name</th>
			<th>Action</th>
		</tr>
			    <c:forEach items="${dojos}" var="dojo">
		<tr>
			<td><a href="/dojos/${dojo.id}"><c:out value="${dojo.id}"/></a></td>
	        <td><a href="/dojos/${dojo.id}"><c:out value="${dojo.name}"/></a></td>
	        <td><a href="/dojos/delete/${dojo.id}">Delete</a></td>
	    </tr>
	        	    </c:forEach>
    	</table>
</body>
</html>