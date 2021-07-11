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
<p>new ninja page</p>
	<a href="/dojos/new">Add New Dojo</a>
	<a href="/ninjas/new">Add New Ninja</a>
	<a href="/">Show All Dojos</a>
		    <form:form action="/ninjas/new" method="post" modelAttribute="dojo">
	    <!--This needs to come pre-populated somehow!?-->
	    <p>
	        <form:label path="dojo">Name</form:label>
	        <form:errors path="dojo"/>
	        <form:input path="dojo"/>
	    </p>
	    	    <p>
	        <form:label path="fname">First name: </form:label>
	        <form:errors path="fname"/>
	        <form:input path="fname"/>
	    </p>
	    	    <p>
	        <form:label path="lname">Last name:</form:label>
	        <form:errors path="lname"/>
	        <form:input path="lname"/>
	    </p>
	    	    <p>
	        <form:label path="age">Age</form:label>
	        <form:errors path="age"/>
	        <form:input path="age"/>
	    </p>
	    <input type="submit" value="Create"/>
	    </form:form>
</body>
</html>