package com.lftechnology.training.oop;

/**
 * Create a class called Date that includes three pieces of information as instance variables a month (type int), a day (type int) and a year (type int). Your class should have a constructor that initializes the three instance variables and assumes that the values provided are correct. Provide a set and a get method for each instance variable. Provide a method displayDate that displays the month, day and year separated by forward slashes (/). Write a test application named DateTest that demonstrates class Date's capabilities.
 */
/**
 * This Class tests the capabilities of Date Class.
 * @author srizna
 *
 */
public class DateTest {
	/**
	 * This method displays the date in hh:mm:ss format.
	 * @author srizna
	 * @param date:object
	 */
	public void display(Date date){
		System.out.println("Set Date is "+date.month+"/"+ date.day+"/"+date.year);
		
	}
	public static void main(String[] arg){
		Date objFirstDate=new Date();
		Date objSecondDate=new Date();
		DateTest objTest=new DateTest();
		
		objFirstDate.setDay(23);
		objFirstDate.setMonth(12);
		objFirstDate.setYear(2014);
		
		objSecondDate.setDay(2);
		objSecondDate.setMonth(9);
		objSecondDate.setYear(1990);
		
		objFirstDate.displayDate();
		objTest.display(objFirstDate);
		objTest.display(objSecondDate);
		
		
	}

}
