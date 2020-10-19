package com.laxmanbalaji.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {
	
	@Id
	private String courseNumber;
	
	private String courseName;


	public Course() {
	}


	public Course(String courseNumber, String courseName) {
		super();
		this.courseNumber = courseNumber;
		this.courseName = courseName;
	}


	@Override
	public String toString() {
		return "Course [courseNumber=" + courseNumber + ", courseName=" + courseName + "]";
	}


	
  /*  @ManyToMany
    @JoinTable(name="person_exam",
    joinColumns=@JoinColumn(name="personId"),
    inverseJoinColumns=@JoinColumn(name="examId"))
    private Collection<Exams> exams; */




}
