package com.nanna.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class PartTimeEmployee extends Employee{

		private BigDecimal hourlyWages; 
		
		protected PartTimeEmployee() { 
			
		}
		public PartTimeEmployee(String name , BigDecimal hourlyWages) { 
			super(name);
			this.hourlyWages = hourlyWages;
			
		}
		
	
}
