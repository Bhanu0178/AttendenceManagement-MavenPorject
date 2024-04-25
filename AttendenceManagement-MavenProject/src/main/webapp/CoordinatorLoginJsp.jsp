<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.nt.beans.CoordinatorLoginBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		CoordinatorLoginBean clb = (CoordinatorLoginBean)session.getAttribute("coordinatorloginbean");
	%>
	<strong>RollNo:<%=clb.getRollno()%></strong>
	<strong>Name:<%=clb.getName() %></strong>
	<a href="AddStudentAttendence.html">Add Student Attendence</a>
</body>
</html>