package com.forcollege;

public class SplitTester {
	public static void main(String[] args) {
		//System.out.println("Hello World");
		/*String s = "Vilas.Varghese";
		//Split method uses regular expression.
		//"." is a special char in regex. so regex should get it
		
		String[] s1 = s.split("\\.");
		System.out.println(s1[0]);*/
		countHeros ("0000098000");
		System.out.println("after calling");
	}
	
	public static void countHeros(String input) {
		int count = 0;
		int currentPos = input.indexOf('0', 0);
		System.out.println("currentPos 1 "+currentPos);
		int prevPos = -1;
		while ( currentPos > prevPos) {
			count++;
			System.out.println("count "+count);
			prevPos = currentPos;
			currentPos = input.indexOf('0', currentPos+1);
			System.out.println("startPos "+currentPos);
			
		}
		
		System.out.println("count "+count);
	}
}
