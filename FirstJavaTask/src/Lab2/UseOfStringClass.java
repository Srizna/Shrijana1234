package Lab2;

import java.util.Scanner;

/**
 * 
 * @author srizna
 * 
 */

public class UseOfStringClass {
	static String first_name;
	static String second_name;
	static String initial;
	static int choice;
	static String email;
	static String fullname;

	public static void enterName() {
		System.out.println("Enter your first initial:Mr/Ms/Mrs");
		Scanner init = new Scanner(System.in);
		initial = init.next();
		if (initial.equalsIgnoreCase("Ms") || initial.equalsIgnoreCase("Mr")
				|| initial.equalsIgnoreCase("Mrs"))

		{
			System.out.println("Enter your FirstName:");
			Scanner first = new Scanner(System.in);
			first_name = first.next();
			System.out.println("Enter your LastName:");
			Scanner second = new Scanner(System.in);
			second_name = second.next();
			Scanner mail = new Scanner("Enter your valid email:");
			email = mail.next();
			checkEmail(email);
		} else {
			System.out.println("invalid");
			enterName();
		}

	}

	public static boolean checkEmail(String email) {
		if (email.matches("\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b")) {
			return true;
		} else {
			return false;
		}
	}

	public static void chooseOption() {
		System.out.println("Enter the number to view your name separately:"
				+ "\n" + "1.To view FullName" + "\n"
				+ "2.To view initial address name only" + "\n"
				+ "3.To view FirstName only" + "\n" + "4.To view LastName only"
				+ "\n" + "5.To Continue" + "\n" + "6.To Exit");
		Scanner menu_entered = new Scanner(System.in);
		choice = menu_entered.nextInt();
		String fullname = initial + first_name + second_name;
		switch (choice) {

		case 1:
			System.out.println(fullname);

			break;
		case 2:
			System.out.println(fullname.substring(0, 3));
			break;
		case 3:
			System.out.println();
			break;
		case 4:
			System.out.println(second_name);
			break;
		case 5:
			chooseOption();
		case 6:
			System.out.println("Thank You..");
			break;
		}
	}

	/**
	 * @author srizna
	 * @param initial2
	 *            :first addressing name of user
	 * @param first_name2
	 *            :user's input as firstname
	 * @param second_name2
	 *            :user's input as lastname
	 */
	private static void display(String initial2, String first_name2,
			String second_name2) {
		// TODO Auto-generated method stub
		System.out.println("Your sweet FullName:" + initial2 + "."
				+ first_name2 + " " + second_name2);

	}

	public static void main(String[] arg) {
		enterName();
		chooseOption();
	}

}
