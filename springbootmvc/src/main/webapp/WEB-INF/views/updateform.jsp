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
	<h2>Modify Operation</h2>
	<form action="gettrainee">
		<table border="1">
			<tr>
				<td>Trainee Id</td>
				<td><input type="text" name="taineeId" /></td>
				<td><input type="submit" value="delete"></td>
			</tr>
		</table>
	</form>

	<c:if test="${trainee != null }">
		<h1>Trainee Info</h1>

		<form action="update" method="post">
			<table>
				<tr>
					<td>Trainee Id</td>
					<td><input type="text" name="traineeId" value="${trainee.traineeId }" readonly="readonly"></td>
				</tr>

				<tr>
					<td>Trainee Name</td>
					<td><input type="text" name="traineeName" value="${trainee.traineeName }"></td>
				</tr>

				<tr>
					<td>Trainee Location</td>
					<td><input type="text" name="traineeLocation" value="${trainee.traineeLocation}"></td>
				</tr>

				<tr>
					<td>Trainee Domain</td>
					<td><input type="text" name="traineeDomain" value="${trainee.traineeDomain }"></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="update"></td>
				</tr>

			</table>

		</form>

	</c:if>


</body>
</html>