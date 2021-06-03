<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Trainees Details</h1>

<table border="1">

<tr>
<th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>
<c:forEach items="${trainees }" var="item" >
<tr>
<td>${item.traineeId }</td>
<td>${item.traineeName }</td>
<td>${item.traineeLocation}</td>
<td>${item.traineeDomain}</td>
</tr>
</c:forEach>

</table>
</body>
</html>