package com.lftechnology.training.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/**
 * 5 a. Create a linked list named one and two. 
 b. Add some elements to both one (one, two, three, four, five) and two (six, seven, eight, nine, and ten). 
 c. Merge the words from two into one.
 d. Remove every second word from two.
 e. Remove all words in two from one.
 f. Print the value after each operation.
 */
/**
 * This Class creates two different lists and perform different operation like
 * merge,remove and removeall in that list.
 * 
 * @author srizna
 * 
 */
public class LinkedListUse {
	private static final Logger LOGGER = Logger.getLogger(LinkedListUse.class
			.getName());

	public static void main(String[] arg) {
		LOGGER.info("Inside main method. initializing lists...");
		List<String> one = new LinkedList<String>();
		List ones=new LinkedList();
		List<String> two = new LinkedList<String>();
		one.add("one");
		one.add("two");
		one.add("three");
		one.add("four");
		one.add("five");

		two.add("six");
		two.add("seven");
		two.add("eight");
		two.add("nine");
		two.add("ten");

		one.addAll(two);
			LOGGER.info("Two different list added in first list." + one);

		two.remove(1);
		LOGGER.info("Second element removed from second list." + two);

		one.removeAll(two);
		LOGGER.info("Removed all elements of second list from first list."+ one);

	}

}
