package com.lftechnology.training.practisequestions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Compare if two arrays have the same content (doesn't matter if they aren't in order)
 */
/**
 * This Class compares two array's contents regardless of its order.
 * 
 * @author dell
 * 
 */
public class CompareDifferentOrderArrays {
	private static Logger LOGGER = Logger
			.getLogger(CompareDifferentOrderArrays.class.getName());

	public static void main(String[] arg) {
		LOGGER.info("Inside main method");
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 2, 5, 4, 3, 1 };
		int temp = 0;
		int flag = 0;
		LOGGER.info("Comparing array's lengths and its elements.");
		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array2.length; j++) {
					System.out.println(array1[i] + "\t" + array2[j]);
					if (array1[i] == array2[j] && temp != array1[i]) {
						flag++;
						temp = array1[i];
					}
				}
			}
			if (flag == array1.length) {
				LOGGER.info("Both the arrays contains same elements");
			} else {
				LOGGER.info("Both the arrays contains different elements");
			}
		} else {
			LOGGER.log(Level.WARNING, "Arrays are not of equal size");
		}
	}

}
