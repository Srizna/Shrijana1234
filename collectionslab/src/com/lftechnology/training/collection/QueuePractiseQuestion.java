package com.lftechnology.training.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * This Class simply creates a {@link Queue} of type {@link String} and performs basic queue operations.
 * like peek(),poll(),add() and offer().
 * @author srizna
 *
 */
public class QueuePractiseQuestion {
	private static final Logger LOGGER=Logger.getLogger(QueuePractiseQuestion.class.getName());
	public static void main(String[] args) {
		LOGGER.info("Inside main method");
		Queue<String> qe = new LinkedList<String>();
		
		qe.offer("b");
		qe.offer("a");
		qe.offer("c");
		qe.offer("e");
		qe.offer("d");

		Iterator it = qe.iterator();

		LOGGER.info("Initial Size of Queue :" + qe.size());

		LOGGER.info("Reading each value from queue..");
		while (it.hasNext()) {
			String iteratorValue = (String) it.next();
			LOGGER.info("Queue Next Value :" + iteratorValue);
		}

		// get value and does not remove element from queue
		LOGGER.info("Queue peek :" + qe.peek());
		
		//displays the list after peek
		LOGGER.info("list in queue after using peek is "+qe);

		// get first value and remove that object from queue
		LOGGER.info("Queue poll :" + qe.poll());
		
		//displays the list  after poll
		LOGGER.info("list in queue after using poll is "+qe);
		
		//get the size of queue after poll
		LOGGER.info("Size of Queue After poll:" + qe.size());
		
		//read user input to add element in queue
		Scanner userInputString=new Scanner(System.in);
		System.out.println("Enter a word to add in queue:");
		qe.offer(userInputString.next());
		
		LOGGER.info("list in queue after adding one element is "+qe);
		
		//get the size of queue after offer
		LOGGER.info("Final Size of Queue: " + qe.size());
		
	}
}
