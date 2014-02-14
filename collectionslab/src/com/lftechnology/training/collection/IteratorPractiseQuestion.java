package com.lftechnology.training.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * This Class is just to understand how {@link Iterator} works and removes the
 * element during iteration.
 * 
 * @author srizna
 * 
 */
public class IteratorPractiseQuestion {
	private static final Logger LOGGER = Logger
			.getLogger(IteratorPractiseQuestion.class.getName());

	public static void main(String[] arg) {
		LOGGER.info("Inside main method.");
		List<String> list = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		LOGGER.info("Reading datas from user..");
		for (int j = 0; j < 4; j++) {
			System.out.println("Enter four elements for list:");
			String userInput = input.next();
			list.add(userInput);
		}
		LOGGER.info("Initial List " + list);
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if (string.equalsIgnoreCase("b")) {
				iterator.remove();
			}
		}
		LOGGER.info("Final list " + list);
	}

}
