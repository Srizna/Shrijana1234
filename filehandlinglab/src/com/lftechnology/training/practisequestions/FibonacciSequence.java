package com.lftechnology.training.practisequestions;

import java.util.logging.Logger;

/**
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
/**
 * This Class displays the sum of even valued terms of Fibonacci sequence below 4 millions.
 * @author srizna
 */
public class FibonacciSequence {
	private static Logger LOGGER=Logger.getLogger(FibonacciSequence.class.getName());
	public static void main(String[] arg) {
		LOGGER.info("Inside main method");
		int a = 1;
		int b = 2;
		int c=0;
		int sum = 2;
		while(c<4000000) {
			c = a + b;
			a = b;
			b = c;
			if (c % 2 == 0) {
				sum += c;
			}
		}
		LOGGER.info("The sum of even valued terms of Fibonaccie sequence below 4 million is "+sum);
	}
}
