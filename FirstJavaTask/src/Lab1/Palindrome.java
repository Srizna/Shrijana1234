package Lab1;

import java.util.Scanner;

public class Palindrome {
	private static void checkForPalindrome(int entered_number, int temp) {
		// TODO Auto-generated method stub
		int remainder;
		int sum = 0;
		if (entered_number > 10000 && entered_number < 99999) {

			for (int i = 0; i < 5; i++) {
				remainder = entered_number % 10;
				entered_number = entered_number / 10;
				sum = sum * 10 + remainder;

			}
			display(sum, temp);
		} else {
			System.out.println("Need to give 5 digits number");
			enterNumber();
		}
	}

	private static void enterNumber() {
		// TODO Auto-generated method stub
		int entered_number;
		int temp;
		int sum = 0;
		System.out.println("Enter 5 digits number:");
		Scanner number = new Scanner(System.in);
		entered_number = number.nextInt();
		temp = entered_number;
		checkForPalindrome(entered_number, temp);
	}

	private static void display(int sum, int temp) {
		// TODO Auto-generated method stub
		if (sum == temp) {
			System.out.println("The number" + " " + temp + " "
					+ "is PALINDROME");
		} else {
			System.out.println("The number" + "  " + temp + " "
					+ "is not  PALINDROME");
		}
	}

	public static void main(String[] arg) {

		enterNumber();
	}
}
