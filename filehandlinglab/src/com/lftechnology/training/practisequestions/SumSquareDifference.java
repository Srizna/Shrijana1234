package com.lftechnology.training.practisequestions;

import java.util.logging.Logger;

public class SumSquareDifference {
	private static Logger LOGGER = Logger.getLogger(SumSquareDifference.class
			.getName());

	public static void main(String[] arg) {
		LOGGER.info("Inside main method...");
		int sumOfSquares = 0;
		int squareOfSum = 0;
		int temp = 0;
		int difference;
		for (int i = 1; i <= 100; i++) {
			sumOfSquares += i * i;
			temp += i;
		}
		LOGGER.info("The sum of the squares of the first one hundred natural numbers is "+ sumOfSquares);
		squareOfSum = temp * temp;
		LOGGER.info("The  squares of sum of the first one hundred natural numbers is "+ squareOfSum);
		difference = squareOfSum - sumOfSquares;
		LOGGER.info("The differences between sum of the squares  and square of sum of the first one hundred natural numbers is "+ difference);
	}

}
