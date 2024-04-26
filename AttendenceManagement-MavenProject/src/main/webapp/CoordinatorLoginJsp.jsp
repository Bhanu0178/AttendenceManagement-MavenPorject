<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.kb.beans.CoordinatorLoginBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		CoordinatorLoginBean clb = (CoordinatorLoginBean)session.getAttribute("clb");
	%>
	<p>RollNo:&nbsp;<strong><%=clb.getRollno()%></strong><br>
	<p>Name:&nbsp;<strong><%=clb.getName() %></strong></p>
	<a href="AddStudentAttendence.html">AddStudentAttendence</a>
</body>
</html>