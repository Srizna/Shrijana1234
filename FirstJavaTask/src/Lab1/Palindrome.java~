package Lab1;

import java.util.Scanner;

/**
 * This Palindrome class takes five digits integer value from user and
 * determines whether it is Palindrome or not. If user inputs the number less
 * than five digits number it ask for next valid input.
 * 
 * @author srizna
 * 
 */

public class Palindrome {

	/**
	 * This method reads the five digits integer value from user.
	 * 
	 * @author srizna
	 */

	private static void enterNumber() {

		int enteredNumber=0;

		System.out.println("Enter 5 digits number:");
		Scanner number = new Scanner(System.in);
		try{
		enteredNumber = number.nextInt();
		}catch(Exception e){
			System.out.println("Invalid input.. Enter Valid integer value");
		}
		checkForPalindrome(enteredNumber, enteredNumber); // method call to
															// check for
															// palindrome
	}

	/**
	 * This method firstly checks for length of given number whether its five
	 * digits or not and then checks for Palindrome.
	 * 
	 * @author srizna
	 * @param entered_number
	 *            :user's input of five digits integer value
	 * @param temp
	 *            :user's input value
	 */
	private static void checkForPalindrome(int enteredNumber, int temp) {
		int remainder;
		int sum = 0;
		Integer enteredNumberLength = new Integer(enteredNumber);
		
		if ((enteredNumberLength.toString()).length() >= 5) {

				for (int i = 0; i < 5; i++) {
					remainder = enteredNumber % 10;
					enteredNumber = enteredNumber / 10;
					sum = sum * 10 + remainder;

				}
				display(sum, temp);
			} else {
				System.out.println("Need to give 5 digits number");
				enterNumber();
			}
		}

	/**
	 * This method displays whether the given input is palindrome or not.
	 * 
	 * @author srizna
	 * @param sum
	 *            :final stored value
	 * @param temp
	 *            :user's initial input value
	 */
	private static void display(int sum, int temp) {
		if (sum == temp) {
			System.out.println("The number "  + temp + " is PALINDROME");
		} else {
			System.out.println("The number " + temp 
					+ " is not  PALINDROME");
		}
	}

	public static void main(String[] arg) {

		enterNumber();
	}
}
