package com.lftechnology.training.oop;

import java.util.Random;
import java.util.Scanner;

/**
 * Write a Guessing a number game application: User will select the guessing value from the keyboard and application will generate a random no between 1 and 100. Check if the guess value matched with random no. or not, if matched show the guessing value, random value and the no. of attempts.
 */
/**
 * This Class contains two submethods one of which reads input of type integer
 * and another generate random value and compare them.Finally displays no. of
 * attempts to matched random number and entered number.
 * 
 * @author srizna
 * 
 */
public class GuessingNumberGame {
	int number;
	int attemptCounter = 0;

	/**
	 * This method reads the {@link Integer} value ranges from 1-100.
	 * 
	 * @author srizna
	 */
	public void enterNumber() {
		Scanner userInput = new Scanner(System.in);
		System.out
				.println("Enter the number ranges from 1-100 Or Press 0 to exit:");
		try {
			number = userInput.nextInt();
		} catch (Exception e) {
			System.out.println("Enter valid number....");
			enterNumber();
		}
		if (number == 0) {
			System.out.println("Thank you...");
			System.exit(0);
		} else if (number <= 100 & number >= 1) {
			attemptCounter++;
			Random randomNumber = new Random();
			int randomValue = randomNumber.nextInt(100) + 1;
			System.out.println(randomValue);
			checkNumber(number, randomValue);
		} else {
			System.out
					.println("Invalid number.Please enter number within range");
			enterNumber();
		}
	}

	/**
	 * This method determines whether the user's input {@link Integer} value
	 * matched with generated random number or not.
	 * 
	 * @author srizna
	 * @param number
	 *            :user's input
	 * @param value
	 *            :the generated random number.
	 */
	private void checkNumber(int number, int value) {
		if (number == value) {
			System.out.println("Entered number: " + number + "\t"
					+ "Random number generated: " + value);
			System.out.println("Number of attempts: " + attemptCounter);
			System.out.println("Entered number and Random number matched. ");
		} else {
			enterNumber();
		}

	}

	public static void main(String[] arg) {
		GuessingNumberGame obj = new GuessingNumberGame();
		obj.enterNumber();

	}

}
