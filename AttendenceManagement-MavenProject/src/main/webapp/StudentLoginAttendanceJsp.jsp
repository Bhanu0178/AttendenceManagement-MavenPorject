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
	StudentLoginAttendanceBean  slab = (StudentLoginAttendanceBean)request.getAttribute("slab");
	out.println("RollNo: " + slab.getRollNo() + "<br>");
	out.println("Name: " + slab.getName() + "<br><br>");
	%>
	<form action="studentattendanceform" method="post" >
		<input type="hidden" name="rollno"  value="<%=slab.getRollNo()%>">
		<input type="hidden" name="sname" value="<%=slab.getName()%>">
		<label for="sub1">Sub1</label>
		<input type="text" name="sub1" id="sub1" required maxlength="1"><br><br>
		<label for="sub2">Sub2</label>
		<input type="text" name="sub2" id="sub2" required maxlength="1""><br><br>
		<label for="sub3">Sub3</label>
		<input type="text" name="sub3" id="sub3" required maxlength="1""><br><br>
		<label for="sub4">Sub4</label>
		<input type="text" name="sub4" id="sub4" required maxlength="1""><br><br>
		<label for="sub5">Sub5</label>
		<input type="text" name="sub5" id="sub5" required maxlength="1""><br><br>
		<label for="sub6">Sub6</label>
		<input type="text" name="sub6" id="sub6" required maxlength="1""><br><br>
		<label for="attdate">AttDate</label>
		<input type="date" name="attdate" id="attdate" required><br><br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>