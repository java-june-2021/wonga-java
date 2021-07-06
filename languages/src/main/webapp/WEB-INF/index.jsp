<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<p> Big table up top</p>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>
		</tr>
	<!-- This is a for loop -->
	    <c:forEach items="${all_languages}" var="language">
		<tr>
			<td><c:out value="${language.id}"/></td>
	        <td><a href="/languages/${language.id}"><c:out value="${language.name}"/></a></td>
	        <td><c:out value="${language.creator}"/></td>
	        <td><c:out value="${language.version}"/></td>
	        <td><a href="/languages/delete/${language.id}">Delete</a> | <a href="/languages/edit/${language.id}">Edit</a></td>
	    </tr>
	    </c:forEach>
		<!-- End the for loop loop -->
    </table>
    <form:form action="/languages" method="post" modelAttribute="Language">
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    <p>
	        <form:label path="creator">Creator</form:label>
	        <form:errors path="creator"/>
	        <form:textarea path="creator"/>
	    </p>
	    <p>
	        <form:label path="version">Version</form:label>
	        <form:errors path="version"/>
	        <form:input path="version"/>
	    </p>
	    <input type="submit" value="Submit"/>
	</form:form>    
<a href="/languages">Dashboard</a>
</body>
</html>