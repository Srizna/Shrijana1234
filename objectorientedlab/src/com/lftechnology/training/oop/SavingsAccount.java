package com.lftechnology.training.oop;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;

/**
 * This Class calculates the annual interest of deposited amount.
 * @author srizna
 */

public class SavingsAccount {
	static int annualInterestRate;
	private float savingsBalance;

	/**
	 * This is {@link ParameterizedType} {@link Constructor} to instantiated balance.
	 * @author srizna
	 * @param balance:saving amount
	 */
	public SavingsAccount(float balance){
		savingsBalance=balance;
		System.out.println("Deposited balance: "+savingsBalance);
		
	}

	/**
	 * This method calculate the monthly interest and displays total annual saving.
	 * @author srizna
	 */
	public void calculateMonthlyInterest() {
		float interest = ((savingsBalance * annualInterestRate) / 12);
		savingsBalance += interest;
	}

	/**
	 * This method sets the value of Annual Interest Rate.
	 * @author srizna
	 * @param annualRate:annual interest rate
	 */
	public static void modifyInterestRate(int annualRate) {
		annualInterestRate = annualRate;
	}

	/**
	 * This method displays the New total savings after calculating interest rate.
	 * @author srizna
	 */
	public void display() {
		System.out.println("New Balance is : " + savingsBalance);
	}
}
