package com.nanna.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
//@NamedQuery(name = "get_all_courses")
public class Course {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	
	@OneToMany(mappedBy = "course")
	private List<Review> reviews = new ArrayList<Review>(); 
	
	@ManyToMany(mappedBy = "courses")
	private List<Student> students = new ArrayList<>();
	

	@UpdateTimestamp
	private LocalDateTime lastUpdatedTime;

	@CreationTimestamp
	private LocalDateTime createdDate;
	

	
	public Course(String name) {
		super();
		this.name = name;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public List<Student> getStudents() {
		return students;
	}


	public void addStudents(Student student) {
		this.students.add(student);
	}

	
	public List<Review> getReviews() {
		return reviews;
	}

	
	

	public void addReviews(Review review) {
		this.reviews.add(review);
	}
	public void removeReviews(Review review) {
		this.reviews.remove(review);
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
		return "Course [id=" + id + ", name=" + name + "]";
	}

}
