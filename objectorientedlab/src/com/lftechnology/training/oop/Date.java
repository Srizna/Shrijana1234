package com.lftechnology.training.oop;

import java.lang.reflect.Constructor;
import java.util.Calendar;

/**
 * This Class set the values for date i.e day,month and year.
 * @author srizna
 *
 */
public class Date {
	int month;
	int day;
	int year;
	/**
	 * This is default {@link Constructor} to instantiate date.
	 * @author srizna
	 */
	public Date(){
		Calendar date=Calendar.getInstance();
		day=date.get(Calendar.DAY_OF_MONTH);
		month=date.get(Calendar.MONTH);
		year=date.get(Calendar.YEAR);
	}
	/**
	 * This method sets the value for day.
	 * @param day:defined day
	 */
	public void setDay(int day){
		this.day=day;
	}
	/**
	 * This method sets the value for month.
	 * @author srizna
	 * @param month:defined month
	 */
	public void setMonth(int month){
		this.month=month;
	}
	/**
	 * This method sets the value for year.
	 * @author srizna
	 * @param year:defined year
	 */
	public void setYear(int year){
		this.year=year;
	}
	/**
	 * This method takes the value of day.
	 * @author srizna
	 * @param day
	 * @return day
	 */
	public int getDay(int day){
		return day;
	}
	/**
	 * This method takes the value of month.
	 * @author srizna	 * 
	 * @param month:defined month
	 * @return month
	 */
	public int getMonth(int month){
		return month;
	}
	/**
	 * This method takes the value of year.
	 * @author srizna
	 * @param year:defined year.
	 * @return year
	 */
	public double getYear(int year){
		return year;
	}
	/**
	 * This method displays the correct date.
	 * @author srizna
	 */
	public void displayDate(){
		System.out.println("Correct date is "+month+"/"+day+"/"+year);
	}
	
}

