package com.laxmanbalaji.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Staff")
public class Staff {
	
	@Id
	private int id;
	
	private String name;
	private String gender;

	public Staff() {
	}

	public Staff(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
  /*  @ManyToMany
    @JoinTable(name="person_exam",
    joinColumns=@JoinColumn(name="personId"),
    inverseJoinColumns=@JoinColumn(name="examId"))
    private Collection<Exams> exams; */


	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}

}
