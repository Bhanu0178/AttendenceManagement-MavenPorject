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
	StudentAttendanceBean sab = (StudentAttendanceBean) session.getAttribute("studentattendancebean");
	%>
	<table cellspacing="0" border="1">
		<tr>
			<th>RollNo</th>
			<th>Name</th>
			<th>Sub1</th>
			<th>Sub2</th>
			<th>Sub3</th>
			<th>Sub4</th>
			<th>Sub5</th>
			<th>Sub6</th>
			<th>AttDate</th>
		</tr>
		<tr>
			<td><%=sab.getRollNo()%></td>
			<td><%=sab.getName() %></td>
			<td><%=sab.getSub1() %></td>
			<td><%=sab.getSub2() %></td>
			<td><%=sab.getSub3() %></td>
			<td><%=sab.getSub4() %></td>
			<td><%= sab.getSub5()%></td>
			<td><%= sab.getSub5()%></td>
			<td><%= sab.getAttdate()%></td>
		</tr>
	</table>
</body>
</html>