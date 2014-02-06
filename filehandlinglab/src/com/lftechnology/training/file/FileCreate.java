package com.lftechnology.training.file;

import java.io.File;
import java.io.IOException;

/**
 * Write a program to create a text file in the path c:\java\abc.txt and check whether that file is exists. 
 * Using the command exists(), isDirectory(), isFile(), getName() and getAbsolutePath().
 */
/**
 * This Class creates new {@link File} and checks whether it exists or not .
 * if {@link File} exists,checks is it file or directory.
 * IF its {@link File} then use different functions of file as getname,getAbsolutePath.
 * @author srizna
 * 
 */
public class FileCreate {
	public static void main(String[] arg) {
		File firstFile = new File("/home/srizna/abc.txt");
		if(firstFile.exists()){
			System.out.println("File already exist..");
		}
		try {
			if (firstFile.createNewFile()) {
				System.out.println("File created successfully");
			}
		} catch (IOException e) {
			System.out.println("Fail to create file..");
		}

		if (firstFile.isDirectory()) {
				System.out.println("This is a directory.");
		} else if (firstFile.isFile()) {
				System.out.println("This is a simple File not a directory.");
				System.out.println("The filename is: " + firstFile.getName());
				System.out.println("The absolute Path of the file is: "+ firstFile.getAbsolutePath());
		}
		}
}
