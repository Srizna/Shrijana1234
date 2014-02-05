package com.lftechnology.training.oop;

/**
 * Create a class called Distance that includes two private data members feet (type int) and inches (type float). Use a method setData to set values to instance variables. Provide a method display that displays the feet and inches, a member function addDistance for adding two distances, and a member function compareDistance for comparing two distances. Implement your program in Java.
 */
/**
 * This Class reads two distances in feet and inches.perform addition of two distance and compare two distances.
 * @author srizna
 *
 */
public class Distance {
	private int feet;
	private float inches;

	/**
	 * This setFeet method set the value for the private {@link Integer} value.
	 * @author srizna
	 * @param feet:distance in feet.
	 */
	public void setFeet(int feet) {
		this.feet = feet;
	}

	/**
	 * This setInches method set the value for the private {@link Integer} value.
	 * @author srizna
	 * @param inches:distance in inches.
	 */
	public void setInches(float inches) {
		this.inches = inches;
	}

	/**
	 * This display method displays the set feet and inches.
	 * @author srizna
	 */
	public void display() {
		System.out.println("Distance is " + feet + " feet" + " and is "
				+ inches + " inches");
	}

	/**
	 * This addDistance method add two distances and and displays total disatnce.
	 * @author srizna
	 * @param dis:Class object
	 */
	public void addDistance(Distance dis) {
		int totalFeet = dis.feet + this.feet;
		float totalInches = dis.inches + this.inches;
		if(totalInches>=12){
		int temp= (int)(totalInches%12);
		totalFeet+=totalInches/12;
		totalInches=temp;
		}
		
		System.out.println("Addition of two distances is: " + totalFeet + "ft "
				+ totalInches + "in");

	}

	/**
	 * This compareDistance method compares the two distances and displays which one is greater.
	 * @author srizna
	 * @param dis:object of class.
	 */
	public void compareDistance(Distance dis) {
		if (dis.feet <= this.feet || dis.inches <= this.inches) {
			System.out.println("First distance is greater " + dis.feet + "ft "
					+ dis.inches + "in" + " < " + this.feet + "ft "
					+ this.inches + "in ");
		} else {
			System.out.println("Second distance is greater " + dis.feet + "ft "
					+ dis.inches + "in" + " > " + this.feet + "ft "
					+ this.inches + "in ");
		}

	}

	public static void main(String[] arg) {
		Distance obj1 = new Distance();
		obj1.setFeet(14);
		obj1.setInches(9);
		obj1.display();

		Distance obj2 = new Distance();
		obj2.setFeet(15);
		obj2.setInches(5.3f);
		obj2.display();
		obj1.addDistance(obj2);
		obj1.compareDistance(obj2);

	}
}
