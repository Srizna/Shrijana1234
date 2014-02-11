/**
 * 
 */
package com.lftechnology.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.logging.Logger;

/**
 * Create an array list with 49 Integer objects containing the numbers 1 through 49. 
 * It then randomly shuffles the list and selects the first 6 values from the shuffled list. 
 * Finally, it sorts the selected values and prints them out.
 *  Hint: Use ArrayList, Collections.shuffle(), ArrayList.subList(), and Collection.sort().
 */
/**
 * This Class shuffled the given {@link List},use sublist function to get sublist of the
 * {@link List}t and finally {@link SortedSet}the list and displays each operation's output.
 * @author srizna
 * 
 */
public class ShuffledSortedList {

	private static Logger LOGGER = Logger.getLogger(ShuffledSortedList.class
			.getName());

	public static void main(String[] args) {
		LOGGER.info("Inside main method");
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> sortedList = new ArrayList<>();
		LOGGER.info("Initializing the list values..");
		for (int i = 1; i <= 49; i++) {
			arrayList.add(i);
		}

		Collections.shuffle(arrayList);
		LOGGER.info("Values of list after shuffling is " + arrayList);
		sortedList = arrayList.subList(0, 6);
		LOGGER.info("sublist of given list is  " + sortedList);
		Collections.sort(sortedList);
		LOGGER.info("Values of list after sorting is " + sortedList);

	}

}
