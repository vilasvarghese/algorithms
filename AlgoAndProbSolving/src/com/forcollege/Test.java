package com.forcollege;

public class Test {

	public static void main(String[] args) {
		String str = "T,e,s,t";
		System.out.println(str.replace(",", " and "));
		int n = 1234567890;
		int r = n%10;//2
		/*n = n/10;//43
		while (n > 0) {
			r = r*10 + n%10;
			n = n /10;
		}*/
		System.out.println(r);
		System.out.println(Integer.reverse(n));
		System.out.println(new StringBuilder(Integer.toString(n)).reverse());
	}
	
	
}
