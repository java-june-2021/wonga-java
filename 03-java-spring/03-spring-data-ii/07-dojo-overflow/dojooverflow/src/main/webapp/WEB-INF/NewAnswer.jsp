<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Show Question</title>
</head>
<body>
<h1>Show Question</h1>
<a href="/questions">Go Home</a>
<a href="/questions">Go Home</a>
<a href="/questions/new">New Question</a>
<p>${questions.qText}</p>  
    	<table>
		<tr>
			<th>Answers</th>
			<th>Actions</th>
		</tr>
	<!-- This is a for loop -->
	    <c:forEach items="${answers}" var="a">
		<tr>
	        <td><c:out value="${a.aText}"/></td>
	        <td><a href="/answers/delete/${a.id}">Delete</a></td>
	    </tr>
	    </c:forEach>
	    </table>
		<!-- End the for loop loop -->
		<p>Add your answer</p>
 				    <form:form action="/answers/new" method="post" modelAttribute="answer">
	    <!--This needs to come pre-populated somehow!?-->
	    <p>
		        <form:label path="aText">Answer: </form:label>
		        <form:errors path="aText"/>
		        <form:input path="aText"/>
	    </p>
	    <p>
		        <form:input path="question" value="${questions.id}" type="hidden"/>
	    </p>
	    <input type="submit" value="Answer it!"/>
	    </form:form>
</body>
</html>