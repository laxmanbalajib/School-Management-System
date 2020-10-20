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
	<div
		style="position: absolute; top: 120px; bottom: 0; left: 0; right: 0; margin: auto;">
		<div class="container">
			<div class="card">
				<div class="card-body">
					<h4 class="card-title d-flex justify-content-center">COURSE
						INFO PAGE</h4>
					<p class="card-text">
					<form action="/course/findAllCourses" method="post">
						<button type="submit" class="btn btn-primary">Show All
							Courses</button>
					</form>
					</p>
					<p class="card-text">
					<form action="/course/findCourseByNumber" method="post">
						Enter Course Number: <input type="text" name="courseNumber">
						<button type="submit" class="btn btn-primary">Submit</button>
					</form>
					</p>
					<p class="card-text">
					<form action="/course/findCourseBySalary" method="post">
						Enter salary range: <input type="text" name="salaryStart">
						to <input type="text" name="salaryEnd">
						<button type="submit" class="btn btn-primary">Submit</button>
					</form>
					</p>
					<p class="card-text">
					<form action="course/addCourseForm">

						<button type="submit" class="btn btn-primary">Form for
							adding a new Course</button>
					</form>

					</p>

				</div>
			</div>
		</div>




		<c:if test="${hide == 1}">
			<table class="table table-striped table-bordered my-3">
				<thead>
					<tr>
						<th scope="col">Course Number</th>
						<th scope="col">Course Name</th>
						<th scope="col">Course Fee</th>
					</tr>
				</thead>
				<tbody>

					<tr>

						<td>${course.getCourseNumber()}</td>
						<td>${course.getCourseName()}</td>
						<td>${course.getCourseFee()}</td>

					</tr>


				</tbody>
			</table>
		</c:if>
		<br>

	</div>
</body>

</html>