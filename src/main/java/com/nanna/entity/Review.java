package com.nanna.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private Long id;


	@Column
	private String rating;
	
	@ManyToOne
	private Course course;
	
	@Column
	private String description;
	
	
	
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Review(String description, String rating) {
		super();
		this.description = description;
		this.rating = rating;
	}

	public Review(String description) {
		super();
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", description=" + description + ", rating=" + rating + "]";
	}

}
