package com.laxmanbalaji.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laxmanbalaji.mvc.model.Course;


public interface CourseRepo extends JpaRepository<Course, String>{

}