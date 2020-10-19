package com.laxmanbalaji.mvc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TuitionFee")
public class Tuition {

	@Id
	@Column(name = "studentId")
	private int studentId;

	private int tuition;
	private int paid;

	@OneToOne
	@JoinColumn(name = "studentId")
	@MapsId
	private Student student;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getTuition() {
		return tuition;
	}

	public void setTuition(int tuition) {
		this.tuition = tuition;
	}

	public int getPaid() {
		return paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Tuition [studentId=" + studentId + ", tuition=" + tuition + ", paid=" + paid + ", student=" + student
				+ "]";
	}
	
	

}
