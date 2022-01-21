package com.nanna.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nanna.entity.Course;
import com.nanna.entity.Employee;
import com.nanna.entity.Review;

@Repository
@Transactional
public class EmployeeRepository {

	@Autowired
	EntityManager em;

	public void saveEmployee(Employee employee) { 
		
		em.persist(employee);
	}
	public List<Employee> getallEployees() { 
		TypedQuery<Employee> createdQuery = em.createQuery("select e from Employee e", Employee.class);
		List<Employee> AllEmployees  = createdQuery.getResultList();
		return AllEmployees;
	}
	
}
