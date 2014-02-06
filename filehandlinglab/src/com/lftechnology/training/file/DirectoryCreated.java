package com.lftechnology.training.file;

import java.io.File;
import java.util.Scanner;
/**
 * Write a program to create a directory and check whether the directory is created.
 */
/**
 * This Class creates new directory and checks whether it already exists or not.
 * @author srizna
 * 
 */
public class DirectoryCreated {
	public static void main(String[] arg) {
		Scanner inputFilename = new Scanner(System.in);
		System.out.println("Enter absoulte path of file: ");
		String directoryName = inputFilename.next();
		File file = new File(directoryName);
		if (file.exists()) {
			System.out.println("File already exist...");
		} else {
			if (file.mkdir()) {
				System.out.println("New Directory created successfully...");
			} else {
				System.out.println("Fail to create directory");
			}
		}
		

	}

}
