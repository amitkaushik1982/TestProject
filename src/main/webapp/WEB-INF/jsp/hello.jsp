<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring4 MVC -HelloWorld</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Employee ID</th>
			<th>Name</th>
			<th>Address</th>
			<th>Designation</th>
		</tr>
		<c:forEach var="employee" items="${empList}" varStatus="empCounter">
			<tr>
				<td>${employee.id }</td>
				<td>${employee.name }</td>
				<td>${employee.address }</td>
				<td>${employee.designation }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>