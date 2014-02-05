package com.lftechnology.training.oop;

import java.util.Scanner;

/**
 *Create a class called Time with three attributes hours, minutes, and seconds. Use appropriate constructor (s) to initialize instance variables. Also, use a display method to display the time in hh:mm:ss format. Modify the class to add two time objects that correctly results in addition of times.
 */
/**
 * This Class contains two different constructors one default constructor and
 * another parameterized constructor. It displays the addition of Two Times and
 * displays in hh:mm:ss format.
 * 
 * @author srizna
 * 
 */
public class Time {
	int hours;
	int minutes;
	int seconds;

	/**
	 * This is default constructor to initialized the value of hours,minutes and
	 * seconds.
	 * 
	 * @author srizna
	 */
	public Time() {

		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	/**
	 * This is Parameterized constructor.
	 * 
	 * @author srizna
	 * @param hour
	 *            :time in hour
	 * @param min
	 *            :time in minutes
	 * @param sec
	 *            :time in seconds
	 */
	public Time(int hour, int min, int sec) {
		hours = hour;
		minutes = min;
		seconds = sec;
	}

	/**
	 * This method displays the given time in hh:mm:ss format.
	 * 
	 * @author srizna
	 */
	public void display() {
		System.out.println("Time is " + hours + ":" + minutes + ":" + seconds
				+ ":");
	}

	/**
	 * This method adds the two objects time and displays the addition of time.
	 * 
	 * @param time
	 *            :time
	 */
	public void addTime(Time time) {
		
		this.seconds += time.seconds;
		this.minutes += time.minutes;
		this.hours += time.hours;

		if (seconds >= 60) {
			minutes = minutes+seconds / 60;
			seconds = seconds % 60;
		}
		if (minutes >= 60) {
			hours = hours+minutes / 60;
			minutes = minutes % 60;
		}
		System.out.println("Total Time is " + hours + ":" + minutes + ":"
				+ seconds);

	}

	public static void main(String[] arg) {
		int hour = 0;
		int min = 0;
		int sec = 0;

		System.out.println("Enter time in hour:minute:second ");
		Scanner timeInput = new Scanner(System.in);
		try {
			hour = timeInput.nextInt();
			min = timeInput.nextInt();
			sec = timeInput.nextInt();
		} catch (Exception e) {
			System.out.println("Inavlid entry");
		}
		Time obj1 = new Time(hour, min, sec);
		Time obj2 = new Time(12, 27, 33);
		obj1.display();
		obj2.display();
		obj1.addTime(obj2);

	}

}
