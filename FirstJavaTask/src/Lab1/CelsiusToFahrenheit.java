package Lab1;


/**
 * This class displays the temperatures from 0 degrees Celsius to 100 degrees Celsius and its Fahrenheit equivalent.
 * @author srizna
 *
 */
public class CelsiusToFahrenheit {
	public static void main(String[] arg){
		for(int i=0; i<=100; i++){
			int fahrenheitValue=(((i*9)/5)+32);
			System.out.println("The Temperature of "+ i + " degree Celsius values to "+ fahrenheitValue +" Fahrenheit");
			}
	}

}
