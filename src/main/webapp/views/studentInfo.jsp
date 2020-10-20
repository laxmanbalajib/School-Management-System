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
        <SCRIPT LANGUAGE="JavaScript">


            function checker()
            {           	
            	result = document.form1.studentId.value;
            	var integer = parseInt(result);
                if (!Number.isInteger(integer)) {
                    alert("Sorry, that's not a valid student Id.")
                    return false
                } else {
                    document.form1.submit()
                }
            	
            	
            }
           
        </SCRIPT>
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-body">
				<h4 class="card-title d-flex justify-content-center">STUDENT
					INFO PAGE</h4>
				<p class="card-text">
				<form action="/student/findAllStudents" method="post">
					<button type="submit" class="btn btn-primary">Show All
						Student</button>
				</form>
				</p>
				<p class="card-text">
				<form action="/student/findAllStudents/Tuition" method="post">
					<button type="submit" class="btn btn-primary">Show All
						Student Tuition Info</button>
				</form>
				</p>

			</div>
		</div>
	</div>


	<form name = "form1" action="/student/findStudentById" method="post"
		onsubmit="return checker();">
		Enter Student Id: <input type="text" name="studentId"><br>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>

	<c:if test="${hide == 1}">
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th scope="col">Student Id</th>
					<th scope="col">Full Name</th>
					<th scope="col">Gender</th>
				</tr>
			</thead>
			<tbody>

				<tr>
					<td>${student.getId()}</td>
					<td>${student.getName()}</td>
					<td>${student.getGender()}</td>
				</tr>

			</tbody>
		</table>
	</c:if>

	<form  name="myform" action="/student/findStudentBySalary" method="post">
		Enter salary range: <input type="text" name="salaryStart"> to
		<input type="text" name="salaryEnd"><br>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>

</body>


</html>