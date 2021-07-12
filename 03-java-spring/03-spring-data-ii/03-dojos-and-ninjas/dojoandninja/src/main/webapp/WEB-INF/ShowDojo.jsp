<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Single dojo page for ${dojo.name}</p>
	<a href="/dojos/new">Add New Dojo</a>
	<a href="/ninjas/new">Add New Ninja</a>
	<a href="/">Show All Dojos</a>
			<table>
		<tr>
			<th>ID</th>
			<th>Full Name</th>
			<th>Age</th>
			<th>Actions</th>
		</tr>
		<c:forEach items="${dojo.ninjas}" var="ninja">
		<tr>
			<td><c:out value="${ninja.id}"/></td>
	        <td><c:out value="${ninja.firstName} "/> <c:out value="${ninja.lastName} "/></td>
	        <td><c:out value="${ninja.age}"/></td>
	        <td><a href="/ninjas/delete/${ninja.id}">Delete</a></td>
	    </tr>
	     </c:forEach>
    	</table>
</body>
</html>