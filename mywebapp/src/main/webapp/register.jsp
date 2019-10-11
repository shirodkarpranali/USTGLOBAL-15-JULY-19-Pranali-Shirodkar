<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register here</title>
</head>
<body>
<form action="./register" method="post">
		<table>
			<tr>
				<th>Emp Id:</th>
				<td><input type="number" name="id" required></td>
				<th>Emp name:</th>
				<td><input type="text" name="name" required></td>
				<th>Emp age:</th>
				<td><input type="text" name="age" required></td>
				<th>Emp salary:</th>
				<td><input type="number" name="salary" required></td>
				<th>Emp designation:</th>
				<td><input type="text" name="designation" required></td>
				<th>password:</th>
				<td><input type="password" name="password" required></td>
				
			</tr>

			<tr>
				<td >
				<input type="submit" value="Add"></td>
				<td >
				<input type="reset" value="reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>