<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Hello world</p>
	<form action="addAlien3" method="post">
		Enter name: <input type="text" name="name"><br> Enter
		age: <input type="text" name="age">
		<button type="submit">Submit</button>
	</form>

	<form action="getStaffById" method="get">
		Enter staff id: <input type="text" name="id">
		<button type="submit">Submit</button>
	</form>

	<form action="getStaffByName" method="get">
		Enter name: <input type="text" name="name">
		<button type="submit">Submit</button>
	</form>

	<form action="getCourseByNumber" method="get">
		Enter courseNumber: <input type="text" name="courseNumber">
		<button type="submit">Submit</button>
	</form>
	
</body>

</html>