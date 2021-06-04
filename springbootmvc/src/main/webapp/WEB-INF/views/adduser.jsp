<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>  
.error{color:red}  
</style> 
</head>
<body>
<form:form method="POST" modelAttribute="user" action="process">
<table>
<tr>
<th><form:label path="username">UserName</form:label></th>
<td><form:input path="username" size="15" maxlength="15" />
<form:errors path="username" cssClass="error" />
</td>
</tr>
<tr>
<th><form:label path="password">Password</form:label></th>
<td><form:password path="password" size="15" maxlength="15" /></td>
</tr>
<tr>
<th><form:label path="email">Email</form:label></th>
<td><form:input path="email" size="15" maxlength="15" /></td>
</tr>
<tr>

<td><input type="submit" value="submit"/></td>
</tr>

</table>
</form:form>

</body>
</html>