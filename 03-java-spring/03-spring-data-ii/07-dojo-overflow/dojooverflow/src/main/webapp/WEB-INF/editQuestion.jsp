<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="/questions">Go Home</a>
<a href="/questions">Go Home</a>
<a href="/questions/new">New Question</a>
<h1>What is your question?</h1>
 		    <form:form action="/questions/edit/${questions.id}" method="post" modelAttribute="question">
	    <!--This needs to come pre-populated somehow!?-->
	    <p>
		        <form:label path="qText">Edit Question: </form:label>
		        <form:errors path="qText"/>
		        <form:input path="qText" placeholder="${questions.qText}"/>
	    </p>
	    <input type="submit" value="Edit Tag"/>
	    </form:form>
<%-- <form:form action="/questions/edit/${questions.id}" method="post" modelAttribute="tag">	    
		<p>
		        <form:label path="subject">Edit Tag: </form:label>
		        <form:errors path="subject"/>
		        <form:input path="subject" placeholder="${tag.subject}"/>
	    </p>
	    <input type="submit" value="Edit Tag"/>
	    </form:form> --%>
</body>
</html>