package com.lftechnology.training.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write a program to rename the given file, after renaming the file delete the renamed file.
 * (Accept the file name using command line arguments.)
 */
/**
 * This Class reads the filename checks whether it exists or not.If exists reads
 * the new filename to rename and finally delete the file.
 * 
 * @author srizna
 * 
 */
public class RenameFile {
	private static final Logger LOGGER =Logger.getLogger(RenameFile.class.getName());
	public static void main(String[] arg) throws IOException {
		String path = "/home/srizna/";
		Scanner inputFilename = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String oldFilename = inputFilename.next();
		File filename = new File(path + oldFilename);

		if (filename.exists()) {
			LOGGER.info("file exist with file name "
					+ filename.getName());
			System.out.println("Enter the new filename to rename:");
			String newFilename = inputFilename.next();
			File renameFilename = new File(path + newFilename);
			filename.renameTo(renameFilename);
			LOGGER.info("File with name " + filename.getName() + " renamed to "
					+ renameFilename.getName());
			if (renameFilename.delete()) {
				LOGGER.info("Renamed File deleted... ");
			} else {
				LOGGER.log(Level.SEVERE,"Fail to delete file..");
			}

		} else {
			LOGGER.log(Level.SEVERE,"File  does not exist");
		}

	}
}
