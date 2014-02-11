/**
 * 
 */
package com.lftechnology.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
/**
 * Write a program that uses Shuffle algorithm to print the words in its argument list in random order.
 *  Hint: Use List and Collection
 */
/**
 * This Class {@link RandomShuffle} the given list and displays the output.
 * @author srizna
 *
 */
public class RandomShuffle {
	private static Logger LOGGER = Logger.getLogger(RandomShuffle.class.getName());
	public static void main(String[] args) {
		LOGGER.info("Inside main method");
		List<String> list=new ArrayList<>();
		LOGGER.info("Insitializing list with string arguments....");
		list.add("one");
		list.add("two");
		list.add("apple");
		list.add("banana");
		LOGGER.info("Initial list: "+list);
		Collections.shuffle(list);
		LOGGER.info("Final list after shuffle is " +list);
	}
}
