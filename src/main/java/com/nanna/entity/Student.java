package com.nanna.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private String name;

	@OneToOne(fetch = FetchType.LAZY)
	private Passport passport;
	
	@ManyToMany
	@JoinTable(name = "student_course" , 
		joinColumns = @JoinColumn(name= "student_id"), 
		inverseJoinColumns = @JoinColumn(name="course_id"))
	private  List<Course> courses = new ArrayList<Course>();
	


	public Student(String name) {

		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public List<Course> getCourses() {
		return courses;
	}

	public void addCourses(Course course) {
		this.courses.add(course);
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
