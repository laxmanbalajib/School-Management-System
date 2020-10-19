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
		age: <input type="text" name="age"> <input type="submit">
	</form>

	<form action="getStaffById" method="get">
		Enter staff id: <input type="text" name="id"> <input type="submit">
	</form>

	<form action="getAlienByName" method="get">
		Enter name: <input type="text" name="name"> <input type="submit">
	</form>
</body>

</html>