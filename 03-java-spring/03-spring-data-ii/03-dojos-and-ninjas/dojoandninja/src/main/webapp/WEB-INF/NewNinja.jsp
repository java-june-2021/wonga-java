<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
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
		    <form:form action="/ninjas/new" method="post" modelAttribute="ninja">
	    <!--This needs to come pre-populated somehow!?-->
	    <p>
		        <form:label path="dojo">Dojo Name</form:label>
		        <form:errors path="dojo"/>
		        <form:select path="dojo">
		        <c:forEach items="${ dojos }" var="doj">
		        	<option value="${ doj.id }">${ doj.name }</option>
		        </c:forEach>
		        </form:select>
	    </p>
	    	    <p>
	        <form:label path="firstName">First name: </form:label>
	        <form:errors path="firstName"/>
	        <form:input path="firstName"/>
	    </p>
	    	    <p>
	        <form:label path="lastName">Last name:</form:label>
	        <form:errors path="lastName"/>
	        <form:input path="lastName"/>
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