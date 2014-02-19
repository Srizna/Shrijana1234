package com.lftechnology.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
/**
 *4.  Write a program that prints its arguments in random order. Do not make a copy of the argument array.
 */

/**
 * This Class displays the random elements of the given list and also eliminate the duplicate ones.
 * @author srizna
 *
 */
public class RandomListWithNoCopyValue {
	private static final Logger LOGGER=Logger.getLogger(RandomListWithNoCopyValue.class.getName());
	public static void main(String[]arg){
		LOGGER.info("Iniside main method initializing list elements..");
		List<String> list=new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cat");
		list.add("apple");
		list.add("cat");
		list.add("dog");
		LOGGER.info("Initial List: " +list);
		Collections.shuffle(list);
		LOGGER.info("Random list: "+list);
		Set<String> uniqueList=new HashSet<>(list);
		LOGGER.info("Unique list is "+uniqueList);
	}

}
