package com.lftechnology.training.practisequestions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This Class compares whwther the two arrays have the same contents or
 * not.(contents should be in same order).
 * 
 * @author dell
 * 
 */
public class CompareSameOrderArray {
	private static Logger LOGGER = Logger.getLogger(CompareSameOrderArray.class
			.getName());

	public static void main(String[] args) {
		LOGGER.info("Inside main method");
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 1, 2, 3, 4, 5 };
		int flag = 0;
		LOGGER.info("Comparing two array's contents");
		if (array1.length == array2.length) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[j] == array2[j]) {
					flag++;
				} else {
					flag = 0;
				}
			}
			if (flag == array1.length) {
				LOGGER.info("Both the arrays contain same contents in same order. ");
			} else {
				LOGGER.info("Both array's contents are in different order.");
			}
		} else {
			LOGGER.log(Level.WARNING,
					"length of the two different array is different");
		}
	}
}
