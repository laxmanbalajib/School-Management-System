<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

	<form action="/teacher/findAllStaff" method="post">
		<button type="submit" class="btn btn-primary">Show All Staff</button>
	</form>

	<form action="/teacher/findStaffById" method="post">
	Enter Staff Id: <input type="text" name="staffId"><br>
	<button type="submit" class="btn btn-primary">Submit</button>
	</form>

	<form action="addEarning" method="post">
		Enter Staff Id: <input type="text" name="staffId"><br>
		Enter Salary: <input type="text" name="salary">
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


</body>

</html>