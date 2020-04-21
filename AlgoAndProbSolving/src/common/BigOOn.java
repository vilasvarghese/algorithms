package common;

import java.time.LocalDateTime;
import java.util.Arrays;

public class BigOOn {

	public static void main (String args[]) {
	
		//time taken for a single value
		long currentTime = System.currentTimeMillis();
		String array[] = {"Test"}; 
		for (int i = 0; i < array.length; i++) {
			System.out.println (array [i]);
		}
		System.out.println("Time taken "+(System.currentTimeMillis() - currentTime));

		//time taken for array of size 10000000
		//This code is linear complex or O(n) complex.
		array = new String[10000000];
		for (int i = 0; i < 9999999; i++) {
			array[i] = "Test";
		}
		array[9999999] = "Vilas";
		currentTime = System.currentTimeMillis();
		for (int i =0; i < array.length; i++) {
			if ("Vilas".equals(array[i])) {
				System.out.println ("Found Vilas");
			}
		}
		System.out.println("Time taken 1 "+(System.currentTimeMillis() - currentTime));
		efficientBigOn(array, "Vilas");
	}
	
	public static void efficientBigOn(String[] myArray, String valueToFind) {
		if (valueToFind == null) {
			System.out.println("The string to check can't be null");
			return;
		}
		for (int i =0; i < myArray.length; i++) {
			if (valueToFind.equals(myArray[i])) {//this is another good practice this was you don't have to check if all values in array would be null.
				System.out.println ("Found Vilas");
				break;//adding this break will improve the code a lot.
			}
		}
	}
}