package com.laxmanbalaji.mvc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.laxmanbalaji.mvc.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>{
	
	@Query(value = "SELECT * FROM Student", nativeQuery = true)
	List<Student> getAllStudents();
	
	@Query(value = "SELECT * FROM Student WHERE id = :studentId", nativeQuery = true)
	Student getStudentById(int studentId);
	
	@Query(value = "SELECT * FROM Staff,Earn WHERE Earn.salary >= :salaryStart AND Earn.salary <= :salaryEnd  AND Earn.staffId = Staff.id", nativeQuery = true)
	List<Student> getStaffBySalary(int salaryStart, int salaryEnd);
}
