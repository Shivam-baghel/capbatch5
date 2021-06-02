<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action= "getinfo">
<table border="1">
<tr>
<td>Trainee Id</td>
<td><input type="text" name="taineeId"/></td>
<td><input type="submit" value="delete"></td>
</tr>
</table>
</form>

<c:if test="${trainee != null }">
<h1>Trainee Info</h1>

<table border="1">
<tr>
<th>Trainee ID</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>
<tr>
<td>${trainee.traineeId }</td>
<td>${trainee.traineeName}</td>
<td>${trainee.traineeLocation }</td>
<td>${trainee.traineeDomain}</td>
</tr>
</table>

<form action="delete/${trainee.traineeId }">
<input type="submit" value= "delete"/>
</form>

</c:if>


</body>
</html>