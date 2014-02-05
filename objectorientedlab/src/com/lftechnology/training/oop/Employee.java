package com.lftechnology.training.oop;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;

/**
 * This Class uses set and get methods to set the name and salary  of employee.
 * @author srizna
 *
 */
public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	/**
	 * This is a {@link ParameterizedType} {@link Constructor} to instantiate firstname,lastname,salary of an employee.
	 * @author srizna
	 * @param firstname:firstname
	 * @param lastname:lastname
	 * @param salary:salary
	 */
	public Employee(String firstname,String lastname,double salary){
		this.firstName=firstname;
		this.lastName=lastname;
		this.salary=salary;
	}
	/**
	 * This method sets the value for firstname.
	 * @author srizna
	 * @param firstaname:firstname.
	 */
	public void setFirstName(String firstname){
		this.firstName=firstname;
	}
	/**
	 * This method sets the value for lastname.
	 * @author srizna
	 * @param lastname:lastname;
	 */
	public void setLastName(String lastname){
		this.lastName=lastname;
	}
	/**
	 * This method sets the value for Salary.
	 * @author srizna
	 * @param salary
	 */
	public void setSalary(double salary){
		this.salary=salary;
	}
	/**
	 * This method returns the firstname.
	 * @author srizna
	 * @return firstname
	 */
	public String getFirstName(){
		return firstName;
	}
	/**
	 * This method returns the lastname
	 * @author srizna
	 * @return lastname
	 */
	public String getLastName(){
		return lastName;
	}
	/** 
	 * This method returns the value of salary.
	 * @author srizna
	 * @return salary
	 */
	public double getSalary(){
		return salary;
	}
	/**
	 * This method displays the fullname and salary of an employee.
	 * @author srizna
	 */
	public void display(){
		System.out.println("Fullname: "+firstName+" "+ lastName+"\t"+"Salary: "+salary);
	}

	
	

}
