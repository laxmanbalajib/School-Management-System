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

	@ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
	private Set<Staff> staffs = new HashSet<>();

	@ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
	private Set<Student> students = new HashSet<>();

	public Set<Staff> getStaffs() {
		return staffs;
	}

	public Course() {
	}

	public Set<Student> getStudents() {
		return students;
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

	/*
	 * @ManyToMany
	 * 
	 * @JoinTable(name="person_exam", joinColumns=@JoinColumn(name="personId"),
	 * inverseJoinColumns=@JoinColumn(name="examId")) private Collection<Exams>
	 * exams;
	 */

}
