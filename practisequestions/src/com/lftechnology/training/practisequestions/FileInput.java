package com.lftechnology.training.practisequestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;
/**
 * Write a program called FileInput to read an int, a double, and a String form a text file called "in.txt", and produce the following output:  (Hint use Scanner to read from file)
a.	The integer read is 12 
b.	The floating point number read is 33.44 
c.	The String read is "Peter"
d.	Hi! Peter, the sum of 12 and 33.44 is 45.44

 */
/**
 * This Class reads the int ,double and string value from a file named "ini.txt"
 * and displays it as mentioned in question.
 * 
 * @author srizna
 * 
 */
public class FileInput {
	private static Logger LOGGER = Logger.getLogger(FileInput.class.getName());

	public static void main(String[] arg){
		int integerValue = 0;
		double doubleValue = 0;
		String stringValue = null;
		Scanner input=null;
		int sum = 0;
		File fileName = new File("ini.txt");
		try {
			input= new Scanner(fileName);
			while (input.hasNextLine()) {
				integerValue = input.nextInt();
				doubleValue = input.nextDouble();
				stringValue = input.next();

			}
			LOGGER.info("The integer read is " + integerValue);
			LOGGER.info("The floating point number read is " + doubleValue);
			LOGGER.info("The String read is " + stringValue);
			LOGGER.info("Hi! " + stringValue + " , the sum of " + integerValue
					+ " and " + doubleValue + " is "
					+ (integerValue + doubleValue));

		} catch (FileNotFoundException e) {
			LOGGER.log(Level.SEVERE, "File Not Found....");
		}finally{
			if(input!=null){
				input.close();
			}
		}
	}

}
