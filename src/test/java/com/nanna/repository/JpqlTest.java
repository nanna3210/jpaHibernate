package com.nanna.repository;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nanna.JpaHibernateApplication;
import com.nanna.entity.Course;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaHibernateApplication.class)
public class JpqlTest {

	@Autowired
	EntityManager em;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void jpql_basic() {
		
			Query createDQuery = em.createQuery("select c from Course c");
		
			List resultList = createDQuery.getResultList();
			logger.info("Select C from Course C =====> {}", resultList);
	}
	
		@Test
		public void jpql_typed () { 
			
			TypedQuery<Course> createQuery = em.createQuery("select c from Course c ", Course.class);
			List<Course> resultList = createQuery.getResultList();
			logger.info("select c from Course {} ", resultList);
		}
		@Test
		public void jpql_where () { 
			
			TypedQuery<Course> createQuery = em.createQuery("select c from Course c where name like 'spring'", Course.class);
			List<Course> resultList = createQuery.getResultList();
			logger.info("select c from Course {} ", resultList);
		}
}
