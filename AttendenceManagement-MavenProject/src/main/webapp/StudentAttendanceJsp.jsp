<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.kb.beans.StudentAttendanceBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String sab = (String) request.getParameter("rollno");
	%>
	<strong>**<%=sab%> Student Attendance Added**</strong><br>
	<%@include file="AddStudentAttendence.html" %>
</body>
</html>