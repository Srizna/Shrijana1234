package com.lftechnology.training.practisequestions;

/**
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
/**
 * This Class displays the sum of even valued terms of Fibonacci sequence below 4 millions.
 * @author srizna
 */
public class FibonacciSequence {
	public static void main(String[] arg) {
		int a = 1;
		int b = 2;
		int c=0;
		int sum = 2;
		System.out.println(a+""+b);
		while(c<4000000) {
			c = a + b;
			a = b;
			b = c;
			if (c % 2 == 0) {
				sum += c;
			}
		}
		System.out.println(sum);
	}
}
