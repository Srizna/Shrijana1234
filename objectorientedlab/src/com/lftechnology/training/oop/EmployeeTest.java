package com.lftechnology.training.oop;
/**
 *Create a class called Employee that includes three pieces of information as instance variables a first name (type String), a last name (type String) and a monthly salary (double). Your class should have a constructor that initializes the three instance variables. Provide a set and a get method for each instance variable. Write a test application named EmployeeTest that demonstrates class Employee's capabilities. Create two Employee objects and display each object's yearly salary. Then give each Employee a 10% raise and display each Employee's yearly salary again.
 */
/**
 * This Class tests the Capabilities of Employee Class
 * @author srizna
 *
 */
public class EmployeeTest {
	double newSalary;
	/**
	 * This method displays the yearly salary of employee.
	 * @author srizna
	 * @param employee:employee
	 */
	public void display(Employee employee){
		System.out.println("\n The Yearly Salary of "+employee.getFirstName()+ employee.getLastName()+":"+(employee.getSalary()*12));
	}
	/**
	 * This method sets the raise on the salary of each employee.
	 * @author srizna
	 * @param employee:employee
	 */
	public void setSalaryRaise(Employee employee){
		newSalary=(employee.getSalary()*0.1+employee.getSalary());
		System.out.println("\n The salary of "+employee.getFirstName()+" with 10% raise is: " +newSalary);
		employee.setSalary(newSalary);
		System.out.println("\n New salary is "+employee.getSalary());
	}
	public static void main(String[] arg){
		Employee objFirstEmployee=new Employee("Ram","Sharma",15000);
		Employee objSecondEmployee=new Employee("Ritesh","Thapa",10000);
		EmployeeTest empTest=new EmployeeTest();
		
		objFirstEmployee.display();
		objSecondEmployee.display();
		
		empTest.display(objFirstEmployee);
		empTest.display(objSecondEmployee);
		empTest.setSalaryRaise(objFirstEmployee);
		empTest.setSalaryRaise(objSecondEmployee);
		
		
		
	}
}
