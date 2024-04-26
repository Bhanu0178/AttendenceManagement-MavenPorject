<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.kb.beans.StudentLoginAttendanceBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	StudentLoginAttendanceBean slab = (StudentLoginAttendanceBean)session.getAttribute("slab");
	session.invalidate();
	%>
	<%@include file="AddStudentAttendence.html" %>
</body>
</html>