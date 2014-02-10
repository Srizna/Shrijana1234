package com.lftechnology.training.practisequestions;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write a program to accept a number from the user and throw an exception if the number is not an even number.
 */

/**
 * This EvenNumberException Class simply throws the error message when called.
 * 
 * @author srizna
 * 
 */
class EvenNumberException extends Exception {
	public EvenNumberException(String message) {
		super(message);
	}
}

/**
 * This MyException Class reads number from user and throws exception if its not
 * even number.
 * @author srizna
 */
class MyException {
	private static final Logger LOGGER = Logger.getLogger(MyException.class.getName());

	public static void main(String[] arg) throws EvenNumberException {
		LOGGER.info("Inside enterNumber method to read value");
		System.out.println("Enter any number: ");
		Scanner inputNumber = new Scanner(System.in);
		int enteredNumber = 0;
		try {
			enteredNumber = inputNumber.nextInt();
			if (enteredNumber % 2 == 0) {
				LOGGER.info("Entered number " + enteredNumber
						+ " is a even number");
			} else {
				throw new EvenNumberException("NOT A EVEN NUMBER");
			}
		} catch (InputMismatchException e) {
			LOGGER.log(Level.SEVERE, "Wrong Input");
		}
	}
}
