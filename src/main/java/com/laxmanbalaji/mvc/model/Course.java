package com.laxmanbalaji.mvc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {

	@Id
	private String courseNumber;

	private String courseName;

	@Override
	public String toString() {
		return "Course [courseNumber=" + courseNumber + ", courseName=" + courseName + "]";
	}

	/*
	@ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
	private Set<Staff> staffs = new HashSet<>();

	@ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
	private Set<Student> students = new HashSet<>();
	*/



}
