package com.lftechnology.training.practisequestions;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Compare if two arrays have the same content (doesn't matter if they aren't in order)
 */
/**
 * This Class compares two array's contents regardless of its order.
 * 
 * @author srizna
 * 
 */
public class CompareDifferentOrderArrays {
	private static Logger LOGGER = Logger
			.getLogger(CompareDifferentOrderArrays.class.getName());

	public static void main(String[] arg) {
		LOGGER.info("Inside main method");
		int[] array1 = { 1, 2, 1, 1, 1 };
		int[] array2 = { 1, 2, 1, 1, 1 };
		List<Integer> temporaryList = new LinkedList<Integer>();
		int flag = 0;
		LOGGER.info("Comparing array's lengths and its elements.");
		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array2.length; j++) {
					System.out.println(array1[i] + "\t" + array2[j]);
					if (array1[i] == array2[j] &&(!temporaryList.contains(j))) {
						flag++;
						System.out.println(flag);
						temporaryList.add(j);
						System.out.println(temporaryList);
						break;
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
