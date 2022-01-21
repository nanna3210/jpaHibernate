
package com.nanna;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nanna.entity.Course;
import com.nanna.entity.Employee;
import com.nanna.entity.FullTimeEmployee;
import com.nanna.entity.PartTimeEmployee;
import com.nanna.entity.Review;
import com.nanna.entity.Student;
import com.nanna.repository.CourseRepository;
import com.nanna.repository.EmployeeRepository;
import com.nanna.repository.StudentRepository;

@SpringBootApplication
public class JpaHibernateApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	
	@Autowired
	private StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
//			Course courseGot = courseRepository.findById(10001L);
//			logger.info("GOT THE MESSAGE "+courseGot);
//			courseRepository.deleteById(10001L);
//			courseRepository.saveCourse(new Course("MicroServices Making By Practice"));
//			courseRepository.saveCourse(new Course("Angular Project get Hands On "));
//			courseRepository.playWithEntityManager();
//			
//		++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//		studentRepository.savestudentWithPassPort();
//			List<Review> reviews = new ArrayList<>();
//			Review review1 = new Review("Awsome course ", "5");
//			Review review2 = new Review("Awsome course thi is byfar the best", "5");
//			reviews.add(review1);
//			reviews.add(review2);
//			courseRepository.addreviewsForcourse(10002L, reviews);
//		
//		_____________________________________________________________
		/*
		 * Student student= new Student("nanna _kalahandi"); Course course = new
		 * Course("master microServices "); studentRepository.insertstudent(student,
		 * course);
		 */
		
//		_____________________________________________________________
//			System.out.println("+++++++++++++hey +++++++++++++++"+ student.getCourses());

			employeeRepository.saveEmployee
			(new FullTimeEmployee("nanna Fulltime", new BigDecimal("10000")));
			employeeRepository.
			saveEmployee(new PartTimeEmployee("nanna Parttime", new BigDecimal("70")));
	
	
	}
	

}
