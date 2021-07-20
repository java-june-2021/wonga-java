<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Question Dashboard</title>
</head>
<body>
<p>Question Dashboard</p>
<a href="/questions">Go Home</a>
<a href="/questions/new">New Question</a>
<a href="/logout">Logout</a>

	<table>
		<tr>
			<th>Question ID</th>
			<th>Actual Question: </th>
			<th>Tags</th>
			<th>Action</th>
		</tr>
	    <c:forEach items="${questions}" var="q">
		<tr>
	        <td><a href="/questions/${q.id}"><c:out value="${q.id}"/></a></td>
	        <td><c:out value="${q.qText}"/></td>
	        <td><c:out value="${q.tags}"/></td>
	        <td>
	        	<a href="/questions/delete/${q.id}">Delete</a> | 
	        	<a href="/questions/edit/${q.id}">Edit</a>
	        </td>
	    </tr>
	    </c:forEach>
</table>
<br>
    		    <form:form action="/questions/new" method="post" modelAttribute="question">
	    <!--This needs to come pre-populated somehow!?-->
	    <p>
		        <form:label path="qText">New Question: </form:label>
		        <form:errors path="qText"/>
		        <form:input path="qText"/>
	    </p>
	    <input type="submit" value="Submit"/>
	    </form:form>
</body>
</html>