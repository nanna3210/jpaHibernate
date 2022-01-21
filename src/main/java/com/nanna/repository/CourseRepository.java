package com.nanna.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nanna.entity.Course;
import com.nanna.entity.Review;

@Repository
@Transactional
public class CourseRepository {

	@Autowired
	EntityManager em;

	public Course findById(Long id) {

		return em.find(Course.class, id);
	}

	public void deleteById(Long id) {
		Course foundCourse = findById(id);
		em.remove(foundCourse);
	}

	public Course saveCourse(Course course) {

		if (course.getId() == null) {
			em.persist(course);
		} else {
			em.merge(course);
		}

		return course;
	}
	
	public void playWithEntityManager() { 
			
		Course course = new Course("microservices Easy");
		em.persist(course);
		em.flush();
//		Course course1 = new Course("Angular 2 is In master ");
//		em.persist(course1);
//		em.flush();
//		em.clear();
//		course.setName("microservices Easy --UPDATED ");

//		em.detach(course1);
//		course1.setName("Angular 2 is In master  ___UPDATEDDDD ");

		Course course2 = findById(10001L);
		course2.setName("SPRING DATA JPA ++++ UPDATED 2022");
	}


	public void addreviewscourse() {
		
		Course course = findById(10004L);
		course.getReviews();
		System.out.println("+++++++++++   -> "+course.getReviews());
		Review review1 = new Review("WOW THATS AMAZE ", "5");
		Review review2 = new Review("Not That aMazing Course is A bit outdated", "4");
		course.addReviews(review1);
		review1.setCourse(course);
		course.addReviews(review2);
		review2.setCourse(course);
		
		
		em.persist(review2);
		em.persist(review1);
}
	
	
	
	
	public void addreviewsForcourse(Long courseId, List<Review> reviews) {

		Course course = findById(courseId);
//			course.getReviews();

		for (Review review : reviews) {

			course.addReviews(review);
			review.setCourse(course);

			em.persist(review);
		}

	}

}
