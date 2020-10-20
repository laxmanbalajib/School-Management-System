package com.laxmanbalaji.mvc.repo;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.laxmanbalaji.mvc.model.Course;





public interface CourseRepo extends CrudRepository<Course, String>{
	@Query(value = "SELECT * FROM Course", nativeQuery = true)
	List<Course> getAllCourses();

	@Query(value = "SELECT * FROM Course WHERE courseNumber = :courseNumber", nativeQuery = true)
	Course getCourseByNumber(String courseNumber);
}
