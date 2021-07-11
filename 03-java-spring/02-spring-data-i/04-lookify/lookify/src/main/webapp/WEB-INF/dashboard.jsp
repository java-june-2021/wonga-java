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
<a href="/songs/new">Add New</a>
<a href="/search/topten">Top Songs</a>
<p> Search bar</p>
    <form:form action="/search/[{search}" method="post" modelAttribute="song">
	    <p>
	        <form:label path="search">Name</form:label>
	        <form:errors path="search"/>
	        <form:input path="search"/>
	    </p>
	    <input type="submit" value="Search Artists"/>
	</form:form>  

<p>A big table</p>
	<table>
		<tr>
			<th>ID</th>
			<th>Song Name</th>
			<th>Artist</th>
			<th>Rating</th>
			<th>Action</th>
		</tr>
	<!-- This is a for loop -->
	    <c:forEach items="${all_songs}" var="song">
		<tr>
			<td><a href="/songs/${song.id}"><c:out value="${song.id}"/></a></td>
	        <td><a href="/songs/${song.id}"><c:out value="${song.name}"/></a></td>
	        <td><c:out value="${song.artist}"/></td>
	        <td><c:out value="${song.rating}"/></td>
	        <td><a href="/lookify/delete/${song.id}">Delete</a></td>
	    </tr>
	    </c:forEach>
		<!-- End the for loop loop -->
    </table>
</body>
</html>