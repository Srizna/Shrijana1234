package Lab1;

import java.util.Scanner;

/**
 * This class takes two integer values and perform basic mathematical
 * calculation as the user's input option and Returns integer value.
 * @author srizna
 * 
 */

public class Calculator {
	
	static Scanner userInputNumber = new Scanner(System.in);

	/**
	 * This method reads two {@link Float} values and ask the user to select the option to perform operation.
	 * @author srizna
	 */
	public static void enterNumber() {
		Float first;
		Float second;
		int choice;

		System.out.println("Enter the two numbers:");
		first = userInputNumber.nextFloat();
		second = userInputNumber.nextFloat();
		System.out.println("Press the number to perform respective operation:"
				+ "\n" + "1. for +" + "\n" + "2. for -" + "\n" + "3. for *"
				+ "\n" + "4. for /" + "\n" + "5. for %" + "\n" + "6. for Exit");

		choice = userInputNumber.nextInt();
		operation(first, second, choice);

	}

	/**
	 * This method takes three integer as parameter and perform the operations.
	 * 
	 * @author srizna
	 * @param first
	 *            :user's first input number
	 * @param second
	 *            :user's second input number
	 * @param a
	 *            :user's choice of operation
	 */

	private static void operation(Float first, Float second, int optionChoosen) {

		switch (optionChoosen) {
		case 1:

			System.out.println("Sum of " + first + " and " + second + " is "
					+ (first + second));
			break;
		case 2:
			System.out.println("Difference of " + first + " and " + second
					+ " is " + (first - second));
			break;
		case 3:
			System.out.println("Multiplication of " + first + " and " + second
					+ " is " + (first * second));
			break;
		case 4:

			if (second != 0) {
				System.out.println("division of " + first + " and " + second
						+ " is " + (first / second));
			} else {
				System.out
						.println("Any number divided by zero is infinite so enter next numbers to continue");
				enterNumber();
			}

			break;
		case 5:
			System.out.println("Modulus of " + first + " and " + second
					+ " is " + (first % second));
			break;
		case 6:
			System.out.println("Thank you..");
			break;
		default:
			System.out.println("Press valid Choice");

			int repeat = userInputNumber.nextInt();

			operation(first, second, repeat);

			break;

		}

	}

	public static void main(String[] arg) {
		enterNumber();

	}

}
