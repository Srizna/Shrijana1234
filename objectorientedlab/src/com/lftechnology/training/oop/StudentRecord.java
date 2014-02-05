package com.lftechnology.training.oop;

import java.util.Scanner;

/**
 * Write a program that calculates percentage and GPA of 5 students. Each of the students has following attributes: name, class, rollnum, and marks obtained in 5 subjects.
 */
/**
 * This Class reads five students name,class,rollno and marks obtained in 5 subjects.
 * And calculate percentage of each student.
 * @author srizna
 *
 */
public class StudentRecord {

	static double[] marks = new double[5];
	static String[] name=new String[5];
	static int[] className=new int[5];
	static int[] rollNumber=new int[5];

	public static void main(String[] arg) {
		StudentRecord studentOne = new StudentRecord();
		studentOne.enterStudentRecord();

	}

	/**
	 * This method reads the students name,class,roll and marks.
	 * @author srizna
	 */
	public void enterStudentRecord(){
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			try{
			System.out.println("Enter the record of student "+(i+1));
			System.out.println("Enter name: ");
			name[i] = input.next();
			System.out.println("Enter class: ");
			className[i] = input.nextInt();
			System.out.println("Enter Rollnumber: ");
			rollNumber[i] = input.nextInt();
			System.out.println("Enter marks for Five subjects: ");
			for (int j = 0; j < 5; j++) {
				System.out.println("Enter marks for subject: " + (j + 1));
				marks[j] = input.nextDouble();

			}}catch(Exception e){
				System.out.println("Invalid Input:");
				enterStudentRecord();
			}
		}
		calculatePercentage();

	}

	/**
	 * This method calculates percentage of each student.
	 * @author srizna
	 * @param marks;marks
	 */
	private static void calculatePercentage() {
		double result = 0.0;
		
		
		for(int i=0;i<2;i++){
		System.out.println((i+1)+"\n.Name " + "\t" + name [i]+ "\t" + "class" + "\t"
				+ className[i] + "\t" + "Roll number" + "\t" + rollNumber[i]+marks[i]);
		for (int j = 0; j< 2; j++) {

				result += marks[i];

			}
		double percentage = ((result * 100) / 500);
		System.out.println("total marks is " + result + "\t" + "Percentage is "
				+ percentage);
		}
		
		}
	}

