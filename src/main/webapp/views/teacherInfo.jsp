<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-body">
				<h4 class="card-title d-flex justify-content-center">STAFF INFO PAGE</h4>
				<p class="card-text">
				<form action="/teacher/findAllStaff" method="post">
					<button type="submit" class="btn btn-primary">Show All
						Staff</button>
				</form>
				</p>

			</div>
		</div>
	</div>


	<form action="/teacher/findStaffById" method="post">
		Enter Staff Id: <input type="text" name="staffId"><br>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>

	<c:if test="${hide == 1}">
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th scope="col">Staff Id</th>
					<th scope="col">Full Name</th>
					<th scope="col">Gender</th>
				</tr>
			</thead>
			<tbody>

				<tr>
					<td>${staff.getId()}</td>
					<td>${staff.getName()}</td>
					<td>${staff.getGender()}</td>
				</tr>

			</tbody>
		</table>
	</c:if>

	<form action="/teacher/findStaffBySalary" method="post">
		Enter salary range: <input type="text" name="salaryStart"> to
		<input type="text" name="salaryEnd"><br>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>

</body>

</html>