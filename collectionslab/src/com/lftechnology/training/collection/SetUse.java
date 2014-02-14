package com.lftechnology.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 *2. Suppose you want to know which words in the argument list occur only once and which occur more than once,
 * but you do not want any duplicates printed out repeatedly. 
 * This effect can be achieved by generating two sets one containing every word in the argument list and the other containing only the duplicates. 
 * The words that occur only once are the set difference of these two sets
 */
/**
 * This Class determines the occurence of words in list.and displays out the two
 * different lists one containing duplicate words only and another containing
 * single occurred words.
 * @author srizna
 * 
 */
public class SetUse {
	private static final Logger LOGGER = Logger.getLogger(SetUse.class
			.getName());

	public static void main(String[] arg) {
		LOGGER.info("Inside main method,initializing list elements..");
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cat");
		list.add("apple");
		list.add("cat");
		list.add("dog");
		List<String> simpleList = new ArrayList(new HashSet<String>(list));
		Set<String> duplicateWordList = new HashSet<>();
		LOGGER.info("Checking duplicate words adn assigning them in duplicateWordList");
		for (String temporaryListValue : list) {
			if (Collections.frequency(list, temporaryListValue) > 1) {
				duplicateWordList.add(temporaryListValue);
			}
		}
		LOGGER.info("duplicate word" + duplicateWordList);
		LOGGER.info("List containing every word" + simpleList);

	}

}
