<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="save" method="post">

		<table>
			<tr>
				<td>Product Id</td>
				<td><input type="text" name="productId" />
			</tr>

			<tr>
				<td>Product Name</td>
				<td><input type="text" name="productName" />
			</tr>

			<tr>
				<td>Price</td>
				<td><input type="text" name="productPrice" />
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="save" />
			</tr>

		</table>

	</form>
</body>
</html>