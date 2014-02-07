package com.lftechnology.training.file;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write a program to create a text file in the path c:\java\abc.txt and check whether that file is exists. 
 * Using the command exists(), isDirectory(), isFile(), getName() and getAbsolutePath().
 */
/**
 * This Class creates new {@link File} and checks whether it exists or not . if
 * {@link File} exists,checks is it file or directory. IF its {@link File} then
 * use different functions of file as getname,getAbsolutePath.
 * 
 * @author srizna
 * 
 */
public class FileCreate {
	private static final Logger LOGGER = Logger.getLogger(FileCreate.class
			.getName());

	public static void main(String[] arg) {

		File firstFile = new File("/home/srizna/abc.txt");
		if (firstFile.exists() && firstFile.isFile()) {
			LOGGER.log(Level.SEVERE,"File already exist with a filename: "
					+ firstFile.getName() + " and is at the Path: "
					+ firstFile.getAbsolutePath()+" so cannot be recreated...");
		} else {
			try {
				if (firstFile.createNewFile()) {
					LOGGER.info("File created successfully");
				}
			} catch (IOException e) {
				LOGGER.log(Level.SEVERE,"Fail to create file...");
			}

			if (firstFile.isDirectory()) {
				LOGGER.info("This is a directory.");
			} else if (firstFile.isFile()) {
				LOGGER.info("This is a simple File not a directory.");
				LOGGER.info("The file created with filename: "
						+ firstFile.getName());
				LOGGER.info("The absolute Path of the file is: "
						+ firstFile.getAbsolutePath());
			}
		}

	}
}
