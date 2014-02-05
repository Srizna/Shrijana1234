package Lab1;

import java.util.Scanner;

/**
 * 
 * @author srizna
 * 
 */

public class Calculator {
	public static void main(String[] arg) {
		int first;
		int second;
		int choice;

		System.out.println("Enter the two numbers:");
		Scanner first_num = new Scanner(System.in);
		first = first_num.nextInt();
		Scanner second_num = new Scanner(System.in);
		second = second_num.nextInt();

		System.out.println("Press the number to perform respective operation:"
				+ "\n" + "1. for +" + "\n" + "2. for -" + "\n" + "3. for *"
				+ "\n" + "4. for /" + "\n" + "5. for %" + "\n" + "6. for Exit");

		Scanner menu = new Scanner(System.in);
		choice = menu.nextInt();
		operation(first, second, choice);

	}

	/**
	 * 
	 * @param first
	 *            :user's first input number
	 * @param second
	 *            :user's second input number
	 * @param a
	 *            :user's choice of operation
	 */

	private static void operation(int first, int second, int a) {
		// TODO Auto-generated method stub

		switch (a) {
		case 1:
			System.out.println("Sum of" + " " + first + "and" + " " + second
					+ "" + "is" + (first + second));
			break;
		case 2:
			System.out.println("Difference of" + " " + first + "and" + " "
					+ second + "" + "is" + (first - second));
			break;
		case 3:
			System.out.println("Multiplication of" + " " + first + "and" + " "
					+ second + "" + "is" + (first * second));
			break;
		case 4:
			System.out.println("division of " + "" + first + "and" + " "
					+ second + "" + "is" + (first / second));
			break;
		case 5:
			System.out.println("Modulus of" + " " + first + "and" + " "
					+ second + "" + "is" + (first % second));
			break;
		case 6:
			System.out.println("Thank you..");
			break;
		default:
			System.out.println("Press valid Choice");
			Scanner repeatchoice = new Scanner(System.in);
			int repeat = repeatchoice.nextInt();

			operation(first, second, repeat);

			break;

		}

	}

}
