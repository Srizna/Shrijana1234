package Lab2;

import java.util.Scanner;

/**
 * This DisplayName class contains multiple methods which takes the complete
 * name and email as {@link String} from user and then checks for email. It
 * shows the use of methods of {@link String} Class.
 * 
 * @author srizna
 * 
 */
public class DisplayName {
	String initial;
	String firstName;
	String lastName;
	String email;
	String fullName;
	private int choice;
	String[] name;
	Scanner userInput = new Scanner(System.in);

	/**
	 * This method takes user's email.
	 * 
	 * @author srizna
	 */
	public void enterEmail() {
		System.out.println("Enter your valid email:");
		email = userInput.next();
		if (checkEmail(email)) {
			System.out.println("Valid Email");
		} else {
			enterEmail(); // recall the method if email is not valid.
		}
	}

	/**
	 * This method takes the user's complete name as input.
	 * 
	 * @author srizna
	 */
	public void enterInputName() {
		System.out.println("Enter your initial:Mr/Ms/Mrs");
		initial = userInput.next();
		if (initial.equalsIgnoreCase("Ms") || initial.equalsIgnoreCase("Mr")
				|| initial.equalsIgnoreCase("Mrs"))

		{
			System.out.println("Enter your FirstName:");
			firstName = userInput.next();
			System.out.println("Enter your LastName:");
			lastName = userInput.next();
			enterEmail();

		} else {
			System.out.println("Invalid Input.Enter valid initial");
			enterInputName(); // recall the method if the initial input is
								// invalid.
		}
	}

	/**
	 * This method checks for validation of email.
	 * 
	 * @author srizna
	 * @param email
	 *            :user's email.
	 * @return: true if valid email,false if invalid.
	 */
	private boolean checkEmail(String email) {
		if (email.matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b")) {

			return true;
		} else {

			return false;
		}

	}

	/**
	 * This method splits the complete name given by user and stored it into
	 * {@link Array} of type {@link String}
	 * 
	 * @author srizna
	 * @return: the splited name as {@link Array} of type {@link String}.
	 */
	public String[] splitName() {
		fullName = initial + " " + firstName + " " + lastName;
		name = fullName.split(" ");

		return (name);
	}

	/**
	 * This method provides option to the users to perform different operations.
	 * 
	 */
	public void chooseOption() {
		String[] singlename = splitName();
		System.out.println("Enter the number to view your name separately:"
				+ "\n" + "1.To view FullName" + "\n"
				+ "2.To view initial address name only" + "\n"
				+ "3.To view FirstName only" + "\n" + "4.To view LastName only"
				+ "\n" + "5.To view all operations" + "\n" + "6.To Exit");

		choice = userInput.nextInt();

		switch (choice) {

		case 1:
			System.out.println(fullName);

			break;

		case 2:

			if (singlename.length > 1) {
				System.out.println("first initial" + "\t"
						+ singlename[0].toUpperCase());
			} else {
				System.out.println("the array is empty");
			}
			break;
		case 3:
			System.out.println("Your FirstName is" + "\t"
					+ (singlename[1]).toUpperCase());
			break;
		case 4:
			System.out.println("Your LastName is" + "\t"
					+ (singlename[2]).toUpperCase());
			break;
		case 5:
			System.out.println("Your FullName Length is" + "\t"
					+ namelength(fullName));
			System.out.println("Your FirstName is of Length " + "\t"
					+ namelength(firstName));
			System.out.println("Your LastName is of Length " + "\t"
					+ namelength(lastName));
			System.out.println("Position of FirstName is at:" + "\t"
					+ fullName.indexOf(singlename[1]));
			System.out.println("Position of LastName is at:" + "\t"
					+ fullName.indexOf(singlename[2]));
			break;
		case 6:
			System.out.println("Thank you..");
			break;

		}
	}

	/**
	 * This method takes the {@link String} argument and calculates the length
	 * of provided parameter
	 * 
	 * @author srizna
	 * @param name_type
	 *            : the name passed as argument.
	 * @return:the length of name.
	 */
	private int namelength(String nameType) {
		int fullLength = nameType.length();
		return fullLength;
	}

	public static void main(String[] arg) {
		DisplayName obj = new DisplayName(); // object created to access method of the classes.
		obj.enterInputName();
		obj.chooseOption();

	}

}
