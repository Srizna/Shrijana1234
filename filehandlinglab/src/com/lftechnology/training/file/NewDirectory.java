package com.lftechnology.training.file;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write a program to create a directory and check whether the directory is created.
 */
/**
 * This Class checks whether the directory exist or not else creates new
 * directory and checks whether the directory created or not.
 * @author srizna
 */
public class NewDirectory {
	private static final Logger LOGGER=Logger.getLogger(NewDirectory.class.getName());
	public static void main(String[] arg) {
		Scanner inputFilename = new Scanner(System.in);
		System.out.println("Enter Absoulte path for creating directory: ");
		String directoryName = inputFilename.next();
		File file = new File(directoryName);
		if (file.exists() && file.isDirectory()) {
			LOGGER.log(Level.SEVERE,"Directory with this name: " + file.getName()
					+ " already exist");
		} else {
			if (file.mkdirs()) {
				LOGGER.info("New Directory created successfully...");
			} else {
				LOGGER.log(Level.SEVERE,"Fail to create directory");
			}
		}
	}
}
