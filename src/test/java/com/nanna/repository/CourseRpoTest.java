package com.nanna.repository;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.nanna.JpaHibernateApplication;
import com.nanna.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaHibernateApplication.class)
public class CourseRpoTest {

	@Autowired
	CourseRepository courseRepository; 
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Test
	public void find_By_id() {
//		logger.info("Testing is Running ");
		Course courseWeGot = courseRepository.findById(10001L);
		System.out.println("nnnnnnn"+courseWeGot);
		assertEquals("Spring data JPA ", courseWeGot.getName());
		
	}
	
	@Test
	@DirtiesContext
	public void delete_By_id() {
//		logger.info("Testing is Running ");
		courseRepository.deleteById(10001L);
		assertNull(courseRepository.findById(10001L));;
		
	}
	@Test
	@DirtiesContext
	public void saveCourse () {

			Course founDCourse  = courseRepository.findById(10002L);
			founDCourse.setName("SPRING SECURITY ");
			courseRepository.saveCourse(founDCourse);
			assertEquals("SPRING SECURITY ", courseRepository.findById(founDCourse.getId()).getName());
		
		
	}

}
