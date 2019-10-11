<%@page import="com.ustglobal.usttyspringmvc.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    List<Employee> employees = (List)request.getAttribute("list");
    Employee emp = (Employee)session.getAttribute("emp");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="right">
<span><a href="./update">Update Profile</a></span>
<span><a href="./delete?id=<%=emp.getId()%>">Delete Profile</a></span>
<span><a href="./logout">Logout Profile</a></span>
</div>
<table>

<div>
<a href= "./home">Home</a>
</div>

<tr>
<th>Id</th>
<th>Name</th>
<th>DOB</th>
<th>Email</th>
</tr>
<tr>
<%
for(Employee employee : employees) {
%>
<td><%=employee.getId()%></td>
<td><%=employee.getName()%></td>
<td><%=employee.getDob()%></td>
<td><%=employee.getEmail()%></td>
</tr>
<tr>
<%
   }
%>
</tr>
</table>
</body>
</html>