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
	StudentLoginAttendanceBean  slab = (StudentLoginAttendanceBean)session.getAttribute("slab");
	out.println("RollNo: " + slab.getRollNo());
	out.println("Name: " + slab.getName());
	%>
	<form>
		<label for="sub1">Sub1</label>
		<input type="text" name="sub1" id="sub1" required>
		<label for="sub2">Sub1</label>
		<input type="text" name="sub2" id="sub2" required>
		<label for="sub3">Sub1</label>
		<input type="text" name="sub3" id="sub3" required>
		<label for="sub4">Sub1</label>
		<input type="text" name="sub4" id="sub4" required>
		<label for="sub5">Sub1</label>
		<input type="text" name="sub5" id="sub5" required>
		<label for="sub6">Sub1</label>
		<input type="text" name="sub6" id="sub6" required>
		<label for="attdate">Sub1</label>
		<input type="text" name="attdate" id="attdate" required>
		<button type="submit">Submit</button>
	</form>
</body>
</html>