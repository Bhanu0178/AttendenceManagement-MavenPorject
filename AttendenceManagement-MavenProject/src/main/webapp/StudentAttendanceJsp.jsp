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
	StudentAttendanceBean sab = (StudentAttendanceBean)session.getAttribute("sab");
	%>
	<strong>**<%=sab.getRollNo()%> Student Attendance Added**</strong><br> 
	<%@include file="AddStudentAttendence.html" %>
</body>
</html>