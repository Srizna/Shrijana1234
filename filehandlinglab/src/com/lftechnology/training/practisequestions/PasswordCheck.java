package com.lftechnology.training.practisequestions;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  Write a program to Implement a program to accomplish the following task using string / string Buffer class :
          i. Accept a password from user.
         ii. Check if password is correct then display "Good"
                   Else display "Incorrect password"
          iii. Append the password with the string "Welcome to java!!!"
           iv. Display the password in reverse order.
           v. Replace the character '!' in password with "*" character.
 */
/**
 * This Class reads the password from user,check whether its correct or not.append the password with new string,reversed it and use replace function as well.
 * @author srizna
 *
 */
public class PasswordCheck {
	private static final Logger LOGGER=Logger.getLogger(PasswordCheck.class.getName());
	public static void main(String[] arg){
		LOGGER.info("Inside main method");
		String oldPassword="happy";
		String appendPassword="Welcome to java!!!";
		Scanner inputPassword=new Scanner(System.in);
		String enteredPassword=inputPassword.next();
		if(oldPassword.equals(enteredPassword)){
			LOGGER.info("GOOD...");
			StringBuffer password=new StringBuffer(oldPassword);
			password.append(appendPassword);
			LOGGER.info("Password after append "+password);
			LOGGER.info("Reversed Password is "+password.reverse());
			String a=new String(password);
			LOGGER.info("Password after replacing is: "+a.replace('!', '*'));
		}else{
			LOGGER.log(Level.SEVERE,"Incorrect Password");
		}
		
		
		
		
		
		
	}

}
