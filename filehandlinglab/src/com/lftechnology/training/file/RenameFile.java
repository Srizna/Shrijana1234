package com.lftechnology.training.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * Write a program to rename the given file, after renaming the file delete the renamed file.
 * (Accept the file name using command line arguments.)
 */
/**
 * This Class reads the filename checks whether it exists or not.If exists reads the new filename to rename and finally delete the file.
 * @author srizna
 *
 */
public class RenameFile {
	public static void main(String[] arg) throws IOException {
		String path="/home/srizna/";
		Scanner inputFilename = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String oldFilename = inputFilename.next();
		File filename=new File(path+oldFilename);
		
		if(filename.exists()){
			System.out.println("file exist");
			System.out.println(filename.getName());
			System.out.println("Enter the new filename to rename:");
			String newFilename=inputFilename.next();
			File renameFilename=new File(path+newFilename);
			filename.renameTo(renameFilename);
			System.out.println(renameFilename.getName());
			renameFilename.delete();
			System.out.println("Renamed File deleted... ");
			
		}else{
			System.out.println("File  does not exist");
		}
		
	}
}
