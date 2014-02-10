package com.lftechnology.training.practisequestions;

/**
 * What is the smallest positive number evenly divisible by 1-20.
 */
import java.util.logging.Logger;

/**
 * This Class calculates the smallest positive number which is evenly divisible
 * by 1-20.
 * 
 * @author srizna
 * 
 */
public class SmallestPositiveNumber {
	private static Logger LOGGER = Logger.getLogger(SmallestPositiveNumber.class.getName());

	public static void main(String[] arg) {
		LOGGER.info("Inside main method");
		int startNumber = 2520;
		long endNumber = 0;
		boolean found = false;
		int flag=0;
		while (flag!=20) {
			System.out.println(""+startNumber);
			for(int i=1;i<=20;i++){
				if(startNumber%i==0){
					flag++;
					break;
				}
				else{
					flag=0;
					startNumber+=1;
				}
			}			
			if(flag==20){
				found=true;
				break;
			}
		}
		System.out.println(startNumber);
	}
}
