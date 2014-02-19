package com.lftechnology.training.practisequestions;

import java.util.Scanner;
import java.util.logging.Logger;
/**
 * Try to do a program that constantly prompts the user to enter something (using the Scanner class) until the user enters a specific word (such as quit for example).
 */
/**
 * This Class continously reads string from user until it reads quit to quit.
 * @author srizna
 *
 */
public class ContinuousUserInput {
	private static Logger LOGGER=Logger.getLogger(ContinuousUserInput.class.getName());
	/**
	 * This enterString method reads the word from the user and determine whether it is defined string or not.
	 */
	private static void enterString(){
		LOGGER.info("Reading user input...");
		Scanner userInput=new Scanner(System.in);
		System.out.println("Enter the word you want to write:");
		String enteredWord=userInput.next();
		if(enteredWord.equalsIgnoreCase("quit")||enteredWord.equalsIgnoreCase("bye")){
			LOGGER.info("You hit the correct word to exit.THANK YOU...");
			System.exit(0);
		}else{
			enterString();
		}
	}
	public static void main(String[] arg){
		LOGGER.info("Inside main method,calling sub function enterstring");
		enterString();
	}

}
