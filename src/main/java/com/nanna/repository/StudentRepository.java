package com.nanna.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nanna.entity.Course;
import com.nanna.entity.Passport;
import com.nanna.entity.Student;
import com.nanna.entity.Student;

@Repository
@Transactional
public class StudentRepository {

	@Autowired
	private EntityManager em;

	public Student findByid(Long id) {

		Student foundStudent = em.find(Student.class, id);
		return foundStudent;
	}

	public void deleteByid(Long id) {

		Student foundStudent = findByid(id);
		em.remove(foundStudent);
	}

	public Student saveStudent(Student student) {

		if (student.getId() == null) {
			em.persist(student);
		} else {
			em.merge(student);
		}

		return student;

	}


		public void savestudentWithPassPort() { 
			
			Passport passport = new Passport("Z321453");
			em.persist(passport);
			Student student = new Student("David Maccauly"); 
			student.setPassport(passport);
			em.persist(student);
			
		}
		public void insertstudent(Student student, Course course) { 
			
//			Student student= new Student("nav Dash ");
//			Course course = new Course("master microServices ");
			
			em.persist(student);
			em.persist(course);
			
			student.addCourses(course);
			course.addStudents(student);
			em.persist(student);
		}
		
		
		

	
}
