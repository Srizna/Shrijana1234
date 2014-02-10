package com.lftechnology.training.practisequestions;

import java.util.logging.Logger;

/**
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
/**
 * This Class displays the sum of multiple of 3 or 5 below 1000.
 * 
 * @author srizna
 * 
 */
public class SumOfMultipleOfThreeOrFive {
	private static Logger LOGGER=Logger.getLogger(SumOfMultipleOfThreeOrFive.class.getName());
	public static void main(String[] arg) {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		LOGGER.info("The sum of multiples of 3 or 5 below 1000 is "
				+ sum);
	}

}
