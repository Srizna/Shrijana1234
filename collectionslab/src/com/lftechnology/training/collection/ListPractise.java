package com.lftechnology.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Takes the words in its argument list and prints out any duplicate words, the number of distinct words,
 *  and a list of the words with duplicates eliminated. 
 *  Hint: Try with HashSet and List implementation.
 */
/**
 * This Class adds the elements in the list and dispalys duplicate words,number of distinct words and list of words after eliminating duplicates.
 * @author srizna
 * 
 */
public class ListPractise {
	private static Logger LOGGER = Logger.getLogger(ListPractise.class
			.getName());

	public static void main(String[] arg) {
		int flag = 0;
		int freq = 0;
		LOGGER.info("Inside main method,initializing list elements..");
		List<String> list = new ArrayList<>();
		List<String> duplicateWordList = new ArrayList<>(list);
		list.add("apple");
		list.add("banana");
		list.add("cat");
		list.add("apple");
		list.add("cat");
		list.add("dog");
		list.add("pop");
		LOGGER.info("Initial list: " + list);
		for (String newList : list) {
			if (Collections.frequency(list, newList) > 1
					&& !duplicateWordList.contains(newList)) {
				duplicateWordList.add(newList);
			} else if (Collections.frequency(list, newList) == 1) {
				flag++;
			}
		}
		LOGGER.info("Duplicate words are: " + duplicateWordList);
		LOGGER.info("Number of distinct word is " + flag);

		Set<String> uniqueList = new HashSet<>(list);
		LOGGER.info("list with duplicates eliminated is: " + uniqueList);

	}

}
